package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {


    private boolean index=false;
    LinearLayout mylayout;
    FloatingActionButton btn;
    public int index2=0;
    ArrayList<String> arr;
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        arr=new ArrayList<String>();
        BottomNavigationView btmNav = findViewById(R.id.btmNav);
        FrameLayout fr=findViewById(R.id.FL);
        fr.setVisibility(View.INVISIBLE);
        btmNav.setSelectedItemId(R.id.CD);
        btmNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        return true;
                    case R.id.CD:
                        startActivity(new Intent(getApplicationContext(),MainActivity2.class));
                        return true;
                    case R.id.kibla:
                        startActivity(new Intent(getApplicationContext(),MainActivity3.class));
                        return true;
                    default:

                }
                return false;

            }
        });
                mylayout=(LinearLayout)findViewById(R.id.layout2);
                btn=(FloatingActionButton)findViewById(R.id.btn3);



    }

    public void onClick(View view){
        EditText etxt=(EditText)findViewById(R.id.etxt);
        if(!etxt.getText().toString().isEmpty()) {
        addView();
        addString(); }

        else
            Toast.makeText(this,"write your dhikr please ! ",Toast.LENGTH_LONG).show();
    }
    public void afficherF(View view){
        EditText etxt=(EditText)findViewById(R.id.etxt);
        etxt.setText("");
        FrameLayout fr=findViewById(R.id.FL);
        fr.setVisibility(View.VISIBLE);
    }
    public void addView(){

        if(!index){

                index = true;
                View view = getLayoutInflater().inflate(R.layout.addlayout, null, false);
                TextView txt = (TextView) view.findViewById(R.id.txt);

                ImageButton btn1 = (ImageButton) view.findViewById(R.id.btn1);
                //  ImageButton btn2=(ImageButton)view.findViewById(R.id.btn2);
                mylayout.addView(view, index2);

                index2++;
            }
        else
            Toast.makeText(this,"You already opening a view ",Toast.LENGTH_LONG).show();

    }
    public void addString(){
        EditText etxt=(EditText)findViewById(R.id.etxt);
            FrameLayout fr=findViewById(R.id.FL);
            fr.setVisibility(View.INVISIBLE);
            index=false;
            mylayout.setVisibility(View.VISIBLE);
            TextView txt=mylayout.getChildAt(i).findViewById(R.id.txt);
            arr.add(txt.getText().toString());
            System.out.println(txt.getText().toString());

            txt.setText(etxt.getText().toString());
            i++;


       // ImageButton btn2=mylayout.getChildAt(i).findViewById(R.id.btn2);
      //  ImageButton btn1=(ImageButton)view.findViewById(R.id.btn1);
       // btn2.setVisibility(View.INVISIBLE);
      //  btn1.setVisibility(View.INVISIBLE);


        //Toast.makeText(this,arr.get(i),Toast.LENGTH_LONG).show();
       // String.valueOf(i)

        //view.setVisibility(View.INVISIBLE);
    }


}