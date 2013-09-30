# Informatik 3, Uebungsserie 2

## 1. Gegeben sei ein Prozessor mit einer Taktzykluszeit von 1.25 GHz und einem CPI-Wert von 1.45 (der Prozessor verfügt über keine Pipeline). Ein Programm benötigt zur Ausführung 150‘000 Befehle.
### a) Wie lang ist die ungefähre Ausführungszeit des Programms? Lösung: (3 Punkte)
1.25 GHz = 1250000000/s => 1/1,25/10^9s=8*10^-10s=0,000 000 000 8s=8ns  
t=8ns*150000*1,45= **174ms**  
### b) Wieso ist der berechnete Wert nur ein Näherungswert? Lösung: (2 Punkte)
### c) Der Prozessor wird durch einen leistungsfähigeren Prozessor mit 0.4 ns Taktzykluszeit und einem CPI-Wert von 1.8 ersetzt. Wie lang ist nun die Ausführungszeit des Programms?
### d) Der Prozessor (von c) wird um 10% übertaktet („overclocking“). Die erzielte Leistungssteigerung beträgt in der Realität aber nur knapp 5%. Wieso?

## 2. Gegeben sei ein einfacher Prozessor ohne Pipelining mit einer Wortbreite von 2 Byte (für Daten und Befehle).
### a) Welchen Wert beinhaltet der Befehlszähler jeweils nach Ausführung der jeweiligen Befehle der folgenden Befehlssequenz (der Initialwert sei 24 048 für den ersten Befehl): Ladebefehl, Ladebefehl, Addition, unbedingter Sprung um -12, Speicherbefehl, unbedingter Sprung um +8, Addition ... ?
### b) Was sehen Sie als Informatiker sofort?

## 3. Gegeben sei ein Prozessor mit 4-stufiger Pipeline (die vier Stufen, wie in der Vorlesung angegeben) und folgender Ausschnitt einer Programm- abfolge: ..., Load, Sprung, Addition, ODER-Operation, Store, Subtraktion, Sprung, AND-Operation, 
### a) Skizzieren Sie graphisch eine (mögliche) Ausführungsabfolge, unter der Annahme, das beim 1. Sprung zu einer nicht vorhergesehenen Adresse gesprungen wird („branch prediction“ war falsch).
### b) Beschreiben Sie in Ihren Worten, was ein „pipeline flush“ bedeutet.

## 4. Eine effektive Möglichkeit der Leistungssteigerung bei Prozessoren ist Pipelining.
### a) Begründen Sie, warum eine n-stufige Pipeline nicht automatisch zu einer n-fachen Leistungssteigerung führt, selbst wenn es gelingt, die Zykluszeit auf 1/n zu reduzieren („perfekte Gleichverteilung“ der Stufen - in der Praxis eigentlich nicht realisierbar).

## 5. Gegeben sei ein Prozessor ohne Pipeline mit der „bekannten“ Befehls- abarbeitung (siehe Vorlesung) und einer Zykluszeit von 20 MHz. Ein Analyse hat ergeben, dass die einzelnen Teilschritte sehr unter- schiedliche Zeit erfordern: z. B. „Befehl laden“ ≤ 10 ns, „Register lesen“ ≤ 3 ns, „Rechenoperation durchführen“ ≤ 5 ns, „Speicherzugriff“ ≤ 20 ns und „Register schreiben“ ≤ 5 ns, ... Sie implementieren denselben Prozessor mit einer 5-stufigen Pipeline (die bisherigen Teilschritte erfordern gleich viel Zeit).

### a) Wie gross ist die Zykluszeit des neuen Prozessors?
### b) Um wie viel schneller wird nun ein Befehl maximal ausgeführt? Lösung: (3 Punkte)
### c) Um wie viel schneller wird ein Programm maximal ausgeführt?
### d) Wie könnte eine „bessere“ Pipeline-Struktur entwickelt werden?

## 6. (OPTIONAL) Recherchieren Sie die Pipelinestruktur und Kenndaten von zwei aktuellen Mikroprozessoren. Bitte Kenndaten angeben und Struktur skizieren, inkl. Quellenangabe.
