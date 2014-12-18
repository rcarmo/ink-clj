(ns ink-clj.handlers.app
  (:require [ink-clj.tmpls :as tmpl]))

(defn show-landing [req]
  (tmpl/layout {:user-agent (get-in req [:headers "user-agent"])
                 :title "ink-clj"
                 :list ["list item 1"
                        "list item 2"]}))
