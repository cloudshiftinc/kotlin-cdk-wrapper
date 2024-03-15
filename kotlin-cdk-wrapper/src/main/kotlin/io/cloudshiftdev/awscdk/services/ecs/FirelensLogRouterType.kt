@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

public enum class FirelensLogRouterType(
  private val cdkObject: software.amazon.awscdk.services.ecs.FirelensLogRouterType,
) {
  FLUENTBIT(software.amazon.awscdk.services.ecs.FirelensLogRouterType.FLUENTBIT),
  FLUENTD(software.amazon.awscdk.services.ecs.FirelensLogRouterType.FLUENTD),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FirelensLogRouterType):
        FirelensLogRouterType = when (cdkObject) {
      software.amazon.awscdk.services.ecs.FirelensLogRouterType.FLUENTBIT ->
          FirelensLogRouterType.FLUENTBIT
      software.amazon.awscdk.services.ecs.FirelensLogRouterType.FLUENTD ->
          FirelensLogRouterType.FLUENTD
    }

    internal fun unwrap(wrapped: FirelensLogRouterType):
        software.amazon.awscdk.services.ecs.FirelensLogRouterType = wrapped.cdkObject
  }
}
