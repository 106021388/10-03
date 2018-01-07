import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
        private Container cp;
        private JButton jbtnr = new JButton("重新猜");
        private JButton jbtng = new JButton("猜看看");
        private JButton jbtna = new JButton("答案");
        private JTextArea jta = new JTextArea(20,20);
        private JPanel jpn = new JPanel();
        private JTextField jtf = new JTextField(5);
        private final int maxInt = 99;
        private int ans = 0;
        private int numl;
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
         cp.setLayout(new GridLayout(1,4,5,5));
         jbtnr.setBounds(0,0,100,40);
         jbtng.setBounds(120,125,80,40);
         jbtna.setBounds(0,170,80,40);
         jtf.setBounds(175,0,50,50);
         jpn.add(jtf);
         jpn.add(jta);
         numl = (int)(Math.random()*99)+1;
         jbtng.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             int input_ans = numl;
             try {
                 input_ans = Integer.parseInt(jtf.getText());
             } catch (Exception ex) {
                 return;      }
        if (input_ans < ans)
             jta.append(input_ans +"比答案小!\n");
        else if (input_ans > ans)
             jta.append(input_ans +"比答案大!\n");
        else
            jta.append(input_ans +"你答對了!\n");
                    }
     });
  jbtnr.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          jtf.setText("");
          jta.setText("");
          java.util.Random r = new java.util.Random();
          ans = r.nextInt(maxInt) + 1;
          jtf.requestFocus();
      }
  });
 jbtna.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) {
         jta.append("答案是:"+ ans + "\n");
         jtf.setText("");
         jtf.requestFocus();

     }
 });




        }
             }

