# Tour.llanquihue

Proyecto Java orientado a objetos para administrar y cargar una lista de tours turisticos asociados a un guia. La informacion se guarda y lee desde un archivo de texto con datos separados por comas.

## Descripcion

La aplicacion crea un guia turistico y maneja una lista de tours, donde cada tour contiene:

- Ciudad
- Servicio
- Precio
- Cupos disponibles

El proyecto incluye una clase encargada de persistir y recuperar la informacion desde el archivo `guiaTours.txt`.

## Estructura del proyecto

```text
Tour.llanquihue/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   ├── app/
        │   │   └── Main.java
        │   ├── data/
        │   │   └── dataManager.java
        │   └── model/
        │       ├── Guia.java
        │       └── Tour.java
        └── resources/
            └── guiaTours.txt
```

## Clases principales

### `Main`

Clase principal de la aplicacion. Crea un objeto `Guia`, agrega tours de ejemplo y carga la lista de tours desde el archivo `guiaTours.txt` para mostrarla por consola.

### `Guia`

Modelo que representa a un guia turistico. Contiene:

- Nombre del guia
- Lista de tours
- Metodo para agregar tours a la lista

### `Tour`

Modelo que representa un tour turistico. Contiene:

- Ciudad
- Servicio
- Precio
- Cupos

Tambien sobrescribe el metodo `toString()` para guardar los datos en formato CSV simple:

```text
ciudad,servicio,precio,cupos
```

### `dataManager`

Clase responsable de manejar la persistencia de datos.

Metodos principales:

- `guardaTour(Guia guia)`: guarda el nombre del guia y sus tours en `guiaTours.txt`.
- `cargarTourlista()`: lee el archivo `guiaTours.txt`, crea un objeto `Guia` y carga sus tours.

## Formato del archivo de datos

El archivo `guiaTours.txt` usa la primera linea para el nombre del guia. Las lineas siguientes contienen los tours separados por comas:

```text
Francisco Silva
Temuco,Treking,20000,20
Pto Montt,Senderismo,30000,10
Pto Varas,Caminata por la ciudad,20000,15
Villarica,Tour guiado,15000,20
Coquimbo,Tour Valle del Elqui,25000,25
```

## Requisitos

- Java 25
- Maven
- IntelliJ IDEA u otro IDE compatible con proyectos Maven

El proyecto esta configurado en `pom.xml` con:

```xml
<maven.compiler.source>25</maven.compiler.source>
<maven.compiler.target>25</maven.compiler.target>
```

## Como compilar

Desde la raiz del proyecto:

```bash
mvn compile
```

## Como ejecutar

Puedes ejecutar la clase principal desde el IDE o usar Maven:

```bash
mvn exec:java -Dexec.mainClass="app.Main"
```

Si el plugin `exec-maven-plugin` no esta configurado, ejecuta `Main.java` directamente desde IntelliJ IDEA.

## Ejemplo de salida

```text
--Guia Cargado--
Guia turistico: Francisco Silva
Tours:
- Ciudad: Temuco - Servicio: Treking - Precio: 20000 - Cupos: 20
- Ciudad: Pto Montt - Servicio: Senderismo - Precio: 30000 - Cupos: 10
```


