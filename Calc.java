import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Calc {
    public static void main(String[] args) {
        Fuctional fnc = new Fuctional();
        fnc.setVisible(true);
        fnc.pack();
        fnc.setLocationRelativeTo(null);
    }
}
class Fuctional extends JFrame {
    public JPanel panel;
    int firstPars;
    int secondPars;
    double result;
    String dey;
    static JLabel label;
    Fuctional(){
        super("Calc lol)");//call JFrame constructor
        createGUI();
    }
    public void createGUI(){
//panel creating
        panel = new JPanel();
        panel.setLayout(new GridLayout(5,5,8,8));
        setDefaultCloseOperation(Fuctional.EXIT_ON_CLOSE);
//label creating


//textArea creating
        JTextField txtArea = new JTextField();
        txtArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        txtArea.setFont(new Font("Verdana",20,20));

        label = new JLabel();
        label.setVisible(true);
        label.setText(txtArea.getText());

//creating all buttons(adding listeners for them and adding on panel)
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton multiButton = new JButton("*");
        JButton divButton = new JButton("/");
        JButton zeroButton = new JButton("0");
        JButton oneButton = new JButton("1");
        JButton twoButton = new JButton("2");
        JButton threeButton = new JButton("3");
        JButton fourButton = new JButton("4");
        JButton fiveButton = new JButton("5");
        JButton sixButton = new JButton("6");
        JButton sevenButton = new JButton("7");
        JButton eightButton = new JButton("8");
        JButton nineButton = new JButton("9");
        JButton delButton = new JButton("delete");
        JButton equalsButton = new JButton("=");
//mouseListener creating
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            //method,that looks where our mouse positioned
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                if(mouseEvent.getComponent() == plusButton){
                    plusButton.setBackground(Color.BLUE);
                }
                if(mouseEvent.getComponent() == twoButton){
                    twoButton.setBackground(Color.LIGHT_GRAY);
                }
                if(mouseEvent.getComponent() == threeButton){
                    threeButton.setBackground(Color.LIGHT_GRAY);
                }
                if(mouseEvent.getComponent() == fourButton){
                    fourButton.setBackground(Color.LIGHT_GRAY);
                }
                if(mouseEvent.getComponent() == fiveButton){
                    fiveButton.setBackground(Color.LIGHT_GRAY);
                }
                if(mouseEvent.getComponent() == sixButton){
                    sixButton.setBackground(Color.LIGHT_GRAY);
                }
                if(mouseEvent.getComponent() == sevenButton){
                    sevenButton.setBackground(Color.LIGHT_GRAY);
                }
                if(mouseEvent.getComponent() == eightButton){
                    eightButton.setBackground(Color.LIGHT_GRAY);
                }
                if(mouseEvent.getComponent() == nineButton){
                    nineButton.setBackground(Color.LIGHT_GRAY);
                }
                if(mouseEvent.getComponent() == zeroButton){
                    zeroButton.setBackground(Color.LIGHT_GRAY);
                }
                if(mouseEvent.getComponent() == multiButton){
                    multiButton.setBackground(Color.BLUE);
                }
                if(mouseEvent.getComponent() == minusButton){
                    minusButton.setBackground(Color.BLUE);
                }
                if(mouseEvent.getComponent() == divButton){
                    divButton.setBackground(Color.BLUE);
                }
                if(mouseEvent.getComponent() == equalsButton){
                    equalsButton.setBackground(Color.BLUE);
                }
                if(mouseEvent.getComponent() == delButton){
                    delButton.setBackground(Color.BLUE);
                }
                if(mouseEvent.getComponent() == oneButton){
                    oneButton.setBackground(Color.lightGray);
                }
            }
            //method hz how to explain
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
                if(mouseEvent.getComponent() == plusButton){
                    plusButton.setBackground(Color.gray);
                }
                if(mouseEvent.getComponent() == twoButton){
                    twoButton.setBackground(Color.gray);
                }
                if(mouseEvent.getComponent() == threeButton){
                    threeButton.setBackground(Color.gray);
                }
                if(mouseEvent.getComponent() == fourButton){
                    fourButton.setBackground(Color.gray);
                }
                if(mouseEvent.getComponent() == fiveButton){
                    fiveButton.setBackground(Color.gray);
                }
                if(mouseEvent.getComponent() == sixButton){
                    sixButton.setBackground(Color.gray);
                }
                if(mouseEvent.getComponent() == sevenButton){
                    sevenButton.setBackground(Color.gray);
                }
                if(mouseEvent.getComponent() == eightButton){
                    eightButton.setBackground(Color.gray);
                }
                if(mouseEvent.getComponent() == nineButton){
                    nineButton.setBackground(Color.gray);
                }
                if(mouseEvent.getComponent() == zeroButton){
                    zeroButton.setBackground(Color.gray);
                }
                if(mouseEvent.getComponent() == multiButton){
                    multiButton.setBackground(Color.gray);
                }
                if(mouseEvent.getComponent() == minusButton){
                    minusButton.setBackground(Color.gray);
                }
                if(mouseEvent.getComponent() == divButton){
                    divButton.setBackground(Color.gray);
                }
                if(mouseEvent.getComponent() == equalsButton){
                    equalsButton.setBackground(Color.gray);
                }
                if(mouseEvent.getComponent() == delButton){
                    delButton.setBackground(Color.gray);
                }
                if(mouseEvent.getComponent() == oneButton){
                    oneButton.setBackground(Color.gray);
                }
            }
        };

//creating Action listener for buttons
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = e.getActionCommand();
                label.setText(txtArea.getText()+input);
                switch (input){
                    case "0": txtArea.setText(txtArea.getText() + input);
                        break;
                    case "1": txtArea.setText(txtArea.getText() + input);
                        break;
                    case "2": txtArea.setText(txtArea.getText() + input);
                        break;
                    case "3": txtArea.setText(txtArea.getText() + input);
                        break;
                    case "4": txtArea.setText(txtArea.getText() + input);
                        break;
                    case "5": txtArea.setText(txtArea.getText() + input);
                        break;
                    case "6": txtArea.setText(txtArea.getText() + input);
                        break;
                    case "7": txtArea.setText(txtArea.getText() + input);
                        break;
                    case "8": txtArea.setText(txtArea.getText() + input);
                        break;
                    case "9": txtArea.setText(txtArea.getText() + input);
                        break;
                    case "delete": txtArea.setText("");
                        break;
                    case "*":
                        txtArea.setText(txtArea.getText());
                        firstPars = Integer.parseInt(txtArea.getText());
                        txtArea.setText("");
                        dey = "*";
                        break;
                    case "-": txtArea.setText(txtArea.getText());
                        firstPars = Integer.parseInt(txtArea.getText());
                        txtArea.setText("");
                        dey = "-";
                        break;
                    case "+": txtArea.setText(txtArea.getText());
                        firstPars = Integer.parseInt(txtArea.getText());
                        txtArea.setText("");
                        dey = "+";
                        break;
                    case "/": txtArea.setText(txtArea.getText());
                        firstPars = Integer.parseInt(txtArea.getText());
                        txtArea.setText("");
                        dey = "/";
                        break;
                    case "=":
                        switch (dey){
                            case "*":
                                int i;
                                secondPars = Integer.parseInt(txtArea.getText());
                                result = firstPars * secondPars;
                                i = (int)result;
                                txtArea.setText(Integer.toString(i));
                                break;
                            case "/":
                                secondPars = Integer.parseInt(txtArea.getText());
                                result = (double)firstPars / secondPars  ;
                                txtArea.setText(Double.toString(result));
                                break;
                            case "+":
                                secondPars = Integer.parseInt(txtArea.getText());
                                result = firstPars + secondPars;
                                i = (int)result;
                                txtArea.setText(Integer.toString(i));
                                break;
                            case "-":
                                secondPars = Integer.parseInt(txtArea.getText());
                                result = firstPars - secondPars;
                                i = (int)result;
                                txtArea.setText(Integer.toString(i));
                                break;
                        }
                }
            }
        };
        sevenButton.setBackground(Color.gray);
        sevenButton.addMouseListener(mouseListener);
        sevenButton.addActionListener(listener);
        sevenButton.setFont(new Font("Verdana",20,20));
        panel.add(sevenButton);

        eightButton.setBackground(Color.gray);
        eightButton.addMouseListener(mouseListener);
        eightButton.addActionListener(listener);
        eightButton.setFont(new Font("Verdana",20,20));
        panel.add(eightButton);

        nineButton.setBackground(Color.gray);
        nineButton.addMouseListener(mouseListener);
        nineButton.addActionListener(listener);
        nineButton.setFont(new Font("Verdana",20,20));
        panel.add(nineButton);

        multiButton.setBackground(Color.gray);
        multiButton.addMouseListener(mouseListener);
        multiButton.addActionListener(listener);
        multiButton.setFont(new Font("Verdana",20,20));
        panel.add(multiButton);

        fourButton.setBackground(Color.gray);
        fourButton.addMouseListener(mouseListener);
        fourButton.addActionListener(listener);
        fourButton.setFont(new Font("Verdana",20,20));
        panel.add(fourButton);

        fiveButton.setBackground(Color.gray);
        fiveButton.addMouseListener(mouseListener);
        fiveButton.addActionListener(listener);
        fiveButton.setFont(new Font("Verdana",20,20));
        panel.add(fiveButton);

        sixButton.setBackground(Color.gray);
        sixButton.addMouseListener(mouseListener);
        sixButton.addActionListener(listener);
        sixButton.setFont(new Font("Verdana",20,20));
        panel.add(sixButton);

        minusButton.setBackground(Color.gray);
        minusButton.addMouseListener(mouseListener);
        minusButton.addActionListener(listener);
        minusButton.setFont(new Font("Verdana",20,20));
        panel.add(minusButton);

        oneButton.setBackground(Color.gray);
        oneButton.addMouseListener(mouseListener);
        oneButton.addActionListener(listener);
        oneButton.setFont(new Font("Verdana",20,20));
        panel.add(oneButton);

        twoButton.setBackground(Color.gray);
        twoButton.addMouseListener(mouseListener);
        twoButton.addActionListener(listener);
        twoButton.setFont(new Font("Verdana",20,20));
        panel.add(twoButton);

        threeButton.setBackground(Color.gray);
        threeButton.addMouseListener(mouseListener);
        threeButton.addActionListener(listener);
        threeButton.setFont(new Font("Verdana",20,20));
        panel.add(threeButton);

        plusButton.setBackground(Color.gray);
        plusButton.addMouseListener(mouseListener);
        plusButton.addActionListener(listener);
        plusButton.setFont(new Font("Verdana",20,20));
        panel.add(plusButton);

        zeroButton.setBackground(Color.gray);
        zeroButton.addMouseListener(mouseListener);
        zeroButton.addActionListener(listener);
        zeroButton.setFont(new Font("Verdana",20,20));
        panel.add(zeroButton);

        equalsButton.setBackground(Color.gray);
        equalsButton.addMouseListener(mouseListener);
        equalsButton.addActionListener(listener);
        equalsButton.setFont(new Font("Verdana",20,20));
        panel.add(equalsButton);

        delButton.setBackground(Color.gray);
        delButton.addMouseListener(mouseListener);
        delButton.addActionListener(listener);
        delButton.setFont(new Font("Verdana",20,20));
        panel.add(delButton);

        divButton.setBackground(Color.gray);
        divButton.addMouseListener(mouseListener);
        divButton.addActionListener(listener);
        divButton.setFont(new Font("Verdana",20,20));
        panel.add(divButton);
//cycle that uses addButton for all our created buttons
       /*for(int i = 1;i < buttons.length;i ++){
           System.out.println(buttons[i]);
           addButton(buttons[i],listener,mouseListener);
       }*/
//adding textArea on panel
        panel.add(txtArea);
        //panel.add(label);
        setPreferredSize(new Dimension(800,400));
        getContentPane().add(panel);
    }
    //method, that creates buttons with name and listener
   /*void addButton(String name,ActionListener listener, MouseListener mouseListener){
       button = new JButton(name);
       button.addActionListener(listener);
       button.addMouseListener(mouseListener);
       panel.add(button);
   }*/
}