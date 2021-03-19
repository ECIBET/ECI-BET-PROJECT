package edu.escuelaing.arsw.ecibet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class Main {

  public static void main(String[] args) {

    SpringApplication.run(Main.class, args);
  }

  @RequestMapping("/")
  String index() {
    return "about";
  }




}
