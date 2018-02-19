package com.example.rudra.spellem;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import java.util.*;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener {
    private TextView ts,tt;
    private GestureDetectorCompat gd;
    private CountDownTimer cd;
    static int count=0;
    private ConstraintLayout cl;
    private StringBuilder sb;
    private int control=0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b10;
    private Button b11;
    private Button b12;
    private Button b13;
    private Button b14;
    private Button b15;
    private Button b16;
    private Button b17;
    private Button b18;
    private Button b19;
    private Button b20;
    private Button b21;
    private Button b22;
    private Button b23;
    private Button b24;
    private Button b25;
    private Button b26;
    private Button bdel;
    private int i;
    private TextView score;
    final String arr[]={"abcdefghijklmnopqrstuvwxyz","zyxwvutsrqponmlkjihgfedcba",
            "abcdefghijklmnopqrstuvwyxz","zxywvutsrqponmlkjihgfedcba","abcdefghijklqrstmnopuvwxzy",
            "yzxwvuponmtsrqlkjihgfedcba",
            "uvabcdefghijklmnopqrstwxyz","wvutsrqponmlkjxyzihgfedcba","fghijabcdeklmnopqrstuvwyxz",
            "srqponmlkjihgfezxywvutdcba"};
    final String str[]={"aristotle","buffallo","bazinga","dogs","cats","rudra","ricky","matt","anubhav","holymoly"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tt=findViewById(R.id.tt);
        score=findViewById(R.id.score);
        sb=new StringBuilder();
        cd=new CountDownTimer(31000,1000) {
            @Override
            public void onTick(long l) {
                tt.setText(Integer.toString((int)l/1000));
            }

            @Override
            public void onFinish() {
                cl=findViewById(R.id.cl);
                Drawable d= ContextCompat.getDrawable(getApplicationContext(),R.drawable.score);
                int sdk= Build.VERSION.SDK_INT;
                if(sdk < Build.VERSION_CODES.JELLY_BEAN){
                    cl.setBackgroundDrawable(d);
                }else {
                    cl.setBackground(d);
                }
                TextView lost=findViewById(R.id.lost);
                lost.setText("Your Score: "+count);
                tt.setText("");
                ts.setText("");
                score.setText("");
                TextView wword=findViewById(R.id.wword);
                TextView gword=findViewById(R.id.gword);
                gword.setText("");
                wword.setText("");
                control=-1;
            }
        };
        ts=findViewById(R.id.ts);
        b1=findViewById(R.id.button15);
        b2=findViewById(R.id.button16);
        b3=findViewById(R.id.button17);
        b4=findViewById(R.id.button18);
        b5=findViewById(R.id.button19);
        b6=findViewById(R.id.button20);
        b7=findViewById(R.id.button21);
        b8=findViewById(R.id.button22);
        b9=findViewById(R.id.button23);
        b10=findViewById(R.id.button24);
        b11=findViewById(R.id.button25);
        b12=findViewById(R.id.button26);
        b13=findViewById(R.id.button27);
        b14=findViewById(R.id.button28);
        b15=findViewById(R.id.button29);
        b16=findViewById(R.id.button30);
        b17=findViewById(R.id.button31);
        b18=findViewById(R.id.button32);
        b19=findViewById(R.id.button33);
        b20=findViewById(R.id.button34);
        b21=findViewById(R.id.button35);
        b22=findViewById(R.id.button36);
        b23=findViewById(R.id.button37);
        b24=findViewById(R.id.button38);
        b25=findViewById(R.id.button39);
        b26=findViewById(R.id.button40);
        bdel=findViewById(R.id.button41);

        this.gd=new GestureDetectorCompat(this,this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        cl=findViewById(R.id.cl);
        ts.setText("Your Score");
        score.setText("0");
        TextView lost=findViewById(R.id.lost);
        lost.setText("");
        Drawable d= ContextCompat.getDrawable(getApplicationContext(),R.drawable.bc);
        int sdk= Build.VERSION.SDK_INT;
        if(sdk < Build.VERSION_CODES.JELLY_BEAN){
            cl.setBackgroundDrawable(d);
        }else {
            cl.setBackground(d);
        }
        count=0;
        i=0;
        control=0;
        cd.start();
        hola();
        return true;
    }
    public boolean onTouchEvent(MotionEvent event) {
        this.gd.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
    public void check(String s1,String s2){
        if(s1.length()==s2.length()&&s1.equals(s2)) {
            count++;
            score.setText(Integer.toString(count));
            Random rr=new Random();
            int x=rr.nextInt(9);
            i++;
            if(i>=0){
                i%=10;

            }
            char c[]=arr[x].toCharArray();
            b1.setText(Character.toString(c[0]));
            b2.setText(Character.toString(c[1]));
            b3.setText(Character.toString(c[2]));
            b4.setText(Character.toString(c[3]));
            b5.setText(Character.toString(c[4]));
            b6.setText(Character.toString(c[5]));
            b7.setText(Character.toString(c[6]));
            b8.setText(Character.toString(c[7]));
            b9.setText(Character.toString(c[8]));
            b10.setText(Character.toString(c[9]));
            b11.setText(Character.toString(c[10]));
            b12.setText(Character.toString(c[11]));
            b13.setText(Character.toString(c[12]));
            b14.setText(Character.toString(c[13]));
            b15.setText(Character.toString(c[14]));
            b16.setText(Character.toString(c[15]));
            b17.setText(Character.toString(c[16]));
            b18.setText(Character.toString(c[17]));
            b19.setText(Character.toString(c[18]));
            b20.setText(Character.toString(c[19]));
            b21.setText(Character.toString(c[20]));
            b22.setText(Character.toString(c[21]));
            b23.setText(Character.toString(c[22]));
            b24.setText(Character.toString(c[23]));
            b25.setText(Character.toString(c[24]));
            b26.setText(Character.toString(c[25]));
            hola();
        }
    }
    public void hola(){
        if(control!=-1){
        TextView gword=findViewById(R.id.gword);
        final TextView wword=findViewById(R.id.wword);
        if(sb.length()>=1){
        sb.delete(0,sb.length());
        wword.setText(sb);}
            gword.setText(str[i]);
            b1.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b1.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b2.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b2.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b3.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b3.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b4.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b4.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b5.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b5.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b6.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b6.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b7.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b7.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b8.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b8.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b9.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b9.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b10.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b10.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b11.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b11.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b12.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b12.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b13.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b13.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b14.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b14.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b15.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b15.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b16.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b16.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b17.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b17.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b18.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b18.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b19.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b19.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b20.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b20.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b21.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b21.getText().toString()));
                                check(sb.toString(), str[i]);
                            }

                        }
                    }
            );
            b22.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b22.getText().toString()));
                                check(sb.toString(), str[i]);
                            }

                        }
                    }
            );
            b23.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b23.getText().toString()));
                                check(sb.toString(), str[i]);
                            }

                        }
                    }
            );
            b24.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b24.getText().toString()));
                                check(sb.toString(), str[i]);
                            }

                        }
                    }
            );
            b25.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b25.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            b26.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(control!=-1) {
                                wword.setText(sb.append(b26.getText().toString()));
                                check(sb.toString(), str[i]);
                            }
                        }
                    }
            );
            bdel.setOnClickListener(
                    new Button.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(sb.length()>=1) {
                                wword.setText(sb.deleteCharAt(sb.length() - 1));
                            }
                            check(sb.toString(), str[i]);
                        }
                    }
            );
        }
   }
}
