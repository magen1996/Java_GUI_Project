import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MainPage extends Frame implements ActionListener {

    public MainPage(){
        JFrame f = new JFrame ("Covid 19");
            
        JLabel label1 = new JLabel ("<html><i>Selamat Datang ke COVID-19 Kuiz Aplikasi kami.<br>Kuiz ini  adalah untuk uji anda dalam menjaga diri anda daripada mencegah COVID 19 ");
        label1.setFont(new Font("Arial", Font.BOLD, 18));
        label1.setForeground(Color.BLUE);
        label1.setBounds(10,0,600,100);
        
        JLabel label2 = new JLabel ("<html><i>Coronavirus yang baru dikenal pasti telah memicu pandemi penyakit penyebab radang paru-paru, belum lagi tekanan yang kuat pada sistem kesihatan,<br> kekacauan di pasaran kewangan ekonomi global dan banyak maklumat yang salah.<br>Kuiz ini  adalah untuk uji anda dalam menjaga diri anda daripada mencegah COVID 19 "
        +"Ikuti kuis ini dan lihat apakah anda mengetahui kebijaksanaan yang ada pada Covid-19, kesannya terhadap pasaran dan cara menghentikannya.");
        label2.setFont(new Font("Arial", Font.BOLD, 14));
        label2.setForeground(Color.BLACK);
        label2.setBounds(10,90,600,100);
        
        JButton button = new JButton("MULA");
        button.setFont(new Font("Arial", Font.BOLD, 25));
        button.setForeground(Color.RED);
                button.setBounds(220, 250,200,60);
         
    f.add(button);
    f.add(label1); 
    f.add(label2); 
  
    f.setTitle ("Covid19");
    f.setSize(680,350);
    f.setResizable(false);
   
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.setLayout(null);
    f.setVisible(true);    
    
    button.addActionListener(new ActionListener(){
   
        @Override
            public void actionPerformed(ActionEvent eva){
            f.dispose();
      
            new Covid_19();
         
    }});

    }
    public static void main(String[] args) 
    {
        new MainPage();
    }

         @Override
            public void actionPerformed(ActionEvent ae) 
        {
            throw new UnsupportedOperationException("Not supported yet."); 
        }  
}