package com.oudedemo.intent;
/*步骤三：
TargetActivity继承Activity
新增onCreate方法
setContentView的layout为target
*/
import android.app.*;
import android.os.*;

public class TargetActivity extends Activity
{
	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		//此处为指定对应的布局yaml
        setContentView(R.layout.target);
    }
}
/* 步骤三结束 */
