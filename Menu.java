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
    
    public static <string> void input(int option) throws Exception {
        switch (option) {
            case 1:{
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o nome do aluno: ");
                String nomAluno = scanner.nextLine();

                System.out.print("Digite presente/ausente: ");
                String chamada = scanner.next();

               


                Sala novaChamada = new Sala(nomAluno, chamada);
                novaChamada.setNomAluno(nomAluno);
                novaChamada.setChamada(chamada);


                alunoas.addNovaChamada(novaChamada);

                break;
         
            }

            case 2: {
                Date data = new Date();
                SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy " + "hh:mm");
                String dataFormatada = dataFormat.format(data);
                System.out.println(dataFormatada);

                List<Sala> listaDeChamada = alunoas.getSalaList();
                for(Sala sala : listaDeChamada) {
            
                System.out.printf("%50d%15d", sala.getNomAluno() + " - " + sala.getChamada());
                
               

        }

        break;
        
            }

        } 
    }
}

    
