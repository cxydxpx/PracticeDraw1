package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    private Paint mPaint = new Paint();

    private float[] mLoca = {
            200,100,200,500,
            200,500,900,500
    };
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        mPaint.setColor(Color.parseColor("#ffffff"));
        canvas.drawLines(mLoca,mPaint);

        mPaint.setTextSize(30);
        canvas.drawText("froyo",250,520,mPaint);

        mPaint.setColor(Color.BLUE);
        canvas.drawRect(250,400,300,500,mPaint);

        mPaint.setColor(Color.WHITE);
        canvas.drawText("GB",400,520,mPaint);
//        canvas.drawRect();
        mPaint.setColor(Color.BLUE);
        canvas.drawRect(400,100,450,500,mPaint);

    }
}
