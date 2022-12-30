package io.github.xingkongqwq.dub;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xkawa
 */
@SpringBootApplication
public class DubApplication {
	private static final Logger logger = LoggerFactory.getLogger(DubApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DubApplication.class, args);
		logger.warn("Dub running at port 8080");
	}

}
