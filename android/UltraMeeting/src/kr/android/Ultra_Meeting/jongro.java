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

public class jongro extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
        @Override
	    public void onCreate(Bundle savedInstanceState) {
	            super.onCreate(savedInstanceState);
		            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
			            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
				            setContentView(R.layout.jongro);
					            
						            ImageButton btn1 = (ImageButton)findViewById(R.id.m1);
							            btn1.setOnClickListener(this);
								    		ImageButton btn2 = (ImageButton)findViewById(R.id.m2);
												btn2.setOnClickListener(this);
														ImageButton btn3 = (ImageButton)findViewById(R.id.b1);
																btn3.setOnClickListener(this);

																		
																		    }
																		            
																			    		public void onClick(View v) {	
																								switch(v.getId()){
																									        			
																														        			case R.id.m1:
																																			        				Intent i1 = new Intent(jongro.this, Meeting_Planner.class);
																																									        				startActivity(i1);
																																															        				break;
																																																					        				
																																																											        			case R.id.m2:
																																																																        				Intent i2 = new Intent(jongro.this, jongro.class);
																																																																						        				startActivity(i2);
																																																																												        				break;
																																																																																		        				
																																																																																								        			case R.id.b1:
																																																																																													        				Intent i3 = new Intent(jongro.this, rs6.class);
																																																																																																			        				startActivity(i3);
																																																																																																									        				break;
																																																																																																															        				
																																																																																																																					        			
																																																																																																																										        			
																																																																																																																															        				
																																																																																																																																							}
																																																																																																																																									}
																																																																																																																																									    }