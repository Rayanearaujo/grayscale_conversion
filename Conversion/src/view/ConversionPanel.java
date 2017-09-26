package view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import ij.ImagePlus;

public class ConversionPanel extends ImageProcessingPanel {

	protected JButton btnBinarization;
	protected JButton btnROISelection;
	protected JLabel width, heigth;
	private JRadioButton colorToGray, decolorize, smith08, luminance;
	private RadioButtonHandler handler;
	private ButtonGroup conveersionTypes;
	
	@Override
	public void setupPanel() {
		super.setupPanel();

		colorToGray = new JRadioButton("Color2Gray");
		colorToGray.setBounds(220, 341, 117, 25);
//		decolorize = new JRadioButton("Decolorize");
//		decolorize.setBounds(100, 341, 117, 25);
//		smith08 = new JRadioButton("Color2Gray");
//		smith08.setBounds(220, 371, 117, 25);
//		luminance = new JRadioButton("Decolorize");
//		luminance.setBounds(100, 371, 117, 25);
		
		this.add(this.colorToGray);
//		this.add(this.decolorize);
//		this.add(this.smith08);
//		this.add(this.luminance);
		
//		conveersionTypes = new ButtonGroup();
//		conveersionTypes.add(colorToGray);
//		conveersionTypes.add(decolorize);
//		conveersionTypes.add(smith08);
//		conveersionTypes.add(luminance);
//		
		handler = new RadioButtonHandler();
		colorToGray.addItemListener(handler);
//		decolorize.addItemListener(handler);
//		smith08.addItemListener(handler);
//		luminance.addItemListener(handler);
		
//		//Selection Button
//		this.btnROISelection = new JButton("Select");
//		this.btnROISelection.setBounds(312, 321, 117, 25);
//		this.add(this.btnROISelection);
//		
//		//Binarization Button
//		this.lblPanelTitle.setText("Binarization");
//		this.txtPanelDescription.setText("Use the tool **** to select the area that represents...");
//		this.btnBinarization = new JButton("Binarization");
//		this.btnBinarization.setBounds(175, 371, 117, 25);
//		this.add(this.btnBinarization);		
		
	}
	
	public JButton getBtnBinarization() {
		return this.btnBinarization; 
	}
	public JButton getBtnROISelection() {
		return this.btnROISelection; 
	}
	
	
	public class RadioButtonHandler implements ItemListener{
	
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(colorToGray.isSelected())
				System.out.println("Color2Gray");
			
			
		}
		
	}

}