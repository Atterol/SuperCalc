/**
 * 
 */
package it.rgi.supercalc;

/**
 * @author academy1426r.01
 *
 */
public class SuperCalc {

	/**
	 * 
	 */
	private int ret; 
	
	public SuperCalc() {
	}
	
	public int sum(int op1, int op2) {
		ret= op1+op2;
		return ret;
	}

	public int sub(int op1,int op2) {
		ret= op1-op2;
		return ret;
	}
	
	public int mul(int op1,int op2) {
		ret= op1*op2;
		return ret;
	}
	
}
