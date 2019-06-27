(defproject trivia "0.0.1-SNAPSHOT"
  :description "A Trivia Game"
  :url "https://www.baal-software.com"

  :license {:name "GPLv3"
            :url "http://choosealicense.com/licenses/gpl-3.0/#"}

  :min-lein-version "2.9.1"

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.520"]
                 [reagent "0.8.0-rc1"]
                 [figwheel-sidecar "0.5.19"]
                 [re-frame "0.10.7"]
                 [hiccup "1.0.5"]
                 [org.clojure/tools.nrepl "0.2.13"]]

  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-doo "0.1.11"]
            [lein-figwheel "0.5.19"]]

  :main ^:skip-aot trivia.core

  :target-path "target/%s"

  :source-paths ["src/clj" "src/cljs"]
  :test-paths ["test/clj"]

  :clean-targets ^{:protect false} ["resources/public/js/compiled"
                                    "target"
                                    "test/js"]

  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [
                                  [binaryage/devtools "0.8.0"]]}}

  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src/cljs"]
                        :figwheel {:on-jsload "trivia.core/mount-root"
                                   :open-urls ["http://localhost:3449/index.html"]}

                        :compiler {:main trivia.core
                                   :output-to "resources/public/js/compiled/app.js"
                                   :output-dir "resources/public/js/compiled/out"
                                   :asset-path "js/compiled/out"
                                   :source-map-timestamp true
                                   :preloads [devtools.preload]}}
                       {:id "test"
                        :source-paths ["src/cljs" "test/cljs"]
                        :compiler {:output-to "resources/public/js/compiled/test.js"
                                   :main trivia.runner
                                   :optimizations :none}}]})
