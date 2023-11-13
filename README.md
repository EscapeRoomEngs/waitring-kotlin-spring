# WaitRing

원격 웨이팅 앱 서비스 개발을 위한 Backend 입니다.

- DB Schema: https://www.erdcloud.com/d/Zx6Whu7YjbsWEzfXi
- API 명세서: http://localhost:8080/api-docs

## spec
- Java 11.0.11
- Spring Boot 2.7.10
- Spring Security 5.7.7
- Spring Doc 1.6.9
- Querydsl 5.0.0
- JUnit 5.8.2
- use `h2` database
- use `mapstruct 1.5.5` lib

## API Structure
- 요청 API 구조
```bash
├── header
├── params
│   ├── condition : 검색 조건
│   └── pageable : 페이징 조건
│       ├── page : 페이징 번호
│       ├── size : 페이징 크기
│       └── sort : 정렬방식
├── body
└── └── input : 요청데이터
```

- 응답 API 구조
```bash
├── header
├── body
│   ├── path : 요청 URI
│   └── status : 응답상태
│       ├── statusCd : HTTP 상태코드
│       └── statusNm : HTTP 상태코드명
│   └── result : 응답결과
│       ├── resultNm : 결과코드명
│       └── resultMsg : 결과메시지
└── └── output : 응답데이터
```

- 상태코드 정의
```bash
200 OK :  GET/DELETE(조회/삭제) 요청 성공
201 CREATED : POST/PUT(등록/수정) 요청 성공
400 BAD_REQUEST : 유효성 검증 실패, 잘못된 데이터 형식 등
401 UNAUTHORIZED : 자격 증명 실패, 아이디/비밀번호 불일치, 계정 비활성화 등
403 FORBIDDEN : 접근 권한 없음
404 NOT_FOUND : 잘못된 리소스 접근
409 CONFLICT : 클라이언트의 요청이 서버의 상태와 충돌 발생
500 INTERNAL_SERVER_ERROR : 서버 에러 발생
```

## install & setting

### [ database install & setting ]

1. All Platforms(zip, 9.5 MB) 다운: http://h2database.com/html/main.html


2. CMD에서 h2가 위치한 경로로 이동한 후 h2 서버 실행 (환경에 따라 명령어 다름!!!)
```bash
$ cd C:\h2\bin
$ h2.bat (Window)
$ ./h2.sh (Mac)
```

3. DB 파일 생성

- h2 서버가 실행되면 JDBC URL에 `jdbc:h2:~/waitring` 입력 후 연결 클릭

<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FmZFvY%2FbtqCXwf9sKe%2FleYYRflzvXCPNYVsuwQtyk%2Fimg.png" width="50%" height="50%">

- 사용자 계정 디렉토리에 DB 파일 생성된 것 확인

<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fbi602M%2FbtqCOysqzRK%2F5mdr9YgfwSW5sZ4niG9F41%2Fimg.png" width="50%" height="50%">

4. H2 DB 접속
- JDBC URL에 `jdbc:h2:tcp://localhost/~/waitring` 입력 후 연결 클릭

<img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdGc3nG%2FbtqCWL5HJ0c%2FEldXMcLoOKconiIk7STJQK%2Fimg.png" width="50%" height="50%">


### [ project install & run ]
1. 프로젝트 받기
```bash
$ git clone https://github.com/EscapeRoomEngs/waitring-kotlin-spring
```

2. Run HelpdeskApplication
- h2.bat 실행한 상태에서 프로젝트 실행해야 오류나지 않음!!!