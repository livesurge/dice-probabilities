package org.kleemann.diceprobabilities.graph;

import junit.framework.TestCase;

import org.kleemann.diceprobabilities.graph.Interpolate;
import org.kleemann.diceprobabilities.graph.Point;

public class InterpolateTest extends TestCase {

	public void testTest() {
		assertEquals(1,1);
	}
	
	public void testThreePoints() {
		Point[] pt = {
			new Point(0f,0f),
			new Point(3f,3f),
			new Point(6f,0f)
		};
		
		Interpolate interpolate = new Interpolate(pt);
		for (int i=0 ; i<3 ; ++i) {
			android.util.Log.d("TAG", "p"+pt[i]+" c1"+interpolate.getC1(i)+" c2"+interpolate.getC2(i));
		}
	}
}
