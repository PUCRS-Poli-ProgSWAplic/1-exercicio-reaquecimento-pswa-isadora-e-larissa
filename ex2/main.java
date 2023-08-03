package ex2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int numero = 0;
        String mes;

        Scanner teclado = new Scanner(System.in);


        for (int i = 0; i <= 10; i++) {
            numero = numero++;
            mes = "numero" + numero;
            //enviar o numero
        }

        System.out.print("qual tipo?");
        String resposta = teclado.nextLine();
        createLogger(resposta);
        
    }

    private static Logger createLogger(String type) {
        if ("arquivo".equalsIgnoreCase(type)) {
            return new FileLogger("log.txt");
        } else if ("console".equalsIgnoreCase(type)) {
            return new ConsoleLogger();
        }
    }
}