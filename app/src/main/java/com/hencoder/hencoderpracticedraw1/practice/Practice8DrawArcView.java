package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint mPaint = new Paint();

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        /**
         * 起始原点坐标
         * 开始的角度
         * 旋转的角度
         * 是否连接中心
         */
        canvas.drawArc(100, 100, 300, 300, 30, 120, false, mPaint);
        canvas.drawArc(100, 100, 300, 300, 250, 85, true, mPaint);

        mPaint.setStyle(Paint.Style.STROKE); // 画线模式
        canvas.drawArc(100, 100, 300, 300, 180, 45, false, mPaint);


    }
}
