(ns trivia.views
  (:require [re-frame.core :refer [subscribe dispatch]]
            [reagent.core :as reagent]))

(defn login-panel []
  [:div.container 
   [:div
    [:h3.center "Please Log In"]
    [:form {:role "form"}
     [:div.form-group
      [:label {:for "inputUsername"} "Username"]
      [:input {:type "text" :id "inputUsername"}]
      ]
     [:div.form-group 
      [:label {:for "inputPassword"} "Password"]
      [:input {:type "password", :id "inputPassword"}]
      ]
     [:input.btn.btn-primary {:type "submit", :value "Log In"} ]
     ]
    [:hr]
    [:footer [:p " &#9400 ; Baal Software 2019"]]
    ]
   ]
  )
