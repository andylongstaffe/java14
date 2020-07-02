# Java 14

* instanceof can now cast object to a variable eg `if (obj instanceof String s)`
* Switch expressions now standard
* Platform specific packages via `jpackage` eg pkg/dmg for MacOS.
* Event streaming for thr flight recorder (JFR)
* Non-volatile mapped byte buffers (might help certain data to be pulled from cache even after power cycle)
* Helpful NPE!??? Need option `-XX:+ShowCodeDetailsInExceptionMessages`
* Remove deprecated CMS GC, ZGC GC on Mac and Windows.


Preview:
* Records (pretty cool, gives constructors and getters for free, no setter as they're final)
* Patterns
* Text blocks (v2) uses """, 2 new escape sequences, \s for space and \ for suppress end of line

Todo:
1. Play about with JFR flight recorder stuff
