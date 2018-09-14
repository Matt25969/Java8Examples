package WithoutInnerClasses;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WithoutInner {

	public static void start() {

		Button B1 = new Button("Click 1");
		Button B2 = new Button("Click 2");
		Button B3 = new Button("Click 3");

		HelloBertEvent hbe = new HelloBertEvent();
		HelloBobEvent hbe1 = new HelloBobEvent();
		HelloJeffEvent hje = new HelloJeffEvent();

		B3.addActionListener(hbe);
		B2.addActionListener(hbe1);
		B1.addActionListener(hje);

		Panel P = new Panel();
		P.add(B1);
		P.add(B2);
		P.add(B3);
		Frame F = new Frame("Without Inner");
		F.add(P);
		F.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		F.setSize(400, 400);
		F.setVisible(true);

	}

}
