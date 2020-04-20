package Modelo;

public class Vehiculo {

    String placa, modelo, color, marca;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String modelo, String color, String marca) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
