

import kr.android.Ultra_Meeting.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class m extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
        @Override
	    public void onCreate(Bundle savedInstanceState) {
	            super.onCreate(savedInstanceState);
		            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
			            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
				         
					             
						             ImageButton btn1 = (ImageButton)findViewById(R.id.bt1);
							             btn1.setOnClickListener(this);
								     		ImageButton btn2 = (ImageButton)findViewById(R.id.bt2);
												btn2.setOnClickListener(this);
														ImageButton btn3 = (ImageButton)findViewById(R.id.bt3);
																btn3.setOnClickListener(this);
																		
																				btn4.setOnClickListener(this);
																						ImageButton btn5 = (ImageButton)findViewById(R.id.bt5);
																								btn5.setOnClickListener(this);
																								        ImageButton btn7 = (ImageButton)findViewById(R.id.bt7);
																									        
																										        ImageButton btn11 = (ImageButton)findViewById(R.id.bt11);
																											        btn11.setOnClickListener(this);
																												    }
																												           
																													    		public void onClick(View v) {	
																																		switch(v.getId()){
																																			        		
																																								        			case R.id.bt1:
																																													        				
																																																			        				
																																																									        				break;
																																																															        		
																																																																					        			case R.id.bt2:
																																																																										        				
																																																																																        				
																																																																																						        				
																																																																																												        			
																																																																																																		        			case R.id.bt3:
																																																																																																							        				
																																																																																																													        				startActivity(i3);
																																																																																																																			        				
																																																																																																																									        			
																																																																																																																															        			
																																																																																																																																				        				
																																																																																																																																										        				
																																																																																																																																																        				
																																																																																																																																																						        		
																																																																																																																																																											        			
																																																																																																																																																																        				
																																																																																																																																																																						        				
																																																																																																																																																																												        				
																																																																																																																																																																																		        			
																																																																																																																																																																																								        			
																																																																																																																																																																																													        				
																																																																																																																																																																																																			        				
																																																																																																																																																																																																									        				

																																																																																																																																																																																																															        			
																																																																																																																																																																																																																				        				
																																																																																																																																																																																																																										        				
																																																																																																																																																																																																																																        				
																																																																																																																																																																																																																																						        		
																																																																																																																																																																																																																																											        			
																																																																																																																																																																																																																																																			
																																																																																																																																																																																																																																																					
																																																																																																																																																																																																																																																					    


import kr.android.Ultra_Meeting.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class m extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
        @Override
	    public void onCreate(Bundle savedInstanceState) {
	            super.onCreate(savedInstanceState);
		            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
			            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
				            
					             
						             ImageButton btn1 = (ImageButton)findViewById(R.id.bt1);
							             btn1.setOnClickListener(this);
								     		ImageButton btn2 = (ImageButton)findViewById(R.id.bt2);
												btn2.setOnClickListener(this);
														ImageButton btn3 = (ImageButton)findViewById(R.id.bt3);
																btn3.setOnClickListener(this);
																		
																				btn4.setOnClickListener(this);
																						ImageButton btn5 = (ImageButton)findViewById(R.id.bt5);
																								btn5.setOnClickListener(this);
																								        ImageButton btn7 = (ImageButton)findViewById(R.id.bt7);
																									        
																										        ImageButton btn11 = (ImageButton)findViewById(R.id.bt11);
																											        btn11.setOnClickListener(this);
																												    }
																												           
																													    		public void onClick(View v) {	
																																		switch(v.getId()){
																																			        		
																																								        			case R.id.bt1:
																																													        				
																																																			        				
																																																									        				break;
																																																															        			
																																																																					        			
																																																																										        				
																																																																																        				
																																																																																						        				
																																																																																												        			
																																																																																																		        			case R.id.bt3:
																																																																																																							        				
																																																																																																													        				startActivity(i3);
																																																																																																																			        				
																																																																																																																									        			
																																																																																																																															        			
																																																																																																																																				        				
																																																																																																																																										        				
																																																																																																																																																        				break;
																																																																																																																																																						        			
																																																																																																																																																											        			case R.id.bt5:
																																																																																																																																																																        				Intent i5 = new Intent(m.this, m5.class);
																																																																																																																																																																						        				startActivity(i5);
																																																																																																																																																																												        				break; 
																																																																																																																																																																																		        				
																																																																																																																																																																																								        			case R.id.bt7:
																																																																																																																																																																																													        				Intent i7 = new Intent(m.this, m7.class);
																																																																																																																																																																																																			        				startActivity(i7);
																																																																																																																																																																																																									        				break;

																																																																																																																																																																																																															        			case R.id.bt11:
																																																																																																																																																																																																																				        				Intent i11 = new Intent(m.this, m11.class);
																																																																																																																																																																																																																										        				startActivity(i11);
																																																																																																																																																																																																																																        				break;	
																																																																																																																																																																																																																																						        			
																																																																																																																																																																																																																																											        				
																																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																																					    }
package kr.android.Ultra_Meeting;

import kr.android.Ultra_Meeting.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

public class m extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
        @Override
	    public void onCreate(Bundle savedInstanceState) {
	            super.onCreate(savedInstanceState);
		            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
			            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
				            setContentView(R.layout.m);
					             
						             ImageButton btn1 = (ImageButton)findViewById(R.id.bt1);
							             btn1.setOnClickListener(this);
								     		ImageButton btn2 = (ImageButton)findViewById(R.id.bt2);
												btn2.setOnClickListener(this);
														ImageButton btn3 = (ImageButton)findViewById(R.id.bt3);
																btn3.setOnClickListener(this);
																		ImageButton btn4 = (ImageButton)findViewById(R.id.bt4);
																				btn4.setOnClickListener(this);
																						ImageButton btn5 = (ImageButton)findViewById(R.id.bt5);
																								btn5.setOnClickListener(this);
																								        ImageButton btn7 = (ImageButton)findViewById(R.id.bt7);
																									        btn7.setOnClickListener(this);
																										        ImageButton btn11 = (ImageButton)findViewById(R.id.bt11);
																											        btn11.setOnClickListener(this);
																												    }
																												            
																													    		public void onClick(View v) {	
																																		switch(v.getId()){
																																			        			
																																								        			case R.id.bt1:
																																													        				Intent i1 = new Intent(m.this, googleMaps.class);
																																																			        				startActivity(i1);
																																																									        				break;
																																																															        				
																																																																					        			case R.id.bt2:
																																																																										        				Intent i2 = new Intent(m.this, m2.class);
																																																																																        				startActivity(i2);
																																																																																						        				break;
																																																																																												        				
																																																																																																		        			case R.id.bt3:
																																																																																																							        				Intent i3 = new Intent(m.this, m3.class);
																																																																																																													        				startActivity(i3);
																																																																																																																			        				break;
																																																																																																																									        				
																																																																																																																															        			case R.id.bt4:
																																																																																																																																				        				Intent i4 = new Intent(m.this, m4.class);
																																																																																																																																										        				startActivity(i4);
																																																																																																																																																        				break;
																																																																																																																																																						        			
																																																																																																																																																											        			case R.id.bt5:
																																																																																																																																																																        				Intent i5 = new Intent(m.this, m5.class);
																																																																																																																																																																						        				startActivity(i5);
																																																																																																																																																																												        				break; 
																																																																																																																																																																																		        				
																																																																																																																																																																																								        			case R.id.bt7:
																																																																																																																																																																																													        				Intent i7 = new Intent(m.this, m7.class);
																																																																																																																																																																																																			        				startActivity(i7);
																																																																																																																																																																																																									        				break;

																																																																																																																																																																																																															        			case R.id.bt11:
																																																																																																																																																																																																																				        				Intent i11 = new Intent(m.this, m11.class);
																																																																																																																																																																																																																										        				startActivity(i11);
																																																																																																																																																																																																																																        				break;	
																																																																																																																																																																																																																																						        			
																																																																																																																																																																																																																																											        				
																																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																																					    }

