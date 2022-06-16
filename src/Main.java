
public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.numberPuertas();
        miCoche.numberPuertas();
        miCoche.numberPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int sumaNumber(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche{
    public int puertas =0;

    public void numberPuertas(){
        this.puertas++;
    }

}