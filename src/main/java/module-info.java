module com.brickncode.javafxtemplate {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;

	requires org.controlsfx.controls;
	requires com.dlsc.formsfx;
	requires validatorfx;
	requires org.kordamp.ikonli.javafx;
	requires org.kordamp.bootstrapfx.core;
	requires eu.hansolo.tilesfx;

	opens com.brickncode.javafxtemplate to javafx.fxml;
	exports com.brickncode.javafxtemplate;
	exports com.brickncode.javafxtemplate.controller;
	opens com.brickncode.javafxtemplate.controller to javafx.fxml;
}