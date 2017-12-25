package mavenGitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.dgtech.learning.mavenGitDemo.MathDemo;

public class MathDemoTest {
	
	MathDemo mDemoObj = new MathDemo(10, 2);
	
	@Test
	public void add() {
		assertEquals(11, mDemoObj.addInts());
	}
}
