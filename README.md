# murtia
A program that moves the mouse at regular intervals to prevent a screensaver from kicking in, named after the Roman goddess of laziness.

This is designed for systems where group policies prevent you from editing screensaver settings and you cannot run Powershell scripts or other programs, but where Java happens to be installed.


# How to run it

* `javac Murtia.java`
* `java Murtia`


# How to produce a jar file

* `javac Murtia.java`
* `jar cfe release.jar Murtia Murtia.class`

Then run the jar with `java -jar release.jar` 
