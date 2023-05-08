;; # Welcome to Clerk!

(ns net.danielmartincraig.technic-fan-notebook
  (:require [nextjournal.clerk :as clerk]))

;; This is some Markdown.

(defn hello [s]
  (str "Hello, " s "!"))

(hello "Clerk")

(def brick-viewer
  {:transform-fn clerk/mark-presented
   :render-fn '(fn [src-path]
                 [nextjournal.clerk.render/with-dynamic-import
                  {:module "https://unpkg.com/brick-viewer?module"}
                  (fn [BrickViewer]
                    [:brick-viewer {:src src-path}])])})
 
(clerk/with-viewer brick-viewer "/_fs/src/net/danielmartincraig/example.mpd") 