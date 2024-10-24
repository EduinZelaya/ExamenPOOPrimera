package Pedidos;

import Productos.ProductoAlimenticio;
import Productos.Productos;

public class Pedido {
    private int fecha;
    private double costo=0;
    private int cantidadd=0;
    Productos [] listaProductos=new Productos[4];

    public void agregar_producto(Productos producto, int cantidad){
        if (producto instanceof ProductoAlimenticio) {
           fecha=((ProductoAlimenticio)producto).getFecha_Expiracion();
           if (fecha<23102024) {
              System.out.println("El producto esta vencido, no puede agregarce al carrito.");
           }
        }else{if (producto.getStock()<cantidad) {
                System.out.println("No hay suficientes unidades del producto que se quiere agregar");
            }else{
                    for (int index = 0; index < listaProductos.length; index++) {
                        listaProductos[index]= producto;  
                    }
                }   
        } 
        cantidadd=cantidad;  
    }

    public void calcular_total(){
        for (int i = 0; i < listaProductos.length; i++) {
            costo=costo+(listaProductos[i].getPrecio()*cantidadd);
        }
        System.out.println("Eltotal a pagar en el pedido es de: "+ costo);
    }


    
}