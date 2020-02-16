# java-racingcar
자동차 경주 게임 미션 저장소

## 요구사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

## 필요한 기능
> 입력기능들
    + 자동차 이름들
    + 이동 횟수 입력
    + 입력 값 유효성 검사
    + 입력값 파싱
> 출력기능들
    + 게임 시작 시 안내 문구 출력 
    + 게임 진행상황 출력
    + 우승자 출력
> 게임 기능들
    + 랜덤숫자 생성
    + 입력한 게임 횟수에 따른 게임 반복
    + 규칙에 따른 전진 및 중지
    + 우승자 판별 

## 우아한테크코스 코드리뷰
* [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)