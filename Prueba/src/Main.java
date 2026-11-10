public class Main {
    public static void main(String[] args) {
        // Objeto con validación de peso incorporada
        Paquete p1 = new Paquete("PAQ-001", "Santa Fe", "TRK-998877", 4.5);
        System.out.println("WMS: " + p1.getInfo());

        p1.setEstado("EN_TRANSITO");
        System.out.println("TMS: " + p1.getInfo());
    }
}