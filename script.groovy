def buildProj(){
    echo 'building the project...'
}

def testProj(){
    echo 'testing the project...'
}

def deployProj(){
    echo 'deploying the project...'
    echo "deploying version ${params.VERSION}"
}

return this