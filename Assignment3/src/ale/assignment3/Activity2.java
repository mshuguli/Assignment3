package ale.assignment3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_2);
	}
	
	public void toActivity3(View view){
		Intent intent = new Intent(this, Activity3.class);
		startActivity(intent);
	}

}
