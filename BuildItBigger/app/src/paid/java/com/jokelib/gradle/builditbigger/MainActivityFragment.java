package com.jokelib.gradle.builditbigger;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.udacity.gradle.builditbigger.R;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {


    private Button tellJoke;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        tellJoke=(Button)root.findViewById(R.id.tell_joke);
        tellJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tellJoke(view);
            }
        });

        return root;
    }

    private void tellJoke(View view){
        new JokeEndPoint(getActivity(),callBack).execute();

    }
}
