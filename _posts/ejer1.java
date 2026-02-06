public class ejer1 {
    public String piedraPapelTijera(String jugador1, String jugador2) {

        String devuelve;

        if (jugador1.equals(jugador2)) {
            devuelve = "Empate";
        } else {
            devuelve = "jugador2";
            switch (jugador1) {
                case "piedra" -> {
                    if (jugador2.equals("tijera")) {
                        devuelve = "jugador1";
                    }
                }
                case "papel" -> {
                    if (jugador2.equals("piedra")) {
                        devuelve = "jugador2";
                    }
                }
                case "tijera" -> {
                    if (jugador2.equals("papel")) {
                        devuelve = "jugador1";
                    }
                }
                default -> {
                }
            }
        }
        return devuelve;
    }

    public static void main(String[] args) {
        ejer1 juego = new ejer1();
        String resultado = juego.piedraPapelTijera("piedra", "tijera");
        System.out.println("El ganador es: " + resultado);
    }
}
