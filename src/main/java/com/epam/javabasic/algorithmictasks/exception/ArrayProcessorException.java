package com.epam.javabasic.algorithmictasks.exception;

/**
 * Created by anton_chyrko on 12/22/20.
 */
public class ArrayProcessorException extends RuntimeException {

	public ArrayProcessorException() {
	}

	public ArrayProcessorException(String message) {
		super(message);
	}

	public ArrayProcessorException(String message, Throwable cause) {
		super(message, cause);
	}

	public ArrayProcessorException(Throwable cause) {
		super(cause);
	}

	protected ArrayProcessorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
