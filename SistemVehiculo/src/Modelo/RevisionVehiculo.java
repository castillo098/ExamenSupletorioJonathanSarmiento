package Modelo;

public class RevisionVehiculo {

    String placa, fecha, descripcion;

    public RevisionVehiculo() {
    }

    public RevisionVehiculo(String placa, String fecha, String descripcion) {
        this.placa = placa;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
