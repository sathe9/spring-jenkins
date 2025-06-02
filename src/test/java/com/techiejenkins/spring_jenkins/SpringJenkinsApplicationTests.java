package com.techiejenkins.spring_jenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
 public class SpringJenkinsApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);



	@Test
	public contextLoads() {
		logger.info("Test case executing...");
		logger.info("Test case executing second log statement...");
		assertEquals(true, true);
	}
}