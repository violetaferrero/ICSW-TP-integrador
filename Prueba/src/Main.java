public class Main {
    public static void main(String[] args) {
        // Objeto con tracking para el Release 1
        Paquete p1 = new Paquete("PAQ-001", "Santa Fe", "TRK-998877");
        System.out.println("WMS: " + p1.getInfo());

        p1.setEstado("EN_TRANSITO");
        System.out.println("TMS: " + p1.getInfo());
    }
}