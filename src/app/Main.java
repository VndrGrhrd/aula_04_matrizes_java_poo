package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] = input.nextInt();
            }
        }

        input.close();

        System.out.print("main diagonal => ");
        for(int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(matriz[i][j] < 0){
                    count++;
                }
            }
        }

        System.out.println("Negative numbers => " + count);



    }
}
