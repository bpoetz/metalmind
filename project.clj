(defproject metalmind "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.flatland/protobuf "0.8.1"]
                 [clj-http "1.0.1"]]
  :plugins [[lein-protobuf "0.4.1"]]
  :main ^:skip-aot metalmind.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
