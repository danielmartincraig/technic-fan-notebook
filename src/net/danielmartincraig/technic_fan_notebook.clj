;; # Technic Fan Notebook

(ns net.danielmartincraig.technic-fan-notebook
  (:require [nextjournal.clerk :as clerk]))

(def brick-viewer
  {:transform-fn clerk/mark-presented
   :render-fn '(fn [src-path]
                 [nextjournal.clerk.render/with-dynamic-import
                  {:module "https://unpkg.com/brick-viewer?module"}
                  (fn [BrickViewer]
                    [:brick-viewer {:src src-path}])])})
 
(clerk/with-viewer brick-viewer "example.mpd")  