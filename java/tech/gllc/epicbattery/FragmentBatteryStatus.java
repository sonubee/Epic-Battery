package tech.gllc.epicbattery;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by notif on 1/19/2018.
 */

public class FragmentBatteryStatus extends Fragment {

    View view;
    ImageView faceStatus;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_battery_status, container, false);

        faceStatus = view.findViewById(R.id.face);

        faceStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentBatteryDetails nextFrag= new FragmentBatteryDetails();
                getActivity().getFragmentManager().beginTransaction()
                        .replace(R.id.frameLayout, nextFrag,"FragmentBatteryDetails")
                        .addToBackStack(null)
                        .commit();
            }
        });

        return view;
    }
}