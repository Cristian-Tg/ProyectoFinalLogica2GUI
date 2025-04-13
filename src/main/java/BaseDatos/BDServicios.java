
package BaseDatos;


import Clases.Monitoreo;
import Clases.Servicio;
import Clases.ServicioAvanzado;
import Clases.ServicioBasico;
import java.util.LinkedList;


public class BDServicios {
    BDServiciosBasicos serviciosBasicosBD;
    BDServiciosAvanzados serviciosAvanzadosBD;
    BDServiciosMonitoreo serviciosMonitoreoBD;

    public BDServicios() {
        this.serviciosBasicosBD = new BDServiciosBasicos();
        this.serviciosAvanzadosBD = new BDServiciosAvanzados();
        this.serviciosMonitoreoBD = new BDServiciosMonitoreo();
    }
    
    private LinkedList<ServicioBasico> getServiciosBasicos() {
        return this.serviciosBasicosBD.obtener();
    }
    
    private LinkedList<ServicioAvanzado> getServiciosAvanzados() {
        return this.serviciosAvanzadosBD.obtener();
    }
    
    private LinkedList<Monitoreo> getServiciosMonitoreo() {
        return this.serviciosMonitoreoBD.obtener();
    }
    
    public LinkedList<Servicio> obtener(){
        LinkedList<Servicio> servicios = new LinkedList();
        for (int i = 0; i < getServiciosBasicos().size(); i++) {
            servicios.add(getServiciosBasicos().get(i));
        }
        for (int i = 0; i < getServiciosAvanzados().size(); i++) {
            servicios.add(getServiciosAvanzados().get(i));
        }
        for (int i = 0; i < getServiciosMonitoreo().size(); i++) {
            servicios.add(getServiciosMonitoreo().get(i));
        }
        return servicios;
    }
    
    public boolean registrarServicio(Servicio servicio) {
        if (servicio instanceof ServicioBasico) {
            return serviciosBasicosBD.registrarServicio((ServicioBasico) servicio);
        } else if (servicio instanceof ServicioAvanzado) {
            return serviciosAvanzadosBD.registrarServicio((ServicioAvanzado) servicio);
        } else {
            return serviciosMonitoreoBD.registrarServicio((Monitoreo) servicio);
        }
    }
    
    // Metodo para borrar todo el contenido del archivo plano
    public boolean borrarTodo(){
        boolean sb = serviciosBasicosBD.borrarTodo();
        boolean sa = serviciosAvanzadosBD.borrarTodo();
        boolean sm = serviciosMonitoreoBD.borrarTodo();
        return sb && sa && sm;
    }
}
