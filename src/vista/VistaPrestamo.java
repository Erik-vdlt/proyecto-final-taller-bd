/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexionBD.PrestamoDAO;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author erik
 */
public class VistaPrestamo extends javax.swing.JFrame {
    
    PrestamoDAO pdao = new PrestamoDAO();
    conexionBD.conexionBD co;
    
    /**
     * Creates new form VistaPrestamo
     */
    public VistaPrestamo() {
        initComponents();
    }
    
    public VistaPrestamo(conexionBD.conexionBD co){
        this.co = co;
        initComponents();
    }
    
    public ArrayList restablecerComponentes(JComponent...componentes) {
        ArrayList listaComponentes = new ArrayList();
        for (int i = 0; i < componentes.length; i++) {
            if(((JCheckBox)componentes[i]).isSelected()){
                //((JCheckBox)componentes[i]).getText();
                listaComponentes.add(((JCheckBox)componentes[i]).getText());
                
            }
	}
        
        System.out.println("vista.VistaPrestamo.restablecerComponentes() "+listaFiltro.getSelectedValuesList());
        return listaComponentes;
    }
    
    public ArrayList elegir(ArrayList lista){
        
        ArrayList listaSQL = new ArrayList();
        for (int i = 0; i < lista.size(); i++) {
            switch(String.valueOf(lista.get(i))){
                case "Libro Id":
                    //cadena = "Libro_Id";
                    listaSQL.add("Libro_Id");
                    break;
                case "Lector Id":
                    //cadena1 = "Lector_Id";
                    listaSQL.add("Lector_Id");
                    break;
                case "Fecha Prestamo":
                    //cadena2 = "fecha_prestamo";
                    listaSQL.add("fecha_prestamo");
                    break;
                case "Fecha Devolucion":
                    //cadena3 = "fecha_devolucion";
                    listaSQL.add("fecha_devolucion");
                    break;
                case "Multa":
                    //cadena4 = "Multa";
                    listaSQL.add("Multa");
                    break;
                case "Titulo":
                    //cadena4 = "Multa";
                    listaSQL.add("Titulo");
                    break;
                case "Editorial":
                    //cadena4 = "Multa";
                    listaSQL.add("Editorial");
                    break;
                case "Año":
                    //cadena4 = "Multa";
                    listaSQL.add("Year");
                    break;
                case "ISBN":
                    //cadena4 = "Multa";
                    listaSQL.add("ISBN");
                    break;
                case "Tipo Libro":
                    //cadena4 = "Multa";
                    listaSQL.add("tipo_libro");
                    break;
                case "Genero":
                    //cadena4 = "Multa";
                    listaSQL.add("Genero");
                    break;
                case "":
                    listaSQL.add("*");
                    break;
                default:
                    //cadenaDefault = "*";
                    listaSQL.add("*");
            }
            //if(!listaSQL.get(i).equals("")){
            //    cadenaSQL += String.valueOf(listaSQL.get(i));
            //}
            //System.out.println("vista.VistaPrestamo.elegir() listaSQL "+listaSQL.get(i));
            
        }
        System.out.println("vista.VistaPrestamo.elegir() "+listaSQL);
        return listaSQL;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        ck_fecha_prestamo = new javax.swing.JCheckBox();
        ck_fecha_devolucion = new javax.swing.JCheckBox();
        ch_multa = new javax.swing.JCheckBox();
        ck_libro_id_prestamo = new javax.swing.JCheckBox();
        ck_lector_id = new javax.swing.JCheckBox();
        cj_libro_id = new javax.swing.JTextField();
        cj_lector_id = new javax.swing.JTextField();
        cmb_dias_prestamo = new javax.swing.JComboBox<>();
        cmb_mes_prestamo = new javax.swing.JComboBox<>();
        cmb_year_prestamo = new javax.swing.JComboBox<>();
        cmb_dias_devolucion = new javax.swing.JComboBox<>();
        cmb_meses_devolucion = new javax.swing.JComboBox<>();
        cmb_year_devolucion = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        btn_busqueda_avanzada = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaFiltro = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_prestamo = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        ch_libro_id_libro = new javax.swing.JCheckBox();
        ck_titulo = new javax.swing.JCheckBox();
        ck_editorial = new javax.swing.JCheckBox();
        ck_year = new javax.swing.JCheckBox();
        ck_ISBN = new javax.swing.JCheckBox();
        ck_tipo_libro = new javax.swing.JCheckBox();
        ck_genero = new javax.swing.JCheckBox();
        cmb_libro_year = new javax.swing.JComboBox<>();
        cmb_tipoLibro = new javax.swing.JComboBox<>();
        cmb_genero = new javax.swing.JComboBox<>();
        cj_libro_id_libro = new javax.swing.JTextField();
        cj_titulo = new javax.swing.JTextField();
        cj_editorial = new javax.swing.JTextField();
        cj_isbn = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(133, 205, 186));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        jLabel1.setText("Prestamo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jToolBar1.setRollover(true);

        ck_fecha_prestamo.setText("Fecha Prestamo");

        ck_fecha_devolucion.setText("Fecha Devolucion");

        ch_multa.setText("Multa");

        ck_libro_id_prestamo.setText("Libro Id");

        ck_lector_id.setText("Lector Id");

        cmb_dias_prestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_mes_prestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_year_prestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_dias_devolucion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_meses_devolucion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_year_devolucion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_busqueda_avanzada.setText("Busqueda Avanzada");
        btn_busqueda_avanzada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busqueda_avanzadaActionPerformed(evt);
            }
        });

        listaFiltro.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Libro Id", "Lector Id", "Fecha Prestamo", "Fecha Devolucion", "Multa", "Titulo", "Editorial", "Año", "ISBN", "Tipo Libro", "Genero" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaFiltroMouseClicked(evt);
            }
        });
        listaFiltro.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaFiltroValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(listaFiltro);

        jLabel2.setText("Filtro de busqueda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ck_lector_id, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(ck_libro_id_prestamo)
                                    .addGap(76, 76, 76)
                                    .addComponent(cj_libro_id, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap()))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(ch_multa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cmb_dias_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(ck_fecha_prestamo)
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cmb_dias_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cj_lector_id, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(ck_fecha_devolucion)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cmb_mes_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmb_year_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cmb_meses_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmb_year_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_busqueda_avanzada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ck_libro_id_prestamo)
                    .addComponent(cj_libro_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ck_lector_id)
                    .addComponent(cj_lector_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ck_fecha_prestamo)
                    .addComponent(cmb_dias_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_mes_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_year_prestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ck_fecha_devolucion)
                    .addComponent(cmb_dias_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_meses_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_year_devolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch_multa)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_busqueda_avanzada)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        t_prestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(t_prestamo);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ch_libro_id_libro.setText("Libro Id");

        ck_titulo.setText("Titulo");

        ck_editorial.setText("Editorial");

        ck_year.setText("Año");

        ck_ISBN.setText("ISBN");

        ck_tipo_libro.setText("Tipo Libro");

        ck_genero.setText("Genero");

        cmb_libro_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_tipoLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmb_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ck_titulo)
                            .addComponent(ch_libro_id_libro)
                            .addComponent(ck_editorial))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cj_editorial)
                            .addComponent(cj_titulo)
                            .addComponent(cj_libro_id_libro)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ck_year)
                            .addComponent(ck_tipo_libro)
                            .addComponent(ck_genero)
                            .addComponent(ck_ISBN))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cj_isbn)
                            .addComponent(cmb_genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_tipoLibro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_libro_year, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 210, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ch_libro_id_libro)
                    .addComponent(cj_libro_id_libro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ck_titulo)
                    .addComponent(cj_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ck_editorial)
                    .addComponent(cj_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ck_year)
                    .addComponent(cmb_libro_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ck_ISBN)
                    .addComponent(cj_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ck_tipo_libro)
                    .addComponent(cmb_tipoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ck_genero)
                    .addComponent(cmb_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_busqueda_avanzadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busqueda_avanzadaActionPerformed
        // TODO add your handling code here:
        /*elegir(restablecerComponentes(ch_libro_id_libro,ch_multa,ck_ISBN,ck_editorial,ck_fecha_devolucion,ck_fecha_prestamo
        ,ck_tipo_libro,ck_titulo,ck_year,ck_genero,ck_lector_id,ck_libro_id_prestamo));
        filtroLista(listaFiltro);*/
        pdao.busquedaAvanzada(elegir(restablecerComponentes(ch_libro_id_libro,ch_multa,ck_ISBN,ck_editorial,ck_fecha_devolucion,ck_fecha_prestamo
        ,ck_tipo_libro,ck_titulo,ck_year,ck_genero,ck_lector_id,ck_libro_id_prestamo)), filtroLista(listaFiltro),co,t_prestamo);
    }//GEN-LAST:event_btn_busqueda_avanzadaActionPerformed

    private void listaFiltroValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaFiltroValueChanged
        // TODO add your handling code here:
        if(listaFiltro.getSelectedValuesList().size() >= 3 ){
                listaFiltro.clearSelection();
        }
    }//GEN-LAST:event_listaFiltroValueChanged

    private void listaFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaFiltroMouseClicked
        // TODO add your handling code here:
        /*if(listaFiltro.getSelectedValuesList().size() > 3 ){
                listaFiltro.clearSelection();
        }*/
    }//GEN-LAST:event_listaFiltroMouseClicked

    public ArrayList filtroLista(JList lista){
        ArrayList listaFiltros = new ArrayList();
        //lista.getSelectedValuesList().size();
        for (int i = 0; i < lista.getSelectedValuesList().size(); i++) {
            switch(String.valueOf(lista.getSelectedValuesList().get(i))){
                case "Libro Id":
                    listaFiltros.add("libro_id = "+cj_libro_id.getText());
                    break;
                case "Lector Id":
                    //cadena1 = "Lector_Id";
                    listaFiltros.add("Lector_Id = "+cj_lector_id.getText());
                    break;
                case "Fecha Prestamo":
                    //cadena2 = "fecha_prestamo";
                    listaFiltros.add("fecha_prestamo");
                    break;
                case "Fecha Devolucion":
                    //cadena3 = "fecha_devolucion";
                    listaFiltros.add("fecha_devolucion");
                    break;
                case "Multa":
                    //cadena4 = "Multa";
                    listaFiltros.add("Multa");
                    break;
                case "Titulo":
                    //cadena4 = "Multa";
                    listaFiltros.add("Titulo = '"+cj_titulo.getText()+"'");
                    break;
                case "Editorial":
                    //cadena4 = "Multa";
                    listaFiltros.add("Editorial");
                    break;
                case "Año":
                    //cadena4 = "Multa";
                    listaFiltros.add("Year");
                    break;
                case "ISBN":
                    //cadena4 = "Multa";
                    listaFiltros.add("ISBN");
                    break;
                case "Tipo Libro":
                    //cadena4 = "Multa";
                    listaFiltros.add("tipo_libro");
                    break;
                case "Genero":
                    //cadena4 = "Multa";
                    listaFiltros.add("Genero");
                    break;
                default:
                    //cadenaDefault = "*";
                    listaFiltros.add("");
            }
            
        }
        System.out.println("vista.VistaPrestamo.filtroLista() --> "+listaFiltros);
        return listaFiltros;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_busqueda_avanzada;
    private javax.swing.JCheckBox ch_libro_id_libro;
    private javax.swing.JCheckBox ch_multa;
    private javax.swing.JTextField cj_editorial;
    private javax.swing.JTextField cj_isbn;
    private javax.swing.JTextField cj_lector_id;
    private javax.swing.JTextField cj_libro_id;
    private javax.swing.JTextField cj_libro_id_libro;
    private javax.swing.JTextField cj_titulo;
    private javax.swing.JCheckBox ck_ISBN;
    private javax.swing.JCheckBox ck_editorial;
    private javax.swing.JCheckBox ck_fecha_devolucion;
    private javax.swing.JCheckBox ck_fecha_prestamo;
    private javax.swing.JCheckBox ck_genero;
    private javax.swing.JCheckBox ck_lector_id;
    private javax.swing.JCheckBox ck_libro_id_prestamo;
    private javax.swing.JCheckBox ck_tipo_libro;
    private javax.swing.JCheckBox ck_titulo;
    private javax.swing.JCheckBox ck_year;
    private javax.swing.JComboBox<String> cmb_dias_devolucion;
    private javax.swing.JComboBox<String> cmb_dias_prestamo;
    private javax.swing.JComboBox<String> cmb_genero;
    private javax.swing.JComboBox<String> cmb_libro_year;
    private javax.swing.JComboBox<String> cmb_mes_prestamo;
    private javax.swing.JComboBox<String> cmb_meses_devolucion;
    private javax.swing.JComboBox<String> cmb_tipoLibro;
    private javax.swing.JComboBox<String> cmb_year_devolucion;
    private javax.swing.JComboBox<String> cmb_year_prestamo;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JList<String> listaFiltro;
    private javax.swing.JTable t_prestamo;
    // End of variables declaration//GEN-END:variables
}
