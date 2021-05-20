![](src/main/resources/static/assets/images/logo.png) :gem:

## Informacion General
- Curso: Arquitectura de Software: 2021 - 1
- Integrantes: Nikolai Bermudez - Verbo Camacho
- Profesor: Sebastian Henao Pinzon

## Roles :bell:
- Nikolai Bermudez Vega: Scrum Master
- Verbo Camacho: Developer
- Sebastian Henao Pinzon: Product Owner

## Descripción del proyecto :currency_exchange:
ECIBET es un aplicativo web para una empresa de apuestas enfocadas en el futbol ingles con una actualizacion constante de la cuota, con ganas de revolucionar la manera en que se generan las apuestas. Brindando seguridad y confianza a cada uno de nuestros clientes a la hora de que ellos realicen alguna apuesta. 

### Funcionalidades importantes :white_check_mark:
- Generar apuestas (Usuario)
- Ver apuestas en tiempo real (Usuario - Administrador)
- Estado de cuenta (Usuario - Administrador)
- Informacion total de las apuestas realizadas (Administrador)

### Manual de Usuario :lock:
[Manual](https://ecibets.gitbook.io/u/manual-de-usuario-ecibet)

## Comandos
Para compilar y correr las pruebas: ```mvn package```

Para ejecutar y utilizar el programa: ```mvn exec:java -Dexec.mainClass="Main```

Para ejecutar las pruebas: ```mvn test```

Para generar javadoc con maven: ```mvn javadoc:javadoc```

Para generar javadoc de las pruebas: ```mvn javadoc:test-javadoc```

**IMPORTANTE:** Para poder utilizar el aplicativo es necesario compilar primero el proyecto con **mvn package**.

## Despliegue Heroku :white_check_mark:
[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](http://ecibets.herokuapp.com)


## *Integracion continua en CircleCi* :white_check_mark:
[![ECIBET](https://circleci.com/gh/ECIBET/ECI-BET-PROJECT.svg?style=svg)](https://app.circleci.com/pipelines/github/ECIBET/ECI-BET-PROJECT)

## Reporte de analisis *Codacy* :white_check_mark:
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/9c5a8e845ac94857ab11ec72cb0afd78)](https://www.codacy.com/gh/ECIBET/ECI-BET-PROJECT/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=ECIBET/ECI-BET-PROJECT&amp;utm_campaign=Badge_Grade)

## Descripcion de la Metodologia :unlock:
- Planeacion (link en la imagen)

[![Taiga](https://devel.nuclex.org/logos/taiga-logo.jpg)](https://tree.taiga.io/project/verbocamacho-ecibeteci-bet-project/backlog)

## Arquitectura de Diseño
## Casos de uso
![](img/Casos_de_uso.jpg)

## Modelo Componentes 
![](img/component.png)

## Diagrama de Clases
![](img/DiagramadeClases.png)

## Diagrama de BD
![](img/DB.jpg)

## Diagrama de Despliegue
![](img/Diagramdespliegue.png)

# MockUps
## Log In
![](img/mockups/Log.jpeg)
## Inicio
![](img/mockups/Inicio.jpeg)



## Construido
[IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/) Editor de JAVA donde se puede compilar el proyecto.

[Spring](https://spring.io) Framework Spark



