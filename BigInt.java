package Assignment2;

import java.math.BigInteger;

public class BigInt {
  private BigInteger x;

  public static final BigInt ZERO = new BigInt("0");
  public static final BigInt ONE = new BigInt("1");

  public BigInt(String x) { this.x = new BigInteger(x); }
  public BigInt(BigInteger x) { this.x = x; }

  public boolean isZero() { return this.x.equals(ZERO.x); }
  public boolean isOne() { return this.x.equals(ONE.x); }
  public int intValue() { return this.x.intValue(); }

  public BigInt and(BigInt x) { return new BigInt(this.x.and(x.x)); }
  public BigInt mod(BigInt x) { return new BigInt(this.x.mod(x.x)); }
  public BigInt subtract(BigInt x) { return new BigInt(this.x.subtract(x.x)); }
  public BigInt multiply(BigInt x) { return new BigInt(this.x.multiply(x.x)); }
  public BigInt shiftRight(int x) { return new BigInt(this.x.shiftRight(x)); }

  public BigInt modPow(BigInt exponent, BigInt modulus) {
    BigInt c = ONE;
    while (!exponent.isZero()) {
      c = this.multiply(c).mod(modulus);
      exponent = exponent.subtract(ONE);
    }
    return c;
  }
}
