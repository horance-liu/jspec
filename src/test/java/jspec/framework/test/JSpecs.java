package jspec.framework.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static jspec.framework.JSpec.*;

import org.junit.runner.RunWith;
import jspec.framework.JSpec;

@RunWith(JSpec.class)
public class JSpecs {{
  describe("A spec", () -> {
    int foo = 1;

    it("is just a code block with a run() method", () -> {
      assertThat(foo, is(1));
    });

    describe("nested inside a second describe", () -> {
      int bar = 1;

      it("can reference both scopes as needed", () -> {
        assertThat(bar, equalTo(foo));
      });
    });

    it("can have `it`s and `describe`s in any order", () -> {
      assertThat(foo, is(1));
    });
  });
}}
