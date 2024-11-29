package com.plinfotech.spring.boot.aws.cloud.build.and.pipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/test")
public class SpringBootAwsCloudBuildAndPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsCloudBuildAndPipelineApplication.class, args);
	}


	@GetMapping
	public String test(){
	   return  "Aws cloud build and pipeline testing";
	}

}
