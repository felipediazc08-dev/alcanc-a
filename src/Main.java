import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);


        int m1;
        int m20 = 0, m50 = 0, m100 = 0, m200 = 0, m500 = 0, m1000 = 0;
        int opcion,total=0,meta;
        do{
        System.out.println("""
                Alcnacía
                Seleccione un numero para realizar la opcion que quiera
                1.Ahorrar
                2 Contador de monedas
                3 Valor acumulado
                4 Total del dinero
                5 Meta de ahorro
                6 finalizar accion6
                :
                """);
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("""
                        Ingrese la denominacion de la monedas de las que se observan a continuacion
                        1.20
                        2.50
                        3.100
                        4.200
                        5.500
                        6.1000
                        """);
                m1 = teclado.nextInt();
                switch (m1) {
                    case 1:
                        System.out.println("A ingresado una moneda de 20");
                        m20 += 1;
                        break;
                    case 2:
                        System.out.println("A ingresado una moneda de 50");
                        m50 += 1;
                        break;
                    case 3:
                        System.out.println("A ingresado una moneda de 100");
                        m100 += 1;
                        break;
                    case 4:
                        System.out.println("A ingresado una moneda de 200");
                        m200 += 1;
                        break;
                    case 5:
                        System.out.println("A ingresado una moneda de 500");
                        m500 += 1;
                        break;
                    case 6:
                        System.out.println("A ingresado una moneda de 1000");
                        m1000 += 1;
                        break;
                    default:
                        System.out.println("opcion no valida");

                }

                case 2:
                System.out.println("la cantidad de monedas contadas es:");
                System.out.println("denominacion de 20: "+m20);
                System.out.println("denominacion de 50: "+m50);
                System.out.println("denominacion de 100: "+m100);
                System.out.println("denominacion de 200: "+m200);
                System.out.println("denominacion de 500: "+m500);
                System.out.println("denominacion de 1000: "+m1000);
                System.out.println(" ");
                break;
            case 3:
                System.out.println("el valor acumulado de cada denominacion es:");
                System.out.println("20 : "+(m20*20));
                System.out.println("50 : "+(m50*50));
                System.out.println("100 : "+(m100*100));
                System.out.println("200 : "+(m200*200));
                System.out.println("500 : "+(m500*500));
                System.out.println("1000 : "+(m1000*1000));
                System.out.println(" ");
                break;
            case 4:
                total=(m20*20)+(m50*50)+(m100*100)+(m200*200)+(m500*500)+(m1000*1000);
                System.out.println("su valor total es de: "+total);
                System.out.println(" ");
                break;
            case 5:
                System.out.println("Ingrese su meta de ahorro: ");
                meta = teclado.nextInt();
                if(total>=meta){
                    System.out.println("Has alacanzado tu meta felicidades");
            }else{
                    System.out.println("No has alcanzado su meta de ahorro sigue ahorrando");
                }
                break;
            case 6:
                System.out.println("opcion finalizada");

            default:
                System.out.println("no se puede realizar la accion");
        }

        }while (opcion!=6);

    }
}