package diobootcamp;

public class Main {

    public static void main (String[] args){

        // Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        // Mensagem
        System.out.println("Exercício mensagem");

        Mensagem.obterMensagem (9);
        Mensagem.obterMensagem (14);
        Mensagem.obterMensagem (1);


        //Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);





        // Quadrilátero
        System.out.println("Exercício quadrilátero");
        area.area(3);
        area.area(5,5);
        area.area(7,8,9);
        area.area(2f,4f);

    }

}
