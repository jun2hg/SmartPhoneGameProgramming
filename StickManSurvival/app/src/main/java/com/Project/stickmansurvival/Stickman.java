package com.Project.stickmansurvival;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;

public class Stickman {
    private Bitmap bitmap;
    private RectF dstRect = new RectF();
    public Stickman(Bitmap bitmap) {
        float cx = 5.0f, y = 12.0f;
        float r = 1.25f;
        dstRect.set(cx-r, y, cx+r, y+2*r);

        this.bitmap = bitmap;
    }
    public void update() {
    }

    public void draw(Canvas canvas) {
        canvas.drawBitmap(bitmap, null, dstRect, null);
    }

    public void setPosition(float x, float y) {
        float r = 1.25f;
        dstRect.set(x-r, y-r, x+r, y+r);
    }
}
