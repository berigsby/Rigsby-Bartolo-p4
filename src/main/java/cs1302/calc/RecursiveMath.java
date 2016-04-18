package cs1302.calc;

/* Implement the Math interface using recursion here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * REPLACE ME WITH ACTUAL JAVADOC FOR THIS CLASS.
 *
 * @author AUTHOR
 */
public class RecursiveMath implements Math {

    public int inc(int n) {
        return n + 1;
    } // inc

    public int dec(int n) {
	if(n == 0) return 0;
        return n - 1;
    } // dec

    public int add(int lhs, int rhs) {
	if(rhs == 0) return lhs;
        return add(inc(lhs), dec(rhs));
    } // add

    public int sub(int lhs, int rhs) {
        if(rhs == 0) return lhs;
	if(lhs == 0) return 0;
	return sub(dec(lhs), dec(rhs));
    } // sub

    public int mul(int lhs, int rhs) {
        return mul_rec(lhs, rhs, 0);
    } // mul

    private int mul_rec(int lhs, int rhs, int product) {
	if(rhs == 0) return product;
        return mul_rec(lhs, dec(rhs), add(product, lhs));
    } // mul_rec

    public int div(int lhs, int rhs) {
	if(rhs == 0) throw new ArithmeticException();
	return div_rec(lhs, rhs, 0);
    }//div

    private int div_rec(int lhs, int rhs, int sum) {
	if(lhs < rhs) return sum;
	return div_rec(sub(lhs, rhs), rhs, inc(sum));
    }//div_rec

    public int fac(int n) {
        return fac_rec(n, 1);
    } // fac

    private int fac_rec(int n, int sum) {
	if(n == 0) return sum;
	return fac_rec(dec(n), mul(sum, n));
    } // fac_rec

    public int pow(int lhs, int rhs) {
        return pow_rec(lhs, rhs, 1);
    } // pow

    private int pow_rec(int lhs, int rhs, int product) {
	if(rhs == 0) return product;
        return pow_rec(lhs, dec(rhs), mul(product, lhs));
    } // pow_rec

} // RecursiveMath
