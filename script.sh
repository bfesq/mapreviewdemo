mvn clean fabric8:deploy -Popenshift


 oc set env dc/MY_APP_NAME JAVA_DEBUG=true

oc rollout latest dc/MY_APP_NAME

oc port-forward MY_APP_NAME-3-1xrsp $LOCAL_PORT_NUMBER:5005

oc set env dc/MY_APP_NAME JAVA_DEBUG-

oc create configmap app-config

oc get configmap app-config -o yaml

oc env dc/my-app --from=configmap/app-config

apiVersion: v1
data:
  application.yml: |
     # This properties file should be used to initialise a ConfigMap
     greeting:
       message: "Hello %s from a ConfigMap!"


Installation & Getting Started
Building & Running Container Images - plus tips on keeping your Java Virtual Machine happy
Peering inside your container
Streaming logs
Load-balancing and service discovery
Blue/green and Canary deployments

oc import-image jboss-webserver-3/webserver31-tomcat8-openshift --from=registry.access.redhat.com --confirm 
