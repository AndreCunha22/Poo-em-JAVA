package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Professor;

public class Professortest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "andre";
        professor.idade = 30;
        professor.sexo =   'M';
        System.out.println(professor.nome + " idade: "+ professor.idade + " sexo: " +professor.sexo);


    }


}
