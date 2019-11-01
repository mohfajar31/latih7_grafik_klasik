package com.sodiq.latih7_grafik_klasik;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class Latih7_grafik_klasik extends AppCompatActivity {
    private Button tekan;
    private GLSurfaceView grafik1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latih7_garfik_klasik);
        tekan = (Button) findViewById(R.id.button1);
        grafik1 =  new HelloESSurfaceView(this);
        setContentView(grafik1);
    }
    @Override
    protected void onPause(){
        super.onPause();
        grafik1.onPause();
    }
    @Override
    protected void onResume(){
        super.onResume();
        grafik1.onResume();
    }
    class HelloESSurfaceView extends GLSurfaceView {
        public HelloESSurfaceView(Context context){
            super(context);
            setRenderer(new segitiga());
        }
    }
    public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.latih7_grafik_klasik, menu);
        return true;
    }
}
