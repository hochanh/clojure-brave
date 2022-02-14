# Chapter 01: Clojure noob

## REPL

```shell
clj
```

Then on REPL

```clojure
(ns clojure_noob.core)
(-main)
```

## Build `uberjar`

```shell
clj -T:build uber
java -jar target/ch01-0.1-standalone.jar
```