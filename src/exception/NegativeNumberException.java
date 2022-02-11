package exception;

public class NegativeNumberException extends Exception {
	
	private static final long serialVersionUID = 11;
	
	public NegativeNumberException() {
		
	}
	
	public NegativeNumberException(Throwable cause) {
		super(cause);
	}

	@Override
	public String getMessage() {
		
		return "No fue posible agregar el ingrediente, no se puede agregar un peso negativo a un ingrediente.";
	}
}
