(ns front-end-testing-with-clojure-etaoin.fixtures
  (:require [clojure.test :refer :all]
            [etaoin.api :refer :all]
            [etaoin.keys :as k])
  (:use etaoin.api))

(def ^:dynamic *browser-name* :chrome)

(def ^:dynamic *driver*)

(defn fixture-driver
  "Executes a test running a driver. Bounds a driver
   with the global *driver* variable."
  [f]
  (with-driver (keyword *browser-name*) {} driver
               (binding [*driver* driver]
                 (f))))