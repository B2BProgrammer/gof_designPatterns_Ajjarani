/**
 * 
 */
package io.ajjaranicodes.gof.behavioral.chainofresponsibility;

/**
 * @author ajith.ajjarani
 *
 */
public interface EmailHandler {
	
	EmailHandler setNextHandler(EmailHandler handler);
	
	void processEmail(Email email);

}
