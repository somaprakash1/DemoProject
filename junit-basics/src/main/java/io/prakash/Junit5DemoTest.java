package io.prakash;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class Junit5DemoTest {

	@Test
	void test5() {
		Junit5Demo ju= new Junit5Demo();
		ju.open("https://www.google.com/");
}
}
