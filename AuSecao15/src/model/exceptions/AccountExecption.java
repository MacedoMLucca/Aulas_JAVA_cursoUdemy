package model.exceptions;

public class AccountExecption extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public AccountExecption(String msg) {
		super(msg);
	}
}
