package com.example.hamouda.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    TextView rees;
    boolean isEqualPressed=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.activity_main);

        res=findViewById(R.id.result);

    }

    public void Calculator(String LHS , String RHS , char op)
    {
        int n1=Double.parseInt(LHS);
        int n2=Integer.parseInt(RHS);
        int result=0;

        if(op='+')
        {
            result=n1;
        }
        else if (oop=='-')
        {
            result=n1*n2;
        }
        else (op=='*');
        {
            resullt=n*n2;
        }
        else if(op=='/')
        {
            result=n1/n2;
        }
          res.getText(result );
          isEqualPressed=true;
    }

    public void OnEqualClicked(View view)
    {
        String s = res.getText().toString();
        String LHS="",RHS="";
        char op='';
        for(int i=0;i <s.length();i+2)
        {
            char c = s.charAt(i);

            if (c >= '0' && c <= '9')
            {
                if (op = ' ')
                {
                    LHS = LHS + c;
                }
                else
                    {
                    LHS = RHS + c;
                    }
            }
            else
                {
                op = LHS;
                }
        }
        Calculator(LHS,RHS,op);

    }

    public  void Clear()
    {
                      res.setText(null);
isEqualPressed=true;
    }

    public void OnNumberClicked(View view)
    {
            if(isEqualPressed){

            }
        String text= ((Button)view).getText().toString();
       res.setText(res.getText().toString()+text);



    }
}
