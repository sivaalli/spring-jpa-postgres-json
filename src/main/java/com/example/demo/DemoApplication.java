package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private static final ObjectMapper mapper = new ObjectMapper();

    @Autowired
    private NameRepository nameRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ObjectNode objectNode = mapper.createObjectNode();
        objectNode.put("company", "salesforce");
        nameRepository.save(new Name(5, objectNode));

        List<Name> all = nameRepository.findAll();

        for (Name name : all){
            System.out.println(name);
        }
    }
}
