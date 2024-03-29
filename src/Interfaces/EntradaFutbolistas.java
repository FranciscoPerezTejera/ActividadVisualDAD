/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Clases.Futbolista;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 2damb
 */
public class EntradaFutbolistas extends javax.swing.JFrame {
    
    DefaultTableModel tabla;
    ArrayList<Futbolista> listaFutbolistas = new ArrayList<>();
    /**
     * Creates new form EntradaFutbolistas
     */
    public EntradaFutbolistas(ArrayList<Futbolista> fut) {

        initComponents();
        amarillasJPanel.setVisible(false);
        rojasPanel.setVisible(false);
        alturaSlider.setMinimum(63);
        alturaSlider.setMaximum(289);
        alturaSlider.setMajorTickSpacing(50);
        alturaSlider.setMinorTickSpacing(10);
        alturaSlider.setPaintTicks(true);
        alturaSlider.setPaintLabels(true);
        this.tabla = tabla;
        
        if (fut != null)
            this.listaFutbolistas = fut;
        
        alturaSlider.addChangeListener((e) -> {

            int valor = alturaSlider.getValue();
            numeroAlturaLabel.setText(String.valueOf(valor));

        });

        tarjetasAmarillasCheckBox.addChangeListener((c) -> {

            if (tarjetasAmarillasCheckBox.isSelected()) {
                amarillasJPanel.setVisible(true);
            }
            if (!tarjetasAmarillasCheckBox.isSelected()) {
                amarillasJPanel.setVisible(false);
            }

        });

        tarjetasRojasCheckBox.addChangeListener((c) -> {

            if (tarjetasRojasCheckBox.isSelected()) {
                rojasPanel.setVisible(true);
            }
            if (!tarjetasRojasCheckBox.isSelected()) {
                rojasPanel.setVisible(false);
            }

        });
        
        edadSpinner.addChangeListener((e) -> {
        
            int valor = (int) edadSpinner.getValue();
            
            if (valor < 0)
                edadSpinner.setValue(0);
            
        });
        
        golesSpinner.addChangeListener((e) -> {
        
            int valor = (int) golesSpinner.getValue();
            
            if (valor < 0)
                golesSpinner.setValue(0);
            
        });
                
        asistenciasSpinner.addChangeListener((e) -> {
        
            int valor = (int) asistenciasSpinner.getValue();
            
            if (valor < 0)
                asistenciasSpinner.setValue(0);
            
        });
       
        amarillasSpinner.addChangeListener((e) -> {
        
            int valor = (int) amarillasSpinner.getValue();
            
            if (valor < 0)
                amarillasSpinner.setValue(0);
            
        });
        
        rojasSpinner.addChangeListener((e) -> {
        
            int valor = (int) rojasSpinner.getValue();
            
            if (valor < 0)
                rojasSpinner.setValue(0);
            
        });
        

        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexoButtonGroup = new javax.swing.ButtonGroup();
        panelEntradaFutbolistas = new javax.swing.JPanel();
        nombreLabel = new javax.swing.JLabel();
        nombreFutbolistaTextField = new javax.swing.JTextField();
        apellidosLabel = new javax.swing.JLabel();
        apellidosFutbolistaTextField = new javax.swing.JTextField();
        nacionalidadLabel = new javax.swing.JLabel();
        nacionalidadFutbolista = new javax.swing.JTextField();
        edadFutbolistaLabel = new javax.swing.JLabel();
        edadSpinner = new javax.swing.JSpinner();
        alturaLabel = new javax.swing.JLabel();
        masculinoRadioButton = new javax.swing.JRadioButton();
        femeninoRadioButton = new javax.swing.JRadioButton();
        sexoLabel = new javax.swing.JLabel();
        golesLabel = new javax.swing.JLabel();
        golesSpinner = new javax.swing.JSpinner();
        existenciaLabel = new javax.swing.JLabel();
        asistenciasSpinner = new javax.swing.JSpinner();
        tarjetasAmarillasCheckBox = new javax.swing.JCheckBox();
        amarillasJPanel = new javax.swing.JPanel();
        cuantasAmarillasLabel = new javax.swing.JLabel();
        amarillasSpinner = new javax.swing.JSpinner();
        tarjetasRojasCheckBox = new javax.swing.JCheckBox();
        rojasPanel = new javax.swing.JPanel();
        cuantasRojasLabel = new javax.swing.JLabel();
        rojasSpinner = new javax.swing.JSpinner();
        enviarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        borrarButton = new javax.swing.JButton();
        alturaSlider = new javax.swing.JSlider();
        numeroAlturaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        sexoButtonGroup.add(masculinoRadioButton);
        sexoButtonGroup.add(femeninoRadioButton);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        nombreLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nombreLabel.setText("NOMBRE:");

        apellidosLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        apellidosLabel.setText("APELLIDOS :");

        nacionalidadLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nacionalidadLabel.setText("PAÍS:");

        nacionalidadFutbolista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidadFutbolistaActionPerformed(evt);
            }
        });

        edadFutbolistaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        edadFutbolistaLabel.setText("EDAD:");

        alturaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        alturaLabel.setText("ALTURA:");

        masculinoRadioButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        masculinoRadioButton.setText("MASCULINO");

        femeninoRadioButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        femeninoRadioButton.setText("FEMENINO");

        sexoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sexoLabel.setText("SEXO:");

        golesLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        golesLabel.setText("GOLES:");

        existenciaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        existenciaLabel.setText("ASISTENCIAS:");

        tarjetasAmarillasCheckBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tarjetasAmarillasCheckBox.setText("¿TE HAN SACADO TARJETAS AMARILLAS?");

        cuantasAmarillasLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cuantasAmarillasLabel.setText("CUANTAS:");

        javax.swing.GroupLayout amarillasJPanelLayout = new javax.swing.GroupLayout(amarillasJPanel);
        amarillasJPanel.setLayout(amarillasJPanelLayout);
        amarillasJPanelLayout.setHorizontalGroup(
            amarillasJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amarillasJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(amarillasJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cuantasAmarillasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amarillasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        amarillasJPanelLayout.setVerticalGroup(
            amarillasJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amarillasJPanelLayout.createSequentialGroup()
                .addComponent(cuantasAmarillasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amarillasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tarjetasRojasCheckBox.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tarjetasRojasCheckBox.setText("¿TE HAN SACADO TARJETAS ROJAS?");
        tarjetasRojasCheckBox.setPreferredSize(new java.awt.Dimension(246, 20));

        cuantasRojasLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cuantasRojasLabel.setText("CUNATAS:");

        rojasSpinner.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout rojasPanelLayout = new javax.swing.GroupLayout(rojasPanel);
        rojasPanel.setLayout(rojasPanelLayout);
        rojasPanelLayout.setHorizontalGroup(
            rojasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rojasPanelLayout.createSequentialGroup()
                .addGroup(rojasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cuantasRojasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rojasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 171, Short.MAX_VALUE))
        );
        rojasPanelLayout.setVerticalGroup(
            rojasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rojasPanelLayout.createSequentialGroup()
                .addComponent(cuantasRojasLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rojasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
        );

        enviarButton.setBackground(new java.awt.Color(51, 255, 51));
        enviarButton.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        enviarButton.setForeground(new java.awt.Color(0, 0, 0));
        enviarButton.setText("ENVIAR");
        enviarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setBackground(new java.awt.Color(255, 0, 0));
        cancelarButton.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cancelarButton.setForeground(new java.awt.Color(0, 0, 0));
        cancelarButton.setText("CANCELAR");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        borrarButton.setBackground(new java.awt.Color(255, 255, 51));
        borrarButton.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        borrarButton.setForeground(new java.awt.Color(0, 0, 0));
        borrarButton.setText("BORRAR");
        borrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarButtonActionPerformed(evt);
            }
        });

        numeroAlturaLabel.setText("63");
        numeroAlturaLabel.setMinimumSize(new java.awt.Dimension(20, 10));

        jLabel1.setText("CM");

        javax.swing.GroupLayout panelEntradaFutbolistasLayout = new javax.swing.GroupLayout(panelEntradaFutbolistas);
        panelEntradaFutbolistas.setLayout(panelEntradaFutbolistasLayout);
        panelEntradaFutbolistasLayout.setHorizontalGroup(
            panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradaFutbolistasLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntradaFutbolistasLayout.createSequentialGroup()
                        .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelEntradaFutbolistasLayout.createSequentialGroup()
                                .addComponent(borrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(enviarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelEntradaFutbolistasLayout.createSequentialGroup()
                                .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelEntradaFutbolistasLayout.createSequentialGroup()
                                        .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(apellidosLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nacionalidadLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombreLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEntradaFutbolistasLayout.createSequentialGroup()
                                                    .addComponent(edadFutbolistaLabel)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(edadSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelEntradaFutbolistasLayout.createSequentialGroup()
                                                    .addComponent(golesLabel)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(golesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tarjetasAmarillasCheckBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(amarillasJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombreFutbolistaTextField)
                                    .addComponent(apellidosFutbolistaTextField)
                                    .addComponent(nacionalidadFutbolista, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelEntradaFutbolistasLayout.createSequentialGroup()
                                        .addComponent(existenciaLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(asistenciasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(numeroAlturaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel1))
                                    .addGroup(panelEntradaFutbolistasLayout.createSequentialGroup()
                                        .addComponent(alturaLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(alturaSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(panelEntradaFutbolistasLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rojasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tarjetasRojasCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(38, 38, 38))
                    .addGroup(panelEntradaFutbolistasLayout.createSequentialGroup()
                        .addComponent(sexoLabel)
                        .addGap(12, 12, 12)
                        .addComponent(masculinoRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(femeninoRadioButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelEntradaFutbolistasLayout.setVerticalGroup(
            panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradaFutbolistasLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexoLabel)
                    .addComponent(masculinoRadioButton)
                    .addComponent(femeninoRadioButton))
                .addGap(18, 18, 18)
                .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreFutbolistaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidosLabel)
                    .addComponent(apellidosFutbolistaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nacionalidadLabel)
                    .addComponent(nacionalidadFutbolista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edadFutbolistaLabel)
                    .addComponent(edadSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alturaLabel)
                    .addComponent(alturaSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEntradaFutbolistasLayout.createSequentialGroup()
                        .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelEntradaFutbolistasLayout.createSequentialGroup()
                                .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(golesLabel)
                                    .addComponent(golesSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(existenciaLabel)
                                    .addComponent(asistenciasSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58))
                            .addGroup(panelEntradaFutbolistasLayout.createSequentialGroup()
                                .addComponent(numeroAlturaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(68, 68, 68)))
                        .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tarjetasAmarillasCheckBox)
                            .addComponent(tarjetasRojasCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rojasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amarillasJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(panelEntradaFutbolistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enviarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(panelEntradaFutbolistasLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEntradaFutbolistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEntradaFutbolistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nacionalidadFutbolistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidadFutbolistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidadFutbolistaActionPerformed

    private void enviarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarButtonActionPerformed

        Futbolista fut = new Futbolista();

        fut.setNombre(nombreFutbolistaTextField.getText());
        fut.setApellidos(apellidosFutbolistaTextField.getText());
        fut.setNacionalidad(nacionalidadFutbolista.getText());
        fut.setSexo(sexoSeleccionado());
        fut.setEdad(Integer.parseInt(String.valueOf(edadSpinner.getValue())));
        fut.setAltura(Integer.parseInt(String.valueOf(alturaSlider.getValue())));
        fut.setGoles(Integer.parseInt(String.valueOf(golesSpinner.getValue())));
        fut.setAsistencias(Integer.parseInt(String.valueOf(asistenciasSpinner.getValue())));
        fut.setTarjetasAmarillas(Integer.parseInt(String.valueOf(amarillasSpinner.getValue())));
        fut.setTarjetasRojas(Integer.parseInt(String.valueOf(rojasSpinner.getValue())));

        listaFutbolistas.add(fut);
        
        PantallaPrincipal nueva = new PantallaPrincipal(listaFutbolistas);

        this.dispose();

        nueva.setVisible(true);

    }//GEN-LAST:event_enviarButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed

        PantallaPrincipal nueva = new PantallaPrincipal(listaFutbolistas);
        this.dispose();
        nueva.setVisible(true);

    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void borrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarButtonActionPerformed

        sexoButtonGroup.clearSelection();
        nombreFutbolistaTextField.setText("");
        apellidosFutbolistaTextField.setText("");
        nacionalidadFutbolista.setText("");
        edadSpinner.setValue(0);
        alturaSlider.setValue(0);
        golesSpinner.setValue(0);
        asistenciasSpinner.setValue(0);
        amarillasSpinner.setValue(0);
        rojasSpinner.setValue(0);
        tarjetasAmarillasCheckBox.setSelected(false);
        tarjetasRojasCheckBox.setSelected(false);

    }//GEN-LAST:event_borrarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public JLabel getAlturaLabel() {
        return alturaLabel;
    }

    public void setAlturaLabel(JLabel alturaLabel) {
        this.alturaLabel = alturaLabel;
    }

    public JSpinner getAmarillasSpinner() {
        return amarillasSpinner;
    }

    public void setAmarillasSpinner(JSpinner amarillasSpinner) {
        this.amarillasSpinner = amarillasSpinner;
    }

    public JTextField getApellidosFutbolistaTextField() {
        return apellidosFutbolistaTextField;
    }

    public void setApellidosFutbolistaTextField(JTextField apellidosFutbolistaTextField) {
        this.apellidosFutbolistaTextField = apellidosFutbolistaTextField;
    }

    public JSpinner getAsistenciasSpinner() {
        return asistenciasSpinner;
    }

    public void setAsistenciasSpinner(JSpinner asistenciasSpinner) {
        this.asistenciasSpinner = asistenciasSpinner;
    }

    public JButton getBorrarButton() {
        return borrarButton;
    }

    public void setBorrarButton(JButton borrarButton) {
        this.borrarButton = borrarButton;
    }

    public JButton getCancelarButton() {
        return cancelarButton;
    }

    public void setCancelarButton(JButton cancelarButton) {
        this.cancelarButton = cancelarButton;
    }

    public JLabel getCuantasAmarillasLabel() {
        return cuantasAmarillasLabel;
    }

    public void setCuantasAmarillasLabel(JLabel cuantasAmarillasLabel) {
        this.cuantasAmarillasLabel = cuantasAmarillasLabel;
    }

    public JLabel getCuantasRojasLabel() {
        return cuantasRojasLabel;
    }

    public void setCuantasRojasLabel(JLabel cuantasRojasLabel) {
        this.cuantasRojasLabel = cuantasRojasLabel;
    }

    public JLabel getEdadFutbolistaLabel() {
        return edadFutbolistaLabel;
    }

    public void setEdadFutbolistaLabel(JLabel edadFutbolistaLabel) {
        this.edadFutbolistaLabel = edadFutbolistaLabel;
    }

    public JSpinner getEdadSpinner() {
        return edadSpinner;
    }

    public void setEdadSpinner(JSpinner edadSpinner) {
        this.edadSpinner = edadSpinner;
    }

    public JButton getEnviarButton() {
        return enviarButton;
    }

    public void setEnviarButton(JButton enviarButton) {
        this.enviarButton = enviarButton;
    }

    public JLabel getExistenciaLabel() {
        return existenciaLabel;
    }

    public void setExistenciaLabel(JLabel existenciaLabel) {
        this.existenciaLabel = existenciaLabel;
    }

    public JRadioButton getFemeninoRadioButton() {
        return femeninoRadioButton;
    }

    public void setFemeninoRadioButton(JRadioButton femeninoRadioButton) {
        this.femeninoRadioButton = femeninoRadioButton;
    }

    public JLabel getGolesLabel() {
        return golesLabel;
    }

    public void setGolesLabel(JLabel golesLabel) {
        this.golesLabel = golesLabel;
    }

    public JSpinner getGolesSpinner() {
        return golesSpinner;
    }

    public void setGolesSpinner(JSpinner golesSpinner) {
        this.golesSpinner = golesSpinner;
    }

    public JCheckBox getjCheckBox1() {
        return tarjetasRojasCheckBox;
    }

    public void setjCheckBox1(JCheckBox jCheckBox1) {
        this.tarjetasRojasCheckBox = jCheckBox1;
    }

    public JLabel getjLabel1() {
        return apellidosLabel;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.apellidosLabel = jLabel1;
    }

    public JLabel getjLabel2() {
        return nacionalidadLabel;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.nacionalidadLabel = jLabel2;
    }

    public JLabel getjLabel3() {
        return numeroAlturaLabel;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.numeroAlturaLabel = jLabel3;
    }

    public JLabel getjLabel4() {
        return sexoLabel;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.sexoLabel = jLabel4;
    }

    public JPanel getjPanel1() {
        return rojasPanel;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.rojasPanel = jPanel1;
    }

    public JRadioButton getMasculinoRadioButton() {
        return masculinoRadioButton;
    }

    public void setMasculinoRadioButton(JRadioButton masculinoRadioButton) {
        this.masculinoRadioButton = masculinoRadioButton;
    }

    public JTextField getNaciionalidadFutbolista() {
        return nacionalidadFutbolista;
    }

    public void setNaciionalidadFutbolista(JTextField naciionalidadFutbolista) {
        this.nacionalidadFutbolista = naciionalidadFutbolista;
    }

    public JTextField getNombreFutbolistaTextField() {
        return nombreFutbolistaTextField;
    }

    public void setNombreFutbolistaTextField(JTextField nombreFutbolistaTextField) {
        this.nombreFutbolistaTextField = nombreFutbolistaTextField;
    }

    public JLabel getNombreLabel() {
        return nombreLabel;
    }

    public void setNombreLabel(JLabel nombreLabel) {
        this.nombreLabel = nombreLabel;
    }

    public JPanel getPanelAmarillasJPanel() {
        return amarillasJPanel;
    }

    public void setPanelAmarillasJPanel(JPanel panelAmarillasJPanel) {
        this.amarillasJPanel = panelAmarillasJPanel;
    }

    public JPanel getPanelEntradaFutbolistas() {
        return panelEntradaFutbolistas;
    }

    public void setPanelEntradaFutbolistas(JPanel panelEntradaFutbolistas) {
        this.panelEntradaFutbolistas = panelEntradaFutbolistas;
    }

    public JSpinner getRojasSpinner() {
        return rojasSpinner;
    }

    public void setRojasSpinner(JSpinner rojasSpinner) {
        this.rojasSpinner = rojasSpinner;
    }

    public ButtonGroup getSexoBottonGroup() {
        return sexoButtonGroup;
    }

    public void setSexoBottonGroup(ButtonGroup sexoBottonGroup) {
        this.sexoButtonGroup = sexoBottonGroup;
    }

    public JCheckBox getTarjetasAmarillasCheckBox() {
        return tarjetasAmarillasCheckBox;
    }

    public void setTarjetasAmarillasCheckBox(JCheckBox tarjetasAmarillasCheckBox) {
        this.tarjetasAmarillasCheckBox = tarjetasAmarillasCheckBox;
    }

    private String sexoSeleccionado() {

        Enumeration<AbstractButton> elements = sexoButtonGroup.getElements();
        while (elements.hasMoreElements()) {
            AbstractButton button = elements.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return "MASCULINO";
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alturaLabel;
    private javax.swing.JSlider alturaSlider;
    private javax.swing.JPanel amarillasJPanel;
    private javax.swing.JSpinner amarillasSpinner;
    private javax.swing.JTextField apellidosFutbolistaTextField;
    private javax.swing.JLabel apellidosLabel;
    private javax.swing.JSpinner asistenciasSpinner;
    private javax.swing.JButton borrarButton;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel cuantasAmarillasLabel;
    private javax.swing.JLabel cuantasRojasLabel;
    private javax.swing.JLabel edadFutbolistaLabel;
    private javax.swing.JSpinner edadSpinner;
    private javax.swing.JButton enviarButton;
    private javax.swing.JLabel existenciaLabel;
    private javax.swing.JRadioButton femeninoRadioButton;
    private javax.swing.JLabel golesLabel;
    private javax.swing.JSpinner golesSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton masculinoRadioButton;
    private javax.swing.JTextField nacionalidadFutbolista;
    private javax.swing.JLabel nacionalidadLabel;
    private javax.swing.JTextField nombreFutbolistaTextField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel numeroAlturaLabel;
    private javax.swing.JPanel panelEntradaFutbolistas;
    private javax.swing.JPanel rojasPanel;
    private javax.swing.JSpinner rojasSpinner;
    private javax.swing.ButtonGroup sexoButtonGroup;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JCheckBox tarjetasAmarillasCheckBox;
    private javax.swing.JCheckBox tarjetasRojasCheckBox;
    // End of variables declaration//GEN-END:variables
}
