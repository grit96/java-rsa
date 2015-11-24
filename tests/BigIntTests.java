package Assignment2.tests;

import java.math.BigInteger;
import org.junit.Test;
import static org.junit.Assert.*;
import Assignment2.BigInt;

public class BigIntTests {
  @Test
  public void modPow() {
    BigInt x = new BigInt("5");
    assertEquals(8, x.modPow(new BigInteger("3"), new BigInteger("13")).intValue());
  }

  public static void main(String[] args) {
    BigInt x = new BigInt("5");
    System.out.println(x.intValue());
    System.out.println(x.modPow(new BigInteger("3"), new BigInteger("13")).intValue());
    System.out.println(x.intValue());
  }
}