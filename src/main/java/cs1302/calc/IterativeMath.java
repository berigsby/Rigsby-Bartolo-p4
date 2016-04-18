package cs1302.calc;

/* Implement the Math interface using iteration here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * REPLACE ME WITH ACTUAL JAVADOC FOR THIS CLASS.
 *
 * @author AUTHOR
 */
public class IterativeMath implements Math {

    public int inc(int n) {
        return n+1;
    } // inc

    public int dec(int n) {
	if(n == 0) return 0;
        return n-1;
    } // dec

    public int add(int lhs, int rhs) {
        int sum = lhs;
	while(rhs > 0){
	    sum = inc(sum);
	    rhs = dec(rhs);
	}//while
	return sum;
    } // add

    public int sub(int lhs, int rhs) {
        int sum = lhs;
	while(rhs > 0){
	    if(lhs == 0) break;
	    sum = dec(sum);
	    rhs = dec(rhs);
	}//while
	return sum;
    } // sub

    public int mul(int lhs, int rhs) {
        int product = 0;
	while(rhs > 0){
	    product = add(product,lhs);
	    rhs = dec(rhs);
	}//while
	return product;
    } // mul

    public int div(int lhs, int rhs) {
        if(rhs == 0) throw new ArithmeticException();
        int sum = 0;
	while(lhs >= rhs){
	    lhs = sub(lhs,rhs);
	    sum = inc(sum);
	}//while
	return sum;
    } // div

    public int fac(int n) {
        int sum = 1;
	while(n > 0){
	    sum = mul(sum,n);
	    n = dec(n);
	}//while
	return sum;
    } // fac

    public int pow(int lhs, int rhs) {
        int product = 1;
	while(rhs > 0){
	    product = mul(product, lhs);
	    rhs = dec(rhs);
	}//while
	return product;
    } // pow

} // IterativeMath
