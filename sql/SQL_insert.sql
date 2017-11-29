use projektquiz;


# Logowanie
insert into logowanie (login, haslo, rola) values('egzaminator', 'm', 'egzaminator');

insert into logowanie (login, haslo, rola) values('maciek', 'm', 'kursant');
insert into logowanie (login, haslo, rola) values('marek', 'm', 'kursant');
insert into logowanie (login, haslo, rola) values('krzysiek', 'm', 'kursant');
insert into logowanie (login, haslo, rola) values('darek', 'm', 'kursant');

# egzaminators
insert into egzaminator(imie, nazwisko, login) values('egzaminator', 'egzaminatorowski', 'egzaminator');


# kursants
insert into kursant (imie, nazwisko, edycja, login) values('Maciej', 'Wójcik', 'edyjca_1', 'maciek');
insert into kursant (imie, nazwisko, edycja, login) values('Marek', 'Tomasik', 'edyjca_2', 'marek');
insert into kursant (imie, nazwisko, edycja, login) values('Krzysztof', 'Kozak', 'edyjca_1', 'krzysiek');
insert into kursant (imie, nazwisko, edycja, login) values('Dariusz', 'Cienias', 'edyjca_2', 'darek');

# Pytania

insert into pytania (zakres, pytanie, odp_1, odp_2, odp_3, odp_4, odp_poprawna) values ('BD', 'Pytanie do BD numer 1', 'Odp 1', 'Odp 2', 'Odp 3', 'Odp 4', 1);
insert into pytania (zakres, pytanie, odp_1, odp_2, odp_3, odp_4, odp_poprawna) values ('BD', 'Pytanie do BD numer 2', 'Odp 1', 'Odp 2', 'Odp 3', 'Odp 4', 4);
insert into pytania (zakres, pytanie, odp_1, odp_2, odp_3, odp_4, odp_poprawna) values ('BD', 'Pytanie do BD numer 3', 'Odp 1', 'Odp 2', 'Odp 3', 'Odp 4', 3);
insert into pytania (zakres, pytanie, odp_1, odp_2, odp_3, odp_4, odp_poprawna) values ('BD', 'Pytanie do BD numer 4', 'Odp 1', 'Odp 2', 'Odp 3', 'Odp 4', 2);

insert into pytania (zakres, pytanie, odp_1, odp_2, odp_3, odp_4, odp_poprawna) values ('Python', 'Pytanie do Python numer 1', 'Odp 1', 'Odp 2', 'Odp 3', 'Odp 4', 1);
insert into pytania (zakres, pytanie, odp_1, odp_2, odp_3, odp_4, odp_poprawna) values ('Python', 'Pytanie do Python numer 2', 'Odp 1', 'Odp 2', 'Odp 3', 'Odp 4', 2);
insert into pytania (zakres, pytanie, odp_1, odp_2, odp_3, odp_4, odp_poprawna) values ('Python', 'Pytanie do Python numer 3', 'Odp 1', 'Odp 2', 'Odp 3', 'Odp 4', 3);
insert into pytania (zakres, pytanie, odp_1, odp_2, odp_3, odp_4, odp_poprawna) values ('Python', 'Pytanie do Python numer 4', 'Odp 1', 'Odp 2', 'Odp 3', 'Odp 4', 4);

insert into pytania (zakres, pytanie, odp_1, odp_2, odp_3, odp_4, odp_poprawna) values ('Git', 'Pytanie do Git numer 1', 'Odp 1', 'Odp 2', 'Odp 3', 'Odp 4', 2);
insert into pytania (zakres, pytanie, odp_1, odp_2, odp_3, odp_4, odp_poprawna) values ('Git', 'Pytanie do Git numer 2', 'Odp 1', 'Odp 2', 'Odp 3', 'Odp 4', 3);
insert into pytania (zakres, pytanie, odp_1, odp_2, odp_3, odp_4, odp_poprawna) values ('Git', 'Pytanie do Git numer 3', 'Odp 1', 'Odp 2', 'Odp 3', 'Odp 4', 4);
insert into pytania (zakres, pytanie, odp_1, odp_2, odp_3, odp_4, odp_poprawna) values ('Git', 'Pytanie do Git numer 4', 'Odp 1', 'Odp 2', 'Odp 3', 'Odp 4', 1);
# zakresy: BD, Git, Python, Fe, Java, Spring
# tO DO

# Statystyki
insert into statystyki (login, nr_testu, procent_poprawnych) values('maciek', 'Test 1', 20);
insert into statystyki (login, nr_testu, procent_poprawnych) values('maciek', 'Test 2', 60);
insert into statystyki (login, nr_testu, procent_poprawnych) values('maciek', 'Test 3', 40);

insert into statystyki (login, nr_testu, procent_poprawnych) values('marek',  'Test 1' , 20);
insert into statystyki (login, nr_testu, procent_poprawnych) values('marek', 'Test 2', 60);
insert into statystyki (login, nr_testu, procent_poprawnych) values('marek', 'Test 3', 40);

insert into statystyki (login, nr_testu, procent_poprawnych) values('krzysiek',  'Test 1', 70);
insert into statystyki (login, nr_testu, procent_poprawnych) values('krzysiek', 'Test 2', 80);
insert into statystyki (login, nr_testu, procent_poprawnych) values('krzysiek', 'Test 3', 90);

insert into statystyki (login, nr_testu, procent_poprawnych) values('darek',  'Test 1', 10);
insert into statystyki (login, nr_testu, procent_poprawnych) values('darek', 'Test 2', 20);
insert into statystyki (login, nr_testu, procent_poprawnych) values('darek', 'Test 3', 30);

