package io.cloudshiftdev.awscdk.services.cloudfront

public enum class OriginSslPolicy(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.OriginSslPolicy,
) {
  SSL_V3(software.amazon.awscdk.services.cloudfront.OriginSslPolicy.SSL_V3),
  TLS_V1(software.amazon.awscdk.services.cloudfront.OriginSslPolicy.TLS_V1),
  TLS_V1_1(software.amazon.awscdk.services.cloudfront.OriginSslPolicy.TLS_V1_1),
  TLS_V1_2(software.amazon.awscdk.services.cloudfront.OriginSslPolicy.TLS_V1_2),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.OriginSslPolicy):
        OriginSslPolicy = when (cdkObject) {
      software.amazon.awscdk.services.cloudfront.OriginSslPolicy.SSL_V3 -> OriginSslPolicy.SSL_V3
      software.amazon.awscdk.services.cloudfront.OriginSslPolicy.TLS_V1 -> OriginSslPolicy.TLS_V1
      software.amazon.awscdk.services.cloudfront.OriginSslPolicy.TLS_V1_1 ->
          OriginSslPolicy.TLS_V1_1
      software.amazon.awscdk.services.cloudfront.OriginSslPolicy.TLS_V1_2 ->
          OriginSslPolicy.TLS_V1_2
    }

    internal fun unwrap(wrapped: OriginSslPolicy):
        software.amazon.awscdk.services.cloudfront.OriginSslPolicy = wrapped.cdkObject
  }
}
