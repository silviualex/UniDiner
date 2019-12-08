package diner.exceptions;

public class WrongDataFormatException extends RuntimeException {

	private static final long serialVersionUID = -4159649805707931521L;

	public WrongDataFormatException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WrongDataFormatException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public WrongDataFormatException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public WrongDataFormatException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public WrongDataFormatException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
