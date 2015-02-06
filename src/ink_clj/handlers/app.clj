(ns ink-clj.handlers.app
  (:use [com.climate.newrelic.trace :only [defn-traced]])
  (:require [ink-clj.tmpls :as tmpl]))

(defn-traced show-landing [req]
  (tmpl/layout {:user-agent (get-in req [:headers "user-agent"])
                 :title "ink-clj"
                 :list ["list item 1"
                        "list item 2"]}))
