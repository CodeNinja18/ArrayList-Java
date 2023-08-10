package ArrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Lista_Nombre {
    ArrayList<String> lista_nombre = new ArrayList<>();

    public void getMenu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "BIENVENIDO\n1. Agregar trabajador\n2. Actualizar trabajador\n3. Eliminar trabajador\n4. Ver lista de trabajadores\n5. Salir"));
            getOpciones(opcion);
        } while (opcion != 5);
    }

    public void getOpciones(int opcion) {
        switch (opcion) {
            case 1:
                getAgregar();
                break;
            case 2:
                getActualizar();
                break;
            case 3:
                getEliminar();
                break;
            case 4:
                getLeer();
                break;
            case 5:
                getSalir();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida ");
                break;
        }
    }

    public void getSalir() {
        JOptionPane.showMessageDialog(null, "Ustd. Salio del sistema ");
    }

    public void getAgregar() {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del trabajador: ");
        lista_nombre.add(nombre);
        JOptionPane.showMessageDialog(null, "El trabajador ha sido agregado ");
    }

    public void getActualizar() {
        String nombre = "";
        String actu_nombre = "";
        int indice = 0;
        nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del trabajador: ");

        if (lista_nombre.contains(nombre)) {
            actu_nombre = JOptionPane.showInputDialog(null, "Ingrese nombre nuevo del trabajador: ");
            indice = lista_nombre.indexOf(nombre);
            lista_nombre.set(indice, actu_nombre);
            JOptionPane.showMessageDialog(null, "Se actualizo el nombre ");
        } else {
            JOptionPane.showMessageDialog(null, "El nombre no existe en la lista ");
        }

    }

    public void getLeer() {
        String texto = "";
        String mensaje = "Lista de Trabajadores\n";
        if (lista_nombre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista esta vacia ");
        } else {
            for (int i = 0; i < lista_nombre.size(); i++) {
                texto += "ID Trabajador " + (i) + ": " + lista_nombre.get(i) + "\n";
            }
        }
        if (lista_nombre.isEmpty()) {

        } else {
            JOptionPane.showMessageDialog(null, mensaje + texto);
        }

    }

    public void getEliminar() {
        String nombre = "";
        int id = 0;
        String mensaje = "";
        nombre = JOptionPane.showInputDialog(null, "Ingrese nombre del trabajador ha eliminar: ");

        if (lista_nombre.contains(nombre)) {
            id = lista_nombre.indexOf(nombre);
            lista_nombre.remove(id);
            mensaje = "El trabajador ha sido eliminado ";
        } else {
            mensaje = "El nombre no existe en la lista ";
        }
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
