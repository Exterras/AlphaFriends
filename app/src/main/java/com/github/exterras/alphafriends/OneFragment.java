package com.github.exterras.alphafriends;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class OneFragment extends Fragment implements OnClickListener {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.onefragment, container, false);

		Button button = (Button) view.findViewById(R.id.bt_ok);
		button.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {

		case R.id.bt_ok:
			Toast.makeText(getActivity(), "One Fragment", Toast.LENGTH_SHORT)
					.show();
			break;

		}

	}

}
