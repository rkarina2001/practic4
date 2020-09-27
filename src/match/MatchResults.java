package match;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MatchResults extends JFrame {
    private int team1=0;
    private int team2=0;
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");

    JLabel result = new JLabel(team1+" X "+team2, SwingConstants.CENTER);
    JLabel last = new JLabel("Last Scorer: N/A",SwingConstants.CENTER);
    JLabel win = new JLabel("Winner: DRAW",SwingConstants.CENTER);

    Font font = new Font("Verdana", Font.PLAIN, 11);

    MatchResults(){
        super("Game Score");
        setLayout(new BorderLayout());
        setSize(600,300);

        result.setFont(font);
        button1.setFont(font);
        button2.setFont(font);
        last.setFont(font);
        win.setFont(font);

        add(button1,BorderLayout.WEST);
        add(button2,BorderLayout.EAST);
        add(result,BorderLayout.CENTER);
        add(last,BorderLayout.NORTH);
        add(win,BorderLayout.SOUTH);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                team1++;
                result.setText(team1 + " X " + team2);
                last.setText("Last Scorer: AC Milan");
                if (team1 > team2)
                    win.setText("Winner: AC Milan");
                if (team1 == team2)
                    win.setText("Winner: DRAW");
            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                team2++;
                result.setText(team1 + " X " + team2);
                last.setText("Last Scorer: Real Madrid");
                if (team1 < team2)
                    win.setText("Winner: Real Madrid");
                if (team1 == team2)
                    win.setText("Winner: DRAW");
            }
        });
    }
    public static void main(String[]args)
    {
        new MatchResults().setVisible(true);
    }
}
