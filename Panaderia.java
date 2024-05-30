public class Panaderia {
    //Atributos
    
    private int idPanaderia;

    private String nombre;

    private String direccion;

    private String correo;
    
    private String telefono;

    private String sucursales;

    private String redessociales;
    
    //Métodos

    public void solicitarDirección(){
        System.out.println("Solicitar la direccion de la panaderia" + this.direccion);
    }

    public void agregarCorreo(){
        System.out.println("Agregar el correo de la panaderia" + this.correo);
    }

    public void agregarNombre(){
        System.out.println("Agregar el nombre de la panaderia");
    }

    public void agregarTelefono(){
        System.out.println("Agregar telefono");
    }

    //Getter y setter

    public int getteridPedidos(){
        return idPanaderia;
    }

    public void setteridPedidos(int idPanaderia){
        this.idPanaderia = idPanaderia;
    }

    public String getterNombre(){
        return nombre;
    }

    public void setterNombre(String nombre){
        this.nombre = nombre;
    }

    public String getterDirección(String dirección){
        return dirección;
    }

    public void setterCorreo(String correo){
        this.correo = correo;
    }

    public String getterTelefono(){
        return telefono;
    }

    public void setterTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getSucursales() {
        return sucursales;
    }

    public void setSucursales(String sucursales) {
        this.sucursales = sucursales;
    }

    public String getRedessociales() {
        return redessociales;
    }

    public void setRedessociales(String redessociales) {
        this.redessociales = redessociales;
    }

    //Constructor
    
    public Panaderia(int idPanaderia, String nombre, String dirección, String telefono, String correo){
        this.idPanaderia = idPanaderia;
        this.nombre = nombre;
        this.direccion= dirección;
        this.telefono = telefono;
        this.correo = correo;
    }
}
