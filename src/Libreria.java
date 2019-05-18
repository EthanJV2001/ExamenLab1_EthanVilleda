
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Libreria extends javax.swing.JFrame {

    public Libreria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jb_Ingresar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tf_NombreUsuario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_ContraseñaLogIn = new javax.swing.JTextField();
        jDialog2 = new javax.swing.JDialog();
        tf_Contraseña = new javax.swing.JTextField();
        tf_Edad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tf_Apellido = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tf_Nombre = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tf_Codigo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cb_TipoCuenta = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jb_Registrar = new javax.swing.JButton();
        tf_NombreDeUsuario = new javax.swing.JTextField();
        jDialog3 = new javax.swing.JDialog();
        jb_Login = new javax.swing.JButton();
        jb_Register = new javax.swing.JButton();
        jDialog4 = new javax.swing.JDialog();
        jb_Agregar = new javax.swing.JButton();
        jb_Eliminar = new javax.swing.JButton();
        jDialog5 = new javax.swing.JDialog();
        jb_Modificar = new javax.swing.JButton();
        jDialog6 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sp_Autores = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_NombreLibro = new javax.swing.JTextField();
        tf_AnioEscrib = new javax.swing.JTextField();
        tf_ISBN = new javax.swing.JTextField();
        tf_AnioIng = new javax.swing.JTextField();
        tf_Idioma = new javax.swing.JTextField();
        tf_Genero = new javax.swing.JTextField();
        sp_Editoriales = new javax.swing.JSpinner();
        Add = new javax.swing.JButton();
        jDialog7 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_Libros = new javax.swing.JTextArea();
        jb_Elim = new javax.swing.JButton();
        sp_Elim = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jDialog8 = new javax.swing.JDialog();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        tf_NuevoCodigo = new javax.swing.JTextField();
        tf_NuevoNombre = new javax.swing.JTextField();
        tf_NuevoApellido = new javax.swing.JTextField();
        tf_NuevaEdad = new javax.swing.JTextField();
        tf_NuevoNombreUsuario = new javax.swing.JTextField();
        tf_NuevaContrasena = new javax.swing.JTextField();
        jb_Guardar = new javax.swing.JButton();
        cb_NuevoTipo = new javax.swing.JComboBox<>();
        tf_NumModif = new javax.swing.JTextField();
        jb_Iniciar = new javax.swing.JButton();

        jb_Ingresar.setText("Ingresar");
        jb_Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_IngresarMouseClicked(evt);
            }
        });

        jLabel12.setText("Nombre de Usuario: ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("LOGIN");

        jLabel14.setText("Contraseña: ");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_NombreUsuario)
                                    .addComponent(tf_ContraseñaLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_Ingresar)))
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_ContraseñaLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("REGISTRO");

        jLabel16.setText("Codigo: ");

        jLabel17.setText("Nombre: ");

        jLabel18.setText("Apellido: ");

        jLabel19.setText("Tipo de cuenta: ");

        jLabel20.setText("Edad: ");

        cb_TipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Usuario normal" }));

        jLabel21.setText("Nombre de ususario: ");

        jLabel22.setText("Contraseña: ");

        jb_Registrar.setText("Registrar");
        jb_Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_RegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_Codigo)
                                    .addComponent(tf_Nombre)
                                    .addComponent(tf_Apellido)
                                    .addComponent(tf_Edad)
                                    .addComponent(tf_NombreDeUsuario)
                                    .addComponent(tf_Contraseña)
                                    .addComponent(cb_TipoCuenta, 0, 159, Short.MAX_VALUE))))
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jb_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tf_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(tf_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tf_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tf_NombreDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tf_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cb_TipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jb_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jb_Login.setText("Login");
        jb_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_LoginMouseClicked(evt);
            }
        });

        jb_Register.setText("Register");
        jb_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_RegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jb_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jb_Agregar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jb_Agregar.setText("Agregar libro");
        jb_Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_AgregarMouseClicked(evt);
            }
        });

        jb_Eliminar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jb_Eliminar.setText("Eliminar libro");
        jb_Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_EliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addComponent(jb_Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jb_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jb_Modificar.setText("Modificar usuario");
        jb_Modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog5Layout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(jb_Modificar)
                .addContainerGap())
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_Modificar)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Libro");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Autores: ");

        jLabel4.setText("Genero: ");

        jLabel5.setText("Editoriales: ");

        jLabel6.setText("Idioma: ");

        jLabel7.setText("Año en que ingresó: ");

        jLabel8.setText("ISBN: ");

        jLabel9.setText("Año en que se escribio: ");

        tf_ISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ISBNActionPerformed(evt);
            }
        });

        Add.setText("Agregar");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jDialog6Layout = new javax.swing.GroupLayout(jDialog6.getContentPane());
        jDialog6.getContentPane().setLayout(jDialog6Layout);
        jDialog6Layout.setHorizontalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog6Layout.createSequentialGroup()
                .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog6Layout.createSequentialGroup()
                        .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog6Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel1))
                            .addGroup(jDialog6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5))
                            .addGroup(jDialog6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6))
                            .addGroup(jDialog6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)))
                        .addGap(0, 101, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog6Layout.createSequentialGroup()
                                .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sp_Autores, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_NombreLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(tf_Idioma)
                                    .addComponent(tf_AnioIng)
                                    .addComponent(tf_ISBN)
                                    .addComponent(sp_Editoriales, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_AnioEscrib)
                                    .addComponent(tf_Genero))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jDialog6Layout.setVerticalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialog6Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sp_Autores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_NombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(sp_Editoriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_Idioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_AnioEscrib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tf_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))
                    .addGroup(jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(tf_AnioIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ta_Libros.setEditable(false);
        ta_Libros.setColumns(20);
        ta_Libros.setRows(5);
        jScrollPane1.setViewportView(ta_Libros);

        jb_Elim.setText("Eliminar");
        jb_Elim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ElimMouseClicked(evt);
            }
        });

        jLabel10.setText("Seleccione el numero del");

        jLabel11.setText("libro que desea eliminar");

        javax.swing.GroupLayout jDialog7Layout = new javax.swing.GroupLayout(jDialog7.getContentPane());
        jDialog7.getContentPane().setLayout(jDialog7Layout);
        jDialog7Layout.setHorizontalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(sp_Elim, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jb_Elim))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog7Layout.setVerticalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jDialog7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(sp_Elim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addComponent(jb_Elim)))
                .addContainerGap())
        );

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Modificar Usuario");

        jLabel24.setText("Nuevo codigo: ");

        jLabel25.setText("Nuevo nombre: ");

        jLabel26.setText("Nuevo apellido: ");

        jLabel27.setText("Nueva edad: ");

        jLabel28.setText("Nuevo nombre de ususario: ");

        jLabel29.setText("Nueva contraseña: ");

        jLabel30.setText("Nuevo tipo de cuenta: ");

        jb_Guardar.setText("Guardar");
        jb_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_GuardarMouseClicked(evt);
            }
        });

        cb_NuevoTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Usuario normal" }));

        tf_NumModif.setEditable(false);

        javax.swing.GroupLayout jDialog8Layout = new javax.swing.GroupLayout(jDialog8.getContentPane());
        jDialog8.getContentPane().setLayout(jDialog8Layout);
        jDialog8Layout.setHorizontalGroup(
            jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog8Layout.createSequentialGroup()
                .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDialog8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tf_NumModif, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDialog8Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDialog8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addGap(94, 94, 94)
                        .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_NuevaEdad)
                            .addComponent(tf_NuevoApellido)
                            .addComponent(tf_NuevoNombre)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDialog8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialog8Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_NuevoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDialog8Layout.createSequentialGroup()
                                .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_NuevaContrasena, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_NuevoNombreUsuario)
                                    .addComponent(cb_NuevoTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 162, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jDialog8Layout.setVerticalGroup(
            jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tf_NuevoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tf_NuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tf_NuevoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(tf_NuevaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(tf_NuevoNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(tf_NuevaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(cb_NuevoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jDialog8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialog8Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(tf_NumModif)))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jb_Iniciar.setText("Iniciar programa");
        jb_Iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_IniciarMouseClicked(evt);
            }
        });
        jb_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_IniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jb_Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_IngresarMouseClicked
        int contador=0;
        for (Usuario e : lista) {
            if(tf_NombreUsuario.getText().equals(e.getNombreDeUsuario())){
                num=lista.indexOf(e);
                String contra=tf_ContraseñaLogIn.getText();
                while(!contra.equals(lista.get(num).getContraseña())){
                    contra=JOptionPane.showInputDialog("Contraseña incorrecta");
                }
                if(lista.get(num).getContraseña().equals(contra)){
                    contador++;
                    jDialog1.setVisible(false);
                    if(lista.get(num).getAdminonormal()==0){ //Admin
                        jDialog1.setVisible(false);
                        jDialog4.pack();
                        jDialog4.setModal(false);
                        jDialog4.setVisible(true);
                    }
                    else{ //Usuario normal
                        String codig="", eda="", nummod="";
                        codig+=lista.get(num).getCodigo();
                        eda+=lista.get(num).getEdad();
                        nummod+=num;
                        tf_NuevoCodigo.setText(codig);
                        tf_NuevoNombre.setText(lista.get(num).getNombre());
                        tf_NuevoApellido.setText(lista.get(num).getApellido());
                        tf_Edad.setText(eda);
                        tf_NuevoNombreUsuario.setText(lista.get(num).getNombreDeUsuario());
                        tf_NuevaContrasena.setText(lista.get(num).getContraseña());
                        tf_NumModif.setText(nummod);
                        jDialog1.setVisible(false);
                        jDialog5.pack();
                        jDialog5.setModal(false);
                        jDialog5.setVisible(true);
                    }
                }
            }
        }
        if(contador==0){
            JOptionPane.showMessageDialog(this, "No hay ningun usuario con estas especificaiones");
            tf_NombreUsuario.setText("");
            tf_ContraseñaLogIn.setText("");
            jDialog1.setVisible(false);
            jDialog3.pack();
            jDialog3.setModal(false);
            jDialog3.setVisible(true);
        }
    }//GEN-LAST:event_jb_IngresarMouseClicked

    private void jb_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_RegistrarMouseClicked
        String cod=tf_Codigo.getText();
        while(Integer.parseInt(cod)<1000|| Integer.parseInt(cod)>9999)
        {
            cod=JOptionPane.showInputDialog("Debe ser un numero de 4 letras: ");
        }
        lista.add(new Usuario(Integer.parseInt(cod), tf_Nombre.getText(), tf_Apellido.getText(), Integer.parseInt(tf_Edad.getText()), tf_NombreDeUsuario.getText(), tf_Contraseña.getText(), cb_TipoCuenta.getSelectedIndex()));
        tf_Codigo.setText("");
        tf_Nombre.setText("");
        tf_Apellido.setText("");
        tf_Edad.setText("");
        tf_NombreDeUsuario.setText("");
        tf_Contraseña.setText("");
        jDialog2.setVisible(false);
        jDialog3.pack();
        jDialog3.setModal(false);
        jDialog3.setVisible(true);
    }//GEN-LAST:event_jb_RegistrarMouseClicked

    private void jb_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_LoginMouseClicked
        jDialog3.setVisible(false);
        jDialog1.pack();
        jDialog1.setModal(false);
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jb_LoginMouseClicked

    private void jb_RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_RegisterMouseClicked
        jDialog3.setVisible(false);
        jDialog2.pack();
        jDialog2.setModal(false);
        jDialog2.setVisible(true);
    }//GEN-LAST:event_jb_RegisterMouseClicked

    private void jb_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_IniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_IniciarActionPerformed

    private void jb_IniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_IniciarMouseClicked
        lista.add(new Usuario(1234, "Diego", "Mendoza", 19, "Diego", "D000", 0));
        lista.add(new Usuario(1234, "Ethan", "Villeda", 18, "Ethan", "e234", 1));
        lista.add(new Usuario(4321, "Leonardo", "Banegas", 19, "Leo", "L123", 1));
        libros.add(new Libros("Aprende a ser feliz", "Educativo", "Espaniol", 2014, "0000-1111-2222-3333", 2019));
        libros.get(libros.size()-1).getAutores().add("Andres Paco");
        libros.get(libros.size()-1).getAutores().add("Paco Andres");
        libros.get(libros.size()-1).getEditoriales().add("No se");
        libros.add(new Libros("La Biblia", "Cientifico", "Ingles", 2014, "0000-1111-2222-3334", 2018));
        libros.get(libros.size()-1).getAutores().add("Andres Paco");
        libros.get(libros.size()-1).getAutores().add("Paco Andres");
        libros.get(libros.size()-1).getEditoriales().add("Hola");
        libros.add(new Libros("F", "Novela", "Frances", 2009, "0000-1111-2222-3335", 2017));
        libros.get(libros.size()-1).getAutores().add("Andres Paco");
        libros.get(libros.size()-1).getAutores().add("Paco Andres");
        libros.get(libros.size()-1).getEditoriales().add("Adios");
        libros.add(new Libros("El prolapso anal de Francisco", "Drama", "Italiano", 2011, "0000-1111-2222-3336", 2018));
        libros.get(libros.size()-1).getAutores().add("Andres Paco");
        libros.get(libros.size()-1).getAutores().add("Paco Andres");
        libros.get(libros.size()-1).getEditoriales().add("Help");
        libros.add(new Libros("Poemario 3", "Lirica", "Espaniol", 2000, "0000-1111-2222-3337", 2020));
        libros.get(libros.size()-1).getAutores().add("Andres Paco");
        libros.get(libros.size()-1).getAutores().add("Paco Andres");
        libros.get(libros.size()-1).getEditoriales().add("No me quiero quedar Sr. Diego ):");
        dispose();
        jDialog3.pack();
        jDialog3.setModal(false);
        jDialog3.setVisible(true);
    }//GEN-LAST:event_jb_IniciarMouseClicked

    private void jb_AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_AgregarMouseClicked
        jDialog4.setVisible(false);
        jDialog6.pack();
        jDialog6.setModal(false);
        jDialog6.setVisible(true);
    }//GEN-LAST:event_jb_AgregarMouseClicked

    private void tf_ISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ISBNActionPerformed

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        libros.add(new Libros(tf_NombreLibro.getText(), tf_Genero.getText(), tf_Idioma.getText(), Integer.parseInt(tf_AnioIng.getText()), tf_ISBN.getText(), Integer.parseInt(tf_AnioEscrib.getText())));
        for (int i = 0; i < (int)sp_Autores.getValue(); i++) {
            libros.get(libros.size()-1).getAutores().add(JOptionPane.showInputDialog("Ingrese autor #" + i));
        }
        for (int i = 0; i < (int)sp_Editoriales.getValue(); i++) {
            libros.get(libros.size()-1).getEditoriales().add(JOptionPane.showInputDialog("Ingrese editorial #" + i));
        }
        jDialog6.setVisible(false);
        jDialog4.pack();
        jDialog4.setModal(false);
        jDialog4.setVisible(true);
    }//GEN-LAST:event_AddMouseClicked

    private void jb_EliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_EliminarMouseClicked
        jDialog4.setVisible(false);
        jDialog7.pack();
        jDialog7.setModal(false);
        jDialog7.setVisible(true);
        String libro="";
        for (int i = 0; i < lista.size()-1; i++) {
            libro+=i + libros.get(i).getTitulo() + "\n";
        }
        ta_Libros.setText(libro);
    }//GEN-LAST:event_jb_EliminarMouseClicked

    private void jb_ElimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ElimMouseClicked
        int numelim=(int)sp_Elim.getValue();
        while(numelim>libros.size()-1){
            numelim=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero valido: "));
        }
        libros.remove(numelim);
    }//GEN-LAST:event_jb_ElimMouseClicked

    private void jb_ModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ModificarMouseClicked
        jDialog5.setVisible(false);
        jDialog8.pack();
        jDialog8.setModal(false);
        jDialog8.setVisible(true);
    }//GEN-LAST:event_jb_ModificarMouseClicked

    private void jb_GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_GuardarMouseClicked
        lista.get(num).setCodigo(Integer.parseInt(tf_NuevoCodigo.getText()));
        lista.get(num).setNombre(tf_NuevoNombre.getText());
        lista.get(num).setApellido(tf_NuevoApellido.getText());
        lista.get(num).setEdad(Integer.parseInt(tf_NuevaEdad.getText()));
        lista.get(num).setNombreDeUsuario(tf_NuevoNombreUsuario.getText());
        lista.get(num).setContraseña(tf_NuevaContrasena.getText());
        lista.get(num).setAdminonormal((int)cb_NuevoTipo.getSelectedIndex());
        jDialog8.setVisible(false);
        jDialog5.pack();
        jDialog5.setModal(false);
        jDialog5.setVisible(true);
    }//GEN-LAST:event_jb_GuardarMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Libreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Libreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Libreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Libreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Libreria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JComboBox<String> cb_NuevoTipo;
    private javax.swing.JComboBox<String> cb_TipoCuenta;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JDialog jDialog7;
    private javax.swing.JDialog jDialog8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Agregar;
    private javax.swing.JButton jb_Elim;
    private javax.swing.JButton jb_Eliminar;
    private javax.swing.JButton jb_Guardar;
    private javax.swing.JButton jb_Ingresar;
    private javax.swing.JButton jb_Iniciar;
    private javax.swing.JButton jb_Login;
    private javax.swing.JButton jb_Modificar;
    private javax.swing.JButton jb_Register;
    private javax.swing.JButton jb_Registrar;
    private javax.swing.JSpinner sp_Autores;
    private javax.swing.JSpinner sp_Editoriales;
    private javax.swing.JSpinner sp_Elim;
    private javax.swing.JTextArea ta_Libros;
    private javax.swing.JTextField tf_AnioEscrib;
    private javax.swing.JTextField tf_AnioIng;
    private javax.swing.JTextField tf_Apellido;
    private javax.swing.JTextField tf_Codigo;
    private javax.swing.JTextField tf_Contraseña;
    private javax.swing.JTextField tf_ContraseñaLogIn;
    private javax.swing.JTextField tf_Edad;
    private javax.swing.JTextField tf_Genero;
    private javax.swing.JTextField tf_ISBN;
    private javax.swing.JTextField tf_Idioma;
    private javax.swing.JTextField tf_Nombre;
    private javax.swing.JTextField tf_NombreDeUsuario;
    private javax.swing.JTextField tf_NombreLibro;
    private javax.swing.JTextField tf_NombreUsuario;
    private javax.swing.JTextField tf_NuevaContrasena;
    private javax.swing.JTextField tf_NuevaEdad;
    private javax.swing.JTextField tf_NuevoApellido;
    private javax.swing.JTextField tf_NuevoCodigo;
    private javax.swing.JTextField tf_NuevoNombre;
    private javax.swing.JTextField tf_NuevoNombreUsuario;
    private javax.swing.JTextField tf_NumModif;
    // End of variables declaration//GEN-END:variables
    
    ArrayList<Usuario> lista=new ArrayList();
    ArrayList<Libros> libros=new ArrayList();
    int num;
}
