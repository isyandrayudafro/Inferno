// Generated code from Butter Knife. Do not modify!
package com.isyandra.dev.kino3;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class ReviewActivity$$ViewInjector<T extends com.isyandra.dev.kino3.ReviewActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558563, "field 'mRefreshLayout'");
    target.mRefreshLayout = finder.castView(view, 2131558563, "field 'mRefreshLayout'");
    view = finder.findRequiredView(source, 2131558564, "field 'mListViewReview'");
    target.mListViewReview = finder.castView(view, 2131558564, "field 'mListViewReview'");
    view = finder.findRequiredView(source, 2131558565, "field 'mTextViewMessage'");
    target.mTextViewMessage = finder.castView(view, 2131558565, "field 'mTextViewMessage'");
  }

  @Override public void reset(T target) {
    target.mRefreshLayout = null;
    target.mListViewReview = null;
    target.mTextViewMessage = null;
  }
}
