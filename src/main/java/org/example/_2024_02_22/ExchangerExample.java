package org.example._2024_02_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;

public class ExchangerExample {

    public static List<Action> actions() {
        List<Action> actionList = new ArrayList<>();
        Random random = new Random();
        Action[] actions = Action.values();
        for (int i = 0; i < 10; i++) {
            actionList.add(actions[random.nextInt(actions.length)]);
        }
        return actionList;
    }

    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();

        List<Action> G1List = actions();
        List<Action> G2List = actions();

        new Gamer("G1", G1List, exchanger).start();
        new Gamer("G2", G2List, exchanger).start();
    }
}


enum Action {
    STONE,
    SCISSORS,
    PAPER
}

class Gamer extends Thread {
    private String name;
    private List<Action> actionList;
    private Exchanger<Action> exchanger;

    public Gamer(String name, List<Action> actionList, Exchanger<Action> exchanger) {
        this.name = name;
        this.actionList = actionList;
        this.exchanger = exchanger;
    }

    public void getWinner(Action G1, Action G2) {
        if (G1 == Action.STONE && G2 == Action.SCISSORS ||
                G1 == Action.SCISSORS && G2 == Action.PAPER ||
                G1 == Action.PAPER && G2 == Action.STONE) {
            System.out.println("Winner: " + name + " || Action: G1 " + G1 + " || Action G2 " + G2);
            System.out.println();
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action ac : actionList) {
            try {
                reply = exchanger.exchange(ac);
                getWinner(ac, reply);
                Thread.sleep(1111);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}