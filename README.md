Proyecto Java hecho con Micronaut

# Generador de informes

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
curl -X POST -i http://localhost:8080/v1/moderador --data '{"id":1,"nombre":"Fernando","clave":""}'
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


