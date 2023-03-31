package tallerherencia;

//@author kilian diaz
import java.util.Scanner;

public class directiva extends persona {

    public void cargarcargo() {

        Scanner car = new Scanner(System.in);
        System.out.println("ingrese el cargo");
        cargo = car.next();

    }

    public void imprimircargo() {

        System.out.println("el cargo es: " + cargo);

    }

}
