# Actividad escolar - Practica 3. Github Actions

Realiza las siguientes actividades:

1. Construir una aplicación Java (Maven), calcule operaciones básicas, clases: 

- src/main/nom_proy/App.java
- src/main/nom_proy/mate/Operacion.java (atributos: num1, num1, constructor que reciba los dos numeros, métodos: sumar, restar, multiplicar, dividir)
- src/test/nom_proy/OperacionTest.java

```bash
calculadora-java
    src\main\java\com\s23017351\App.java
    src\main\java\com\s23017351\Operacion.java
    src\test\java\com\s23017351\OperacionTest.java
```

2. Crear repo Git y subir proyecto a GitHub

Repositorio: https://github.com/Ethan-Sarricolea/calculadora-java

3. Configurar Workflow GitHub Actions para que compile y ejecute pruebas.

Workflow: .github/workflows/main.yml

## Ejecución:

Build:
```bash
mvn build
```

---

Test:
```bash
mvn test
```

```bash
javac OperacionTest.java
java OperacionTest
```

---

App:
```bash
mvn app
```

```bash
javac App.java
java App
```