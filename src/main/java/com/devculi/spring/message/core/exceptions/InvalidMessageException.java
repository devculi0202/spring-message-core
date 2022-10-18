package com.devculi.spring.message.core.exceptions;

@SuppressWarnings("serial")
public class InvalidMessageException extends BaseCheckedException
{

    public InvalidMessageException(String message)
    {
        super(message);
    }

    public InvalidMessageException(String message, Throwable throwable)
    {
        super(message, throwable);
    }
}


