/**
 * 
 */
package io.ajjaranicodes.gof.creational.prototype;

import io.ajjaranicodes.gof.creational.prototype.PrototypeFactory.ModelType;

/**
 * @author ajith.ajjarani
 *
 */
public class PrototypeClient {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee();
		Employee clonedEmployee = (Employee) PrototypeFactory.
				getClonedInstance(ModelType.EMPLOYEE);
		
		if (employee == clonedEmployee) {
			System.out.println("Same references");
		} else {
			System.out.println("Cloned, but different references");
		}
	}

}
