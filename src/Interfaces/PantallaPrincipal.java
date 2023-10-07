package Interfaces;

import Clases.Futbolista;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class PantallaPrincipal extends javax.swing.JFrame {

    DefaultTableModel tabla;
    ArrayList<Futbolista> futbolistas;

    public PantallaPrincipal() {
        
        tabla = new DefaultTableModel();
        String[] columnas = {"NNOMBRE", "APELLIDOS", "NACIONALIDAD", "SEXO", "EDAD", "ALTURA", "GOLES", "ASISTENCIAS", "AMARILLAS", "ROJAS"};
        tabla.setColumnIdentifiers(columnas);
        initComponents();
        this.setVisible(true);
        estadisticasJugadoresJTable.setModel(tabla);

    }
    
    public PantallaPrincipal(ArrayList<Futbolista> futb) {

        tabla = new DefaultTableModel();
        String[] columnas = {"NNOMBRE", "APELLIDOS", "NACIONALIDAD", "SEXO", "EDAD", "ALTURA", "GOLES", "ASISTENCIAS", "AMARILLAS", "ROJAS"};
        tabla.setColumnIdentifiers(columnas);
        initComponents();
        this.futbolistas = futb;
        estadisticasJugadoresJTable.setModel(tabla);
        
        Futbolista nuevo;
        
        for (Futbolista futbolista : futbolistas) {
        
            Object [] esta = {  futbolista.getNombre(),futbolista.getApellidos(),
                                futbolista.getNacionalidad(),futbolista.getSexo(),
                                futbolista.getEdad(),futbolista.getAltura(),futbolista.getGoles(),
                                futbolista.getAsistencias(),futbolista.getTarjetasAmarillas(),futbolista.getTarjetasRojas()};
            
            tabla.addRow(esta);
        }
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        altaFutbolistaButton = new javax.swing.JButton();
        estadisticasJLabel = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jScrollPane1 = new javax.swing.JScrollPane();
        estadisticasJugadoresJTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actividad Evaluable");
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(720, 600));

        panelPrincipal.setPreferredSize(new java.awt.Dimension(600, 580));

        altaFutbolistaButton.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        altaFutbolistaButton.setText("ALTA FUTBOLISTA");
        altaFutbolistaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaFutbolistaButtonActionPerformed(evt);
            }
        });

        estadisticasJLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        estadisticasJLabel.setText("ESTADÍSTICAS DE FUTBOLISTAS TEMPORADA 2023/2024");

        estadisticasJugadoresJTable.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        estadisticasJugadoresJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(estadisticasJugadoresJTable);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addComponent(altaFutbolistaButton)
                        .addGap(94, 94, 94)
                        .addComponent(estadisticasJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1037, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altaFutbolistaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadisticasJLabel))
                .addGap(17, 17, 17)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1070, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaFutbolistaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaFutbolistaButtonActionPerformed

        EntradaFutbolistas nueva = new EntradaFutbolistas(futbolistas);
        this.dispose();
    }//GEN-LAST:event_altaFutbolistaButtonActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altaFutbolistaButton;
    private javax.swing.JLabel estadisticasJLabel;
    private javax.swing.JTable estadisticasJugadoresJTable;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
