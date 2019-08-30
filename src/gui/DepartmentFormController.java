package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController implements Initializable {

	private Department entity;

	@FXML
	private TextField txtId;

	@FXML
	private TextField txtName;

	@FXML
	private Label labelError;

	@FXML
	private Button btCancel;

	@FXML
	private Button btSave;

	public void setDepartment(Department entity) {
		this.entity = entity;
	}

	@FXML
	public void inBtSaveaction() {
		System.out.println("OnBtSaveAction");

	}

	@FXML
	public void inBtCancelaction() {
		System.out.println("OnBtCancelAction");

	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {

		Constraints.setTextFieldInteger(txtId);

		Constraints.setTextFieldMaxLength(txtName, 30);

	}

	public void updateFormData() {

		if (entity == null) {

			throw new IllegalStateException("Entity was null");

		}

		txtId.setText(String.valueOf(entity.getId()));

		txtName.setText(entity.getName());

	}
}
