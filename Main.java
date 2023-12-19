/**
 * @author David
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println("Bienvenido al juego. Introduzca su nombre de usuario ");
        s.solicitarAlias();
        System.out.println("Bien, " + s.getAlias() + "reglas:\nDebes adivinar un numero " +
                "aleatorio del 1 al 10\nDos intentos como máximo\n10 rondas");
        s.generarNumAleatorio();
        s.pedirNumero();
        s.comprobarNumero();
        s.aumentarPuntuacion();
        s.calcularNumFallos();
        s.contarRondas();
    }
}