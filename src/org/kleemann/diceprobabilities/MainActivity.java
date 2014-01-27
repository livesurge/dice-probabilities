package org.kleemann.diceprobabilities;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	private DiceSet diceSet1;
	private DiceSet diceSet2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.activity_main);
		
		this.diceSet1 = new DiceSet(
				getApplicationContext(),
				(Button)findViewById(R.id.pool1_d12),
				(Button)findViewById(R.id.pool1_d10),
				(Button)findViewById(R.id.pool1_d8),
				(Button)findViewById(R.id.pool1_d6),
				(Button)findViewById(R.id.pool1_d4),
				(Button)findViewById(R.id.pool1_constant),
				(Button)findViewById(R.id.pool1_target),
				(Button)findViewById(R.id.current1_d12),
				(Button)findViewById(R.id.current1_d10),
				(Button)findViewById(R.id.current1_d8),
				(Button)findViewById(R.id.current1_d6),
				(Button)findViewById(R.id.current1_d4),
				(Button)findViewById(R.id.current1_constant),
				(Button)findViewById(R.id.current1_target),
				(Button)findViewById(R.id.clear1),
				(Button)findViewById(R.id.current1_probability),
				((GraphView)findViewById(R.id.graph)).getSetter1()
				);

		this.diceSet2 = new DiceSet(
				getApplicationContext(),
				(Button)findViewById(R.id.pool2_d12),
				(Button)findViewById(R.id.pool2_d10),
				(Button)findViewById(R.id.pool2_d8),
				(Button)findViewById(R.id.pool2_d6),
				(Button)findViewById(R.id.pool2_d4),
				(Button)findViewById(R.id.pool2_constant),
				(Button)findViewById(R.id.pool2_target),
				(Button)findViewById(R.id.current2_d12),
				(Button)findViewById(R.id.current2_d10),
				(Button)findViewById(R.id.current2_d8),
				(Button)findViewById(R.id.current2_d6),
				(Button)findViewById(R.id.current2_d4),
				(Button)findViewById(R.id.current2_constant),
				(Button)findViewById(R.id.current2_target),
				(Button)findViewById(R.id.clear2),
				(Button)findViewById(R.id.current2_probability),
				((GraphView)findViewById(R.id.graph)).getSetter2()
				);
		
		((Button)findViewById(R.id.copy_down)).setOnClickListener(new Copy(diceSet2, diceSet1));
		((Button)findViewById(R.id.copy_up)).setOnClickListener(new Copy(diceSet1, diceSet2));
	}

	private static class Copy implements View.OnClickListener {
		
		private DiceSet destination;
		private DiceSet source;

		public Copy(DiceSet destination, DiceSet source) {
			this.destination = destination;
			this.source = source;
		}
		
		@Override
		public void onClick(View v) {
			destination.copyFrom(source);
		}		
	}
	

	
}
