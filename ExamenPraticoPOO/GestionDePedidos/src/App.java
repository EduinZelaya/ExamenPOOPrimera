import Pedidos.Pedido;
import Productos.ProductoElectonico;
import Productos.Productos;

public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido1 =new Pedido();
        ProductoElectonico producto1=new ProductoElectonico("Celular", 2000, 10, 20);
        ProductoElectonico producto2=new ProductoElectonico("Celular", 2000, 8, 20);
        //Pedido pedido2 =new Pedido();
        pedido1.agregar_producto(producto1, 2);
        pedido1.agregar_producto(producto2, 6);
        pedido1.calcular_total();
    }

}
