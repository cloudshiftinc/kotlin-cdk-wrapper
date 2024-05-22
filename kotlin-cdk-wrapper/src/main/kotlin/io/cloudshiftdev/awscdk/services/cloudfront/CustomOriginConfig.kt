@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * A custom origin configuration.
 *
 * Example:
 *
 * ```
 * Bucket sourceBucket;
 * OriginAccessIdentity oai;
 * CloudFrontWebDistribution.Builder.create(this, "MyCfWebDistribution")
 * .originConfigs(List.of(SourceConfiguration.builder()
 * .s3OriginSource(S3OriginConfig.builder()
 * .s3BucketSource(sourceBucket)
 * .originAccessIdentity(oai)
 * .build())
 * .behaviors(List.of(Behavior.builder().isDefaultBehavior(true).build()))
 * .build(), SourceConfiguration.builder()
 * .customOriginSource(CustomOriginConfig.builder()
 * .domainName("MYALIAS")
 * .build())
 * .behaviors(List.of(Behavior.builder().pathPattern("/somewhere").build()))
 * .build()))
 * .build();
 * ```
 */
public interface CustomOriginConfig {
  /**
   * The SSL versions to use when interacting with the origin.
   *
   * Default: OriginSslPolicy.TLS_V1_2
   */
  public fun allowedOriginSSLVersions(): List<OriginSslPolicy> =
      unwrap(this).getAllowedOriginSSLVersions()?.map(OriginSslPolicy::wrap) ?: emptyList()

  /**
   * The domain name of the custom origin.
   *
   * Should not include the path - that should be in the parent SourceConfiguration
   */
  public fun domainName(): String

  /**
   * The origin HTTP port.
   *
   * Default: 80
   */
  public fun httpPort(): Number? = unwrap(this).getHttpPort()

  /**
   * The origin HTTPS port.
   *
   * Default: 443
   */
  public fun httpsPort(): Number? = unwrap(this).getHttpsPort()

  /**
   * Any additional headers to pass to the origin.
   *
   * Default: - No additional headers are passed.
   */
  public fun originHeaders(): Map<String, String> = unwrap(this).getOriginHeaders() ?: emptyMap()

  /**
   * The keep alive timeout when making calls in seconds.
   *
   * Default: Duration.seconds(5)
   */
  public fun originKeepaliveTimeout(): Duration? =
      unwrap(this).getOriginKeepaliveTimeout()?.let(Duration::wrap)

  /**
   * The relative path to the origin root to use for sources.
   *
   * Default: /
   */
  public fun originPath(): String? = unwrap(this).getOriginPath()

  /**
   * The protocol (http or https) policy to use when interacting with the origin.
   *
   * Default: OriginProtocolPolicy.HttpsOnly
   */
  public fun originProtocolPolicy(): OriginProtocolPolicy? =
      unwrap(this).getOriginProtocolPolicy()?.let(OriginProtocolPolicy::wrap)

  /**
   * The read timeout when calling the origin in seconds.
   *
   * Default: Duration.seconds(30)
   */
  public fun originReadTimeout(): Duration? =
      unwrap(this).getOriginReadTimeout()?.let(Duration::wrap)

  /**
   * When you enable Origin Shield in the AWS Region that has the lowest latency to your origin, you
   * can get better network performance.
   *
   * Default: - origin shield not enabled
   */
  public fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()

  /**
   * A builder for [CustomOriginConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedOriginSslVersions The SSL versions to use when interacting with the origin.
     */
    public fun allowedOriginSslVersions(allowedOriginSslVersions: List<OriginSslPolicy>)

    /**
     * @param allowedOriginSslVersions The SSL versions to use when interacting with the origin.
     */
    public fun allowedOriginSslVersions(vararg allowedOriginSslVersions: OriginSslPolicy)

    /**
     * @param domainName The domain name of the custom origin. 
     * Should not include the path - that should be in the parent SourceConfiguration
     */
    public fun domainName(domainName: String)

    /**
     * @param httpPort The origin HTTP port.
     */
    public fun httpPort(httpPort: Number)

    /**
     * @param httpsPort The origin HTTPS port.
     */
    public fun httpsPort(httpsPort: Number)

    /**
     * @param originHeaders Any additional headers to pass to the origin.
     */
    public fun originHeaders(originHeaders: Map<String, String>)

    /**
     * @param originKeepaliveTimeout The keep alive timeout when making calls in seconds.
     */
    public fun originKeepaliveTimeout(originKeepaliveTimeout: Duration)

    /**
     * @param originPath The relative path to the origin root to use for sources.
     */
    public fun originPath(originPath: String)

    /**
     * @param originProtocolPolicy The protocol (http or https) policy to use when interacting with
     * the origin.
     */
    public fun originProtocolPolicy(originProtocolPolicy: OriginProtocolPolicy)

    /**
     * @param originReadTimeout The read timeout when calling the origin in seconds.
     */
    public fun originReadTimeout(originReadTimeout: Duration)

    /**
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     * latency to your origin, you can get better network performance.
     */
    public fun originShieldRegion(originShieldRegion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CustomOriginConfig.Builder =
        software.amazon.awscdk.services.cloudfront.CustomOriginConfig.builder()

    /**
     * @param allowedOriginSslVersions The SSL versions to use when interacting with the origin.
     */
    override fun allowedOriginSslVersions(allowedOriginSslVersions: List<OriginSslPolicy>) {
      cdkBuilder.allowedOriginSslVersions(allowedOriginSslVersions.map(OriginSslPolicy.Companion::unwrap))
    }

    /**
     * @param allowedOriginSslVersions The SSL versions to use when interacting with the origin.
     */
    override fun allowedOriginSslVersions(vararg allowedOriginSslVersions: OriginSslPolicy): Unit =
        allowedOriginSslVersions(allowedOriginSslVersions.toList())

    /**
     * @param domainName The domain name of the custom origin. 
     * Should not include the path - that should be in the parent SourceConfiguration
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param httpPort The origin HTTP port.
     */
    override fun httpPort(httpPort: Number) {
      cdkBuilder.httpPort(httpPort)
    }

    /**
     * @param httpsPort The origin HTTPS port.
     */
    override fun httpsPort(httpsPort: Number) {
      cdkBuilder.httpsPort(httpsPort)
    }

    /**
     * @param originHeaders Any additional headers to pass to the origin.
     */
    override fun originHeaders(originHeaders: Map<String, String>) {
      cdkBuilder.originHeaders(originHeaders)
    }

    /**
     * @param originKeepaliveTimeout The keep alive timeout when making calls in seconds.
     */
    override fun originKeepaliveTimeout(originKeepaliveTimeout: Duration) {
      cdkBuilder.originKeepaliveTimeout(originKeepaliveTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param originPath The relative path to the origin root to use for sources.
     */
    override fun originPath(originPath: String) {
      cdkBuilder.originPath(originPath)
    }

    /**
     * @param originProtocolPolicy The protocol (http or https) policy to use when interacting with
     * the origin.
     */
    override fun originProtocolPolicy(originProtocolPolicy: OriginProtocolPolicy) {
      cdkBuilder.originProtocolPolicy(originProtocolPolicy.let(OriginProtocolPolicy.Companion::unwrap))
    }

    /**
     * @param originReadTimeout The read timeout when calling the origin in seconds.
     */
    override fun originReadTimeout(originReadTimeout: Duration) {
      cdkBuilder.originReadTimeout(originReadTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     * latency to your origin, you can get better network performance.
     */
    override fun originShieldRegion(originShieldRegion: String) {
      cdkBuilder.originShieldRegion(originShieldRegion)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CustomOriginConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.CustomOriginConfig,
  ) : CdkObject(cdkObject), CustomOriginConfig {
    /**
     * The SSL versions to use when interacting with the origin.
     *
     * Default: OriginSslPolicy.TLS_V1_2
     */
    override fun allowedOriginSSLVersions(): List<OriginSslPolicy> =
        unwrap(this).getAllowedOriginSSLVersions()?.map(OriginSslPolicy::wrap) ?: emptyList()

    /**
     * The domain name of the custom origin.
     *
     * Should not include the path - that should be in the parent SourceConfiguration
     */
    override fun domainName(): String = unwrap(this).getDomainName()

    /**
     * The origin HTTP port.
     *
     * Default: 80
     */
    override fun httpPort(): Number? = unwrap(this).getHttpPort()

    /**
     * The origin HTTPS port.
     *
     * Default: 443
     */
    override fun httpsPort(): Number? = unwrap(this).getHttpsPort()

    /**
     * Any additional headers to pass to the origin.
     *
     * Default: - No additional headers are passed.
     */
    override fun originHeaders(): Map<String, String> = unwrap(this).getOriginHeaders() ?:
        emptyMap()

    /**
     * The keep alive timeout when making calls in seconds.
     *
     * Default: Duration.seconds(5)
     */
    override fun originKeepaliveTimeout(): Duration? =
        unwrap(this).getOriginKeepaliveTimeout()?.let(Duration::wrap)

    /**
     * The relative path to the origin root to use for sources.
     *
     * Default: /
     */
    override fun originPath(): String? = unwrap(this).getOriginPath()

    /**
     * The protocol (http or https) policy to use when interacting with the origin.
     *
     * Default: OriginProtocolPolicy.HttpsOnly
     */
    override fun originProtocolPolicy(): OriginProtocolPolicy? =
        unwrap(this).getOriginProtocolPolicy()?.let(OriginProtocolPolicy::wrap)

    /**
     * The read timeout when calling the origin in seconds.
     *
     * Default: Duration.seconds(30)
     */
    override fun originReadTimeout(): Duration? =
        unwrap(this).getOriginReadTimeout()?.let(Duration::wrap)

    /**
     * When you enable Origin Shield in the AWS Region that has the lowest latency to your origin,
     * you can get better network performance.
     *
     * Default: - origin shield not enabled
     */
    override fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomOriginConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CustomOriginConfig):
        CustomOriginConfig = CdkObjectWrappers.wrap(cdkObject) as? CustomOriginConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomOriginConfig):
        software.amazon.awscdk.services.cloudfront.CustomOriginConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CustomOriginConfig
  }
}
