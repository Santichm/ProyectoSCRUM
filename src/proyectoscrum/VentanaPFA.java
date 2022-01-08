/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoscrum;

/**
 *
 * @author Santi
 */
public class VentanaPFA extends javax.swing.JFrame {

    private Proyecto p;
    /**
     * Creates new form VentanaPFA
     */
    public VentanaPFA(Proyecto p) {
        this.p = p;
        initComponents();
        
        this.jLabelFA.setText("FA = 0,65 + (0,01 * " + p.getSva() + ") = " +  p.getFa());
        this.jLabelPFA.setText("PFA = " + (this.p.getPfnaCE() + this.p.getPfnaEE() + this.p.getPfnaFLE() + this.p.getPfnaFLI() + this.p.getPfnaSE()) + " * " + this.p.getFa() + " = " + this.p.getPfa());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFA = new javax.swing.JLabel();
        jLabelPFA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Puntos de función ajustados");

        jLabelFA.setText("FA = 0.65 + (0.01 * SVA) = ");

        jLabelPFA.setText("PFA = PFNA * FA = ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPFA)
                    .addComponent(jLabelFA))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelFA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPFA)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelFA;
    private javax.swing.JLabel jLabelPFA;
    // End of variables declaration//GEN-END:variables
}