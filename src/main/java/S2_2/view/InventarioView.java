package S2_2.view;
import S2_2.model.Producto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InventarioView extends JFrame {
    public JTextField txtNombre = new JTextField();
    public JTextField TxtPrecio = new JTextField();
    public JTextField txtStock = new JTextField();

    public JButton btnAgregar = new JButton("Agregar");
    public JButton btnActualizar = new JButton("Actualizar");
    public JButton btnEliminar = new JButton("Eliminar");
    public JButton btnCopiar = new JButton("Copiar");

    public DefaultTableModel modeloTabla = new DefaultTableModel(new String[]{"Nombre", "Precio", "Stock"},10);

    public JTable Tabla = new JTable(modeloTabla);

    public InventarioView() {
        setTitle("Inventario de Productos");
        setSize(600, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel datos =new JPanel(new GridLayout(3,2));

        datos.add(new JLabel("Nombre"));
        datos.add(txtNombre);

        datos.add(new JLabel("Precio"));
        datos.add(TxtPrecio);

        datos.add(new JLabel("Stock"));
        datos.add(txtStock);

        JPanel botones= new JPanel();

        botones.add(btnAgregar);
        botones.add(btnActualizar);
        botones.add(btnEliminar);
        botones.add(btnCopiar);

        add(datos,BorderLayout.NORTH);
        add(new JScrollPane(Tabla),BorderLayout.CENTER);
        add(botones,BorderLayout.SOUTH);

    }


}
