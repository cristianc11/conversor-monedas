# Conversor de Monedas – Proyecto Mini 🚀

Pequeña aplicación de línea de comandos (CLI) escrita en **Java** que permite convertir valores entre distintas monedas utilizando tasas **en tiempo real** provistas por [ExchangeRate-API v6](https://www.exchangerate-api.com/).

---

## ✨ Características

- Menú interactivo en consola con 6 combinaciones de monedas predefinidas:
  - USD ⇄ ARS (Peso Argentino)
  - USD ⇄ BRL (Real Brasileño)
  - USD ⇄ COP (Peso Colombiano)
- Llamadas HTTP a la API de tasas de cambio.
- Uso de `record` en Java para deserializar respuestas JSON.
- Estructura modular con clases separadas:
  - `Principal` → interfaz CLI y flujo principal.
  - `IntercambioMoneda` → lógica de conversión.
  - `ConsultaMoneda` → conexión a la API.
  - `Moneda` → representación de la respuesta de la API.
- Validación básica de entradas del usuario.

---

## 🛠️ Tecnologías utilizadas

| Herramienta         | Propósito                                  |
|---------------------|---------------------------------------------|
| **Java 16+**        | Lenguaje base (se usan `records`)           |
| **ExchangeRate-API**| Servicio para obtener tasas de cambio       |
| **Gson / Jackson**  | (Opcional) deserialización JSON             |

---

## ⚙️ Prerrequisitos

1. Tener instalado **Java 16 o superior**.
2. Obtener una API Key gratuita desde [https://www.exchangerate-api.com/](https://www.exchangerate-api.com/).
3. Incluir tu API Key en el código de la clase `ConsultaMoneda`.

---

## ▶️ Compilación y ejecución

### Desde terminal:

```bash
# 1 – Compilar
javac -d out src/*.java

# 2 – Ejecutar
java -cp out Principal
```

🖥️ Ejemplo de uso
*****************************************
Bienvenid@ al conversor de monedas :)

Intercambios disponibles
1) Dolar >>> Peso Argentino
2) Peso Argentino >>> Dolar
3) Dolar >>> Real Brasileño
4) Real Brasileño >>> Dolar
5) Dolar >>> Peso Colombiano
6) Peso Colombiano >>> Dolar
7) Salir
*****************************************

Ingresa la acción que deseas realizar: 1
Ingresa el valor a intercambiar: 100
El valor 100.0 [USD] corresponde al valor final de => 89500.0 [ARS]

📁 Estructura de carpetas sugerida

ConversorMonedas/
├── src/
│   ├── Principal.java
│   ├── IntercambioMoneda.java
│   ├── ConsultaMoneda.java
│   └── Moneda.java
├── README.md

📄 Licencia
Este proyecto está bajo la licencia MIT.
¡Puedes usarlo, modificarlo y compartirlo libremente! ✌️
