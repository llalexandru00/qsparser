![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/llalexandru00/qsparser/maven-publish.yml?logo=github)
![GitHub](https://img.shields.io/github/license/llalexandru00/qsparser)
 [![SonarCloud Coverage](https://sonarcloud.io/api/project_badges/measure?project=llalexandru00_qsparser&metric=coverage)](https://sonarcloud.io/component_measures/metric/coverage/list?id=llalexandru00_qsparser)
 [![SonarCloud Maintainability](https://sonarcloud.io/api/project_badges/measure?project=llalexandru00_qsparser&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=llalexandru00_qsparser)
 [![SonarCloud Bugs](https://sonarcloud.io/api/project_badges/measure?project=llalexandru00_qsparser&metric=reliability_rating)](https://sonarcloud.io/component_measures/metric/reliability_rating/list?id=llalexandru00_qsparser)
 [![SonarCloud Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=llalexandru00_qsparser&metric=security_rating)](https://sonarcloud.io/component_measures/metric/security_rating/list?id=llalexandru00_qsparser)
 
QsParser is a [query-string](https://en.wikipedia.org/wiki/Query_string) parsing library for Java. Its goal is to make Java back-end applications able to parse query strings generated on a JavaScript client with [qs](https://github.com/ljharb/qs). This way, one can close the gap between the JS front-end data structures and the Java back-end representations.

## Parser
QsParser's core feature is the parsing of query-strings into internal nested representations (dictionaries, arrays, strings, etc.). The implementation is fully compatible with how [qs](https://github.com/ljharb/qs) is parsing query-strings into JS objects.

```java
QueryStringParser parser = new QueryStringParser();
Value value = parser.parse("filters[name][:eq]=John&filters[age][:ge]=18&filters[age][:le]=60");
System.out.println(value);
/* {
   filters : {
      name : {
         :eq : John
      }
      age : {
         :ge : 18
         :le : 60
      }
   }
} */
```

### Features
A parser instance can be customized to use certain parsing options:
* Allow dots as component specificator instead of square brackets
* Choose if integer-indexed structures should be parsed as arrays
* Override parsing limits for the array size, representation depth or parameter count, 
* Customize the charset and the decoder for the query string to be parsed (or use the default UTF-8 URLDecoder)
* Adapt for specific query strings in regard to the leading prefix (?) or the delimiter (&)

## Download
Download from the [GitHub Packages](https://github.com/llalexandru00/qsparser/packages/) section or depend through Maven or Gradle. 
```xml
<dependency>
  <groupId>ro.atek</groupId>
  <artifactId>qsparser</artifactId>
  <version>LATEST</version>
</dependency>
```
:warning: The packages are not uploaded to Maven Central yet.

:heavy_exclamation_mark: The packages are uploaded to [GitHub Packages](https://github.com/llalexandru00/qsparser/packages/), so you may need to add the required repository or use [jitpack](https://jitpack.io).
```xml
<repository>
   <id>github</id>
   <name>GitHub Packages</name>
   <url>https://maven.pkg.github.com/llalexandru00/qsparser</url>
</repository>
```
