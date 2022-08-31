public class empleado {

    public enum roles {
        administrador, operativo
    }
    private String nombre;
    private String correo;
    private String nombreEmpresa;
    private roles rol;

    public empleado(String nombre, String correo, String nombreEmpresa, roles rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.nombreEmpresa = nombreEmpresa;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public roles getRol() {
        return rol;
    }

    public void setRol(roles rol) {
        this.rol = rol;
    }


}
