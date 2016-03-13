package com.decorview;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends Activity {
    private final static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View decorViewContent = findViewById(android.R.id.content);

        Class contentClass = decorViewContent.getClass();

        Log.d(TAG, "content class name is " + contentClass.getName());
        //content class name is android.widget.FrameLayout

        ViewGroup decorView = (ViewGroup) decorViewContent.getParent();

        Log.d(TAG, "decorview class name is " + decorView.getClass().getName());
        //decorview class name is android.widget.LinearLayout

        View child1 = decorView.getChildAt(1) ;
        Log.d(TAG, "child1 view is " + child1.getClass().getName());
       
        if(child1 == decorViewContent) {
            Log.d(TAG, "child 1 is content view");
        }



    }
}
