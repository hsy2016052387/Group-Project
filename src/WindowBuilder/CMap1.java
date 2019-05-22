package WindowBuilder;

import javax.swing.*;
import javax.swing.table.*;

class CMap1 implements CMap {
public int span(int row, int column) {
   if( column == 0  && row==3)
	   return 11;
   if(column==1&&row==3)
	   return 7;
   //if(row==0)
	   //return 3;
   return 1;
 }

public int visibleCell(int row, int column) {
	if(row==3&&column==0)
		return 3;
	if(row==3&&column==1)
		return 3;
	//if(row==0)
		//return 0;
	return row;
   }
}