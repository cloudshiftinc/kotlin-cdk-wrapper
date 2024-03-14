package io.cloudshiftdev.awscdk.services.ecs

public enum class WindowsOptimizedVersion(
  private val cdkObject: software.amazon.awscdk.services.ecs.WindowsOptimizedVersion,
) {
  SERVER_2022(software.amazon.awscdk.services.ecs.WindowsOptimizedVersion.SERVER_2022),
  SERVER_2019(software.amazon.awscdk.services.ecs.WindowsOptimizedVersion.SERVER_2019),
  SERVER_2016(software.amazon.awscdk.services.ecs.WindowsOptimizedVersion.SERVER_2016),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.WindowsOptimizedVersion):
        WindowsOptimizedVersion = when (cdkObject) {
      software.amazon.awscdk.services.ecs.WindowsOptimizedVersion.SERVER_2022 ->
          WindowsOptimizedVersion.SERVER_2022
      software.amazon.awscdk.services.ecs.WindowsOptimizedVersion.SERVER_2019 ->
          WindowsOptimizedVersion.SERVER_2019
      software.amazon.awscdk.services.ecs.WindowsOptimizedVersion.SERVER_2016 ->
          WindowsOptimizedVersion.SERVER_2016
    }

    internal fun unwrap(wrapped: WindowsOptimizedVersion):
        software.amazon.awscdk.services.ecs.WindowsOptimizedVersion = wrapped.cdkObject
  }
}
