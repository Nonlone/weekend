# mapper-weekend

作者：[liuyuyu](https://github.com/liuyuyu)

# 支持 jdk 8+

## 说明

在经过作者同意后，对项目包名和 Maven 的GAV信息进行修改，将该项目打包上传到 Maven 官方仓库。

虽然这个是一个独立的项目，但是大家在使用过程中，不需要引用这个项目。

这个独立项目是以 jdk 8 进行打包的，打包后的 class 会被集成到通用 Mapper 中（主代码使用 jdk 6 编译）。

## 基于 https://github.com/abel533/Mapper 做的增强

可以在 `Example.Criteria` 的条件方法里传 lambada(再也不用担心改数据库了......)。

栗子：
```
  UserMapper    userMapper = sqlSession.getMapper(UserMapper.class);
  Weekend<User> weekend    = Weekend.of(User.class);
  weekend.weekendCriteria()
          .andIsNull(User::getId)
          .andBetween(User::getId,0,10)
          .andIn(User::getUserName, Arrays.asList("a","b","c"));
```
