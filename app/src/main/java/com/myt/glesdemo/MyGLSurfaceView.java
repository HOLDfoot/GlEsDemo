package com.myt.glesdemo;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

public class MyGLSurfaceView extends GLSurfaceView {
    public MyGLSurfaceView(Context context) {
        super(context);
        setEGLContextClientVersion(3);
    }

    public MyGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setEGLContextClientVersion(3);
    }
}