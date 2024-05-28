package com.example;
import java.util.Scanner;

public class bmicalculator { 
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Introduce tu peso: ");
float weight =scanner.nextFloat();
System.out.println("Has introducido correctamente tu peso: " + weight);

System.out.println("Introduce tu altura: ");
float height =scanner.nextFloat();
System.out.println("Has introducido correctamente tu altura: " + height);
scanner.close();

double bmiFloat = weight/(height*height);
double bmi = Math.round(bmiFloat * 10d) / 10d;

if(bmi < 16) {
    System.out.println("Tu índice de masa corporal es " + bmi + "Tienes delgadez severa"); 
} 

else if(bmi >= 16 && bmi < 17) {
System.out.println("Tu índice de masa corporal es " + bmi + "Tienes delgadez moderada");
}

else if(bmi >= 17 && bmi < 18.5) {
    System.out.println("Tu índice de masa corporal es " + bmi + "Tienes delgadez leve");
}

else if(bmi >= 18.5 && bmi < 25) {
    System.out.println("Tu índice de masa corporal es " + bmi + "Tienes peso normal");
}

else if(bmi >= 25 && bmi < 30) {
    System.out.println("Tu índice de masa corporal es " + bmi + "Tienes sobrepeso");
}

else if(bmi >=30 && bmi < 35) {
    System.out.println("Tu índice de masa corporal es " + bmi + "Tienes obesidad leve");
}

else if(bmi >= 35 && bmi < 40) {
    System.out.println("Tu índice de masa coroporal es " + bmi + "Tienes obesidad moderada");
}

if(bmi >= 40) {
    System.out.println("Tu índice de masa corporal es " + bmi + "Tienes obesidad mórbida");
}

}
}
