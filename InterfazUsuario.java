
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//JFrame sirve como el contenedor principal de una aplicación gráfica, es decir, la ventana que se muestra al usuario.
public class InterfazUsuario extends JFrame {
    
    // Constructor principal
    public InterfazUsuario() {
        setTitle("Sistema de Ventas");
        setSize(1200, 800);
        //Este método especifica qué acción se debe realizar cuando se presiona el botón de cerrar (la "X") de la ventana.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel de navegación lateral
        JPanel panelNavegacion = new JPanel(); 
        //setLayout: Define el administrador de diseño para el panel
        //BoxLayout, que organiza los componentes en una línea, ya sea horizontal o vertical.
        panelNavegacion.setLayout(new BoxLayout(panelNavegacion, BoxLayout.Y_AXIS));
        panelNavegacion.setBackground(Color.LIGHT_GRAY);

        // Botones de navegación
        JButton btnInicio = new JButton("Inicio");
        JButton btnVentas = new JButton("Ventas");
        JButton btnInventario = new JButton("Inventario");
        JButton btnCompras = new JButton("Compras");
        JButton btnReportes = new JButton("Reportes");
        JButton btnConfiguracion = new JButton("Configuración");

        // Agregar botones al panel de navegación
        panelNavegacion.add(btnInicio);
        panelNavegacion.add(btnVentas);
        panelNavegacion.add(btnInventario);
        panelNavegacion.add(btnCompras);
        panelNavegacion.add(btnReportes);
        panelNavegacion.add(btnConfiguracion);

        // Panel principal (Para mostrar el contenido dinámico)
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new CardLayout());

        // Panel de inicio (por defecto)
        JPanel panelInicio = new JPanel();
        JLabel labelInicio = new JLabel("Bienvenido al sistema de ventas");
        panelInicio.add(labelInicio);
        panelPrincipal.add(panelInicio, "Inicio");

        // Panel de ventas
        JPanel panelVentas = new JPanel();
        JLabel labelVentas = new JLabel("Gestión de Ventas");
        panelVentas.add(labelVentas);
        panelPrincipal.add(panelVentas, "Ventas");

        // Panel de inventario
        JPanel panelInventario = new JPanel();
        JLabel labelInventario = new JLabel("Gestión de Inventario");
        panelInventario.add(labelInventario);
        panelPrincipal.add(panelInventario, "Inventario");

        // Panel de compras
        JPanel panelCompras = new JPanel();
        JLabel labelCompras = new JLabel("Gestión de Compras");
        panelCompras.add(labelCompras);
        panelPrincipal.add(panelCompras, "Compras");

        // Panel de reportes
        JPanel panelReportes = new JPanel();
        JLabel labelReportes = new JLabel("Generación de Reportes");
        panelReportes.add(labelReportes);
        panelPrincipal.add(panelReportes, "Reportes");

        // Panel de configuración
        JPanel panelConfiguracion = new JPanel();
        JLabel labelConfiguracion = new JLabel("Configuración del Sistema");
        panelConfiguracion.add(labelConfiguracion);
        panelPrincipal.add(panelConfiguracion, "Configuración");

        // Agregar funcionalidad a los botones de navegación
        btnInicio.addActionListener(e -> cambiarPanel(panelPrincipal, "Inicio"));
        btnVentas.addActionListener(e -> cambiarPanel(panelPrincipal, "Ventas"));
        btnInventario.addActionListener(e -> cambiarPanel(panelPrincipal, "Inventario"));
        btnCompras.addActionListener(e -> cambiarPanel(panelPrincipal, "Compras"));
        btnReportes.addActionListener(e -> cambiarPanel(panelPrincipal, "Reportes"));
        btnConfiguracion.addActionListener(e -> cambiarPanel(panelPrincipal, "Configuración"));

        // Agregar los paneles a la ventana principal
        add(panelNavegacion, BorderLayout.WEST);
        add(panelPrincipal, BorderLayout.CENTER);
    }

    // Método para cambiar entre los paneles
    private void cambiarPanel(JPanel panelPrincipal, String nombrePanel) {
        CardLayout layout = (CardLayout) panelPrincipal.getLayout();
        layout.show(panelPrincipal, nombrePanel);
    }

    // Método principal para ejecutar la interfaz
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InterfazUsuario ventana = new InterfazUsuario();
            ventana.setVisible(true);
        });
    }
}
    
    

