package mavenGitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.dgtech.learning.mavenGitDemo.MathDemo;

public class MathDemoTest {
	
	MathDemo mDemoObj = new MathDemo(10, 2);
	
	@Test
	public void add() {
		assertEquals(12, mDemoObj.addInts());
	}
	

	@Test
	public void substract() {
		assertEquals(8, mDemoObj.substractInts());
	}
	
	@Test
	public void multiply() {
		assertEquals(20, mDemoObj.multInts());
	}
	
	@Test
	public void divide() {
		assertEquals(5, mDemoObj.divideInts());
	}
}
