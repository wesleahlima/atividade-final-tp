package atividadetecnicasprogramacao;

public class Menu {
    public void listaMenu (){        
        System.out.println("Seja bem-vindo!");
        System.out.print("Digite 1 se você é um professor e 2 se você é um aluno: ");        
    }    
    public void verificarUsuario (int opcao){
        if (opcao == 1){
            System.out.println("Seja bem-vindo Professor!");
        }
        else{
            System.out.println("Seja bem-vindo caro aluno!");
        }
    }
    
}
