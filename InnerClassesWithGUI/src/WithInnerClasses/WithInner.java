package WithInnerClasses;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WithInner {

	public static void start() {

		Button B1 = new Button("Click 1");
		Button B2 = new Button("Click 2");
		Button B3 = new Button("Click 3");

		B3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Hello Mr.Bob");

			}

		});
		B2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello Mr.Bert");

			}

		});
		B1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello Mr.Jeff");

			}

		});
		Panel P = new Panel();
		P.add(B1);
		P.add(B2);
		P.add(B3);
		Frame F = new Frame("With Inner");
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
