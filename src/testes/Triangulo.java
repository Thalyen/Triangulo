package testes;

/**
 *
 * @author Tat
 */
public class Triangulo {

    public String triangulo(double x, double y, double z) {
        String t = "";                                                                                                              // bloco 1
        if (x + y > z && x + z > y && y + z > x) {
            if (x == y && y == z) {                                                                                          //bloco 2
                System.out.println("formar um triangulo: triangulo equilatero\n");            //bloco 3
                t = "equilatero";
            } else if (x != y && y != z && z != x) {                                                                //bloco 4
                System.out.println("formar um triangulo: triangulo escaleno\n");            //bloco 5
                t = "escaleno";
            } else {                                                                                                                //bloco 6
                System.out.println("formar um triangulo: triangulo isoceles\n");               //bloco 7
                t = "isoceles";
            }
        } else {                                                                                                                    //bloco 8
            System.out.println(" NÃO formar um triangulo\n");                           
            t = "não triangulo";
        }
        return t;                                                                                                                  //bloco 9
    }                                               // complexidade de grafo 5

    public static void main(String[] args) {

        Triangulo teste = new Triangulo();

        System.out.println("Teste 1: não forma triangulo");
        teste.triangulo(1, 2, 3); // valores invalidos -não forma triangulo
        teste.triangulo(1, 0, 1); // valores invalidos -não forma triangulo
        teste.triangulo(3, 3, 3); // valor valido forma equilatero
        teste.triangulo(3, 2, 3);  // valor valido forma isoceles
        teste.triangulo(3, 2, 4);  // valor valido forma escleno
    }

}
