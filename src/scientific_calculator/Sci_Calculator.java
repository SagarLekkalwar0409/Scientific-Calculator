
package scientific_calculator;
 //@author SAGAR LEKKALWAR
 
public class Sci_Calculator extends javax.swing.JFrame {
    
    //variable creating to store numbers;
    double num1=0;
    double num2=0;
    String operator=null;

    public Sci_Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        t1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        bSquare = new javax.swing.JButton();
        bPlusMinus = new javax.swing.JButton();
        bRoot = new javax.swing.JButton();
        bCloseB = new javax.swing.JButton();
        bOpenB = new javax.swing.JButton();
        bInt = new javax.swing.JButton();
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
        t1.setAlignmentX(1.0F);
        t1.setAlignmentY(1.0F);
        t1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scientific Calculator", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 255, 255))); // NOI18N
        t1.setCaretColor(new java.awt.Color(255, 255, 255));
        t1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(0, 102, 102));
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("OFF");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.MatteBorder(null)))));
        jRadioButton1.setBorderPainted(true);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(0, 130, 130));
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("ON");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.MatteBorder(null)))));
        jRadioButton2.setBorderPainted(true);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        bSquare.setBackground(new java.awt.Color(51, 51, 51));
        bSquare.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bSquare.setForeground(new java.awt.Color(255, 255, 255));
        bSquare.setText("x² ");
        bSquare.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
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
        bOpenB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOpenBActionPerformed(evt);
            }
        });

        bInt.setBackground(new java.awt.Color(51, 51, 51));
        bInt.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bInt.setForeground(new java.awt.Color(255, 255, 255));
        bInt.setText("inv");
        bInt.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
        bInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIntActionPerformed(evt);
            }
        });

        bCude.setBackground(new java.awt.Color(51, 51, 51));
        bCude.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bCude.setForeground(new java.awt.Color(255, 255, 255));
        bCude.setText("x³");
        bCude.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), null));
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
        bPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPiActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 5, true)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bInt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bTan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)
                        .addComponent(bCude, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bPi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bzero, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDot, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bEqualTo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(bRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bOpenB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCloseB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bClear, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bMul, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2))
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(bTan)
                            .addGap(1, 1, 1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bInt)
                            .addComponent(bSin)
                            .addComponent(bCos)))
                    .addComponent(bCude, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bOpenB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCloseB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(bEqualTo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void bPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPlusMinusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bPlusMinusActionPerformed

    private void bRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRootActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRootActionPerformed

    private void bCloseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseBActionPerformed
         t1.setText(t1.getText() + ")");
    }//GEN-LAST:event_bCloseBActionPerformed

    private void bOpenBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOpenBActionPerformed
         t1.setText(t1.getText() + "(");
    }//GEN-LAST:event_bOpenBActionPerformed

    private void bIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bIntActionPerformed

    private void bSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSinActionPerformed
         t1.setText(t1.getText() + "Sin(");
    }//GEN-LAST:event_bSinActionPerformed

    private void bCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCosActionPerformed
         t1.setText(t1.getText() + "Cos(");
    }//GEN-LAST:event_bCosActionPerformed

    private void bTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTanActionPerformed
         t1.setText(t1.getText() + "Tan(");
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
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        t1.setText(t1.getText() + "3");
    }//GEN-LAST:event_b3ActionPerformed

    private void bMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMinusActionPerformed
        // t1.setText(t1.getText() + "-");  
        t1.setText("");
         operator="-";
    }//GEN-LAST:event_bMinusActionPerformed

    private void bPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPiActionPerformed
        
    }//GEN-LAST:event_bPiActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
         t1.setText(t1.getText() + "4");
    }//GEN-LAST:event_b4ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        t1.setText(t1.getText() + "1");
    }//GEN-LAST:event_b1ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
         t1.setText(t1.getText() + "7");
    }//GEN-LAST:event_b7ActionPerformed

    private void bCudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bCudeActionPerformed

    private void bSquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSquareActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JButton bInt;
    private javax.swing.JButton bMinus;
    private javax.swing.JButton bMul;
    private javax.swing.JButton bOpenB;
    private javax.swing.JButton bPi;
    private javax.swing.JButton bPlus;
    private javax.swing.JButton bPlusMinus;
    private javax.swing.JButton bRoot;
    private javax.swing.JButton bSin;
    private javax.swing.JButton bSquare;
    private javax.swing.JButton bTan;
    private javax.swing.JButton bzero;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
