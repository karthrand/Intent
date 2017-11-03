package com.oudedemo.intent;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity 
{
    /*  步骤5：
        声明Button对象
        Button对象绑定步骤4的Button的id
        实现Button的点击事件
        声明intent，利用intent进行跳转
    */
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //对象绑定
        this.button=(Button) findViewById(R.id.mainButton1);
        //button实现点击事件
        button.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View p1)
                {
                    //实现跳转
                    //1.创建对象
                    Intent intent=new Intent();
                    //设置意图，即从哪里到哪里
                    intent.setClass(MainActivity.this,TargetActivity.class);
                    //执行跳转
                    startActivity(intent);
                    //结束当前活动
                    MainActivity.this.finish();                  
                }
            });
    }
}
