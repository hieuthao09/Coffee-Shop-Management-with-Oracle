/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BLL.ExecuteData;
import BLL.GetData;
import BLL.UpdateData;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author HieuThao
 */
public class Role
        extends javax.swing.JPanel {
    private GetData x = new GetData();
    private UpdateData up = new UpdateData ();
    private ExecuteData y = new ExecuteData();
    private boolean flag;
    /**
     * Creates new form Role
     */
    public Role() {
        initComponents ();
        LoadComboBoxObjectname();
        flag = false;
        lbl_Pass.setVisible (flag);
        txt_Pass.setVisible (flag);
        cbo_objectname.setSelectedIndex (0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rd_grp1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        lbl_Pass = new javax.swing.JLabel();
        txt_Pass = new javax.swing.JTextField();
        rdo_Pass = new javax.swing.JRadioButton();
        rdo_NotPass = new javax.swing.JRadioButton();
        txt_role_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_Create = new javax.swing.JButton();
        btn_updaterole = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        cbo_objectname = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ckb_insert = new javax.swing.JCheckBox();
        ckb_delete = new javax.swing.JCheckBox();
        cbk_update = new javax.swing.JCheckBox();
        ckb_select = new javax.swing.JCheckBox();
        btn_InsertPriv = new javax.swing.JButton();
        btn_Revoke = new javax.swing.JButton();
        ckb_all = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thiệt lập role", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbl_Pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Pass.setText("Mật khẩu");

        rd_grp1.add(rdo_Pass);
        rdo_Pass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdo_Pass.setText("Mật khẩu");
        rdo_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_PassActionPerformed(evt);
            }
        });

        rd_grp1.add(rdo_NotPass);
        rdo_NotPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdo_NotPass.setText("Không mật khẩu");

        txt_role_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tên role");

        btn_Create.setText("Tạo");
        btn_Create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CreateMouseClicked(evt);
            }
        });

        btn_updaterole.setText("Cập nhật");
        btn_updaterole.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_updateroleMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_Pass)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_role_name, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btn_Create, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_updaterole, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdo_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdo_NotPass))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_role_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdo_Pass))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Pass)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(rdo_NotPass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Create, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_updaterole, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        Panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thiệt lập quyền cho role", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        Panel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbo_objectname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbo_objectname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_objectnameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Đối tượng");

        ckb_insert.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckb_insert.setText("Insert");

        ckb_delete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckb_delete.setText("Delete");

        cbk_update.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbk_update.setText("Update");

        ckb_select.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckb_select.setText("Select");

        btn_InsertPriv.setText("Cấp quyền");
        btn_InsertPriv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_InsertPrivMousePressed(evt);
            }
        });

        btn_Revoke.setText("Thu hồi");
        btn_Revoke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_RevokeMousePressed(evt);
            }
        });

        ckb_all.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ckb_all.setText("Tất cả");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(ckb_insert)
                        .addGap(18, 18, 18)
                        .addComponent(ckb_delete)
                        .addGap(18, 18, 18)
                        .addComponent(cbk_update)
                        .addGap(18, 18, 18)
                        .addComponent(ckb_select)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckb_all))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbo_objectname, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(btn_InsertPriv, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Revoke, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbo_objectname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckb_insert)
                    .addComponent(ckb_delete)
                    .addComponent(cbk_update)
                    .addComponent(ckb_select)
                    .addComponent(ckb_all))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_InsertPriv, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Revoke, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("THIẾT LẬP ROLES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(248, 248, 248)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rdo_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_PassActionPerformed
        // TODO add your handling code here:
        if(rdo_Pass.isSelected ())
        {
            flag = true;
            lbl_Pass.setVisible (flag);
            txt_Pass.setVisible (flag);
        }
    }//GEN-LAST:event_rdo_PassActionPerformed

    private void btn_CreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CreateMouseClicked
        // TODO add your handling code here:
        String name = txt_role_name.getText ();
        String pass = txt_Pass.getText ();
        if(rdo_Pass.isSelected ())
        {
             up.createRoleWithPass (name,pass);
        }
       else
            up.createRoleWithNotPass (name);
        JOptionPane.showMessageDialog(this, "Tạo role thành công!","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_CreateMouseClicked

    private void btn_updateroleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateroleMousePressed
        // TODO add your handling code here:
        String name = txt_role_name.getText ();
        String pass = txt_Pass.getText ();
        if(rdo_Pass.isSelected ())
        {
             up.alterRoleWithPass (name,pass);
        }
       else
            up.alterRoleWithNotPass (name);
        JOptionPane.showMessageDialog(this, "Cập nhật role thành công!","Thông Báo",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_updateroleMousePressed

    private void btn_InsertPrivMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_InsertPrivMousePressed
        // TODO add your handling code here:
        String priv = "";
        String name = txt_role_name.getText ();
        String obj = cbo_objectname.getSelectedItem ().toString ();
        
        if(ckb_all.isSelected ())
        {
             up.grantAllToRole (name,obj);
             
        }
        else
        {
             for(Component com : Panel2.getComponents ())
            {
                if(com instanceof JCheckBox)
                {
                    JCheckBox box = (JCheckBox)com;
                    if(box.isSelected ())
                    {
                        priv += box.getText ();
                    }
                }
            }
            up.grantPrivToRole (priv,name,obj);
        }
       
        JOptionPane.showMessageDialog(this, String.format ("Cấp quyền cho role %s thành công!", name),"Thông Báo",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btn_InsertPrivMousePressed

    private void btn_RevokeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RevokeMousePressed
        // TODO add your handling code here:
        String priv = "";
        String name = txt_role_name.getText ();
        String obj = cbo_objectname.getSelectedItem ().toString ();
        if(ckb_all.isSelected ())
        {
             up.revokeAllToRole (name,obj);
             
        }
        else
        {
             for(Component com : Panel2.getComponents ())
            {
                if(com instanceof JCheckBox)
                {
                    JCheckBox box = (JCheckBox)com;
                    if(box.isSelected ())
                    {
                        priv += box.getText ();
                    }
                }
            }
            up.revokeRole (priv,name,obj);
        }
        JOptionPane.showMessageDialog(this, String.format ("Cấp quyền cho role %s thành công!", name),"Thông Báo",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_btn_RevokeMousePressed

    private void cbo_objectnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_objectnameActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbo_objectnameActionPerformed
    
    private void LoadComboBoxObjectname()
    {
         ArrayList TableName = x.getTableName ();
        for(var e:TableName)
        {
            cbo_objectname.addItem(e.toString());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton btn_Create;
    private javax.swing.JButton btn_InsertPriv;
    private javax.swing.JButton btn_Revoke;
    private javax.swing.JButton btn_updaterole;
    private javax.swing.JCheckBox cbk_update;
    private javax.swing.JComboBox<String> cbo_objectname;
    private javax.swing.JCheckBox ckb_all;
    private javax.swing.JCheckBox ckb_delete;
    private javax.swing.JCheckBox ckb_insert;
    private javax.swing.JCheckBox ckb_select;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_Pass;
    private javax.swing.ButtonGroup rd_grp1;
    private javax.swing.JRadioButton rdo_NotPass;
    private javax.swing.JRadioButton rdo_Pass;
    private javax.swing.JTextField txt_Pass;
    private javax.swing.JTextField txt_role_name;
    // End of variables declaration//GEN-END:variables
}