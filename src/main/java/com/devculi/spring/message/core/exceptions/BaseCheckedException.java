package com.devculi.spring.message.core.exceptions;

import com.devculi.spring.message.core.utils.BaseExceptionUtils;

public abstract class BaseCheckedException extends Exception
{

    private static final long serialVersionUID = 4475921281674018207L;

    public BaseCheckedException(String message)
    {
     super(message);
    }

    public BaseCheckedException(String message, Throwable throwable)
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
