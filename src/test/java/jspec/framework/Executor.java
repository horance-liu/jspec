package jspec.framework;

import org.junit.runner.notification.RunNotifier;

@FunctionalInterface
public interface Executor {
  void exec(RunNotifier notifier);
}