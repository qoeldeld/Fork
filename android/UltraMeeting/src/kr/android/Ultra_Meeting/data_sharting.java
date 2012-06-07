package kr.android.Ultra_Meeting;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;

public class data_sharing extends Activity {
    private WebView myWebView;
        
	    final private String DEFAULT_URL = "https://groups.google.com/d/forum/ultrameeting";
	        private static final FrameLayout.LayoutParams ZOOM_PARAMS = new FrameLayout.LayoutParams(
		            ViewGroup.LayoutParams.FILL_PARENT,
			                ViewGroup.LayoutParams.WRAP_CONTENT,
					            Gravity.BOTTOM
						            );


							        
								    @Override
								        public void onCreate(Bundle savedInstanceState) {
									        super.onCreate(savedInstanceState);
										        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
											        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
												        setContentView(R.layout.data_sharing);
													        myWebView = (WebView)this.findViewById(R.id.webView);
														        myWebView.getSettings().setJavaScriptEnabled(true);
															        FrameLayout mContentView = (FrameLayout)getWindow().getDecorView().findViewById(android.R.id.content);
																        final View zoom = this.myWebView.getZoomControls();
																	        mContentView.addView(zoom, ZOOM_PARAMS);
																		        zoom.setVisibility(View.GONE);
																			        
																				  
																				          myWebView.setWebViewClient(new Callback());
																					          
																						          this.myWebView.loadUrl(DEFAULT_URL);
																							      }
																							          

																								      private class Callback extends WebViewClient {
																								              @Override
																									              public boolean shouldOverrideUrlLoading(WebView view, String url) {
																										                  view.loadUrl(url);
																												              return(true);
																													              }
																														          }
																															  } 
