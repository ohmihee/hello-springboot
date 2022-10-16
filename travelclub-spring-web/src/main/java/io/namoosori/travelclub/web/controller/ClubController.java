package io.namoosori.travelclub.web.controller;


@RestController
public class ClubController {
    private ClubService clubService;

    public clubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @PostMapping("/club");
    public String register(@RequestBody TravelClubDdo travelClubDdo) {
        return clubService.registerClub(travelClubDdo);
    }

    @GetMapping("/all")
    public List<TravelClub> findAll() {
        return clubService.findAll();
    }

    @GetMapping("/club/{clubId}")
    public TravelClub find(@PathVariable String clubId) {
        return clubService.findClubById(clubId);
    }

//    @GetMapping("/test")
//    public String test(){
//        return "hello spring mvc";
//    }


}
