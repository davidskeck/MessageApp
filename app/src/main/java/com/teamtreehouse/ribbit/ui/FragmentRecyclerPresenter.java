package com.teamtreehouse.ribbit.ui;

import android.support.v7.widget.RecyclerView;

/**
 * Created by javie on 3/25/2017.
 */

abstract class FragmentRecyclerPresenter<T extends FragmentRecyclerView> {

    protected T view;

    FragmentRecyclerPresenter(T view) {

        this.view = view;
    }

    void setRecyclerAdapter(RecyclerView.Adapter adapter) {

        this.view.setRecyclerAdapter(adapter);
    }

    void setRecyclerLayout(RecyclerView.LayoutManager layoutManager) {

        this.view.setRecyclerLayout(layoutManager);
    }

    void setRecyclerFixedSize(boolean fixedSize) {

        this.view.setRecyclerFixedSize(fixedSize);
    }
}
