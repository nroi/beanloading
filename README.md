A minimal working example to demonstrate issues with bean loading.

## Steps to reproduce

Run:

```bash
./gradlew build
```

The test case should run successfully.

Then, open `build.gradle.kts` and change the Spring Boot dependency. Using an older version
(e.g. 2.3.12), it works on some machines only. On other machines, the following error is returned:

```
org.springframework.beans.factory.NoSuchBeanDefinitionException
```

Also strange: if the map in `application.yml` is not empty, then it works even with the older
Spring Boot version. For example, it works if we replace the `application.yml`
file with the following:

```yml
mail:
  messages: {foo: 'bar'}
```