package helloWorld;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import helloWorld.HelloWorld;

public class HelloWorldTest {

	private HelloWorld hw;
	private HelloWorld service = Mockito.mock(HelloWorld.class);
	
	@Before
	public void setUp() {
		hw = new HelloWorld("Robbe");
	}
	@After
	public void tearDown() {
		hw = null;
	}
	
	@Test
	public void testgetHelloWorldMock() {
		String helloWorld = hw.getHelloWorld();
		assertEquals(helloWorld,"Hello world !");
		when(service.getHelloWorld()).thenReturn("Hello Java !");
		helloWorld = service.getHelloWorld();
		verify(service).getHelloWorld();
	}

}

