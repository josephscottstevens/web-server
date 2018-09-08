(defproject lein-demo "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [ring/ring-devel "1.6.3"]]
  :ring {:handler sample/handler}
  :plugins [[lein-ring "0.12.1"]])
