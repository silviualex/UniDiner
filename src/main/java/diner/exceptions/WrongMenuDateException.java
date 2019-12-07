package diner.exceptions;

public class WrongMenuDateException extends Exception {

	private static final long serialVersionUID = 231704697418476762L;

	public WrongMenuDateException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WrongMenuDateException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public WrongMenuDateException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public WrongMenuDateException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public WrongMenuDateException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
