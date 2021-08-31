
# 환경구성 (Environment Configuration)
Backend : java 1.8 이상
Frontend : node (14.15.1), npm (6.14.14)

## Java 설치 (Install Java)
openJDK : https://openjdk.java.net/install/

## 노드 설치 (Install Node)
node.js : https://nodejs.org/ko/
( 14.15.1 )

아래처럼 명령어를 입력하여 설치를 확인.
In command, check node installed success
> node -v

## NPM 설치 (Install npm)
> npm install npm@latest -g

아래처럼 명령어를 입력하여 설치를 확인.
In command, check npm installed success
> npm -v

## 프로젝트 가져오기 (clone project)
다운로드 (Download) : https://github.com/danbeeai/danbee-springboot-vuejs
또는 (or) 
> git clone https://github.com/danbeeai/danbee-springboot-vuejs

## Backend Gradle Build (gradle build)
build.gradle 에 따라서 build Task 실행
build/libs 폴더에 danbee-springboot-vuejs.jar 실행파일 생성

## Backend Jar 실행
> java -Dserver.port=9000 -jar danbee-springboot-vuejs.jar

## Frontend 패키지 설치 (Install package)
해당 경로로 이동
Go to project_path/src/chatui
> cd project_path/src/chatui

패키지 설치
Install package.
> npm install

## Frontend 개발서버 Run dev server
개발 서버 실행 ( Backend 서버를 실행 시킨 상태에서 개발 - 9000 port )
Start development server
> npm run dev

## Frontend 빌드 Run build
배포 파일 만들기 ( 빌드 - Backend static 으로 빌드됨 )
Build package ( make deploy file )
> npm run build

# Frontend 사용방법 (챗봇 변경) How to change
index.html 에 챗봇아이디, 이름, 이미지 변경
Change the chatbot ID, Name, Image in the file ( index.html )    

# License
Example Conde is licensed under the Apache License, Version 2.0.
See [LICENSE](LICENSE) for full license text.

```
Copyright 2018 danbee Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```


