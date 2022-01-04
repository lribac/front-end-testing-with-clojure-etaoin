# front-end-testing-with-clojure-etaoin

UI automation testing framework using [Etaoin](https://github.com/igrishaev/etaoin) - a Clojure implementation of WebDriver protocol. 
The tests are performed on [cars.com](https://www.cars.com/) website. 

## Getting started

There are a few prerequisites to run the tests and see how cool etaoin is. 

### Installation on Your Machine
1. JDK (I recommend Java 11 or 16). [Here](https://docs.oracle.com/en/java/javase/17/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A) are some installation tips from Oracle.
2. [Leiningen](http://github.com/technomancy/leiningen), a build tool for Clojure
3. Drivers for each browser. More info [here](https://github.com/igrishaev/etaoin#installing-the-browser-drivers). 

### Running tests locally

Before running any tests it's recommended to run 
```
lein deps
```
to download all necessary dependencies.

The tests can be run sequentially in the following browsers: Chrome, Firefox, Safari and PhantomJS. By default, tests are run in Chrome.
To run all the tests in a specific browser run the following command in your terminal:
```
lein run chrome
```
or
```
./run-tests firefox
```

## [REPL](https://clojure.org/guides/repl/introduction)
Depending on the editor you use you can configure a REPL environment to run the tests.
In REPL you can run a single test or only the tests present in a single namespace.


## License

View the [Licence](https://github.com/igrishaev/etaoin#license)
# front-end-testing-with-clojure-etaoin
