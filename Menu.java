import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import POP.Sala;

public class Menu {

    public static void main(String[] args) throws Exception {
        System.out.println("--- LISTA DE PRESENÇA ---");

        int option;

        do{
              System.out.println("1 - Fazer a chamada");
              System.out.println("2 - Lista de presentes/ausentes");
              System.out.println("0 - Sair");
    
              Scanner scanner = new Scanner(System.in);
              System.out.print("Qual operação você deseja realizar: ");
              option = scanner.nextInt();
    
              input(option);
    
          } while(option != 0);

    }
    
    public static void input(int option) throws Exception {
        switch (option) {
            case 1:{
                Scanner scanner = new Scanner(System.in);

               
                System.out.print("Digite o nome do aluno: ");
                String nomAluno = scanner.nextLine();

                System.out.print("Digite presente/ausente: ");
                String chamada = scanner.nextLine();

                System.out.print("Digite a data: ");
                String data = scanner.next();
         


                SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");

                Sala novaChamada = new Sala(data, nomAluno, chamada);
         
            }

        }
        
    }

}
