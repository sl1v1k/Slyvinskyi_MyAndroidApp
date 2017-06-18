package ua.kiev.prog.myandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView view = (TextView) findViewById(R.id.textView);
//        view.setText("123");
//
//        ViewGroup viewGroup = (ViewGroup) view.getParent();
//        viewGroup.addView(view);
//
//        TextView textView = new TextView(this);
//
//        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.topMargin = 100;
//        textView.setLayoutParams(layoutParams);
//
//        setContentView(textView);
    }
}
