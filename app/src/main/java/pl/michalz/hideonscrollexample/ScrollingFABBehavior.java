package pl.michalz.hideonscrollexample;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public class ScrollingFABBehavior extends CoordinatorLayout.Behavior<RelativeLayout> {
    private int toolbarHeight;

    public ScrollingFABBehavior(Context context, AttributeSet attrs) {
        super();
        this.toolbarHeight = Utils.getToolbarHeight(context);
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, RelativeLayout fab, View dependency) {
        return super.layoutDependsOn(parent, fab, dependency) || (dependency instanceof AppBarLayout);
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, RelativeLayout fab, View dependency) {
        boolean returnValue = super.onDependentViewChanged(parent, fab, dependency);
        if (dependency instanceof AppBarLayout) {
                CoordinatorLayout.LayoutParams lp = (CoordinatorLayout.LayoutParams) fab.getLayoutParams();
                int fabBottomMargin = lp.bottomMargin;
                int distanceToScroll = fab.getHeight() + fabBottomMargin;
                float ratio = (float)dependency.getY()/(float)toolbarHeight;
                fab.setTranslationY(-distanceToScroll * ratio);
        }
        return returnValue;
    }
}