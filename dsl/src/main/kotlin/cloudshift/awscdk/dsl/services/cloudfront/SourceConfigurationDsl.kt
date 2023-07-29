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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.Behavior
import software.amazon.awscdk.services.cloudfront.CustomOriginConfig
import software.amazon.awscdk.services.cloudfront.FailoverStatusCode
import software.amazon.awscdk.services.cloudfront.S3OriginConfig
import software.amazon.awscdk.services.cloudfront.SourceConfiguration

/**
 * A source configuration is a wrapper for CloudFront origins and behaviors.
 *
 * An origin is what CloudFront will "be in front of" - that is, CloudFront will pull it's assets
 * from an origin.
 *
 * If you're using s3 as a source - pass the `s3Origin` property, otherwise, pass the
 * `customOriginSource` property.
 *
 * One or the other must be passed, and it is invalid to pass both in the same SourceConfiguration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.cloudfront.*;
 * import software.amazon.awscdk.services.lambda.*;
 * import software.amazon.awscdk.services.s3.*;
 * Bucket bucket;
 * Function function_;
 * KeyGroup keyGroup;
 * OriginAccessIdentity originAccessIdentity;
 * Version version;
 * SourceConfiguration sourceConfiguration = SourceConfiguration.builder()
 * .behaviors(List.of(Behavior.builder()
 * .allowedMethods(CloudFrontAllowedMethods.GET_HEAD)
 * .cachedMethods(CloudFrontAllowedCachedMethods.GET_HEAD)
 * .compress(false)
 * .defaultTtl(Duration.minutes(30))
 * .forwardedValues(ForwardedValuesProperty.builder()
 * .queryString(false)
 * // the properties below are optional
 * .cookies(CookiesProperty.builder()
 * .forward("forward")
 * // the properties below are optional
 * .whitelistedNames(List.of("whitelistedNames"))
 * .build())
 * .headers(List.of("headers"))
 * .queryStringCacheKeys(List.of("queryStringCacheKeys"))
 * .build())
 * .functionAssociations(List.of(FunctionAssociation.builder()
 * .eventType(FunctionEventType.VIEWER_REQUEST)
 * .function(function_)
 * .build()))
 * .isDefaultBehavior(false)
 * .lambdaFunctionAssociations(List.of(LambdaFunctionAssociation.builder()
 * .eventType(LambdaEdgeEventType.ORIGIN_REQUEST)
 * .lambdaFunction(version)
 * // the properties below are optional
 * .includeBody(false)
 * .build()))
 * .maxTtl(Duration.minutes(30))
 * .minTtl(Duration.minutes(30))
 * .pathPattern("pathPattern")
 * .trustedKeyGroups(List.of(keyGroup))
 * .trustedSigners(List.of("trustedSigners"))
 * .viewerProtocolPolicy(ViewerProtocolPolicy.HTTPS_ONLY)
 * .build()))
 * // the properties below are optional
 * .connectionAttempts(123)
 * .connectionTimeout(Duration.minutes(30))
 * .customOriginSource(CustomOriginConfig.builder()
 * .domainName("domainName")
 * // the properties below are optional
 * .allowedOriginSSLVersions(List.of(OriginSslPolicy.SSL_V3))
 * .httpPort(123)
 * .httpsPort(123)
 * .originHeaders(Map.of(
 * "originHeadersKey", "originHeaders"))
 * .originKeepaliveTimeout(Duration.minutes(30))
 * .originPath("originPath")
 * .originProtocolPolicy(OriginProtocolPolicy.HTTP_ONLY)
 * .originReadTimeout(Duration.minutes(30))
 * .originShieldRegion("originShieldRegion")
 * .build())
 * .failoverCriteriaStatusCodes(List.of(FailoverStatusCode.FORBIDDEN))
 * .failoverCustomOriginSource(CustomOriginConfig.builder()
 * .domainName("domainName")
 * // the properties below are optional
 * .allowedOriginSSLVersions(List.of(OriginSslPolicy.SSL_V3))
 * .httpPort(123)
 * .httpsPort(123)
 * .originHeaders(Map.of(
 * "originHeadersKey", "originHeaders"))
 * .originKeepaliveTimeout(Duration.minutes(30))
 * .originPath("originPath")
 * .originProtocolPolicy(OriginProtocolPolicy.HTTP_ONLY)
 * .originReadTimeout(Duration.minutes(30))
 * .originShieldRegion("originShieldRegion")
 * .build())
 * .failoverS3OriginSource(S3OriginConfig.builder()
 * .s3BucketSource(bucket)
 * // the properties below are optional
 * .originAccessIdentity(originAccessIdentity)
 * .originHeaders(Map.of(
 * "originHeadersKey", "originHeaders"))
 * .originPath("originPath")
 * .originShieldRegion("originShieldRegion")
 * .build())
 * .originShieldRegion("originShieldRegion")
 * .s3OriginSource(S3OriginConfig.builder()
 * .s3BucketSource(bucket)
 * // the properties below are optional
 * .originAccessIdentity(originAccessIdentity)
 * .originHeaders(Map.of(
 * "originHeadersKey", "originHeaders"))
 * .originPath("originPath")
 * .originShieldRegion("originShieldRegion")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class SourceConfigurationDsl {
    private val cdkBuilder: SourceConfiguration.Builder = SourceConfiguration.builder()

    private val _behaviors: MutableList<Behavior> = mutableListOf()

    private val _failoverCriteriaStatusCodes: MutableList<FailoverStatusCode> = mutableListOf()

    /**
     * @param behaviors The behaviors associated with this source. At least one (default) behavior
     *   must be included.
     */
    public fun behaviors(behaviors: BehaviorDsl.() -> Unit) {
        _behaviors.add(BehaviorDsl().apply(behaviors).build())
    }

    /**
     * @param behaviors The behaviors associated with this source. At least one (default) behavior
     *   must be included.
     */
    public fun behaviors(behaviors: Collection<Behavior>) {
        _behaviors.addAll(behaviors)
    }

    /**
     * @param connectionAttempts The number of times that CloudFront attempts to connect to the
     *   origin. You can specify 1, 2, or 3 as the number of attempts.
     */
    public fun connectionAttempts(connectionAttempts: Number) {
        cdkBuilder.connectionAttempts(connectionAttempts)
    }

    /**
     * @param connectionTimeout The number of seconds that CloudFront waits when trying to establish
     *   a connection to the origin. You can specify a number of seconds between 1 and 10
     *   (inclusive).
     */
    public fun connectionTimeout(connectionTimeout: Duration) {
        cdkBuilder.connectionTimeout(connectionTimeout)
    }

    /** @param customOriginSource A custom origin source - for all non-s3 sources. */
    public fun customOriginSource(customOriginSource: CustomOriginConfigDsl.() -> Unit = {}) {
        val builder = CustomOriginConfigDsl()
        builder.apply(customOriginSource)
        cdkBuilder.customOriginSource(builder.build())
    }

    /** @param customOriginSource A custom origin source - for all non-s3 sources. */
    public fun customOriginSource(customOriginSource: CustomOriginConfig) {
        cdkBuilder.customOriginSource(customOriginSource)
    }

    /** @param failoverCriteriaStatusCodes HTTP status code to failover to second origin. */
    public fun failoverCriteriaStatusCodes(vararg failoverCriteriaStatusCodes: FailoverStatusCode) {
        _failoverCriteriaStatusCodes.addAll(listOf(*failoverCriteriaStatusCodes))
    }

    /** @param failoverCriteriaStatusCodes HTTP status code to failover to second origin. */
    public fun failoverCriteriaStatusCodes(
        failoverCriteriaStatusCodes: Collection<FailoverStatusCode>
    ) {
        _failoverCriteriaStatusCodes.addAll(failoverCriteriaStatusCodes)
    }

    /**
     * @param failoverCustomOriginSource A custom origin source for failover in case the
     *   s3OriginSource returns invalid status code.
     */
    public fun failoverCustomOriginSource(
        failoverCustomOriginSource: CustomOriginConfigDsl.() -> Unit = {}
    ) {
        val builder = CustomOriginConfigDsl()
        builder.apply(failoverCustomOriginSource)
        cdkBuilder.failoverCustomOriginSource(builder.build())
    }

    /**
     * @param failoverCustomOriginSource A custom origin source for failover in case the
     *   s3OriginSource returns invalid status code.
     */
    public fun failoverCustomOriginSource(failoverCustomOriginSource: CustomOriginConfig) {
        cdkBuilder.failoverCustomOriginSource(failoverCustomOriginSource)
    }

    /**
     * @param failoverS3OriginSource An s3 origin source for failover in case the s3OriginSource
     *   returns invalid status code.
     */
    public fun failoverS3OriginSource(failoverS3OriginSource: S3OriginConfigDsl.() -> Unit = {}) {
        val builder = S3OriginConfigDsl()
        builder.apply(failoverS3OriginSource)
        cdkBuilder.failoverS3OriginSource(builder.build())
    }

    /**
     * @param failoverS3OriginSource An s3 origin source for failover in case the s3OriginSource
     *   returns invalid status code.
     */
    public fun failoverS3OriginSource(failoverS3OriginSource: S3OriginConfig) {
        cdkBuilder.failoverS3OriginSource(failoverS3OriginSource)
    }

    /**
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     *   latency to your origin, you can get better network performance.
     */
    public fun originShieldRegion(originShieldRegion: String) {
        cdkBuilder.originShieldRegion(originShieldRegion)
    }

    /** @param s3OriginSource An s3 origin source - if you're using s3 for your assets. */
    public fun s3OriginSource(s3OriginSource: S3OriginConfigDsl.() -> Unit = {}) {
        val builder = S3OriginConfigDsl()
        builder.apply(s3OriginSource)
        cdkBuilder.s3OriginSource(builder.build())
    }

    /** @param s3OriginSource An s3 origin source - if you're using s3 for your assets. */
    public fun s3OriginSource(s3OriginSource: S3OriginConfig) {
        cdkBuilder.s3OriginSource(s3OriginSource)
    }

    public fun build(): SourceConfiguration {
        if (_behaviors.isNotEmpty()) cdkBuilder.behaviors(_behaviors)
        if (_failoverCriteriaStatusCodes.isNotEmpty())
            cdkBuilder.failoverCriteriaStatusCodes(_failoverCriteriaStatusCodes)
        return cdkBuilder.build()
    }
}
