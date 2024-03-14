package io.cloudshiftdev.awscdk.services.ecs

public enum class Scope(
  private val cdkObject: software.amazon.awscdk.services.ecs.Scope,
) {
  TASK(software.amazon.awscdk.services.ecs.Scope.TASK),
  SHARED(software.amazon.awscdk.services.ecs.Scope.SHARED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Scope): Scope = when
        (cdkObject) {
      software.amazon.awscdk.services.ecs.Scope.TASK -> Scope.TASK
      software.amazon.awscdk.services.ecs.Scope.SHARED -> Scope.SHARED
    }

    internal fun unwrap(wrapped: Scope): software.amazon.awscdk.services.ecs.Scope =
        wrapped.cdkObject
  }
}
