package com.example.keepingup;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link releaseDate#newInstance} factory method to
 * create an instance of this fragment.
 */
public class releaseDate extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    TextView description;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public releaseDate() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment releaseDate.
     */
    // TODO: Rename and change types and number of parameters
    public static releaseDate newInstance(String param1, String param2) {
        releaseDate fragment = new releaseDate();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view =  inflater.inflate(R.layout.fragment_release_date, container, false);
        final ListView listView = view.findViewById(R.id.releaseDateL);

        ArrayList<releaseDateItem> releaseDateItemArrayList = new ArrayList<>();
        releaseDateItemArrayList.add(new releaseDateItem("Cyberpunk 2077 [PC, PS4, XBO, Stadia] - December 10th, 2020."));
        releaseDateItemArrayList.add(new releaseDateItem("Hitman 3 [PC, PS5, XSX, PS4, XBO, Stadia] - January 20, 2021"));
        releaseDateItemArrayList.add(new releaseDateItem("Everspace 2 [PC] - January TBC, 2021 "));
        releaseDateItemArrayList.add(new releaseDateItem("The Pedestrian [PS4] - January TBC, 2021"));
        releaseDateItemArrayList.add(new releaseDateItem("Outriders [PC, PS5, XSX, PS4, XBO] - February 2, 2021"));
        releaseDateItemArrayList.add(new releaseDateItem("The Nioh Collection [PS5] - February 5, 2021"));
        releaseDateItemArrayList.add(new releaseDateItem("Ampersat [PC] - February 6, 2021"));
        releaseDateItemArrayList.add(new releaseDateItem("Little Nightmares 2 [PC, PS4, XBO, Switch] - February 11, 2021"));
        releaseDateItemArrayList.add(new releaseDateItem("Destruction AllStars [PS5] - February TBC, 2021"));
        releaseDateItemArrayList.add(new releaseDateItem("Hiros Escape [PC] - February TBC, 2021 "));
        releaseDateItemArrayList.add(new releaseDateItem("Rogue Invader [PC] - February TBC, 2021 "));
        releaseDateItemArrayList.add(new releaseDateItem("Harvest Moon: One World [Switch] - March 2, 2021"));
        releaseDateItemArrayList.add(new releaseDateItem("Yakuza: Like a Dragon [PS5] - March 2, 2021 "));
        releaseDateItemArrayList.add(new releaseDateItem("Balan Wonderworld [PC, Switch] - March 26, 2021"));
        releaseDateItemArrayList.add(new releaseDateItem("Monster Hunter Rise [Switch] - March 26, 2021"));
        releaseDateItemArrayList.add(new releaseDateItem("Fearmonium [PC] - March TBC, 2021"));

        ArrayAdapter arrayAdapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1,releaseDateItemArrayList);

        listView.setAdapter(arrayAdapter);
        return view;
    }
}