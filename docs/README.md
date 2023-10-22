### 구현할 기능 리스트

**기본 흐름**

- [ ]  게임 시작 시 “숫자 야구 게임을 시작합니다.” 라는 안내 문구를 출력한다.
- [ ]  컴퓨터(상대방)는 본인이 사용할, 즉 사용자가 맞혀야 하는 세 자리 숫자를 랜덤으로 부여받는다.
- [ ]  사용자는 세 자리 숫자를 입력한다.
- [ ]  사용자가 입력한 숫자에 따라 스트라이크, 볼, 낫싱을 출력하게 된다.
    - [ ]  같은 수가 같은 자리에 있으면 스트라이크를 출력한다.
    - [ ]  같은 수가 다른 자리에 있으면 볼을 출력한다.
    - [ ]  같은 수가 전혀 없으면 낫싱을 출력한다.
- [ ]  사용자가 컴퓨터의 숫자를 맞힐 때까지 3 ~ 4번째 단계를 반복한다.
- [ ]  게임이 종료되면, 종료 안내 메시지를 출력한다.
- [ ]  이후 재시작 키(1)와 종료 키(2)를 안내하는 메시지를 출력한다.
    - “3개의 숫자를 모두 맞히셨습니다! 게임 종료”
    - “게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.”
- [ ]  1을 입력하면 2번째 단계로 돌아가 게임을 재시작한다.
- [ ]  2를 입력하면 게임이 종료된다.

**예외 처리**

- [ ]  사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생시킨다.
    - 사용자는 1~9 사이의 서로 다른 수 세 자리를 입력하여야 한다. 즉, 범위 내의 숫자가 아니거나 세 자리 수가 아닌 경우 예외를 발생시킨다.


### 패키지를 나누는 기준에 대한 고민

Notion 참조 : https://ancient-mail-369.notion.site/docs-README-md-337f0de7f5574e3594fce8b1283ad608?pvs=4