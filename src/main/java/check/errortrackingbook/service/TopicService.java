package check.errortrackingbook.service;

import check.errortrackingbook.pojo.TopicEntity;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

public interface TopicService extends IService<TopicEntity> {

  public IPage<TopicEntity> getTopicsByType(String type,Integer page) ;

  public IPage<TopicEntity> getTopicsPage(int currentPage);

}
