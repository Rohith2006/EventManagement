package com.example.eventmanagement.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Organiser {
    private long organiserId;
    private String name;
    private List<Event> events;
}
