
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class FontWindow extends javax.swing.JFrame {  
    /**
     * Creates new form FontWindow
     */
    
    private String fontName = "Arial";
    private int fontStyle = 0;
    private int fontSize = 10;

    public FontWindow() {
        initComponents();
        displayFontList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fontEdit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        font_list = new javax.swing.JList<>();
        fontStyleText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        Font_Size = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        previewPanel = new javax.swing.JPanel();
        sampleText = new javax.swing.JLabel();
        font_window_ok_button = new javax.swing.JButton();
        font_window_cancel_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Font");
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Font:");

        font_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "MS Serif", "MS Sans Serif", "Small Fonts", "Marlett", "Arial", "Arabic Transparent", "Arial Baltic", "Arial CE", "Arial CYR", "Arial Greek" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        font_list.setSelectedIndex(0);
        font_list.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                font_listAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        font_list.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                font_listCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        font_list.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                font_listValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(font_list);

        jLabel2.setText("Font style:");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Normal", "Bold", "Italic" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList2.setSelectedIndex(0);
        jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList2ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel3.setText("Size:");

        Font_Size.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Font_SizeKeyTyped(evt);
            }
        });

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList3.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList3ValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jList3);

        previewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Sample"));
        previewPanel.setMaximumSize(new java.awt.Dimension(331, 130));
        previewPanel.setMinimumSize(new java.awt.Dimension(331, 130));
        previewPanel.setPreferredSize(new java.awt.Dimension(331, 130));

        sampleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sampleText.setText("AaBbYyZz");
        sampleText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout previewPanelLayout = new javax.swing.GroupLayout(previewPanel);
        previewPanel.setLayout(previewPanelLayout);
        previewPanelLayout.setHorizontalGroup(
            previewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, previewPanelLayout.createSequentialGroup()
                .addContainerGap(136, Short.MAX_VALUE)
                .addComponent(sampleText)
                .addGap(131, 131, 131))
        );
        previewPanelLayout.setVerticalGroup(
            previewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(previewPanelLayout.createSequentialGroup()
                .addComponent(sampleText)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        font_window_ok_button.setText("OK");
        font_window_ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                font_window_ok_buttonActionPerformed(evt);
            }
        });

        font_window_cancel_button.setText("Cancel");
        font_window_cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                font_window_cancel_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(font_window_ok_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(font_window_cancel_button))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fontEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fontStyleText)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(Font_Size)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fontEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fontStyleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Font_Size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(previewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(font_window_ok_button)
                    .addComponent(font_window_cancel_button))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void font_listAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_font_listAncestorMoved

    }//GEN-LAST:event_font_listAncestorMoved

    private void font_listCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_font_listCaretPositionChanged

    }//GEN-LAST:event_font_listCaretPositionChanged

    private void font_listValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_font_listValueChanged
        changedFont();
        setFont();
    }//GEN-LAST:event_font_listValueChanged

    public String getFontName() {
        return this.fontName;
    }
    
    public int getFontStyle() {
        return this.fontStyle;
    }    
    
    public int getFontSize() {
        return this.fontSize;
    }
    
    private void jList2ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList2ValueChanged
        changedFontStyle();
        setFont();
    }//GEN-LAST:event_jList2ValueChanged
    private void displayFontList() {

        DefaultListModel listModel;
        listModel = new DefaultListModel();

        String fonts[] = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();
        for (String font : fonts) {
            listModel.addElement(font);
        }
        font_list.setModel(listModel);
    }
    private void jList3ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList3ValueChanged
        changedFontSize();
        setFont();
    }//GEN-LAST:event_jList3ValueChanged

    private void Font_SizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Font_SizeKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        }
    }//GEN-LAST:event_Font_SizeKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void font_window_ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_font_window_ok_buttonActionPerformed
        saveProperties();
        this.dispose();
    }//GEN-LAST:event_font_window_ok_buttonActionPerformed

    private void font_window_cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_font_window_cancel_buttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_font_window_cancel_buttonActionPerformed

    private void changedFont() {
        this.fontName = font_list.getSelectedValue();
        fontEdit.setText(this.fontName);
    }

    private void changedFontStyle() {
        this.fontStyle = jList2.getSelectedIndex();
        fontStyleText.setText(jList2.getSelectedValue());
    }

    private void changedFontSize() {
        this.fontSize = Integer.parseInt(jList3.getSelectedValue());
        Font_Size.setText(String.valueOf(this.fontSize));
        //bold = 1 italic = 2 plain = 0                     
    }

    private void setFont() {
        sampleText.setFont(new Font(
                this.fontName,
                this.fontStyle,
                this.fontSize));
    }

    public void saveProperties() {
        try(OutputStream output = new FileOutputStream("config.properties") ){
            Properties props = new Properties();
            props.setProperty("FontName", this.fontName);
            props.setProperty("FontStyle", String.valueOf(this.fontStyle));
            props.setProperty("FontSize", String.valueOf(this.fontSize));           
            props.store(output, "config.properties");
        } catch (Exception e) {
          System.out.println("error:" + e);
        }
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
            java.util.logging.Logger.getLogger(FontWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FontWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FontWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FontWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FontWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Font_Size;
    private javax.swing.JTextField fontEdit;
    private javax.swing.JTextField fontStyleText;
    private javax.swing.JList<String> font_list;
    private javax.swing.JButton font_window_cancel_button;
    private javax.swing.JButton font_window_ok_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel previewPanel;
    private javax.swing.JLabel sampleText;
    // End of variables declaration//GEN-END:variables


}
