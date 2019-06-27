(ns trivia.core
  (:require [reagent.core :as reagent]
            [trivia.views :as views]
            [trivia.events :as events]))

(defn add [x, y]
  (+ x y))

(defn mount-root []
  (reagent/render (views/login-panel)
                  (.getElementById js/document "app")))

(defn ^:export init []
  (mount-root))
