package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.modelo.Performance;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReadjustmentServiceTest {

    private ReadjustmentService service;
    private Funcionario employee;

    @BeforeEach
    public void initialize(){
        System.out.println("Test starting");
        this.service  = new ReadjustmentService();
        this.employee = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
    }

    @AfterEach
    public void finish(){
        System.out.println("test finished");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After All");
    }

    @Test
    public void readjustmentShouldBeThreePerCentWhenPerformanceWasBad(){
        service.grantReadjustment(employee, Performance.BAD);
        assertEquals(new BigDecimal("1030.00"), employee.getSalario());
    }

    @Test
    public void readjustmentShouldBeThreePerCentWhenPerformanceWasGood(){
        service.grantReadjustment(employee, Performance.GOOD);
        assertEquals(new BigDecimal("1150.00"), employee.getSalario());
    }

    @Test
    public void readjustmentShouldBeThreePerCentWhenPerformanceWasExcellent(){
        service.grantReadjustment(employee, Performance.EXCELLENT);
        assertEquals(new BigDecimal("1200.00"), employee.getSalario());
    }

    @Test
    public void readjustmentShouldBeThreePerCentWhenPerformanceWasAmazing(){
        service.grantReadjustment(employee, Performance.AMAZING);
        assertEquals(new BigDecimal("1400.00"), employee.getSalario());
    }

}