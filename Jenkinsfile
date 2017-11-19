node {

    checkout scm

    env.DOCKER_API_VERSION="1.23"
    
    sh "git rev-parse --short HEAD > commit-id"

    tag = readFile('commit-id').replace("\n", "").replace("\r", "")
    appName = "patient-service"
    registryHost = "minikube/"
    imageName = "${registryHost}${appName}:${tag}"
    env.BUILDIMG=imageName

    stage "Build"
    
        sh "docker build -t ${imageName} ."

    stage "Deploy"

        sh "sed 's#127.0.0.1:30400/patient-service:latest#'$BUILDIMG'#' k8s/deployment.yaml | kubectl apply -f -"
        sh "kubectl rollout status deployment/patient-service"

}