package com.ordermate.common.exception;

public abstract class BaseException extends RuntimeException {
	public abstract BaseExceptionType getExceptionType();
}
