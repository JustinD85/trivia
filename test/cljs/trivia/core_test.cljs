(ns trivia.core-test
  (:require [trivia.core :as sut]
            [cljs.test :as t :include-macros true]))

(t/deftest testing-clojurescript
  (t/is (= (sut/add 1 3) 4)))
