package toong.vn.androidmapboxinviewpager.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import toong.vn.androidmapboxinviewpager.R;

public class Fragment1 extends Fragment {
    private String TAG = getClass().getSimpleName();
    private StringBuilder stringBuilder = new StringBuilder();
    private StringBuilder stringBuilder2 = new StringBuilder();
    private StringBuilder stringBuilder3 = new StringBuilder();
    List<String> stringList = new ArrayList<>();

    public static Fragment1 newInstance() {
        Bundle args = new Bundle();
        Fragment1 fragment = new Fragment1();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        Log.i(TAG, "onCreateView");
        View rootView = inflater.inflate(R.layout.fragment_1, container, false);
        return rootView;
    }
}