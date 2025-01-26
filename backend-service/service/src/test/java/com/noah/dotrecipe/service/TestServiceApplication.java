package com.noah.dotrecipe.service;

import com.noah.dotrecipe.DotRecipeApplication;
import org.springframework.boot.SpringApplication;

public class TestServiceApplication {

  public static void main(String[] args) {
    SpringApplication.from(DotRecipeApplication::main).with(TestcontainersConfiguration.class)
        .run(args);
  }

}
