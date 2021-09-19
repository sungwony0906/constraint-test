# 테스트 과제

* 주문 정보를 전체 조회하고 주문정보를 조회하는 기능이 구현되어있습니다.
* 해당 기능에 대해 @SpringBootTest를 이용히여 테스트 케이스를 작성해주세요.
  * OrderInfoServiceTest는 BasicDbTest를 상속받았는데, 이미 BasicDbTest에 임베디드 Mysql 설정 및 @SpringBootTest이 완료되어 있습니다.
  * V1__create_all_table.sql를 보시면, 테이블 생성 DDL문이 정리되어있습니다.
    * fk가 걸려있고, fk는 not null이며, 해당 제약조건은 제거할 수 없습니다.
  * 앞으로 주문 저장 뿐만이라 결제, 배송 등과 같은 비즈니스 로직 또한 확장되어 개발한다고 생각하시면 더 재밌는 시간이 될거 같습니다.gi