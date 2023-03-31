package tallerherencia;

//@author kilian diaz
public class TallerHerencia {

    public static void main(String[] args) {
        persona pe = new persona();
        pe.cargar();

        empleado em = new empleado();
        em.cargarsueldo();

        directiva di = new directiva();
        di.cargarcargo();

        System.out.println("los datos a imprimir son: \n");

        pe.imprimir();
        em.imprimirsueldo();
        di.imprimircargo();
    }

}
