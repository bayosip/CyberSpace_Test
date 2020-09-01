package com.osicorp.cyberspace_test.view.fragment;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.osicorp.cyberspace_test.view.interfaces.FragmentListener;

public class BaseFragment extends Fragment {

    protected FragmentListener listener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listener = (FragmentListener) context;
    }
}
