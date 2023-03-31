package tallerherencia;

//@author kilian diaz

import java.util.Scanner;


public class empleado extends persona {
    
        public void cargarsueldo() {

        Scanner su = new Scanner(System.in);
        System.out.println("ingrese el sueldo");
        sueldo = su.nextInt();
    }

    public void imprimirsueldo() {


        System.out.println("el sueldo es: " + sueldo);
    }
}
