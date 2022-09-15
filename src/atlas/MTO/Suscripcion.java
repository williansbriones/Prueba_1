package atlas.MTO;
import java.util.Date;

/**
inicio de la suscripción, valor de la suscripción, 
equipos al que se está suscrito 
y abono total por concepto de pagos, además de un correlativo de la venta
 */
public class Suscripcion {
    
    private Date InicioSuscripcion;
    private Cliente Cliente;
    private int Total_Pagar;
    private ClubesDeportivos ClubesDeportivos;
    private String EquiposSuscritos;

    public Suscripcion() {
        this.InicioSuscripcion = new Date();
        this.Cliente = new Cliente();
        this.Total_Pagar = 0;
        this.ClubesDeportivos = new ClubesDeportivos();
        this.EquiposSuscritos = "";
    }

    public Suscripcion(Date InicioSuscripcion, Cliente Cliente, int Total_Pagar, ClubesDeportivos ClubesDeportivos, String EquiposSuscritos) {
        this.InicioSuscripcion = InicioSuscripcion;
        this.Cliente = Cliente;
        this.Total_Pagar = Total_Pagar;
        this.ClubesDeportivos = ClubesDeportivos;
        this.EquiposSuscritos = EquiposSuscritos;
    }

    public Date getInicioSuscripcion() {
        return InicioSuscripcion;
    }

    public void setInicioSuscripcion(Date InicioSuscripcion) {
        this.InicioSuscripcion = InicioSuscripcion;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public int getTotal_Pagar() {
        return Total_Pagar;
    }

    public void setTotal_Pagar(int Total_Pagar) {
        this.Total_Pagar = Total_Pagar;
    }

    public ClubesDeportivos getClubesDeportivos() {
        return ClubesDeportivos;
    }

    public void setClubesDeportivos(ClubesDeportivos ClubesDeportivos) {
        this.ClubesDeportivos = ClubesDeportivos;
    }

    public String getEquiposSuscritos() {
        return EquiposSuscritos;
    }

    public void setEquiposSuscritos(String EquiposSuscritos) {
        this.EquiposSuscritos = EquiposSuscritos;
    }
    
    
    
}
