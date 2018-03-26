package application;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;

public class LightPuzzle {

	protected Shell shlLightPuzzle;
	private Button puzzle_button_0;
	private Button puzzle_button_1;
	private Button puzzle_button_2;
	private Button puzzle_button_3;
	private Button puzzle_button_4;
	private Button puzzle_button_5;
	private Button puzzle_button_6;
	private Button puzzle_button_7;
	private Button puzzle_button_8;
	private Button editButton;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LightPuzzle window = new LightPuzzle();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlLightPuzzle.open();
		shlLightPuzzle.layout();
		while (!shlLightPuzzle.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlLightPuzzle = new Shell();
		shlLightPuzzle.setMinimumSize(new Point(270, 320));
		shlLightPuzzle.setSize(270, 320);
		shlLightPuzzle.setText("Light Puzzle");
		
		puzzle_button_0 = new Button(shlLightPuzzle, SWT.TOGGLE);
		puzzle_button_0.setBounds(10, 10, 75, 75);
		puzzle_button_0.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if(!(editButton.getSelection())) {
					puzzle_button_1.setSelection(!(puzzle_button_1.getSelection()));
					puzzle_button_3.setSelection(!(puzzle_button_3.getSelection())); 
				}
			}
		});
		
		puzzle_button_1 = new Button(shlLightPuzzle, SWT.TOGGLE);
		puzzle_button_1.setBounds(91, 10, 75, 75);
		puzzle_button_1.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if(!(editButton.getSelection())) {
					puzzle_button_0.setSelection(!(puzzle_button_0.getSelection()));
					puzzle_button_2.setSelection(!(puzzle_button_2.getSelection())); 
					puzzle_button_4.setSelection(!(puzzle_button_4.getSelection())); 
				}
			}
		});
		
		puzzle_button_2 = new Button(shlLightPuzzle, SWT.TOGGLE);
		puzzle_button_2.setBounds(172, 10, 75, 75);
		puzzle_button_2.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if(!(editButton.getSelection())) {
					puzzle_button_1.setSelection(!(puzzle_button_1.getSelection()));
					puzzle_button_5.setSelection(!(puzzle_button_5.getSelection())); 
				}
			}
		});
		
		puzzle_button_3 = new Button(shlLightPuzzle, SWT.TOGGLE);
		puzzle_button_3.setBounds(10, 89, 75, 75);
		puzzle_button_3.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if(!(editButton.getSelection())) {
					puzzle_button_0.setSelection(!(puzzle_button_0.getSelection()));
					puzzle_button_6.setSelection(!(puzzle_button_6.getSelection())); 
					puzzle_button_4.setSelection(!(puzzle_button_4.getSelection())); 
				}
			}
		});
		
		puzzle_button_4 = new Button(shlLightPuzzle, SWT.TOGGLE);
		puzzle_button_4.setBounds(91, 91, 75, 75);
		puzzle_button_4.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if(!(editButton.getSelection())) {
					puzzle_button_1.setSelection(!(puzzle_button_1.getSelection()));
					puzzle_button_3.setSelection(!(puzzle_button_3.getSelection())); 
					puzzle_button_5.setSelection(!(puzzle_button_5.getSelection())); 
					puzzle_button_7.setSelection(!(puzzle_button_7.getSelection())); 
				}
			}
		});
		
		puzzle_button_5 = new Button(shlLightPuzzle, SWT.TOGGLE);
		puzzle_button_5.setBounds(172, 89, 75, 75);
		puzzle_button_5.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if(!(editButton.getSelection())) {
					puzzle_button_2.setSelection(!(puzzle_button_2.getSelection()));
					puzzle_button_8.setSelection(!(puzzle_button_8.getSelection())); 
					puzzle_button_4.setSelection(!(puzzle_button_4.getSelection())); 
				}
			}
		});
		
		puzzle_button_6 = new Button(shlLightPuzzle, SWT.TOGGLE);
		puzzle_button_6.setBounds(10, 170, 75, 75);
		puzzle_button_6.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if(!(editButton.getSelection())) {
					puzzle_button_3.setSelection(!(puzzle_button_3.getSelection()));
					puzzle_button_7.setSelection(!(puzzle_button_7.getSelection())); 
				}
			}
		});
		
		puzzle_button_7 = new Button(shlLightPuzzle, SWT.TOGGLE);
		puzzle_button_7.setBounds(91, 170, 75, 75);
		puzzle_button_7.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if(!(editButton.getSelection())) {
					puzzle_button_6.setSelection(!(puzzle_button_6.getSelection()));
					puzzle_button_8.setSelection(!(puzzle_button_8.getSelection())); 
					puzzle_button_4.setSelection(!(puzzle_button_4.getSelection())); 
				}
			}
		});
		
		puzzle_button_8 = new Button(shlLightPuzzle, SWT.TOGGLE);
		puzzle_button_8.setBounds(172, 170, 75, 75);
		puzzle_button_8.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if(!(editButton.getSelection())) {
					puzzle_button_7.setSelection(!(puzzle_button_7.getSelection()));
					puzzle_button_5.setSelection(!(puzzle_button_5.getSelection())); 
				}
			}
		});
		
		editButton = new Button(shlLightPuzzle, SWT.TOGGLE);
		editButton.setText("Edit");
		editButton.setBounds(10, 251, 75, 25);
		editButton.addListener(SWT.Selection,  new Listener() {
			public void handleEvent(Event e) {
				switch(e.type) {
				case SWT.Selection:
					System.out.println("Button Pressed");
				}
			}
		});

	}
}
