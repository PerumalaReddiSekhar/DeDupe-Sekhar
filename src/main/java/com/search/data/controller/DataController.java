package com.search.data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.search.data.model.DataModel;
import com.search.data.response.ResponseMessage;
import com.search.data.service.IDataService;

@RestController
public class DataController {

	@Autowired
	private IDataService iDataService;

	/**
	 * This API will check whether 'User' already exists or not using Pan-Card And
	 * also checking that Pan-card we got is null or not
	 */
	@GetMapping("/getByPancard")
	public ResponseEntity<ResponseMessage> getByPancard(@RequestBody DataModel data) {

		ResponseMessage nullCheckResponseMessage = iDataService.nullCheckForPancard(data.getPanCard(), "");
		DataModel newModel = iDataService.findByPancard(data.getPanCard());

		if (newModel != null) {
			nullCheckResponseMessage = iDataService.nullCheckForPancard(data.getPanCard(), "User exists already");
		} else {
			nullCheckResponseMessage = iDataService.nullCheckForPancard(data.getPanCard(), "Record doesn't exist");
		}

		return new ResponseEntity<>(nullCheckResponseMessage, HttpStatus.OK);
	}

	/**
	 * This API is to check whether 'User' already exist or not using Pan-card and
	 * Aadhar-Card And also checking that Pan or Aadhar we got is null or not
	 */
	@GetMapping("/getByPanAndAadharCard")
	public ResponseEntity<ResponseMessage> getByPanAndAadhar(@RequestBody DataModel data) {

		ResponseMessage nullCheckResponseMessage2 = iDataService.nullCheckForPancardAndAadharCard(data.getPanCard(),
				data.getAadharCard(), "");
		DataModel newModel = iDataService.findByPancardAndAadharCard(data.getPanCard(), data.getAadharCard());

		if (newModel != null) {
			nullCheckResponseMessage2 = iDataService.nullCheckForPancardAndAadharCard(data.getPanCard(),
					data.getAadharCard(), "User exists already");
		} else {
			nullCheckResponseMessage2 = iDataService.nullCheckForPancardAndAadharCard(data.getPanCard(),
					data.getAadharCard(), "Record doesn't exist");
		}

		return new ResponseEntity<>(nullCheckResponseMessage2, HttpStatus.OK);
	}

	/**
	 * This API is to add data into data base
	 */
	@PostMapping("/addData")
	public String addData(@RequestBody DataModel data) {

		return iDataService.addUserData(data);
	}

}
