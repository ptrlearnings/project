package com.groupkt;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.groupkt.domain.State;
import com.groupkt.repo.StateRepo;

@SpringBootApplication
@ComponentScan
@EntityScan
@EnableJpaRepositories
public class StandardizedQasdetApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandardizedQasdetApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(StateRepo repository) {
		State state = new State();
		state.setAbbr("AL");
		state.setArea("ONE");
		state.setCapital("Capl");
		state.setLargest_city("lar");
		state.setName("A");
		state.setCountry("USA");
		return (args) -> {
			repository.save(state);
		};
	}
}
