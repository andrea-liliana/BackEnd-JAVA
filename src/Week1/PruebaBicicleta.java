package Week1;

public class PruebaBicicleta {

    public static void main(String[] args){
        def();
    }

    public static void def(){
        Bicicleta biciMountain = new Bicicleta();

        Bicicleta biciPista = new Bicicleta("Blanco");

        biciMountain.setColor("Negra");
        biciMountain.setPins(8);
        biciMountain.setRodada(26);
        biciMountain.setVelocidad(13.2);
        String msg = "Bicicleta de montana con estas caracteristicas: ";
        msg += "\nColor: " + biciMountain.getColor();
        msg += "\nVelocidad: " + biciMountain.getVelocidad();
        msg += "\nPins: " + biciMountain.getRodada();

        System.out.print(msg);
    }
}
