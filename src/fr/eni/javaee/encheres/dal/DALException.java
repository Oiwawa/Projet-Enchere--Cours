package fr.eni.javaee.encheres.dal;

public class DALException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public DALException() {
		super();

	}

	public DALException(String message, Throwable cause) {
		super(message, cause);
	}

	public DALException(String message) {
		super(message);

	}

	@Override
	public String getMessage() {
		StringBuffer sb = new StringBuffer();
		sb.append("Couche DAL - "+ super.getMessage());
		return sb.toString();
	}
}
