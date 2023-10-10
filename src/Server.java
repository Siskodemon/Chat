import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Server extends JFrame {
    private  static  final  int WINDOW_HEIGHT = 456;
    private  static  final  int WINDOW_WIDTH = 307;
    private  static  final  int WINDOW_POSX = 100;
    private  static  final  int WINDOW_POSY = 300;


    JButton start = new JButton("Запуск сервера");
    JButton stop = new JButton("Остановка сервера");

    JTextArea log_server = new JTextArea("");

    Server(Client user){
        //завершает работу программы при закрытии окна
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Устанавливаем позицию вызываемого окна на экране
        setLocation(WINDOW_POSX, WINDOW_POSY);

        // Задаём размеры создаваемого окна
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        //Задаём название(заголовок) для создаваемого окна
        setTitle("Серверная  часть чата");

        start.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                user.setStatusSerer("on");
                log_server.append("Сервер запущен \n");
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

        stop.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                user.setStatusSerer("off");
                log_server.append("Сервер остановлен. \n");
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

        JPanel server_Panel = new JPanel(new GridLayout(1, 2 ));
        server_Panel.add(start);
        server_Panel.add(stop);
        add(log_server, BorderLayout.NORTH);
        add(server_Panel, BorderLayout.SOUTH);

        setVisible(true);
    }
}

