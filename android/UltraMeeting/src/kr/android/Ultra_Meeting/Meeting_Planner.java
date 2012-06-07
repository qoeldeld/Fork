package kr.android.Ultra_Meeting;

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

public class Meeting_Planner extends MapActivity implements OnClickListener {

	MapView mapView;
		Drawable drawable;// ��Ŀ�� �׸� �׸��� �ҷ����� ���� Ŭ����
			List<Overlay> list; // ��Ŀ ���� ��Ŀ�� �ö� ���� �ְ� ������ list Ÿ������ ����
				// �ʿ� �÷��� Ÿ������ ����
					UMOverlay umoverlay;

						@Override
							protected void onCreate(Bundle savedInstanceState) {
									// TODO Auto-generated method stub
											super.onCreate(savedInstanceState);
													setContentView(R.layout.meeting_planner);
															
																	ImageButton btn1 = (ImageButton) findViewById(R.id.bt1);
																			btn1.setOnClickListener(this);
																					ImageButton btn2 = (ImageButton) findViewById(R.id.bt2);
																							btn2.setOnClickListener(this);
																									ImageButton btn3 = (ImageButton) findViewById(R.id.bt3);
																											btn3.setOnClickListener(this);
																													ImageButton btn4 = (ImageButton) findViewById(R.id.bt4);
																															btn4.setOnClickListener(this);
																																	ImageButton btn5 = (ImageButton) findViewById(R.id.bt5);
																																			btn5.setOnClickListener(this);
																																					// btn5.setAlpha(180);
																																							ImageButton btn6 = (ImageButton) findViewById(R.id.bt6);
																																									btn6.setOnClickListener(this);

																																											mapView = (MapView) findViewById(R.id.mapview);
																																													// Zoom�� �Ǿ� ���� �켱
																																															mapView.setBuiltInZoomControls(true);
																																																	// ���� ������ ����� �ʹٸ� true
																																																			mapView.setSatellite(false);

																																																					// �����ϰ� �浵���� ������
																																																							
																																																									GeoPoint p = new GeoPoint(37581776,127009874);
																																																											// ������ǥ���� �ʺ信 ���, ��ǥ���� �ٲ�� �ٲ� ��ġ�� ȭ�鿡 ���
																																																													MapController mc = mapView.getController();
																																																															mc.animateTo(p); // animateTo() �޼ҵ忡 �Ű������� �޴´�. �̰����� ������ �߽����� ���� �Ѵ�.
																																																																	mc.setZoom(18); // 1~21 ���ڰ� Ŭ���� �����ϰ� ǥ��

																																																																			// ���� �ʿ� ��ϵ� ���̾� ����� �����ؼ� ����Ʈ�� �����Ѵ�.
																																																																					list = mapView.getOverlays();
																																																																							// �ʿ� �߽ɿ� �Ⱦ��� �̹��� ����
																																																																									drawable = this.getResources().getDrawable(R.drawable.blackpin);
																																																																											// ������ �̹����� HelloOverlay�� �ְ� ��ü���� �޴´�.
																																																																													umoverlay = new UMOverlay(drawable);
																																																																															// OverlayItem Ŭ������ ������ ��.�浵 ���� ���� ��ü �ϳ��� �����Ѵ�.
																																																																																	OverlayItem overlayItem = new OverlayItem(p, "", "");
																																																																																			// �̸� �޾Ƽ� helloOverlay�� �߰��Ѵ�. �ְԵǸ� list�� �߰��ϰ� �ǰ� ���߰��ϰ� �� �ڿ� populate�ؼ�
																																																																																					// �׷��ش�.
																																																																																							umoverlay.addOverlay(overlayItem);
																																																																																									// ����Ʈ�� �߰��Ѵ�. googleMap.java�� �߰�.
																																																																																											list.add(umoverlay);

																																																																																												}

																																																																																													@Override
																																																																																														protected boolean isRouteDisplayed() {
																																																																																																// TODO Auto-generated method stub
																																																																																																		return false;
																																																																																																			}
																																																																																																				
																																																																																																					public void onClick(View v) {
																																																																																																							switch (v.getId()) {

																																																																																																									case R.id.bt1:
																																																																																																												Intent i1 = new Intent(Meeting_Planner.this, menu.class);
																																																																																																															startActivity(i1);
																																																																																																																		break;
																																																																																																																				case R.id.bt2:
																																																																																																																							Intent i2 = new Intent(Meeting_Planner.this, Meeting_Planner.class);
																																																																																																																										startActivity(i2);
																																																																																																																													break;

																																																																																																																															case R.id.bt3:
																																																																																																																																		Intent i3 = new Intent(Meeting_Planner.this, Meeting_Planner.class);
																																																																																																																																					startActivity(i3);
																																																																																																																																								break;

																																																																																																																																										case R.id.bt4:
																																																																																																																																													Intent i4 = new Intent(Meeting_Planner.this, menu.class);
																																																																																																																																																startActivity(i4);
																																																																																																																																																			break;

																																																																																																																																																					case R.id.bt5:
																																																																																																																																																								Intent i5 = new Intent(Meeting_Planner.this, menu.class);
																																																																																																																																																											startActivity(i5);
																																																																																																																																																														break;

																																																																																																																																																																case R.id.bt6:
																																																																																																																																																																			Intent i6 = new Intent(Meeting_Planner.this, menu.class);
																																																																																																																																																																						startActivity(i6);
																																																																																																																																																																									break;
																																																																																																																																																																												
																																																																																																																																																																														}
																																																																																																																																																																															}

																																																																																																																																																																															}
