package org.ncr.api.exception;

/**
 * @author sumit.kawatra
 *
 */
public class APIException {
	private String message;
	private Throwable throwable;

	public APIException() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "APIException [message=" + message + "]";
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

}
