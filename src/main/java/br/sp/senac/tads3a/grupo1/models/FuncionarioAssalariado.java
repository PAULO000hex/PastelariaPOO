package br.sp.senac.tads3a.grupo1.models;

import java.util.Date;


public class FuncionarioAssalariado extends Funcionario{
    
    private float salario;
    
    public FuncionarioAssalariado(String nome, Date dataNascimento, String CPF, int funcionarioId, float salario){
        super(nome, dataNascimento, CPF, funcionarioId);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
