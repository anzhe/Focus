package com.hello2mao.focus.ui.news.fragment;


import com.hello2mao.focus.R;
import com.hello2mao.focus.base.BaseFragment;
import com.hello2mao.focus.presenter.ThemePresenter;
import com.hello2mao.focus.presenter.contract.ThemeContract;

public class ThemeFragment extends BaseFragment<ThemePresenter> implements ThemeContract.View {

    @Override
    protected void initInject() {
        getFragmentComponent().inject(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_theme;
    }

    @Override
    protected void initEventAndData() {

    }
}