package check.errortrackingbook.service.impl;

import check.errortrackingbook.mapper.EssentialMapper;
import check.errortrackingbook.pojo.EssentialEntity;
import check.errortrackingbook.pojo.EssentialEntity;
import check.errortrackingbook.service.EssentialService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class EssentialServiceImpl extends ServiceImpl<EssentialMapper, EssentialEntity> implements EssentialService {

  @Override
  public IPage<EssentialEntity> getEssentialsByType(String type, Integer currentPage) {
    QueryWrapper<EssentialEntity> queryWrapper = new QueryWrapper<>();
    Page<EssentialEntity> page = new Page<>(currentPage, 10);
    queryWrapper.like("type", type);
    return this.page(page,queryWrapper);
  }

  @Override
  public IPage<EssentialEntity> getEssentialsPage(int currentPage) {
    return null;
  }
}
