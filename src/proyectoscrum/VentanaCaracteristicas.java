/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoscrum;

import javax.swing.JOptionPane;

/**
 *
 * @author Santi
 */
public class VentanaCaracteristicas extends javax.swing.JFrame {

    private Proyecto p;
    /**
     * Creates new form VentanaCaracteristicas
     */
    public VentanaCaracteristicas(Proyecto p) {
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

        jLabelSuma = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Características generales");

        jLabelSuma.setText("SUMA: 0");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0", "Sin influencia"},
                {"1", "Influencia mínima"},
                {"2", "Influencia moderada"},
                {"3", "Influencia apreciable"},
                {"4", "Influencia significativa"},
                {"5", "Influencia muy fuerte"}
            },
            new String [] {
                "Valor", "Influencia"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setMinWidth(150);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        jLabel1.setText("1. Comunicación de datos");

        jLabel2.setText("2. Funciones distribuidas");

        jLabel3.setText("3. Prestaciones");

        jLabel4.setText("4. Gran uso de la configuración");

        jLabel5.setText("5. Velocidad de las tansacciones");

        jLabel6.setText("6. Entrada de datos en línea");

        jLabel7.setText("7. Diseño para la eficiencia del usuario final");

        jLabel8.setText("8. Actualización de datos");

        jLabel9.setText("9. Complejidad del proceso lógico interno de la aplicación");

        jLabel10.setText("10. Reusabilidad del código");

        jLabel11.setText("11. Facilidad de instalación");

        jLabel12.setText("12. Facilidad de operación");

        jLabel13.setText("13. Localización múltiples");

        jLabel14.setText("14. Facilidad de cambios");

        jTextField1.setText("0");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setText("0");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setText("0");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setText("0");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setText("0");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setText("0");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setText("0");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setText("0");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setText("0");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.setText("0");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.setText("0");
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField12.setText("0");
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField13.setText("0");
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jTextField14.setText("0");
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jLabel15.setText("Una vez introducida la característica hay que hacer intro para que se guarde.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField14, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jTextField13)
                    .addComponent(jTextField12)
                    .addComponent(jTextField11)
                    .addComponent(jTextField10)
                    .addComponent(jTextField9)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6)
                    .addComponent(jTextField7)
                    .addComponent(jTextField8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSuma)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSuma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        if(Integer.parseInt(this.jTextField1.getText()) < 0 || Integer.parseInt(this.jTextField1.getText()) > 5) {
            JOptionPane.showMessageDialog(null,"La influencia solo puede tener un valor de 0 a 5.");
            return;
        }
        this.p.anadirCaracteristica(0, Integer.parseInt(this.jTextField1.getText()));
        this.p.calcularPFA();
        this.actualizar();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        if(Integer.parseInt(this.jTextField2.getText()) < 0 || Integer.parseInt(this.jTextField2.getText()) > 5) {
            JOptionPane.showMessageDialog(null,"La influencia solo puede tener un valor de 0 a 5.");
            return;
        }
        this.p.anadirCaracteristica(1, Integer.parseInt(this.jTextField2.getText()));
        this.p.calcularPFA();
        this.actualizar();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        if(Integer.parseInt(this.jTextField3.getText()) < 0 || Integer.parseInt(this.jTextField3.getText()) > 5) {
            JOptionPane.showMessageDialog(null,"La influencia solo puede tener un valor de 0 a 5.");
            return;
        }
        this.p.anadirCaracteristica(2, Integer.parseInt(this.jTextField3.getText()));
        this.p.calcularPFA();
        this.actualizar();
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        if(Integer.parseInt(this.jTextField4.getText()) < 0 || Integer.parseInt(this.jTextField4.getText()) > 5) {
            JOptionPane.showMessageDialog(null,"La influencia solo puede tener un valor de 0 a 5.");
            return;
        }
        this.p.anadirCaracteristica(3, Integer.parseInt(this.jTextField4.getText()));
        this.p.calcularPFA();
        this.actualizar();
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        if(Integer.parseInt(this.jTextField5.getText()) < 0 || Integer.parseInt(this.jTextField5.getText()) > 5) {
            JOptionPane.showMessageDialog(null,"La influencia solo puede tener un valor de 0 a 5.");
            return;
        }
        this.p.anadirCaracteristica(4, Integer.parseInt(this.jTextField5.getText()));
        this.p.calcularPFA();
        this.actualizar();
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        if(Integer.parseInt(this.jTextField6.getText()) < 0 || Integer.parseInt(this.jTextField6.getText()) > 5) {
            JOptionPane.showMessageDialog(null,"La influencia solo puede tener un valor de 0 a 5.");
            return;
        }
        this.p.anadirCaracteristica(5, Integer.parseInt(this.jTextField6.getText()));
        this.p.calcularPFA();
        this.actualizar();
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        if(Integer.parseInt(this.jTextField7.getText()) < 0 || Integer.parseInt(this.jTextField7.getText()) > 5) {
            JOptionPane.showMessageDialog(null,"La influencia solo puede tener un valor de 0 a 5.");
            return;
        }
        this.p.anadirCaracteristica(6, Integer.parseInt(this.jTextField7.getText()));
        this.p.calcularPFA();
        this.actualizar();
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        if(Integer.parseInt(this.jTextField8.getText()) < 0 || Integer.parseInt(this.jTextField8.getText()) > 5) {
            JOptionPane.showMessageDialog(null,"La influencia solo puede tener un valor de 0 a 5.");
            return;
        }
        this.p.anadirCaracteristica(7, Integer.parseInt(this.jTextField8.getText()));
        this.p.calcularPFA();
        this.actualizar();
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        if(Integer.parseInt(this.jTextField9.getText()) < 0 || Integer.parseInt(this.jTextField9.getText()) > 5) {
            JOptionPane.showMessageDialog(null,"La influencia solo puede tener un valor de 0 a 5.");
            return;
        }
        this.p.anadirCaracteristica(8, Integer.parseInt(this.jTextField9.getText()));
        this.p.calcularPFA();
        this.actualizar();
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        if(Integer.parseInt(this.jTextField10.getText()) < 0 || Integer.parseInt(this.jTextField10.getText()) > 5) {
            JOptionPane.showMessageDialog(null,"La influencia solo puede tener un valor de 0 a 5.");
            return;
        }
        this.p.anadirCaracteristica(9, Integer.parseInt(this.jTextField10.getText()));
        this.p.calcularPFA();
        this.actualizar();
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        if(Integer.parseInt(this.jTextField11.getText()) < 0 || Integer.parseInt(this.jTextField11.getText()) > 5) {
            JOptionPane.showMessageDialog(null,"La influencia solo puede tener un valor de 0 a 5.");
            return;
        }
        this.p.anadirCaracteristica(10, Integer.parseInt(this.jTextField11.getText()));
        this.p.calcularPFA();
        this.actualizar();
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        if(Integer.parseInt(this.jTextField12.getText()) < 0 || Integer.parseInt(this.jTextField12.getText()) > 5) {
            JOptionPane.showMessageDialog(null,"La influencia solo puede tener un valor de 0 a 5.");
            return;
        }
        this.p.anadirCaracteristica(11, Integer.parseInt(this.jTextField12.getText()));
        this.p.calcularPFA();
        this.actualizar();
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        if(Integer.parseInt(this.jTextField13.getText()) < 0 || Integer.parseInt(this.jTextField13.getText()) > 5) {
            JOptionPane.showMessageDialog(null,"La influencia solo puede tener un valor de 0 a 5.");
            return;
        }
        this.p.anadirCaracteristica(12, Integer.parseInt(this.jTextField13.getText()));
        this.p.calcularPFA();
        this.actualizar();
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        if(Integer.parseInt(this.jTextField14.getText()) < 0 || Integer.parseInt(this.jTextField14.getText()) > 5) {
            JOptionPane.showMessageDialog(null,"La influencia solo puede tener un valor de 0 a 5.");
            return;
        }
        this.p.anadirCaracteristica(13, Integer.parseInt(this.jTextField14.getText()));
        this.p.calcularPFA();
        this.actualizar();
    }//GEN-LAST:event_jTextField14ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSuma;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
    
    public void actualizar(){
        int[] valores = p.getCaracteristicas();
        this.jTextField1.setText(""+ valores[0]);
        this.jTextField2.setText(""+ valores[1]);
        this.jTextField3.setText(""+ valores[2]);
        this.jTextField4.setText(""+ valores[3]);
        this.jTextField5.setText(""+ valores[4]);
        this.jTextField6.setText(""+ valores[5]);
        this.jTextField7.setText(""+ valores[6]);
        this.jTextField8.setText(""+ valores[7]);
        this.jTextField9.setText(""+ valores[8]);
        this.jTextField10.setText(""+ valores[9]);
        this.jTextField11.setText(""+ valores[10]);
        this.jTextField12.setText(""+ valores[11]);
        this.jTextField13.setText(""+ valores[12]);
        this.jTextField14.setText(""+ valores[12]);
        
        int suma = 0;
        for(int i =0; i<14;i++){
            suma+=valores[i];
        }
        this.jLabelSuma.setText("SUMA: " + suma);
        p.setSva(suma);
    }
}
