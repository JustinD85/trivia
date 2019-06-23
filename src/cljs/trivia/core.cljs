(ns trivia.core
  (:require [reagent.core :as reagent]))

(defn mount-root []
  (reagent/render [:h1 "Hello from Clojure Script!"]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (mount-root))
