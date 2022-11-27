package com.maktab74.springbootnotephoneproject.maktab74.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maktab74.springbootnotephoneproject.maktab74.domain.Contact;
import com.maktab74.springbootnotephoneproject.maktab74.domain.Note;
import com.maktab74.springbootnotephoneproject.maktab74.domain.Root;
import com.maktab74.springbootnotephoneproject.maktab74.domain.User;
import com.maktab74.springbootnotephoneproject.maktab74.service.ContactService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/contact")
@RequiredArgsConstructor
public class ContactController {


    protected final ContactService contactService;


    @PostMapping("/create")
    public ResponseEntity<Contact> saveContact(@RequestBody Contact contact) {


        if (contact.getUsernameGithub() != null) {
            String githubUrl = "https://api.github.com/users/"+contact.getUsernameGithub()+"/repos?per_page=100&page=1";

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
            contact.setNameRepository(repositoryName);
            contactService.save(contact);

        }
            return ResponseEntity.ok(contact);
        }







    @PutMapping("/update")

    public ResponseEntity<Contact> update(@RequestBody Contact contact) {

       contactService.save(contact);

        return ResponseEntity.ok(contact);

    }




    @GetMapping("/show-contact")
    public ResponseEntity<List<Contact>> showAllContact(@RequestBody Note note) {

        List<Contact> contactsByNote = contactService.findContactsByNote(note);

        return ResponseEntity.ok(contactsByNote);

    }
//
//    @GetMapping("/findByName")
//    public ResponseEntity<List<Contact>> showByName(@RequestBody String name) {
//
//        List<Contact> contacts = contactService.findContactsByName(name);
//
//        return ResponseEntity.ok(contacts);
//
//    }

    private void test() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Contact[]> responseEntity = restTemplate.getForEntity(
                URI.create("localhost:8080/contact/findByName"),
                Contact[].class
        );

        Contact[] forObject = restTemplate.getForObject(
                URI.create("localhost:8080/contact/findByName"),
                Contact[].class
        );

        Contact[] body = responseEntity.getBody();


    }

    @SneakyThrows
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        String json = "{\"firstName\":\"mat\"}";
        JsonNode jsonNode = objectMapper.readTree(json);

        System.out.println(jsonNode.get("firstName").asText());

    }

}