(ns ink-clj.routes
    (:use [compojure.core :only [defroutes GET POST DELETE ANY context]]
          (ring.middleware [keyword-params :only [wrap-keyword-params]]
                           [params         :only [wrap-params]]
                           [session        :only [wrap-session]])
          [ink-clj.middleware :only [wrap-failsafe wrap-request-logging-in-dev
                                     wrap-reload-in-dev JGET JPUT JPOST JDELETE]])
    (:require [ink-clj.handlers.app :as app]
              [ink-clj.handlers.api :as api]
              [compojure.route      :as route]))

(defroutes server-routes*
  (GET "/" [] app/show-landing)
  (context "/api" []
           ;; JGET returns json encoding of the response
           (JGET "/time" [] api/get-time))
  (route/files "/static")
  ;; TODO: add template for 404
  (route/not-found "<p>Page not found.</p>" ))

(defn app []
  (-> #'server-routes*
      wrap-session
      wrap-keyword-params
      wrap-params
      wrap-request-logging-in-dev
      wrap-reload-in-dev
      wrap-failsafe))
