@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

public enum class LifecycleTransition(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.LifecycleTransition,
) {
  INSTANCE_LAUNCHING(software.amazon.awscdk.services.autoscaling.LifecycleTransition.INSTANCE_LAUNCHING),
  INSTANCE_TERMINATING(software.amazon.awscdk.services.autoscaling.LifecycleTransition.INSTANCE_TERMINATING),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.LifecycleTransition):
        LifecycleTransition = when (cdkObject) {
      software.amazon.awscdk.services.autoscaling.LifecycleTransition.INSTANCE_LAUNCHING ->
          LifecycleTransition.INSTANCE_LAUNCHING
      software.amazon.awscdk.services.autoscaling.LifecycleTransition.INSTANCE_TERMINATING ->
          LifecycleTransition.INSTANCE_TERMINATING
    }

    internal fun unwrap(wrapped: LifecycleTransition):
        software.amazon.awscdk.services.autoscaling.LifecycleTransition = wrapped.cdkObject
  }
}
