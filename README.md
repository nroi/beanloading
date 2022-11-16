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
org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'myController' defined in file [/home/user/workspace/beanloading/build/classes/kotlin/main/space/xnet/beanloading/MyController.class]: Unsatisfied dependency expressed through constructor parameter 0; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'space.xnet.beanloading.MyConfig' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}
```

Also strange: if the map in `application.yml` is not empty, then it works even with the older
Spring Boot version. For example, it works if we replace the `application.yml`
file with the following:

```yml
mail:
  messages: {foo: 'bar'}
```
