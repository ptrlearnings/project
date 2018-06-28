package com.groupkt.service;

import org.springframework.stereotype.Service;

import com.groupkt.response.CityResponse;
import com.groupkt.response.StateResponse;

@Service
public interface StateService {

	public CityResponse getByStateNameOrAbbr(String country, String input);

	public StateResponse getAllStates(String country);
}
