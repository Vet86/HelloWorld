package vet.helloworld;

import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mHelloTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mHelloTextView = (TextView)findViewById(R.id.textView);
        Button btn = (Button) findViewById(R.id.button3);

        View.OnClickListener clLis = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        btn.setOnClickListener(clLis);
        btn.getText().toString();


    }

    public void onClick(View view) {
        mHelloTextView.setText("Hi");
    }

    public void onClick2(View view) {
        //TextView helloTextView = (TextView)findViewById(R.id.textView);
        //helloTextView.setText("Hello");
    }

    public void onYellowClick(View view) {
        ConstraintLayout cl = (ConstraintLayout)findViewById(R.id.constraintLayout);
        cl.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
    }
}
