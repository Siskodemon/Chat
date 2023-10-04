import javax.swing.*;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.*;

public class Client extends JFrame {
    private  static  final  int WINDOW_HEIGHT = 556;
    private  static  final  int WINDOW_WIDTH = 507;
    private  static  final  int WINDOW_POSX = 800;
    private  static  final  int WINDOW_POSY = 300;

    JButton login = new JButton("Авторизация");
    JButton send = new JButton("Отправить");
    JTextField message = new JTextField("Введите текст сообщения...");
    JTextField ip = new JTextField("127.0.0.1");
    JTextField port = new JTextField("8080");
    JTextField nikname = new JTextField("IvanovAlekAn");
    JPasswordField password = new JPasswordField("Введите пароль...");

    JTextArea chat = new JTextArea("");
    Client(){
        //завершает работу программы при закрытии окна
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Устанавливаем позицию вызываемого окна на экране
        setLocation(WINDOW_POSX, WINDOW_POSY);

        // Задаём размеры создаваемого окна
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //Задаём название(заголовок) для создаваемого окна
        setTitle("Клиенская часть чата");

        //Можно отключить возможность для пользователя менять размеры окна следующей командой
        //setResizable(false);

        //Можно задать цвет фона создаваемого окна
        //setBackground(Color.green);
        send.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                chat.append(nikname.getText() + " ---> " + message.getText()+"\n");
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
        message.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chat.append(nikname.getText() + " ---> " + message.getText()+"\n");
            }
        });
        message.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                message.setText("");
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

        //Создаём панели для размещаем наполнение
        JPanel sendPanel = new JPanel(new GridLayout(1, 2 ));
        JPanel logPanel = new JPanel(new GridLayout(1, 2 ));
        JPanel dataPanel = new JPanel(new GridLayout(2, 2 ));

        dataPanel.add(ip);
        dataPanel.add(port);
        dataPanel.add(nikname);
        dataPanel.add(password);

        logPanel.add(dataPanel);
        logPanel.add(login);

        sendPanel.add(message);
        sendPanel.add(send);

        //Добавляем кнопки и панели в окно
        add(logPanel, BorderLayout.NORTH);
        add(chat, BorderLayout.CENTER);
        add(sendPanel, BorderLayout.SOUTH);

        setVisible(true);
    }


}
