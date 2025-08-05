@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

public enum class VendedLogType(
  private val cdkObject: software.amazon.awscdk.services.logs.VendedLogType,
) {
  CLOUDFRONT(software.amazon.awscdk.services.logs.VendedLogType.CLOUDFRONT),
  VPC(software.amazon.awscdk.services.logs.VendedLogType.VPC),
  WAF(software.amazon.awscdk.services.logs.VendedLogType.WAF),
  ROUTE53(software.amazon.awscdk.services.logs.VendedLogType.ROUTE53),
  POSTGRES(software.amazon.awscdk.services.logs.VendedLogType.POSTGRES),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.VendedLogType): VendedLogType
        = when (cdkObject) {
      software.amazon.awscdk.services.logs.VendedLogType.CLOUDFRONT -> VendedLogType.CLOUDFRONT
      software.amazon.awscdk.services.logs.VendedLogType.VPC -> VendedLogType.VPC
      software.amazon.awscdk.services.logs.VendedLogType.WAF -> VendedLogType.WAF
      software.amazon.awscdk.services.logs.VendedLogType.ROUTE53 -> VendedLogType.ROUTE53
      software.amazon.awscdk.services.logs.VendedLogType.POSTGRES -> VendedLogType.POSTGRES
    }

    internal fun unwrap(wrapped: VendedLogType): software.amazon.awscdk.services.logs.VendedLogType
        = wrapped.cdkObject
  }
}
