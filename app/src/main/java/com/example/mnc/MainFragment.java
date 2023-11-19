package com.example.mnc;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView rvPlayer;
    private ArrayList<String> playerList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        loadData();
        initAdapter();
    }

    private void initAdapter() {
        PlayerAdapter adapter = new PlayerAdapter(playerList);
        if (rvPlayer != null) {
            rvPlayer.setAdapter(adapter);
        }
    }

    private void loadData() {
        playerList.add("Ronaldo");
        playerList.add("Messi");
        playerList.add("Pele");
        playerList.add("Maradona");
        playerList.add("Van Basten");
        playerList.add("Gullit");
        playerList.add("Zidan");
        playerList.add("Ronaldinho");
        playerList.add("Rivaldo");
        playerList.add("Carlos");
        playerList.add("Neymar");
        playerList.add("Bale");
        playerList.add("Willian");
    }

    private void initView(View view) {
        rvPlayer = view.findViewById(R.id.rv_players);
    }
}
