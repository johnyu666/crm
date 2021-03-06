package cn.johnyu.crm.controller;

import cn.johnyu.crm.pojo.Album;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CommonController {
    @RequestMapping(value = "/albums")
    public List<Album> findAllAlbums(){
        List albums=new ArrayList();
        for (int i = 0; i < 3; i++) {
            Album a=new Album();
            a.setId(i);
            a.setName("album"+i);
            albums.add(a);
        }

        return albums;
    }
}
