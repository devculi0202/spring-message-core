package com.devculi.spring.message.core.utils;

public class BaseExceptionUtils
{
    private BaseExceptionUtils() {}

    public static String buildMessage(String message, Throwable throwable)
    {
        if (throwable == null) {
            return message;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (message != null) {
            stringBuilder.append(message).append("; ");
        }
        stringBuilder.append("with nested exception is: ").append(throwable);
        return stringBuilder.toString();
    }

    public static Throwable getRootCause(Throwable throwable) {
        if (throwable == null) {
            return null;
        }
        return throwable.getCause();
    }
}
