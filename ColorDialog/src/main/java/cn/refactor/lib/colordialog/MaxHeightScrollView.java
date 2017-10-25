package cn.refactor.lib.colordialog;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class MaxHeightScrollView extends ScrollView {

    public MaxHeightScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        heightMeasureSpec = MeasureSpec.makeMeasureSpec(600, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
