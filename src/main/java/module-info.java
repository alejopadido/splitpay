module com.splitpay.splitpay {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.splitpay.splitpay to javafx.fxml;
    exports com.splitpay.splitpay;
}