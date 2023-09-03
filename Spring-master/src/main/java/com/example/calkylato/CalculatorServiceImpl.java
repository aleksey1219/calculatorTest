package com.example.calkylato;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public  class CalculatorServiceImpl implements CalculatorService {
    public String helloCalc() {
        return "Добро пожаловать в калькулятор";
    }

    public double sum( double num1, double num2) {

        return num1+num2;
    }

    public double min(double num1, double num2) {

        return num1-num2;
    }
    public double multiply(double num1, double num2){
        return num1*num2;

    }
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new RuntimeException(" нельзя");
        }
        return (double) num1 / num2;
    }
}

