
### Всем привет! Я Игорь, работаю тестировщиком. В этом проекте я написал 5 простых UI тестов на сайт компании в которой работаю, для того, чтобы Вы могли сделать какие-то выводы как я пишу тесты.
 
Тесты были написаны на Java + JUnit5 + Selenide + Gradle

| Java | Gradle | Junit5 | Selenide |
|:----:|:------:|:------:|:--------:|
| <img src="images/JAVA.svg" width="40" height="40"> | <img src="images/Gradle.svg" width="40" height="40"> | <img src="images/Junit5.svg" width="40" height="40"> | <img src="images/Selenide.svg" width="40" height="40"> |

Запускаются и прогоняются через Jenkins + Selenoid

| Jenkins | Selenoid | 
|:--------:|:-------------:|
| <img src="images/Jenkins.svg" width="40" height="40"> | <img src="images/Selenoid.svg" width="40" height="40"> | 

С отчетами в Allure + Telegram
| Allure Report | Telegram |
|:---------:|:--------:|
| <img src="images/Allure.svg" width="40" height="40"> | <img src="images/Telegram.svg" width="40" height="40"> |

## Запускать тесты нам помогает Jenkins https://jenkins.autotests.cloud/job/ArSoft-Tests/


### Перед запуском можно выбрать следующие параметры:
* browser (default chrome) - Выбрать браузер
* browserVersion (default 91.0) - Выбрать версию браузера
* browserSize (default 1920x1080) - Выбрать разрешение браузера
* browserMobileView (mobile device name, for example iPhone X) - Прогнать тесты в мобильных браузерах
* remoteDriverUrl (url address from selenoid or grid) - Можно поменять путь до Selenoid
* threads (number of threads) - Выбрать количество потоков 
### Вот так выглядит страничка выбора параметров:
![страница параметров](./images/jenkinsParam.JPG "Страница параметров")

## После прохождения тестов формируется отчет Allure
### Пример отчета:
![Allure отчет](./images/allurExample.JPG "Alure отчет")

## Прогон тестов осуществляется в Selenoid https://selenoid.autotests.cloud/#/, видеозапись прогона можно посмотреть в отчете Allure
### Пример записи теста в Selenoid:
![видео прогона тестов](./images/c6c993a2bcb88485.gif "Запись прогона тестов")

## Кстати! Тесты могут "бегать" по расписанию без моего участия, отчет о их прохождении мне любезно скинет в телеграмм BOT!:
![БОТ](./images/bot.JPG "БОТ")


## Список тестов в том числе ручных можно посмотреть в Allure TestOps
![тестопс](./images/TestOPS.jpg "Тест опс")

 

### Проект можно склонировать и запустить тесты из терминала:
Запустить тесты с дефолтными параметрами:
```bash
gradle clean test
```

Запустить тесты с нужными нам параметрами:
```bash
gradle clean -DremoteDriverUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Сформировать отчет в Allure:
```bash
allure serve build/allure-results
