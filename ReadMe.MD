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
kubectl delete deployment <deployment-name>
underline will be deleted pod , replicaset
```

check deployment 
```
kubectl get deployment
```

check replicaset 
```
kubectl get replicaset
```

get it into terminal 
```
kubectl exec -it <pod-id> -- ls
```

apply changes in yaml file changes 
```
kubectl apply -f my-app-k8.yaml
```

Describe the pod 
``` 
kubectl describe pod <pod-name>
```