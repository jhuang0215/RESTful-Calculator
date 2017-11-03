package calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    //---------------------------------- Addition ---------------------------------------------
    @RequestMapping("/arithmeticCalc/adder")
    public CalculatorResource add(@RequestParam(value = "a") double a,
                                  @RequestParam(value = "b") double b){
        return new CalculatorResource(a + b);
    }

    //---------------------------------- Subtraction -------------------------------------------
    @RequestMapping("/arithmeticCalc/subtracter")
    public CalculatorResource subtract(@RequestParam(value = "a") double a,
                                       @RequestParam(value = "b") double b){
        return new CalculatorResource(a - b);
    }

    //---------------------------------- Multiplication ----------------------------------------
    @RequestMapping("/arithmeticCalc/multiplier")
    public CalculatorResource multiply(@RequestParam(value = "a") double a,
                                       @RequestParam(value = "b") double b){
        return new CalculatorResource(a * b);
    }

    //---------------------------------- Division ----------------------------------------------
    @RequestMapping("/arithmeticCalc/divider")
    public CalculatorResource divide(@RequestParam(value = "a") double a,
                                     @RequestParam(value = "b") double b){
        return new CalculatorResource(a / b);
    }
}