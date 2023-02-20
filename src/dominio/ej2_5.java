package dominio;

public class ej2_5 {


    public static double media(double[] lista,int i) {
        if(i==0) {
            return lista[i];
        }else {

            return 	lista[i]+media(lista,i-1);
        }

    }

}
