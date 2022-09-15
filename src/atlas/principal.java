//Arreglar las mayusculas en el validador de codigo deportivo
package atlas;

import atlas.MTO.Cliente;
import atlas.MTO.ClubesDeportivos;




public class principal {
    public static void main(String[] args) {
        
        
       int contador = 990;
       ClubesDeportivos Clu1 = new ClubesDeportivos();
       Clu1.setNombreClub("Hanball");
        System.out.println(Clu1.getNombreClub());
       Clu1.setId("HaH12", Clu1.getNombreClub());
        System.out.println(Clu1.getId());
        Clu1.setValorSuscripcion(10000);
        System.out.println(Clu1.FormateadorDeValores(Clu1.getValorSuscripcion()));
        
        
        Cliente Cli1 = new Cliente();
        Cli1.setEmail("wbriones@gmail.com");
        System.out.println(Cli1.getEmail());
        Cli1.setTelefono("56813132");
        System.out.println(Cli1.getTelefono());
        Cli1.setRut(20811954,'k');
        System.out.println(Cli1.getRut()+"-"+Cli1.getDv());
        Cli1.setId(contador=contador+10);
        System.out.println(Cli1.getId());
        System.out.println("#############################");
        
        Cli1.setNombreUsuario("sdsd");
        System.out.println(Cli1.getNombreUsuario());
        Cli1.setContraseña("Holaaa");
        System.out.println(Cli1.getContraseña());
        Cli1.loginUsuario(Cli1.getNombreUsuario(), Cli1.getContraseña());
        System.out.println("#############################");
        Cli1.cambioDeContrasena("coGtsda");
        System.out.println(Cli1.getContraseña());
        System.out.println("#############################");
        Clu1.cambioNombreClub("Futball", Clu1.getId());
        System.out.println("#############################");
    }   
    
    
}
