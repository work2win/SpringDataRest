package simu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"simu","controller","service"})
@Controller
public class SimuApplication {
	
	@ResponseBody
	@RequestMapping("/")
	String entry() {
		return "My Spring Boot App";
	}

	public static void main(String[] args) {
		SpringApplication.run(SimuApplication.class, args);
	}
}
