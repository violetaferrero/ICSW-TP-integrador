public class Paquete {
    private String id;
    private String estado; // "DESPACHADO" (WMS) -> "EN_TRANSITO" -> "ENTREGADO" (TMS)

    public Paquete(String id) {
        this.id = id;
        this.estado = "DESPACHADO";
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getInfo() {
        return "Paquete " + id + " - Estado: " + estado;
    }
}