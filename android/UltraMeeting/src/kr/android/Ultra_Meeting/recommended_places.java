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

public class recommended_places extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
        @Override
	    public void onCreate(Bundle savedInstanceState) {
	            super.onCreate(savedInstanceState);
		            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
			            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
				            setContentView(R.layout.recommended_places);
					            
						            ImageButton btn1 = (ImageButton)findViewById(R.id.m1);
							            btn1.setOnClickListener(this);
								    		ImageButton btn2 = (ImageButton)findViewById(R.id.m2);
												btn2.setOnClickListener(this);
														ImageButton btn3 = (ImageButton)findViewById(R.id.b1);
																btn3.setOnClickListener(this);
																		ImageButton btn4 = (ImageButton)findViewById(R.id.b2);
																				btn4.setOnClickListener(this);
																						ImageButton btn5 = (ImageButton)findViewById(R.id.b3);
																								btn5.setOnClickListener(this);
																										ImageButton btn6 = (ImageButton)findViewById(R.id.b4);
																												btn6.setOnClickListener(this);
																														ImageButton btn7 = (ImageButton)findViewById(R.id.b5);
																																btn7.setOnClickListener(this);
																																		ImageButton btn8 = (ImageButton)findViewById(R.id.b6);
																																				btn8.setOnClickListener(this);
																																						
																																								
																																								    }
																																								            
																																									    		public void onClick(View v) {	
																																														switch(v.getId()){
																																															        			
																																																				        			case R.id.m1:
																																																									        				Intent i1 = new Intent(recommended_places.this, Meeting_Planner.class);
																																																															        				startActivity(i1);
																																																																					        				break;
																																																																											        				
																																																																																	        			case R.id.m2:
																																																																																						        				Intent i2 = new Intent(recommended_places.this, recommended_places.class);
																																																																																												        				startActivity(i2);
																																																																																																		        				break;
																																																																																																								        				
																																																																																																														        			case R.id.b1:
																																																																																																																			        				Intent i3 = new Intent(recommended_places.this, seoul.class);
																																																																																																																									        				startActivity(i3);
																																																																																																																															        				break;
																																																																																																																																					        				
																																																																																																																																											        			case R.id.b2:
																																																																																																																																																        				Intent i4 = new Intent(recommended_places.this, ready.class);
																																																																																																																																																						        				startActivity(i4);
																																																																																																																																																												        				break;
																																																																																																																																																																		        				
																																																																																																																																																																								        			case R.id.b3:
																																																																																																																																																																													        				Intent i5 = new Intent(recommended_places.this, ready.class);
																																																																																																																																																																																			        				startActivity(i5);
																																																																																																																																																																																									        				break;
																																																																																																																																																																																															        				
																																																																																																																																																																																																					        			case R.id.b4:
																																																																																																																																																																																																										        				Intent i6 = new Intent(recommended_places.this, ready.class);
																																																																																																																																																																																																																        				startActivity(i6);
																																																																																																																																																																																																																						        				break;
																																																																																																																																																																																																																												        			        				
																																																																																																																																																																																																																																						        			case R.id.b5: 
																																																																																																																																																																																																																																											        				Intent i7 = new Intent(recommended_places.this, ready.class);
																																																																																																																																																																																																																																																	        				startActivity(i7);
																																																																																																																																																																																																																																																							        				break;
																																																																																																																																																																																																																																																													        				
																																																																																																																																																																																																																																																																			        			case R.id.b6: 
																																																																																																																																																																																																																																																																								        				Intent i8 = new Intent(recommended_places.this, ready.class);
																																																																																																																																																																																																																																																																														        				startActivity(i8);
																																																																																																																																																																																																																																																																																				        				break;
																																																																																																																																																																																																																																																																																										        			
																																																																																																																																																																																																																																																																																															        			
																																																																																																																																																																																																																																																																																																				        			
																																																																																																																																																																																																																																																																																																									        				
																																																																																																																																																																																																																																																																																																																	}
																																																																																																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																																																																																																			    }
