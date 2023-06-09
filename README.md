
# Test automation project for a company [Bank of Russia](https://www.cbr.ru/)

>Bank of Russia— The Central Bank of the Russian Federation is the main issuing bank and monetary regulator of the country.

## **Content:**
____
- Technologies and tools
- Examples of automated test cases
- Build in Jenkins
- Run from terminal
- Allure report
- Integration with Allure TestOps
- Integration with Jira
- Notification in Telegram using a bot
- Examples of videos of running tests on Selenoid
____

## <a name="Technologies and Tools">**Technologies and Tools:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/logo/Allure2.svg" width="50" height="50"  alt="Allure TestOps"/></a>   
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/logo/Jira.svg" width="50" height="50"  alt="Jira"/></a>  
</p>

____
## <a name="Automated Test Case Examples">**Automated Test Case Examples:**</a>
____
- ✓ *Check main elements on RU Home page*
- ✓ *Check available languages*
- ✓ *Check EN Home title*
- ✓ *Check that default language is RU*
- ✓ *Check main elements on EN Home page*
____

## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/></a><a name="Run in Jenkins"></a>Run in [Jenkins](https://jenkins.autotests.cloud/job/Students/job/HW_Cbr_Demo_Litinskiy_v2/)</a>
____
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/Kod3ik_qa_guru_x5/"><img src="images/screen/build_jenkins.PNG" alt="Jenkins" width="950"/></a>  
</p>
____

## <img alt="Jenkins" height="25" src="images/logo/Jenkins.svg" width="25"/></a><a name="Build options in Jenkins"></a>Build options in [Jenkins](https://jenkins.autotests.cloud/job/Students/job/HW_Cbr_Demo_Litinskiy_v2/configure)</a>

____
- ✓ *SITE_BASE_URL*
- ✓ *SELENOID_URL*
- ✓ *SELENOID_LOGIN*
- ✓ *SELENOID_PASSWORD*
- ✓ *BROWSER*
- ✓ *BROWSER_SIZE*
____


## Commands to run from terminal
___
***Local launch:***
```bash  
gradle clean remote -Dsite_base_url=https://www.cbr.ru -Dselenoid_url=https://selenoid.autotests.cloud/wd/hub -Dselenoid_login_password=user1:1234 -Dselenoid_video_url=${SELENOID_VIDEO_URL} -Dbrowser=chrome:100.0 -Dbrowser_size=1920x1080
```
Running this command in the IDE terminal will run the tests remotely in Selenoid.
___
## <img alt="Allure" height="25" src="images/logo/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [report](https://jenkins.autotests.cloud/job/Students/job/HW_Cbr_Demo_Litinskiy_v2/allure/)</a>
___

### *Main report page*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/jenkins_overview.png" width="850">  
</p>  

### *Test cases*

<p align="center">  
<img title="Allure Tests" src="images/screen/allure_tests.png" width="850">  
</p>

### *Charts*

<p align="center">  
<img title="Allure Graphics" src="images/screen/allure_gr0001.PNG" width="850">  
<img title="Allure Graphics" src="images/screen/allure_gr0002.PNG" width="850">  
</p>

___

## <img alt="Allure" height="25" src="images/logo/Allure2.svg" width="25"/></a>Integration <a target="_blank" href="https://allure.autotests.cloud/project/2288/dashboards">Allure TestOps</a>
____
### *Allure TestOps Dashboard*

<p align="center">  
<img title="Allure TestOps Dashboard" src="images/screen/AllureTestOps Dashboard.PNG" width="850">  
</p>  

### *Manual test cases*

<p align="center">  
<img title="Allure Tests" src="images/screen/TCManual.PNG" width="850">  
</p>

### *Automatic test cases*

<p align="center">  
<img title="Allure TestOps Tests" src="images/screen/TCAuto.PNG" width="850">  
</p>

___

## <img alt="Allure" height="25" src="images/logo/Jira.svg" width="25"/></a> Integration with <a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-709">Jira</a>
____
<p align="center">  
<img title="Jira" src="images/screen/jira_issue.PNG" width="850">
</p>

____
## <img alt="Allure" height="25" src="images/logo/Telegram.svg" width="25"/></a> Notification in Telegram using a bot
____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/telegram.PNG" width="550">  
</p>

____
## <img alt="Selenoid" height="25" src="images/logo/Selenoid.svg" width="25"/></a> Video examples of running tests on Selenoid
<p align="center">
<img title="Selenoid Video" src="images/video/cbr.gif" width="550" height="350"  alt="video">   
</p>