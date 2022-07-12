package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.Performance;

import java.math.BigDecimal;

public class ReadjustmentService {
    public void grantReadjustment(Funcionario employee, Performance performance) {
        BigDecimal percentage = performance.percentageReadjustment();
        BigDecimal readjustment = employee.getSalario().multiply(percentage);
        employee.readjustSalary(readjustment);
    }
}
