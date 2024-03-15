@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

public enum class AwsLogDriverMode(
  private val cdkObject: software.amazon.awscdk.services.ecs.AwsLogDriverMode,
) {
  BLOCKING(software.amazon.awscdk.services.ecs.AwsLogDriverMode.BLOCKING),
  NON_BLOCKING(software.amazon.awscdk.services.ecs.AwsLogDriverMode.NON_BLOCKING),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AwsLogDriverMode):
        AwsLogDriverMode = when (cdkObject) {
      software.amazon.awscdk.services.ecs.AwsLogDriverMode.BLOCKING -> AwsLogDriverMode.BLOCKING
      software.amazon.awscdk.services.ecs.AwsLogDriverMode.NON_BLOCKING ->
          AwsLogDriverMode.NON_BLOCKING
    }

    internal fun unwrap(wrapped: AwsLogDriverMode):
        software.amazon.awscdk.services.ecs.AwsLogDriverMode = wrapped.cdkObject
  }
}
