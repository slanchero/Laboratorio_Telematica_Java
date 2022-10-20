package telematica;

import java.math.BigInteger;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.arrays.ArrayData;

public class Telematica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int o;
        do {
            System.out.println("Ingrese un numero entre 1 y 5 dependiendo de la operaion que desea realizar");
            System.out.println("Que operacion desea realizar\n1.Numeros primos dentro de un rango.\n2.Numero de ____ en un texto plano.\n3.cifrado de datos.\n4.descifrado de dato.\n5.Factorial de un numero entero");
            o = sc.nextInt();
        } while (o < 1 || o > 5);
        switch (o) {
            case 1:
                Primo p=new Primo();
                System.out.println("Ingrese el inicio de su rango");
                p.setLimI(BigInteger.valueOf(sc.nextLong()));
                System.out.println("Ingrese el final de su rango");
                p.setLimF(BigInteger.valueOf(sc.nextLong()));
                p.primos();
                break;
            case 2:
                String path;//="C:\\Users\\perfil.CAMPUSUNINORTE\\Desktop\\Nuevo documento de texto.txt";
                System.out.println("Ingrese La direccion donde se encuentra se archivo de texto");
                path=sc.nextLine();
                TextoPlano tp=new TextoPlano(path);
                tp.conteoDeCaracteres();
                break;
            case 3:
                
                break;
            case 4:

                break;
            case 5:

                break;
        }
    }
}
