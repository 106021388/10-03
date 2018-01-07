import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
        private Container cp;
        private JButton jbtnr = new JButton("重新猜");
        private JButton jbtng = new JButton("猜看看");
        private JButton jbtna = new JButton("答案");
        private JTextArea jta = new JTextArea(10,20);
        private JPanel jpn = new JPanel();
        private JTextField jtf = new JTextField(5);
        private int c = 0;
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
         jpn.add(jta);
         cp.setLayout(new GridLayout(1,4,5,5));
        jbtnr.setBounds(0,0,100,40);
        jbtng.setBounds(120,125,80,40);
        jbtna.setBounds(0,170,80,40);
        jtf.setBounds(175,0,50,50);
        jpn.add(jtf);
     jbtng.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {

         }
     });













        }
             }

