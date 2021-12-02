package com.example.charactercreator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
//    TextView textView = (TextView) findViewById(R.id.textView2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent incomingIntent = getIntent();
//        ArrayList<String> incomingCreation = incomingIntent.getStringArrayListExtra("info");
//        textView.setText(incomingCreation.get(0) + incomingCreation.get(1) + incomingCreation.get(2));
    }

    public void onGetUsersInfo(View view) {

//        Intent incomingIntent = getIntent();
//        textView.setText(incomingCreation.get(0));
//         + incomingCreation.get(1) + incomingCreation.get(2)

        Intent getInfoScreenIntent = new Intent(this,
                Info.class);
        ArrayList<String> incomingCreation = getInfoScreenIntent.getStringArrayListExtra("info");
//        TextView textView = (TextView) findViewById(R.id.textView2);
//        textView.setText(incomingCreation.get(0));

//        final int result = 1;
//
//        getInfoScreenIntent.putExtra("activity", "thing");
//
//        startActivityForResult(getInfoScreenIntent, result);



        startActivity(getInfoScreenIntent);

    }
}
