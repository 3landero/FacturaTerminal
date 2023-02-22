package org.rlandero.appfacturas;
import org.rlandero.appfacturas.domain.*;


import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setRfc("PACL840513EG1");
        cliente.setNombre("Luciano");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la descripcion de la factura: ");
        String descripcion = scanner.nextLine();
        Factura factura = new Factura(descripcion, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for (int i = 0; i <5; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto num : " + producto.getCodigo() + ": ");
            nombre = scanner.next();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio del producto : ");
            precio = scanner.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese las unidades del producto : ");
            cantidad = scanner.nextInt();
            ItemFactura item = new ItemFactura(cantidad,producto);
            factura.addItemFactura(item);

            System.out.println();



        }
        System.out.println(factura.generarDetalle());
        System.out.println("----------------");
    }
}
