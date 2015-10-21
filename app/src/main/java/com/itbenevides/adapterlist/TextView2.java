package com.itbenevides.adapterlist;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

public class TextView2 extends TextView {


    public TextView2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public TextView2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public TextView2(Context context, boolean header) {
        super(context);
        int width=0;
        int height=0;
        this.setText("N/A");
        this.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimensionPixelSize(R.dimen.tamanho_tx_comBorda));
        this.setPadding(6, 6, 6, 6);
        if (header) {

                this.setBackgroundDrawable(getResources().getDrawable(R.drawable.header));
                this.setTextColor(getContext().getResources().getColor(R.color.cor_enunciado_header));



            this.setTypeface(null, Typeface.BOLD);

            Resources resources = getResources();
            float dipValue;
            if (width != 0) {
                dipValue = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, width, resources.getDisplayMetrics());
                this.setWidth((int) dipValue);
            }


        } else {

                this.setBackgroundDrawable(getResources().getDrawable(R.drawable.body));
                this.setTextColor(getContext().getResources().getColor(R.color.cor_enunciado_padrao));


            Resources resources = getResources();
            float dipValue;
            if (width != 0) {
                dipValue = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, width, resources.getDisplayMetrics());
                this.setWidth((int) dipValue);
            }
            if (height != 0) {
                dipValue = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, height, resources.getDisplayMetrics());
                this.setHeight((int) dipValue);
            }
            //this.setPadding(2,0,0,0);
            int sdk = Build.VERSION.SDK_INT;
            if(sdk < Build.VERSION_CODES.JELLY_BEAN) {

            } else {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                    this.setTextAlignment(this.TEXT_ALIGNMENT_CENTER);
                }
            }


        }
    }


}
