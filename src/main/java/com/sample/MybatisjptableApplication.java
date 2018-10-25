package com.sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sample.mapper.CityMapper;

@SpringBootApplication
public class MybatisjptableApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MybatisjptableApplication.class, args);
	}
	
	private final CityMapper cityMapper;
	
	public MybatisjptableApplication(CityMapper cityMapper) {
		this.cityMapper=cityMapper;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(cityMapper.selectCityAll());
	}
}
