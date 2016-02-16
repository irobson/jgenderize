# jGenderize

Client for [genderize.io](https://genderize.io/) web service.

Simple Java extension to know the gender of a given first name.

What is the gender for "John" ?

```java
Genderize api = GenderizeIoAPI.create();
NameGender gender = api.getGender("John");
System.out.println("John is: "+gender.getGender());
System.out.println("is John male? " + gender.isMale());
System.out.println("Who? " + gender.getName());
```

What about "John" in Brazil? Localization support.

```java
Genderize api = GenderizeIoAPI.create();
NameGender gender = api.getGender("John", new Locale("pt", "BR"));
System.out.println("John is: "+gender.getGender());
System.out.println("is John male? " + gender.isMale());
```

Lots of names? It is sorted.

```java
Genderize api = GenderizeIoAPI.create();
List<NameGender> genders = api.getGenders("Robson", "Marlise", "Gilmar");
```

Does it works with l10n too? Sure.

```java
Genderize api = GenderizeIoAPI.create();
List<NameGender> genders = api.getGenders(new String[] {"ted", "marshall", "lilly", "robin", "barney", "melissa"}, new Locale("en", "US"));
```

Have a paid API key from [store.genderize.io](https://store.genderize.io/)? Use it.

```java
Genderize api = GenderizeIoAPI.create("your_api_key_here");
List<NameGender> genders = api.getGenders(new String[] {"ted", "marshall", "lilly", "robin", "barney", "melissa"}, new Locale("en", "US"));
```
