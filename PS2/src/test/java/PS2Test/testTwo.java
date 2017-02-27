package PS2Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Base.MyInteger;

public class testTwo {
	MyInteger testnumber= new MyInteger(4);
	MyInteger testnumber2= new MyInteger(5);
	MyInteger testnumber3= new MyInteger(1);
	
	@Test
	public void testMyInteger() {
		assertEquals(4, testnumber.GetValue());
		assertEquals(5, testnumber2.GetValue());
		assertEquals(1,testnumber3.GetValue());
	}
	@Test
	public void testisEven(){
		assertEquals(true, testnumber.isEven());
		assertEquals(false, testnumber2.isEven());
	}
	@Test 
	public void testisOdd(){
		assertEquals(true, testnumber2.isOdd());
		assertEquals(false, testnumber.isOdd());
	}
	@Test
	public void testisPrime(){
		assertEquals(true, testnumber2.isPrime());
		assertEquals(false, testnumber.isPrime());
		//must test for value one because thats not a prime
		assertEquals(false,testnumber3.isPrime());
	}
	@Test
	public void testisEven2(){
		assertEquals(true, MyInteger.isEven(4));
		assertEquals(false, MyInteger.isEven(5));
	}
	@Test 
	public void testisOdd2(){
		assertEquals(true, MyInteger.isOdd(5));
		assertEquals(false, MyInteger.isOdd(4));
	}
	@Test
	public void testisPrime2(){
		assertEquals(true, MyInteger.isPrime(5));
		assertEquals(false, MyInteger.isPrime(4));
		assertEquals(false, MyInteger.isPrime(1));
	}
	@Test
	public void testisEven3(){
		assertEquals(true, MyInteger.isEven(testnumber));
		assertEquals(false,MyInteger.isEven(testnumber2));
	}
	@Test
	public void testisOdd3(){
		assertEquals(true, MyInteger.isOdd(testnumber2));
		assertEquals(false, MyInteger.isOdd(testnumber));
	}
	@Test
	public void testisPrime3(){
		assertEquals(true, MyInteger.isPrime(testnumber2));
		assertEquals(false, MyInteger.isPrime(testnumber));
		assertEquals(false, MyInteger.isPrime(testnumber3));
	}
	@Test
	public void testisEquals(){
		assertEquals(true, testnumber.equals(4));
		assertEquals(false, testnumber.equals(8));
	}
	@Test
	public void testisEquals2(){
		assertEquals(true, testnumber.equals(4));
		assertEquals(false,testnumber.equals(testnumber2));
	}


}







