package com.github.exterras.alphafriends;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ThreeFragment  extends Fragment implements OnClickListener{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View v = inflater.inflate(R.layout.threefragment, container, false);
		
		Button button = (Button)v.findViewById(R.id.bt_ok);
		button.setOnClickListener(this);
		
		
		return v;
	}

	@Override
	public void onClick(View v) {
		
		switch(v.getId()){
		
		case R.id.bt_ok:
			Toast.makeText(getActivity(), "ThreeFragment", Toast.LENGTH_SHORT).show();
			break;
		
		}
		
	}
	

}
