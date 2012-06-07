package kr.android.Ultra_Meeting;

import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class UMOverlay extends ItemizedOverlay<OverlayItem> {
	private ArrayList<OverlayItem> alist = new ArrayList<OverlayItem>();

		public UMOverlay(Drawable drawable) {

				// 그림자를 그리기 위함
						super(boundCenterBottom(drawable));
								// TODO Auto-generated constructor stub
									}

										@Override
											protected OverlayItem createItem(int i) {
													// TODO Auto-generated method stub
															return alist.get(i);
																}

																	@Override
																		public int size() {
																				// alist의 전체 개수를 구하기 위함
																						return alist.size();
																							}

																								void addOverlay(OverlayItem overlayItem) {
																										// 찍을 곳이 더 있다면 이곳에서 list에 추가해 준다.
																												alist.add(overlayItem);
																														// 그려준다.
																																this.populate();
																																	}
																																	}
