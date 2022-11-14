# Patrones de diseño

## Una plantilla que se puede aplicar en diversas situaciones
### Ayuda a la reutilización de código
### Un problema no se tiene que resolver desde 0

## Patrones Orientados a Objetos
### Describen clases y objetos relacionados para resolver un problema de diseño
### Identifica aspectos clave de una estructura de diseño para crear algo reutilizable

## Elementos
### Nombre del patrón
#### Ayuda a describir el problema del diseño, soluciones y las consecuencias
### Problema
#### Describe las circunstancias para poder aplicar el patrón
### Solución
#### Describe cada uno de los elementos que son partícipes en el patrón
### Consecuencias
#### Describe los resultados, ventajas y desventajas al aplicar el patrón de diseño

## Descripción
### Nombre y clasificación del patrón
#### Ayuda a saber a qué está encaminado
### Propósito
#### Menciona en que se basa y que problemas resuelve
### También conocido como
#### Otros nombres por el cual identificar el patrón
### Motivación
#### Describe el escenario del problema y como se le dará solución
### Aplicabilidad
#### Situaciones en las cuales se puede aplicar el patrón
### Estructura
#### Representación gráfica de las clases del patrón empleado
### Participantes
#### Clases y objetos que forman parte del patrón
### Colaboraciones
#### Como colaboran entre si clases y objetos
### Consecuencias
#### Ventajas e inconvenientes del patrón
### Implementación
#### Consideraciones a tomar en cuenta al realizar el patrón
### Código de ejemplo
#### Ejemplo del patrón mediante fragmentos de código
### Usos conocidos
#### Ejemplos de implementación del patrón en sistemas reales
### Patrones relacionados
#### Menciona patrones relacionados al que se describe junto con sus principales diferencias

## Antipatrones de diseño
### Malas soluciones a problemas y pésimo diseño de software
#### Lava Flow
##### Grandes cantidades de código desordenado y con poca/nula documentación
#### The God
##### Una sola clase realiza todo
#### Golder Hammer
##### Uso de un solo paradigma para resolver todo un problema
#### Spaguetti Code
##### Programas con estructura de control de flujo compleja
#### Fantasmas
##### Varias clases con poca/nulas responsabilidades
#### Reinventar la rueda
##### Resolver problemas que ya tienen solución

## Tipos de patrones de diseño
### Creacionales
#### Abstraen el proceso de creación de objetos
#### Ayudan a diseñar clases en forma independiente
#### Resuelven problemas recurrentes
#### Permiten encapsular el conocimiento acerca del uso de clases concretas
#### Pueden ser de diferentes tipos
##### Factory
###### Tiene una interfaz abstracta para crear un objeto
###### Delega a las subclases la responsabilidad de decidir a partir de que clase se instanciará dicho objeto
##### Abstract Factory
###### Busca definir una interfaz abstracta para crear una familia de objetos relacionados que son dependientes de una variedad de soluciones concretas
##### Builder
###### Busca encapsular los detalles de la construcción de objetos tales como la instanciación de partes de un objeto compuesto en forma lógicamente organizada.
##### Prototype
###### Permite crear otros objetos simplemente haciendo una copia del objeto prototipo y haciéndo las modificaciones respectivas
##### Singleton
###### Garantiza  que una clase sólo tenga una instancia y proporciona un punto de acceso global a ella.
### Estructurales
#### Tienen que ver con la forma en la que las clases y los objetos son agrupados
#### Usan la herencia para formar interfaces o implementaciones
#### Describen formas de agrupar objetos para crear nuevas funcionalidades
#### Trata con objetos que delegan responsabilidades a otros objetos
#### Proporcionan formas para estructurar un objeto complejo de modo que se cree en su totalidad
#### Pueden ser de diferentes tipos
##### Decorator
###### Utilizado para extender la funcionalidad de un objeto de manera dinámica
##### Adapter
###### Se utiliza para transformar una interfaz de una clase en otra, de tal modo que una clase que no pudiera utilizar la primera
##### Facade
###### Permite interactuar en forma centralizada con un subsistema de clases
##### Proxy
###### Patrón de diseño estructural que te permite proporcionar un sustituto o marcador de posición para otro objeto
##### Bridge
###### Permite desacoplar la abstracción de la jerarquía de clases de su implementación
##### Virtual Proxy
###### Técnica de ahorro de memoria que propone posponer la creación de un objeto costoso
##### Counting Proxy
###### Útil para diseñar un conjunto de operaciones como registro y conteo para su ejecución antes o después de que un objeto cliente invoque un método o un servicio de un objeto proovedor
##### Agreggate Enforcer (Superviso Agregado)
###### Recomienda que cuando un objeto agregado es construido, debe ser creado completamente
##### Object Cache
###### Sugiere mantener una copia de un objeto en la memoria, con el objetivo de proveer un tiempo de respuesta más rápido a las solicitudes de los clientes
##### Composite (Compuesto)
###### Permite a un objeto cliente tratar de manera idéntica a componentes individuales y compuestos
##### Flyweight (Peso Mosca)
###### Sugiere separar todos los datos comunes a varios objetos, en un objeto separado denominado objeto Flyweight
###### Elimina la necesidad de almacenar la misma información invariante en todos los objetos
### De comportamiento
#### Están relacionados con los algoritmos y con la asignación de responsabilidades entre los objetos
#### No solo describen los patrones de clases y objetos, sino también de cómo estos se comunican.
#### Pueden ser de diferentes tipos
##### Iterator
###### Permite a los objetos clientes acceder al contenido a una colección de objetos de manera que se pueda iterar sin conocer la estructura interna en la que se organizan
##### Visitor (Visitante)
###### Útil para diseñar una operación a través de una colección heterogénea de objetos de una jerarquía de clases, sin modificar las clases sobre las que opera
##### Command (Comando)
###### Se permite encapsular órdenes de tal forma que se independiza la clase cliente de quien reciba la solicitud a través de un invocador
###### Sugiere crear una abstracción para el procesamiento o acción a ejecutar, en respuesta a la solicitud del cliente
##### Mediator
###### Útil para diseñar una comunicación controlada y coordinada entre los grupos de objetos, eliminando la necesidad de comunicación directa entre objetos
##### Chain of Responsability (Cadena de Responsabilidad)
###### Este patrón recomienda dar a cada uno de estos objetos una oportunidad para procesar las solicitudes de manera secuencial
##### Memento
###### Útil para diseñar un mecanismo que permita capturar y guardar el estado de un objeto y regresar a su estado previo
##### Observer
###### Útil para diseñar un modelo de comunicación entre un conjunto de objetos independientes y un objeto del que dichos objetos dependen
##### Interpreter
###### Útil para interpretar una combinación de reglas gramaticales de un lenguaje
##### State
###### útil en el diseño de la estructura eficiente de una clase, donde una instancia puede tener muchos estados y exhibir diferentes comportamientos
##### Strategy
###### Útil cuando hay un conjunto de algoritmos relacionados, entre los cuales un objeto cliente necesita dinámicamente elegir uno de esos algoritmos e intercambiarlos según las necesidades
##### Null Object
###### Elimina la necesidad que tiene un cliente de verificar si el objeto devuelto es null.
##### Template Method
###### Puede ser utilizado en situaciones cuando hay un algoritmo, dónde algunos de sus pasos pueden ser implementados de múltiples maneras
##### Object Authenticator (Objeto Autenticador)
###### Permite restringir la accesibilidad de un objeto solamente a un conjunto limitado de objetos clientes, basados en sus derechos de acceso
##### Common Attribute Registry -CAR-
###### Objeto que ofrece métodos para permitir a los objetos de las aplicaciones establecer y recibir diferentes valores de atributos de manera no persistente

## Clasificación de patrones
### De diseño
#### Patrones de un nivel de abstracción alto pero a un nivel de granularidad más fino
#### Están más próximos a lo que serían las piezas concretas de la solución
#### Su uso no necesariamente se refleja en la estructura global del sistema
### De aquitectura
#### Esquemas primarios en la organización de un sistema de software
#### Especifican una serie de subsistemas y sus responsabilidades respectivas, incluyendo tácticas y estrategias arquitectónicas para organizar las relaciones existentes entre ellos
### Elementales
#### Patrones directamente involucrados en la codificación
#### Son más simples y específicos al lenguaje
#### Vienen incluidos como plantillas en los ambientes de desarrollo

## Modelo Vista Controlador (MVC)
### Consiste en tres tipos de objetos
#### Modelo
##### Es el objeto de aplicación
#### Vista
##### Es la representación del objeto en pantalla
#### Controlador
##### Define el modo en que la interfaz reacciona a la entrada del usuario
### MVC desacopla las vistas de los modelos estableciendo entre ellos un protocolo de suscripción/notificación
### Una vista debe asegurarse de que su apariencia refleja el estado del modelo
### Este enfoque permite asignar varias vistas a un modelo para ofrecer diferentes presentaciones
### También se pueden crear nuevas vistas de un modelo sin necesidad de volver a escribir este.