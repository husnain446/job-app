package com.byteshaft.jobapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.byteshaft.jobapp.R;

/**
 * Created by shahid on 28/05/2017.
 */

public class Me extends Fragment implements View.OnClickListener{

    private View mBaseView;
    private Toolbar toolbarTop;
    private ImageButton settingsButton;
    private TextView title;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBaseView = inflater.inflate(R.layout.fragment_me, container, false);
        setHasOptionsMenu(true);
        toolbarTop = (Toolbar) mBaseView.findViewById(R.id.profile_toolbar);
        title = (TextView) toolbarTop.findViewById(R.id.toolbar_title);
        settingsButton = (ImageButton) toolbarTop.findViewById(R.id.button_settings);
        title.setText(toolbarTop.getTitle());
        settingsButton.setOnClickListener(this);
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbarTop);
        return mBaseView;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profile_settings:
                System.out.println("daba k chal diay");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {

    }
}
