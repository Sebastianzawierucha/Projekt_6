# Projekt_6

Na podstawie instrukcji nr 6, zostało zrealizowane 6 zadań postawionych w tejże instrukcji. Każde zadanie jest podzielone na oddzielne programy, w pełni działające samodzielnie. Można to było zrobić w jednym programie głównym z pododawanymi klasami, ale aby zachować czytelność postanowiłem podzielić to na 6 programów.

0) JSON - (Java Script Object Notation) - lekki format wymiany danych komputerowych. Jest formatem tekstowym, bazującym na podzbiorze języka JavaScript. Jest formatem niezależnym, korzysta z niego wiele innych języków programowania niż JS. W typowych przypadkach wykorzystania, dane w formacie JSON są pobierane z serwera jako tekst, a następnie przekształcane w obiekt. Wszystkie dane są zmiennymi, a właściwości obiektów są w cudzysłowiu. Wartości mogą być typu string, double, boolean, tablicami lub obiektami. Cały kod domyślnie jest w unikodzie. 

1) W tym zadaniu wystarczyło zamienić endpoint orginalny "/greeting" na endpoint "/bye". Zmienia to sposób wpisywania parametru w przeglądarce - zamiast http://localhost:8080/greeting jest http://localhost:8080/bye

2) Dodanie kolejnego endpointa - dodany został kolejny odnośnik @RequestMapping z nowym endpointem, dodatkowo została dodana nowa klasa i podczas wywoływania endpointa tworzona jest nowa instancja klasy (w tym przypadku nową klasą jest bye).

3) Zmiana zwracanego parametru - utworzona nowa klasa Age, tworzona jest instancja klasy Age, użytkownik pod adresem w przeglądarce http://localhost:8080/age?age=xx w miejsce xx wstawia wiek w pełnej liczbie, taki też jest zwracany. W klasie Age została zmieniona zmienna - zamiast content, w celach tego zadania dodana jest zmienna int age.

4) Zwracanie trzech parametrów: znowu nowa klasa - NameAge - w której mamy już trzy zmienne - id, age i name. Endpoint w tym zadaniu - /nameage. Parametry wpisywane po endpoincie będą wyglądały tak: http://localhost:8080/nameae?age=xx&name=xx . W miejsce xx użytkownik wpisuje zmienne wiek i imie, zwracany w jsonie jest wiek i imie. W klasie greetingcontroller wymagane było dodanie kolejnego @RequestParam, aby obsługiwać dwa parametry.

5) Weryfikacja imienia - wykorzystano w tym zadaniu wstrzykiwanie zależności. Tworzona jest instancja nowej klasy check, która zawiera metodę rozróżniania czy imie jest męskie czy żeńskie. Stworzona jest też nowa klasa sex, w której zmiennymi są id oraz płeć. Przy pomocy @Autowired wstrzykiwana jest metoda klasy check, następnie użytkownik podaje parametr http://localhost:8080/check?name=xx . Podany parametr jest obsługiwany przez metodę z klasy check, zwracana jest płeć.

6) Weryfikacja wzorca - tu analogicznie jak w zad 5, wstrzykiwana jest metoda z klasy CheckPattern, weryfikująca, czy podany tekst przez użytkownika zawiera jakiś wzorzec - w tym zadaniu, po prostu słowo wzorzec. Metoda weryfikuje, czy tekst wpisany http://localhost:8080/pattern?wzorzec=xx w miejsce xx zawiera w sobie ciąg znaków "wzorzec". Jeżeli zawiera, dzięki metodzie w klasie CheckPattern zwracana jest informacja, czy zawiera, czy nie. 
