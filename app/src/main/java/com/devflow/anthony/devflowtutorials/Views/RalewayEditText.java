package com.devflow.anthony.devflowtutorials.Views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

import com.devflow.anthony.devflowtutorials.R;

/**
 * Created by anthony on 7/28/14.
 */
public class RalewayEditText extends EditText {
    public RalewayEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);

    }

    public RalewayEditText(Context context) {
        super(context);
        init(null);
    }

    private void init(AttributeSet attrs) {
        if (attrs!=null) {
            TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.RalewayEditText);

            Typeface myTypeface = Typeface.createFromAsset(getContext().getAssets(),"fonts/raleway_light.ttf");
            setTypeface(myTypeface);

            a.recycle();
        }
    }
}
