# Kubernetes

## Basic Command
```
kubectl get nodes
```

get services 
```
kubectl get service
```

## Create k8 pod
```
kubectl create -f my-app-k8.yaml
```

List down pods 
```
kubectl get pods
```

Check pod log 
```
kubectl logs <pod-name>
```

Delete pod 
```
kubectl delete deployment <pod-name>
```

check deployment 
```
kubectl get deployment
```

check replicaset 
```
kubectl get replicaset
```