package view;

import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Classe responsável pela interface gráfica da tela inicial
 * @author Gustavo Henrique
 * @since release 1
 */

public class ViewFirstScreen {
    private JFrame frame;
    private JButton btnRegister;
    private JButton btnLogin;
    private JLabel background;

    /**
     * Construtor da classe ViewFirstScreen, onde é criada a interface gráfica.
     */
    public ViewFirstScreen() {
        frame = new JFrame();
        frame.setBounds(150, 150, 600, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(195, 185, 210, 45);
        frame.getContentPane().add(btnLogin);

        btnRegister = new JButton("Cadastro");
        btnRegister.setBounds(195, 260, 210, 45);
        frame.getContentPane().add(btnRegister);

        background = new JLabel("");
        background.setIcon(new ImageIcon(ViewFirstScreen.class.getResource("/images/hj.jpg")));
        background.setBounds(0, -128, 875, 843);
        frame.getContentPane().add(background);

        btnLogin.addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    frame.dispose();
                    ViewLogin window = new ViewLogin();
                    window.getLoginFrame().setVisible(true);
                }
            }
        );

        btnRegister.addActionListener(
            new ActionListener() {

                public void actionPerformed(ActionEvent ae) {
                    frame.dispose();
                    ViewRegister window = new ViewRegister();
                    window.getRegisterFrame().setVisible(true);
                }
            }
        );
    }

    // leva a tela
    public JFrame getOriginFrame() {
        return frame;
    }
}
