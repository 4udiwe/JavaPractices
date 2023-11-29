import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Match extends JFrame {

    private int MilanScore = 0, RealScore = 0;

    JButton milanbutton = new JButton("AC Milan");
    JButton madridButton = new JButton("Real Madrid");

    public String getWinner(){
        String result = "Winner :";
        if (MilanScore > RealScore)
            result += "AC Milan";
        else if (RealScore > MilanScore)
            result += "Real Madrid";
        else
            result += "Draw";
        return result;
    }
    public Match(){
        super("AC Milan vs Real Madrid");

        setLayout(null);

        JLabel result = new JLabel("Result: " + MilanScore + " X " + RealScore);
        JLabel winner = new JLabel(getWinner());
        JLabel lastscorer = new JLabel("Last Scorer: N/A");

        milanbutton.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                MilanScore ++;
                result.setText("Result: " + MilanScore + " X " + RealScore);
                winner.setText(getWinner());
                lastscorer.setText("Last Scorer: AC Milan");
            }
            public void mousePressed(MouseEvent e) {

            }
            public void mouseReleased(MouseEvent e) {

            }
            public void mouseEntered(MouseEvent e) {

            }
            public void mouseExited(MouseEvent e) {

            }
        });
        madridButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                RealScore++;
                result.setText("Result: " + MilanScore + " X " + RealScore);
                winner.setText(getWinner());
                lastscorer.setText("Last Scorer: Real Madrid");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        milanbutton.setBounds(75, 240, 150, 40);
        madridButton.setBounds(275, 240, 150, 40);
        result.setBounds(150, 40, 200, 40);
        winner.setBounds(150,80, 200, 40);
        lastscorer.setBounds(150, 120, 200, 40);

        result.setHorizontalAlignment(JLabel.CENTER);
        winner.setHorizontalAlignment(JLabel.CENTER);
        lastscorer.setHorizontalAlignment(JLabel.CENTER);

        add(milanbutton);
        add(madridButton);

        add(result);
        add(winner);
        add(lastscorer);

        setSize(500, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Match();
    }
}
