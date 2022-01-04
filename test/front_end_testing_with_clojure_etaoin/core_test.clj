(ns front-end-testing-with-clojure-etaoin.core-test
  (:gen-class)
  (:require [clojure.test :refer :all]
            [front-end-testing-with-clojure-etaoin.fixtures :refer :all]
            [front-end-testing-with-clojure-etaoin.login_test]
            [front-end-testing-with-clojure-etaoin.car-search_test]))

(defn -main ([browser-name]
             (binding [*browser-name* browser-name]
               (run-tests 'front-end-testing-with-clojure-etaoin.login_test
                          'front-end-testing-with-clojure-etaoin.car-search_test))))
