module me.thijsvdh {
    requires javafx.controls;
    requires javafx.fxml;

    opens me.thijsvdh to javafx.fxml;
    exports me.thijsvdh;
}