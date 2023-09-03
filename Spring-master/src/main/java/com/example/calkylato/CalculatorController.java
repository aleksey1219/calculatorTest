package com.example.calkylato;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String helloCalc() {
        return calculatorService.helloCalc();
    }

    @GetMapping(path = "/plus")
    public String sum(@RequestParam Integer num1, @RequestParam Integer num2) {

        return num1 + "+" + num2 + "=" + calculatorService.sum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String min(@RequestParam Integer num1, @RequestParam Integer num2) {

        return num1 + "-" + num2 + "=" + calculatorService.min(num1, num2);
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {

        return num1 + "*" + num2 + "=" + calculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {

        return num1 + "/" + num2 + "=" + calculatorService.divide(num1, num2);
    }
}
