@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

public enum class CpuCredits(
  private val cdkObject: software.amazon.awscdk.services.ec2.CpuCredits,
) {
  STANDARD(software.amazon.awscdk.services.ec2.CpuCredits.STANDARD),
  UNLIMITED(software.amazon.awscdk.services.ec2.CpuCredits.UNLIMITED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CpuCredits): CpuCredits = when
        (cdkObject) {
      software.amazon.awscdk.services.ec2.CpuCredits.STANDARD -> CpuCredits.STANDARD
      software.amazon.awscdk.services.ec2.CpuCredits.UNLIMITED -> CpuCredits.UNLIMITED
    }

    internal fun unwrap(wrapped: CpuCredits): software.amazon.awscdk.services.ec2.CpuCredits =
        wrapped.cdkObject
  }
}
