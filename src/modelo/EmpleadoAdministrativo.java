package modelo;

public class EmpleadoAdministrativo extends EmpleadoBase {

    private double bonificacion; // atributo que solo tiene esta clase

    public EmpleadoAdministrativo(String cedula, String nombre,
                                  double salarioBase, double bonificacion) {
        super(cedula, nombre, salarioBase); // llama al constructor del padre
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    @Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal() + bonificacion;
    }

    @Override
    public String getTipo() {
        return "Administrativo";
    }
}