/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;
import reto3.CuerpoDeAgua;

/**
 *
 * @author Esteban
 */
public class Screen extends javax.swing.JFrame {

    /**
     * Creates new form Screen
     */
    public Screen() {
        initComponents();
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
        txt_name = new javax.swing.JTextField();
        lbl_name = new javax.swing.JLabel();
        txt_city = new javax.swing.JTextField();
        lbl_city = new javax.swing.JLabel();
        txt_water_type = new javax.swing.JTextField();
        lbl_water_type = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_id = new javax.swing.JLabel();
        txt_body_type = new javax.swing.JTextField();
        lbl_body_type = new javax.swing.JLabel();
        txt_risk = new javax.swing.JTextField();
        lbl_risk = new javax.swing.JLabel();
        btn_reg = new javax.swing.JButton();
        btn_process = new javax.swing.JButton();
        lbl_inputs = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_inputs = new javax.swing.JTextArea();
        btn_new = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_outputs = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_outputs = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reto 3 Ciclo 2 Grupo NRC 1870");
        setResizable(false);

        txt_name.setToolTipText("");
        txt_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        lbl_name.setText("Nombre");

        txt_city.setToolTipText("");
        txt_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cityActionPerformed(evt);
            }
        });

        lbl_city.setText("Municipio");

        txt_water_type.setToolTipText("");
        txt_water_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_water_typeActionPerformed(evt);
            }
        });

        lbl_water_type.setText("Tipo de agua");

        txt_id.setToolTipText("");
        txt_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_idFocusLost(evt);
            }
        });
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        lbl_id.setText("ID");

        txt_body_type.setToolTipText("");
        txt_body_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_body_typeActionPerformed(evt);
            }
        });

        lbl_body_type.setText("Tipo de cuerpo de agua");

        txt_risk.setToolTipText("");
        txt_risk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_riskFocusLost(evt);
            }
        });
        txt_risk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_riskActionPerformed(evt);
            }
        });

        lbl_risk.setText("IRCA");

        btn_reg.setText("Registrar");
        btn_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regActionPerformed(evt);
            }
        });

        btn_process.setText("Procesar");
        btn_process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_processActionPerformed(evt);
            }
        });

        lbl_inputs.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_inputs.setText("Datos registrados");

        txta_inputs.setEditable(false);
        txta_inputs.setColumns(20);
        txta_inputs.setRows(5);
        jScrollPane2.setViewportView(txta_inputs);

        btn_new.setText("Nueva Consulta");
        btn_new.setEnabled(false);
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_inputs, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_name, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_city, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_water_type, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_water_type, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_process, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_risk, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_body_type, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_risk, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_body_type, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btn_new)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_city)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_water_type)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_water_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_process)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_id)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_body_type)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_body_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_risk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_risk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_new)
                        .addGap(33, 33, 33)))
                .addComponent(lbl_inputs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setEnabled(false);

        lbl_outputs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_outputs.setText("Resultado");

        txta_outputs.setEditable(false);
        txta_outputs.setColumns(20);
        txta_outputs.setRows(5);
        jScrollPane1.setViewportView(txta_outputs);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_outputs, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbl_outputs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Realizado por Esteban Cabarcas Henao");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_riskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_riskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_riskActionPerformed

    private void txt_body_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_body_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_body_typeActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_water_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_water_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_water_typeActionPerformed

    private void txt_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cityActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void btn_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regActionPerformed
        txt_idVerify();
        txt_riskVerify();
        if(txt_body_type.getText().isEmpty()|txt_city.getText().isEmpty()|
            txt_id.getText().isEmpty()|txt_name.getText().isEmpty()|
            txt_risk.getText().isEmpty()|txt_water_type.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(rootPane, 
                    "Faltan campos por rellenar.");
        }else{
        txta_inputs.append(txt_name.getText()+" "+txt_id.getText()+" "
                +txt_city.getText()+" "+txt_body_type.getText()+" "
                +txt_water_type.getText()+" "+txt_risk.getText()+"\n");
        txt_body_type.setText("");
        txt_city.setText("");
        txt_id.setText("");
        txt_name.setText("");
        txt_risk.setText("");
        txt_water_type.setText("");
        txt_name.grabFocus();
        }
    }//GEN-LAST:event_btn_regActionPerformed

    private void btn_processActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_processActionPerformed
        if(txta_inputs.getText().isEmpty()){
        JOptionPane.showMessageDialog(rootPane, "No hay datos registrados, diligencie los campos y oprima registrar primero.");
        }else{
            int counter = 0;                                            
            String v_inputs[] = new String[txta_inputs.getRows()];
            v_inputs = txta_inputs.getText().split("\n");
            CuerpoDeAgua vectorc[] = new CuerpoDeAgua[v_inputs.length];
            for (int i = 0; i < v_inputs.length; i++) {
                String row [] = new String[6];
                row = v_inputs[i].split(" ");
                vectorc[i] = new CuerpoDeAgua();
                vectorc[i].setName(row[0]);
                vectorc[i].setId(Integer.parseInt(row[1]));
                vectorc[i].setCity(row[2]);
                vectorc[i].setRisk_index(Float.parseFloat(row[5]));
            }

            for (CuerpoDeAgua c : vectorc) {
                txta_outputs.append("ID."+ c.getId() + " riesgo: " + c.getRisk_lvl() + ".\n");
            }
            txta_outputs.append("------------------\n");
            for (CuerpoDeAgua c : vectorc) {
                if(c.getRisk_index()>= 0 & c.getRisk_index()<= 35){
                    counter ++;
                }
            }
            txta_outputs.append("hay "+String.valueOf(counter)+ " cuerpos de agua con riesgo Medio o inferior.\n");
            txta_outputs.append("------------------\n");
            txta_outputs.append("Nombre de cuerpos de agua con riesgo MEDIO: \n");
            counter = 0;
            for (CuerpoDeAgua c : vectorc) {
                if(c.getRisk_lvl().equals("MEDIO")){
                    txta_outputs.append(String.valueOf(counter+1) + ". " + c.getName()+"\n");
                    counter ++;
                }
            }
            if(counter == 0){
                txta_outputs.append("NA.\n");
            }
            txta_outputs.append("------------------\n");

            counter = 0;
            for (int i = 0; i < vectorc.length; i++) {
                if(vectorc[i].getRisk_index() < vectorc[counter].getRisk_index()){
                    counter = i;
                }
            }
            txta_outputs.append("El cuerpo de agua con menor riesgo es:\n");
            txta_outputs.append(vectorc[counter].getName() + ", ID: " + vectorc[counter].getId()+".\n");
            btn_process.setEnabled(false);
            btn_reg.setEnabled(false);
            btn_new.setEnabled(true);
            txt_body_type.setEnabled(false);
            txt_city.setEnabled(false);
            txt_id.setEnabled(false);
            txt_name.setEnabled(false);
            txt_risk.setEnabled(false);
            txt_water_type.setEnabled(false);
        }
    }//GEN-LAST:event_btn_processActionPerformed
    private void txt_idVerify() {                                 
        try {
            Integer.parseInt(txt_id.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Solo se admite n??meros enteros en campo ID.");
            txt_id.setText("");
            txt_id.grabFocus();
        }
    }                                

    private void txt_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_idFocusLost
        txt_idVerify();
    }//GEN-LAST:event_txt_idFocusLost
    private void txt_riskVerify() {                                   
        try {
            Float.parseFloat(txt_risk.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Solo se admite n??meros en campo IRCA.\ntip:decimales con punto no coma.");
            txt_risk.setText("");
            txt_risk.grabFocus();
        }
    }                                  

    private void txt_riskFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_riskFocusLost
        txt_riskVerify();
    }//GEN-LAST:event_txt_riskFocusLost

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        btn_process.setEnabled(true);
        btn_reg.setEnabled(true);
        btn_new.setEnabled(false);
        txt_body_type.setEnabled(true);
        txt_city.setEnabled(true);
        txt_id.setEnabled(true);
        txt_name.setEnabled(true);
        txt_risk.setEnabled(true);
        txt_water_type.setEnabled(true);
        txta_inputs.setText("");
        txta_outputs.setText("");
    }//GEN-LAST:event_btn_newActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_process;
    private javax.swing.JButton btn_reg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_body_type;
    private javax.swing.JLabel lbl_city;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_inputs;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_outputs;
    private javax.swing.JLabel lbl_risk;
    private javax.swing.JLabel lbl_water_type;
    private javax.swing.JTextField txt_body_type;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_risk;
    private javax.swing.JTextField txt_water_type;
    private javax.swing.JTextArea txta_inputs;
    private javax.swing.JTextArea txta_outputs;
    // End of variables declaration//GEN-END:variables
}
