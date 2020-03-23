package com.example.ex008;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
    Button newgame, check1, check2, check3;
    ImageView iv1, iv2, iv3;
    EditText sum1, sum2, sum3;
    TextView tv1, tv2, tv3, tv4, tv5, tv6;
    Random rnd;
    int num1, num2, amount, count, work;
    String sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newgame = (Button) findViewById(R.id.newgame);
        check1 = (Button) findViewById(R.id.check1);
        check2 = (Button) findViewById(R.id.check2);
        check3 = (Button) findViewById(R.id.check3);
        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv3 = (ImageView) findViewById(R.id.iv3);
        sum1 = (EditText) findViewById(R.id.sum1);
        sum2 = (EditText) findViewById(R.id.sum2);
        sum3 = (EditText) findViewById(R.id.sum3);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);

    }

    public void game(View view) {
        count=0;
        work=1;
        tv1.setText("first num");
        tv3.setText("first num");
        tv5.setText("first num");
        tv2.setText("second num");
        tv4.setText("second num");
        tv6.setText("second num");
        iv1.setImageResource(R.drawable.gob);
        iv2.setImageResource(R.drawable.gob);
        iv3.setImageResource(R.drawable.gob);
        Random rnd = new Random();
        num1 = rnd.nextInt(90) + 10;
        num2 = rnd.nextInt(90) + 10;
        tv1.setText(num1 + "");
        tv2.setText(num2 + "");
    }

    public void firstcheck(View view) {
        if (work == 1) {
            sum = sum1.getText().toString();
            if (!(sum.equals(""))) {
                work = 2;
                amount = Integer.parseInt(sum);
                if (amount == (num1 + num2)) {
                    count++;
                    iv1.setImageResource(R.drawable.good);
                } else
                    iv1.setImageResource(R.drawable.bad);
                Random rnd = new Random();
                num1 = rnd.nextInt(90) + 10;
                num2 = rnd.nextInt(90) + 10;
                tv3.setText(num1 + "");
                tv4.setText(num2 + "");
            }
        }
    }
    public void secondcheck(View view) {
        if (work == 2) {
            sum = sum2.getText().toString();
            if (!(sum.equals(""))) {
                work = 3;
                amount = Integer.parseInt(sum);
                if (amount == (num1 + num2)) {
                    count++;
                    iv2.setImageResource(R.drawable.good);
                }
                else
                    iv2.setImageResource(R.drawable.bad);
                Random rnd = new Random();
                num1 = rnd.nextInt(90) + 10;
                num2 = rnd.nextInt(90) + 10;
                tv5.setText(num1 + "");
                tv6.setText(num2 + "");
            }
        }
    }

    public void thirdcheck(View view) {
        if (work == 3) {
            sum = sum3.getText().toString();
            if (!(sum.equals(""))) {
                amount = Integer.parseInt(sum);
                if (amount == (num1 + num2)) {
                    count++;
                    iv3.setImageResource(R.drawable.good);
                }
                else
                    iv3.setImageResource(R.drawable.bad);
                newgame.setText("your success rates are "+(count*100/3)+" -click for new game");
            }
        }
    }
}