package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // btnClick = (Button) findViewById(R.id.button) ;
      //  TextView tv2 = (TextView) findViewById(R.id.textView);
      //  tv2.setText("here is home");

       // ImageView img=
        BottomNavigationView btmNav = findViewById(R.id.btmNav);
        btmNav.setSelectedItemId(R.id.home);
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
/*
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.drawable.notification_icon)
                .setContentTitle(textTitle)
                .setContentText(textContent)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);*/



   /* public void onClick(View v) {

           // EditText tv=(EditText) findViewById(R.id.tv1);
            Intent myIntent=new Intent(this,MainActivity2.class);
            Bundle b=new Bundle();
            b.putString("text",tv.getText().toString());
            myIntent.putExtras(b);
            startActivity(myIntent);
          //  Toast.makeText(this,"aimn",Toast.LENGTH_LONG).show();


        }*/
        //  .setOnClickListener(new View.OnClickListener() {

        //  });
    }
    public void gone(View view){
        FrameLayout fl =(FrameLayout) findViewById(R.id.frameLayout3);
        fl.setVisibility(view.VISIBLE);
    }
    public void back(View view){
        FrameLayout fl =(FrameLayout) findViewById(R.id.frameLayout3);
        fl.setVisibility(view.INVISIBLE);
    }

    }