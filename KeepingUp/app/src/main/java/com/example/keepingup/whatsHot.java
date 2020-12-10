package com.example.keepingup;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link whatsHot#newInstance} factory method to
 * create an instance of this fragment.
 */
public class whatsHot extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public whatsHot() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment whatsHot.
     */
    // TODO: Rename and change types and number of parameters
    public static whatsHot newInstance(String param1, String param2) {
        whatsHot fragment = new whatsHot();
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
       View view = inflater.inflate(R.layout.fragment_whats_hot, container, false);

        Button voteButton = view.findViewById(R.id.voteButton);
        voteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String[] emailAdresses ={"keepingUp@gmail.com"};
                Intent intent = new Intent (Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, emailAdresses);
                intent.putExtra(Intent.EXTRA_SUBJECT,"Community Vote");
                intent.putExtra(Intent.EXTRA_TEXT, "The game i've been playing the most recently is: ");

                startActivity(intent);
            }

        });

        Button twitchButton = view.findViewById(R.id.twitchButton);
        twitchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String url = "https://www.twitch.tv/directory";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                }

        });

        Button steamButton = view.findViewById(R.id.steamButton);
        steamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String url = "https://steamcharts.com/";
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
            }

        });


        return view;
    }
}