package com.isotest;

import android.app.*;
import android.os.*;
import io.fabianterhorst.isometric.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		iview=(IsometricView) findViewById(R.id.isometricView);
		Path path=new Path();
		iview.add(path,new Color(1,2,3));
		
    }
	IsometricView iview;
}
