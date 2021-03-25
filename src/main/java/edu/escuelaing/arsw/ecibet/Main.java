package edu.escuelaing.arsw.ecibet;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Main implements CommandLineRunner {

  @Autowired
  private BCryptPasswordEncoder passworEncoder;

  public static void main(String[] args) {

    SpringApplication.run(Main.class, args);
  }


  @Override
  public void run(String... args) throws Exception {
//    String pass = "1234";
//    String paswordBcrypt = passworEncoder.encode(pass);
//    System.out.println(paswordBcrypt);
//    HttpResponse<String> response = Unirest.get("https://heisenbug-premier-league-live-scores-v1.p.rapidapi.com/api/premierleague/table")
//            .header("x-rapidapi-key", "5716617fcemsh2b5d60c75f24ac7p1cc288jsn40e05c1da0bd")
//            .header("x-rapidapi-host", "heisenbug-premier-league-live-scores-v1.p.rapidapi.com")
//            .asString();
//    System.out.println(response.getBody());
  }
}
