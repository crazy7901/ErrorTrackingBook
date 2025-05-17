package check.errortrackingbook.controller;
import check.errortrackingbook.common.Result;
import check.errortrackingbook.pojo.EssentialEntity;
import check.errortrackingbook.pojo.TopicEntity;
import check.errortrackingbook.service.EssentialService;
import check.errortrackingbook.service.TopicService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:63342")  // 允许特定域访问

public class BaseController {

  @Autowired
  private EssentialService essentialService;  // Assuming EssentialService is defined elsewhere

  @Autowired
  private TopicService topicService;

  // --------------------------------Topics方法

  @PostMapping("/addTopic")
  public Result<String> addTopic(@RequestBody TopicEntity topicEntity) {
    topicService.save(topicEntity);  // Save the topic to the database
    // Logic to add a new topic
    return Result.success("\"Topic added successfully\"") ;
  }

  @PostMapping("/updateTopic")
  public Result<String> updateTopic(@RequestBody TopicEntity topicEntity) {
    topicService.updateById(topicEntity);  // Update the topic in the database
    // Logic to update a topic
    return Result.success("\"Topic updated successfully\"") ;
  }

  @PostMapping("/deleteTopic")
  public Result<String> deleteTopic(@RequestBody TopicEntity topicEntity) {
    topicService.removeById(topicEntity.getId());  // Delete the topic from the database
    // Logic to delete a topic
    return Result.success("\"Topic deleted successfully\"");
  }


  @GetMapping("/getTopic/{type}/{page}")
  public Result<IPage<TopicEntity>> getTopic(@PathVariable("type") String type, @PathVariable("page") Integer page){
    // Logic to get a topic by ID
    return Result.success(topicService.getTopicsByType(type,page));
  }

  @GetMapping("/getTopic")
  public Result<IPage<TopicEntity>> getTopic(@RequestParam("page") Integer page) {
    // Logic to get a topic by ID
    return Result.success(topicService.getTopicsPage(page));
  }

  // --------------------------------Essential方法
  @PostMapping("/addEssential")
  public Result<String> addEssential(@RequestBody EssentialEntity essential) {
    essentialService.save(essential);
    return Result.success("\"Essential added successfully\"") ;
  }

  @GetMapping("/getEssential/{type}/{page}")
  public Result<IPage<EssentialEntity>> getEssential(@PathVariable("type") String type, @PathVariable("page") Integer page){
    // Logic to get a topic by ID
    return Result.success(essentialService.getEssentialsByType(type,page));
  }

    @GetMapping("/getEssential")
  public Result<IPage<EssentialEntity>> getEssential(@RequestParam("page") Integer page) {
    // Logic to get a topic by ID
    return Result.success(essentialService.getEssentialsPage(page));
  }



}
