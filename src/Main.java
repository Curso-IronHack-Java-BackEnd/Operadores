public class Main {
    public static void main(String[] args) {

        //Creamos la variable randomNumber para el ejercicio de comprobar si es par o impar
        int randomNumber = (int)(Math.random()*1000+1);
        //Creamos la variable randomNumber2 para el ejercicio de comprobar si es double o no, es decir, si tiene decimales
        double randomNumber2 = (Math.random()*10);

        //Este if comprueba si el número randonNumber es par o impar
        if (randomNumber % 2 == 0){ //Comprueba si el resto de dividir por 2 es 0 (par)
            System.out.println("El número " + randomNumber + " es par");
        } else {
            System.out.println("El número " + randomNumber + " es impar");
        }

        //Este if comprueba si el número randonNumber2 es double o no (si tiene decimales)
        if (randomNumber2 % 1 == 0) {
            System.out.println("El número "+ randomNumber2+ " no es double.");
        } else {
            System.out.println("El número "+ randomNumber2+ " es un double");
        }

    }
}