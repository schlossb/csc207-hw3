package edu.grinnell.csc207.username.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest
{

  @Test
  public void
    test1 ()
  {
    assertArrayEquals (new String[] { "a", "b", "c" },
                       StringUtils.splitAt ("a:b:c", ':'));
  }
    @Test
    public void
      test2 ()
    {
    assertArrayEquals (new String[] { "a", "b", "c" },
                       StringUtils.splitAt ("a b c", ' '));
    }
    @Test
    public void
      test3 ()
    {
    assertArrayEquals (new String[] { "a:b:c" },
                       StringUtils.splitAt ("a:b:c", ' '));
    }
    @Test
    public void
      test4 ()
    {
    assertArrayEquals ("one field", new String[] { "a" },
                       StringUtils.splitAt ("a", ':'));
    }
    @Test
    public void
      test5 ()
    {
    assertArrayEquals ("empty inner field", new String[] { "a", "", "c" },
                       StringUtils.splitAt ("a::c", ':'));
    }
    @Test
    public void
      test6 ()
    {
    assertArrayEquals ("leading empty field", new String[] { "", "a" },
                       StringUtils.splitAt (":a", ':'));
    }
    @Test
    public void
      test7 ()
    {
    assertArrayEquals ("trailing empty field", new String[] { "a", "" },
                       StringUtils.splitAt ("a:", ':'));
    }
  }


