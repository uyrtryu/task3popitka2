import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;

public class Gui extends JFrame {

    private JTextField name_field;
    private JLabel name;
    private JLabel extention;
    private JTextField extention_field;

    JRadioButton Queue1;

    JRadioButton MyQueue1;

    JRadioButton Stack;

    public Gui() {
        super("Контактная форма");
        super.setBounds(200, 100, 300, 300);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(10, 10, 10, 10));

        name = new JLabel("Введите адрес:");
        name_field = new JTextField("", 1);
        extention = new JLabel("Введите искомое расширение:");
        extention_field = new JTextField("", 1);

        container.add(name);
        container.add(name_field);
        container.add(extention);
        container.add(extention_field);


        JButton send_button = new JButton("Решение");

        container.add(send_button);

        send_button.addActionListener(new Activo());


        ButtonGroup group = new ButtonGroup();
        Queue1 = new JRadioButton("Queue1", false);
        container.add(Queue1);
        MyQueue1 = new JRadioButton("MyQueue", true);
        container.add(MyQueue1);
        Stack = new JRadioButton("Steak", false);
        container.add(Stack);
        container.add(send_button);

        group.add(Queue1);
        group.add(MyQueue1);
        group.add(Stack);


//        int a = 0;
//        if(smallButton.isSelected())  a = 8;
//        else if(mediumButton.isSelected()) a = 12;

    }

    class Activo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = name_field.getText();
            String extention = extention_field.getText();
            String radioButton = "1";

            if (Queue1.isSelected()){

            }else if (MyQueue1.isSelected()){
                radioButton = "2";
            }else if (Stack.isSelected()){
                radioButton = "3";
            }

            String arrayAnsver = String.join("\n", Activ.activ(name, extention, radioButton));



                JOptionPane.showMessageDialog(null, arrayAnsver, "Решение", JOptionPane.PLAIN_MESSAGE);

        }

    }
}
