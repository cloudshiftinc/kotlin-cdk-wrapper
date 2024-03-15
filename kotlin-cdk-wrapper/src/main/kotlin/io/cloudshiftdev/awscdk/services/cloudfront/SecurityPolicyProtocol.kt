@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

public enum class SecurityPolicyProtocol(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol,
) {
  SSL_V3(software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.SSL_V3),
  TLS_V1(software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1),
  TLS_V1_2016(software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1_2016),
  TLS_V1_1_2016(software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1_1_2016),
  TLS_V1_2_2018(software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1_2_2018),
  TLS_V1_2_2019(software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1_2_2019),
  TLS_V1_2_2021(software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1_2_2021),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol):
        SecurityPolicyProtocol = when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.SSL_V3 ->
          SecurityPolicyProtocol.SSL_V3
      software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1 ->
          SecurityPolicyProtocol.TLS_V1
      software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1_2016 ->
          SecurityPolicyProtocol.TLS_V1_2016
      software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1_1_2016 ->
          SecurityPolicyProtocol.TLS_V1_1_2016
      software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1_2_2018 ->
          SecurityPolicyProtocol.TLS_V1_2_2018
      software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1_2_2019 ->
          SecurityPolicyProtocol.TLS_V1_2_2019
      software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol.TLS_V1_2_2021 ->
          SecurityPolicyProtocol.TLS_V1_2_2021
    }

    internal fun unwrap(wrapped: SecurityPolicyProtocol):
        software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol = wrapped.cdkObject
  }
}
