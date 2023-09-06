def gitDownload(repo)
{
    git "https://github.com/hrithik7989/${repo}.git"
}
def newBuild()
{
   sh 'mvn package'
}
def newdeploy(jobname,ip,appname)
{
     sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}
def runselenium(jobname)
{
     sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
