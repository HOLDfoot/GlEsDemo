package com.myt.glesdemo;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private GLSurfaceView mGlSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mGlSurfaceView = new MyGLSurfaceView(this);
        setContentView(mGlSurfaceView);
        mGlSurfaceView.setRenderer(new MyRender(this));
    }

    @Override
    protected void onResume() {
        super.onResume();
        mGlSurfaceView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mGlSurfaceView.onPause();
    }
}