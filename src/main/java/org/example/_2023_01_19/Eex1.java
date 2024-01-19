package org.example._2023_01_19;

public class Eex1 {
    public double div(double a, double b) throws IllegalArgumentException {
        return a / b;
    }

    public double div1(double a, double b) throws Exception {
        if(a == 5) {
            throw new ParameterAIsMustBeNotFiveException("not 5");
        }
        return a / b;
    }

    public double div2(double a, double b) throws Exception {
        return a / b;
    }

    public double div3(double a, double b)  {
        if(b == 0) {
            throw new IllegalArgumentException();
        }
        return a / b;
    }

    public double div4(double a, double b)  {
        if(b == 0) {
            throw new MyParameterException(ErrorMessage.PARAM_MUST_BE_NOT_NULL);
        }
        return a / b;
    }

    public static void main(String[] args)  {
//        new Eex1().div(10, 20);
//        new Eex1().div1(1, 3);

        try {
            new Eex1().div2(1, 3);
        } catch (Exception e) {
            System.out.println("Parameter 'b' must be not null");
        }
    }
}

class MyParameterException extends RuntimeException {
    public MyParameterException(String message) {
        super(message);
    }
}

