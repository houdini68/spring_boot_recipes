package com.rudyvissers.learn.spf.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(OutputCaptureExtension.class)
@SpringBootTest(classes = CalculatorApplication.class)
public class CalculatorApplicationTests {
    @Autowired
    private Calculator calculator;

    @Test
    public void doingMultiplicationShouldSucceed(CapturedOutput capturedOutput) {
        calculator.calculate(12, 13, '*');
        Assertions.assertThat(capturedOutput.getOut()).contains("12 * 13 = 156");
    }

    @Test
    public void doingDivisionShouldFail() {
        assertThrows(IllegalArgumentException.class, () -> calculator.calculate(12, 13, '/'));
    }
}
