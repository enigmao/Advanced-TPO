package cell;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableActionCellRender extends DefaultTableCellRenderer{
    public Component getTableCellRendererComponent(JTable jtable,Object o,boolean isSelected,boolean blnl,int row,int column){
     Component com=super.getTableCellRendererComponent(jtable,o,isSelected,blnl,row,column);   
     PanelAction action=new PanelAction();
     if(isSelected==false&&row%2==0)
         action.setBackground(Color.WHITE);
      else
        action.setBackground(com.getBackground());
    return action;
    }
}
