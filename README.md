# DAW_RA2_Grup3

## Parte 1. Preparación del repositorio
Un integrante del grupo crea un nuevo repositorio en GitHub llamado controlando-el-caos.
Clonar el repositorio con GitHub Desktop en el equipo de ese integrante.
Crear un proyecto Java en Eclipse dentro de esa carpeta local.


## Parte 2. Investigar y aplicar .gitignore
Antes de subir el proyecto completo, debéis investigar qué es un archivo .gitignore y para qué sirve.

Luego debéis:

* Crear un archivo llamado .gitignore en la raíz del repositorio.
* Investigar en Internet qué debe contener un .gitignore para un proyecto Java de Eclipse, e incluir las rutas o carpetas que no se deben subir al repositorio (por ejemplo bin/, .classpath, .project, etc.).
* Hacer commit y push del archivo .gitignore con un mensaje claro.
* Pista: puedes buscar en Google “.gitignore java eclipse template” o usar la web oficial https://gitignore.io introduciendo las palabras clave java, eclipse.



## Parte 3. Código base
Crear un programa base sencillo, por ejemplo:

```
public class Calculadora {
    public static void main(String[] args) {
        System.out.println("=== Calculadora Básica ===");
        int a = 10;
        int b = 5;
 
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
    }
}
´´´
 


## Parte 4. Trabajo con ramas y commits
Ahora sí, cada integrante en su equipo haced lo siguiente:

En GitHub Desktop, crear una rama nueva para su funcionalidad, por ejemplo:
* rama-suma
* rama-potencia
* rama-raiz
* rama-porcentaje
En cada rama, modificar el código Java añadiendo una nueva operación o mejora (por ejemplo, leer números por teclado, las diferentes operaciones, etc.).
Hacer:
* commit con un mensaje descriptivo.
* push de su rama al remoto.


## Parte 5. Pull Request y merge
Desde GitHub (web), abrir un Pull Request para fusionar su rama a main.
Revisar los cambios de un compañero y dejan un comentario.
El responsable del grupo aprueba y hace merge.


## Parte 6. Resolver conflictos
Debéis provocar intencionadamente un conflicto y resolverlo.

## Cómo provocarlo:
Dos miembros del grupo deben editar la misma línea o bloque de código en ramas diferentes y resolverlo.
Por ejemplo, ambos modifican el mensaje inicial:
 
```
System.out.println("=== Calculadora Básica ===");
 
* En una rama se cambia a === Calculadora Avanzada ===
* En otra rama se cambia a === Super Calculadora ===
1. Cada uno hace commit y push de su rama.
2. El primero que haga el merge a main no tendrá problema.
3. El segundo, al intentar hacer el merge, verá que Git detecta un conflicto en ese archivo.
4. Decidid que opción vais a usar para resolver el conflicto.
´´´


## Entrega
Cada grupo debe entregar:

Enlace al repositorio en GitHub.
* Un documento en .pdf con capturas de pantalla que detalle:
* Commits realizados.
* Uso de ramas en GitHub Desktop.
* Pull Request creado y mergeado.
* Conflicto resuelto.
* .gitignore aplicado correctamente.
