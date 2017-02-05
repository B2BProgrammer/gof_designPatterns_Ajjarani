/**
 * 
 */
package io.ajjaranicodes.gof.behavioral.command;

/**
 * @author ajith.ajjarani
 *
 */
public class FanOnCommand implements Command {
	//Receiver
	private Fan fan;
	
	//Accept the receiver for concrete command implementation
	public FanOnCommand (Fan fan) {
		this.fan = fan;
	}

	/**
	 * Concrete implementation of execute method
	 */
	public void execute() {
		fan.startRotate();
	}
}
