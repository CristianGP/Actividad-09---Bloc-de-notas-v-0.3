package main;

import models.ModelBlocDeNotas;
import views.ViewBlocDeNotas;
import controllers.ControllerBlocDeNotas;

public class Main {
    private static ModelBlocDeNotas modelBlocDeNotas;
    private static ViewBlocDeNotas viewBlocDeNotas;
    private static ControllerBlocDeNotas controllerBlocDeNotas;
    
    public static void main(String[] args) {
        modelBlocDeNotas = new ModelBlocDeNotas();
        viewBlocDeNotas = new ViewBlocDeNotas();
        controllerBlocDeNotas = new ControllerBlocDeNotas(modelBlocDeNotas, viewBlocDeNotas);
    }
    
}
