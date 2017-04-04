(defproject ink-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main ink-clj.main
  :aot [ink-clj.main]
  :min-lein-version "2.0.0"
  :uberjar-name "standalone.jar"
  ;; :java-agents  [[com.newrelic.agent.java/newrelic-agent "3.12.0"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.cli "0.3.5"]
                 ;; [com.climate/clj-newrelic "0.2.1"]
                 ;; [com.microsoft.azure/applicationinsights-web "1.0.7"]
                 [compojure "1.5.2"]
                 [environ "1.1.0"]
                 [ring/ring-core "1.5.1"]
                 [org.clojure/data.json "0.2.6"]
                 [http-kit "2.2.0"]
                 ;; [me.raynes/fs "1.4.6"] ;; filesystem walking
                 ;; [enlive "1.1.5"]       ;; HTML parsing
                 ;; [endophile "0.1.2"]    ;; Markdown parsing
                 ;; [com.taoensso/nippy "1.1.0"]
                 ;; Redis client & message queue
                 ;; [com.taoensso/carmine "1.5.0"]
                 ;; Memoization helpers
                 ;; [org.clojure/core.memoize "0.5.6"]
                 [org.clojure/tools.logging "0.3.1"]
                 [ch.qos.logback/logback-classic "1.2.3"]
                 ;; template
                 [me.shenfeng/mustache "1.1"]])
