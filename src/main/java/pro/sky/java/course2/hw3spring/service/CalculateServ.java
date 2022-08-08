package pro.sky.java.course2.hw3spring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculateServ {

    public int plus (int a, int b) {
        int plus = a + b;
        return plus;
    }

    public int minus (int a, int b) {
        int minus = a - b;
        return minus;
    }

    public int multiply (int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    public float divide (int a, int b) {
        if (b == 0){
            System.out.println("Error");;
        }
        float divide = a / b;
        return divide;
    }
}
