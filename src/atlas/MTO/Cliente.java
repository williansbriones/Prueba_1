
package atlas.MTO;
import java.text.SimpleDateFormat;
import java.util.Date;
//plataforma, deben estar identificados por su ID, nombre completo, rut, digito verificador, 
//fecha de nacimiento, teléfono, email, nombre de usuario y contraseña.
public class Cliente {
    private int Id;
    private String NombreCompleto;
    private int Rut;
    private String Dv;
    private Date FechaNacimiento;
    private String Telefono;
    private String email;
    private String NombreUsuario;
    private String Contraseña;

    public Cliente(int Id, String NombreCompleto, int Rut, String Dv, Date FechaNacimiento, String Telefono, String email, String NombreUsuario, String Contraseña) {
        this.Id = Id;
        this.NombreCompleto = NombreCompleto;
        this.Rut = Rut;
        this.Dv = Dv;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
        this.email = email;
        this.NombreUsuario = NombreUsuario;
        this.Contraseña = Contraseña;
    }
    
    public Cliente() {
        this.Id = 0;
        this.NombreCompleto = "";
        this.Rut = 0;
        this.Dv = "";
        this.FechaNacimiento = new Date();
        this.Telefono = "";
        this.email = "";
        this.NombreUsuario = "";
        this.Contraseña = "";
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut, char Dv) {
        if(validarRut(Rut, Dv)){
            this.Rut = Rut;
            this.Dv = Dv+"";
        }else{
            System.out.println("No existe este Rut");
        }
    }

    public String getDv() {
         
            return Dv;
        
    }

    public void setDv(int Rut, char Dv) {
        if(validarRut(Rut, Dv)){
            this.Dv = Dv+"";
        }else{
            System.out.println("aaa");
        }
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        if (Telefono.length()>=8 && Telefono.subSequence(0,2).equals("56")){
            this.Telefono = Telefono;
        }else{
            System.out.println("Numero mal ingresado");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if((email.length() > 5 && email.contains("@")) && (email.contains(".com") || email.contains(".cl") ) ){
            this.email = email;
        }else{
            System.out.println("Correo invalido");
        }
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        if (NombreUsuario.length()>=4){
            this.NombreUsuario = NombreUsuario;
        }else{
            System.out.println("Nombre muy corto");
        }
    }   

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        if(validadorDeContraseña(Contraseña)){
            this.Contraseña = Contraseña;
        }else{
            System.out.println("Contraseña incorrecta");
        }
    }
    
    public boolean validadorDeContraseña(String Contraseña){
        boolean ContraseñaValida = false;
        char clave;
        byte   contLetraMay = 0, contLetraMin=0;
        for (byte i = 0; i < Contraseña.length(); i++) {
                clave = Contraseña.charAt(i);
               String passValue = String.valueOf(clave);
                if (passValue.matches("[A-Z]")) {
                    contLetraMay++;
                } else if (passValue.matches("[a-z]")) {
                    contLetraMin++;
                }
             }
        if(contLetraMay>=1&&contLetraMin>=1&&Contraseña.length()>=6){
            ContraseñaValida= true;
        }
        return ContraseñaValida;
    }
    
     public boolean validarRut(int Rut, char Dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; Rut != 0; Rut /= 10) {
                s = (s + Rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (Dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

     
     public void loginUsuario (String NombreUsuario, String Contraseña){
        if (validadorDeContraseña(Contraseña) && NombreUsuario.length()>=4){
             System.out.println("Usuario creado correctamente");
        }else{ System.out.println("Usuario mal Creado");
        }
        }
     public boolean cambioDeContrasena(String Contraseña){
         boolean validador = false;
         if (validadorDeContraseña(Contraseña)){
             System.out.println("Contraseña cambiada Correctamente");
             validador= true;
             setContraseña(Contraseña);
         }else{
             System.out.println("Contraseña No cumple parametros");
         }
         
         
         return validador;
     }

    public void setFechaNacimiento(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
}
