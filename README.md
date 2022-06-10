# LibraryProject ( Spring boot 개인 프로젝트 )

## 1. LibraryProject 소개
------------------------------
- LibraryProject는 **게시글 작성, 댓글 등록 및 대댓글 기능, 다중 파일 업로드 기능, 메일 인증, 회원별 권한 처리 등의 기능이 있는 게시판** 입니다.
- 게시글의 조회는 **비회원도 조회가 가능하며, 정회원만 볼 수 있고 등록할 수 있는 게시판**이 존재합니다. **회원 권한 별로 이용할 수 있는 메뉴를 차별화** 하였습니다.
- 게시글의 카테고리마다 **공지사항형 게시판, 썸네일형 게시판** 두 분류로 나누었으며, 각 게시판의 게시글마다**좋아요, 싫어요** 기능을 추가하였습니다.
- **관리자 페이지, 사용자 페이지**를 나누어, 홈페이지 관리자가 관리자 페이지에서 확실히 관리할 수 있으며, 역할이 확실할 수 있도록 나누었습니다.
- **관리자 페이지**에서는 **관리자 관리, 통합 회원 관리 및 회원가입 요청 리스트(정회원), 각 게시판별 게시글 관리**기능이 있습니다. 
- HTML 디자인은 대학 동기 디자이너에게 공유 받았습니다.

## 2. LibraryProject 제작 동기
------------------------------
- **게시판**은 모든 웹 애플리케이션의 필수이자 기본 요소라 생각하기에 제작하게 되었습니다.
- **Spring boot를 이용한 게시판**은 기본적인 스프링 프레임워크 사용법과 CRUD 기능 구현 능력을 학습하고 활용하는데 가장 적합하며, 추가 응용 및 확장 가능성 또한 많다 생각하여서 선택하게 되었습니다.
- 기본적인 생성(Create), 등록(Register), 수정(Update), 삭제(Delete) 기능에 회원 등록 및 파일 업로드 등 기능을 추가함으로써 **기본 CRUD 구현 능력을 심화하고 발전시킬 수 있다 생각하였습니다.**
- 단순히 게시판 구현이 아닌, **회원 가입, 로그인 세션 유지, 로그아웃 기능, 관리자 페이지, 회원가입 시 이메일 인증코드 구현 등(이후 추가 예정)** 을 구현한다면, 웹 애플리케이션에서 필요로 하는 기능을 좀 더 심도있게 학습하고 내용을 경험할 수 있다 생각 하였습니다. 

## 3. 프로젝트 개발 환경 및 사용 기술
------------------------------
> ### IDE
- IntelliJ Ultimate

> ### Front-End
- JavaScript
- jQuery 3.6.0
- Day.js
- Thymeleaf

> ### Back-End
- JavaSE 1.8
- Spring boot 2.7.0
- Gradle 7.4.1
- Lombok 1.18.22
- MySQL 8.0.28 (With. MyBatis Framework)
- JPA
- QueryDSL 5.0.0
- HikariCP 4.0.3
- Tomcat 8.5
- Spring Security
- TICA
- lucy xss filter ( Cross Site Scripting 방지 )

## 4. 프로젝트 제작 기간 (2022/04/04 ~ 2022/06/03) 총 9주간 실제 작업기간 : 44일
-------------------------------

> #### 1주차 (2022/04/04~2022/04/10, 게시판, 게시글 기능 마무리를 목표로!) 
- 04/04 개발 환경 설정 및 프로젝트 기획 및 설계. Library Project DB 생성 및 게시판 영속 및 비즈니스 계층 CRUD 작업  
- 04/04 전달받은 HTML 템플릿의 HTML/CSS를 프로젝트에 맞게 수정하고, 자주 사용하게 될 함수들을 공통 함수로 만드는 작업
- 04/05 JPA, QueryDSL을 이용한 게시판 페이징 처리 및 검색 기능 구현, 좋아요 싫어요 구현을 위한 DB 테이블 수정
- 04/05 공지사항형 게시판, 썸네일형 게시판(공지사항형 게시판 4개, 썸네일형 게시판 4개 총 8개), 작성(수정) 페이지, 상세정보 페이지 병합 (더욱 편리한 유지보수를 위해)
- 04/06 게시판 파일 업로드 & 다중 파일 업로드 구현, 게시글 좋아요 싫어요, 게시글 썸네일 작업
- 04/07~04/08 댓글 기능 서비스 계층 작업, 댓글 페이징 구현
- 04/10 게시판 통합검색 작업, 사용자 인덱스 페이지 구현
> #### 2주차 (2022/04/11~2022/04/17, 관리자 페이지 마무리를 목표로!) 
- 04/13 관리자 페이지 작업(메뉴 리스트는 하드코딩으로 작업)
- 04/14 관리자 등록 페이지 Back, Front CRUD 작업, 로그인 쿠키 & 관리자 세션관리 적용, Spring Security PasswordEncoder 적용
- 04/15 관리자 페이지 일반&정회원 회원관리, 정회원 가입 요청관리 페이지 추가, 게시판 & 게시글 리스트, 검색 작업
- 04/16 관리자 페이지 정회원 소개 페이지, 공지사항 작성 페이지 구현
- 04/17 관리자 페이지 게시글 대표 이미지 업로드, 다중 파일 업로드 구현
> #### 3주차 (2022/04/18~2022/04/24, 사용자 회원가입, 로그인 쿠키 & 세션 관리 마무리를 목표로!) 
- 04/18 사용자 일반회원 & 정회원 구분 작업, 프로필 이미지 업로드 작업
- 04/19 사용자 세션관리 & 쿠키를 이용한 조회 수 증가 적용 작업
- 04/20 파일 업로드 경로를 불러와 사용자 프로필 이미지 가져오기 구현
- 04/21 Back - 사용자 세션 값 조회 작업
- 04/22 Front - Thymeleaf로 세션값을 가져온 후 비교하여 게시글, 댓글 수정&삭제 권한 부여
- 04/24 사용자 마이페이지 구현
> #### 4주차 (2022/04/25~2022/05/02) 
- 04/25 사용자 회원가입 Spring Security PasswordEncoder 적용
- 04/26~04/28 정회원 회원가입 시 해당 사용자 이메일로 전송하는 기능 작업, 회원가입 인증버튼 클릭 시 DB상에 저장된 토큰 값을 비교하여 이메일 인증 구현
- 04/29 회원가입, 마이페이지에서 이미지를 업로드 했을 경우, 이미지 미리보기를 보여주는 작업
> #### 5주차 (2022/05/03~2022/05/09)
- 05/04 썸네일형 게시판 이미지 미리보기 구현
- 05/06 파일 저장 위치 OS별로 구분
- 05/07~ 05/08 페이지(사용자, 관리자)별 로그인 세션 저장위치 변경
- 05/09 프로젝트 패키지 구조 변경
> #### 6주차 (2022/05/10 ~ 2022/05/16)
- 05/10 ENUM 클래스를 추가하여 Y || N 이 아닌 데이터는 들어올 수 없게 변경 후 JPA에 적용하기 위해 Converter Controller 작성
- 05/11 CustomExcepiton 구현
- 05/14 응답(response) 클래스에서 entity를 리턴 타입으로 받는 것을 응답 클래스로 리턴타입 변경
- 05/15~ 05/16 JPA에서의 COUNT(CASE - WHEN - THEN)가 비정상적으로 COUNT 되는것을 확인하여 해결 방법을 찾지 못해 COUNT 쿼리 부분은 mybatis로 변경
> #### 7주차 (2022/05/17 ~ 2022/05/23)
- 05/17 자바 공부를 하며 문자열 비교는 연산자 부호를 사용하지 않는 것이 좋다는 말을 듣고 문자열 비교를 전부 equlas로 변경
- 05/18~ 05/21 파일 업로드 부분을 전역 변수로 두었던 부분, 삭제 처리를 데이터 속성으로 했던 부분을 익명 함수로 변경
- 05/23 공통으로 쓰이는 함수를 스크립트 파일 내(script-handler.js)공통 함수로 이동하여 코드 간결화
> #### 8주차 (2022/05/24 ~ 2022/05/30)
- 05/24 전체 테이블에서 공통으로 쓰이는 컬럼을 따로 Entity(BaseEntity.class)를 두어 상속받는 형식으로 변경
- 05/26 페이징, 검색 조건을 파라미터로 받는 변수들을 하나의 클래스로 묶어 간결화
- 05/27 댓글 테이블 구성 변경, 대댓글 CRUD 구현, 댓글 수정 방식 변경<br>
  (before - 댓글 등록할때의 textarea에 수정할 댓글 내용 innerHTML / after - 새로운 textarea생성)
- 05/30 Front-end 리팩토링
> #### 9주차 (2022/05/31 ~ 2022/06/03)
- 06/02~ 06/03 Back-end 리팩토링

## 5. Entity Relationship Diagram
-------------------------------
- ERD 다이어그램 모델링 툴은 ERDCloud를 사용하였습니다.

![ERD](https://user-images.githubusercontent.com/54883318/171990402-5519d893-e44a-4687-8c5e-ea3240cfe3f3.PNG)

## 6. Package layer
-------------------------------
<table>
  <tr>
    <h4>1-1 : 전체 패키지 구조 <br>
    <h4>1-2 : domain을 제외한 java directory <br>
    <h4>2-1 : domain direcotry 내의 attach(파일), board(게시판), comment(댓글), entity(공통entity) directory <br>
    <h4>2-2 : domain directory 내의 like(좋아요 & 싫어요), mail(메일), member(회원), menu(대메뉴, 소메뉴), regularmember(정회원) directory <br>
    <h4>3-1 : menu directory 내의 main, sub directory layer
    <h4>3-2 : resources directory 구조
    <td>
      1-1
      <image src="https://user-images.githubusercontent.com/54883318/172999597-882bcefe-4a35-4455-a728-f309bb69c84c.png" style="width:450px;display:inline-block;"/>
      1-2
      <image src="https://user-images.githubusercontent.com/54883318/172999601-7c30e150-5537-482f-82eb-b4f3b169c427.png" style="width:450px;display:inline-block;"/>
    </td>
  </tr>
  <tr>
    <td>
      2-1
      <image src="https://user-images.githubusercontent.com/54883318/172999603-8717d233-e27b-477d-9ea9-c208cfdbd98f.png" style="width:450px;display:inline-block;"/>
      2-2
      <image src="https://user-images.githubusercontent.com/54883318/172999606-10430483-0d59-4eb9-804e-22391b74206f.PNG" style="width:450px;display:inline-block;"/>
    </td>
  </tr>
   <tr>
    <td>
      3-1
      <image src="https://user-images.githubusercontent.com/54883318/172999607-6773decf-fe14-4a83-926b-e21710b7721d.PNG" style="width:450px;display:inline-block;"/>
      3-2
      <image src="https://user-images.githubusercontent.com/54883318/172999609-03e6b051-90cb-433e-a0bb-fe13d093f239.PNG" style="width:450px;display:inline-block;"/>
    </td>
  </tr>
</table>
