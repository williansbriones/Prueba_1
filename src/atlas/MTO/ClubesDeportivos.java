
package atlas.MTO;

import java.text.DecimalFormat;
import java.util.Date;

/**
Nombre del Club, nombre del fundador, año de fundación, País de origen, Lema, colores y valor de su suscripción
 */
public class ClubesDeportivos {
    

    
    
    private String Id;
    private String NombreClub;
    private String NombreFundador;
    private Date AñoDeFundacion;
    private String PaisDeOrigen;
    private String Lema;
    private String colores;
    private int ValorSuscripcion;

    public ClubesDeportivos(String Id, String NombreClub, String NombreFundador, Date AñoDeFundacion, String PaisDeOrigen, String Lema, String colores, int ValorSuscripcion) {
        this.Id = Id;
        this.NombreClub = NombreClub;
        this.NombreFundador = NombreFundador;
        this.AñoDeFundacion = AñoDeFundacion;
        this.PaisDeOrigen = PaisDeOrigen;
        this.Lema = Lema;
        this.colores = colores;
        this.ValorSuscripcion = ValorSuscripcion;
    }

    public ClubesDeportivos() {
        this.Id = "";
        this.NombreClub = "";
        this.NombreFundador = "";
        this.AñoDeFundacion = new Date();
        this.PaisDeOrigen = "";
        this.Lema = "";
        this.colores = "";
        this.ValorSuscripcion = 0;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id, String NombreClub) {
        if (ValidadorDeID( Id , NombreClub)){
            this.Id = Id;
            this.NombreClub = NombreClub;
        }
        else{
            System.out.println("Codigo invalido");
        }
    }

    public String getNombreClub() {
        return NombreClub;
    }

    public void setNombreClub(String NombreClub) {
        if(ValidadorDeNombre(NombreClub)){
            
            this.NombreClub = NombreClub;
        }
    }

    public String getNombreFundador() {
        return NombreFundador;
    }

    public void setNombreFundador(String NombreFundador) {
        this.NombreFundador = NombreFundador;
    }

    public Date getAñoDeFundacion() {
        return AñoDeFundacion;
    }

    public void setAñoDeFundacion(Date AñoDeFundacion) {
        this.AñoDeFundacion = AñoDeFundacion;
    }

    public String getPaisDeOrigen() {
        return PaisDeOrigen;
    }

    public void setPaisDeOrigen(String PaisDeOrigen) {
        this.PaisDeOrigen = PaisDeOrigen;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public int getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(int ValorSuscripcion) {
        this.ValorSuscripcion = ValorSuscripcion;
    }
    
    
        public boolean ValidadorDeNombre(String NombreClub){
            boolean ValidadorNombre = false;
            if(NombreClub.length()>=3){
                
                ValidadorNombre=true;
            }
            else{
                System.out.println("Nombre no valido");
            }
            return ValidadorNombre;
    }
    
    
    
    public boolean ValidadorDeID(String Id, String NombreClub){
        boolean ValidadorId = false;
        String ValidacionDeLetra = NombreClub.substring(0,1);
        if(NombreClub.substring(0, 2).equals(Id.substring(0, 2)) && ValidacionDeLetra.equals(NombreClub.substring(0,1))){
            
            int ParteNumerica = Integer.parseInt(Id.substring(3));
            
            if(ParteNumerica>=10){
            
                ValidadorId = true;
            }
        }
        return ValidadorId;
    }
    
    public String FormateadorDeValores(int ValorSuscripcion){
        
        DecimalFormat deci = new DecimalFormat("###,###,###");
        
        String Monto=deci.format(ValorSuscripcion);
        return Monto;
    
    }
    
    
    
    public void cambioNombreClub(String NombreClub, String Id){
        if (ValidadorDeNombre(NombreClub)){
            setNombreClub(NombreClub);
            String ParteNumerica = Id.substring(3);
            String CodigoPrimeraparte=NombreClub.substring(0, 2);
            String CodigoSegundaParte=NombreClub.substring(0,1);
            String NuevoCodigo = CodigoPrimeraparte+CodigoSegundaParte+ParteNumerica;
            setId(NuevoCodigo,getNombreClub());
            
            System.out.println("Nombre de Deporte cambiado Correctamente: ");
            System.out.println(getId());
            System.out.println(getNombreClub());
        }else{
            System.out.println("Ingrese un nombre valido");
        }
        
    }
}
