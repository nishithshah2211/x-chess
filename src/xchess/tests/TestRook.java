package xchess.tests;

import java.util.*;
import xchess.*;


public class TestRook {
	public static void main(String[] args) {
		Game g= new Game();
		g.main();
		g.cb.getState();
		
		ArrayList<Point> m=new ArrayList<Point>();
		Rook r=new Rook();
		m=r.getPossibleMoves(new Point(3,4));
		Point p=new Point(0,0);
		for(int i=0;i<m.size();i++)
		{
			System.out.println((m.get(i)));
		}
		
	}
}