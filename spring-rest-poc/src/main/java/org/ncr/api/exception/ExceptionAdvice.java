package org.ncr.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionAdvice {

	  @ExceptionHandler({Exception.class})
	  @ResponseBody
	  @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	  public APIException myError(Exception ex) {
		    APIException exception  = new APIException();
		    exception.setMessage(ex.getMessage());
//		    exception.setThrowable(ex);
		    return exception;
	  }
	
	
}
