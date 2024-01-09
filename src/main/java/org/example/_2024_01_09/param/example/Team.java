package org.example._2024_01_09.param.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Participant> {
    private String teamName;
    private List<T> participantList = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addNewParticipant(T participant) {
        participantList.add(participant);
    }

    public void play(Team<T> secondTeam) {
        String winner;
        int randomDigit = new Random().nextInt(2);

        if(randomDigit == 0) {
            winner = this.teamName;
        } else {
            winner = secondTeam.teamName;
        }
        System.out.println("WINNER: " + winner + "!!!!!");
    }
}