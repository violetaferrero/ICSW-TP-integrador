public class Main {
    public static void main(String[] args) {
       // Objeto 1: Salida del WMS con destino
        Paquete p1 = new Paquete("PAQ-001", "Santa Fe");
        System.out.println("WMS: " + p1.getInfo());

        // Objeto 2: Seguimiento en TMS
        p1.setEstado("EN_TRANSITO");
        System.out.println("TMS: " + p1.getInfo());
    }
    
}