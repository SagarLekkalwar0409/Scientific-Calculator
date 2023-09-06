
package scientific_calculator;
 //@author SAGAR SANJAY LEKKALWAR
 
public class Sci_Calculator extends javax.swing.JFrame {
    
    //variable creating to store numbers;
    double num1=0;
    double num2=0;
    String operator=null;
    
    
    
   //this method for when we chick on ON button then screen is on;
    
      public void enable(){
        
        t1.setEnabled(true);
             
        
    }
    //this method for when we chick on Of button then screen is Of;
    
     public void disable(){
        
        t1.setEnabled(false);
         
    }

    public Sci_Calculator() {
        initComponents();
        bOff.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        t1 = new javax.swing.JTextField();
        bOff = new javax.swing.JRadioButton();
        bOn = new javax.swing.JRadioButton();
        bSquare = new javax.swing.JButton();
        bPlusMinus = new javax.swing.JButton();
        bRoot = new javax.swing.JButton();
        bCloseB = new javax.swing.JButton();
        bOpenB = new javax.swing.JButton();
        blog = new javax.swing.JButton();
        bCude = new javax.swing.JButton();
        bSin = new javax.swing.JButton();
        bCos = new javax.swing.JButton();
        bTan = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bDel = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        bMul = new javax.swing.JButton();
        bDivide = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        bPlus = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bMinus = new javax.swing.JButton();
        bEqualTo = new javax.swing.JButton();
        bzero = new javax.swing.JButton();
        bDot = new javax.swing.JButton();
        bPi = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        t1.setBackground(new java.awt.Color(0, 102, 102));
        t1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        t1.setText("ON FIRST");
        t1.setAlignmentX(1.0F);
        t1.setAlignmentY(1.0F);
        t1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        t1.setCaretColor(new java.awt.Color(255, 255, 255));
        t1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t1.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        t1.setEnabled(false);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        bOff.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(bOff);
        bOff.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bOff.setForeground(new java.awt.Color(255, 255, 255));
        bOff.setSelected(true);
        bOff.setText("OFF");
        bOff.setToolTipText("onn");
        bOff.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.MatteBorder(null)))));
        bOff.setBorderPainted(true);
        bOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOffActionPerformed(evt);
            }
        });

        bOn.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(bOn);
        bOn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bOn.setForeground(new java.awt.Color(255, 255, 255));
        bOn.setText("ON");
        bOn.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.MatteBorder(null)))));
        bOn.setBorderPainted(true);
        bOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOnActionPerformed(evt);
            }
        });

        bSquare.setBackground(new java.awt.Color(51, 51, 51));
        bSquare.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bSquare.setForeground(new java.awt.Color(255, 255, 255));
        bSquare.setText("x² ");
        bSquare.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        bSquare.setEnabled(false);
        bSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSquareActionPerformed(evt);
            }
        });

        bPlusMinus.setBackground(new java.awt.Color(51, 51, 51));
        bPlusMinus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bPlusMinus.setForeground(new java.awt.Color(255, 255, 255));
        bPlusMinus.setText("+/-");
        bPlusMinus.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        bPlusMinus.setEnabled(false);
        bPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlusMinusActionPerformed(evt);
            }
        });

        bRoot.setBackground(new java.awt.Color(51, 51, 51));
        bRoot.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bRoot.setForeground(new java.awt.Color(255, 255, 255));
        bRoot.setText("√ ");
        bRoot.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        bRoot.setEnabled(false);
        bRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRootActionPerformed(evt);
            }
        });

        bCloseB.setBackground(new java.awt.Color(51, 51, 51));
        bCloseB.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bCloseB.setForeground(new java.awt.Color(255, 255, 255));
        bCloseB.setText(")");
        bCloseB.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        bCloseB.setEnabled(false);
        bCloseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseBActionPerformed(evt);
            }
        });

        bOpenB.setBackground(new java.awt.Color(51, 51, 51));
        bOpenB.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bOpenB.setForeground(new java.awt.Color(255, 255, 255));
        bOpenB.setText("(");
        bOpenB.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        bOpenB.setEnabled(false);
        bOpenB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOpenBActionPerformed(evt);
            }
        });

        blog.setBackground(new java.awt.Color(51, 51, 51));
        blog.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        blog.setForeground(new java.awt.Color(255, 255, 255));
        blog.setText("Log");
        blog.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        blog.setEnabled(false);
        blog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogActionPerformed(evt);
            }
        });

        bCude.setBackground(new java.awt.Color(51, 51, 51));
        bCude.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bCude.setForeground(new java.awt.Color(255, 255, 255));
        bCude.setText("x³");
        bCude.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        bCude.setEnabled(false);
        bCude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCudeActionPerformed(evt);
            }
        });

        bSin.setBackground(new java.awt.Color(51, 51, 51));
        bSin.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bSin.setForeground(new java.awt.Color(255, 255, 255));
        bSin.setText("Sin");
        bSin.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        bSin.setEnabled(false);
        bSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSinActionPerformed(evt);
            }
        });

        bCos.setBackground(new java.awt.Color(51, 51, 51));
        bCos.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bCos.setForeground(new java.awt.Color(255, 255, 255));
        bCos.setText("Cos");
        bCos.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        bCos.setEnabled(false);
        bCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCosActionPerformed(evt);
            }
        });

        bTan.setBackground(new java.awt.Color(51, 51, 51));
        bTan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bTan.setForeground(new java.awt.Color(255, 255, 255));
        bTan.setText("Tan");
        bTan.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        bTan.setEnabled(false);
        bTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTanActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(51, 51, 51));
        b9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b9.setForeground(new java.awt.Color(255, 255, 255));
        b9.setText("9");
        b9.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        b9.setEnabled(false);
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bDel.setBackground(new java.awt.Color(51, 51, 51));
        bDel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bDel.setForeground(new java.awt.Color(255, 255, 255));
        bDel.setText("DEL");
        bDel.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        bDel.setEnabled(false);
        bDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDelActionPerformed(evt);
            }
        });

        bClear.setBackground(new java.awt.Color(51, 51, 51));
        bClear.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bClear.setForeground(new java.awt.Color(255, 255, 255));
        bClear.setText("AC");
        bClear.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        bClear.setEnabled(false);
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(51, 51, 51));
        b7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b7.setForeground(new java.awt.Color(255, 255, 255));
        b7.setText("7");
        b7.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        b7.setEnabled(false);
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(51, 51, 51));
        b8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b8.setForeground(new java.awt.Color(255, 255, 255));
        b8.setText("8");
        b8.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        b8.setEnabled(false);
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(51, 51, 51));
        b6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 255, 255));
        b6.setText("6");
        b6.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        b6.setEnabled(false);
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(51, 51, 51));
        b4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 255));
        b4.setText("4");
        b4.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        b4.setEnabled(false);
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(51, 51, 51));
        b5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 255));
        b5.setText("5");
        b5.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        b5.setEnabled(false);
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        bMul.setBackground(new java.awt.Color(0, 102, 102));
        bMul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bMul.setForeground(new java.awt.Color(255, 255, 255));
        bMul.setText("*");
        bMul.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));
        bMul.setEnabled(false);
        bMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMulActionPerformed(evt);
            }
        });

        bDivide.setBackground(new java.awt.Color(0, 130, 130));
        bDivide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bDivide.setForeground(new java.awt.Color(255, 255, 255));
        bDivide.setText("/");
        bDivide.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));
        bDivide.setEnabled(false);
        bDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivideActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(51, 51, 51));
        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("1");
        b1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        b1.setEnabled(false);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        bPlus.setBackground(new java.awt.Color(0, 130, 130));
        bPlus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bPlus.setForeground(new java.awt.Color(255, 255, 255));
        bPlus.setText("+");
        bPlus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));
        bPlus.setEnabled(false);
        bPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPlusActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(51, 51, 51));
        b2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("2");
        b2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        b2.setEnabled(false);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(51, 51, 51));
        b3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 255));
        b3.setText("3");
        b3.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        b3.setEnabled(false);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        bMinus.setBackground(new java.awt.Color(0, 102, 102));
        bMinus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bMinus.setForeground(new java.awt.Color(255, 255, 255));
        bMinus.setText("-");
        bMinus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.black, null, null));
        bMinus.setEnabled(false);
        bMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMinusActionPerformed(evt);
            }
        });

        bEqualTo.setBackground(new java.awt.Color(0, 0, 0));
        bEqualTo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bEqualTo.setForeground(new java.awt.Color(255, 255, 255));
        bEqualTo.setText("=");
        bEqualTo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 4, true));
        bEqualTo.setEnabled(false);
        bEqualTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEqualToActionPerformed(evt);
            }
        });

        bzero.setBackground(new java.awt.Color(51, 51, 51));
        bzero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bzero.setForeground(new java.awt.Color(255, 255, 255));
        bzero.setText("0");
        bzero.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        bzero.setEnabled(false);
        bzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bzeroActionPerformed(evt);
            }
        });

        bDot.setBackground(new java.awt.Color(51, 51, 51));
        bDot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bDot.setForeground(new java.awt.Color(255, 255, 255));
        bDot.setText(".");
        bDot.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        bDot.setEnabled(false);
        bDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDotActionPerformed(evt);
            }
        });

        bPi.setBackground(new java.awt.Color(51, 51, 51));
        bPi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bPi.setForeground(new java.awt.Color(255, 255, 255));
        bPi.setText("π");
        bPi.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        bPi.setEnabled(false);
        bPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPiActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 5, true)));

        jTextPane1.setBackground(new java.awt.Color(0, 153, 153));
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText("Scientific Calculator");
        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bPi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bzero, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDot, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bEqualTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(blog, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bSin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCude, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bOpenB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCloseB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bCos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bTan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(bOff)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bOn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bClear, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bMul, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bOff)
                            .addComponent(bOn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blog)
                            .addComponent(bSin)
                            .addComponent(bCos)
                            .addComponent(bTan)
                            .addComponent(bPlusMinus))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bCude, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(bSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bOpenB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bCloseB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bClear, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMul, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bPi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bzero, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDot, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bEqualTo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void bOffActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	//this is for when we click on OFF button then all Key is OFF;
         b1.setEnabled(false);
         b2.setEnabled(false);
         b3.setEnabled(false);
         b4.setEnabled(false);
         b5.setEnabled(false);
         b6.setEnabled(false);
         b7.setEnabled(false);
         b8.setEnabled(false);
         b9.setEnabled(false);
         bzero.setEnabled(false);
         
         bDot.setEnabled(false); 
         
         bPlus.setEnabled(false);
         bMinus.setEnabled(false);
         bMul.setEnabled(false);
         bDivide.setEnabled(false);
         
         bEqualTo.setEnabled(false);
         
         bClear.setEnabled(false);
         bDel.setEnabled(false);
         
         bOpenB.setEnabled(false);
         bCloseB.setEnabled(false);
         
         bSin.setEnabled(false);
         bCos.setEnabled(false);
         bTan.setEnabled(false);
         
         bCude.setEnabled(false);
         bSquare.setEnabled(false);
         
         bPi.setEnabled(false);
         
         bRoot.setEnabled(false);
         
         bPlusMinus.setEnabled(false);
         
         blog.setEnabled(false);
         
         disable();
         t1.setText("ON First");
         
    }

    private void bOnActionPerformed(java.awt.event.ActionEvent evt) {                                    
       
    	//this is for when we click on ON button then all Key is ON;
         b1.setEnabled(true);
         b2.setEnabled(true);
         b3.setEnabled(true);
         b4.setEnabled(true);
         b5.setEnabled(true);
         b6.setEnabled(true);
         b7.setEnabled(true);
         b8.setEnabled(true);
         b9.setEnabled(true);
         bzero.setEnabled(true);
         
         bDot.setEnabled(true); 
         
         bPlus.setEnabled(true);
         bMinus.setEnabled(true);
         bMul.setEnabled(true);
         bDivide.setEnabled(true);
         
         bEqualTo.setEnabled(true);
         
         bClear.setEnabled(true);
         bDel.setEnabled(true);
         
         bOpenB.setEnabled(true);
         bCloseB.setEnabled(true);
         
         bSin.setEnabled(true);
         bCos.setEnabled(true);
         bTan.setEnabled(true);
         
         bCude.setEnabled(true);
         bSquare.setEnabled(true);
         
         bPi.setEnabled(true);
         
         bRoot.setEnabled(true);
         
         bPlusMinus.setEnabled(true);
         
         blog.setEnabled(true);
         
       enable();        
        t1.setText("");
         
    }

    private void bPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {                                           
         double a=Double.parseDouble(String.valueOf(t1.getText()));
         a=a*(-1);
         t1.setText(String.valueOf(a));
    }

    private void bRootActionPerformed(java.awt.event.ActionEvent evt) {                                      
        double a=Math.sqrt(Double.parseDouble(t1.getText()));
         t1.setText("√(");
         t1.setText(t1.getText() + a);
    }

    private void bCloseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseBActionPerformed
         t1.setText(t1.getText() + ")");
    }//GEN-LAST:event_bCloseBActionPerformed

    private void bOpenBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOpenBActionPerformed
         t1.setText(t1.getText() + "(");
    }//GEN-LAST:event_bOpenBActionPerformed

    private void blogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogActionPerformed
         double a=Math.log(Double.parseDouble(t1.getText()));
         t1.setText("");
         t1.setText(t1.getText() + a);
    }//GEN-LAST:event_blogActionPerformed

    private void bSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSinActionPerformed
         //t1.setText(t1.getText() + "Sin(");
         double a=Math.sin(Double.parseDouble(t1.getText()));
         t1.setText("");
         t1.setText(t1.getText() + a);
    }//GEN-LAST:event_bSinActionPerformed

    private void bCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCosActionPerformed
         //t1.setText(t1.getText() + "Cos(");
          double a=Math.cos(Double.parseDouble(t1.getText()));
         t1.setText("");
         t1.setText(t1.getText() + a);
    }//GEN-LAST:event_bCosActionPerformed

    private void bTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTanActionPerformed
         //t1.setText(t1.getText() + "Tan(");
          double a=Math.tan(Double.parseDouble(t1.getText()));
         t1.setText("");
         t1.setText(t1.getText() + a);
    }//GEN-LAST:event_bTanActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
         t1.setText(t1.getText() + "9");
    }//GEN-LAST:event_b9ActionPerformed

    private void bDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDelActionPerformed
         String str=t1.getText();
         t1.setText(str.substring(0,str.length() - 1));
        
        
    }//GEN-LAST:event_bDelActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        t1.setText("");
    }//GEN-LAST:event_bClearActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
         t1.setText(t1.getText() + "8");
    }//GEN-LAST:event_b8ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
         t1.setText(t1.getText() + "6");
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
         t1.setText(t1.getText() + "5");
    }//GEN-LAST:event_b5ActionPerformed

    private void bMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMulActionPerformed
        //t1.setText(t1.getText() + "*");
       
         num1=Double.parseDouble(t1.getText());
         t1.setText("");
         operator="*";
    }//GEN-LAST:event_bMulActionPerformed

    private void bDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivideActionPerformed
        //t1.setText(t1.getText() + "/");
         num1=Double.parseDouble(t1.getText());
         t1.setText("");
         operator="/";
    }//GEN-LAST:event_bDivideActionPerformed

    private void bPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlusActionPerformed
         //t1.setText(t1.getText() + "+");
         num1=Double.parseDouble(t1.getText());
         t1.setText("");
         
         operator="+";
    }//GEN-LAST:event_bPlusActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
         t1.setText(t1.getText() + "2");
         t1.setText("2");
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        t1.setText(t1.getText() + "3");
    }//GEN-LAST:event_b3ActionPerformed

    private void bMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMinusActionPerformed
        // t1.setText(t1.getText() + "-");  
        num1=Double.parseDouble(t1.getText());
        t1.setText("");
         operator="-";
    }//GEN-LAST:event_bMinusActionPerformed

    private void bPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPiActionPerformed
       //t1.setText(t1.getName() + "π *");
       
       double pi;
       pi=(3.14159265359);
       t1.setText(String.valueOf(pi));
    }//GEN-LAST:event_bPiActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
         t1.setText(t1.getText() + "4");
    }//GEN-LAST:event_b4ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        t1.setText(t1.getText() + "1");
        t1.setText("1");
    }//GEN-LAST:event_b1ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
         t1.setText(t1.getText() + "7");
    }//GEN-LAST:event_b7ActionPerformed

    private void bCudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCudeActionPerformed
       double a=Double.parseDouble(String.valueOf(t1.getText()));  
          a=(a*a*a);
          t1.setText(String.valueOf(a));
    }//GEN-LAST:event_bCudeActionPerformed

    private void bSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSquareActionPerformed
          double a=Double.parseDouble(String.valueOf(t1.getText()));  
          a=(a*a);
          t1.setText(String.valueOf(a));
    }//GEN-LAST:event_bSquareActionPerformed

    private void bDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDotActionPerformed
        t1.setText(t1.getText() + ".");
    }//GEN-LAST:event_bDotActionPerformed

    private void bzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bzeroActionPerformed
         t1.setText(t1.getText() + "0");
    }//GEN-LAST:event_bzeroActionPerformed

    private void bEqualToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEqualToActionPerformed
        num2=Double.parseDouble(t1.getText());
        
        double result=0;
        
        if(operator=="+"){
            result=num1+num2;
        }

         if(operator == "-"){
            result=num1-num2;
        }
         if(operator == "*"){
            result=num1*num2;
        }
         if(operator == "/"){
            result=num1/num2;
        } 
        t1.setText("" + result);
        
        operator=null;
    }//GEN-LAST:event_bEqualToActionPerformed

   
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sci_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sci_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sci_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sci_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sci_Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bCloseB;
    private javax.swing.JButton bCos;
    private javax.swing.JButton bCude;
    private javax.swing.JButton bDel;
    private javax.swing.JButton bDivide;
    private javax.swing.JButton bDot;
    private javax.swing.JButton bEqualTo;
    private javax.swing.JButton bMinus;
    private javax.swing.JButton bMul;
    private javax.swing.JRadioButton bOff;
    private javax.swing.JRadioButton bOn;
    private javax.swing.JButton bOpenB;
    private javax.swing.JButton bPi;
    private javax.swing.JButton bPlus;
    private javax.swing.JButton bPlusMinus;
    private javax.swing.JButton bRoot;
    private javax.swing.JButton bSin;
    private javax.swing.JButton bSquare;
    private javax.swing.JButton bTan;
    private javax.swing.JButton blog;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton bzero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
