/**
 * 
 */
package io.ajjaranicodes.gof.creational.prototype;

/**
 * @author ajith.ajjarani
 *
 */
public interface PrototypeCapable extends Cloneable{

	PrototypeCapable clone() throws CloneNotSupportedException;
}
