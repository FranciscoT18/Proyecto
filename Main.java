import java.util.Date;
public class Main {
    public static void main(String[] args){
    
        Pedidos pedidos = new Pedidos(1, new Date(), 50, "En camino", "Entregado", "Sauses 8", "Todos");

        pedidos.Solicitar();

        pedidos.cancelarPedido();

        Panaderia panaderia = new Panaderia(23 , "Dulzura", "domingo comin entre garcia agollena y la 24 va", "https://dulzura206.cms.webnode.ec/", "0986030552", "Francisco de orellana y Urdesa", "Panaderia_dulzura");
    
        panaderia.agregarNombre();

        panaderia.agregarTelefono();

        Clientes clientes = new Clientes(1, "Rivado", "Samanes", "0985678324", "rnuques.es@tecnologicoargos.edu.ec", 19, 1);

        clientes.agregarPedido();

        clientes.actualizarDatos();

    }
}