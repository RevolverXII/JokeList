package com.felix.jokelist;

public class JokeModel {
    private String JokeId;
    private String JokeText;

    public JokeModel(String JokeId, String JokeText){
        this.JokeId = JokeId;
        this.JokeText = JokeText;
    }


    public String getJokeId() {
        return JokeId;
    }

    public void setJokeId(String jokeId) {
        JokeId = jokeId;
    }

    public String getJokeText() {
        return JokeText;
    }

    public void setJokeData(String jokeData) {
        JokeText = jokeData;
    }
}
