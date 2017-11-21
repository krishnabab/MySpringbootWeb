package com.krish.web.test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.krish.web.IndexController;

@SpringBootTest
public class IndexControllerTest {
	@Autowired
	IndexController ic;
	
	//@Test
	public void testHome() {
		String t = ic.home(new HashMap<>());
		assertTrue(t.equals("index"));
	}

}
