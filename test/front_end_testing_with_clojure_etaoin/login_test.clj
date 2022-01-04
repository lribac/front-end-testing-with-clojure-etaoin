(ns front-end-testing-with-clojure-etaoin.login_test
  (:require [clojure.test :refer :all]
            [front-end-testing-with-clojure-etaoin.fixtures :refer :all])
  (:use etaoin.api))

(use-fixtures
 :each ;; start and stop driver for each test
 fixture-driver)

(deftest login-bad-credentials-test
  (testing "Given user lands on cars.com"
    (go *driver* "https://www.cars.com/")
    (maximize *driver*)
    (testing "When goes to Sign In page"
      (click *driver* {:content "Sign in"})
      (testing "And fills out the sign in form with wrong credentials"
        (fill-multi *driver* {:email "test@gmail.com"
                              :password "password"})
        (click *driver* {:tag :button :fn/has-text "Sign in"}))
      (testing "Then user sees an error message."
        (wait-exists *driver* {:fn/has-text "We were unable to sign you in."})
        (is (= true
               (exists? *driver*
                        {:fn/has-text "We were unable to sign you in."})))))))