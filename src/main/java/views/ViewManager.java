package views;

import interface_adapter.ViewManagerModel;
import interface_adapter.ViewManagerModelListener;

import javax.swing.*;
import java.awt.*;

public class ViewManager implements ViewManagerModelListener {
    private final JPanel view;
    private final CardLayout cardLayout;
    private final ViewManagerModel viewManagerModel;

    public ViewManager(JPanel view, CardLayout cardLayout, ViewManagerModel viewManagerModel) {
        this.view = view;
        this.cardLayout = cardLayout;
        this.viewManagerModel = viewManagerModel;
        this.viewManagerModel.addListener(this);
    }

    @Override
    public void viewChanged() {
        cardLayout.show(view, viewManagerModel.getCurrentViewName());
    }

}
