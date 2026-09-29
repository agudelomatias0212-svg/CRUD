# Sistema CRUD de Talento Humano

Aplicación de escritorio. Permite agregar, buscar, actualizar y eliminar empleados, y calcula el total de la nómina.
## Estructura del proyecto

```
src/
├── modelo/
│   ├── EmpleadoBase.java
│   ├── EmpleadoAdministrativo.java
│   ├── EmpleadoComercial.java
│   └── RepositorioEmpleados.java
├── controlador/
│   └── EmpleadoControlador.java
├── vista/
│   └── VentanaEmpleados.java
└── Main.java
```

- **modelo:** los datos (qué es un empleado y dónde se guarda).
- **controlador:** las reglas y validaciones.
- **vista:** la ventana que ve el usuario.

## Tipos de empleado

| Tipo | Salario total |
|---|---|
| Operativo | Salario base |
| Administrativo | Salario base + bonificación |
| Comercial | Salario base + % de comisión (máximo 50%) |

## Reto final: preguntas de reflexión

**1. ¿Tuve que modificar calcularTotalNomina() para incluir a los comerciales?**
No. El método recorre todos los empleados y llama a calcularSalarioTotal() sin preguntar de qué tipo es cada uno. Cada clase tiene su propia versión del método, y eso es el polimorfismo.

**2. ¿Cuántos archivos del modelo modifiqué?**
Ninguno, solo creé EmpleadoComercial. Eso muestra que con MVC se puede agregar algo nuevo sin dañar lo que ya funcionaba.

## Cómo ejecutarlo

1. Tener instalado JDK 17 o superior.
2. Abrir el proyecto en IntelliJ IDEA.
3. Ejecutar la clase `Main.java`.