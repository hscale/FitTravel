package com.marissakwilson.android.fittravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NewTripButtonFragment extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState){
		//Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_new_trip_button, container, false);
	}

}
