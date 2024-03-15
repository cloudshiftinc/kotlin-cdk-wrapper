@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

public enum class CpuArch(
  private val cdkObject: software.amazon.awscdk.services.eks.CpuArch,
) {
  ARM_64(software.amazon.awscdk.services.eks.CpuArch.ARM_64),
  X86_64(software.amazon.awscdk.services.eks.CpuArch.X86_64),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CpuArch): CpuArch = when
        (cdkObject) {
      software.amazon.awscdk.services.eks.CpuArch.ARM_64 -> CpuArch.ARM_64
      software.amazon.awscdk.services.eks.CpuArch.X86_64 -> CpuArch.X86_64
    }

    internal fun unwrap(wrapped: CpuArch): software.amazon.awscdk.services.eks.CpuArch =
        wrapped.cdkObject
  }
}
