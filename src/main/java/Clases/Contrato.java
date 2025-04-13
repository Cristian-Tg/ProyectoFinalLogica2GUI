
package Clases;

import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class Contrato {
    private String codigo;
    private Cliente cliente;
    private float valorMensual;
    private Date fechaPrestacion;
    private int duracion;
    private Servicio servicio;

    private static HashMap<String, Integer> valorxConcepto = new HashMap<>() {{
        put("Guarda de seguridad", 920000);
        put("Supervisor", 1150000);
        put("Unidad canina", 250000);
        put("Camara", 50000);
        put("24-7", 2000000);
        put("12", 1050000);
        put("8", 800000);
    }};
    
    private static HashMap<String, HashMap<String, Float>> valorxSector = new HashMap<>() {{
        put("Residencial", new HashMap() {{
            put("8-10",(float)0.15);
        }});
        put("Industrial", new HashMap() {{
            put("6-9",(float)0.22);
        }});
        put("Hospitalario", new HashMap() {{
            put("5-10",(float)0.08);
        }});
        put("Publico", new HashMap() {{
            put("1-4",(float)0.1);
        }});
        put("Bancario", new HashMap() {{
            put("1-4",(float)0.6);
            put("5-7",(float)0.45);
        }});
    }};

    public Contrato(String codigo, Cliente cliente, Date fechaPrestacion, int duracion, Servicio servicio) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.fechaPrestacion = fechaPrestacion;
        this.duracion = duracion;
        this.servicio = servicio;
        this.setValorMensual();
        
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getValorMensual() {
        return valorMensual;
    }

    public void setValorMensual() {
        int valor = 0;
        switch (this.getTipoDeServicio()) {
            case "Servicio Basico":
                ServicioBasico sb = (ServicioBasico) this.servicio;
                valor += sb.getCantidadGuardias() * valorxConcepto.get("Guarda de seguridad");
                valor += sb.getCantidadSupervisores() * valorxConcepto.get("Supervisor");
                break;
            case "Servicio Avanzado":
                ServicioAvanzado sa = (ServicioAvanzado) this.servicio;
                valor += sa.getCantidadGuardias() * valorxConcepto.get("Guarda de seguridad");
                valor += sa.getCantidadSupervisores() * valorxConcepto.get("Supervisor");
                valor += sa.getNumElementosCaninos() * valorxConcepto.get("Unidad canina");
                break;
            case "Monitoreo":
                Monitoreo sm = (Monitoreo) this.servicio;
                valor += sm.getNumCamaras() * valorxConcepto.get("Camara");
                valor += valorxConcepto.get(sm.getTipo());
                break;
            default:
                throw new AssertionError();
        }
        valor *= (1 + this.getSobrecargo());
        this.valorMensual = valor;
    }
    
    private float getSobrecargo() {
        float sobrecargo = 0;
        HashMap<String,Float> sector = valorxSector.get(this.cliente.getSector());
        Set<String> rangos = sector.keySet();
        Iterator iterator = rangos.iterator();
        while(iterator.hasNext()) {
            String rango = iterator.next().toString();
            int inferior = Integer.parseInt(rango.split("-")[0]);
            int superior = Integer.parseInt(rango.split("-")[1]);
            if (this.cliente.getCalificacion() >= inferior && this.cliente.getCalificacion() <= superior){
                sobrecargo = sector.get(rango);
            }
        }
        return sobrecargo;
    }
    
    public Date getFechaPrestacion() {
        return fechaPrestacion;
    }

    public void setFechaPrestacion(Date fechaPrestacion) {
        this.fechaPrestacion = fechaPrestacion;
    }
    
    public String getTipoDeServicio() {
        if (this.servicio instanceof ServicioBasico) {
            return "Servicio Basico";
        } else if (this.servicio instanceof ServicioAvanzado) {
            return "Servicio Avanzado";
        } else {
            return "Monitoreo";
        }
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public Servicio getServicio() {
        return servicio;
    }
    
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    
    public void crearOtroSi(Servicio servicio, int duracion){
        this.servicio = servicio;
        this.duracion = duracion;
        setValorMensual();
    }
    
}
