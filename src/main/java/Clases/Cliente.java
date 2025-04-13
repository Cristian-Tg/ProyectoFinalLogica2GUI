package Clases;

import java.util.ArrayList;
import java.util.HashMap;

public class Cliente extends Persona {
    private String tipoCliente;
    private int calificacion;
    private String sector;
    private ArrayList<Contrato> listaContratos;

    public Cliente(String tipoCliente, int calificacion, String sector, String nombre, String identificacion) {
        super(nombre, identificacion);
        this.tipoCliente = tipoCliente;
        this.calificacion = calificacion;
        this.sector = sector;
        this.listaContratos = new ArrayList<Contrato>();
    }
    
    public ArrayList<Contrato> getListaContratos() {
        return listaContratos;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
    
    public void addContrato(Contrato contrato) {
        this.listaContratos.add(contrato);
    }

    public void eliminarContrato(Contrato contrato) {
        listaContratos.remove(contrato);
    }
    
    public HashMap<String, Float> porcentajexServicio() {
        HashMap<String, Float> porcentajes = new HashMap<>();
        int totalContratosCliente = listaContratos.size(), servicioBasico = 0, servicioAvanzado = 0, monitoreo = 0;
        
        for (Contrato contrato : listaContratos ) {
            String tipoServicio = contrato.getTipoDeServicio();
            
            switch (tipoServicio) {
                case "Servicio Basico":
                    servicioBasico ++;  
                    break;
                case "Servicio Avanzado":
                    servicioAvanzado ++;
                    break;
                case "Monitoreo":
                     monitoreo ++;
                    break;
                default:
                    
                    break;
            }
        }
        float porcentajeServicioBasico = (servicioBasico * 100) / totalContratosCliente;
        float porcentajeServicioAvanzado = (servicioAvanzado * 100) / totalContratosCliente;
        float porcentajeMonitoreo = (monitoreo * 100) / totalContratosCliente;
        
        porcentajes.put("Servicio Basico",porcentajeServicioBasico);
        porcentajes.put("Servicio Avanzado", porcentajeServicioAvanzado);
        porcentajes.put("Monitoreo", porcentajeMonitoreo);
        
        return porcentajes;
    }
    
}
