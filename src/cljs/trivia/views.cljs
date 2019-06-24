(ns trivia.views
  (:require [re-frame.core :refer [subscribe dispatch]]
            [reagent.core :as reagent]))

(defn login-panel []
   [:div {:class "container"}
     [:div
      [:h3 {:class "center"} "Please Log In"]
      [:form {:role "form"}
       [:div {:class "form-group"}
        [:label {:for "inputUsername"} "Username"]
        [:input {:type "text", :class "form-control", :id "inputUsername"}]]
       [:div {:class "form-group"}
        [:label {:for "inputPassword"} "Password"]
        [:input {:type "password", :class "form-control", :id "inputPassword"}]
        [:input {:type "submit",:class "btn btn-primary", :value "Log In"} ]
        ]
       ]
     [:hr]
     [:footer [:p "c Baal Software 2019"]]
     ]
    ]
  )
