import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

    public class MainFrame extends JFrame{
        private Container cp;
        private JButton jbtn1 = new JButton("範例");
        private JButton jbtn2 = new JButton("加密");
        private JButton jbtn3 = new JButton("清除");
        private JButton jbtn4 = new JButton("離開");
        private JLabel jlb = new JLabel("0");
        private JTextArea jtaL = new JTextArea();
        private JTextArea jtaR = new JTextArea();
        private JScrollPane jspL = new JScrollPane(jtaL);
        private JScrollPane jspR = new JScrollPane(jtaR);
        private JPanel jpnC = new JPanel(new GridLayout(6,1,3,3));
        private JTextField jtfkey = new JTextField("3");
        private int count = 0;
        public MainFrame() {
            initComp();
        }
     private void initComp(){
         this.setBounds(100,100,500,500);
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         cp = this.getContentPane();
         cp.setLayout(new GridLayout(5,1,3,3 ));
         cp.setLayout(new BorderLayout(3,3));
         jpnC.add(jbtn1);
         jpnC.add(jbtn2);
         //jlb.setHorizontalTextPosition(JLabel.CENTER);
         //jpnC.add(jlb);
         jpnC.add(jtfkey);
         jpnC.add(jbtn3);
         jpnC.add(jbtn4);
         jtaL.setLineWrap(true);
         jtaR.setLineWrap(true);
         cp.add(jpnC,  BorderLayout.CENTER);
         cp.add(jspL,  BorderLayout.WEST);
         cp.add(jspR,  BorderLayout.EAST);
         jtaL.setPreferredSize(new Dimension(200,400));
         jtaR.setPreferredSize(new Dimension(200,400));








         jbtn1.addActionListener(new AbstractAction() {
         @Override
         public void actionPerformed(ActionEvent e) {
            jtaL.setText("Two of AU students’ works entitled“Neiwan Love Story” " +
                    "and“Taiwan Old-street Chinese Characters” win the " +
                    "“Best of the Best” RedDot Medals." );
         }
     });
            jbtn2.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    char data[] = jtaL.getText().toCharArray();
                    int len = data.length ,key = Integer.parseInt(jtfkey.getText());
                    for(int i =0;i<len;i++){
                        data[i] +=key;
                    }
              jtaR.setText(new String(data));
                 }
            });
            jbtn3.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                             jtaL.setText("");
                             jtaR.setText("");
                }
            });

            jbtn4.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   System.exit(0);
                }
            });

        }
             }

