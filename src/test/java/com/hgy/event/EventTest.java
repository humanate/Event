package com.hgy.event;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class EventTest {

  @Test
  public void and() {
    //given
    Event event = new Event("test", 0.3f);
    //when
    Event event1 = event.and(new Event("test1", 0.2f));
    //then
    assertThat(event1).isNotNull().isInstanceOf(Event.class);
    assertThat(event1).hasFieldOrPropertyWithValue("probability", 0.3f * 0.2f);
  }

  @Test
  public void or() {
    //given

    //when

    //then
  }

  @Test
  public void not() {
    //given

    //when

    //then
  }

  @Test
  public void showProbability() {
    //given

    //when

    //then
  }
}
