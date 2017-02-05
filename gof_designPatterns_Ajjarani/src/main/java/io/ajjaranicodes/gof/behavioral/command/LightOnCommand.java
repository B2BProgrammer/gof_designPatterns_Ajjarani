/**
 * 
 */
package io.ajjaranicodes.gof.behavioral.command;

/**
 * @author ajith.ajjarani
 *
 */
public class LightOnCommand implements Command {
	//Receiver
	private Light light;
	
	//Accept the receiver for concrete command implementation
	public LightOnCommand (Light light) {
		this.light = light;
	}
	
	/**
	 * Concrete implementation of execute method
	 */
	public void execute() {
		light.turnOn();
	}

}
