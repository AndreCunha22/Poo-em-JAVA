package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Estudante;

// Podemos até mudar o valor das classes ao longo do codigo
// Porem o valor atribuido a classe principal permanecerá

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudant2 = new Estudante();

        estudante.nome = "sanji";
        System.out.println(estudante.nome);
        System.out.println(estudant2.nome);


    }
}
