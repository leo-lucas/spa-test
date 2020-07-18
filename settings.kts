version = "2020.1"

project {
    buildType(testSpa)
}

object testSpa: BuildType({
    name = "test-spa"
    id("test-spa")
    steps {
        script {
            goals = "yarn"
            dockerImage = "node"
        }
    }
    vcs {
        root(PetclinicVcs)
    }
})