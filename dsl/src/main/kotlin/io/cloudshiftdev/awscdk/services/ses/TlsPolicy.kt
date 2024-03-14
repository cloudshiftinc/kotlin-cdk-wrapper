package io.cloudshiftdev.awscdk.services.ses

public enum class TlsPolicy(
  private val cdkObject: software.amazon.awscdk.services.ses.TlsPolicy,
) {
  OPTIONAL(software.amazon.awscdk.services.ses.TlsPolicy.OPTIONAL),
  REQUIRE(software.amazon.awscdk.services.ses.TlsPolicy.REQUIRE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.TlsPolicy): TlsPolicy = when
        (cdkObject) {
      software.amazon.awscdk.services.ses.TlsPolicy.OPTIONAL -> TlsPolicy.OPTIONAL
      software.amazon.awscdk.services.ses.TlsPolicy.REQUIRE -> TlsPolicy.REQUIRE
    }

    internal fun unwrap(wrapped: TlsPolicy): software.amazon.awscdk.services.ses.TlsPolicy =
        wrapped.cdkObject
  }
}
