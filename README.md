# testy zrobić porządne
1. wywalić zależność na bazę danych w testach 
2. zamockować ją jakimś projektem springowym albo test containers
3. nigdy nie używaj double/float do reprezentacji ceny czegokolwiek bo błędy zaokrągleń -> zawsze używaj BigDecimal
4. nigdy w kodzie nie pisz niczego po polsku; dokumentacja w readme spoko ale w kodzie nie
5. zmieniłem pakietowanie mniej więcej według reguły "ports and adapters" z ddd; poczytaj sobie więcej o tym tu: https://medium.com/@wkrzywiec/ports-adapters-architecture-on-example-19cab9e93be7
generalnie idea polega na tym że masz 4 główne pakiety w aplikacji:
##### 1. api - kontrolery, exceptiony, dto
##### 2. domain - cała twoja domena którą modelujesz, wszystkie obiekty które wystepują w twoich procesach biznesowych 
##### 3. adapters - wszystkie klasy które służą do integracji z innymi komponentami systemu np. bazy danych, kolejki, strzały do innych serwisów
##### 4. infrastructure - głównie klasy konfiguracyjne u ciebie dobrym przykładem jest SwaggerConfiguration

6. poczytaj sobie o DDD trochę ale postaraj się znaleźć jakieś artykuły dla początkujących które wyjaśniają to od 0
7. trzeba trochę urozmaicić logikę tej aplikacji - póki co tam nie ma żadnych ifów a fajnie by było jakby ta aplikacja jakoś działała różnie w zależności od danych na wejściu
8. w kodzie powinny być przede wszystim dwa rodzaje testów - testy jednostkowe (uruchamiasz je bez podnoszenia kontekstu, tylko na mockach np. z biblioteki mockito, najpopularniejsza biblioteka do testów jednostkowych to junit) i testy integracyjne w których podnosisz pełny kontekst ale mockujesz wszystkie integracje (kolejki, bazy danych, inne serwisy) jakimiś innymi komponentami
w twoim przypadku jedyną integracją jest baza mysql. tutaj jest to całkiem spoko opisane: https://stackoverflow.com/questions/35707469/how-can-i-mock-db-connection-in-spring-boot-for-testing-purpose
generalnie polega do na tym żeby podczas działania testu nie uderzać do żadnej stojącej bazy tylko uruchomić sobie jakąś bazę w pamięci i na niej testować logikę - dzięki temu możesz takie testy uruchomić na dowolnej maszynie, w tym takiej na której nie masz internetu a w szczególności działającej bazy danych; dobrą praktyką jest uniezależnianie testów od świata zewnętrznego spoza serwisu
8. ja bym raczej zrezygnował ze wszystkiego poza petami i akcesoriami (akcesoriów nie zrefaktorowałem, jak uważasz że warto je zostawić to zrefaktoruj żeby było spójnie tak jak pety) bo takie rzeczy jak autoryzacja w api to się opędza gotowymi projektami np. keycloak (zbyt skomplikowane) albo spring-security (dużo prostsze)
