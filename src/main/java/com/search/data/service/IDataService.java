package com.search.data.service;

import org.springframework.stereotype.Service;

/**
 * Service Interface which contains unimplemented methods(Abstract)
 */
import com.search.data.model.DataModel;
import com.search.data.response.ResponseMessage;

@Service
public interface IDataService {

	/**
	 * Abstract method to push(add) data inside DataBase
	 */
	public String addUserData(DataModel data);

	/**
	 * Method to search User-Data inside Database using 'Pan-card'
	 */
	public DataModel findByPancard(String pancard);

	/**
	 * Method to search User-Data inside Database using 'Pan-card and 'Aadhar-card'
	 */
	public DataModel findByPancardAndAadharCard(String pancard, String AadharCard);

	/**
	 * This method is to send response message whether 'Pan-card' is 'null' or not
	 */
	public ResponseMessage nullCheckForPancard(String pan, String response);

	/**
	 * This will make sure that Pan-Card and Aadhar-Card Cannot be Empty(null)
	 * 
	 */
	public ResponseMessage nullCheckForPancardAndAadharCard(String pan, String aadharCard, String responseMessage);

}
