package testes;

/**
 *
 * @author Tat
 */
public class Dependente {

    public int desconto(int idade) {
        int desconto = 0;

        if (idade < 0 || idade > 24) {
            System.out.println("Dependente não tem direito a desconto\n");
            return 0;
        } else {
            if (idade <= 12) {
                desconto = 15;
            } else if (idade <= 18) {
                desconto = 12;
            } else if (idade <= 21) {
                desconto = 5;
            } else {
                desconto = 3;
            }
            System.out.println("O desconto é de: " + desconto+ "\n");
        }
        return desconto;
    }

    public static void main(String[] args) {

        Dependente teste = new Dependente();
        teste.desconto(-1);     //nao tem desconto
        teste.desconto(12);    //desconto 15
        teste.desconto(13);    //desconto 12
        teste.desconto(18);    //desconto 12
        teste.desconto(19);    //desconto 5
        teste.desconto(21);    //desconto 5
        teste.desconto(22);    //desconto 3
        teste.desconto(24);    //desconto 3
        teste.desconto(25);     //nao tem desconto

    }
}
