package kr.android.Ultra_Meeting;

import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class UMOverlay extends ItemizedOverlay<OverlayItem> {
	private ArrayList<OverlayItem> alist = new ArrayList<OverlayItem>();

		public UMOverlay(Drawable drawable) {

				// �׸��ڸ� �׸��� ����
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
																				// alist�� ��ü ������ ���ϱ� ����
																						return alist.size();
																							}

																								void addOverlay(OverlayItem overlayItem) {
																										// ���� ���� �� �ִٸ� �̰����� list�� �߰��� �ش�.
																												alist.add(overlayItem);
																														// �׷��ش�.
																																this.populate();
																																	}
																																	}
