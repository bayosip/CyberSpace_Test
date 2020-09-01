package com.osicorp.cyberspace_test.presenter;

public class BasePresenter<V> {

    protected V view;

    public BasePresenter(V view) {
        this.view = view;
    }
}
