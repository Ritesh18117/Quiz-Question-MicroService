package com.quiz.Entities;

import lombok.Data;


@Data
public class Question {

    private Long id;

    private String question;

    private Long quizId;
}

