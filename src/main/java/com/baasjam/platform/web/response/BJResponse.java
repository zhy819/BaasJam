/**
 * BaasJam -- Backend-as-a-service
 * 
 * Created by: Hongyi Zhang
 * Created Date: 2015/12/04
 * 
 * Functions:
 * This is the base class of all Restful response
 */
package com.baasjam.platform.web.response;

public class BJResponse {

	/**
	 * Http Status with Spring HttpStatus and Message
	 */
	private BJHttpStatus status;

	/**
	 * Constructor
	 * 
	 * @param model
	 * @param status
	 */

	/**
	 * @return the status Get HttpStatus with message
	 */
	public BJHttpStatus getStatus() {
		return status;
	}

	/**
	 * @param status
	 * the status to set
	 */
	public void setStatus(BJHttpStatus status) {
		this.status = status;
	}

	/**
	 * Constructor
	 * 
	 * @param model
	 * @param status
	 */
	public BJResponse(BJHttpStatus status) {
		this.status = status;
	}

	/**
	 * Constructor
	 */
	public BJResponse() {

	}

}
