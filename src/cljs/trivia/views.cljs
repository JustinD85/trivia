(ns trivia.views
  (:require [re-frame.core :refer [subscribe dispatch]]
            [reagent.core :as reagent]))

(defn login-input [name]
    [:div.form-group
     [:label "Username"
      [:input {:type "text"
               :on-change #(reset! name (-> % .-target .-value))}]]])

(defn login-password []
  (let [password (reagent/atom "Supa")]
    [:div.form-group
     [:label  "Password"
      [:input {:type "password"
               :on-change #(reset! password (-> % .-target .-value))}]]]))

(defn login-panel []
  (let [name (reagent/atom "")]
  [:div.container
   [:div
    [:h3.center "Please Log In"]
    [:form {:role "form"}
     (login-input name)
     (login-password)
     [:div.btn.btn-primary {:on-click #(dispatch [:login @name])} "Log In" ]]
    [:hr]
    [:footer [:p "&#9400; Baal Software 2019"]]]]))
