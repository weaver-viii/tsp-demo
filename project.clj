(defproject tsp-demo "0.1.0-SNAPSHOT"
  :description  "FIXME: add description"
  :url          "http://example.com/FIXME"
  :license      {:name  "Eclipse Public License"
                 :url   "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins      [[lein-ring "0.8.7"]]
  :main tspdemo.run
  :min-lein-version "2.0.0"
  :uberjar-name "tsp-demo-standalone.jar"
  :dependencies [[org.clojure/clojure     "1.5.1"]
                 [tsp "1.1.2-SNAPSHOT"]
                 [alandipert/interpol8 "0.0.3"]
                 [ring "1.2.0"]
                 [tailrecursion/castra    "0.1.0-SNAPSHOT"]
                 [tailrecursion/hoplon "1.1.0-SNAPSHOT"]]
  :source-paths ["src/clj"]
  :ring         {:handler tspdemo.run/app}
  :hoplon       {:cljsc-opts    {:pretty-print  false
                                 :optimizations :advanced}})
