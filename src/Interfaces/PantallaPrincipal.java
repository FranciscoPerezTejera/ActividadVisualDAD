package Interfaces;

import Clases.Futbolista;
import javax.swing.table.DefaultTableModel;

public class PantallaPrincipal extends javax.swing.JFrame {

    DefaultTableModel tabla;

    public PantallaPrincipal() {

        tabla = new DefaultTableModel();
        String[] columnas = {"NNOMBRE", "APELLIDOS", "NACIONALIDAD", "SEXO", "EDAD", "ALTURA", "GOLES", "ASISTENCIAS", "AMARILLAS", "ROJAS"};
        tabla.setColumnIdentifiers(columnas);
        initComponents();
        estadisticasJugadoresJTable.setModel(tabla);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        altaFutbolistaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jScrollPane1 = new javax.swing.JScrollPane();
        estadisticasJugadoresJTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actividad Evaluable");
        setResizable(false);
        setSize(new java.awt.Dimension(720, 600));

        panelPrincipal.setPreferredSize(new java.awt.Dimension(600, 580));

        altaFutbolistaButton.setText("ALTA FUTBOLISTA");
        altaFutbolistaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaFutbolistaButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("ESTADÍSTICAS DE FUTBOLISTAS TEMPORADA 2023/2024");

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
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(altaFutbolistaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altaFutbolistaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaFutbolistaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaFutbolistaButtonActionPerformed

        EntradaFutbolistas nueva = new EntradaFutbolistas();

        Futbolista futbolista = new Futbolista();

        while (nueva.getEnviarButton().isSelected()) {

            if (nueva.getEnviarButton().isSelected()) {

                futbolista.setNombre(nueva.getNombreFutbolistaTextField().getText());
                futbolista.setApellidos(nueva.getApellidosFutbolistaTextField().getText());
               // futbolista.setAltura(Integer.parseInt(nueva.getAlturaTextField().toString()));
                futbolista.setEdad(nueva.getEdadSpinner().getComponentCount());
                futbolista.setGoles(nueva.getGolesSpinner().getComponentCount());
                futbolista.setAsistencias(nueva.getAsistenciasSpinner().getComponentCount());
                futbolista.setTarjetasAmarillas(nueva.getAmarillasSpinner().getComponentCount());
                futbolista.setTarjetasRojas(nueva.getRojasSpinner().getComponentCount());
                futbolista.setNacionalidad(nueva.getNaciionalidadFutbolista().getText());

            }
        }

        Object[] fut = {futbolista.getNombre(), futbolista.getApellidos(),
            futbolista.getNacionalidad(), futbolista.getSexo(),
            futbolista.getEdad(), futbolista.getGoles(), futbolista.getAsistencias(),
            futbolista.getTarjetasAmarillas(), futbolista.getTarjetasRojas()};

        tabla.addRow(fut);


    }//GEN-LAST:event_altaFutbolistaButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton altaFutbolistaButton;
    private javax.swing.JTable estadisticasJugadoresJTable;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
