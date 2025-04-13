
package Clases;


public class Factura {
    private String Cliente;
    private float valorPago;
    private int mesSeleccionado;
    private String contrato;

    public Factura(String Cliente, float valorPago, int MesSeleccionado, String contrato) {
        this.Cliente = Cliente;
        this.valorPago = valorPago;
        this.mesSeleccionado = MesSeleccionado;
        this.contrato = contrato;
    }
    
    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }

    public int getMesSeleccionado() {
        return mesSeleccionado + 1;
    }

    public void setMesSeleccionado(int MesSeleccionado) {
        this.mesSeleccionado = MesSeleccionado;
    }
    
    public String getContrato() {
        return contrato;
    }
    
     public void setContrato(String contrato) {
        this.contrato = contrato;
    }
     
}
