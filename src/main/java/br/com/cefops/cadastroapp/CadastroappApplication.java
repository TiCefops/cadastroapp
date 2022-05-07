package br.com.cefops.cadastroapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CadastroappApplication implements WebMvcConfigurer {
	public void addViewController(ViewControllerRegistry registry)
	{
		registry.addViewController("/index").setViewName("index");
	}
	public static void main(String[] args) {
		SpringApplication.run(CadastroappApplication.class, args);
	}

}
