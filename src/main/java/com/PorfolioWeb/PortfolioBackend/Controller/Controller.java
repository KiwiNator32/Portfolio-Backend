package com.PorfolioWeb.PortfolioBackend.Controller;

import com.PorfolioWeb.PortfolioBackend.Model.*;
import com.PorfolioWeb.PortfolioBackend.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


@RestController()
@RequestMapping("api/")
@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 3600)
public class Controller {

    @Autowired
    private IListObjectService ListServ;
    @GetMapping ("list/get")
    public List<ListObject> GetList() {
        return ListServ.GetList() ;
    }
    @PostMapping ("list/modify/new")
    public void AddToList(@RequestBody ListObject listObject ) {
        ListServ.NewObject(listObject);
    }
    @DeleteMapping ("list/modify/delete")
    public void DeleteOfList(@RequestParam Long id ) {
        ListServ.DeleteObject(id);
    }

    @Autowired
    private ICardObjectService CardServ;
    @GetMapping ("card/get")
    public List<CardObject> GetCards() {
        return CardServ.GetCards() ;
    }
    @PostMapping ("card/modify/new")
    public void AddToCards(@RequestBody CardObject CardObject ) {
        CardServ.NewObject(CardObject);
    }
    @DeleteMapping ("card/modify/delete")
    public void DeleteOfCards(@RequestParam Long id ) {
        CardServ.DeleteObject(id);
    }

    @Autowired
    private IUlListObjectService UlListServ;
    @GetMapping ("ullist/get")
    public List<UlListObject> GetUlList() {
        return UlListServ.GetList();
    }
    @PostMapping ("ullist/modify/new")
    public void AddToUlList(@RequestBody UlListObject UlListObject ) {
        UlListServ.NewObject(UlListObject);
    }
    @DeleteMapping ("ullist/modify/delete")
    public void DeleteOfUlList(@RequestParam Long id ) {
        UlListServ.DeleteObject(id);
    }

    @Autowired
    private IProjectArticleService ProArtServ;
    @GetMapping ("proart/get")
    public List<ProjectArticleObject> GetArtList() {
        return ProArtServ.GetList();
    }
    @PostMapping ("proart/modify/new")
    public void AddToArtList(@RequestBody ProjectArticleObject ProjectArticleObject ) {
        ProArtServ.NewObject(ProjectArticleObject);
    }
    @DeleteMapping ("proart/modify/delete")
    public void DeleteOfArtList(@RequestParam Long id ) {
        ProArtServ.DeleteObject(id);
    }

    @Autowired
    private IBannerObjectService BannServ;
    @GetMapping ("banner/get")
    public List<BannerObject> GetBannList() {
        return BannServ.GetList();
    }
    @PostMapping ("banner/modify/new")
    public void AddToBannList(@RequestBody BannerObject BannerObject ) {
        BannServ.NewObject(BannerObject);
    }
    @DeleteMapping ("banner/modify/delete")
    public void DeleteOfBannList(@RequestParam Long id ) {
        BannServ.DeleteObject(id);
    }

    @Autowired
    private IPersonalInfoService PersServ;



    // List<PersonalInfoObject>
    @GetMapping ("personal/get")
    public ResponseEntity<?> GetPersList() {
        return ResponseEntity.ok(PersServ.GetList());
    }

    @GetMapping("personal/getbyid/{id}")
    public Optional<PersonalInfoObject> GetPersbyid(@PathVariable Long id) {
        return PersServ.SearchObject(id);
    }
    @PostMapping ("personal/modify/new")
    public void AddToPersList(@RequestBody PersonalInfoObject obj ) {
        PersServ.NewObject(obj);
    }
    @DeleteMapping ("personal/modify/delete")
    public void DeleteOfPersList(@RequestParam Long id ) {
        PersServ.DeleteObject(id);
    }
}
