package net.devk.gelfappender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GelfAppenderApplication {

  private static Logger logger = LoggerFactory.getLogger(GelfAppenderApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(GelfAppenderApplication.class, args);
  }

  @Bean
  public CommandLineRunner runner() {
    return args -> logger.info("Hellllooooooooooooooooo");
  }

}
