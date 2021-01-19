package com.test.userservice.Service;

import com.test.userservice.Entity.User;
import com.test.userservice.Repository.UserRepository;
import com.test.userservice.VO.Department;
import com.test.userservice.VO.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public ResponseTemplateVO findByUserId(Long userId) {
        ResponseTemplateVO vo=new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);
        Department department= restTemplate.getForObject("http://DERPARTMENT-SERVICE/departments/"+user.getDepartmentId(),
                Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }


}
