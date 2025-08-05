@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

public enum class HttpsPolicy(
  private val cdkObject: software.amazon.awscdk.services.ses.HttpsPolicy,
) {
  REQUIRE(software.amazon.awscdk.services.ses.HttpsPolicy.REQUIRE),
  REQUIRE_OPEN_ONLY(software.amazon.awscdk.services.ses.HttpsPolicy.REQUIRE_OPEN_ONLY),
  OPTIONAL(software.amazon.awscdk.services.ses.HttpsPolicy.OPTIONAL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.HttpsPolicy): HttpsPolicy =
        when (cdkObject) {
      software.amazon.awscdk.services.ses.HttpsPolicy.REQUIRE -> HttpsPolicy.REQUIRE
      software.amazon.awscdk.services.ses.HttpsPolicy.REQUIRE_OPEN_ONLY ->
          HttpsPolicy.REQUIRE_OPEN_ONLY
      software.amazon.awscdk.services.ses.HttpsPolicy.OPTIONAL -> HttpsPolicy.OPTIONAL
    }

    internal fun unwrap(wrapped: HttpsPolicy): software.amazon.awscdk.services.ses.HttpsPolicy =
        wrapped.cdkObject
  }
}
