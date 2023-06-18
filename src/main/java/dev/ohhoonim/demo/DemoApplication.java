package dev.ohhoonim.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// private final PostRepository postRepository;
	// private final UserRepository userRepository;
	// private final PasswordEncoder passwordEncoder;

	// @Override
	// public void run(String... args) throws Exception {
	// 	List<Post> postList = List.of(
	// 		new Post(UUID.randomUUID(),"title1", "contents1", "", LocalDateTime.now()),
	// 		new Post(UUID.randomUUID(),"title2", "contents2", "", LocalDateTime.now()),
	// 		new Post(UUID.randomUUID(),"title3", "contents3", "", LocalDateTime.now())
	// 		);
	// 	for (Post p : postList) {
	// 		postRepository.save(p);
	// 	}

	// 	List<User> userList = List.of(
	// 		User.builder().email("matthew@ohhoonim.dev")
	// 			.password(passwordEncoder.encode("1234"))
	// 			.name("matthew")
	// 		.build()
	// 	);
	// 	userRepository.saveAll(userList);
	// }

}
