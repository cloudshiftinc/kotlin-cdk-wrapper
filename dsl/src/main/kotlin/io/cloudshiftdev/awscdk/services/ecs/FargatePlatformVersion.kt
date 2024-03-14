package io.cloudshiftdev.awscdk.services.ecs

public enum class FargatePlatformVersion(
  private val cdkObject: software.amazon.awscdk.services.ecs.FargatePlatformVersion,
) {
  LATEST(software.amazon.awscdk.services.ecs.FargatePlatformVersion.LATEST),
  VERSION1_4(software.amazon.awscdk.services.ecs.FargatePlatformVersion.VERSION1_4),
  VERSION1_3(software.amazon.awscdk.services.ecs.FargatePlatformVersion.VERSION1_3),
  VERSION1_2(software.amazon.awscdk.services.ecs.FargatePlatformVersion.VERSION1_2),
  VERSION1_1(software.amazon.awscdk.services.ecs.FargatePlatformVersion.VERSION1_1),
  VERSION1_0(software.amazon.awscdk.services.ecs.FargatePlatformVersion.VERSION1_0),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FargatePlatformVersion):
        FargatePlatformVersion = when (cdkObject) {
      software.amazon.awscdk.services.ecs.FargatePlatformVersion.LATEST ->
          FargatePlatformVersion.LATEST
      software.amazon.awscdk.services.ecs.FargatePlatformVersion.VERSION1_4 ->
          FargatePlatformVersion.VERSION1_4
      software.amazon.awscdk.services.ecs.FargatePlatformVersion.VERSION1_3 ->
          FargatePlatformVersion.VERSION1_3
      software.amazon.awscdk.services.ecs.FargatePlatformVersion.VERSION1_2 ->
          FargatePlatformVersion.VERSION1_2
      software.amazon.awscdk.services.ecs.FargatePlatformVersion.VERSION1_1 ->
          FargatePlatformVersion.VERSION1_1
      software.amazon.awscdk.services.ecs.FargatePlatformVersion.VERSION1_0 ->
          FargatePlatformVersion.VERSION1_0
    }

    internal fun unwrap(wrapped: FargatePlatformVersion):
        software.amazon.awscdk.services.ecs.FargatePlatformVersion = wrapped.cdkObject
  }
}
