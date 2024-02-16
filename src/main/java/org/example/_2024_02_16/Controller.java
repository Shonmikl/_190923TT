package org.example._2024_02_16;

public class Controller implements DoAble {
    @Override
    public void start() {
        System.out.println("Origin Controller START");
    }

    @Override
    public void stop() {
        System.out.println("Origin Controller STOP");
    }
}

class ControllerProxy implements DoAble {
    private Controller originController;

    public ControllerProxy(Controller originController) {
        this.originController = originController;
    }

    @Override
    public void start() {
        System.out.println("START LOGGING");
        originController.start();
    }

    @Override
    public void stop() {
        System.out.println("STOP LOGGING");
        originController.stop();
    }
}

interface DoAble {
    void start();
    void stop();
}

class Main {
    public static void main(String[] args) {
        Controller oc = new Controller();
        ControllerProxy cp = new ControllerProxy(oc);

        cp.start();
    }
}