http://localhost:8018/hello
http://localhost:8061/ecommerce/hello


Configure hosts file C:\Windows\System32\drivers\etc

# universalDiscoveryService
	cd  /c/UserApps3/kubernetesWorkspaces/gregqiuSpringCloudKubernetesWorkspace/universalDiscoveryService
	
	mvn package -DskipTests
	
	java -jar target/universalDiscoveryService-1.0.0.jar -Xms128m -Xmx512m -XX:MaxPermSize=128m
	
	docker build --file=Dockerfile --tag=gregqiu/universaldiscoveryservice:latest --rm=true .
	
	kubectl apply -f universal-discovery-service-deployment.yaml
	
	minikube service discovery-node-port-service --url
	
	discovery-node-port-service

# universalZuulGateway

	 cd /c/UserApps3/kubernetesWorkspaces/gregqiuSpringCloudKubernetesWorkspace/universalZuulGateway
	 
	 mvn package -DskipTests
	 
	 java -jar target/universalZuulGateway-1.0.0.jar -Xms128m -Xmx512m -XX:MaxPermSize=128m
	 
	 docker build --file=Dockerfile --tag=gregqiu/universalzuulgateway:latest --rm=true .
	 
	 kubectl apply -f universal-zuul-gateway-deployment.yaml
 
 
 	kubectl logs ${POD_NAME} ${CONTAINER_NAME}
 	
 	
 # Spring Boot Zuul - Eureka - Kubernetes
 	https://github.com/felipemeriga/Eureka-Zuul-Kubernetes
 	
 # universalEcommerce
	 cd  /c/UserApps3/kubernetesWorkspaces/gregqiuSpringCloudKubernetesWorkspace/universalEcommerce
	
	 mvn package -DskipTests
	 
	  docker build --file=Dockerfile --tag=gregqiu/universalecommerce:latest --rm=true .
	  
	   kubectl apply -f universal-ecommerce-deployment.yaml
 	
 	
 	minikube service discovery-node-port-service --url
 	
 	http://192.168.118.151:31001
 	
 	minikube service ecommerce-node-port-service --url
 	http://192.168.118.151:31003
 	
 	minikube service zuul-gateway-node-port-service --url
 	
 	http://192.168.118.151:31002/ecommerce/hello
 	
 	
 	
 	
 	
 
 
 
 

