# SENA Viewer

Mini-aplicación de consola en Java que simula la reproducción de contenidos multimedia.

## Integrante
- Tu Nombre — Desarrollador / Documentación / Git

## Estructura del proyecto
(ver carpeta `src`)

## Cómo compilar y ejecutar (Java 17)

### Con VS Code
- Instala Extension Pack for Java.
- Abre la carpeta del proyecto y ejecuta `Main` desde el botón Run.

### Desde terminal (Git Bash o Linux)
```bash
mkdir -p out
javac -d out $(find src -name "*.java")
java -cp out com.senaviewer.Main
