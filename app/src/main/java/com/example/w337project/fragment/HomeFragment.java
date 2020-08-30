package com.example.w337project.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.w337project.R;
import com.example.w337project.adapter.MascotaAdapter;
import com.example.w337project.pojo.Mascota;

import java.util.ArrayList;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    private ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        this.listaMascotas = (RecyclerView) view.findViewById(R.id.rv_main_mascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        this.listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdapter();
        return view;
    }

    private void inicializarAdapter() {
        MascotaAdapter adapter = new MascotaAdapter(this.mascotas, getActivity());
        listaMascotas.setAdapter(adapter);
    }

    private void inicializarListaMascotas() {
        this.mascotas = new ArrayList<Mascota>();

        Random rand = new Random();

        this.mascotas.add(new Mascota("Cathy", rand.nextInt(11), R.drawable.pet1));
        this.mascotas.add(new Mascota("Ronny", rand.nextInt(11), R.drawable.pet2));
        this.mascotas.add(new Mascota("Firulais", rand.nextInt(11), R.drawable.pet3));
        this.mascotas.add(new Mascota("Fido", rand.nextInt(11), R.drawable.pet4));
        this.mascotas.add(new Mascota("Pluto", rand.nextInt(11), R.drawable.pet5));
        this.mascotas.add(new Mascota("Ayudante de Santa", rand.nextInt(11), R.drawable.pet6));
        this.mascotas.add(new Mascota("Snoopy", rand.nextInt(11), R.drawable.pet7));
        this.mascotas.add(new Mascota("Odie", rand.nextInt(11), R.drawable.pet8));
        this.mascotas.add(new Mascota("Garfield", rand.nextInt(11), R.drawable.pet9));
        this.mascotas.add(new Mascota("Simba", rand.nextInt(11), R.drawable.pet10));
    }
}