package egovframework.example.boot.web;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:/egovframework/springmvc/dispatcher-servlet.xml","classpath*:/egovframework/spring/context-*.xml"})
@Import(EgovBootInitialization.class)
@ComponentScan(basePackages="egovframework.example")
public class EgovBootApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(EgovBootApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.setLogStartupInfo(false);
		springApplication.run(args);
	}

}
