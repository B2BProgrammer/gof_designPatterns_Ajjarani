/**
 * 
 */
package io.ajjaranicodes.gof.structural.decorator;

/**
 * @author ajith.ajjarani
 *
 */
public class HatchBackCar extends CarDecorator {

	public HatchBackCar(Car car) {
		super(car);
	}

	@Override
	public void moveForward() {
		car.moveForward();
	}

	@Override
	public void moveBackwards() {
		car.moveBackwards();
	}

	@Override
	public void stop() {
		car.stop();
	}
	
	public void applyABSBreak() {
		System.out.println("Hatchback car applying ABS ... ");
	}
}
