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

public class rs4 extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
        @Override
	    public void onCreate(Bundle savedInstanceState) {
	            super.onCreate(savedInstanceState);
		            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
			            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
				            setContentView(R.layout.rs4);
					            
						            ImageButton btn1 = (ImageButton)findViewById(R.id.m1);
							            btn1.setOnClickListener(this);
								    		ImageButton btn2 = (ImageButton)findViewById(R.id.m2);
												btn2.setOnClickListener(this);
														ImageButton btn3 = (ImageButton)findViewById(R.id.b1);
																btn3.setOnClickListener(this);
																		ImageButton btn4 = (ImageButton)findViewById(R.id.b2);
																				btn4.setOnClickListener(this);


																						
																						    }
																						            
																							    		public void onClick(View v) {	
																												switch(v.getId()){
																													        			
																																		        			case R.id.m1:
																																							        				Intent i1 = new Intent(rs4.this, Meeting_Planner.class);
																																													        				startActivity(i1);
																																																			        				break;
																																																									        				
																																																															        			case R.id.m2:
																																																																				        				Intent i2 = new Intent(rs4.this, seocho.class);
																																																																										        				startActivity(i2);
																																																																																        				break;
																																																																																						        				
																																																																																												        			case R.id.b1:
																																																																																																	        				Intent i3 = new Intent(rs4.this, rs4_1.class);
																																																																																																							        				startActivity(i3);
																																																																																																													        				break;
																																																																																																																			        				
																																																																																																																									        			case R.id.b2:
																																																																																																																														        				Intent i4 = new Intent(rs4.this, rs4_w.class);
																																																																																																																																				        				startActivity(i4);
																																																																																																																																										        				break;
																																																																																																																																																        				
																																																																																																																																																						        				
																																																																																																																																																												        			
																																																																																																																																																																	        			
																																																																																																																																																																						        				
																																																																																																																																																																														}
																																																																																																																																																																																}
																																																																																																																																																																																    }
