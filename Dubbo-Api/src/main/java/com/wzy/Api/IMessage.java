package com.wzy.Api;

public interface IMessage {
	/**
	 * 实现信息的回应处理，回应的信息是在原始信息前追加一些相应的提示反悔
	 * @param msg 表示接收消息
	 * @return 处理后的Echo数据
	 */
	public String echo(String msg) ;
}

