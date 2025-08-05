@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

public enum class MachineType(
  private val cdkObject: software.amazon.awscdk.services.codebuild.MachineType,
) {
  GENERAL(software.amazon.awscdk.services.codebuild.MachineType.GENERAL),
  NVME(software.amazon.awscdk.services.codebuild.MachineType.NVME),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.MachineType): MachineType
        = when (cdkObject) {
      software.amazon.awscdk.services.codebuild.MachineType.GENERAL -> MachineType.GENERAL
      software.amazon.awscdk.services.codebuild.MachineType.NVME -> MachineType.NVME
    }

    internal fun unwrap(wrapped: MachineType): software.amazon.awscdk.services.codebuild.MachineType
        = wrapped.cdkObject
  }
}
