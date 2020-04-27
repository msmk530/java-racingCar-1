java-racingcar

## 요구사항 설명
1. MVC패턴 구조 유지하면서 구현
2. 자바 코드 컨벤션을 지키면서 프로그래밍
3. Indent Depth는 3을 넘지 않도록 구현
4. else 예약어 사용 금지
5. 함수의 길이가 15라인을 넘어가지 않도록 구현

![racingImage](https://user-images.githubusercontent.com/49441876/80328426-45ffc880-887a-11ea-9575-53f6128af08e.jpeg)


## 구현해야할 기능
1. 경주할 자동차 이름 입력받기
    - 조건1 : 이름은 한번에 입력받고 쉼표로 구분
    - 조건2 : 이름은 5자 이하만 가능하도록
    - 조건3 : 중복된 이름 없도록
2. 라운드 횟수 입력받기
    - 조건1 : 최소 1이상 이도록 
3. 입력받은 이름을 통해 Car객체 생성 및 Car들을 담고 있는 List생성 
    - 조건1 : 이름에 blank포함시 blank를 없애고 저장시키기
4. 라운드 별로 실행 결과 출력해주기
    - 0부터 9까지의 난수를 발생시켜서, 4이상일 경우 전진하고 3이하일 경우 정지해 있도록 로직 구현
5. 최종 우승자 알려주기
    - 전체 자동차중 가장 높은 position 값 구하기
    - 가장 높은 position값과 같은 position값을 가진 자동차들 출력
