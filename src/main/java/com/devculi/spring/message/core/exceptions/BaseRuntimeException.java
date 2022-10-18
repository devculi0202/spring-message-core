package com.devculi.spring.message.core.exceptions;

import com.devculi.spring.message.core.utils.BaseExceptionUtils;

public abstract class BaseRuntimeException extends RuntimeException
{
    private static final long serialVersionUID = 6146133319569131368L;

    public BaseRuntimeException(String message)
    {
     super(message);
    }

    public BaseRuntimeException(String message, Throwable throwable)
    {
        super(message, throwable);
    }

    public String getMessage() {
        return BaseExceptionUtils.buildMessage(super.getMessage(), super.getCause());
    }

    public Throwable getRootCause() {
        return BaseExceptionUtils.getRootCause(this);
    }
}
