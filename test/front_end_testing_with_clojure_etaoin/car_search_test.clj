(ns front-end-testing-with-clojure-etaoin.car-search_test
  (:require [clojure.test :refer :all]
            [front-end-testing-with-clojure-etaoin.fixtures :refer :all]
            [clojure.string :as str])
  (:use etaoin.api))

(use-fixtures
 :each ;; start and stop driver for each test
 fixture-driver)

(deftest tile-test
  (testing "Given user lands on cars.com"
    (go *driver* "https://www.cars.com/")
    (maximize *driver*)
    (testing "The web page title is correct"
      (is (= "New Cars, Used Cars, Car Dealers, Prices & Reviews | Cars.com"
             (get-title *driver*))))))

(deftest search-by-make-test
  (testing "Given user lands on cars.com"
    (go *driver* "https://www.cars.com/")
    (maximize *driver*)
    (testing "When user filters out a car selection"
      (doto *driver*
        (select :make-model-search-stocktype "New cars")
        (select :makes "Audi")
        (select :models "A3")
        (select :make-model-max-price "$50,000")
        (select :make-model-maximum-distance "30 miles")
        (click {:tag :button :data-linkname :search-new-make})))
    (testing "Then user gets car results"
      (let [result-matches-webelement
            (get-element-inner-html
             *driver*
             {:xpath "//div[@class='refinements-top']/span"})
            number-of-results
            (-> result-matches-webelement
                str/trim
                (str/split #" ")
                first
                Integer/parseInt)]
        (is (not= 0 number-of-results))))))

