/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexionBD.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import modelo.Generos;
import modelo.Libro;

/**
 *
 * @author erik
 */
public class VistaLibro extends javax.swing.JFrame {

    /**
     * Creates new form Libro
     */
    Libro lib = new Libro();
    LibroDAO ldao = new LibroDAO();
    GenerosDAO gnd = new GenerosDAO();
    conexionBD co;
    VistaPrestamo vp;
    menu menu;
    JOptionPane pane;
    ArrayList lista = new ArrayList();
    //VistaLibro vl = new VistaLibro(co);
    
    public VistaLibro(){
        initComponents();
        yearsCombo(cmb_years);
        generoCombo(cmb_generos);
        actualizarTabla();
        setLocationRelativeTo(null);
    }
    
    public VistaLibro(conexionBD co) {
        this.co = co;
        initComponents();
        actualizarTabla();
        yearsCombo(cmb_years);
        generoCombo(cmb_generos);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn_componentes = new javax.swing.JPanel();
        cj_id = new javax.swing.JTextField();
        cj_titulo = new javax.swing.JTextField();
        cj_editorial = new javax.swing.JTextField();
        cmb_tipolibro = new javax.swing.JComboBox<>();
        btn_aceptar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        chk_id = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cj_isbn = new javax.swing.JTextField();
        cmb_years = new javax.swing.JComboBox<>();
        chk_editorial = new javax.swing.JRadioButton();
        chk_tipo = new javax.swing.JRadioButton();
        chk_titulo = new javax.swing.JRadioButton();
        chk_year = new javax.swing.JRadioButton();
        chk_genero = new javax.swing.JRadioButton();
        cmb_generos = new javax.swing.JComboBox<>();
        btn_prestamo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLibro = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btn_regreso = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(133, 205, 186));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 36)); // NOI18N
        jLabel1.setText("Libro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        cmb_tipolibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta", "Recreativos", "Cientificos", "Instructivos", "Literarios", "Poeticos", "Biograficos" }));

        btn_aceptar.setText("Agregar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        buttonGroup1.add(chk_id);
        chk_id.setText("Id Libro");

        jLabel2.setText("ISBN:");

        cmb_years.setModel(cmb_years.getModel());

        buttonGroup1.add(chk_editorial);
        chk_editorial.setText("Editorial:");

        buttonGroup1.add(chk_tipo);
        chk_tipo.setText("Tipo Libro:");

        buttonGroup1.add(chk_titulo);
        chk_titulo.setText("Titulo:");

        buttonGroup1.add(chk_year);
        chk_year.setText("Año:");
        chk_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_yearActionPerformed(evt);
            }
        });

        buttonGroup1.add(chk_genero);
        chk_genero.setText("Genero:");

        btn_prestamo.setText("prestamo");
        btn_prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_componentesLayout = new javax.swing.GroupLayout(pn_componentes);
        pn_componentes.setLayout(pn_componentesLayout);
        pn_componentesLayout.setHorizontalGroup(
            pn_componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_componentesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pn_componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chk_titulo)
                    .addComponent(chk_id)
                    .addComponent(jLabel2)
                    .addComponent(btn_aceptar))
                .addGap(38, 38, 38)
                .addGroup(pn_componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_componentesLayout.createSequentialGroup()
                        .addGroup(pn_componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_componentesLayout.createSequentialGroup()
                                .addComponent(btn_eliminar)
                                .addGap(32, 32, 32)
                                .addComponent(btn_actualizar)
                                .addGap(36, 36, 36)
                                .addComponent(btn_buscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_prestamo))
                            .addGroup(pn_componentesLayout.createSequentialGroup()
                                .addGroup(pn_componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn_componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(chk_year)
                                        .addGroup(pn_componentesLayout.createSequentialGroup()
                                            .addComponent(cj_id, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(chk_editorial)))
                                    .addComponent(cj_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pn_componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cj_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_years, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addGroup(pn_componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk_tipo)
                            .addComponent(chk_genero))
                        .addGap(42, 42, 42)
                        .addGroup(pn_componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_tipolibro, 0, 140, Short.MAX_VALUE)
                            .addComponent(cmb_generos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(cj_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pn_componentesLayout.setVerticalGroup(
            pn_componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_componentesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pn_componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cj_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cj_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_tipolibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_id)
                    .addComponent(chk_editorial)
                    .addComponent(chk_tipo))
                .addGap(18, 18, 18)
                .addGroup(pn_componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cj_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_years, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_titulo)
                    .addComponent(chk_genero)
                    .addComponent(cmb_generos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_year))
                .addGap(21, 21, 21)
                .addGroup(pn_componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cj_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pn_componentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aceptar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_buscar)
                    .addComponent(btn_prestamo))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tablaLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Libro", "Titulo", "Editorial", "Año", "ISBN", "Tipo Libro", "Genero"
            }
        ));
        jScrollPane1.setViewportView(tablaLibro);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        btn_regreso.setIcon(new javax.swing.ImageIcon("/home/erik/NetBeansProjects/ProyectoFinal_BD/imagenes/reanudar.png")); // NOI18N
        btn_regreso.setFocusable(false);
        btn_regreso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_regreso.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_regreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresoActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_regreso);

        jMenuBar1.setBackground(new java.awt.Color(113, 173, 218));
        jMenuBar1.setForeground(new java.awt.Color(21, 35, 34));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_componentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_componentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresoActionPerformed
        // TODO add your handling code here:
        //menu m = new menu();
        setVisible(false);
       // m.setVisible(true);
    }//GEN-LAST:event_btn_regresoActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // TODO add your handling code here:
        boolean v1=false,v2=false,v3=false,v4=false,v5=false;//,x=false,x1=false,x2=false,x3=false;
        //yearsCombo(cmb_years);
        System.out.println(co);
        
        if(cj_id.getText().equalsIgnoreCase("")){
            pane.showMessageDialog(pane,"la caja id esta vacia");
        }
        else{
            if(Character.isDigit(cj_id.getText().charAt(0))){
                v1 = true;
            }
            else{
                pane.showMessageDialog(pane,"tipo de dato id incorrecto");
            }
        }
        if(cj_titulo.getText().equalsIgnoreCase("")){
            pane.showMessageDialog(pane,"la caja titulo esta vacia");
        }
        else {
             if(Character.isAlphabetic(cj_titulo.getText().charAt(0))){
                v2 = true;
            }
            else{
                pane.showMessageDialog(pane,"tipo de dato titulo incorrecto");
            }
        }
        if(cj_editorial.getText().equalsIgnoreCase("")){
            pane.showMessageDialog(pane,"la caja editorial esta vacia");
        }
        else {
             if(Character.isAlphabetic(cj_editorial.getText().charAt(0))){
                v3 = true;
            }
            else{
                pane.showMessageDialog(pane,"tipo de dato editorial incorrecto");
            }
        }
        if(cj_isbn.getText().equalsIgnoreCase("")){
            pane.showMessageDialog(pane,"la caja isbn esta vacia");
        }
        else {
             if(Character.isDigit(cj_isbn.getText().charAt(0))|| cj_titulo.getText().charAt(0) == '-'){
                v4 = true;
            }
            else{
                pane.showMessageDialog(pane,"tipo de dato isbn incorrecto");
            }
        }
        /*if(cj_genero.getText().equalsIgnoreCase("")){
            pane.showMessageDialog(pane,"la caja genero esta vacia");
        }
        else {
             if(Character.isAlphabetic(cj_titulo.getText().charAt(0))){
                v5 = true;
            }
            else{
                pane.showMessageDialog(pane,"tipo de dato genero incorrecto");
            }
        }*/
        
        if(v1 && v2 && v3 && v4){
            lib.setId_libro(Integer.parseInt(cj_id.getText()));
            lib.setTitulo(cj_titulo.getText());
            lib.setEditorial(cj_editorial.getText());
            lib.setFecha(String.valueOf(cmb_years.getSelectedItem()));
            lib.setISBN(cj_isbn.getText());
            lib.setTipoLibro(String.valueOf(cmb_tipolibro.getSelectedItem()));
            //lib.setGenero(2);
            lib.setGenero(gnd.claveId(String.valueOf(cmb_generos.getSelectedItem()), co));
            
        
            ldao.agregarLibro(lib,co);
            actualizarTabla();
        }
        
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        if(chk_id.isSelected()){
            if(Character.isDigit(cj_id.getText().charAt(0))){
                ldao.eliminarLibro(Integer.parseInt(cj_id.getText()), co);
                actualizarTabla();
            }
            else {
                pane.showMessageDialog(pane,"el dato id no es numerico");
            }
        }
        else {
            pane.showMessageDialog(pane,"el radiobutton id no esta seleccionado");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        if(chk_id.isSelected()){
            if(!cj_id.getText().equals("")){
                if(Character.isDigit(cj_id.getText().charAt(0))){
                    ldao.consultaLector("id_libro", cj_id.getText(), tablaLibro, co);
                }
            }
        }
        //else{
        //    pane.showMessageDialog(pane,"seleccione un checkbutton");
        //}
        else if(chk_titulo.isSelected()){
            if(!cj_titulo.getText().equals("")){
                if(Character.isAlphabetic(cj_titulo.getText().charAt(0))){
                    System.out.println("vista.VistaLibro.btn_buscarActionPerformed()"+cj_titulo.getText());
                    ldao.consultaLector("Titulo", cj_titulo.getText(), tablaLibro, co);
                }
                else{
                pane.showMessageDialog(pane,"la caja titulo tiene el tipo de dato incorrecto");
                }
            }
            else{
                pane.showMessageDialog(pane,"la caja titulo esta vacia");
            }
        }
        else if(chk_editorial.isSelected()){
            if(!cj_editorial.getText().equals("")){
                if(Character.isAlphabetic(cj_editorial.getText().charAt(0))){
                    ldao.consultaLector("Editorial", cj_editorial.getText(), tablaLibro, co);
                }
                else{
                pane.showMessageDialog(pane,"la caja editorial tiene el tipo de dato incorrecto");
                }
            }
            else{
                pane.showMessageDialog(pane,"la caja editorial esta vacia");
            }
        }
        else if(chk_year.isSelected()){
            ldao.consultaLector("Year", String.valueOf(cmb_years.getSelectedItem()), tablaLibro, co);
        }
        else if(chk_tipo.isSelected()){
            ldao.consultaLector("tipo_libro", String.valueOf(cmb_tipolibro.getSelectedItem()), tablaLibro, co);
        }
        else if(chk_genero.isSelected()){
            int x = gnd.claveId(String.valueOf(cmb_generos.getSelectedItem()), co);
            ldao.consultaLector("Genero", String.valueOf(x), tablaLibro, co);
        }
        else{
            pane.showMessageDialog(pane,"seleccione un checkbutton");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        if(chk_id.isSelected()){
            if(cj_id.getText().equalsIgnoreCase("")){
                pane.showMessageDialog(pane,"ingrese un identificador");
            }
            else if(!cj_id.getText().equalsIgnoreCase("") && !cj_titulo.getText().equals("") && !cj_editorial.getText().equals("") && !cj_isbn.getText().equals("")){
                
                lib.setTitulo(cj_titulo.getText());
                lib.setEditorial(cj_editorial.getText());
                lib.setFecha(String.valueOf(cmb_years.getSelectedItem()));
                lib.setISBN(cj_isbn.getText());
                lib.setTipoLibro(String.valueOf(cmb_tipolibro.getSelectedItem()));
                //lib.setGenero(Integer.parseInt(String.valueOf(cmb_generos.getSelectedItem())));
                lib.setGenero(gnd.claveId(String.valueOf(cmb_generos.getSelectedItem()), co));
                ldao.modificarLibro(lib, co);
                actualizarTabla();
            }
            else{
                if(Character.isDigit(cj_id.getText().charAt(0))){
                    
                    lib = ldao.buscarLector(Integer.parseInt(cj_id.getText()), co);
                    cmb_years.setSelectedItem(lib.getFecha());
                    cj_editorial.setText(lib.getEditorial());
                    cj_titulo.setText(lib.getTitulo());
                    cj_isbn.setText(lib.getISBN());
                }
                else{
                    pane.showMessageDialog(pane,"el id no es numerico");
                }
            }
        }
        else{
            pane.showMessageDialog(pane,"necesita seleccionar el radiobutton id");
        }
        
        //actualizarTabla();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void chk_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_yearActionPerformed

    private void btn_prestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prestamoActionPerformed
        // TODO add your handling code here:
        vp = new VistaPrestamo(co);
        vp.setVisible(true);
    }//GEN-LAST:event_btn_prestamoActionPerformed
    
    public void yearsCombo(JComboBox combo){
        for (int i = 1400; i < 2019; i++) {
            combo.addItem(i);
        }
    }
    
    public void generoCombo(JComboBox comboG){
        lista = (ArrayList) gnd.buscarAlumnos(this.co);
        Generos nuevo = new Generos();
        //nuevo = lista.set(, menu)
        for (int i = 0; i < lista.size(); i++) {
            //Object get = lst.get(i);
            nuevo = (Generos) lista.set(i, gnd);
            //comboG.addItem(lista.get(i));
            comboG.addItem(nuevo.getGenero());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    
    public void actualizarTabla() {
		final String TABLA_LIBRO = "Libro";
		//conexionBD conexion = new conexionBD();

		String driver = "com.ibm.db2.jcc.DB2Driver";
		String url = "jdbc:db2://localhost:50001/library";
		//String user = "root";
		//String password = "root1";
		String query = "SELECT * FROM " + TABLA_LIBRO;

		ResultSetTableModel2 modelo = null;
		try {
			modelo = new ResultSetTableModel2(driver, url, co.getUsuario(), co.getContra(), query);
		} catch (SQLException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
            tablaLibro.setModel(modelo);
	}
    
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
            java.util.logging.Logger.getLogger(VistaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_prestamo;
    private javax.swing.JButton btn_regreso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton chk_editorial;
    private javax.swing.JRadioButton chk_genero;
    private javax.swing.JRadioButton chk_id;
    private javax.swing.JRadioButton chk_tipo;
    private javax.swing.JRadioButton chk_titulo;
    private javax.swing.JRadioButton chk_year;
    private javax.swing.JTextField cj_editorial;
    private javax.swing.JTextField cj_id;
    private javax.swing.JTextField cj_isbn;
    private javax.swing.JTextField cj_titulo;
    private javax.swing.JComboBox<String> cmb_generos;
    private javax.swing.JComboBox<String> cmb_tipolibro;
    private javax.swing.JComboBox<String> cmb_years;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel pn_componentes;
    private javax.swing.JTable tablaLibro;
    // End of variables declaration//GEN-END:variables
}
