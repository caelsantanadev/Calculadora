import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaCalculatora {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operador;

    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton btnIgual;
    private JButton btnMulticar;
    private JButton btnDois;
    private JButton btnTres;
    private JButton btnCinco;
    private JButton btnOito;
    private JButton btnPonto;
    private JButton btnMais;
    private JButton btnSeis;
    private JButton btnNove;
    private JButton btnLimpar;
    private JButton btnMenos;
    private JButton btnDivide;
    private JButton btnUm;
    private JButton btnQuatro;
    private JButton btnSete;
    private JButton btnZero;
    private JTextField textDisplayTotal;

    public JavaCalculatora() {
        btnUm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnUmTexto = textDisplay.getText() + btnUm.getText();
                textDisplay.setText(btnUmTexto);
            }
        });
        btnDois.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnDoisTexto = textDisplay.getText() + btnDois.getText();
                textDisplay.setText(btnDoisTexto);
            }
        });
        btnTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTresTexto = textDisplay.getText() + btnTres.getText();
                textDisplay.setText(btnTresTexto);
            }
        });
        btnQuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnQuatroTexto = textDisplay.getText() + btnQuatro.getText();
                textDisplay.setText(btnQuatroTexto);
            }
        });
        btnCinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnCincoTexto = textDisplay.getText() + btnCinco.getText();
                textDisplay.setText(btnCincoTexto);
            }
        });
        btnSeis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSeisTexto = textDisplay.getText() + btnSeis.getText();
                textDisplay.setText(btnSeisTexto);
            }
        });
        btnSete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSeteTexto = textDisplay.getText() + btnSete.getText();
                textDisplay.setText(btnSeteTexto);
            }
        });
        btnOito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOitoTexto = textDisplay.getText() + btnOito.getText();
                textDisplay.setText(btnOitoTexto);
            }
        });
        btnNove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNoveTexto = textDisplay.getText() + btnNove.getText();
                textDisplay.setText(btnNoveTexto);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroTexto = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnZeroTexto);
            }
        });
        btnPonto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().equals("")){
                    textDisplay.setText("0.");
                } else if (textDisplay.getText().contains(".")) {
                    btnPonto.setEnabled(false);
                } else {
                    String btnPointText = textDisplay.getText() + btnPonto.getText();
                    textDisplay.setText(btnPointText);
                }
                btnPonto.setEnabled(true);
            }
        });
        btnMais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  String btn_texto = btnMais.getText();
                  getOperator(btn_texto);
            }
        });
        btnMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn_texto = btnMenos.getText();
                getOperator(btn_texto);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn_texto = btnDivide.getText();
                getOperator(btn_texto);
            }
        });
        btnMulticar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn_texto = btnMulticar.getText();
                getOperator(btn_texto);
            }
        });
        btnIgual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operador) {
                    case '+' -> total2 = total1 + Double.parseDouble(textDisplay.getText());
                    case '-' -> total2 = total1 - Double.parseDouble(textDisplay.getText());
                    case '/' -> total2 = total1 / Double.parseDouble(textDisplay.getText());
                    case '*' -> total2 = total1 * Double.parseDouble(textDisplay.getText());
                }
                textDisplayTotal.setText( Double.toString(total2) );
                total1 = 0;
            }
        });
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textDisplay.setText("");
                textDisplayTotal.setText("");
            }
        });
    }

    private void getOperator (String btnTexto){
        math_operador = btnTexto.charAt(0);
        total1 = total1 + Double.parseDouble( textDisplay.getText() );
        textDisplay.setText("");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculatora em JAVA");
        frame.setContentPane(new JavaCalculatora().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}