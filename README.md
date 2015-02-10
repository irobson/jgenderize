# jgenderize

Client for `Genderize.io <http://genderize.io/>`_ web service.

Simple Java extension to know the gender of a given name.

You want to know a gender of "John" ?

```java
    Genderize api = GenderizeIoAPI.create();
    NameGender gender = api.getGender("John");
    System.out.println("John is: "+gender.getGender());
    System.out.println("John is male? " + gender.isMale());
    System.out.println("Who? " + gender.getName());

```
What about "John" in Brazil? Localization support.

```java
    Genderize api = GenderizeIoAPI.create();
    NameGender gender = api.getGender("John", new Locale("pt", "BR");
    System.out.println("John is: "+gender.getGender());
    System.out.println("John is male? " + gender.isMale());
