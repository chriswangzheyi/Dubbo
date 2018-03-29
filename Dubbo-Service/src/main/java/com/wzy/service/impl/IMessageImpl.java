package com.wzy.service.impl;

import org.springframework.stereotype.Component;

import com.wzy.api.IMessage.IMessage;

@Component
public class IMessageImpl implements IMessage {

	@Override
	public String echo(String msg) {
		return "-------------ECHO : " + msg;
	}

}
