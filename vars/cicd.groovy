def gitDownload(repo)
{
    git "https://github.com/hrithik7989/${repo}.git"
}
def newBuild()
{
   sh 'mvn package'
}
