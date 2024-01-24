package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {

    @GetMapping
    public String getQuestion() {
        return "question from jack";
    }

    @GetMapping
    public String getQuestionByID(int id) {
        return "question based on id";
    }
}
