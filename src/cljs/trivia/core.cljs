(ns trivia.core
  (:require [reagent.core :as reagent]))

(defn add [x, y]
  (+ x y))

(defn mount-root []
  (reagent/render [:h1 "Hiya, from Clojure Script!"]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (mount-root))
