// Java Program to show the
// position of mouse
package pkg8;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Mouse extends Frame implements MouseMotionListener,WindowListener {
	Label l;


	Mouse() {
		l = new Label();
		l.setBounds(20, 40, 100, 20);
		add(l);

		addMouseMotionListener(this);
		addWindowListener(this);

		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	public void mouseMoved(MouseEvent e) {
		l.setText("X=" + e.getX() + ", Y=" + e.getY());
	}

	public void mouseDragged(MouseEvent e) {
		System.out.println("Mouse Clicked");
		
	}
	
	public void windowClosing(WindowEvent arg0) {  
	    System.out.println("Window closing");  
	    dispose();  
	}

	public void windowOpened(WindowEvent e) {
		System.out.println("Window Opening");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Closed");

	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Minimized");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Maximize");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Activated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}  
