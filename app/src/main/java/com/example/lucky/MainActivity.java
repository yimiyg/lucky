package com.example.lucky;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    private Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt_C, bt_jia, bt_jian, bt_cheng, bt_chu, bt_equal;
    private TextView textView;
    private EditText editText;
    private double n1 = 0.0, n2 = 0.0;
    private OnClickListener lisenter = new OnClickListener() {

        @Override
        public void onClick(View v) {
            textView = (TextView) findViewById(R.id.tv);//返回view
            editText = (EditText) findViewById(R.id.et);
            Button btn = (Button) v;
            switch (btn.getId()) {
                case R.id.bt_0://0
                {
                    editText.setText(editText.getText().toString() + 0);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.bt_1://1
                {
                    String str = editText.getText().toString();//默认值为""?
                    editText.setText(str + 1);
                    str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.bt_2://2
                {
                    String str = editText.getText().toString();
                    editText.setText(str + 2);
                    str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.bt_3://3
                {
                    String str = editText.getText().toString();
                    editText.setText(str + 3);
                    str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.bt_4://4
                {
                    editText.setText(editText.getText().toString() + 4);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.bt_5://5
                {
                    editText.setText(editText.getText().toString() + 5);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.bt_6://6
                {
                    editText.setText(editText.getText().toString() + 6);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.bt_7://7
                {
                    editText.setText(editText.getText().toString() + 7);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.bt_8://8
                {
                    editText.setText(editText.getText().toString() + 8);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.bt_9://9
                {
                    editText.setText(editText.getText().toString() + 9);
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.bt_C:// CLS
                {
                    textView.setText("");
                    editText.setText("");
                    break;
                }
                case R.id.bt_jia:// +
                {
                    editText.setText(editText.getText().toString() + '+');
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.bt_jian:// -
                {
                    editText.setText(editText.getText().toString() + '-');
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.bt_cheng:// *
                {
                    editText.setText(editText.getText().toString() + '*');
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.bt_chu:// /
                {
                    editText.setText(editText.getText().toString() + '/');
                    String str = editText.getText().toString();
                    textView.setText(str);
                    break;
                }
                case R.id.bt_equal:// =
                {
                    String str = editText.getText().toString();
                    textView.setText(str+"=");
                    int num=str.length();
                    String tem="",tem2="";
                    int h;
                    if(num==1)
                    {
                        n1=Double.parseDouble(str);
                        editText.setText(n1+"");
                    }
                    else
                        for(int i=0;i<num;)
                        {
                            if(i==0)
                                for(int j=0;j<num;j++)
                                {
                                    int w=0;
                                    switch(str.charAt(i))
                                    {
                                        case '0':tem+=0;i++;break;
                                        case '1':tem+=1;i++;break;
                                        case '2':tem+=2;i++;break;
                                        case '3':tem+=3;i++;break;
                                        case '4':tem+=4;i++;break;
                                        case '5':tem+=5;i++;break;
                                        case '6':tem+=6;i++;break;
                                        case '7':tem+=7;i++;break;
                                        case '8':tem+=8;i++;break;
                                        case '9':tem+=9;i++;break;
                                        default:w++;//此i时为字符
                                    }
                                    if(w!=0)break;
                                }
                            n1=Double.parseDouble(tem);
                            h=i;
                            i++;
                            tem2="";
                            for(int j=i;j<num;j++)
                            {
                                int w=0;
                                switch(str.charAt(i))
                                {
                                    case '0':tem2+=0;i++;break;
                                    case '1':tem2+=1;i++;break;
                                    case '2':tem2+=2;i++;break;
                                    case '3':tem2+=3;i++;break;
                                    case '4':tem2+=4;i++;break;
                                    case '5':tem2+=5;i++;break;
                                    case '6':tem2+=6;i++;break;
                                    case '7':tem2+=7;i++;break;
                                    case '8':tem2+=8;i++;break;
                                    case '9':tem2+=9;i++;break;
                                    default:w++;//此i时为字符
                                }
                                if(w!=0)break;
                            }
                            n2=Double.parseDouble(tem2);
                            switch(str.charAt(h))
                            {
                                case '+':tem=n1+n2+"";break;
                                case '-':tem=n1-n2+"";break;
                                case '*':tem=n1*n2+"";break;
                                case '/':tem=n1/n2+"";break;
                            }
                        }
                    if(num!=1)
                        editText.setText(tem);
                }
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt0 = (Button) findViewById(R.id.bt_0);
        bt1 = (Button) findViewById(R.id.bt_1);
        bt2 = (Button) findViewById(R.id.bt_2);
        bt3 = (Button) findViewById(R.id.bt_3);
        bt4 = (Button) findViewById(R.id.bt_4);
        bt5 = (Button) findViewById(R.id.bt_5);
        bt6 = (Button) findViewById(R.id.bt_6);
        bt7 = (Button) findViewById(R.id.bt_7);
        bt8 = (Button) findViewById(R.id.bt_8);
        bt9 = (Button) findViewById(R.id.bt_9);
        bt_C = (Button) findViewById(R.id.bt_C);
        bt_jia = (Button) findViewById(R.id.bt_jia);
        bt_jian = (Button) findViewById(R.id.bt_jian);
        bt_cheng = (Button) findViewById(R.id.bt_cheng);
        bt_chu = (Button) findViewById(R.id.bt_chu);
        bt_equal = (Button) findViewById(R.id.bt_equal);

        bt0.setOnClickListener(lisenter);
        bt1.setOnClickListener(lisenter);
        bt2.setOnClickListener(lisenter);
        bt3.setOnClickListener(lisenter);
        bt4.setOnClickListener(lisenter);
        bt5.setOnClickListener(lisenter);
        bt6.setOnClickListener(lisenter);
        bt7.setOnClickListener(lisenter);
        bt8.setOnClickListener(lisenter);
        bt9.setOnClickListener(lisenter);
        bt_C.setOnClickListener(lisenter);
        bt_jia.setOnClickListener(lisenter);
        bt_jian.setOnClickListener(lisenter);
        bt_cheng.setOnClickListener(lisenter);
        bt_chu.setOnClickListener(lisenter);
        bt_equal.setOnClickListener(lisenter);
    }
}