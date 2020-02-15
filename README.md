# 자동차 경주 게임 요구사항

## 기능 요구사항

- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.



## 분석한 요구사항

- 자동차
  - 아는것 : 진행거리, 이름
  - 하는것 : 전진
  
- 엔진

  - 아는것 : 움직이기 위한 최소 값
  - 하는것 : 움직일 수 없는지 반환

- 자동차 일급컬렉션

  - 하는것 : 전체를 움직인다.

- 우승차량 일급컬렉션

  - 하는것 : 우승차량들의 이름을 반환한다.

- 입력전달용객체
  
  - 하는것 : 
  
    1. 불필요한 공백제거,
  
    2. ',' 기준 입력값 분리
    3.  자동차로 변환
  
- 뷰 반환용 객체

- 이름
  - 아는것 : 이름값
  - 하는것 : 입력받은 이름값이 5글자가 넘는지 확인
  
- 거리

  - 아는것 : 시작 위치
  - 하는것 : 다음 위치로 변환

