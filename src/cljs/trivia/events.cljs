(ns trivia.events
  (:require [re-frame.core :as re-frame]
            [trivia.db :as db]))

(re-frame/reg-event-db
 :login
 (fn [db [event data]]
   (.log js/console " data " data )
   db))

(re-frame/reg-event-db
 :name
 (fn [db [event data]]
   (.log js/console "Event: " event " data " data " db " db)
   (assoc db :name data) db))

(re-frame/reg-event-db
 :init-db
 (fn [db]
   (.log js/console "Init DB:" db)
   db/default-value))
