package com.groupkt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.groupkt.response.CityResponse;
import com.groupkt.response.StateResponse;
import com.groupkt.service.StateService;

@RestController
public class StateController {

	@Autowired
	private StateService stateService;
	
	@RequestMapping(value="state/get/{country}/all",method = RequestMethod.GET)
	public StateResponse getStates(@PathVariable String country) {
		return stateService.getAllStates(country);
	}
	@RequestMapping(value="state/get/{country}/{input}",method = RequestMethod.GET)
	public CityResponse getCityAndCapitalByNameOrAbbr(@PathVariable String country,@PathVariable String input) {
		return stateService.getByStateNameOrAbbr(country,input);
	}
}
