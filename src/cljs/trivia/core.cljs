(ns trivia.core
  (:require [reagent.core :as reagent]
            [trivia.views :as views]
            [trivia.events :as events]
            [trivia.subs :as subs]
            [re-frame.core :as re-frame]))

(defn add [x, y]
  (+ x y))

(defn mount-root []
  (reagent/render (views/login-panel)
                  (.getElementById js/document "app")))

(defn ^:export init []
  (re-frame/dispatch-sync [:init-db])
  (mount-root))
