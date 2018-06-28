package com.groupkt.response;

import java.util.List;

import com.groupkt.domain.State;

public class Response {
	private List<String> messages;
	private List<State> result;

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	public List<State> getResult() {
		return result;
	}

	public void setResult(List<State> result) {
		this.result = result;
	}

}
