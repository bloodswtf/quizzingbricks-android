package com.quizzingbricks.activities.menu;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.quizzingbricks.R;

 class Adapter 
	 extends ArrayAdapter<String> {
		private final Context context;
		public ArrayList<String> values;
//		private final String[] values;
	 
		public Adapter(Context context, ArrayList<String> values) {
			
			super(context, R.layout.list_layout_no_image, values);		
			this.values = values;
			this.context = context;
//			this.values = values;
		}
		
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	 
			View rowView = inflater.inflate(R.layout.list_layout_no_image, parent, false);
			TextView textView = (TextView) rowView.findViewById(R.id.label);
//			ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
			textView.setText(values.get(position));
	 
			// Change icon based on name
//			String s = values[position];
	// 
//			System.out.println(s);
	// 
//			if (s.equals(values[0])) {
//				imageView.setImageResource(R.drawable.boardcellblue);
//			} else if (s.equals(values[1])) {
//				imageView.setImageResource(R.drawable.boardcellgreen);
//			} else if (s.equals(values[2])) {
//				imageView.setImageResource(R.drawable.boardcellred);
//			} else if (s.equals(values[3])){
//				imageView.setImageResource(R.drawable.boardcellyellow);
//			}
	 
			return rowView;
		}
	
}
