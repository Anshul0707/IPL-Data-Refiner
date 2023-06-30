package com.project.IPL.controller;

import com.project.IPL.model.Person;
import com.project.IPL.service.CsvReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CsvReaderController {

    private final CsvReaderService csvReaderService;

    @Autowired
    public CsvReaderController(CsvReaderService csvReaderService) {
        this.csvReaderService = csvReaderService;
    }

    @GetMapping("/read-csv")
    public List<Person> readCsv() {
        String filePath = "src/main/resources/data/demo.csv"; // Replace with the actual file path
        return csvReaderService.readCsvFile(filePath);
    }
}

