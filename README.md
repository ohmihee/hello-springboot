# spring5-for-beginner

나무소리 채널(https://www.youtube.com/channel/UCtaUzBujIBjtrkqACmkM44g/)

Spring 5 for Beginner 강좌 관련 교재 및 관련 소스 자료입니다.
# hello-springboot

## spring IoC container


- 프로젝트 클론 후 maven 인식 안 되는 경우 
https://velog.io/@sirius/IntelliJ-인텔리제이에서-Maven-Project로-인식이-안될-때

### @RestController
일반적으로 view 페이지가 있는 경우에는 @Controller를 사용하고, 아니면 @RestController를 사용한다.
- @PostMapping("/");
- argument -> @RequestBody
- @GetMapping("/club/{clubId}") -> @PathVariable