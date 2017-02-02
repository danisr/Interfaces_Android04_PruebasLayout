package sanchez.daniel.dint04_pruebaslayouts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by daniel.rodriguez on 14/12/2016.
 */

public class MiTextoChulo extends TextView {

    public MiTextoChulo(Context context) {
        super(context);
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/font.ttf"));
    }

    public MiTextoChulo(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/font.ttf"));
    }

    public MiTextoChulo(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/font.ttf"));
    }
}
