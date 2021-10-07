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

public class Parking extends AppCompatActivity {
    Button b;
    AutoCompleteTextView a;
    ImageView i;
    TextView t4,t5,t6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);
        a=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);
        b=(Button)findViewById(R.id.buttonp);
        i=(ImageView)findViewById(R.id.imageView5);
        t4=(TextView)findViewById(R.id.textView14);
        t5=(TextView)findViewById(R.id.textView15);
        t6=(TextView)findViewById(R.id.textView16);


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
                    t5.setText("Metro parking not available.");
                    t6.setText("Nearest Parking is AIIMS hospital parking");

                }
                else if(s.equals("Adarsh Nagar"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Metro parking not available.");
                    t6.setText("Nearest Parking is AZU/JGPI Metro");

                }
                else if(s.equals("Akshardham"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Metro parking available.");
                    t6.setText("");

                }
                else if(s.equals("Alpha 1"))
                {
                    t4.setText(s +" Station");
                    t5.setText("No Parking available.");
                    t6.setText("");

                }
                else if(s.equals("Anand Vihar"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Metro parking not available.");
                    t6.setText("Nearest Parking is DTC Parking");

                }
                else if(s.equals("Arjun Garh"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Metro parking available.");
                    t6.setText("");

                }
                else if(s.equals("Arthala"))
                {
                    t4.setText(s +" Station");
                    t5.setText("No Parking Available");
                    t6.setText("");

                }
                else if(s.equals("Ashok Park Main"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Metro parking not available.");
                    t6.setText("Nearest Parking is PBGE Metro");

                }
                else if(s.equals("Ashram"))
                {
                    t4.setText(s +" Station");
                    t5.setText("No Parking Available");
                    t6.setText("");
                }
                else if(s.equals("Azadpur"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Metro parking available.");
                    t6.setText("");
                }
                else if(s.equals("Badarpur"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Metro parking available.");
                    t6.setText("");
                }
                else if(s.equals("Badkal Mor"))
                {
                    t4.setText(s +" Station");
                    t5.setText("No Parking Available");
                    t6.setText("");

                }
                else if(s.equals("Bahadurgarh City"))
                {
                    t4.setText(s +" Station");
                    t5.setText("No Parking Available");
                    t6.setText("");

                }
                else if(s.equals("Barakhamba"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Metro parking not available.");
                    t6.setText("Nearest Parking is NDMC Parking");

                }
                else if(s.equals("Bata Chowk"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Metro parking available.");
                    t6.setText("");

                }
                else if(s.equals("Belvedere Tower(Rapid Metro)"))
                {
                    t4.setText(s +" Station");
                    t5.setText("No Parking Available");
                    t6.setText("");

                }
                else if(s.equals("Bhikaji Cama Place"))
                {
                    t4.setText(s +" Station");
                    t5.setText("No Parking Available");
                    t6.setText("");

                }
                else if(s.equals("Botanical Garden"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Metro parking available.");
                    t6.setText("");
                }
                else if(s.equals("Brigadier Hoshiar Singh"))
                {
                    t4.setText(s +" Station");
                    t5.setText("Metro parking available.");
                    t6.setText("");
                }
            }
        });
    }
    private static final String[] Station=new String[]{"AIIMS","Adarsh Nagar","Akshardham","Alpha 1","Anand Vihar","Arjun Garh","Arthala","Ashok Park Main","Ashram","Azadpur","Badarpur","Badkal Mor","Bahadurgarh City","Barakhamba","Bata Chowk","Belvedere Tower(Rapid Metro)","Bhikaji Cama Place","Botanical Garden","Brigadier Hoshiar Singh","Central Secretariat","Chandhni Chowk","Chawri Bazar","Chhattarpur","Chirag Delhi","Civil Line","Cyber City (Rapid Metro)","Dabri Mor-Janakpuri South","Dashrath Puri","Delhi Aerocity","Delhi Cantt","Delhi Gate","Delta 1","Depot Station","Dhaula Kuan","Dilshad Garden","Durgabai Deshmukh South Campus","Dwarka","Dwarka Mor","Dwarka Sector 10","Dwarka Sector 11","Dwarka Sector 12","Dwarka Sector 13","Dwarka Sector 14","Dwarka Sector 21","Dwarka Sector 8","Dwarka Sector 9","ESI Basai Darapur","East Azad Nagar","East Vinod Nagar-Mayur Vihar-II","Escorts Mujesar"};


    @Override
    public void onBackPressed() {
        Intent i=new Intent(Parking.this,Home.class);
        startActivity(i);
        finish();
    }
}