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
import kotlin.jvm.JvmName

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
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * import io.cloudshiftdev.awscdk.services.s3.*;
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
public interface SourceConfiguration {
  /**
   * The behaviors associated with this source.
   *
   * At least one (default) behavior must be included.
   */
  public fun behaviors(): List<Behavior>

  /**
   * The number of times that CloudFront attempts to connect to the origin.
   *
   * You can specify 1, 2, or 3 as the number of attempts.
   *
   * Default: 3
   */
  public fun connectionAttempts(): Number? = unwrap(this).getConnectionAttempts()

  /**
   * The number of seconds that CloudFront waits when trying to establish a connection to the
   * origin.
   *
   * You can specify a number of seconds between 1 and 10 (inclusive).
   *
   * Default: cdk.Duration.seconds(10)
   */
  public fun connectionTimeout(): Duration? =
      unwrap(this).getConnectionTimeout()?.let(Duration::wrap)

  /**
   * A custom origin source - for all non-s3 sources.
   */
  public fun customOriginSource(): CustomOriginConfig? =
      unwrap(this).getCustomOriginSource()?.let(CustomOriginConfig::wrap)

  /**
   * HTTP status code to failover to second origin.
   *
   * Default: [500, 502, 503, 504]
   */
  public fun failoverCriteriaStatusCodes(): List<FailoverStatusCode> =
      unwrap(this).getFailoverCriteriaStatusCodes()?.map(FailoverStatusCode::wrap) ?: emptyList()

  /**
   * A custom origin source for failover in case the s3OriginSource returns invalid status code.
   *
   * Default: - no failover configuration
   */
  public fun failoverCustomOriginSource(): CustomOriginConfig? =
      unwrap(this).getFailoverCustomOriginSource()?.let(CustomOriginConfig::wrap)

  /**
   * An s3 origin source for failover in case the s3OriginSource returns invalid status code.
   *
   * Default: - no failover configuration
   */
  public fun failoverS3OriginSource(): S3OriginConfig? =
      unwrap(this).getFailoverS3OriginSource()?.let(S3OriginConfig::wrap)

  /**
   * When you enable Origin Shield in the AWS Region that has the lowest latency to your origin, you
   * can get better network performance.
   *
   * Default: - origin shield not enabled
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
   */
  public fun originShieldRegion(): String? = unwrap(this).getOriginShieldRegion()

  /**
   * An s3 origin source - if you're using s3 for your assets.
   */
  public fun s3OriginSource(): S3OriginConfig? =
      unwrap(this).getS3OriginSource()?.let(S3OriginConfig::wrap)

  /**
   * A builder for [SourceConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param behaviors The behaviors associated with this source. 
     * At least one (default) behavior must be included.
     */
    public fun behaviors(behaviors: List<Behavior>)

    /**
     * @param behaviors The behaviors associated with this source. 
     * At least one (default) behavior must be included.
     */
    public fun behaviors(vararg behaviors: Behavior)

    /**
     * @param connectionAttempts The number of times that CloudFront attempts to connect to the
     * origin.
     * You can specify 1, 2, or 3 as the number of attempts.
     */
    public fun connectionAttempts(connectionAttempts: Number)

    /**
     * @param connectionTimeout The number of seconds that CloudFront waits when trying to establish
     * a connection to the origin.
     * You can specify a number of seconds between 1 and 10 (inclusive).
     */
    public fun connectionTimeout(connectionTimeout: Duration)

    /**
     * @param customOriginSource A custom origin source - for all non-s3 sources.
     */
    public fun customOriginSource(customOriginSource: CustomOriginConfig)

    /**
     * @param customOriginSource A custom origin source - for all non-s3 sources.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1f40b3266f2ceec05cf9721afd6a3bf58299f6119273d45fb2c6546a8d08660")
    public fun customOriginSource(customOriginSource: CustomOriginConfig.Builder.() -> Unit)

    /**
     * @param failoverCriteriaStatusCodes HTTP status code to failover to second origin.
     */
    public fun failoverCriteriaStatusCodes(failoverCriteriaStatusCodes: List<FailoverStatusCode>)

    /**
     * @param failoverCriteriaStatusCodes HTTP status code to failover to second origin.
     */
    public fun failoverCriteriaStatusCodes(vararg failoverCriteriaStatusCodes: FailoverStatusCode)

    /**
     * @param failoverCustomOriginSource A custom origin source for failover in case the
     * s3OriginSource returns invalid status code.
     */
    public fun failoverCustomOriginSource(failoverCustomOriginSource: CustomOriginConfig)

    /**
     * @param failoverCustomOriginSource A custom origin source for failover in case the
     * s3OriginSource returns invalid status code.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaa7f5a63e9eda405094c837ab71bbd677005861785044a491dea3de9bcce8df")
    public
        fun failoverCustomOriginSource(failoverCustomOriginSource: CustomOriginConfig.Builder.() -> Unit)

    /**
     * @param failoverS3OriginSource An s3 origin source for failover in case the s3OriginSource
     * returns invalid status code.
     */
    public fun failoverS3OriginSource(failoverS3OriginSource: S3OriginConfig)

    /**
     * @param failoverS3OriginSource An s3 origin source for failover in case the s3OriginSource
     * returns invalid status code.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce12ffa0dc18dbba552bd55cbecb5faa871b2ddd6add2071f13850d513cbcee9")
    public fun failoverS3OriginSource(failoverS3OriginSource: S3OriginConfig.Builder.() -> Unit)

    /**
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     * latency to your origin, you can get better network performance.
     */
    public fun originShieldRegion(originShieldRegion: String)

    /**
     * @param s3OriginSource An s3 origin source - if you're using s3 for your assets.
     */
    public fun s3OriginSource(s3OriginSource: S3OriginConfig)

    /**
     * @param s3OriginSource An s3 origin source - if you're using s3 for your assets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6ed34543781537ee9dc47cec4ee592e4032c4b954e6e802eef6b3a299c6ddbf")
    public fun s3OriginSource(s3OriginSource: S3OriginConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.SourceConfiguration.Builder =
        software.amazon.awscdk.services.cloudfront.SourceConfiguration.builder()

    /**
     * @param behaviors The behaviors associated with this source. 
     * At least one (default) behavior must be included.
     */
    override fun behaviors(behaviors: List<Behavior>) {
      cdkBuilder.behaviors(behaviors.map(Behavior::unwrap))
    }

    /**
     * @param behaviors The behaviors associated with this source. 
     * At least one (default) behavior must be included.
     */
    override fun behaviors(vararg behaviors: Behavior): Unit = behaviors(behaviors.toList())

    /**
     * @param connectionAttempts The number of times that CloudFront attempts to connect to the
     * origin.
     * You can specify 1, 2, or 3 as the number of attempts.
     */
    override fun connectionAttempts(connectionAttempts: Number) {
      cdkBuilder.connectionAttempts(connectionAttempts)
    }

    /**
     * @param connectionTimeout The number of seconds that CloudFront waits when trying to establish
     * a connection to the origin.
     * You can specify a number of seconds between 1 and 10 (inclusive).
     */
    override fun connectionTimeout(connectionTimeout: Duration) {
      cdkBuilder.connectionTimeout(connectionTimeout.let(Duration::unwrap))
    }

    /**
     * @param customOriginSource A custom origin source - for all non-s3 sources.
     */
    override fun customOriginSource(customOriginSource: CustomOriginConfig) {
      cdkBuilder.customOriginSource(customOriginSource.let(CustomOriginConfig::unwrap))
    }

    /**
     * @param customOriginSource A custom origin source - for all non-s3 sources.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1f40b3266f2ceec05cf9721afd6a3bf58299f6119273d45fb2c6546a8d08660")
    override fun customOriginSource(customOriginSource: CustomOriginConfig.Builder.() -> Unit): Unit
        = customOriginSource(CustomOriginConfig(customOriginSource))

    /**
     * @param failoverCriteriaStatusCodes HTTP status code to failover to second origin.
     */
    override
        fun failoverCriteriaStatusCodes(failoverCriteriaStatusCodes: List<FailoverStatusCode>) {
      cdkBuilder.failoverCriteriaStatusCodes(failoverCriteriaStatusCodes.map(FailoverStatusCode::unwrap))
    }

    /**
     * @param failoverCriteriaStatusCodes HTTP status code to failover to second origin.
     */
    override fun failoverCriteriaStatusCodes(vararg
        failoverCriteriaStatusCodes: FailoverStatusCode): Unit =
        failoverCriteriaStatusCodes(failoverCriteriaStatusCodes.toList())

    /**
     * @param failoverCustomOriginSource A custom origin source for failover in case the
     * s3OriginSource returns invalid status code.
     */
    override fun failoverCustomOriginSource(failoverCustomOriginSource: CustomOriginConfig) {
      cdkBuilder.failoverCustomOriginSource(failoverCustomOriginSource.let(CustomOriginConfig::unwrap))
    }

    /**
     * @param failoverCustomOriginSource A custom origin source for failover in case the
     * s3OriginSource returns invalid status code.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eaa7f5a63e9eda405094c837ab71bbd677005861785044a491dea3de9bcce8df")
    override
        fun failoverCustomOriginSource(failoverCustomOriginSource: CustomOriginConfig.Builder.() -> Unit):
        Unit = failoverCustomOriginSource(CustomOriginConfig(failoverCustomOriginSource))

    /**
     * @param failoverS3OriginSource An s3 origin source for failover in case the s3OriginSource
     * returns invalid status code.
     */
    override fun failoverS3OriginSource(failoverS3OriginSource: S3OriginConfig) {
      cdkBuilder.failoverS3OriginSource(failoverS3OriginSource.let(S3OriginConfig::unwrap))
    }

    /**
     * @param failoverS3OriginSource An s3 origin source for failover in case the s3OriginSource
     * returns invalid status code.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce12ffa0dc18dbba552bd55cbecb5faa871b2ddd6add2071f13850d513cbcee9")
    override fun failoverS3OriginSource(failoverS3OriginSource: S3OriginConfig.Builder.() -> Unit):
        Unit = failoverS3OriginSource(S3OriginConfig(failoverS3OriginSource))

    /**
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     * latency to your origin, you can get better network performance.
     */
    override fun originShieldRegion(originShieldRegion: String) {
      cdkBuilder.originShieldRegion(originShieldRegion)
    }

    /**
     * @param s3OriginSource An s3 origin source - if you're using s3 for your assets.
     */
    override fun s3OriginSource(s3OriginSource: S3OriginConfig) {
      cdkBuilder.s3OriginSource(s3OriginSource.let(S3OriginConfig::unwrap))
    }

    /**
     * @param s3OriginSource An s3 origin source - if you're using s3 for your assets.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6ed34543781537ee9dc47cec4ee592e4032c4b954e6e802eef6b3a299c6ddbf")
    override fun s3OriginSource(s3OriginSource: S3OriginConfig.Builder.() -> Unit): Unit =
        s3OriginSource(S3OriginConfig(s3OriginSource))

    public fun build(): software.amazon.awscdk.services.cloudfront.SourceConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.SourceConfiguration,
  ) : CdkObject(cdkObject), SourceConfiguration {
    /**
     * The behaviors associated with this source.
     *
     * At least one (default) behavior must be included.
     */
    override fun behaviors(): List<Behavior> = unwrap(this).getBehaviors().map(Behavior::wrap)

    /**
     * The number of times that CloudFront attempts to connect to the origin.
     *
     * You can specify 1, 2, or 3 as the number of attempts.
     *
     * Default: 3
     */
    override fun connectionAttempts(): Number? = unwrap(this).getConnectionAttempts()

    /**
     * The number of seconds that CloudFront waits when trying to establish a connection to the
     * origin.
     *
     * You can specify a number of seconds between 1 and 10 (inclusive).
     *
     * Default: cdk.Duration.seconds(10)
     */
    override fun connectionTimeout(): Duration? =
        unwrap(this).getConnectionTimeout()?.let(Duration::wrap)

    /**
     * A custom origin source - for all non-s3 sources.
     */
    override fun customOriginSource(): CustomOriginConfig? =
        unwrap(this).getCustomOriginSource()?.let(CustomOriginConfig::wrap)

    /**
     * HTTP status code to failover to second origin.
     *
     * Default: [500, 502, 503, 504]
     */
    override fun failoverCriteriaStatusCodes(): List<FailoverStatusCode> =
        unwrap(this).getFailoverCriteriaStatusCodes()?.map(FailoverStatusCode::wrap) ?: emptyList()

    /**
     * A custom origin source for failover in case the s3OriginSource returns invalid status code.
     *
     * Default: - no failover configuration
     */
    override fun failoverCustomOriginSource(): CustomOriginConfig? =
        unwrap(this).getFailoverCustomOriginSource()?.let(CustomOriginConfig::wrap)

    /**
     * An s3 origin source for failover in case the s3OriginSource returns invalid status code.
     *
     * Default: - no failover configuration
     */
    override fun failoverS3OriginSource(): S3OriginConfig? =
        unwrap(this).getFailoverS3OriginSource()?.let(S3OriginConfig::wrap)

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
     * An s3 origin source - if you're using s3 for your assets.
     */
    override fun s3OriginSource(): S3OriginConfig? =
        unwrap(this).getS3OriginSource()?.let(S3OriginConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SourceConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.SourceConfiguration):
        SourceConfiguration = CdkObjectWrappers.wrap(cdkObject) as? SourceConfiguration ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceConfiguration):
        software.amazon.awscdk.services.cloudfront.SourceConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.SourceConfiguration
  }
}
