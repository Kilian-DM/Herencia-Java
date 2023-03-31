package tallerherencia;

//@author kilian diaz

import java.util.Scanner;

public class persona {

    String nombre;
    int edad;
    int sueldo;
    String cargo;

    public void cargar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre");
        nombre = sc.next();
        System.out.println("ingrese la edad");
        edad = sc.nextInt();

    }


    public void imprimir () {
        System.out.println("el nombre es: " + nombre + "\nla edad es: " + edad);

    }

}
