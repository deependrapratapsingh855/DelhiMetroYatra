package com.example.delhimetroyatra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Gate extends AppCompatActivity {
    AutoCompleteTextView a;
    Button b;
    ImageView i;
    TextView t4,t5,t6,t7,t8,t9,t10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gate);
        a=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        b=(Button)findViewById(R.id.button8);
        i=(ImageView)findViewById(R.id.imageView5);
        t4=(TextView)findViewById(R.id.textView4);
        t5=(TextView)findViewById(R.id.textView5);
        t6=(TextView)findViewById(R.id.textView6);
        t7=(TextView)findViewById(R.id.textView7);
        t8=(TextView)findViewById(R.id.textView8);
        t9=(TextView)findViewById(R.id.textView12);
        t10=(TextView)findViewById(R.id.textView13);

        a.setThreshold(1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,Station);
        a.setAdapter(adapter);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.showDropDown();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=a.getText().toString();
                if(s.equals("AIIMS"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: AIIMS Hospital");
                    t6.setText("Gate No.2: Ansari Nagar");
                    t7.setText("Gate No.3: Safdarjung Hospital");
                    t8.setText("Gate No.4: Vardhman Mahavir Medical College");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Adarsh Nagar"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: Moolchand Colony");
                    t6.setText("Gate No.2: Keval Park/Majlish Park");
                    t7.setText("Gate No.3: New Sabji Mandi/Adarsh Nagar Indian Railway Station");
                    t8.setText("Gate No.4: Fruit Mandi/Sarai Pipal Thala");
                    t9.setText("");
                    t10.setText("");

                }
                else if(s.equals("Akshardham"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: Swami Narayana Akshardham");
                    t6.setText("Gate No.2: Parking");
                    t7.setText("");
                    t8.setText("");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Alpha 1"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Data Not Avalable");
                    t6.setText("");
                    t7.setText("");
                    t8.setText("");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Anand Vihar"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: Urabn Institute Of Management");
                    t6.setText("Gate No.2: ISBT Anand Vihar");
                    t7.setText("Gate No.3: Anand Vihar I.S.B.T.");
                    t8.setText("Gate No.4: Anand Vihar Railway Station");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Arjun Garh"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: Aya Nagar");
                    t6.setText("Gate No.2: Air Force Station Arjangarh");
                    t7.setText("");
                    t8.setText("");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Arthala"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: Parsavnath Exotica, Arthala Peer, Commercial Tax Office,City Forest Ghaziabad,Mohan Mandir");
                    t6.setText("Gate No.2: I.T.S. College, Arthala Village");
                    t7.setText("");
                    t8.setText("");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Ashok Park Main"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: Madan Park/Ashok Park Extn");
                    t6.setText("Gate No.2: Ashok Park Colony/Rampura");
                    t7.setText("");
                    t8.setText("");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Ashram"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: Delhi Fire Service Station");
                    t6.setText("Gate No.2: Siddharth Enclave");
                    t7.setText("Gate No.3: Kilokari Market");
                    t8.setText("");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Azadpur"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: Mahendru Enclave/Model Town=III");
                    t6.setText("Gate No.2: Not Operational");
                    t7.setText("Gate No.3: Azadpur GT Road,Azadpur Railway Stn. Lal Bagh");
                    t8.setText("Gate No.4: Municipal Colony,Model Town-3,Chatrasaal Stdm.");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Badarpur"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: Passengers Underpass/Near Faridabad Toll Plaza");
                    t6.setText("Gate No.2: Institute of Hotel Management");
                    t7.setText("");
                    t8.setText("");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Badkal Mor"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: North-Verddhman Multiplex Mall");
                    t6.setText("Gate No.2: South-Chlrif Apartment,Delhi Public School");
                    t7.setText("Gate No.3: West-Karkhana Bagh Indistrial Area");
                    t8.setText("");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Bahadurgarh City"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: Bus Stand Bahadur Garh, New Sabji Mandi, Dalbir Nagar,Basant Vihar,Astha Hospital");
                    t6.setText("Gate No.2: Shaheed Brigadier Hoshiyar Singh Stadium, Sadar Thana Brahma Shakti Sanjivni Hospital");
                    t7.setText("");
                    t8.setText("");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Barakhamba"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: Metro Bhavan");
                    t6.setText("Gate No.2: Kanchanjunga Building");
                    t7.setText("Gate No.3: Dcm Building");
                    t8.setText("Gate No.4: Inderprakash And Vijay Building");
                    t9.setText("Gate No.5: Narayan Manjil");
                    t10.setText("Gate No.: New Delhi House");
                }
                else if(s.equals("Bata Chowk"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: North-IMT Faridabad");
                    t6.setText("Gate No.2: South-SRS Multiplex,Sec-12,Paeshnath City Mall");
                    t7.setText("Gate No.3: West-Airforce Station,Radisson Hotel,Sec-20");
                    t8.setText("");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Belvedere Tower(Rapid Metro)"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: Building No.-10,Belvedere Tower,DLF Square and DLF Atria");
                    t6.setText("");
                    t7.setText("");
                    t8.setText("");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Bhikaji Cama Place"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: Netaji Nagar(Block A,B,C,G), Palika Bhawan ,RK Puram Sector-13");
                    t6.setText("Gate No.2: Sector-55, Sulekha Vihar(across), DTC Sarojini Nagar Depot");
                    t7.setText("Gate No.3: EIL, Hyatt Regency, Gail India Ltd");
                    t8.setText("");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Botanical Garden"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: Chhalera Village, Amity University, Salapur Village,Bus Terminal Sec.-37");
                    t6.setText("Gate No.2: Amar Shaheed Vijayant Enclave Sector 29,N.M.C. Hospital,Arun Vihar Sec. 37, Bus Terminal Sec. 37,Authority Parking,Metro Parking");
                    t7.setText("Gate No.3: Authority Parking,Metro Parking");
                    t8.setText("Gate No.4: Amar Shaheed Vijayant Enclave Sector 29,Chhalera Village, Amity University, Salapur Village,Bus Terminal Sec.-37,Metro Parking,N.M.C. Hospital,Arun Vihar Sec. 37");
                    t9.setText("");
                    t10.setText("");
                }
                else if(s.equals("Brigadier Hoshiar Singh"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Gate No.1: Tau Devilal Park,Sector-6,Sector-7,Housing Board Colony");
                    t6.setText("Gate No.2: Old Industrial Area,Civil Hospital,New Basti,Nehru Park");
                    t7.setText("");
                    t8.setText("");
                    t9.setText("");
                    t10.setText("");
                }



            }
        });
    }
    private static final String[] Station=new String[]{"AIIMS","Adarsh Nagar","Akshardham","Alpha 1","Anand Vihar","Arjun Garh","Arthala","Ashok Park Main","Ashram","Azadpur","Badarpur","Badkal Mor","Bahadurgarh City","Barakhamba","Bata Chowk","Belvedere Tower(Rapid Metro)","Bhikaji Cama Place","Botanical Garden","Brigadier Hoshiar Singh","Central Secretariat","Chandhni Chowk","Chawri Bazar","Chhattarpur","Chirag Delhi","Civil Line","Cyber City (Rapid Metro)","Dabri Mor-Janakpuri South","Dashrath Puri","Delhi Aerocity","Delhi Cantt","Delhi Gate","Delta 1","Depot Station","Dhaula Kuan","Dilshad Garden","Durgabai Deshmukh South Campus","Dwarka","Dwarka Mor","Dwarka Sector 10","Dwarka Sector 11","Dwarka Sector 12","Dwarka Sector 13","Dwarka Sector 14","Dwarka Sector 21","Dwarka Sector 8","Dwarka Sector 9","ESI Basai Darapur","East Azad Nagar","East Vinod Nagar-Mayur Vihar-II","Escorts Mujesar"};

    @Override
    public void onBackPressed() {
        Intent i=new Intent(Gate.this,Home.class);
        startActivity(i);
        finish();
    }
}