package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    private Paint mPaint;
    private Path mPath;

    public Practice9DrawPathView(Context context) {
        super(context);
        initPaint();
    }


    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
        mPaint = new Paint();
        mPath = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        mPaint.setStyle(Paint.Style.STROKE);
        // 从原始位置开始划线
//        mPath.lineTo(100, 100);
//        持续连接上一个动作
//        mPath.rLineTo(100, 0);
//        移动距离到***
//        mPath.moveTo(300,100);
////         这个有点绝对路径的意思
//        mPath.lineTo(400,400);
////         这个有点相对路径的意思
//        mPath.rLineTo(400,400);

//        画曲线
//        mPaint.setStyle(Paint.Style.STROKE);
//        mPath.lineTo(100, 100);
////        mPath.rLineTo(0,100);
//        mPath.addArc(100, 100, 300, 300, -180, 180);


        mPaint.setStyle(Paint.Style.STROKE);
        mPath.moveTo(100, 100);
        mPath.lineTo(200, 100);
        mPath.lineTo(150, 150);
        mPath.close();

        canvas.drawPath(mPath, mPaint);



//        mPath.addArc(200, 200, 400, 400, -225, 225);
//        mPath.arcTo(400, 200, 600, 400, -180, 225, false);
//        mPath.lineTo(400, 542);
//
//        canvas.drawPath(mPath, mPaint);

//        练习内容：使用 canvas.drawPath() 方法画心形
    }
}
