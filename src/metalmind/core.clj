(ns metalmind.core
  (:use  [flatland.protobuf.core] ) ;be sure to add :only (funcs) to end of vector
  (:require [clj-http.client :as client]))  
(def gtfrs-realtime-root-url "http://opendata.hamilton.ca/GTFS-RT/")
(def vehicle-positions-url (str gtfrs-realtime-root-url "GTFS_VehiclePositions.pb"))
(def service-alerts-url (str gtfrs-realtime-root-url "GTFS_ServiceAlerts.pb"))
(def trip-updates-url (str gtfrs-realtime-root-url "GTFS_TripUpdates.pb"))


;returns the latest feed message from a url.
;TODO: confirm it works with trip updates and service alerts
;TODO: use it to break down and store incoming data.
;TODO: add a long polling process  (I think?) to check when a new file is written to gtfrs-realtime-root-url
;TODO: dump it to datamoic

(defn get-feed-message-stream [url]
  (protobuf-load-stream 
    (protodef com.google.transit.realtime.GtfsRealtime$FeedMessage) 
      (:body (client/get url {:as :stream}))))


  
(defn -main
  [& args]) 
  
