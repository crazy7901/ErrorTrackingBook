package check.errortrackingbook.service.impl;

import check.errortrackingbook.mapper.TopicMapper;
import check.errortrackingbook.pojo.TopicEntity;
import check.errortrackingbook.service.TopicService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicServiceImpl extends ServiceImpl<TopicMapper, TopicEntity> implements TopicService {

  @Autowired
  private TopicMapper mapper;

  @Override
  public IPage<TopicEntity> getTopicsByType(String type,Integer currentPage) {
    QueryWrapper<TopicEntity> queryWrapper = new QueryWrapper<>();
    Page<TopicEntity> page = new Page<>(currentPage, 10);
    queryWrapper.like("type", type);
    return this.page(page,queryWrapper);
  }



  @Override
  public IPage<TopicEntity> getTopicsPage(int currentPage) {
    // 创建分页对象
    Page<TopicEntity> page = new Page<>(currentPage, 10);

    // 使用 MyBatis-Plus 提供的分页查询方法
    return this.page(page, new QueryWrapper<>());
  }
}