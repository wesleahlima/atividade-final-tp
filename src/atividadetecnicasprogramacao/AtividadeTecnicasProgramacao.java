package atividadetecnicasprogramacao;

import java.util.Scanner;

public class AtividadeTecnicasProgramacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Aluno a1 = new Aluno();
        a1.nome = "Wesley";
        a1.idade = 30;
        a1.curso = "Desenvolvimento de Sistemas";
        
        Professor p1 = new Professor();
        p1.nome = "Luciano";
        p1.idade = 47;
        p1.disciplina = "Matemática";
        
        Menu objMenu = new Menu();
        objMenu.listaMenu();
        int opcao = entrada.nextInt();        
        objMenu.verificarUsuario(opcao);
    }
    
}
