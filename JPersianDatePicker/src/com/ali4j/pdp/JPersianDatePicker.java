
package com.ali4j.pdp;

import com.ghasemkiani.util.DateFields;
import com.ghasemkiani.util.SimplePersianCalendar;
import com.ghasemkiani.util.icu.PersianCalendar;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author ehsan
 */
public class JPersianDatePicker extends javax.swing.JFrame {

    
    static private Integer year = null;
    static private Integer month = null;
    static private Integer day = null;
    
    static private Integer currentYear  = null;
    static private Integer currentMonth = null;
    static private Integer currentDay   = null;
    
    private final SimplePersianCalendar simpleparsCalendar = new SimplePersianCalendar();
    private final DateFields dateFields = simpleparsCalendar.getDateFields();
    
    private PersianCalendar pc = new PersianCalendar();

    
    private JTextField targetTextField =  null;
    
    
    
    
    public JPersianDatePicker(JTextField textField) {
        initComponents();
        this.targetTextField = textField;
        year = dateFields.getYear();
        month = dateFields.getMonth();
        day = 1;
        
        currentYear  = dateFields.getYear();
        currentMonth = dateFields.getMonth();
        currentDay   = dateFields.getDay();

        currentYearLabel.setText(year.toString());
        currentMonthLabel.setText(SimplePersianCalendar.getPersianMonthName(month));

        
        refreshCalendar(year, month, day);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nextMonthButton = new javax.swing.JButton();
        currentYearLabel = new javax.swing.JLabel();
        prevMonthButton = new javax.swing.JButton();
        exitJButton = new javax.swing.JButton();
        toDayJButton = new javax.swing.JButton();
        currentMonthLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 255, 51));
        jPanel1.setOpaque(false);

        nextMonthButton.setText("<|");
        nextMonthButton.setToolTipText("ماه بعدی");
        nextMonthButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        nextMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextMonthButtonActionPerformed(evt);
            }
        });

        currentYearLabel.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        currentYearLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        currentYearLabel.setText("1394");
        currentYearLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        prevMonthButton.setText("|>");
        prevMonthButton.setToolTipText("ماه قبلی");
        prevMonthButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        prevMonthButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevMonthButtonActionPerformed(evt);
            }
        });

        exitJButton.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        exitJButton.setText("خروج");
        exitJButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        exitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitJButtonActionPerformed(evt);
            }
        });

        toDayJButton.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        toDayJButton.setText("امروز");
        toDayJButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        toDayJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toDayJButtonActionPerformed(evt);
            }
        });

        currentMonthLabel.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        currentMonthLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        currentMonthLabel.setText("اردیبهشت");
        currentMonthLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(nextMonthButton)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(toDayJButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(currentYearLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(currentMonthLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(27, 27, 27)
                .add(exitJButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(prevMonthButton))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(toDayJButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(nextMonthButton))
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(prevMonthButton)
                        .add(exitJButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(currentYearLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(currentMonthLabel)))
                .add(0, 0, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "شن", "یک", "دو", "سه", "چه", "پن", "جم"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jTable1.setRowSelectionAllowed(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }
        jTable1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jTable1.getTableHeader().setFont(new Font("Tahoma", Font.PLAIN, 8));
        jTable1.setDefaultRenderer(Object.class,new CustomRenderer());

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
            .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 193, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0))
        );

        pack();
    }// </editor-fold>                        

    private void toDayJButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        year = currentYear;
        month = currentMonth;
        refreshCalendar(currentYear, currentMonth, 1);
    }                                            

    private void exitJButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        this.setVisible(false);
        this.dispose();
    }                                           

    private void prevMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if (month == 0) {
            month = 11;
            year--;
            refreshCalendar(year, month, day);
        }else {
            refreshCalendar(year, --month, day);
        }

    }                                               

    private void nextMonthButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                
        if (month == 11) {
            month = 0;
            year++;
            refreshCalendar(year, month, day);
        } else {
            refreshCalendar(year, ++month, day);
        }

    }                                               

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        int row = jTable1.rowAtPoint(evt.getPoint());
        int col = jTable1.columnAtPoint(evt.getPoint());
        if (row >= 0 && col >= 0) {        
            if (jTable1.getValueAt(row, col) != null) {
                if (month == 12) {
                    System.out.println("you clicked value:" + year + "/" + 1 + "/" + (Integer)jTable1.getValueAt(row, col));
                    targetTextField.setText(year + "/" + 1 + "/" + (Integer)jTable1.getValueAt(row, col));
                } else {
                    System.out.println("you clicked value:" + year + "/" + (month+1) + "/" + (Integer)jTable1.getValueAt(row, col));
                    targetTextField.setText(year + "/" + (month+1) + "/" + (Integer)jTable1.getValueAt(row, col));
                }
                
            }else {
                
            }
            
            
        }
    }                                    

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Picker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Picker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Picker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Picker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
////                JFrame jf = new Picker();
////                jf.pack();
////                jf.setVisible(true);
////                jf.setLocationRelativeTo(null);
//            }
//        });
//    }
    
    public void refreshCalendar(int pYear, int pMonth, int pDay){

        currentYearLabel.setText(year.toString());
        currentMonthLabel.setText(SimplePersianCalendar.getPersianMonthName(pMonth));

        pc.setTime(new Date(System.currentTimeMillis()));
        int lengthOfMonth = pc.handleGetMonthLength(pYear, pMonth);
        
        simpleparsCalendar.setDateFields(pYear, pMonth, pDay);
        int dayOfWeek = simpleparsCalendar.get(SimplePersianCalendar.DAY_OF_WEEK);


        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
		jTable1.setValueAt(null, i, j);
            }
        }

        int row    = 1;
        int column = dayOfWeek==7?0+1:dayOfWeek+1;
        for (int i=1; i<=lengthOfMonth; i++){
            jTable1.setValueAt(i, row-1, column-1);
            if ( (column%7==0)) {
                column = 1;
                row++;
            } else column++;
        }        
    }    
    
    
    
    class CustomRenderer extends DefaultTableCellRenderer 
    {
	public Component getTableCellRendererComponent(	JTable table, Object value,
							boolean isSelected, boolean hasFocus,
							int row, int column)
	{
	    Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

	    if(!hasFocus) {
	      c.setBackground(new java.awt.Color(255, 255, 255));
	    }
            if (year.equals(currentYear) && month.equals(currentMonth)) {
                Object currentCellValue = table.getValueAt(row, column);
                String str;
                if (currentCellValue != null) {
                    str = ((Integer)currentCellValue).toString();
                    if (currentDay.toString().equals(str)) {
                        c.setBackground(new java.awt.Color(20, 255, 20));
                    }
                }
            }
	    return c;
	}
    }
    
    
    
    

    // Variables declaration - do not modify                     
    private javax.swing.JLabel currentMonthLabel;
    private javax.swing.JLabel currentYearLabel;
    private javax.swing.JButton exitJButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nextMonthButton;
    private javax.swing.JButton prevMonthButton;
    private javax.swing.JButton toDayJButton;
    // End of variables declaration                   

}