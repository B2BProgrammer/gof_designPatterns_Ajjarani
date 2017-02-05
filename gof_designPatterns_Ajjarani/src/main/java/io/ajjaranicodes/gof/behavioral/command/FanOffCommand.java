/**
 * 
 */
package io.ajjaranicodes.gof.behavioral.command;

/**
 * @author ajith.ajjarani
 *
 */
public class FanOffCommand implements Command {
	//Receiver of Fan
	private Fan fan;
	
	//Accept the receiver for concrete command implementation
	public FanOffCommand (Fan fan) {
		this.fan = fan;
	}
	
	/**
	 * Concrete implementation of execute method
	 */
	public void execute() {
		fan.stopRotate();
	}

}
