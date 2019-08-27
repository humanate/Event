package com.hgy.event;

public class Event {

  private String description;
  private float probability;

  public Event(String description, float probability) throws IllegalArgumentException {
    if (probability > 1 || probability < 0) {
      throw new IllegalArgumentException("probability 参数范围[0,1]");
    }
    this.description = description;
    this.probability = probability;
  }

  public Event and(Event event) {
    return new Event("( " + this.description + " and " + event.description + " )",
        this.probability * event.probability);
  }

  public Event or(Event event) {
    return new Event("( " + this.description + " or " + event.description + " )",
        1 - (this.and(event).probability + this.not(event).probability));
  }

  public Event not(Event event) {
    return new Event("( not " + this.description + " and not " + event.description + " )",
        (1 - this.probability) * (1 - event.probability));
  }

  public String showProbability() {
    return "Event{"
        + "description='" + description + '\''
        + ", probability=" + probability
        + '}';
  }
}
