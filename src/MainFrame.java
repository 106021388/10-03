import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

    public class MainFrame extends JFrame{
        private Container cp;
        private JButton jbtnr = new JButton("重新開始");
        private JButton jbtng = new JButton("猜看看");
        private JButton jbtna = new JButton("答案");
        private JTextArea jta = new JTextArea();
        private JPanel jpn = new JPanel();
        private JTextField jtf = new JTextField("");
        private int count = 0;
        public MainFrame() {
            initComp();
        }
     private void initComp(){
         this.setBounds(100,100,350,250);
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         cp = this.getContentPane();
         cp.add(jbtnr);
         cp.add(jbtng);
         cp.add(jbtna);
         cp.add(jpn);
        jbtnr.setBounds(0,0,100,40);
        jbtng.setBounds(120,125,80,40);
        jbtna.setBounds(0,170,80,40);
        jtf.setLocation(175,0);
        jtf.setSize(100,100);
        jpn.add(jtf);


        }
             }

