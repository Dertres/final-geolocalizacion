
package proyectos.hdp;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;

public class Usuario {
    
    @Id
    private String id;
    
    private String usuario;
    private String correo;
    private String contra;
    private ArrayList<Mensaje> mensajes;
    private Posicion posicion;

    public Usuario(String usuario, String correo, String contra, ArrayList<Mensaje> mensajes, Posicion posicion) {
        this.usuario = usuario;
        this.correo = correo;
        this.contra = contra;
        this.mensajes = mensajes;
        this.posicion = posicion;
    }

    public Usuario(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Usuario() {
    }

    public Usuario(String id, String usuario, String correo, String contra, ArrayList<Mensaje> mensajes, Posicion posicion) {
        this.id = id;
        this.usuario = usuario;
        this.correo = correo;
        this.contra = contra;
        this.mensajes = mensajes;
        this.posicion = posicion;
    }
    
    
    
}
