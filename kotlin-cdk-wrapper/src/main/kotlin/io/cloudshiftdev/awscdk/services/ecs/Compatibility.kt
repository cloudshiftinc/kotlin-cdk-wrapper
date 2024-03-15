@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

public enum class Compatibility(
  private val cdkObject: software.amazon.awscdk.services.ecs.Compatibility,
) {
  EC2(software.amazon.awscdk.services.ecs.Compatibility.EC2),
  FARGATE(software.amazon.awscdk.services.ecs.Compatibility.FARGATE),
  EC2_AND_FARGATE(software.amazon.awscdk.services.ecs.Compatibility.EC2_AND_FARGATE),
  EXTERNAL(software.amazon.awscdk.services.ecs.Compatibility.EXTERNAL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Compatibility): Compatibility =
        when (cdkObject) {
      software.amazon.awscdk.services.ecs.Compatibility.EC2 -> Compatibility.EC2
      software.amazon.awscdk.services.ecs.Compatibility.FARGATE -> Compatibility.FARGATE
      software.amazon.awscdk.services.ecs.Compatibility.EC2_AND_FARGATE ->
          Compatibility.EC2_AND_FARGATE
      software.amazon.awscdk.services.ecs.Compatibility.EXTERNAL -> Compatibility.EXTERNAL
    }

    internal fun unwrap(wrapped: Compatibility): software.amazon.awscdk.services.ecs.Compatibility =
        wrapped.cdkObject
  }
}
