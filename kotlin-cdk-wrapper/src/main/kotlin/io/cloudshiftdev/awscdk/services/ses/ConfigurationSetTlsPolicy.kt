@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

public enum class ConfigurationSetTlsPolicy(
  private val cdkObject: software.amazon.awscdk.services.ses.ConfigurationSetTlsPolicy,
) {
  REQUIRE(software.amazon.awscdk.services.ses.ConfigurationSetTlsPolicy.REQUIRE),
  OPTIONAL(software.amazon.awscdk.services.ses.ConfigurationSetTlsPolicy.OPTIONAL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ConfigurationSetTlsPolicy):
        ConfigurationSetTlsPolicy = when (cdkObject) {
      software.amazon.awscdk.services.ses.ConfigurationSetTlsPolicy.REQUIRE ->
          ConfigurationSetTlsPolicy.REQUIRE
      software.amazon.awscdk.services.ses.ConfigurationSetTlsPolicy.OPTIONAL ->
          ConfigurationSetTlsPolicy.OPTIONAL
    }

    internal fun unwrap(wrapped: ConfigurationSetTlsPolicy):
        software.amazon.awscdk.services.ses.ConfigurationSetTlsPolicy = wrapped.cdkObject
  }
}
