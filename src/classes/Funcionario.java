package classes;

public class Funcionario {
    private String nome;
    private String setor;
    private double salarioBruto;
    private String dataAdmissao;
    private String dataDemissao;
    
    //Construtor sem data de demissão
    public Funcionario(String nome, String setor, double SalarioBruto, String dtAdm){
        this.nome = nome;
        this.setor = setor;
        this.salarioBruto = SalarioBruto;
        this.dataAdmissao = dtAdm;
    }
    //Construtor com data de demissão
    public Funcionario(String nome, String setor, double SalarioBruto, String dtAdm, String dtDem){
        this.nome = nome;
        this.setor = setor;
        this.salarioBruto = SalarioBruto;
        this.dataAdmissao = dtAdm;
        this.dataDemissao = dtDem;
    }
    //ÚTIL PARA TESTE
    //Setar salário
    public void setSalario(double salarioBruto){
        this.salarioBruto = salarioBruto;
    }
    //Obter salário
    public double getSalario(){
        return salarioBruto;
    }
    //Situação do funcionário
    public String getSituacao(){
        //Se data de demissão está vazia, retorna "Ativo".
        if (dataDemissao == null)
            return "Ativo";
        return "Demitido";
    }
    //Cálculo salário
    public double calcularSalarioLiquido(){
        if(salarioBruto <= 1900)
            //Salário sem desconto;
            return salarioBruto;
        else if(salarioBruto > 1900 && salarioBruto <= 2800)
            //Salário com desconto de 7.5%;
            return salarioBruto * (1 - 0.075);
        else if(salarioBruto > 2800 && salarioBruto <= 3750)
            //Salário com desconto de 15%;
            return salarioBruto -= salarioBruto / 100 * 15;
//            return salarioBruto * (1 - 0.15);
        else if(salarioBruto > 3750 && salarioBruto <= 4660)
            //Salário com desconto de 22.5%;
            return salarioBruto * (1 - 0.225);
        else if(salarioBruto > 4660)
            //Salário com desconto de 27.5%;
            return salarioBruto * (1 - 0.275);
        return 0;
    }
}
