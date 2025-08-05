@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

public enum class AdditionalHealthCheckType(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.AdditionalHealthCheckType,
) {
  ELB(software.amazon.awscdk.services.autoscaling.AdditionalHealthCheckType.ELB),
  EBS(software.amazon.awscdk.services.autoscaling.AdditionalHealthCheckType.EBS),
  VPC_LATTICE(software.amazon.awscdk.services.autoscaling.AdditionalHealthCheckType.VPC_LATTICE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.AdditionalHealthCheckType):
        AdditionalHealthCheckType = when (cdkObject) {
      software.amazon.awscdk.services.autoscaling.AdditionalHealthCheckType.ELB ->
          AdditionalHealthCheckType.ELB
      software.amazon.awscdk.services.autoscaling.AdditionalHealthCheckType.EBS ->
          AdditionalHealthCheckType.EBS
      software.amazon.awscdk.services.autoscaling.AdditionalHealthCheckType.VPC_LATTICE ->
          AdditionalHealthCheckType.VPC_LATTICE
    }

    internal fun unwrap(wrapped: AdditionalHealthCheckType):
        software.amazon.awscdk.services.autoscaling.AdditionalHealthCheckType = wrapped.cdkObject
  }
}
