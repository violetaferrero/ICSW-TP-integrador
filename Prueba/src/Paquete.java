public class Paquete {
    private String id;
    private String estado;
    private String destino; // <--- Modificación chica

    public Paquete(String id, String destino) {
        this.id = id;
        this.destino = destino;
        this.estado = "DESPACHADO";
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getInfo() {
        return "Paquete " + id + " a " + destino + " - Estado: " + estado;
    }
}