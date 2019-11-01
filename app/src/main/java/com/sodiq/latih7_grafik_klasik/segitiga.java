package com.sodiq.latih7_grafik_klasik;

import android.opengl.EGLConfig;
import android.opengl.GLSurfaceView;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

public class segitiga implements GLSurfaceView.Renderer {
    private FloatBuffer triangle;

    @Override
    public void onSurfaceCreated(GL10 gl10, javax.microedition.khronos.egl.EGLConfig eglConfig) {
        gl10.glClearColor(0.0f, 0.9f,0.9f,1.5f);
        initShapes();
        gl10.glEnableClientState(GL10.GL_VERTEX_ARRAY);
    }

    @Override
    public void onSurfaceChanged(GL10 gl10, int i, int i1) {
       gl10.glViewport(0, 0, i, i1);
    }

    public void onDrawFrame(GL10 gl){
    gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
    gl.glColor4f(0.0f, 1.0f, 0.f, 0.0f);
    gl.glVertexPointer(3,GL10.GL_FLOAT, 0, triangle);
    gl.glDrawArrays(GL10.GL_TRIANGLES, 0, 3);
    }

    private void initShapes() {
        float vertices [] = {
                -0.6f, -0.5f, 0,
                0.6f, -0.5f, 0,
                (float) 0.0, 0.5f, 0,
        };
        ByteBuffer vbb = ByteBuffer.allocateDirect(vertices.length*4);
        vbb.order(ByteOrder.nativeOrder());
        triangle = vbb.asFloatBuffer();
        triangle.put(vertices);
        triangle.position(0);
    }
}
