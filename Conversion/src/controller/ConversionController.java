package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ConversionModel;
import view.ConversionPanel;
import view.ImageProcessingPanel;

public class ConversionController extends ImageProcessingPanelController{
    protected ConversionPanel conversionPanel;
    protected ConversionModel conversionModel;
    
    @Override
    public void panelController() {
    	this.conversionPanel = new ConversionPanel();
        this.conversionModel = new ConversionModel();
        this.conversionModel.converion();
//        this.conversionPanel.getBtnBinarization().addActionListener(new PartionatedOtsuButtonBinarizationListener(this.partionatedOtsuModel));
//        this.partionatedOtsuPanel.getBtnROISelection().addActionListener(new PartionatedOtsuButtonROISelectionListener(this.partionatedOtsuModel, this.partionatedOtsuPanel));        
    }
    
    public ImageProcessingPanel getPanelView() {
		return this.conversionPanel;
	}
}

//class PartionatedOtsuButtonBinarizationListener implements ActionListener{
//	protected PartionatedOtsuModel partionatedOtsuModel;
//	
//	public PartionatedOtsuButtonBinarizationListener(PartionatedOtsuModel partionatedOtsuModel){
//		this.partionatedOtsuModel = partionatedOtsuModel;
//	}
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		this.partionatedOtsuModel.applyBinarization();
//	}
//}

//class PartionatedOtsuButtonROISelectionListener implements ActionListener{
//	protected PartionatedOtsuModel partionatedOtsuModel;
//	protected PartionatedOtsuPanel partionatedOtsuPanel;
//	
//	public PartionatedOtsuButtonROISelectionListener(PartionatedOtsuModel partionatedOtsuModel, PartionatedOtsuPanel partionatedOtsuPanel){
//		this.partionatedOtsuModel = partionatedOtsuModel;
//		this.partionatedOtsuPanel = partionatedOtsuPanel;
//	}
//	
//	 @Override
//	 public void actionPerformed(ActionEvent e) {
//  		this.partionatedOtsuModel.getSelectedROI(partionatedOtsuPanel);
//	 } 
//}