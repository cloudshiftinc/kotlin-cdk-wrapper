@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

public enum class ContainerInsights(
  private val cdkObject: software.amazon.awscdk.services.ecs.ContainerInsights,
) {
  ENABLED(software.amazon.awscdk.services.ecs.ContainerInsights.ENABLED),
  DISABLED(software.amazon.awscdk.services.ecs.ContainerInsights.DISABLED),
  ENHANCED(software.amazon.awscdk.services.ecs.ContainerInsights.ENHANCED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ContainerInsights):
        ContainerInsights = when (cdkObject) {
      software.amazon.awscdk.services.ecs.ContainerInsights.ENABLED -> ContainerInsights.ENABLED
      software.amazon.awscdk.services.ecs.ContainerInsights.DISABLED -> ContainerInsights.DISABLED
      software.amazon.awscdk.services.ecs.ContainerInsights.ENHANCED -> ContainerInsights.ENHANCED
    }

    internal fun unwrap(wrapped: ContainerInsights):
        software.amazon.awscdk.services.ecs.ContainerInsights = wrapped.cdkObject
  }
}
