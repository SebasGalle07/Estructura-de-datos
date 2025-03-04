package puntos;

public class tres {
    public static int contarVeces(int [] arreglo, int n, int objetivo, int primero){
        if(primero >= n){
            return 0;
        }
        int suma = 0;
        if (arreglo[primero] == objetivo){
            suma = 1;
        }
        return suma + contarVeces(arreglo,n,objetivo, primero + 1);

    }

    public static void main(String[] args) {
        int  [] arreglo = {1,4,3,8,9,3};
        int objetivo = 3;
        int n = arreglo.length;
        int resultado = contarVeces(arreglo,n,objetivo,0);
        System.out.println("el número "+objetivo+" aparece "+resultado+ " veces en el arreglo");
    }

}
