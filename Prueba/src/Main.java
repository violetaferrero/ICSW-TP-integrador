
    public static void main(String[] args) {
        // Objeto 1: Salida del WMS (Depósito)
        Paquete p1 = new Paquete("PAQ-001");
        System.out.println("WMS: " + p1.getInfo());

        // Objeto 2: Seguimiento en TMS (Transporte)[cite: 1]
        p1.setEstado("EN_TRANSITO");
        System.out.println("TMS: " + p1.getInfo());
    }
