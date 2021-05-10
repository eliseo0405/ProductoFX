module ni.edu.ni.fcys.programacion2.tableviewfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens ni.edu.ni.fcys.programacion2.tableviewfx to javafx.fxml;
    exports ni.edu.ni.fcys.programacion2.tableviewfx;
    exports ni.edu.ni.fcys.programacion2.tableviewfx.controllers;
    exports ni.edu.ni.fcys.programacion2.tableviewfx.controllers.pojo;
}
