@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * An origin.
 *
 * An origin is the location where content is stored, and from which CloudFront gets content to
 * serve to viewers. To specify an origin:
 * * Use `S3OriginConfig` to specify an Amazon S3 bucket that is not configured with static website
 *   hosting.
 * * Use `CustomOriginConfig` to specify all other kinds of origins, including:
 * * An Amazon S3 bucket that is configured with static website hosting
 * * An Elastic Load Balancing load balancer
 * * An AWS Elemental MediaPackage endpoint
 * * An AWS Elemental MediaStore container
 * * Any other HTTP server, running on an Amazon EC2 instance or any other kind of host
 *
 * For the current maximum number of origins that you can specify per distribution, see
 * [General Quotas on Web Distributions](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html#limits-web-distributions)
 * in the *Amazon CloudFront Developer Guide* (quotas were formerly referred to as limits).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * OriginProperty originProperty = OriginProperty.builder()
 * .domainName("domainName")
 * .id("id")
 * // the properties below are optional
 * .connectionAttempts(123)
 * .connectionTimeout(123)
 * .customOriginConfig(CustomOriginConfigProperty.builder()
 * .originProtocolPolicy("originProtocolPolicy")
 * // the properties below are optional
 * .httpPort(123)
 * .httpsPort(123)
 * .originKeepaliveTimeout(123)
 * .originReadTimeout(123)
 * .originSslProtocols(List.of("originSslProtocols"))
 * .build())
 * .originAccessControlId("originAccessControlId")
 * .originCustomHeaders(List.of(OriginCustomHeaderProperty.builder()
 * .headerName("headerName")
 * .headerValue("headerValue")
 * .build()))
 * .originPath("originPath")
 * .originShield(OriginShieldProperty.builder()
 * .enabled(false)
 * .originShieldRegion("originShieldRegion")
 * .build())
 * .s3OriginConfig(S3OriginConfigProperty.builder()
 * .originAccessIdentity("originAccessIdentity")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origin.html)
 */
@CdkDslMarker
public class CfnDistributionOriginPropertyDsl {
    private val cdkBuilder: CfnDistribution.OriginProperty.Builder =
        CfnDistribution.OriginProperty.builder()

    private val _originCustomHeaders: MutableList<Any> = mutableListOf()

    /**
     * @param connectionAttempts The number of times that CloudFront attempts to connect to the
     *   origin. The minimum number is 1, the maximum is 3, and the default (if you don't specify
     *   otherwise) is 3.
     *
     * For a custom origin (including an Amazon S3 bucket that's configured with static website
     * hosting), this value also specifies the number of times that CloudFront attempts to get a
     * response from the origin, in the case of an
     * [Origin Response Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout)
     * .
     *
     * For more information, see
     * [Origin Connection Attempts](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-attempts)
     * in the *Amazon CloudFront Developer Guide* .
     */
    public fun connectionAttempts(connectionAttempts: Number) {
        cdkBuilder.connectionAttempts(connectionAttempts)
    }

    /**
     * @param connectionTimeout The number of seconds that CloudFront waits when trying to establish
     *   a connection to the origin. The minimum timeout is 1 second, the maximum is 10 seconds, and
     *   the default (if you don't specify otherwise) is 10 seconds.
     *
     * For more information, see
     * [Origin Connection Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#origin-connection-timeout)
     * in the *Amazon CloudFront Developer Guide* .
     */
    public fun connectionTimeout(connectionTimeout: Number) {
        cdkBuilder.connectionTimeout(connectionTimeout)
    }

    /**
     * @param customOriginConfig Use this type to specify an origin that is not an Amazon S3 bucket,
     *   with one exception. If the Amazon S3 bucket is configured with static website hosting, use
     *   this type. If the Amazon S3 bucket is not configured with static website hosting, use the
     *   `S3OriginConfig` type instead.
     */
    public fun customOriginConfig(customOriginConfig: IResolvable) {
        cdkBuilder.customOriginConfig(customOriginConfig)
    }

    /**
     * @param customOriginConfig Use this type to specify an origin that is not an Amazon S3 bucket,
     *   with one exception. If the Amazon S3 bucket is configured with static website hosting, use
     *   this type. If the Amazon S3 bucket is not configured with static website hosting, use the
     *   `S3OriginConfig` type instead.
     */
    public fun customOriginConfig(customOriginConfig: CfnDistribution.CustomOriginConfigProperty) {
        cdkBuilder.customOriginConfig(customOriginConfig)
    }

    /**
     * @param domainName The domain name for the origin. For more information, see
     *   [Origin Domain Name](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesDomainName)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * @param id A unique identifier for the origin. This value must be unique within the
     *   distribution. Use this value to specify the `TargetOriginId` in a `CacheBehavior` or
     *   `DefaultCacheBehavior` .
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * @param originAccessControlId The unique identifier of an origin access control for this
     *   origin. For more information, see
     *   [Restricting access to an Amazon S3 origin](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun originAccessControlId(originAccessControlId: String) {
        cdkBuilder.originAccessControlId(originAccessControlId)
    }

    /**
     * @param originCustomHeaders A list of HTTP header names and values that CloudFront adds to the
     *   requests that it sends to the origin. For more information, see
     *   [Adding Custom Headers to Origin Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun originCustomHeaders(vararg originCustomHeaders: Any) {
        _originCustomHeaders.addAll(listOf(*originCustomHeaders))
    }

    /**
     * @param originCustomHeaders A list of HTTP header names and values that CloudFront adds to the
     *   requests that it sends to the origin. For more information, see
     *   [Adding Custom Headers to Origin Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun originCustomHeaders(originCustomHeaders: Collection<Any>) {
        _originCustomHeaders.addAll(originCustomHeaders)
    }

    /**
     * @param originCustomHeaders A list of HTTP header names and values that CloudFront adds to the
     *   requests that it sends to the origin. For more information, see
     *   [Adding Custom Headers to Origin Requests](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/add-origin-custom-headers.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun originCustomHeaders(originCustomHeaders: IResolvable) {
        cdkBuilder.originCustomHeaders(originCustomHeaders)
    }

    /**
     * @param originPath An optional path that CloudFront appends to the origin domain name when
     *   CloudFront requests content from the origin. For more information, see
     *   [Origin Path](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginPath)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun originPath(originPath: String) {
        cdkBuilder.originPath(originPath)
    }

    /**
     * @param originShield CloudFront Origin Shield. Using Origin Shield can help reduce the load on
     *   your origin. For more information, see
     *   [Using Origin Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun originShield(originShield: IResolvable) {
        cdkBuilder.originShield(originShield)
    }

    /**
     * @param originShield CloudFront Origin Shield. Using Origin Shield can help reduce the load on
     *   your origin. For more information, see
     *   [Using Origin Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun originShield(originShield: CfnDistribution.OriginShieldProperty) {
        cdkBuilder.originShield(originShield)
    }

    /**
     * @param s3OriginConfig Use this type to specify an origin that is an Amazon S3 bucket that is
     *   not configured with static website hosting. To specify any other type of origin, including
     *   an Amazon S3 bucket that is configured with static website hosting, use the
     *   `CustomOriginConfig` type instead.
     */
    public fun s3OriginConfig(s3OriginConfig: IResolvable) {
        cdkBuilder.s3OriginConfig(s3OriginConfig)
    }

    /**
     * @param s3OriginConfig Use this type to specify an origin that is an Amazon S3 bucket that is
     *   not configured with static website hosting. To specify any other type of origin, including
     *   an Amazon S3 bucket that is configured with static website hosting, use the
     *   `CustomOriginConfig` type instead.
     */
    public fun s3OriginConfig(s3OriginConfig: CfnDistribution.S3OriginConfigProperty) {
        cdkBuilder.s3OriginConfig(s3OriginConfig)
    }

    public fun build(): CfnDistribution.OriginProperty {
        if (_originCustomHeaders.isNotEmpty()) cdkBuilder.originCustomHeaders(_originCustomHeaders)
        return cdkBuilder.build()
    }
}
