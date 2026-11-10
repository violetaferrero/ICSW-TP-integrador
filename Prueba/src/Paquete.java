public class Paquete {
    private String id;
    private String estado;
    private String destino;
    private String numeroTracking;
    private double peso; // <--- Nueva funcionalidad: Atributo de peso con validación

    public Paquete(String id, String destino, String numeroTracking, double peso) {
        this.id = id;
        this.destino = destino;
        this.numeroTracking = numeroTracking;
        this.peso = peso;
        validarPeso();
        this.estado = "DESPACHADO";
    }

    private void validarPeso() {
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso del paquete debe ser mayor a 0 kg.");
        }
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getInfo() {
        return "Paquete " + id + " [TRK: " + numeroTracking + "] - Destino: " + destino + " - Peso: " + peso + "kg - Estado: " + estado;
    }
}