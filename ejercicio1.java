import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
   
        int contador = 0;
        int contadorMaquina  =0;
        while (true) {
            System.out.println("¿piedra, papel, tijera? o salir");
            String eleccion = scanner.nextLine().toLowerCase();
            if(eleccion.equals("salir")){
                break;
            }
                int num = (int) (Math.random() * 3) + 1;
                        String versus;
            
                        switch (num) {
                            case 1:
                                versus = "piedra";
                                break;
                            case 2:
                                versus = "papel";
                                break;
                            default:
                                versus = "tijeras";
                                break;
                        }
            
                        System.out.println("La máquina eligió: " + versus);
            
                        if (eleccion.equals(versus)) {
                            System.out.println("¡Empate!");
                        } else if ((eleccion.equals("piedra") && versus.equals("tijeras")) ||
                                   (eleccion.equals("papel") && versus.equals("piedra")) ||
                                   (eleccion.equals("tijeras") && versus.equals("papel"))) {
                            contador++;
                            System.out.println("¡Ganaste esta ronda! Tu puntaje: " + contador);
                        } else {
                            contadorMaquina++;
                            System.out.println("¡La máquina ganó esta ronda! Puntaje de la máquina: " + contadorMaquina);
                        }
                    }
                    
                    System.out.println("¡Gracias por jugar!");
                    scanner.close();
        }
   
   
    }


