package com.Project.stickmansurvival;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;

public class Stickman {
    private static final float RADIUS = 1.25f;
    private Bitmap bitmap;

    private float x, y, angle;
    private RectF dstRect = new RectF();
    public Stickman(Bitmap bitmap) {
        x = 5.0f;
        y = 12.0f;
        dstRect.set(x-RADIUS, y, x+RADIUS, y+2*RADIUS);

        this.bitmap = bitmap;
    }
    public void update() {
    }

    public void draw(Canvas canvas) {
        canvas.save();
        canvas.rotate(angle,x,y);
        canvas.drawBitmap(bitmap, null, dstRect, null);
        canvas.restore();
    }

    public void setPosition(float x, float y) {
        float dx = x - this.x;
        float dy = y - this.y;
        double radian = Math.atan2(dy, dx);
        angle = (float) Math.toDegrees(radian); // intentional bug here
        dstRect.set(x-RADIUS, y-RADIUS, x+RADIUS, y+RADIUS);
        this.x = x;
        this.y = y;
    }
}
