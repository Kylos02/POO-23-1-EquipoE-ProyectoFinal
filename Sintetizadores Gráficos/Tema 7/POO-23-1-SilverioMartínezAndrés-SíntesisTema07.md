# Metodologías de Desarrollo
- Conjunto de técnicas y métodos organizativos aplicados al diseño de soluciones de software informático
- Su objetivo es trabajar en equipo de manera organizada

## Sus ventajas son
- Disminución del trabajo
- Mejor organización
- Mayor tiempo y calidad

## Metodologías Tradicionales
- Planteadas originalmente para tener un mejor orden al momento del desarrollo de software
- Buscan imponer una disciplina al proceso de desarrollo de software volviéndolo eficiente
- Tienen una organización de tipo lineal
- Las etapas van una tras otra, no se podrá iniciar la siguiente si no se finaliza la anterior
- No se adaptan a los cambios
- Imponen una disciplina rigurosa de trabajo sobre el proceso de desarrollo de software
- Inician el desarrollo de un proyecto con un riguroso proceso de licitación de requerimientos

### Existen los modelos

#### Evolutivos
- Visitan las distintas etapas de desarrollo tantas veces según sea necesario, en un orden específico y sin retrocesos en la secuencia
##### De los cuales están
###### Cascada (Waterfall)
- Donde las etapas se organizan de arriba a abajo
###### Prototipado
- Se basa en la construcción de un prototipo de software que se construye rápidamente para que los usuarios puedan probarlo y aportar feedback
###### Espiral
- Es una combinación del modelo Cascada y Prototipado, y que añade el concepto de análisis de riesgo
###### Incremental
- Llamado así porque se entrega el software en partes pequeñas, pero utilizables

#### De minimalización de desarrollos
- Se ocupan componentes reutilizables y desarrollo por herramientas
- Aumenta la importancia de la reutilización
- Disminuye la importancia del cumplimiento estricto de los requerimientos
##### Del cual existe
###### Diseño rápido de aplicaciones (RAD)
- Permite desarrollar software de alta calidad en un corto periodo de tiempo
- Su objetivo es iterar el menor número posible de veces para conseguir una aplicación completa de forma rápida.
- Costos más altos, así como mayor intervención del usuario
- Código con mayor número de errores
- Tiene funciones limitadas

#### Híbridos
- Son una mezcla de prácticas y herramientas que no necesariamente son de una misma metodología
- Crean un método robusto, pero flexible
- Pretenden conservar las ventajas de distintos métodos siendo una combinación de ellos y resolviendo sus desventajas
##### De los cuales existen
###### Rational Unified Process
- propone desarrollar software con base en las  acciones de proyectos grandes y que han sido exitosos
- Muestra las etapas del modelo sobre el tiempo y del trabajo
- Desarrolla el software de forma iterativa

## Metodologías de cascada
- Propuesto en 1970 por Winston W. Royce,
- Consiste en ordenar de forma lineal las distintas etapas que debes de seguir al momento de desarrollar el software
-  Divide en fases cada etapa del desarrollo de software y completar cada una de ellas en un orden específico

### Las diferentes fases de este método son
#### Análisis
- Etapa de preparación del proyecto
- Se recopilan las necesidades y los objetivos
- Fase en la que se debe de presentar la propuesta del proyecto
#### Diseño
- Se define la organización de la estructura y la los elementos que se necesitan para el desarrollo del software
- Describe cómo se relacionan cada uno de los elementos entre sí para que funcionen de manera correcta
#### Implementación
- Se integra cada uno de los elementos de diseño previos al lenguaje de programación
#### Verificación
-  Se prueba y ejecuta el código final, así como se verifica su funcionamiento
#### Mantenimiento
- Se analizan los resultados del paso anterior y se realizan los cambios pertinentes 
### Las ventajas del modelo en cascada son
- Ayuda a llevar un orden y organizar el trabajo
- Funciona de manera óptima en la mayoría de los dispositivos
- Es sencillo y fácil de seguir.
- Brinda las herramientas necesarias para tener claridad en loa objetivos desde el comienzo del proyecto
- Ofrece la oportunidad de detectar la fase del modelo en cascada en la que surge un problema
### Las desventajas del modelo en cascada son
- Puede que sea más difícil dividir un proyecto grande en fases ordenadas
- Hay menos tiempo para concluir cada una de las fases del modelo en cascada
- No se puede pasar a la etapa siguiente hasta que se complete la anterior
- No se detectan las fallas hasta la última fase del desarrollo

## Metodologías ágiles
- Son orientadas a la creación de software con pocas semanas de desarrollo y bajos niveles de formalización en la documentación requerida
- Busca seguir procesos para el desarrollo de acuerdo a las prácticas que han dado resultados al grupo
- Son más utilizadas debido a su alta flexibilidad y agilidad
- No hace énfasis en la documentación ni en las herramientas usadas
- Busca distribuir de forma permanente sistemas de software en funcionamiento diseñados con iteraciones rápidas
- Los marcos ágiles para el desarrollo de software  son la base de procesos conocidos de desarrollo de software, como DevOps y la integración continua/implementación continua (CI/CD)

### Manifiesto ágil
- Características que diferencian un proceso ágil de uno tradicional
- Es más importante construir un buen equipo de trabajo que construir el entorno
- Prioriza el desarrollo de buen software ante la documentación
- Prefiere la colaboración con el cliente más que la negociación de un contrato
- Tiene la capacidad de idear nuevos caminos
#### Sus principios son
- La prioridad es satisfacer al cliente mediante tempranas y continuas entregas de software que le aporte un valor
- Dar la bienvenida a los cambios
- Entregar frecuentemente software que funcione desde un par de semanas a un par de meses, con el menor intervalo de tiempo posible entre entregas.
- La gente del negocio y los desarrolladores deben trabajar juntos a lo largo del proyecto
- Construir el proyecto en torno a individuos motivados
- El diálogo cara a cara es el método más eficiente y efectivo para comunicar información dentro de un equipo

### Algunas metodologías que se encuentran dentro de esta clasificación son
#### Scrum
- Marco de trabajo diseñado de tal forma que logra la colaboración eficaz del equipo de trabajo
- Emplea un conjunto de reglas y se definen roles para generar una estructura de correcto funcionamiento
- Emplea un conjunto de reglas y se definen roles para generar una estructura de correcto funcionamiento
#### Programación extrema (XP)
- Se centra en mejorar las relaciones interpersonales, promoviendo el trabajo en equipo
- Hay una continua interacción entre los desarrolladores y el cliente, así como entre el equipo de desarrollo
##### De entre los roles importantes de esta metodología se encuentran
- Programador
- Cliente
- Tester
- Tracker
- Entrenador
- Consultor
- Gestor
##### El ciclo que sigue es
1. El cliente define el valor de negocio a implementar
2. El programador estima el esfuerzo necesario para su implementación
3. El cliente selecciona qué construir, de acuerdo con sus prioridades y las restricciones de tiempo
4. El programador construye ese valor de negocio
5. Vuelve al paso 1
#### Cristal Clear
- Se caracterizada por estar centradas en las personas que componen el equipo y la reducción al máximo del número de artefactos producidos
- Es menos extremas y están pensadas para más tipologías de proyectos y organizaciones
- Es la única metodología que  da cuenta de proyectos con criticidad de vida
#### Moblie-D
- Se basa en el desarrollo de aplicaciones móbiles
- Permite interactuar constantemente entre el equipo de trabajo con el cliente
#### Adaptative Software Development (ASD)
- Su funcionamiento es cíclico y reconoce que en cada iteración se producirán cambios e incluso errores
- Hace énfasis en aplicar las ideas que se originaron en el mundo de los sistemas complejos
- Está orientado a los componentes de software  más que a las tareas en las que se va a alcanzar dicho objetivo
#### Lean Development
- Es una forma de optimizar las personas, los recursos, el esfuerzo y la energía de una organización hacia la creación de valor para el cliente
- Se basa en la mejora continua y el respeto por las personas
##### Algunos de sus beneficios son
- Menos costos
- Mejores interacciones con el cliente
- Mayor calidad
- Crea una cultura de mejora
- Mayor moral de los empleados

## Metodología SCRUM
-  Modelo de referencia que define un conjunto de prácticas y roles
- Este permite la creación de equipos de auto-organizado impulsando la con-localización de todos los miembros del equipo
- Se propone generar “historias de usuario” (User Stories), esto con la finalidad de entender y manejar el requerimiento desde el punto de vista de un usuario final de aplicación (cliente)
- Antes de proceder al último paso, se realiza un Daily Scrum cada 24 horas o 2 a 4 semanas.
- Por último, se procede al producto potencialmente enviable, el cual consiste en un gran paso para el desarrollo de un proyecto en el cual se recopilan los avances logrados
### Algunos de sus roles son
#### ScrumMaster
- Se encarga de mantener los procesos y trabaja de forma similar al director de proyecto
#### Product Owner
- El que presenta a los stakeholders
#### Team
- Son los desarrolladores
#### Los stakeholders y el team sirven para la licitación, especificación y validación de los requerimientos de software.
##### Ejemplos de empresas que han utilizado esta metodología son
###### Spotify
- El rol Scrum Master y Scrum Owner se denota bastante, pues gracias a esto se ha creado el algoritmo para descubrir y entender las necesidades reales de los clientes
###### Apple
- Distribuyen y planifican tareas y responsabilidades individuales y por equipo, como a su vez, le dan demasiada importancia al testeo
###### Intel
- Acortó el tiempo del ciclo de trabajo en un 66% además de eliminar los retrasos en la programación
###### Adobe Premiere Pro
- Utiliza Scrum para coordinar acciones dentro de un equipo distribuido en un entorno compuesto por sub-equipos diferentes a Scrum
###### Ferrocarriles Holandeses
- Un equipo distribuido en Holanda e India implementó Scrum con éxito debido a que sus proyectos gestionados aplicando otros métodos no se completaron después de tres años
