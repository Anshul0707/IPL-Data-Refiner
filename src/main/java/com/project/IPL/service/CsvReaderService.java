package com.project.IPL.service;

import com.project.IPL.model.Person;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class CsvReaderService {

    public List<Person> readCsvFile(String filePath) {

        List<Person> persons = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true; // Flag to skip the header row
            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue; // Skip the header row
                }

                String[] data = line.split(",");
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String email = data[2];

                Person person = new Person(name, age, email);
                persons.add(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return persons;
    }
}

