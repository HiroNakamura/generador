Proyecto Java hecho con Micronaut


![alt text for screen readers](https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEikHlXm4LBeYK7Vl0wmrRSE3hnI314UfSJJSEYkM1hnD-A5uJCT0QNE_O7csGwBFcD7Oc68dG1jlucp-xT6mp74_d8IhiAWL43DCqaQIXjAxssaAUG1nNpZ0_WEcO-Xvkj2v_SEY58T3cgmUFoxrh7rGnvreUyrWLXfRmHE6dSnvs_tqWeNg2U1Vlw0/s450/Sin%20t%C3%ADtulo-1.png "Esto es un texto cualquiera")

# Generador de informes
>Se trata de una aplicación web para generación de informes.

## Limpiar e instalar:
```bash
mvn clean install
```

## Ejecutar:
```bash
./mvnw mn:run
```

**Quitar banner**
```java

 public static void main(String[] args) {
    Micronaut.build(args)
                 .banner(false)
                 .start();
 }

```

**Usando CURL**
```bash
curl -X GET -i http://localhost:8080/v1/saludar
```

```bash
curl -X POST -i http://localhost:8080/v1/moderador --data '{"id":1,"nombre":"Fernando","clave":""}' -H 'Content-Type: application/json'
```

```bash
curl -X GET -i http://localhost:8080/v1/moderador/1
```

```bash
curl -X GET -i http://localhost:8080/v1/moderadores
```

```bash
curl -X PUT -i http://localhost:8080/v1/moderador/1 --data '{"id":1,"nombre":"Fernando","clave":"756454"}' -H 'Content-Type: application/json'
```

```bash
curl -X DELETE -i http://localhost:8080/v1/moderador/3
```


## Micronaut 3.8.6 Documentation
- [User Guide](https://docs.micronaut.io/3.8.6/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.8.6/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.8.6/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
- [Micronaut Projects](https://github.com/micronaut-projects)
---

## Feature http-client documentation
- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)


