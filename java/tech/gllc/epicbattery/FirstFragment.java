package tech.gllc.epicbattery;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by notif on 1/19/2018.
 */

public class FirstFragment extends Fragment {

    View view;
    TextView batteryRange;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_first, container, false);
        batteryRange = view.findViewById(R.id.batteryRange);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        batteryRange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SecondFragment nextFrag= new SecondFragment();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout, nextFrag,"findThisFragment")
                        .addToBackStack(null)
                        .commit();

                //loadFragment(new SecondFragment());
            }
        });
    }
}