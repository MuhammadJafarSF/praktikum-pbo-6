package tugas.com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class EventForm extends JFrame{

    JLabel hobby, nama, jkelamin, alamat;
    JLabel laki, perempuan;
    JTextField texthobby, textnama;
    JTextArea textalamat;

    public void tampilanForm(){
        setTitle("Formulir");
        JButton btncetak = new JButton("Cetak");
        nama = new JLabel ("Nama");
        hobby = new JLabel ("Hobby");
        jkelamin = new JLabel ("Gender");
        alamat = new JLabel("Alamat");
        textnama= new JTextField();
        texthobby =new JTextField();
        textalamat = new JTextArea();
        JRadioButton l = new JRadioButton(" Laki-Laki ");
        JRadioButton p = new JRadioButton("perempuan ");
        perempuan = new JLabel("perempuan");
        laki = new JLabel("Laki");

        ButtonGroup group = new ButtonGroup();
        group.add(p);
        group.add(l);

            setLayout(null);
            add(btncetak);
            add(nama);
            add(hobby);
            add(jkelamin);
            add(alamat);
            add(texthobby);
            add(textnama);
            add(textalamat);
            add(p);
            add(l);
            add(perempuan);
            add(laki);

        nama.setBounds(10,20,100,20);
        hobby.setBounds(10,50,100,20);
        textnama.setBounds(120,20,120,20);
        texthobby.setBounds(120,50,120,20);
        jkelamin.setBounds(10,80,100,20);

        alamat.setBounds(10,110,100,20);
        textalamat.setBounds(120,110,120,50);
        p.setBounds (120,80, 20,20);

        perempuan.setBounds(150,80,100,20);
        l.setBounds(260,80,20,20);
        laki.setBounds(290,80,100,20);
        btncetak.setBounds(120,170,100,20);


        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btncetak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String jeniskel="";
                if (l.isSelected()){
                    jeniskel = l.getText();
                }else{
                    jeniskel = p.getText();
                }
                String nama = textnama.getText();
                String hobby = texthobby.getText();
                String alamat = textalamat.getText();

                System.out.println("Nama = "+ nama);
                System.out.println("Hobby = "+ hobby);
                System.out.println("Gender = "+ jeniskel);
                System.out.println("Alamat  = "+ alamat);

                 }
            }
        );
    }
}