@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

public enum class BottlerocketEcsVariant(
  private val cdkObject: software.amazon.awscdk.services.ecs.BottlerocketEcsVariant,
) {
  AWS_ECS_1(software.amazon.awscdk.services.ecs.BottlerocketEcsVariant.AWS_ECS_1),
  AWS_ECS_1_NVIDIA(software.amazon.awscdk.services.ecs.BottlerocketEcsVariant.AWS_ECS_1_NVIDIA),
  AWS_ECS_2(software.amazon.awscdk.services.ecs.BottlerocketEcsVariant.AWS_ECS_2),
  AWS_ECS_2_NVIDIA(software.amazon.awscdk.services.ecs.BottlerocketEcsVariant.AWS_ECS_2_NVIDIA),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.BottlerocketEcsVariant):
        BottlerocketEcsVariant = when (cdkObject) {
      software.amazon.awscdk.services.ecs.BottlerocketEcsVariant.AWS_ECS_1 ->
          BottlerocketEcsVariant.AWS_ECS_1
      software.amazon.awscdk.services.ecs.BottlerocketEcsVariant.AWS_ECS_1_NVIDIA ->
          BottlerocketEcsVariant.AWS_ECS_1_NVIDIA
      software.amazon.awscdk.services.ecs.BottlerocketEcsVariant.AWS_ECS_2 ->
          BottlerocketEcsVariant.AWS_ECS_2
      software.amazon.awscdk.services.ecs.BottlerocketEcsVariant.AWS_ECS_2_NVIDIA ->
          BottlerocketEcsVariant.AWS_ECS_2_NVIDIA
    }

    internal fun unwrap(wrapped: BottlerocketEcsVariant):
        software.amazon.awscdk.services.ecs.BottlerocketEcsVariant = wrapped.cdkObject
  }
}
