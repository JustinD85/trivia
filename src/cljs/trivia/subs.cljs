(ns trivia.subs
  (:require [re-frame.core :as re-frame]))

(re-frame/reg-sub
 :name
 (fn [db _]
   (:name db)))

(re-frame/reg-sub
 :password
 (fn [db _]
   (:password db)))
