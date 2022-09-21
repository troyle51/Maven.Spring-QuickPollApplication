package io.zipcoder.tc_spring_poll_application.exception;

import dtos.error.ErrorDetail;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rnfe, HttpServletRequest request) {
        ErrorDetail errorDetail = new ErrorDetail(request.getLocalName(), request.getServerPort(), rnfe.getLocalizedMessage(), new Date().getTime(), rnfe.getMessage());
        return new ResponseEntity<>(errorDetail, HttpStatus.NOT_FOUND);
    }
}
