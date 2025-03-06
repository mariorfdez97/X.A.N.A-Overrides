package com.src.minigames.trivia;

import minigames.Minigame;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TriviaGame extends Minigame {
    private List<TriviaQuestion> questions;
    private TriviaQuestion currentQuestion;
    private int score;

    public TriviaGame() {
        this.questions = new ArrayList<>();
        this.score = 0;
        loadQuestions();
    }

    private void loadQuestions() {
        // Load trivia questions from a data source (e.g., JSON file)
        // This is a placeholder for actual loading logic
        questions.add(new TriviaQuestion("What is the capital of France?", "Paris"));
        questions.add(new TriviaQuestion("What is 2 + 2?", "4"));
        questions.add(new TriviaQuestion("Who wrote 'Hamlet'?", "Shakespeare"));
    }

    public void startGame() {
        score = 0;
        askNextQuestion();
    }

    private void askNextQuestion() {
        if (questions.isEmpty()) {
            endGame();
            return;
        }
        Random random = new Random();
        int index = random.nextInt(questions.size());
        currentQuestion = questions.get(index);
        // Logic to display the question to players
    }

    public void answerQuestion(String answer) {
        if (currentQuestion != null && currentQuestion.getAnswer().equalsIgnoreCase(answer)) {
            score++;
            questions.remove(currentQuestion);
            askNextQuestion();
        } else {
            // Logic for incorrect answer
            endGame();
        }
    }

    private void endGame() {
        // Logic to end the game and display the score
    }

    public int getScore() {
        return score;
    }

    public TriviaQuestion getCurrentQuestion() {
        return currentQuestion;
    }
}