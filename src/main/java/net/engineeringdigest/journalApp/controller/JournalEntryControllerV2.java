package net.engineeringdigest.journalApp.controller;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/_journal")
public class JournalEntryControllerV2 {

  @Autowired
  private JournalEntryService journalEntryService;

  @GetMapping()
    public List<JournalEntry> getAll() {
      return null;
    }
    @PostMapping()
    public boolean createEntry(@RequestBody JournalEntry myEntry){
    journalEntryService.saveEntry(myEntry);
       return true;
    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable long myId){
      return null;
    }

    @DeleteMapping("id/{myId}")
    public boolean deleteJournalEntryById(@PathVariable long myId){

        return true;
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalId(@PathVariable long myId, @RequestBody JournalEntry myEntry){
return null;
    }
}
