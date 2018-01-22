package anderson.controller;

import anderson.domain.Author;
import anderson.repository.AuthorRepository;
import com.querydsl.core.types.Predicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    Iterable<Author> findAuthor(@QuerydslPredicate(root = Author.class) Predicate predicate) {
        return authorRepository.findAll(predicate);
    }
}