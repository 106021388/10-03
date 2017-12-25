import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

    public class MainFrame extends JFrame{
        private Container cp;
        private JButton jbtn1 = new JButton("猜看看");
        private JButton jbtn2 = new JButton("RE");
        private JButton jbtn3 = new JButton("答案");
        private JTextArea jta = new JTextArea();
        private JPanel jpn = new JPanel();
        private JTextField jtfkey = new JTextField("");
        private int count = 0;
        public MainFrame() {
            initComp();
        }
     private void initComp(){
         this.setBounds(100,100,500,500);
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         cp = this.getContentPane();
         cp.setLayout(new BorderLayout(3,3));
         jpn.add(jbtn1);
         jpn.add(jbtn2);
         jpn.add(jbtn3);
         cp.add(jpn,BorderLayout.CENTER);



        }
             }

