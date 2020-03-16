## Demo Project built in Spring Boot & Kubernetes

### Installation

Makesure you got `kubectl` (v1.17) & `helm`(v3) installed in your env (Don't forget about the dot in the end)

```shell
cd kube-demo-charts && helm install kube-demo .
```

### Development Guide

#### Modules

- [x] registry: Eureka Server for service registration
- [ ] auth: Authorization & Authentication Service
- [ ] notification: Notification Service
- [ ] gateway: Zuul Gateway for Routing Service
- [ ] data: Data persistency and management
- [ ] backoffice: Content Management Service

### Coming Soon...