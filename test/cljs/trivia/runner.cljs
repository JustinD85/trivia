(ns trivia.runner
  (:require  [cljs.test :as t :include-macros true]
             [trivia.core-test]
             [doo.runner :refer-macros [doo-tests]]))

(doo-tests 'trivia.core-test)
