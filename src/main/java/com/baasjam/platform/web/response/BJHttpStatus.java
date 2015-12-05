/**
 * BaasJam -- Backend-as-a-service
 * 
 * Created by: Hongyi Zhang
 * Created Date: 2015/12/04
 * 
 * Functions:
 * This is the class holds the http status
 */
package com.baasjam.platform.web.response;

import org.springframework.http.HttpStatus;

public class BJHttpStatus {

	/**
	 * Spring http status
	 */
	private HttpStatus status;

	/**
	 * Message in string-id ie: BJResponseMessage.UserNotFound =
	 * "String-user-not-found"
	 */
	private String message;

	/**
	 * @return the status
	 */
	public HttpStatus getStatus() {
		return status;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	public BJHttpStatus(HttpStatus status, String message) {
		this.status = status;
		this.message = message;
	}

	public BJHttpStatus() {

	}

}
