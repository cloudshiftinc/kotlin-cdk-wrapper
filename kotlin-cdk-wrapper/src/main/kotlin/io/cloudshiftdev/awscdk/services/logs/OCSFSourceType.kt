@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

public enum class OCSFSourceType(
  private val cdkObject: software.amazon.awscdk.services.logs.OCSFSourceType,
) {
  CLOUD_TRAIL(software.amazon.awscdk.services.logs.OCSFSourceType.CLOUD_TRAIL),
  ROUTE53_RESOLVER(software.amazon.awscdk.services.logs.OCSFSourceType.ROUTE53_RESOLVER),
  VPC_FLOW(software.amazon.awscdk.services.logs.OCSFSourceType.VPC_FLOW),
  EKS_AUDIT(software.amazon.awscdk.services.logs.OCSFSourceType.EKS_AUDIT),
  AWS_WAF(software.amazon.awscdk.services.logs.OCSFSourceType.AWS_WAF),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.OCSFSourceType):
        OCSFSourceType = when (cdkObject) {
      software.amazon.awscdk.services.logs.OCSFSourceType.CLOUD_TRAIL -> OCSFSourceType.CLOUD_TRAIL
      software.amazon.awscdk.services.logs.OCSFSourceType.ROUTE53_RESOLVER ->
          OCSFSourceType.ROUTE53_RESOLVER
      software.amazon.awscdk.services.logs.OCSFSourceType.VPC_FLOW -> OCSFSourceType.VPC_FLOW
      software.amazon.awscdk.services.logs.OCSFSourceType.EKS_AUDIT -> OCSFSourceType.EKS_AUDIT
      software.amazon.awscdk.services.logs.OCSFSourceType.AWS_WAF -> OCSFSourceType.AWS_WAF
    }

    internal fun unwrap(wrapped: OCSFSourceType):
        software.amazon.awscdk.services.logs.OCSFSourceType = wrapped.cdkObject
  }
}
