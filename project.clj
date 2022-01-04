(defproject front-end-testing-with-clojure-etaoin "0.1.0-SNAPSHOT"
  :description "A test framework using etaoin - a Clojure implementation of WebDriver"
  :url "https://www.cars.com/"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [etaoin "0.4.6"]]
  :main front-end-testing-with-clojure-etaoin.core-test
  :repl-options {:init-ns front-end-testing-with-clojure-etaoin.core-test}
  :profiles {:dev {:aliases
                   {"run-tests"
                    ["run" "-m" "front-end-testing-with-clojure-etaoin.core-test"]}}})
