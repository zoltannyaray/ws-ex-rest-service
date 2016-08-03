package com.epam.nyz.restservice.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class InvalidExpressionWebException extends WebApplicationException {

    public InvalidExpressionWebException(Throwable cause) {
        super(cause, Response.Status.BAD_REQUEST);
    }

    
    
}
