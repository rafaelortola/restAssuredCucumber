package Suporte;

import java.util.Random;
import java.util.StringTokenizer;

public class GeradorDeEmail {
    public static String converte() { // retorna a string gerada
        Random r = new Random(); // objeto para chamar nextGaussian()
        String resultado = new String(); // obtem a string final e a retorna.
        char letras[] = {'r','a','d','o','l','b','c','x','f','g'};
        double d; // recebe o valor de nextGaussian()
        int posicao;

        while (( d = r.nextGaussian() ) < 0); // só sai quando for um valor positivo

        /* valorStr recebe o nextGaussian() sem ponto numa string. Primeiro "converte" o
         * double d para String e depois pega o q está "antes" e "depois" do ponto.
         */
        StringTokenizer st = new StringTokenizer(String.valueOf(d),".");
        String valorStr = st.nextToken().concat(st.nextToken());

        /* posicao vai ter o i-ésimo caractere de valorStr em forma de inteiro. Essa
         * variável indica o elemento do vetor letras[] que será concatenado a resultado
         * */
        for(int i = 0; i < valorStr.length(); i++){
            posicao = Integer.parseInt(valorStr.substring(i,i+1));
            resultado = resultado.concat(String.valueOf(letras[posicao]));
        }
        return resultado;
    } // fim do método converte()

    public static void main (String[] args){
        System.out.println(converte());
    }

}
