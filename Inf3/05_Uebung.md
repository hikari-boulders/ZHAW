***Seraya Takahashi, Paolo De Giglio***

# Informatik 3, Uebungsserie 5

## Side Notes
### Links

## 1. Ein Cache eines Prozessors kann die notwenige Bearbeitungszeit für ein Programm erheblich reduzieren
### a) Welche Eigenschaften von Programmen (und Datenstrukturen) nutzt dabei ein Cache aus?
### b) Geben Sie je zwei Programmbeispiele an, die die Effizienz eines Caches unterstützen bzw. nicht unterstützen?

## 2. Betrachtet werden zwei Prozessoren mit einer Zykluszeit von 2 ns: ein Prozessor Pa ohne Cache und ein Prozessor Pb mit Cache. Für ein Programm wird bei jedem 3. Befehl auf den Speicher zugegriffen. Die Zugriffszeit auf ein Datum im Arbeitsspeicher beträgt die 50 ns, die CPI für die anderen Befehle 2.5.
### a) In welcher Zeit wird ein Befehl des Programms mit dem Prozessor Pa durchschnittlich bearbeitet? (näherungsweise)
### b) In welcher Zeit wird ein Befehl des Programms mit dem Prozessor Pb durchschnittlich bearbeitet, wenn folgendes gilt: Rhit = 96%, thit = 2 ns thit =2nsundtmiss =70ns?
### c) Um wie viel % steigert der Cache des Prozessor Pb die Rechen- leistung?

## 3. Gegeben sei ein Rechner mit 28 Byte Arbeitsspeicher und einem 16-Byte grossem direktabbildenden Cache (Blockgrösse 2 Wörter; Wortgrösse 1 Byte).
### a) Geben Sie an, welche Byte (bzw. Blöcke) des Arbeitsspeicher auf welche Position im Cache abgebildet werden.
### b) Während eines Programmablaufs kommt es zum Zugriff auf folgende Byte im Arbeitsspeicher (in dieser Reihenfolge):
... 3, 4, 5, 6, 100, 101, 2, 3, 4, 5, 6, 51, 102, 105, 5, 6, ...
(Annahme: Cache ist leer)
- GebenSiean,wannwelcherBlockindenCacheübertragenwird
- Wiehäufigmussaufden(langsameren)Arbeitsspeicherzuge- griffen werden, wie häufig reicht der Zugriff auf den Cache aus?
### c) Nun wird der Cache durch einen 2-fach satzassoziativen Cache ersetzt. Geben sie für die ansonsten gleichen unter b) gegeben Bedingungen an,
- wannwelcherBlockindenCacheübertragenwirdund
- wiehäufigaufden(langsameren)Arbeitsspeicherzugegriffen
werden muss, bzw. wie häufig der Zugriff auf den Cache ausreicht?

## 4. Gegeben sei für einen Rechner der unten dargestellte direktabbildende Cache.
![](05_Uebung.04.png "")
### a) Wie gross ist der Hauptspeicher des Rechners maximal?
### b) Wie gross ist ein Wort und wie gross ein Block im Cache?
### c) Wie gross ist der Cache (in Byte)?
### d) Wie lautet der Index und der Tag für den Speicher mit der Adresse 01 42 1F F0 (MSb und MSB je links)?
### e) Tragen Sie in der Abbildung ein, wo die Speicher mit der Adresse 01 42 1F F0 und 23 77 18 27 im Cache abgebildet werden?
