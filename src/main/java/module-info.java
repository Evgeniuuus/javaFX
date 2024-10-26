module org.example.java_fx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.java_fx to javafx.fxml;
    exports org.example.java_fx;
}