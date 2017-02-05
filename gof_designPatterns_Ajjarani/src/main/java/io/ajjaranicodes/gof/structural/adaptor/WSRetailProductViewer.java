/**
 * 
 */
package io.ajjaranicodes.gof.structural.adaptor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ajith.ajjarani
 *
 */
public class WSRetailProductViewer implements ProductViewer {

	public List<String> listAllProducts() {
		List<String> productList = new ArrayList<String>();
		productList.add("Samsung Galaxy Grand 2");
		productList.add("USB 3.0 Data cable");
		productList.add("Seagate Portable Hard disk");
		productList.add("Ni Mh Portable battery charger");
		productList.add("Mac Thunderbird cable");
		productList.add("Lenovo power bank");
		productList.add("Bluetooth Mouse");
		
		return productList;
	}

}
