package classes;

import org.junit.*;
import static org.junit.Assert.*;

public class FuncionarioTest {
    
    public Funcionario funcionario;
    
    public FuncionarioTest() {
    }
    
    @Before
    public void setUp(){
        //Ativo
        //funcionario = new Funcionario("Rafael Batista", "TI", 4500, "01/02/2019");
        //Demitido
        funcionario = new Funcionario("Rafael Batista", "TI", 1900, "01/02/2019", "10/04/2019");
    }
    @Test
    public void testStatusFuncionario(){        
        assertEquals("Demitido", funcionario.getSituacao());
    }
    @Test
    public void testCalculoSalarioBruto(){
        //Teste de salário sem desconto;
        double salarioAtual = funcionario.getSalario();
        assertEquals(salarioAtual, funcionario.calcularSalarioLiquido(), 0001);
    }
    @Test
    public void testCalculoSalarioDesc7_5(){
        //Teste de salário com desconto de 7.5%;
        funcionario.setSalario(2800);
        double calculo = funcionario.getSalario() * (1 - 0.075);
        assertEquals(calculo, funcionario.calcularSalarioLiquido(), 0001);
    }
    @Test
    public void testCalculoSalarioDesc15(){
        //Teste de salário com desconto de 15%;
        funcionario.setSalario(3000);
        double calculo = funcionario.getSalario() * (1 - 0.15);
        assertEquals(2550, funcionario.calcularSalarioLiquido(), 0001);
    }
    @Test
    public void testCalculoSalarioDesc22_5(){
        //Teste de salário com desconto de 22,5%;
        funcionario.setSalario(3751);
        double calculo = funcionario.getSalario() * (1 - 0.225);
        assertEquals(calculo, funcionario.calcularSalarioLiquido(), 0001);
    }
    @Test
    public void testCalculoSalarioDesc27_5(){
        //Teste de salário com desconto de 27,5%;
        funcionario.setSalario(4661);
        double calculo = funcionario.getSalario() * (1 - 0.275);
        assertEquals(3379.22, funcionario.calcularSalarioLiquido(), 0001);
    }
}