package com.search.data.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.search.data.model.DataModel;
import com.search.data.repository.IDataModelRepository;
import com.search.data.response.ResponseMessage;

@Service
public class DataServiceImpl implements IDataService {

	@Autowired
	private IDataModelRepository iDataModelRepository;
	
    @Override
	public String addUserData(DataModel data) {

		iDataModelRepository.save(data);

		return "Data added successfully";
	}

	/**
	 * This method has implementation of 'findByPanCard()' method available inside
	 * 'IDataService'
	 */
    @Override
	public DataModel findByPancard(String pancard) {

		return iDataModelRepository.findByPanCard(pancard);
	}

	/**
	 * This method has implementation of 'findByPancardAndAadharCard()' method
	 * available inside 'IDataService'
	 */
    @Override
	public DataModel findByPancardAndAadharCard(String pancard, String aadharCard) {

		return iDataModelRepository.findByPanCardAndAadharCard(pancard, aadharCard);
	}

	/**
	 * This method has implementation of 'nullCheckForPancard()'
	 */
	public ResponseMessage nullCheckForPancard(String pan, String responseMessage) {

		ResponseMessage responseMessage2 = new ResponseMessage();

		if (pan == null) {
			responseMessage2.setMessage("Pancard Cannot be Empty");
			return responseMessage2;
		} else {
			responseMessage2.setMessage(responseMessage);
			return responseMessage2;
		}

	}

	/**
	 * This method has implementation of a method 'nullCheckForPancardAndAadharCard'
	 * to check Pan-Card and Aadhar-Card Cannot be Empty(null)
	 */
	public ResponseMessage nullCheckForPancardAndAadharCard(String pan, String aadharCard, String responseMessage) {

		ResponseMessage responseMessage2 = new ResponseMessage();

		if (pan == null || aadharCard == null) {
			responseMessage2.setMessage("Pancard or AadharCard Cannot be Empty");
			return responseMessage2;
		} else {
			responseMessage2.setMessage(responseMessage);
			return responseMessage2;
		}
	}

}
