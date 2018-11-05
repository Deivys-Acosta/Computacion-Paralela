/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendainterfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Panel para las opciones.
 */
@SuppressWarnings("serial")
public class PanelOpciones extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Comando para mostrar el producto más vendido.
     */
    private static final String MAS_VENDIDO = "MasVendido";

    /**
     * Comando para mostrar el producto menos vendido.
     */
    private static final String MENOS_VENDIDO = "MenosVendido";

    /**
     * Comando para mostrar el promedio de ventas.
     */
    private static final String PROMEDIO_VENTAS = "PromedioVentas";

    /**
     * Comando para mostrar el dinero en caja.
     */
    private static final String DINERO_CAJA = "DineroCaja";

    /**
     * Comando Opción 1.
     */
    private static final String OPCION_1 = "OPCION_1";

    /**
     * Comando Opción 2.
     */
    private static final String OPCION_2 = "OPCION_2";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal de la aplicación.
     */
    private InterfazTienda principal;

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Botón para mostrar el más vendido.
     */
    private JButton btnMasVendido;

    /**
     * Botón para mostrar el menos vendido.
     */
    private JButton btnMenosVendido;

    /**
     * Botón para mostrar el promedio de ventas.
     */
    private JButton btnPromedioVentas;

    /**
     * Botón para ventas en volumen.
     */
    private JButton btnDineroCaja;

    /**
     * Botón Opción 1.
     */
    private JButton btnOpcion1;

    /**
     * Botón Opción 2.
     */
    private JButton btnOpcion2;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel.
     * @param pPrincipal Ventana principal. pPrincipal != null.
     */
    public PanelOpciones( InterfazTienda pPrincipal )
    {
        principal = pPrincipal;

        setBorder( new TitledBorder( "Opciones" ) );
        setLayout( new GridLayout( 2, 3 ) );

        btnMasVendido = new JButton( "Producto más vendido" );
        btnMasVendido.setActionCommand( MAS_VENDIDO );
        btnMasVendido.addActionListener( this );
        add( btnMasVendido );

        btnMenosVendido = new JButton( "Producto menos vendido" );
        btnMenosVendido.setActionCommand( MENOS_VENDIDO );
        btnMenosVendido.addActionListener( this );
        add( btnMenosVendido );

        btnPromedioVentas = new JButton( "Promedio ventas" );
        btnPromedioVentas.setActionCommand( PROMEDIO_VENTAS );
        btnPromedioVentas.addActionListener( this );
        add( btnPromedioVentas );

        btnDineroCaja = new JButton( "Dinero en caja" );
        btnDineroCaja.setActionCommand( DINERO_CAJA );
        btnDineroCaja.addActionListener( this );
        add( btnDineroCaja );

        btnOpcion1 = new JButton( "Opción 1" );
        btnOpcion1.setActionCommand( OPCION_1 );
        btnOpcion1.addActionListener( this );
        add( btnOpcion1 );

        btnOpcion2 = new JButton( "Opción 2" );
        btnOpcion2.setActionCommand( OPCION_2 );
        btnOpcion2.addActionListener( this );
        add( btnOpcion2 );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Manejo de los eventos de los botones.
     * @param pEvento Acción que generó el evento.
     */
    public void actionPerformed( ActionEvent pEvento )
    {
        String comando = pEvento.getActionCommand( );
        if( comando.equals( MAS_VENDIDO ) )
        {
            principal.mostrarMasVendido( );
        }
        else if( comando.equals( MENOS_VENDIDO ) )
        {
            principal.mostrarMenosVendido( );
        }
        else if( comando.equals( DINERO_CAJA ) )
        {
            principal.mostrarDineroEnCaja( );
        }
        else if( comando.equals( PROMEDIO_VENTAS ) )
        {
            principal.mostrarPromedioVentas( );
        }
        else if( comando.equals( OPCION_1 ) )
        {
            principal.reqFuncOpcion1( );
        }
        else if( comando.equals( OPCION_2 ) )
        {
            principal.reqFuncOpcion2( );
        }
    }

}
