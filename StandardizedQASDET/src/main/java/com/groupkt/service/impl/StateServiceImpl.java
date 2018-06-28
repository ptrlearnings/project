package com.groupkt.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.groupkt.domain.State;
import com.groupkt.repo.StateRepo;
import com.groupkt.response.CityResponse;
import com.groupkt.response.Response;
import com.groupkt.response.StateResponse;
import com.groupkt.service.StateService;
@Component
public class StateServiceImpl implements StateService {

	@Autowired
	private StateRepo stateRepo;

	@Override
	public StateResponse getAllStates(String country) {
		List<State> states = stateRepo.findByCountry(country);
		StateResponse stateResponse = new StateResponse();
		Response response = new Response();
		List<String> messages = new ArrayList<>();
		messages.add("Total [" + states.size() + "] records found.");
		response.setMessages(messages);
		response.setResult(states);
		stateResponse.setRestResponse(response);
		return stateResponse;
	}

	@Override
	public CityResponse getByStateNameOrAbbr(String country,String input) {
		State state = stateRepo.findByNameOrAbbr(country,input);
		if(state==null) {
			return new CityResponse();
		}
		CityResponse response = new CityResponse();
		response.setCapitalCity(state.getCapital());
		response.setLargestCity(state.getLargest_city());
		return response;
	}

}
