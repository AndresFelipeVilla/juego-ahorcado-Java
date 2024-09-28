# Juego de Ahorcado en JAVA

El código implementa un juego de "Ahorcado" en Java, donde el jugador debe adivinar una palabra secreta, letra por letra. Comienza con un número máximo de intentos (10) y muestra el progreso mediante guiones bajos que representan letras no adivinadas. Cada vez que el jugador introduce una letra, el programa verifica si es correcta y actualiza la representación de la palabra. Si el jugador adivina la palabra antes de agotar los intentos, gana; de lo contrario, el juego termina y se muestra un mensaje de "GAME OVER". 

## Las herramientas utilizadas en este juego son:

- **Clase** `Scanner`: Para recibir entradas del usuario.
- **Clase** `String` y sus métodos**:
	-  `length()`: Para obtener la longitud de la palabra secreta.
	 - `charAt(int index)`: Para acceder a un carácter específico de la palabra secreta.
	-  `equals(String another)`: Para comparar la palabra adivinada con la palabra secreta.
	-  `valueOf(char[] array)`: Para convertir un arreglo de caracteres en una cadena.
- **Clase** `Character` y su método:
	- `toLowerCase(char ch)`**: Para convertir la letra ingresada por el usuario a minúscula, asegurando que las comparaciones sean insensibles a mayúsculas y minúsculas.
-   **Arreglos**: Para almacenar las letras adivinadas.
-   **Estructuras de control**:
    -  Bucles (`for`, `while`): Para iterar sobre letras y manejar el flujo del juego.
    -  Condicionales (`if`): Para verificar condiciones, como si la letra es correcta o si el jugador ha ganado. 
