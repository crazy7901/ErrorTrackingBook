package check.errortrackingbook.service;

import check.errortrackingbook.pojo.EssentialEntity;
import check.errortrackingbook.pojo.EssentialEntity;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;

public interface EssentialService extends IService<EssentialEntity> {

  public IPage<EssentialEntity> getEssentialsByType(String type,Integer page) ;

  public IPage<EssentialEntity> getEssentialsPage(int currentPage);
}
