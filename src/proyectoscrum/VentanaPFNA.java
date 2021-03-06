/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoscrum;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Santi
 */
public class VentanaPFNA extends javax.swing.JFrame {

    private Proyecto p;
    /**
     * Creates new form VentanaPFNA
     */
    public VentanaPFNA(Proyecto p) {
        this.p = p;
        initComponents();
        
        this.actualizar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Total puntos función no ajustados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Nº Entradas Externas", "          x3", "          x4", "          x6", null},
                {"Nº Salidas Externas", "          x4", "          x5", "          x7", null},
                {"Nº Grupos Lógicos de Dats Internos", "          x7", "          x10", "          x15", null},
                {"Nº Grupos Lógicos de Datos de Interfaz", "          x5", "          x7", "          x10", null},
                {"Nº de Consultas Externas", "          x3", "          x4", "          x6", null}
            },
            new String [] {
                "Descripción", "Simple", "Media", "Compleja", "Total P.F."
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(250);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(250);
        }

        jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTotalActionPerformed(evt);
            }
        });

        jLabelTotal.setText("PFNA Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotal))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTotalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldTotal;
    // End of variables declaration//GEN-END:variables

    public void actualizar(){
        int nEEs = 0, nEEm = 0, nEEc = 0; 
        int nSEs = 0, nSEm = 0, nSEc = 0;
        int nFLIs = 0, nFLIm = 0, nFLIc = 0; 
        int nFLEs = 0, nFLEm = 0, nFLEc = 0; 
        int nCEs = 0, nCEm = 0, nCEc = 0;
        
        for(Elemento temp : this.p.getElementos()){
            switch(temp.getTipo()){
                case "EE" : 
                    if(temp.getComplejidad().equalsIgnoreCase("SIMPLE")) {
                        nEEs++;
                    } else if(temp.getComplejidad().equalsIgnoreCase("MEDIA")) {
                        nEEm++;
                    } else {
                        nEEc++;
                    }
                    break;
                    
                case "CE" : 
                    if(temp.getComplejidad().equalsIgnoreCase("SIMPLE")) {
                        nCEs++;
                    } else if(temp.getComplejidad().equalsIgnoreCase("MEDIA")) {
                        nCEm++;
                    } else {
                        nCEc++;
                    }
                    break;
                
                case "SE" : 
                    if(temp.getComplejidad().equalsIgnoreCase("SIMPLE")) {
                        nSEs++;
                    } else if(temp.getComplejidad().equalsIgnoreCase("MEDIA")) {
                        nSEm++;
                    } else {
                        nSEc++;
                    }
                    break;
                    
                case "FLI" : 
                    if(temp.getComplejidad().equalsIgnoreCase("SIMPLE")) {
                        nFLIs++;
                    } else if(temp.getComplejidad().equalsIgnoreCase("MEDIA")) {
                        nFLIm++;
                    } else {
                        nFLIc++;
                    }
                    break;
                    
                case "FLE" : 
                    if(temp.getComplejidad().equalsIgnoreCase("SIMPLE")) {
                        nFLEs++;
                    } else if(temp.getComplejidad().equalsIgnoreCase("MEDIA")) {
                        nFLEm++;
                    } else {
                        nFLEc++;
                    }
                    break; 
            }
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Nº Entradas Externas", "  " + nEEs + "       x3", "  " + nEEm + "       x4", "  " + nEEc + "       x6", p.getPfnaEE()},
                {"Nº Salidas Externas", "  " + nSEs + "       x4", "  " + nSEm + "       x5", "  " + nSEc + "       x7", p.getPfnaSE()},
                {"Nº Grupos Lógicos de Dats Internos", "  " + nFLIs + "       x7", "  " + nFLIm + "       x10", "  " + nFLIc + "       x15", p.getPfnaFLI()},
                {"Nº Grupos Lógicos de Datos de Interfaz", "  " + nFLEs + "       x5", "  " + nFLEm + "       x7", "  " + nFLEc + "       x10", p.getPfnaFLE()},
                {"Nº de Consultas Externas", "  " + nCEs + "       x3", "  " + nCEm + "       x4", "  " + nCEc + "       x6", p.getPfnaCE()}
            },
            new String [] {
                "Descripción", "Simple", "Media", "Compleja", "Total P.F."
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(250);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(250);
        }
        
        this.jTextFieldTotal.setText("" + (p.getPfnaCE() + p.getPfnaEE() + p.getPfnaFLE() + p.getPfnaFLI() + p.getPfnaSE()));
    }
}
