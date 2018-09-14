package WithLambdas;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WithLambda {

	public static void start() {

		Button B1 = new Button("Click 1");
		Button B2 = new Button("Click 2");
		Button B3 = new Button("Click 3");

		ActionListener al1 = e -> System.out.println("Hello Mr.Bob");

		ActionListener al2 = e -> System.out.println("Hello Mr.Bert");

		ActionListener al3 = e -> System.out.println("Hello Mr.Jeff");

		B3.addActionListener(al1);
		B2.addActionListener(al2);
		B1.addActionListener(al3);

		Panel P = new Panel();
		P.add(B1);
		P.add(B2);
		P.add(B3);
		Frame F = new Frame("With Lambdas");
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
