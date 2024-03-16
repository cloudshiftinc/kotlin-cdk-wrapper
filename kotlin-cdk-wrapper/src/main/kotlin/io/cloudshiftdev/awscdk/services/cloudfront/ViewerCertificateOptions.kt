@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Example:
 *
 * ```
 * Bucket s3BucketSource = new Bucket(this, "Bucket");
 * CloudFrontWebDistribution distribution = CloudFrontWebDistribution.Builder.create(this,
 * "AnAmazingWebsiteProbably")
 * .originConfigs(List.of(SourceConfiguration.builder()
 * .s3OriginSource(S3OriginConfig.builder().s3BucketSource(s3BucketSource).build())
 * .behaviors(List.of(Behavior.builder().isDefaultBehavior(true).build()))
 * .build()))
 * .viewerCertificate(ViewerCertificate.fromIamCertificate("certificateId",
 * ViewerCertificateOptions.builder()
 * .aliases(List.of("example.com"))
 * .securityPolicy(SecurityPolicyProtocol.SSL_V3) // default
 * .sslMethod(SSLMethod.SNI)
 * .build()))
 * .build();
 * ```
 */
public interface ViewerCertificateOptions {
  /**
   * Domain names on the certificate (both main domain name and Subject Alternative names).
   */
  public fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

  /**
   * The minimum version of the SSL protocol that you want CloudFront to use for HTTPS connections.
   *
   * CloudFront serves your objects only to browsers or devices that support at
   * least the SSL version that you specify.
   *
   * Default: - SSLv3 if sslMethod VIP, TLSv1 if sslMethod SNI
   */
  public fun securityPolicy(): SecurityPolicyProtocol? =
      unwrap(this).getSecurityPolicy()?.let(SecurityPolicyProtocol::wrap)

  /**
   * How CloudFront should serve HTTPS requests.
   *
   * See the notes on SSLMethod if you wish to use other SSL termination types.
   *
   * Default: SSLMethod.SNI
   *
   * [Documentation](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html)
   */
  public fun sslMethod(): SSLMethod? = unwrap(this).getSslMethod()?.let(SSLMethod::wrap)

  /**
   * A builder for [ViewerCertificateOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aliases Domain names on the certificate (both main domain name and Subject Alternative
     * names).
     */
    public fun aliases(aliases: List<String>)

    /**
     * @param aliases Domain names on the certificate (both main domain name and Subject Alternative
     * names).
     */
    public fun aliases(vararg aliases: String)

    /**
     * @param securityPolicy The minimum version of the SSL protocol that you want CloudFront to use
     * for HTTPS connections.
     * CloudFront serves your objects only to browsers or devices that support at
     * least the SSL version that you specify.
     */
    public fun securityPolicy(securityPolicy: SecurityPolicyProtocol)

    /**
     * @param sslMethod How CloudFront should serve HTTPS requests.
     * See the notes on SSLMethod if you wish to use other SSL termination types.
     */
    public fun sslMethod(sslMethod: SSLMethod)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions.Builder =
        software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions.builder()

    /**
     * @param aliases Domain names on the certificate (both main domain name and Subject Alternative
     * names).
     */
    override fun aliases(aliases: List<String>) {
      cdkBuilder.aliases(aliases)
    }

    /**
     * @param aliases Domain names on the certificate (both main domain name and Subject Alternative
     * names).
     */
    override fun aliases(vararg aliases: String): Unit = aliases(aliases.toList())

    /**
     * @param securityPolicy The minimum version of the SSL protocol that you want CloudFront to use
     * for HTTPS connections.
     * CloudFront serves your objects only to browsers or devices that support at
     * least the SSL version that you specify.
     */
    override fun securityPolicy(securityPolicy: SecurityPolicyProtocol) {
      cdkBuilder.securityPolicy(securityPolicy.let(SecurityPolicyProtocol::unwrap))
    }

    /**
     * @param sslMethod How CloudFront should serve HTTPS requests.
     * See the notes on SSLMethod if you wish to use other SSL termination types.
     */
    override fun sslMethod(sslMethod: SSLMethod) {
      cdkBuilder.sslMethod(sslMethod.let(SSLMethod::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions,
  ) : CdkObject(cdkObject), ViewerCertificateOptions {
    /**
     * Domain names on the certificate (both main domain name and Subject Alternative names).
     */
    override fun aliases(): List<String> = unwrap(this).getAliases() ?: emptyList()

    /**
     * The minimum version of the SSL protocol that you want CloudFront to use for HTTPS
     * connections.
     *
     * CloudFront serves your objects only to browsers or devices that support at
     * least the SSL version that you specify.
     *
     * Default: - SSLv3 if sslMethod VIP, TLSv1 if sslMethod SNI
     */
    override fun securityPolicy(): SecurityPolicyProtocol? =
        unwrap(this).getSecurityPolicy()?.let(SecurityPolicyProtocol::wrap)

    /**
     * How CloudFront should serve HTTPS requests.
     *
     * See the notes on SSLMethod if you wish to use other SSL termination types.
     *
     * Default: SSLMethod.SNI
     *
     * [Documentation](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_ViewerCertificate.html)
     */
    override fun sslMethod(): SSLMethod? = unwrap(this).getSslMethod()?.let(SSLMethod::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ViewerCertificateOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions):
        ViewerCertificateOptions = CdkObjectWrappers.wrap(cdkObject) as ViewerCertificateOptions

    internal fun unwrap(wrapped: ViewerCertificateOptions):
        software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions
  }
}
