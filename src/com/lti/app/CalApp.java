/**
 * 
 */
package com.lti.app;

/**
 * @author 10710195
 *
 */
import com.lti.service.CalculatorService;
public class CalApp {
	public static void main(String[] args) {
		
		
		// create the instance of the class & expose all methods here
		
		CalculatorService service =new CalculatorService();
		System.out.println("addition :--" +service.add(10, 10));
		System.out.println("substraction :-->" +service.sub(10, 8));
		System.out.println("Multiplication :-->" +service.mul(10, 10));
		System.out.println("addition :-->" +service.div(12, 6));
	}

}
