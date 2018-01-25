package tech.gllc.epicbattery;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by notif on 1/19/2018.
 */

public class FragmentLoad extends Fragment {

    View view;
    TextView batteryRange;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_load, container, false);
        batteryRange = view.findViewById(R.id.batteryRange);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        batteryRange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentBatteryStatus nextFrag= new FragmentBatteryStatus();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout, nextFrag,"FragmentBatteryStatus")
                        .addToBackStack(null)
                        .commit();

                //loadFragment(new FragmentBatteryStatus());
            }
        });
    }
}