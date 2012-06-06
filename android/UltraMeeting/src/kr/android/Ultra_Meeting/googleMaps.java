package kr.android.Ultra_Meeting;

import android.os.Bundle;
import com.google.android.maps.MapActivity;
import java.util.List;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class googleMaps extends MapActivity implements OnClickListener {

	MapView mapView;
		Drawable drawable;// ��Ŀ�� �׸� �׸��� �ҷ����� ���� Ŭ����
			List<Overlay> list; // ��Ŀ ���� ��Ŀ�� �ö� ���� �ְ� ������ list Ÿ������ ����
				// �ʿ� �÷��� Ÿ������ ����
					HelloOverlay helloOverlay;

						@Override
							protected void onCreate(Bundle savedInstanceState) {
									// TODO Auto-generated method stub
											super.onCreate(savedInstanceState);
													setContentView(R.layout.m1);
															
																	ImageButton btn1 = (ImageButton) findViewById(R.id.bt1);
																			btn1.setOnClickListener(this);
																					ImageButton btn2 = (ImageButton) findViewById(R.id.bt2);
																							btn2.setOnClickListener(this);
																									ImageButton btn3 = (ImageButton) findViewById(R.id.bbt);
																											btn3.setOnClickListener(this);
																													ImageButton btn4 = (ImageButton) findViewById(R.id.fbt);
																															btn4.setOnClickListener(this);
																																	ImageButton btn5 = (ImageButton) findViewById(R.id.hbt);
																																			btn5.setOnClickListener(this);
																																					// btn5.setAlpha(180);
																																							ImageButton btn6 = (ImageButton) findViewById(R.id.rbt);
																																									btn6.setOnClickListener(this);

																																											mapView = (MapView) findViewById(R.id.mapview);
																																													// Zoom�� �Ǿ� ���� �켱
																																															mapView.setBuiltInZoomControls(true);
																																																	// ���� ������ ����� �ʹٸ� true
																																																			mapView.setSatellite(false);

																																																					// �����ϰ� �浵���� ������
																																																							GeoPoint p = new GeoPoint(37556447, 126945184);
																																																									// ������ǥ���� �ʺ信 ���, ��ǥ���� �ٲ�� �ٲ� ��ġ�� ȭ�鿡 ���
																																																											MapController mc = mapView.getController();
																																																													mc.animateTo(p); // animateTo() �޼ҵ忡 �Ű������� �޴´�. �̰����� ������ �߽����� ���� �Ѵ�.
																																																															mc.setZoom(18); // 1~21 ���ڰ� Ŭ���� �����ϰ� ǥ��

																																																																	// ���� �ʿ� ��ϵ� ���̾� ����� �����ؼ� ����Ʈ�� �����Ѵ�.
																																																																			list = mapView.getOverlays();
																																																																					// �ʿ� �߽ɿ� �Ⱦ��� �̹��� ����
																																																																							drawable = this.getResources().getDrawable(R.drawable.androidmarker);
																																																																									// ������ �̹����� HelloOverlay�� �ְ� ��ü���� �޴´�.
																																																																											helloOverlay = new HelloOverlay(drawable);
																																																																													// OverlayItem Ŭ������ ������ ��.�浵 ���� ���� ��ü �ϳ��� �����Ѵ�.
																																																																															OverlayItem overlayItem = new OverlayItem(p, "", "");
																																																																																	// �̸� �޾Ƽ� helloOverlay�� �߰��Ѵ�. �ְԵǸ� list�� �߰��ϰ� �ǰ� ���߰��ϰ� �� �ڿ� populate�ؼ�
																																																																																			// �׷��ش�.
																																																																																					helloOverlay.addOverlay(overlayItem);
																																																																																							// ����Ʈ�� �߰��Ѵ�. googleMap.java�� �߰�.
																																																																																									list.add(helloOverlay);

																																																																																										}

																																																																																											@Override
																																																																																												protected boolean isRouteDisplayed() {
																																																																																														// TODO Auto-generated method stub
																																																																																																return false;
																																																																																																	}
																																																																																																		
																																																																																																			public void onClick(View v) {
																																																																																																					switch (v.getId()) {

																																																																																																							case R.id.bt1:
																																																																																																										Intent i1 = new Intent(googleMaps.this, m.class);
																																																																																																													startActivity(i1);
																																																																																																																break;
																																																																																																																		case R.id.bt2:
																																																																																																																					Intent i2 = new Intent(googleMaps.this, m.class);
																																																																																																																								startActivity(i2);
																																																																																																																											break;

																																																																																																																													case R.id.hbt:
																																																																																																																																Intent i3 = new Intent(googleMaps.this, m.class);
																																																																																																																																			startActivity(i3);
																																																																																																																																						break;

																																																																																																																																								case R.id.bbt:
																																																																																																																																											Intent i4 = new Intent(googleMaps.this, m.class);
																																																																																																																																														startActivity(i4);
																																																																																																																																																	break;

																																																																																																																																																			case R.id.fbt:
																																																																																																																																																						Intent i5 = new Intent(googleMaps.this, m2.class);
																																																																																																																																																									startActivity(i5);
																																																																																																																																																												break;

																																																																																																																																																														case R.id.rbt:
																																																																																																																																																																	Intent i6 = new Intent(googleMaps.this, m.class);
																																																																																																																																																																				startActivity(i6);
																																																																																																																																																																							break;
																																																																																																																																																																										
																																																																																																																																																																												}
																																																																																																																																																																													}

																																																																																																																																																																													}
