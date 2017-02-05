/**
 * 
 */
package io.ajjaranicodes.gof.behavioral.command;

/**
 * @author ajith.ajjarani
 *
 */
public class LightOffComand implements Command {
	//Receiver
	private Light light;
	
	//Accept the receiver for concrete command implementation
	public LightOffComand (Light light) {
		this.light = light;
	}

	/**
	 * Concrete implementation of execute method
	 */
	public void execute() {
		light.turnOff();
	}

}
