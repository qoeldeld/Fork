package kr.android.Ultra_Meeting;

import kr.android.Ultra_Meeting.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class about extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
        @Override
	    public void onCreate(Bundle savedInstanceState) {
	            super.onCreate(savedInstanceState);
		            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
			            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
				            setContentView(R.layout.about);
					            
						      ImageButton bu = (ImageButton)findViewById(R.id.Immake);
						        bu.setOnClickListener(this);
							  }

							   public void onClick(View v) { 
							     switch(v.getId()){
							                
									           case R.id.Immake:
										               Intent i1 = new Intent(about.this, menu.class);
											                   startActivity(i1);
													               break;
														                   }
																       }
																       }
