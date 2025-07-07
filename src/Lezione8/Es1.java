package Lezione8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Es1 extends JFrame {
        private JComboBox<String> tipoUtente;
        private JTextField campoNome;
        private JTextField campoCognome;
        private JButton btnRegistra;
        private JTextArea areaOutput;

        private ArrayList<Studente> studenti = new ArrayList<>();
        private ArrayList<Professore> professori = new ArrayList<>();

        public Es1() {
            setTitle("Registrazione Utenti");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            // Pannello form input
            JPanel pannelloInput = new JPanel(new GridLayout(4, 2, 5, 5));

            pannelloInput.add(new JLabel("Tipo Utente:"));
            tipoUtente = new JComboBox<>(new String[] {"Studente", "Professore"});
            pannelloInput.add(tipoUtente);

            pannelloInput.add(new JLabel("Nome:"));
            campoNome = new JTextField();
            pannelloInput.add(campoNome);

            pannelloInput.add(new JLabel("Cognome:"));
            campoCognome = new JTextField();
            pannelloInput.add(campoCognome);

            btnRegistra = new JButton("Registra");
            pannelloInput.add(btnRegistra);

            // Area output per mostrare lista utenti registrati
            areaOutput = new JTextArea();
            areaOutput.setEditable(false);

            add(pannelloInput, BorderLayout.NORTH);
            add(new JScrollPane(areaOutput), BorderLayout.CENTER);

            btnRegistra.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    registraUtente();
                }
            });
        }

        private void registraUtente() {
            String tipo = (String) tipoUtente.getSelectedItem();
            String nome = campoNome.getText().trim();
            String cognome = campoCognome.getText().trim();

            if (nome.isEmpty() || cognome.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Inserisci nome e cognome", "Errore", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (tipo.equals("Studente")) {
                Studente s = new Studente(nome, cognome);
                studenti.add(s);
                areaOutput.append(s + "\n");
            } else {
                Professore p = new Professore(nome, cognome);
                professori.add(p);
                areaOutput.append(p + "\n");
            }

            // Pulisci i campi
            campoNome.setText("");
            campoCognome.setText("");
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                new Es1().setVisible(true);
            });
        }
    }
