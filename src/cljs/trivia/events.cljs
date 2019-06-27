(ns trivia.events
  (:require [re-frame.core :as re-frame]))

(re-frame/reg-event-db
 :login
 (fn [db [event data]]
   (.log js/console "Event: " event " data " data " db " db)
   db))

(re-frame/reg-event-db
 :initialize-db
 (fn {}))
