package Evaluacion1.EstructurasDeControl;

import java.util.Scanner;

public class a  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un dia (1-31):");
        int dia = sc.nextInt();
        System.out.println("introduzca un mes del año (1-12):");
        int mes = sc.nextInt();
        System.out.println("introduzca un año: (distinto de cero)");
        int año = sc.nextInt();
        int bisiesto = año % 4 ;
        int calc2 =año / 100;

        if ((dia >= 1 && dia <= 31) && (mes == 1 || mes == 3 ||mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && ( año != 0)){
            System.out.println("La fecha es correcta :" + dia + "/" + mes + "/" + año);
        } else if (((dia >= 1 && dia <= 30) && ( mes == 4 ||mes == 6 || mes == 9 || mes == 11 ) && ( año != 0))){
            System.out.println("la fecha es Correcta :"  + dia + "/" + mes + "/" + año);
        } else if ((dia >= 1 && dia <=29) && (mes == 2) && (bisiesto == 0)){
            System.out.println("la fehca es Correcta :"  + dia + "/" + mes + "/" + año);
        } else if ((dia >= 1 && dia <=28) && (mes == 2) && (año != 0 && año != 0 || año % 400 != 0)){
            System.out.println("La fecha es correcta :"  + dia + "/" + mes + "/" + año);
        }
        else System.out.println("la fecha es incorrecta");

    }
}



