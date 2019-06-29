package com.yisam.project1;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

//Simple fragment to display a textView of rules

public class RulesFragment extends DialogFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.dialog_rules, container, false);
        getDialog().setTitle(R.string.rules_title);
        return root;
    }
}
