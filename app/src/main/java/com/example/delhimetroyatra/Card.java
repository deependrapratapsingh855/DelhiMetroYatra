package com.example.delhimetroyatra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class Card extends AppCompatActivity {
    WebView w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);w=(WebView)findViewById(R.id.webView);
        w.getSettings().setJavaScriptEnabled(true);
        w.getSettings().setBuiltInZoomControls(true);
        w.getSettings().setUseWideViewPort(true);
        // final ProgressDialog dialog=ProgressDialog.show(Card.this,"Connecting Please Wait","Connecting",true);

        w.loadUrl("https://www.dmrcsmartcard.com/");
        setDesktopMode(w,true);
        // dialog.dismiss();


    }



    @Override
    public void onBackPressed() {
        Intent i=new Intent(Card.this,Home.class);
        startActivity(i);
        finish();
    }
    public void setDesktopMode(WebView w,Boolean enabled){
        String newUserAgent=w.getSettings().getUserAgentString();
        if(enabled){
            try{
                String ua=w.getSettings().getUserAgentString();
                String androidDosString=w.getSettings().getUserAgentString().substring(ua.indexOf("("),ua.indexOf(")")+1);
                newUserAgent=w.getSettings().getUserAgentString().replace(androidDosString,"X11; Linux x86_64");

            }catch(Exception e){
                e.printStackTrace();
            }
        }else {
            newUserAgent = null;

        }
        w.getSettings().getUserAgentString();
        w.getSettings().setUseWideViewPort(enabled);
        w.getSettings().setLoadWithOverviewMode(enabled);
        w.reload();
    }

}

