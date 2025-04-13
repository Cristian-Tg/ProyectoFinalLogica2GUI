
package Clases;


public class Estadistica {
    private float porcentajeCliente;
    private float porcentajeServicios;
    private float gananciasMes;
    private int numServicios;
    private float totalAportado;
    
    public Estadistica(float porcentajeCliente, float porcentajeServicios, float gananciasMes, int numServicios, float totalAportado) {
        this.porcentajeCliente = porcentajeCliente;
        this.porcentajeServicios = porcentajeServicios;
        this.gananciasMes = gananciasMes;
        this.numServicios = numServicios;
        this.totalAportado = totalAportado;
    }

    public float getPorcentajeCliente() {
        return porcentajeCliente;
    }

    public void setPorcentajeCliente(float porcentajeCliente) {
        this.porcentajeCliente = porcentajeCliente;
    }

    public float getPorcentajeServicios() {
        return porcentajeServicios;
    }

    public void setPorcentajeServicios(float porcentajeServicios) {
        this.porcentajeServicios = porcentajeServicios;
    }

    public float getGananciasMes() {
        return gananciasMes;
    }

    public void setGananciasMes(float gananciasMes) {
        this.gananciasMes = gananciasMes;
    }

    public int getNumServicios() {
        return numServicios;
    }

    public void setNumServicios(int numServicios) {
        this.numServicios = numServicios;
    }

    public float getTotalAportado() {
        return totalAportado;
    }

    public void setTotalAportado(float totalAportado) {
        this.totalAportado = totalAportado;
    }

}
