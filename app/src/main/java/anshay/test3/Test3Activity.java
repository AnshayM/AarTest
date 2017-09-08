package anshay.test3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import anshay.test2.Test2Activity;

public class Test3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);
    }


    public void click3(View view) {
        Intent intent = new Intent(this, Test2Activity.class);
        startActivity(intent);
    }
}
