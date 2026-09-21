public class Paquete {
    private String id;
    private String estado;
    private String destino;
    private String numeroTracking; // <--- Modificación para el Release 1

    public Paquete(String id, String destino, String numeroTracking) {
        this.id = id;
        this.destino = destino;
        this.numeroTracking = numeroTracking;
        this.estado = "DESPACHADO";
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getInfo() {
        return "Paquete " + id + " [TRK: " + numeroTracking + "] a " + destino + " - Estado: " + estado;
    }
}