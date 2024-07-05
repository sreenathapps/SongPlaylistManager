/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here

package com.example.song;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.SongService;

@RestController
public class SongController {
    SongService songService = new SongService();

    @GetMapping("/songs") 
    public ArrayList<Song> getSongs() {
        return songService.getSongs(); 
    }
}