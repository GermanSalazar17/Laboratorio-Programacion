/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author PERSONAL
 */
public class Interfaz extends javax.swing.JFrame {

    Operaciones operacion=new Operaciones();
    public Interfaz() {
       
        initComponents();
        setLocationRelativeTo(null);
        
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
        txtoperacion = new javax.swing.JLabel();
        txtresultado = new javax.swing.JLabel();
        B0 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        Bigual = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        Bdot = new javax.swing.JButton();
        BRaiz = new javax.swing.JButton();
        Bporcentaje = new javax.swing.JButton();
        BPotencia = new javax.swing.JButton();
        BDivision = new javax.swing.JButton();
        BMultiplicacion = new javax.swing.JButton();
        BResta = new javax.swing.JButton();
        BSuma = new javax.swing.JButton();
        BCE = new javax.swing.JButton();
        Bsin = new javax.swing.JButton();
        Bcos = new javax.swing.JButton();
        Btan = new javax.swing.JButton();
        BAC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtoperacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        txtoperacion.setForeground(new java.awt.Color(255, 255, 255));
        txtoperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtoperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 330, -1));

        txtresultado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 55)); // NOI18N
        txtresultado.setForeground(new java.awt.Color(255, 255, 255));
        txtresultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 330, 92));

        B0.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        B0.setForeground(new java.awt.Color(255, 255, 255));
        B0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn8.png"))); // NOI18N
        B0.setText("0");
        B0.setBorderPainted(false);
        B0.setContentAreaFilled(false);
        B0.setFocusPainted(false);
        B0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn8.png"))); // NOI18N
        B0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn8-1.png"))); // NOI18N
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });
        jPanel1.add(B0, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 130, 60));

        B7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        B7.setForeground(new java.awt.Color(255, 255, 255));
        B7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3.png"))); // NOI18N
        B7.setText("7");
        B7.setBorderPainted(false);
        B7.setContentAreaFilled(false);
        B7.setFocusPainted(false);
        B7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        B7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        jPanel1.add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 60, 60));

        B8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        B8.setForeground(new java.awt.Color(255, 255, 255));
        B8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3.png"))); // NOI18N
        B8.setText("8");
        B8.setBorderPainted(false);
        B8.setContentAreaFilled(false);
        B8.setFocusPainted(false);
        B8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        B8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        jPanel1.add(B8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 60, 60));

        B9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        B9.setForeground(new java.awt.Color(255, 255, 255));
        B9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3.png"))); // NOI18N
        B9.setText("9");
        B9.setBorderPainted(false);
        B9.setContentAreaFilled(false);
        B9.setFocusPainted(false);
        B9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        B9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        jPanel1.add(B9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 60, 60));

        Bigual.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        Bigual.setForeground(new java.awt.Color(255, 255, 255));
        Bigual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        Bigual.setText("=");
        Bigual.setBorderPainted(false);
        Bigual.setContentAreaFilled(false);
        Bigual.setFocusPainted(false);
        Bigual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bigual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        Bigual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1-1.png"))); // NOI18N
        Bigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BigualActionPerformed(evt);
            }
        });
        jPanel1.add(Bigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 60, 60));

        B3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 255, 255));
        B3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3.png"))); // NOI18N
        B3.setText("3");
        B3.setBorderPainted(false);
        B3.setContentAreaFilled(false);
        B3.setFocusPainted(false);
        B3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        B3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        jPanel1.add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 60, 60));

        B6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        B6.setForeground(new java.awt.Color(255, 255, 255));
        B6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3.png"))); // NOI18N
        B6.setText("6");
        B6.setBorderPainted(false);
        B6.setContentAreaFilled(false);
        B6.setFocusPainted(false);
        B6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        B6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        jPanel1.add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 60, 60));

        B5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        B5.setForeground(new java.awt.Color(255, 255, 255));
        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3.png"))); // NOI18N
        B5.setText("5");
        B5.setBorderPainted(false);
        B5.setContentAreaFilled(false);
        B5.setFocusPainted(false);
        B5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        B5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        jPanel1.add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 60, 60));

        B2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 255, 255));
        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3.png"))); // NOI18N
        B2.setText("2");
        B2.setBorderPainted(false);
        B2.setContentAreaFilled(false);
        B2.setFocusPainted(false);
        B2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        B2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel1.add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 60, 60));

        B1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 255, 255));
        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3.png"))); // NOI18N
        B1.setText("1");
        B1.setBorderPainted(false);
        B1.setContentAreaFilled(false);
        B1.setFocusPainted(false);
        B1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        B1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel1.add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 60, 60));

        B4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        B4.setForeground(new java.awt.Color(255, 255, 255));
        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3.png"))); // NOI18N
        B4.setText("4");
        B4.setBorderPainted(false);
        B4.setContentAreaFilled(false);
        B4.setFocusPainted(false);
        B4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        B4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        B4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        jPanel1.add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 60, 60));

        Bdot.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        Bdot.setForeground(new java.awt.Color(255, 255, 255));
        Bdot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn3.png"))); // NOI18N
        Bdot.setText(".");
        Bdot.setBorderPainted(false);
        Bdot.setContentAreaFilled(false);
        Bdot.setFocusPainted(false);
        Bdot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bdot.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        Bdot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        Bdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdotActionPerformed(evt);
            }
        });
        jPanel1.add(Bdot, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 60, 60));

        BRaiz.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 19)); // NOI18N
        BRaiz.setForeground(new java.awt.Color(255, 255, 255));
        BRaiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn4.png"))); // NOI18N
        BRaiz.setBorderPainted(false);
        BRaiz.setContentAreaFilled(false);
        BRaiz.setFocusPainted(false);
        BRaiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BRaiz.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn4.png"))); // NOI18N
        BRaiz.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn4-1.png"))); // NOI18N
        BRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRaizActionPerformed(evt);
            }
        });
        jPanel1.add(BRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 60, 60));

        Bporcentaje.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        Bporcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        Bporcentaje.setText("%");
        Bporcentaje.setBorderPainted(false);
        Bporcentaje.setContentAreaFilled(false);
        Bporcentaje.setFocusPainted(false);
        Bporcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bporcentaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        Bporcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        Bporcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BporcentajeActionPerformed(evt);
            }
        });
        jPanel1.add(Bporcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 60, 60));

        BPotencia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 19)); // NOI18N
        BPotencia.setForeground(new java.awt.Color(255, 255, 255));
        BPotencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn5.png"))); // NOI18N
        BPotencia.setBorderPainted(false);
        BPotencia.setContentAreaFilled(false);
        BPotencia.setFocusPainted(false);
        BPotencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BPotencia.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn5.png"))); // NOI18N
        BPotencia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn5-1.png"))); // NOI18N
        BPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPotenciaActionPerformed(evt);
            }
        });
        jPanel1.add(BPotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 60, 60));

        BDivision.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        BDivision.setForeground(new java.awt.Color(255, 255, 255));
        BDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        BDivision.setText("÷");
        BDivision.setBorderPainted(false);
        BDivision.setContentAreaFilled(false);
        BDivision.setFocusPainted(false);
        BDivision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BDivision.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        BDivision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1-1.png"))); // NOI18N
        BDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDivisionActionPerformed(evt);
            }
        });
        jPanel1.add(BDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 60, 60));

        BMultiplicacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        BMultiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        BMultiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        BMultiplicacion.setText("×");
        BMultiplicacion.setBorderPainted(false);
        BMultiplicacion.setContentAreaFilled(false);
        BMultiplicacion.setFocusPainted(false);
        BMultiplicacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BMultiplicacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        BMultiplicacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1-1.png"))); // NOI18N
        BMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMultiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(BMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 60, 60));

        BResta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 40)); // NOI18N
        BResta.setForeground(new java.awt.Color(255, 255, 255));
        BResta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn6.png"))); // NOI18N
        BResta.setBorderPainted(false);
        BResta.setContentAreaFilled(false);
        BResta.setFocusPainted(false);
        BResta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BResta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn6.png"))); // NOI18N
        BResta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn6-1.png"))); // NOI18N
        BResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRestaActionPerformed(evt);
            }
        });
        jPanel1.add(BResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 60, 60));

        BSuma.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        BSuma.setForeground(new java.awt.Color(255, 255, 255));
        BSuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        BSuma.setText("+");
        BSuma.setBorderPainted(false);
        BSuma.setContentAreaFilled(false);
        BSuma.setFocusPainted(false);
        BSuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BSuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1.png"))); // NOI18N
        BSuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn1-1.png"))); // NOI18N
        BSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSumaActionPerformed(evt);
            }
        });
        jPanel1.add(BSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 60, 60));

        BCE.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 25)); // NOI18N
        BCE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        BCE.setText("CE");
        BCE.setBorder(null);
        BCE.setBorderPainted(false);
        BCE.setContentAreaFilled(false);
        BCE.setFocusPainted(false);
        BCE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BCE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        BCE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        BCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCEActionPerformed(evt);
            }
        });
        jPanel1.add(BCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 60, 60));

        Bsin.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 19)); // NOI18N
        Bsin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        Bsin.setText("sin");
        Bsin.setBorderPainted(false);
        Bsin.setContentAreaFilled(false);
        Bsin.setFocusPainted(false);
        Bsin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bsin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        Bsin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        Bsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsinActionPerformed(evt);
            }
        });
        jPanel1.add(Bsin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 60, 60));

        Bcos.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 19)); // NOI18N
        Bcos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        Bcos.setText("cos");
        Bcos.setBorder(null);
        Bcos.setBorderPainted(false);
        Bcos.setContentAreaFilled(false);
        Bcos.setFocusPainted(false);
        Bcos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bcos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        Bcos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        Bcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcosActionPerformed(evt);
            }
        });
        jPanel1.add(Bcos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 60));

        Btan.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 19)); // NOI18N
        Btan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        Btan.setText("tan");
        Btan.setBorder(null);
        Btan.setBorderPainted(false);
        Btan.setContentAreaFilled(false);
        Btan.setFocusPainted(false);
        Btan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Btan.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        Btan.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        Btan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtanActionPerformed(evt);
            }
        });
        jPanel1.add(Btan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 60, 60));

        BAC.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 25)); // NOI18N
        BAC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        BAC.setText("AC");
        BAC.setBorder(null);
        BAC.setBorderPainted(false);
        BAC.setContentAreaFilled(false);
        BAC.setFocusPainted(false);
        BAC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BAC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2.png"))); // NOI18N
        BAC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn2-1.png"))); // NOI18N
        BAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACActionPerformed(evt);
            }
        });
        jPanel1.add(BAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSumaActionPerformed
         AddNumber("+");
          operacion.suma(txtresultado.getText()); 
    }//GEN-LAST:event_BSumaActionPerformed

    private void BRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRestaActionPerformed
         AddNumber("-");
         operacion.resta(txtresultado.getText());
    }//GEN-LAST:event_BRestaActionPerformed

    private void BMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMultiplicacionActionPerformed
         AddNumber("x");
         operacion.multiplicacion(txtresultado.getText());
    }//GEN-LAST:event_BMultiplicacionActionPerformed

    private void BDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDivisionActionPerformed
         AddNumber("/");
         operacion.division(txtresultado.getText());
    }//GEN-LAST:event_BDivisionActionPerformed

    private void BPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPotenciaActionPerformed
         AddNumber("^");
         operacion.potencia(txtresultado.getText());
    }//GEN-LAST:event_BPotenciaActionPerformed

    private void BporcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BporcentajeActionPerformed
         AddNumber("%");
         operacion.iva(txtresultado.getText());
    }//GEN-LAST:event_BporcentajeActionPerformed

    private void BRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRaizActionPerformed
         AddNumber("√");
         operacion.raiz(txtresultado.getText());
    }//GEN-LAST:event_BRaizActionPerformed

    private void BdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdotActionPerformed
         AddNumber(".");
         txtresultado.setText(operacion.concatenamiento("."));
    }//GEN-LAST:event_BdotActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
         AddNumber("4");
         txtresultado.setText(operacion.concatenamiento("4"));
    }//GEN-LAST:event_B4ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
         AddNumber("1");
         txtresultado.setText(operacion.concatenamiento("1"));
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
         AddNumber("2");
         txtresultado.setText(operacion.concatenamiento("2"));
    }//GEN-LAST:event_B2ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
         AddNumber("5");
         txtresultado.setText(operacion.concatenamiento("5"));
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
         AddNumber("6");
         txtresultado.setText(operacion.concatenamiento("6"));
    }//GEN-LAST:event_B6ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
         AddNumber("3");
         txtresultado.setText(operacion.concatenamiento("3"));
    }//GEN-LAST:event_B3ActionPerformed

    private void BigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BigualActionPerformed
       txtresultado.setText(""+operacion.resultado(txtresultado.getText()));
    }//GEN-LAST:event_BigualActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
         AddNumber("9");
         txtresultado.setText(operacion.concatenamiento("1"));
    }//GEN-LAST:event_B9ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
         AddNumber("8");
         txtresultado.setText(operacion.concatenamiento("8"));
    }//GEN-LAST:event_B8ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        AddNumber("7");
        txtresultado.setText(operacion.concatenamiento("7"));
    }//GEN-LAST:event_B7ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
         AddNumber("0");
         txtresultado.setText(operacion.concatenamiento("0"));
    }//GEN-LAST:event_B0ActionPerformed

    private void BCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCEActionPerformed
        String texto =  txtoperacion.getText().substring(0,txtoperacion.getText().length()-1);
        txtoperacion.setText(texto);
    }//GEN-LAST:event_BCEActionPerformed

    private void BsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsinActionPerformed
         AddNumber("sin(");
         operacion.seno(txtresultado.getText());
    }//GEN-LAST:event_BsinActionPerformed

    private void BcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcosActionPerformed
         AddNumber("cos(");
          operacion.coseno(txtresultado.getText());
    }//GEN-LAST:event_BcosActionPerformed

    private void BtanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtanActionPerformed
         AddNumber("tan(");
         operacion.tangente(txtresultado.getText());
    }//GEN-LAST:event_BtanActionPerformed

    private void BACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACActionPerformed
        operacion.clear(txtresultado.getText());
        txtoperacion.setText("");
        txtresultado.setText("");   
        Bigual.doClick();
    }//GEN-LAST:event_BACActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    public void AddNumber(String digito){
        txtoperacion.setText(txtoperacion.getText()+digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton BAC;
    private javax.swing.JButton BCE;
    private javax.swing.JButton BDivision;
    private javax.swing.JButton BMultiplicacion;
    private javax.swing.JButton BPotencia;
    private javax.swing.JButton BRaiz;
    private javax.swing.JButton BResta;
    private javax.swing.JButton BSuma;
    private javax.swing.JButton Bcos;
    private javax.swing.JButton Bdot;
    private javax.swing.JButton Bigual;
    private javax.swing.JButton Bporcentaje;
    private javax.swing.JButton Bsin;
    private javax.swing.JButton Btan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtoperacion;
    private javax.swing.JLabel txtresultado;
    // End of variables declaration//GEN-END:variables
}
