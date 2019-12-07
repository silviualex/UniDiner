package diner.exceptions;

public class WrongInputDateException extends Exception {

	private static final long serialVersionUID = 6776629765309499083L;

	public WrongInputDateException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WrongInputDateException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public WrongInputDateException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public WrongInputDateException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public WrongInputDateException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
