package com.techprimers.kubernetes.springcloudkubernetesconfigexample;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "welcome")
@Configuration
public class WelcomeConfiguration {

    private String message = "Welcome to TechPrimers";

	public String getLala() {
		return lala;
	}

	public void setLala(String lala) {
		this.lala = lala;
	}

	private  String lala;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
