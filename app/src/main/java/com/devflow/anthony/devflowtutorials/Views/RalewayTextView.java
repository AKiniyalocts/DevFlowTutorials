package com.devflow.anthony.devflowtutorials.Views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.devflow.anthony.devflowtutorials.R;

/**
 * Created by anthony on 7/28/14.
 */
public class RalewayTextView extends TextView {
    public RalewayTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);

    }

    public RalewayTextView(Context context) {
        super(context);
        init(null);
    }

    private void init(AttributeSet attrs) {
        if (attrs!=null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.RalewayTextView);
            //String fontName = a.getString(R.styleable.CustomTextView_fontName);

            Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(),"fonts/raleway_light.ttf");
            setTypeface(myTypeface);

            a.recycle();
        }
    }
}
