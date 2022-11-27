package com.maktab74.springbootnotephoneproject;

import com.maktab74.springbootnotephoneproject.maktab74.domain.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

public class SpringBootNotePhoneProjectApplication {





    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringBootNotePhoneProjectApplication.class, args);


        String githubUrl = "https://api.github.com/users/hossein113/repos?per_page=100&page=1";

            RestTemplate restTemplate = new RestTemplate();

            ResponseEntity<Root[]> forEntity = restTemplate.getForEntity(
                    URI.create(githubUrl),
                    Root[].class);

            Root[] body = forEntity.getBody();
            List<String> repositoryName = new ArrayList<>();


            for (int i = 0; i < body.length; i++) {

                Root root = body[i];
                repositoryName.add(root.getName());

            }



    }

}



