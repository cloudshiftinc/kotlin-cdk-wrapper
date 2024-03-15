@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

public enum class EcsMachineImageType(
  private val cdkObject: software.amazon.awscdk.services.batch.EcsMachineImageType,
) {
  ECS_AL2(software.amazon.awscdk.services.batch.EcsMachineImageType.ECS_AL2),
  ECS_AL2_NVIDIA(software.amazon.awscdk.services.batch.EcsMachineImageType.ECS_AL2_NVIDIA),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EcsMachineImageType):
        EcsMachineImageType = when (cdkObject) {
      software.amazon.awscdk.services.batch.EcsMachineImageType.ECS_AL2 ->
          EcsMachineImageType.ECS_AL2
      software.amazon.awscdk.services.batch.EcsMachineImageType.ECS_AL2_NVIDIA ->
          EcsMachineImageType.ECS_AL2_NVIDIA
    }

    internal fun unwrap(wrapped: EcsMachineImageType):
        software.amazon.awscdk.services.batch.EcsMachineImageType = wrapped.cdkObject
  }
}
