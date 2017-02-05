/**
 * 
 */
package io.ajjaranicodes.gof.structural.adaptor;

/**
 * 
 * 
 * @author ajith.ajjarani
 *
 */
public class AdaptorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProductViewer wsRetailProductViewer = new WSRetailProductViewer();
		System.out.println(wsRetailProductViewer.listAllProducts());
		
		ProductViewer legacyProductViewer = new ListProductViewerAdaptor(new LegacyProductViewer());
		System.out.println(legacyProductViewer.listAllProducts());
	}

}
