(defproject frontend "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]

                 [org.clojure/clojurescript "0.0-2311"]
                 [com.cemerick/piggieback "0.1.3"]
                 [weasel "0.4.0-SNAPSHOT"]]

  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-ring "0.8.11"]]

  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

  :source-paths ["src/clj", "src/cljs"]

  :resource-paths ["resources", "target/cljsout"]

  :ring {:handler frontend.core/handler}

  :cljsbuild {
    :builds {
      :dev
        {:source-paths ["src/cljs"]
         :compiler     {
           :output-to     "resources/public/js/frontend.js"
           :output-dir    "resources/public/js"
           :optimizations :whitespace
           ;:source-map    "target/cljsout/public/js/frontend.js.map"
           }}}})
