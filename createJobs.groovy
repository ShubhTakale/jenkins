//pipelineJob('pipelineJob') {
//    definition {
//        cps {
//            script(readFileFromWorkspace('pipelineJob.groovy'))
//            sandbox()
//        }
//    }
//}

//pipelineJob('theme-park-job') {
//    definition {
//        cpsScm {
//            scm {
//                git {
//                    remote {
//                        url 'https://github.com/ShubhTakale/theme-park-app.git'
//                    }
//                    branch 'main' +
//                            ''
//                }
//            }
//        }
//    }
//}

pipelineJob('theme-park-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/ShubhTakale/theme-park-app.git'
                    }
                    branch 'main'
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}