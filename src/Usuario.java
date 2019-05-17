public class Usuario 
{
    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private String NombreDeUsuario;
    private String contraseña;
    private int adminonormal;
    private String adonor;
    
    public Usuario() {
    }

    public Usuario(int codigo, String nombre, String apellido, int edad, String NombreDeUsuario, String contraseña, int adminonormal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.NombreDeUsuario = NombreDeUsuario;
        this.contraseña = contraseña;
        this.adminonormal = adminonormal;
        setAdminonormal(adminonormal);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreDeUsuario() {
        return NombreDeUsuario;
    }

    public void setNombreDeUsuario(String NombreDeUsuario) {
        this.NombreDeUsuario = NombreDeUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getAdminonormal() {
        return adminonormal;
    }

    public void setAdminonormal(int adminonormal) {
        this.adminonormal = adminonormal;
        if(adminonormal==0){
            adonor="Administrador";
        }else{
            adonor="Usuario normal";
        }
    }
    
    public String getAdonor() {
        return adonor;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", NombreDeUsuario=" + NombreDeUsuario + ", contrase\u00f1a=" + contraseña + ", adminonormal=" + adonor + '}';
    }
    
    
}
