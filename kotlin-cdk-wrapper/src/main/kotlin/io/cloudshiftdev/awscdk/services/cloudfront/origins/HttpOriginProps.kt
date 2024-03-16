@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront.origins

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudfront.OriginProps
import io.cloudshiftdev.awscdk.services.cloudfront.OriginProtocolPolicy
import io.cloudshiftdev.awscdk.services.cloudfront.OriginSslPolicy
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for an Origin backed by an S3 website-configured bucket, load balancer, or custom HTTP
 * server.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * import io.cloudshiftdev.awscdk.services.cloudfront.origins.*;
 * HttpOriginProps httpOriginProps = HttpOriginProps.builder()
 * .connectionAttempts(123)
 * .connectionTimeout(Duration.minutes(30))
 * .customHeaders(Map.of(
 * "customHeadersKey", "customHeaders"))
 * .httpPort(123)
 * .httpsPort(123)
 * .keepaliveTimeout(Duration.minutes(30))
 * .originId("originId")
 * .originPath("originPath")
 * .originShieldEnabled(false)
 * .originShieldRegion("originShieldRegion")
 * .originSslProtocols(List.of(OriginSslPolicy.SSL_V3))
 * .protocolPolicy(OriginProtocolPolicy.HTTP_ONLY)
 * .readTimeout(Duration.minutes(30))
 * .build();
 * ```
 */
public interface HttpOriginProps : OriginProps {
  /**
   * The HTTP port that CloudFront uses to connect to the origin.
   *
   * Default: 80
   */
  public fun httpPort(): Number? = unwrap(this).getHttpPort()

  /**
   * The HTTPS port that CloudFront uses to connect to the origin.
   *
   * Default: 443
   */
  public fun httpsPort(): Number? = unwrap(this).getHttpsPort()

  /**
   * Specifies how long, in seconds, CloudFront persists its connection to the origin.
   *
   * The valid range is from 1 to 180 seconds, inclusive.
   *
   * Note that values over 60 seconds are possible only after a limit increase request for the
   * origin response timeout quota
   * has been approved in the target account; otherwise, values over 60 seconds will produce an
   * error at deploy time.
   *
   * Default: Duration.seconds(5)
   */
  public fun keepaliveTimeout(): Duration? = unwrap(this).getKeepaliveTimeout()?.let(Duration::wrap)

  /**
   * The SSL versions to use when interacting with the origin.
   *
   * Default: OriginSslPolicy.TLS_V1_2
   */
  public fun originSslProtocols(): List<OriginSslPolicy> =
      unwrap(this).getOriginSslProtocols()?.map(OriginSslPolicy::wrap) ?: emptyList()

  /**
   * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to the origin.
   *
   * Default: OriginProtocolPolicy.HTTPS_ONLY
   */
  public fun protocolPolicy(): OriginProtocolPolicy? =
      unwrap(this).getProtocolPolicy()?.let(OriginProtocolPolicy::wrap)

  /**
   * Specifies how long, in seconds, CloudFront waits for a response from the origin, also known as
   * the origin response timeout.
   *
   * The valid range is from 1 to 180 seconds, inclusive.
   *
   * Note that values over 60 seconds are possible only after a limit increase request for the
   * origin response timeout quota
   * has been approved in the target account; otherwise, values over 60 seconds will produce an
   * error at deploy time.
   *
   * Default: Duration.seconds(30)
   */
  public fun readTimeout(): Duration? = unwrap(this).getReadTimeout()?.let(Duration::wrap)

  /**
   * A builder for [HttpOriginProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionAttempts The number of times that CloudFront attempts to connect to the
     * origin;.
     * valid values are 1, 2, or 3 attempts.
     */
    public fun connectionAttempts(connectionAttempts: Number)

    /**
     * @param connectionTimeout The number of seconds that CloudFront waits when trying to establish
     * a connection to the origin.
     * Valid values are 1-10 seconds, inclusive.
     */
    public fun connectionTimeout(connectionTimeout: Duration)

    /**
     * @param customHeaders A list of HTTP header names and values that CloudFront adds to requests
     * it sends to the origin.
     */
    public fun customHeaders(customHeaders: Map<String, String>)

    /**
     * @param httpPort The HTTP port that CloudFront uses to connect to the origin.
     */
    public fun httpPort(httpPort: Number)

    /**
     * @param httpsPort The HTTPS port that CloudFront uses to connect to the origin.
     */
    public fun httpsPort(httpsPort: Number)

    /**
     * @param keepaliveTimeout Specifies how long, in seconds, CloudFront persists its connection to
     * the origin.
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota
     * has been approved in the target account; otherwise, values over 60 seconds will produce an
     * error at deploy time.
     */
    public fun keepaliveTimeout(keepaliveTimeout: Duration)

    /**
     * @param originId A unique identifier for the origin.
     * This value must be unique within the distribution.
     */
    public fun originId(originId: String)

    /**
     * @param originPath An optional path that CloudFront appends to the origin domain name when
     * CloudFront requests content from the origin.
     * Must begin, but not end, with '/' (e.g., '/production/images').
     */
    public fun originPath(originPath: String)

    /**
     * @param originShieldEnabled Origin Shield is enabled by setting originShieldRegion to a valid
     * region, after this to disable Origin Shield again you must set this flag to false.
     */
    public fun originShieldEnabled(originShieldEnabled: Boolean)

    /**
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     * latency to your origin, you can get better network performance.
     */
    public fun originShieldRegion(originShieldRegion: String)

    /**
     * @param originSslProtocols The SSL versions to use when interacting with the origin.
     */
    public fun originSslProtocols(originSslProtocols: List<OriginSslPolicy>)

    /**
     * @param originSslProtocols The SSL versions to use when interacting with the origin.
     */
    public fun originSslProtocols(vararg originSslProtocols: OriginSslPolicy)

    /**
     * @param protocolPolicy Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect
     * to the origin.
     */
    public fun protocolPolicy(protocolPolicy: OriginProtocolPolicy)

    /**
     * @param readTimeout Specifies how long, in seconds, CloudFront waits for a response from the
     * origin, also known as the origin response timeout.
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota
     * has been approved in the target account; otherwise, values over 60 seconds will produce an
     * error at deploy time.
     */
    public fun readTimeout(readTimeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.origins.HttpOriginProps.Builder =
        software.amazon.awscdk.services.cloudfront.origins.HttpOriginProps.builder()

    /**
     * @param connectionAttempts The number of times that CloudFront attempts to connect to the
     * origin;.
     * valid values are 1, 2, or 3 attempts.
     */
    override fun connectionAttempts(connectionAttempts: Number) {
      cdkBuilder.connectionAttempts(connectionAttempts)
    }

    /**
     * @param connectionTimeout The number of seconds that CloudFront waits when trying to establish
     * a connection to the origin.
     * Valid values are 1-10 seconds, inclusive.
     */
    override fun connectionTimeout(connectionTimeout: Duration) {
      cdkBuilder.connectionTimeout(connectionTimeout.let(Duration::unwrap))
    }

    /**
     * @param customHeaders A list of HTTP header names and values that CloudFront adds to requests
     * it sends to the origin.
     */
    override fun customHeaders(customHeaders: Map<String, String>) {
      cdkBuilder.customHeaders(customHeaders)
    }

    /**
     * @param httpPort The HTTP port that CloudFront uses to connect to the origin.
     */
    override fun httpPort(httpPort: Number) {
      cdkBuilder.httpPort(httpPort)
    }

    /**
     * @param httpsPort The HTTPS port that CloudFront uses to connect to the origin.
     */
    override fun httpsPort(httpsPort: Number) {
      cdkBuilder.httpsPort(httpsPort)
    }

    /**
     * @param keepaliveTimeout Specifies how long, in seconds, CloudFront persists its connection to
     * the origin.
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota
     * has been approved in the target account; otherwise, values over 60 seconds will produce an
     * error at deploy time.
     */
    override fun keepaliveTimeout(keepaliveTimeout: Duration) {
      cdkBuilder.keepaliveTimeout(keepaliveTimeout.let(Duration::unwrap))
    }

    /**
     * @param originId A unique identifier for the origin.
     * This value must be unique within the distribution.
     */
    override fun originId(originId: String) {
      cdkBuilder.originId(originId)
    }

    /**
     * @param originPath An optional path that CloudFront appends to the origin domain name when
     * CloudFront requests content from the origin.
     * Must begin, but not end, with '/' (e.g., '/production/images').
     */
    override fun originPath(originPath: String) {
      cdkBuilder.originPath(originPath)
    }

    /**
     * @param originShieldEnabled Origin Shield is enabled by setting originShieldRegion to a valid
     * region, after this to disable Origin Shield again you must set this flag to false.
     */
    override fun originShieldEnabled(originShieldEnabled: Boolean) {
      cdkBuilder.originShieldEnabled(originShieldEnabled)
    }

    /**
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     * latency to your origin, you can get better network performance.
     */
    override fun originShieldRegion(originShieldRegion: String) {
      cdkBuilder.originShieldRegion(originShieldRegion)
    }

    /**
     * @param originSslProtocols The SSL versions to use when interacting with the origin.
     */
    override fun originSslProtocols(originSslProtocols: List<OriginSslPolicy>) {
      cdkBuilder.originSslProtocols(originSslProtocols.map(OriginSslPolicy::unwrap))
    }

    /**
     * @param originSslProtocols The SSL versions to use when interacting with the origin.
     */
    override fun originSslProtocols(vararg originSslProtocols: OriginSslPolicy): Unit =
        originSslProtocols(originSslProtocols.toList())

    /**
     * @param protocolPolicy Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect
     * to the origin.
     */
    override fun protocolPolicy(protocolPolicy: OriginProtocolPolicy) {
      cdkBuilder.protocolPolicy(protocolPolicy.let(OriginProtocolPolicy::unwrap))
    }

    /**
     * @param readTimeout Specifies how long, in seconds, CloudFront waits for a response from the
     * origin, also known as the origin response timeout.
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota
     * has been approved in the target account; otherwise, values over 60 seconds will produce an
     * error at deploy time.
     */
    override fun readTimeout(readTimeout: Duration) {
      cdkBuilder.readTimeout(readTimeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.origins.HttpOriginProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.origins.HttpOriginProps,
  ) : CdkObject(cdkObject), HttpOriginProps {
    /**
     * The number of times that CloudFront attempts to connect to the origin;
     *
     * valid values are 1, 2, or 3 attempts.
     *
     * Default: 3
     */
    override fun connectionAttempts(): Number? = unwrap(this).getConnectionAttempts()

    /**
     * The number of seconds that CloudFront waits when trying to establish a connection to the
     * origin.
     *
     * Valid values are 1-10 seconds, inclusive.
     *
     * Default: Duration.seconds(10)
     */
    override fun connectionTimeout(): Duration? =
        unwrap(this).getConnectionTimeout()?.let(Duration::wrap)

    /**
     * A list of HTTP header names and values that CloudFront adds to requests it sends to the
     * origin.
     *
     * Default: {}
     */
    override fun customHeaders(): Map<String, String> = unwrap(this).getCustomHeaders() ?:
        emptyMap()

    /**
     * The HTTP port that CloudFront uses to connect to the origin.
     *
     * Default: 80
     */
    override fun httpPort(): Number? = unwrap(this).getHttpPort()

    /**
     * The HTTPS port that CloudFront uses to connect to the origin.
     *
     * Default: 443
     */
    override fun httpsPort(): Number? = unwrap(this).getHttpsPort()

    /**
     * Specifies how long, in seconds, CloudFront persists its connection to the origin.
     *
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota
     * has been approved in the target account; otherwise, values over 60 seconds will produce an
     * error at deploy time.
     *
     * Default: Duration.seconds(5)
     */
    override fun keepaliveTimeout(): Duration? =
        unwrap(this).getKeepaliveTimeout()?.let(Duration::wrap)

    /**
     * A unique identifier for the origin.
     *
     * This value must be unique within the distribution.
     *
     * Default: - an originid will be generated for you
     */
    override fun originId(): String? = unwrap(this).getOriginId()

    /**
     * An optional path that CloudFront appends to the origin domain name when CloudFront requests
     * content from the origin.
     *
     * Must begin, but not end, with '/' (e.g., '/production/images').
     *
     * Default: '/'
     */
    override fun originPath(): String? = unwrap(this).getOriginPath()

    /**
     * Origin Shield is enabled by setting originShieldRegion to a valid region, after this to
     * disable Origin Shield again you must set this flag to false.
     *
     * Default: - true
     */
    override fun originShieldEnabled(): Boolean? = unwrap(this).getOriginShieldEnabled()

    /**
     * When you enable Origin Shield in the AWS Region that has the lowest latency to your origin,
     * you can get better network performance.
     *
     * Default: - origin shield not enabled
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
     */
    override fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()

    /**
     * The SSL versions to use when interacting with the origin.
     *
     * Default: OriginSslPolicy.TLS_V1_2
     */
    override fun originSslProtocols(): List<OriginSslPolicy> =
        unwrap(this).getOriginSslProtocols()?.map(OriginSslPolicy::wrap) ?: emptyList()

    /**
     * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to the origin.
     *
     * Default: OriginProtocolPolicy.HTTPS_ONLY
     */
    override fun protocolPolicy(): OriginProtocolPolicy? =
        unwrap(this).getProtocolPolicy()?.let(OriginProtocolPolicy::wrap)

    /**
     * Specifies how long, in seconds, CloudFront waits for a response from the origin, also known
     * as the origin response timeout.
     *
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota
     * has been approved in the target account; otherwise, values over 60 seconds will produce an
     * error at deploy time.
     *
     * Default: Duration.seconds(30)
     */
    override fun readTimeout(): Duration? = unwrap(this).getReadTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpOriginProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.origins.HttpOriginProps):
        HttpOriginProps = CdkObjectWrappers.wrap(cdkObject) as HttpOriginProps

    internal fun unwrap(wrapped: HttpOriginProps):
        software.amazon.awscdk.services.cloudfront.origins.HttpOriginProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.origins.HttpOriginProps
  }
}
