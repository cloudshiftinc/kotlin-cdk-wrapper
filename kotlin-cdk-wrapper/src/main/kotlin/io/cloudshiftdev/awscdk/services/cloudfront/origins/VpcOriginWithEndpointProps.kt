@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront.origins

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudfront.OriginProtocolPolicy
import io.cloudshiftdev.awscdk.services.cloudfront.OriginSslPolicy
import io.cloudshiftdev.awscdk.services.cloudfront.VpcOriginOptions
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties to define a VPC origin with endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * import io.cloudshiftdev.awscdk.services.cloudfront.origins.*;
 * VpcOriginWithEndpointProps vpcOriginWithEndpointProps = VpcOriginWithEndpointProps.builder()
 * .connectionAttempts(123)
 * .connectionTimeout(Duration.minutes(30))
 * .customHeaders(Map.of(
 * "customHeadersKey", "customHeaders"))
 * .domainName("domainName")
 * .httpPort(123)
 * .httpsPort(123)
 * .keepaliveTimeout(Duration.minutes(30))
 * .originAccessControlId("originAccessControlId")
 * .originId("originId")
 * .originPath("originPath")
 * .originShieldEnabled(false)
 * .originShieldRegion("originShieldRegion")
 * .originSslProtocols(List.of(OriginSslPolicy.SSL_V3))
 * .protocolPolicy(OriginProtocolPolicy.HTTP_ONLY)
 * .readTimeout(Duration.minutes(30))
 * .vpcOriginName("vpcOriginName")
 * .build();
 * ```
 */
public interface VpcOriginWithEndpointProps : VpcOriginProps, VpcOriginOptions {
  /**
   * A builder for [VpcOriginWithEndpointProps]
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
     * @param domainName The domain name associated with your VPC origin.
     */
    public fun domainName(domainName: String)

    /**
     * @param httpPort The HTTP port for the CloudFront VPC origin endpoint configuration.
     */
    public fun httpPort(httpPort: Number)

    /**
     * @param httpsPort The HTTPS port of the CloudFront VPC origin endpoint configuration.
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
     * @param originAccessControlId The unique identifier of an origin access control for this
     * origin.
     */
    public fun originAccessControlId(originAccessControlId: String)

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
     * @param originSslProtocols A list that contains allowed SSL/TLS protocols for this
     * distribution.
     */
    public fun originSslProtocols(originSslProtocols: List<OriginSslPolicy>)

    /**
     * @param originSslProtocols A list that contains allowed SSL/TLS protocols for this
     * distribution.
     */
    public fun originSslProtocols(vararg originSslProtocols: OriginSslPolicy)

    /**
     * @param protocolPolicy The origin protocol policy for the CloudFront VPC origin endpoint
     * configuration.
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

    /**
     * @param vpcOriginName The name of the CloudFront VPC origin endpoint configuration.
     */
    public fun vpcOriginName(vpcOriginName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.origins.VpcOriginWithEndpointProps.Builder =
        software.amazon.awscdk.services.cloudfront.origins.VpcOriginWithEndpointProps.builder()

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
      cdkBuilder.connectionTimeout(connectionTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param customHeaders A list of HTTP header names and values that CloudFront adds to requests
     * it sends to the origin.
     */
    override fun customHeaders(customHeaders: Map<String, String>) {
      cdkBuilder.customHeaders(customHeaders)
    }

    /**
     * @param domainName The domain name associated with your VPC origin.
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param httpPort The HTTP port for the CloudFront VPC origin endpoint configuration.
     */
    override fun httpPort(httpPort: Number) {
      cdkBuilder.httpPort(httpPort)
    }

    /**
     * @param httpsPort The HTTPS port of the CloudFront VPC origin endpoint configuration.
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
      cdkBuilder.keepaliveTimeout(keepaliveTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param originAccessControlId The unique identifier of an origin access control for this
     * origin.
     */
    override fun originAccessControlId(originAccessControlId: String) {
      cdkBuilder.originAccessControlId(originAccessControlId)
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
     * @param originSslProtocols A list that contains allowed SSL/TLS protocols for this
     * distribution.
     */
    override fun originSslProtocols(originSslProtocols: List<OriginSslPolicy>) {
      cdkBuilder.originSslProtocols(originSslProtocols.map(OriginSslPolicy.Companion::unwrap))
    }

    /**
     * @param originSslProtocols A list that contains allowed SSL/TLS protocols for this
     * distribution.
     */
    override fun originSslProtocols(vararg originSslProtocols: OriginSslPolicy): Unit =
        originSslProtocols(originSslProtocols.toList())

    /**
     * @param protocolPolicy The origin protocol policy for the CloudFront VPC origin endpoint
     * configuration.
     */
    override fun protocolPolicy(protocolPolicy: OriginProtocolPolicy) {
      cdkBuilder.protocolPolicy(protocolPolicy.let(OriginProtocolPolicy.Companion::unwrap))
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
      cdkBuilder.readTimeout(readTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param vpcOriginName The name of the CloudFront VPC origin endpoint configuration.
     */
    override fun vpcOriginName(vpcOriginName: String) {
      cdkBuilder.vpcOriginName(vpcOriginName)
    }

    public fun build():
        software.amazon.awscdk.services.cloudfront.origins.VpcOriginWithEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.origins.VpcOriginWithEndpointProps,
  ) : CdkObject(cdkObject),
      VpcOriginWithEndpointProps {
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
     * The domain name associated with your VPC origin.
     *
     * Default: - The default domain name of the endpoint.
     */
    override fun domainName(): String? = unwrap(this).getDomainName()

    /**
     * The HTTP port for the CloudFront VPC origin endpoint configuration.
     *
     * Default: 80
     */
    override fun httpPort(): Number? = unwrap(this).getHttpPort()

    /**
     * The HTTPS port of the CloudFront VPC origin endpoint configuration.
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
     * The unique identifier of an origin access control for this origin.
     *
     * Default: - no origin access control
     */
    override fun originAccessControlId(): String? = unwrap(this).getOriginAccessControlId()

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
     * A list that contains allowed SSL/TLS protocols for this distribution.
     *
     * Default: - TLSv1.2
     */
    override fun originSslProtocols(): List<OriginSslPolicy> =
        unwrap(this).getOriginSslProtocols()?.map(OriginSslPolicy::wrap) ?: emptyList()

    /**
     * The origin protocol policy for the CloudFront VPC origin endpoint configuration.
     *
     * Default: OriginProtocolPolicy.MATCH_VIEWER
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

    /**
     * The name of the CloudFront VPC origin endpoint configuration.
     *
     * Default: - generated from the `id`
     */
    override fun vpcOriginName(): String? = unwrap(this).getVpcOriginName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcOriginWithEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.origins.VpcOriginWithEndpointProps):
        VpcOriginWithEndpointProps = CdkObjectWrappers.wrap(cdkObject) as?
        VpcOriginWithEndpointProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcOriginWithEndpointProps):
        software.amazon.awscdk.services.cloudfront.origins.VpcOriginWithEndpointProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.origins.VpcOriginWithEndpointProps
  }
}
