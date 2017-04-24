package co.com.binariasystems.fmw.util.mail;

public class MailAuthenticationException extends MailException {

	/**
	 * Constructor for MailAuthenticationException.
	 * @param msg message
	 */
	public MailAuthenticationException(String msg) {
		super(msg);
	}

	/**
	 * Constructor for MailAuthenticationException.
	 * @param msg the detail message
	 * @param cause the root cause from the mail API in use
	 */
	public MailAuthenticationException(String msg, Throwable cause) {
		super(msg, cause);
	}

	/**
	 * Constructor for MailAuthenticationException.
	 * @param cause the root cause from the mail API in use
	 */
	public MailAuthenticationException(Throwable cause) {
		super("Authentication failed", cause);
	}

}
