import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
class  Covid_19 extends JFrame implements ActionListener
{
            
            JPanel panel;
            JPanel panelresult;
            JRadioButton choice1;
            JRadioButton choice2;
            JRadioButton choice3;
            JRadioButton choice4;
            ButtonGroup bg;
            JLabel lblmess;
            JButton btnext;
            String[][] qpa;
            String[][] qca;
            int qaid;
            HashMap<Integer, String> map;

            Covid_19()
                {
                    initializedata();
                    setTitle("Kuiz Covid 19");
                    setDefaultCloseOperation(EXIT_ON_CLOSE);
                    setSize(880,350);
                    setLocation(300,100);
                    setResizable(false);
                    Container cont=getContentPane();
                    cont.setLayout(null);          
                    cont.setBackground(Color.GRAY);
                    bg=new ButtonGroup();     
                    choice1=new JRadioButton("Choice1",true);
                    choice2=new JRadioButton("Choice2",false);
                    choice3=new JRadioButton("Choice3",false);
                    choice4=new JRadioButton("Choice4",false);
                    bg.add(choice1);
                    bg.add(choice2);
                    bg.add(choice3);
                    bg.add(choice4);
                    lblmess=new JLabel("Pilih Jawapan yang Betul");
                    lblmess.setForeground(Color.BLUE);
                    lblmess.setFont(new Font("Arial", Font.BOLD, 15));
                    btnext=new JButton("Teruskan");
                    btnext.setForeground(Color.BLACK);                
                    btnext.addActionListener(this);
                    panel=new JPanel();
                    panel.setBackground(Color.LIGHT_GRAY);
                    panel.setLocation(10,10);
                    panel.setSize(850,300);
                    panel.setLayout(new GridLayout(6,1));
                    panel.add(lblmess);
                    panel.add(choice1);
                    panel.add(choice2);
                    panel.add(choice3);
                    panel.add(choice4);
                    panel.add(btnext);
                    cont.add(panel);
                    setVisible(true);
                    qaid=0;
                    readqa(qaid);
                    
               }
           
        public void actionPerformed(ActionEvent e)
            {
           
                if(btnext.getText().equals("Teruskan"))
                    {
                        if(qaid<9)
                            {
                                               
                                map.put(qaid,getSelection());
                                qaid++;
                                readqa(qaid);
                                 
                            }
                        
                        else 
                            {
                                map.put(qaid,getSelection());
                                btnext.setText("Paparkan Jawapan");
                                
                            }
                    }
                        else if(btnext.getText().equals("Paparkan Jawapan"))
                                
                            
                            new Report();
                            
                      
            }
        
     
        public void initializedata(){
                         
                        qpa=new String[10][5];
                        
                        qpa[0][0]="Sewaktu anda bertemu dengan kawan rapat anda. Apakah anda lakukan ?";
                        qpa[0][1]="Amalkan perjarakan sosial iaitu satu meter atau lebih";
                        qpa[0][2]="Peluh dan Bersalam";
                        qpa[0][3]="Sembang seperti biasa";
                        qpa[0][4]="Ambil Gambar 'Selfie' bersama";

                        qpa[1][0]="Selepas bersin atau batuk apa yang anda akan buat?";
                        qpa[1][1]="Basuh tangan";
                        qpa[1][2]="Basuh tangan dengan sabun selama 20 saat";
                        qpa[1][3]="Lap tangan dengan tisu sahaja";
                        qpa[1][4]="Tidak buat apa-apa";
                       
                        qpa[2][0]="Anda perlu ke tempat kerja dengan pengangkutan awam, apakah anda perlu kerap melakukan?";
                        qpa[2][1]="Tidak buat apa-apa";
                        qpa[2][2]="Kerapkan menyentuh di tempat yang terdedah";
                        qpa[2][3]="Berbual dengan rakan dikelilingi tempat anda";
                        qpa[2][4]="Cuci tangan dengan sabun dan gunakan hand sanitizer";

                        qpa[3][0]="Sekiranya anda mendapati simptom COVID-19, apa yang patut dilakukan?";
                        qpa[3][1]="Jangan memandang serius";
                        qpa[3][2]="Terus berjumpa dengan pegawai kesihatan";
                        qpa[3][3]="Terus berada di rumah";
                        qpa[3][4]="Bersama dengan keluarga";

                        qpa[4][0]="Tempat kerja anda diberikan cuti sepanjang tempoh Perintah Kawalan Pergerakan, masa itu apakah anda lakukan?";
                        qpa[4][1]="Duduk di dalam rumah di mana anda berada";
                        qpa[4][2]="Membuat perancangan untuk melancong";
                        qpa[4][3]="Terus balik kampung";
                        qpa[4][4]="Berlepak bersama dengan keluarga dan kawan-kawan";

                        qpa[5][0]="Selepas balik dari pasaraya dengan membeli barang keperluan, apakah anda perlu lakukan ?";
                        qpa[5][1]="Terus mandi dan cuci pakaian dalam air sabun";
                        qpa[5][2]="Terus memasak";
                        qpa[5][3]="Terus berjumpa dengan ahli keluarga lain";
                        qpa[5][4]="Tidak buat ape-ape";

                        qpa[6][0]="Apa yang anda perlu elakkan atau kurangkan untuk tidak menyebarkan virus ini?";
                        qpa[6][1]="Kurangkan bercakap";
                        qpa[6][2]="Kurangkan menyentuh mulut, hidung dan mata";
                        qpa[6][3]="Kurangkan memejam mata";
                        qpa[6][4]="Selalu pakai baju anti Corona / Hazmat Suits";

                        qpa[7][0]="Bagaimanakah anda boleh membantu untuk tidak menyebarkan virus ini?";
                        qpa[7][1]="Pergi buat perhimpunan";
                        qpa[7][2]="Berada di dalam rumah";
                        qpa[7][3]="Makan angin bersama keluarga";
                        qpa[7][4]="Berjumpa dengan rakan-rakan";

                        qpa[8][0]="Apakah yang dimaksudkan dengan penyakit coronavirus (covid 19)?";
                        qpa[8][1]="Demam Panas";
                        qpa[8][2]="Penyakit Kronik";
                        qpa[8][3]="Penyakit Sawan";
                        qpa[8][4]="Penyakit Pernafasan";

                        qpa[9][0]="Berapa lamakah tempoh masa yang diambil untuk memutuskan rantaian jangkitan Covid -19?";
                        qpa[9][1]="Dalam beberapa jam";
                        qpa[9][2]="7 Hari";
                        qpa[9][3]="1 Hari";
                        qpa[9][4]="14 hari";

                        qca=new String[10][2];
                       
                        qca[0][0]="Sewaktu anda bertemu dengan kawan rapat anda. Apakah anda lakukan ?";
                        qca[0][1]="Amalkan perjarakan sosial iaitu satu meter atau lebih";

                        qca[1][0]="Selepas bersin atau batuk apa yang anda akan buat?";
                        qca[1][1]="Basuh tangan dengan sabun selama 20 saat";

                        qca[2][0]="Anda perlu ke tempat kerja dengan pengangkutan awam, apakah anda perlu kerap melakukan?";
                        qca[2][1]="Cuci tangan dengan sabun dan gunakan hand sanitizer";

                        qca[3][0]="Sekiranya anda mendapati simptom COVID-19, apa yang patut dilakukan?";
                        qca[3][1]="Terus berjumpa dengan pegawai kesihatan";

                        qca[4][0]="Tempat kerja anda diberikan cuti sepanjang tempoh Perintah Kawalan Pergerakan, masa itu apakah anda lakukan?";
                        qca[4][1]="Duduk di dalam rumah di mana anda berada";

                        qca[5][0]="Selepas balik pasaraya dengan membeli barang keperluan, apakah anda perlu lakukan ?";
                        qca[5][1]="Terus mandi dan cuci pakaian dalam air sabun";

                        qca[6][0]="Apa yang anda perlu elakkan atau kurangkan untuk tidak menyebarkan virus ini?";
                        qca[6][1]="Kurangkan menyentuh mulut, hidung dan mata";
                       
                        qca[7][0]="Bagaimanakah anda boleh membantu untuk tidak menyebarkan virus ini?";
                        qca[7][1]="Berada di dalam rumah";
                       
                        qca[8][0]="Apakah yang dimaksudkan dengan penyakit coronavirus (covid 19)?";
                        qca[8][1]="Penyakit pernafasan";

                        qca[9][0]="Berapa lamakah tempoh masa yang diambil untuk memutuskan rantaian jangkitan Covid -19?";
                        qca[9][1]="14 hari";
                       
                        map=new HashMap<Integer, String>();
                       
                        }
        public String getSelection(){
                        String selectedChoice=null;
                        Enumeration<AbstractButton> buttons=bg.getElements(); 
                        while(buttons.hasMoreElements()) 
                        { 
                        JRadioButton temp=(JRadioButton)buttons.nextElement(); 
                        if(temp.isSelected()) 
                                    { 
                                                selectedChoice=temp.getText();
                                    } 
                         }  
                        return(selectedChoice);
            }
        public void readqa(int qid){
                        lblmess.setText("  "+qpa[qid][0]);
                        choice1.setText(qpa[qid][1]);
                        choice2.setText(qpa[qid][2]);
                        choice3.setText(qpa[qid][3]);
                        choice4.setText(qpa[qid][4]);
                        choice1.setSelected(true);
            }
        public void reset(){
                        qaid=0;
                        map.clear();
                        readqa(qaid);
                        btnext.setText("Teruskan");
                        }
       public int calCorrectAnswer(){
                        int qnum=10;
                        int count=1;
                        for(int qid=0;qid<qnum;qid++)
                                    if(qca[qid][1].equals(map.get(qid))) count++;
                        return count;
                        
            }

    public class Report extends JFrame
       {
       
            Report(){
                 setTitle("Jawapan");
                 setSize(1350,550);
                 setBackground(Color.GRAY);
                 addWindowListener(new WindowAdapter(){
                 public void windowClosing(WindowEvent e){
                    dispose();
                    
                 }
            });
                Draw d=new Draw();                                  
                    add(d);
                    
                    setVisible(true);
                }
                                     
        class Draw extends Canvas
        {
            public void paint(Graphics g)
            {
                int qnum=10;
                int x=10;
                int y=20;
                for(int i=0;i<qnum;i++)
                {
                                                            
                g.setFont(new Font("Arial",Font.BOLD,12));                                         
                g.drawString(i+1+". "+qca[i][0], x,y);
                    y+=30;           
                g.setFont(new Font("Arial",Font.PLAIN,12));
                
                g.drawString("Jawapan yang betul:"+qca[i][1], x,y);
                
                y+=30;
                g.drawString("Jawapan anda:"+map.get(i), x,y);
                    y+=30;
                                                            
                    if(y>400)
                        {
                            y=20;
                            x=700;
                        }                                       
                }
                                               
                    int numc=calCorrectAnswer();
                    if(numc>=8)
                    {
                    g.setColor(Color.GREEN);
                    g.setFont(new Font("Arial",Font.BOLD,18));
                    g.drawString("Skor anda: "+numc+" / 10 TAHNIAH! Anda tahu jaga diri anda. Terus menjaga diri supaya kita boleh lawan virus COVID-19" ,50,500);
                    }
                    else if(numc>=5&&numc<8)
                    {
                    g.setColor(Color.BLUE);
                    g.setFont(new Font("Arial",Font.BOLD,18));
                    g.drawString("Skor anda: "+numc+" / 10 AGAK MEMUASKAN! Anda perlu diperbaiki jaga diri anda sebaiknya supaya tidak terdedah COVID-19" ,50,500);
                    }
                    else if (numc >= 0&&numc <5)
                    {
                    g.setColor(Color.RED);
                    g.setFont(new Font("Arial",Font.BOLD,18));
                    g.drawString("Skor anda: "+numc+" / 10 TIDAK MEMUASKAN! Tolong jaga kebersihan dan kesihatan anda supaya kita boleh hapuskan COVID-19 ini secepat mungkin." ,35,500);
                    }
                                                
            }
        }                              
        
     
}
}


