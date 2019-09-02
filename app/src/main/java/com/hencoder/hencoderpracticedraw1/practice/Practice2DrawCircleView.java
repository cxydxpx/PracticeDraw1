package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private Paint mPaint, mPaint2, mPaint3, mPaint4;

    public Practice2DrawCircleView(Context context) {
        super(context);
        initPaint();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);

        mPaint2 = new Paint();
        mPaint2.setStyle(Paint.Style.STROKE);
        mPaint2.setAntiAlias(true);

        mPaint3 = new Paint();
        mPaint3.setColor(Color.BLUE);
        mPaint3.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint3.setStrokeWidth(20);

        mPaint4 = new Paint();
        mPaint4.setStyle(Paint.Style.STROKE);
        mPaint4.setStrokeWidth(20);
        mPaint4.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        //实心
        canvas.drawCircle(350, 160, 160, mPaint);
        // 空心
        canvas.drawCircle(820, 160, 160, mPaint2);
        //蓝色
        canvas.drawCircle(350, 500, 160, mPaint3);
        //20
        canvas.drawCircle(820, 500, 160, mPaint4);
    }
}
