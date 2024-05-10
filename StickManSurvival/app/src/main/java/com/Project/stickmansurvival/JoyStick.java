package com.Project.stickmansurvival;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;

public class JoyStick {
    private final Bitmap bgBitmap;
    private final Bitmap thumbBitmap;

    private final RectF bgRect = new RectF(0, 13, 7, 20);
    private final RectF thumbRect = new RectF(2.5f, 15.5f, 4.5f, 17.5f);
    public JoyStick() {
        bgBitmap = BitmapPool.get(R.mipmap.joystick);
        thumbBitmap = BitmapPool.get(R.mipmap.button1);
    }

    @Override
    public void update(float elapsedSeconds) {

    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(bgBitmap, null, bgRect, null);
        canvas.drawBitmap(thumbBitmap, null, thumbRect, null);
    }

    public boolean onTouch(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
        }
        return false;
    }
}
