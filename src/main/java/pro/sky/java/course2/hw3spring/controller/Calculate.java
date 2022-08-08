package pro.sky.java.course2.hw3spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.hw3spring.service.CalculateServ;

@RestController
@RequestMapping ("/calculator")

public class Calculate {

    private final CalculateServ calculateServ;

    public Calculate(CalculateServ calculateServ) {
        this.calculateServ = calculateServ;
    }

    @GetMapping
    public String greeting (){
        return "Welcome!";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(name = "num1") Integer a,
                       @RequestParam(name = "num2") Integer b){
        if (a == null|| b == 0) return "Enter the number";
        int plus = calculateServ.plus(a, b);
        return "a + b =" + plus;
    }

    @GetMapping("/minus")
    public String minus (@RequestParam(name = "num1") Integer a,
                         @RequestParam(name = "num2") Integer b){
        if (a == null|| b == 0) return "Enter the number";
        int minus = calculateServ.minus(a, b);
        return "a - b = " + minus;
    }

    @GetMapping("/multiply")
    public String multiply (@RequestParam(name = "num1") Integer a,
                            @RequestParam(name = "num2") Integer b){
        if (a == null|| b == 0) return "Enter the number";
        int multiply = calculateServ.multiply(a, b);
        return "a * b = " + multiply;
    }

    @GetMapping("/divide")
    public String divide (@RequestParam(name = "num1") Integer a,
                          @RequestParam(name = "num2") Integer b){
        if (a == null|| b == 0) return "Enter the number";
        float divide = calculateServ.divide(a, b);
        return "a / b = " + divide;
    }

}
