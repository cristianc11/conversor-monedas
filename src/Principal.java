import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("""
                    *****************************************
                    Bienvenid@ al conversor de monedas :)
                    
                    Intercambios disponibles
                    1) Dolar >>> Peso Argentino
                    2) Peso Argentino >>> Dolar
                    3) Dolar >>> Real Brasileño
                    4) Real Brasileño >>> Dolar
                    5) Dolar >>> Peso Colombiano
                    6) Peso Colombiano >>> Dolar
                    7) Salir
                    
                    *****************************************
                    """);
            System.out.println("Ingresa la accion que deseas realizar: ");
            int opc = Integer.parseInt(sc.nextLine());

            if (opc >= 1 && opc <= 6){
                System.out.println("Ingresa el valor a intercambiar");
                double intercambio = Double.parseDouble(sc.nextLine());
                IntercambioMoneda inter = new IntercambioMoneda();
                System.out.println(inter.setOpcionIntercambio(opc, intercambio));
            }else if (opc == 7){
                System.out.println("Gracias por usar el conversor :)");
                break;
            }else {
                System.out.println("Ingresa una opcion valida");
            }
        }
    }
}
