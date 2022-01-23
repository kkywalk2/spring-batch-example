### Spring Batch의 대략적인 동작을 이해하기 위한 예제

- 음력 생일봇 만들기 전에 batch와 scheduler의 동작 이해하기 위한 예제
- 특정 날짜가 되면 텔레그램의 봇에게 알림을 전송

### Spring Batch의 DB구조

![asd (1)](https://user-images.githubusercontent.com/18114747/150385046-bd3d3ea4-3fe8-4fba-8c8e-b087c4725edc.png)

- 해당 테이블은 Spring Batch 의 default 테이블, 커스텀이 가능한지는 확인해봐야 할듯
- 최소한 위의 테이블이 존재해야 동작
- 크게 JOB, JOB EXECUTION , JOB STEP EXECUTION 으로 구분
- 정의 된 BATCH_JOB_INSTANCE 가 존재하고 이를 실행하면 BATCH_JOB_EXECUTION 이 됨
- 실행 된 BATCH_JOB_EXECUTION 에 대한 Step 별 진행 정보를 BATCH_STEP_EXECUTION 에 저장하고 있는 것으로 보임
- Detail 한 부분은 하나씩 알아볼 예정