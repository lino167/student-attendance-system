import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JTextField;

import AS.Alunoas;
import POP.Sala;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Menu {
    static Alunoas alunoas = new Alunoas();

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

                System.out.print("Digite a data: ");
                String data = scanner.nextLine();

                System.out.print("Digite o nome do aluno: ");
                String nomAluno = scanner.nextLine();

                System.out.print("Digite presente/ausente: ");
                String chamada = scanner.next();


                SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
               


                Sala novaChamada = new Sala(data, nomAluno, chamada);
                novaChamada.setData(data);
                novaChamada.setNomAluno(nomAluno);
                novaChamada.setChamada(chamada);


                alunoas.addNovaChamada(novaChamada);

                break;
         
            }

            case 2: {
                List<Sala> listaDeChamada = alunoas.getSalaList();
                for(Sala sala : listaDeChamada) {
                
                   
                System.out.println("---Data: " + sala.getData());
                System.out.println("---Nome: " + sala.getNomAluno());
                System.out.println("---Status: " + sala.getChamada());
                System.out.println("------------------------------------------------------");

        }

        break;
        
            }

        } 
    }
}

    
