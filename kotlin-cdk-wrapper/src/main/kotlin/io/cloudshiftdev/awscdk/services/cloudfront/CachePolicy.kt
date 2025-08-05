@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A Cache Policy configuration.
 *
 * Example:
 *
 * ```
 * // Create the simple Origin
 * Bucket myBucket = new Bucket(this, "myBucket");
 * IOrigin s3Origin = S3BucketOrigin.withOriginAccessControl(myBucket,
 * S3BucketOriginWithOACProps.builder()
 * .originAccessLevels(List.of(AccessLevel.READ, AccessLevel.LIST))
 * .build());
 * // Create the Distribution construct
 * Distribution myMultiTenantDistribution = Distribution.Builder.create(this, "distribution")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(s3Origin)
 * .build())
 * .defaultRootObject("index.html")
 * .build();
 * // Access the underlying L1 CfnDistribution to configure SaaS Manager properties which are not
 * yet available in the L2 Distribution construct
 * CfnDistribution cfnDistribution =
 * (CfnDistribution)myMultiTenantDistribution.getNode().getDefaultChild();
 * DefaultCacheBehaviorProperty defaultCacheBehavior = DefaultCacheBehaviorProperty.builder()
 * .targetOriginId(myBucket.getBucketArn())
 * .viewerProtocolPolicy("allow-all")
 * .compress(false)
 * .allowedMethods(List.of("GET", "HEAD"))
 * .cachePolicyId(CachePolicy.CACHING_OPTIMIZED.getCachePolicyId())
 * .build();
 * // Create the updated distributionConfig
 * DistributionConfigProperty distributionConfig = DistributionConfigProperty.builder()
 * .defaultCacheBehavior(defaultCacheBehavior)
 * .enabled(true)
 * // the properties below are optional
 * .connectionMode("tenant-only")
 * .origins(List.of(OriginProperty.builder()
 * .id(myBucket.getBucketArn())
 * .domainName(myBucket.getBucketDomainName())
 * .s3OriginConfig(S3OriginConfigProperty.builder().build())
 * .originPath("/{{tenantName}}")
 * .build()))
 * .tenantConfig(TenantConfigProperty.builder()
 * .parameterDefinitions(List.of(ParameterDefinitionProperty.builder()
 * .definition(DefinitionProperty.builder()
 * .stringSchema(StringSchemaProperty.builder()
 * .required(false)
 * // the properties below are optional
 * .comment("tenantName")
 * .defaultValue("root")
 * .build())
 * .build())
 * .name("tenantName")
 * .build()))
 * .build())
 * .build();
 * // Override the distribution configuration to enable multi-tenancy.
 * cfnDistribution.getDistributionConfig() = distributionConfig;
 * // Create a distribution tenant using an existing ACM certificate
 * CfnDistributionTenant cfnDistributionTenant = CfnDistributionTenant.Builder.create(this,
 * "distribution-tenant")
 * .distributionId(myMultiTenantDistribution.getDistributionId())
 * .domains(List.of("my-tenant.my.domain.com"))
 * .name("my-tenant")
 * .enabled(true)
 * .parameters(List.of(ParameterProperty.builder()
 * .name("tenantName")
 * .value("app")
 * .build()))
 * .customizations(CustomizationsProperty.builder()
 * .certificate(CertificateProperty.builder()
 * .arn("REPLACE_WITH_ARN")
 * .build())
 * .build())
 * .build();
 * ```
 */
public open class CachePolicy(
  cdkObject: software.amazon.awscdk.services.cloudfront.CachePolicy,
) : Resource(cdkObject),
    ICachePolicy {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.cloudfront.CachePolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CachePolicyProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.CachePolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CachePolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CachePolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CachePolicyProps(props)
  )

  /**
   * The ID of the cache policy.
   */
  public override fun cachePolicyId(): String = unwrap(this).getCachePolicyId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CachePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A unique name to identify the cache policy.
     *
     * The name must only include '-', '_', or alphanumeric characters.
     *
     * Default: - generated from the `id`
     *
     * @param cachePolicyName A unique name to identify the cache policy. 
     */
    public fun cachePolicyName(cachePolicyName: String)

    /**
     * A comment to describe the cache policy.
     *
     * The comment cannot be longer than 128 characters.
     *
     * Default: - no comment
     *
     * @param comment A comment to describe the cache policy. 
     */
    public fun comment(comment: String)

    /**
     * Determines whether any cookies in viewer requests are included in the cache key and
     * automatically included in requests that CloudFront sends to the origin.
     *
     * Default: CacheCookieBehavior.none()
     *
     * @param cookieBehavior Determines whether any cookies in viewer requests are included in the
     * cache key and automatically included in requests that CloudFront sends to the origin. 
     */
    public fun cookieBehavior(cookieBehavior: CacheCookieBehavior)

    /**
     * The default amount of time for objects to stay in the CloudFront cache.
     *
     * Only used when the origin does not send Cache-Control or Expires headers with the object.
     *
     * Default: - The greater of 1 day and ``minTtl``
     *
     * @param defaultTtl The default amount of time for objects to stay in the CloudFront cache. 
     */
    public fun defaultTtl(defaultTtl: Duration)

    /**
     * Whether to normalize and include the `Accept-Encoding` header in the cache key when the
     * `Accept-Encoding` header is 'br'.
     *
     * Default: false
     *
     * @param enableAcceptEncodingBrotli Whether to normalize and include the `Accept-Encoding`
     * header in the cache key when the `Accept-Encoding` header is 'br'. 
     */
    public fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean)

    /**
     * Whether to normalize and include the `Accept-Encoding` header in the cache key when the
     * `Accept-Encoding` header is 'gzip'.
     *
     * Default: false
     *
     * @param enableAcceptEncodingGzip Whether to normalize and include the `Accept-Encoding` header
     * in the cache key when the `Accept-Encoding` header is 'gzip'. 
     */
    public fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean)

    /**
     * Determines whether any HTTP headers are included in the cache key and automatically included
     * in requests that CloudFront sends to the origin.
     *
     * Default: CacheHeaderBehavior.none()
     *
     * @param headerBehavior Determines whether any HTTP headers are included in the cache key and
     * automatically included in requests that CloudFront sends to the origin. 
     */
    public fun headerBehavior(headerBehavior: CacheHeaderBehavior)

    /**
     * The maximum amount of time for objects to stay in the CloudFront cache.
     *
     * CloudFront uses this value only when the origin sends Cache-Control or Expires headers with
     * the object.
     *
     * Default: - The greater of 1 year and ``defaultTtl``
     *
     * @param maxTtl The maximum amount of time for objects to stay in the CloudFront cache. 
     */
    public fun maxTtl(maxTtl: Duration)

    /**
     * The minimum amount of time for objects to stay in the CloudFront cache.
     *
     * Default: Duration.seconds(0)
     *
     * @param minTtl The minimum amount of time for objects to stay in the CloudFront cache. 
     */
    public fun minTtl(minTtl: Duration)

    /**
     * Determines whether any query strings are included in the cache key and automatically included
     * in requests that CloudFront sends to the origin.
     *
     * Default: CacheQueryStringBehavior.none()
     *
     * @param queryStringBehavior Determines whether any query strings are included in the cache key
     * and automatically included in requests that CloudFront sends to the origin. 
     */
    public fun queryStringBehavior(queryStringBehavior: CacheQueryStringBehavior)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CachePolicy.Builder =
        software.amazon.awscdk.services.cloudfront.CachePolicy.Builder.create(scope, id)

    /**
     * A unique name to identify the cache policy.
     *
     * The name must only include '-', '_', or alphanumeric characters.
     *
     * Default: - generated from the `id`
     *
     * @param cachePolicyName A unique name to identify the cache policy. 
     */
    override fun cachePolicyName(cachePolicyName: String) {
      cdkBuilder.cachePolicyName(cachePolicyName)
    }

    /**
     * A comment to describe the cache policy.
     *
     * The comment cannot be longer than 128 characters.
     *
     * Default: - no comment
     *
     * @param comment A comment to describe the cache policy. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * Determines whether any cookies in viewer requests are included in the cache key and
     * automatically included in requests that CloudFront sends to the origin.
     *
     * Default: CacheCookieBehavior.none()
     *
     * @param cookieBehavior Determines whether any cookies in viewer requests are included in the
     * cache key and automatically included in requests that CloudFront sends to the origin. 
     */
    override fun cookieBehavior(cookieBehavior: CacheCookieBehavior) {
      cdkBuilder.cookieBehavior(cookieBehavior.let(CacheCookieBehavior.Companion::unwrap))
    }

    /**
     * The default amount of time for objects to stay in the CloudFront cache.
     *
     * Only used when the origin does not send Cache-Control or Expires headers with the object.
     *
     * Default: - The greater of 1 day and ``minTtl``
     *
     * @param defaultTtl The default amount of time for objects to stay in the CloudFront cache. 
     */
    override fun defaultTtl(defaultTtl: Duration) {
      cdkBuilder.defaultTtl(defaultTtl.let(Duration.Companion::unwrap))
    }

    /**
     * Whether to normalize and include the `Accept-Encoding` header in the cache key when the
     * `Accept-Encoding` header is 'br'.
     *
     * Default: false
     *
     * @param enableAcceptEncodingBrotli Whether to normalize and include the `Accept-Encoding`
     * header in the cache key when the `Accept-Encoding` header is 'br'. 
     */
    override fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean) {
      cdkBuilder.enableAcceptEncodingBrotli(enableAcceptEncodingBrotli)
    }

    /**
     * Whether to normalize and include the `Accept-Encoding` header in the cache key when the
     * `Accept-Encoding` header is 'gzip'.
     *
     * Default: false
     *
     * @param enableAcceptEncodingGzip Whether to normalize and include the `Accept-Encoding` header
     * in the cache key when the `Accept-Encoding` header is 'gzip'. 
     */
    override fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean) {
      cdkBuilder.enableAcceptEncodingGzip(enableAcceptEncodingGzip)
    }

    /**
     * Determines whether any HTTP headers are included in the cache key and automatically included
     * in requests that CloudFront sends to the origin.
     *
     * Default: CacheHeaderBehavior.none()
     *
     * @param headerBehavior Determines whether any HTTP headers are included in the cache key and
     * automatically included in requests that CloudFront sends to the origin. 
     */
    override fun headerBehavior(headerBehavior: CacheHeaderBehavior) {
      cdkBuilder.headerBehavior(headerBehavior.let(CacheHeaderBehavior.Companion::unwrap))
    }

    /**
     * The maximum amount of time for objects to stay in the CloudFront cache.
     *
     * CloudFront uses this value only when the origin sends Cache-Control or Expires headers with
     * the object.
     *
     * Default: - The greater of 1 year and ``defaultTtl``
     *
     * @param maxTtl The maximum amount of time for objects to stay in the CloudFront cache. 
     */
    override fun maxTtl(maxTtl: Duration) {
      cdkBuilder.maxTtl(maxTtl.let(Duration.Companion::unwrap))
    }

    /**
     * The minimum amount of time for objects to stay in the CloudFront cache.
     *
     * Default: Duration.seconds(0)
     *
     * @param minTtl The minimum amount of time for objects to stay in the CloudFront cache. 
     */
    override fun minTtl(minTtl: Duration) {
      cdkBuilder.minTtl(minTtl.let(Duration.Companion::unwrap))
    }

    /**
     * Determines whether any query strings are included in the cache key and automatically included
     * in requests that CloudFront sends to the origin.
     *
     * Default: CacheQueryStringBehavior.none()
     *
     * @param queryStringBehavior Determines whether any query strings are included in the cache key
     * and automatically included in requests that CloudFront sends to the origin. 
     */
    override fun queryStringBehavior(queryStringBehavior: CacheQueryStringBehavior) {
      cdkBuilder.queryStringBehavior(queryStringBehavior.let(CacheQueryStringBehavior.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CachePolicy = cdkBuilder.build()
  }

  public companion object {
    public val AMPLIFY: ICachePolicy =
        ICachePolicy.wrap(software.amazon.awscdk.services.cloudfront.CachePolicy.AMPLIFY)

    public val CACHING_DISABLED: ICachePolicy =
        ICachePolicy.wrap(software.amazon.awscdk.services.cloudfront.CachePolicy.CACHING_DISABLED)

    public val CACHING_OPTIMIZED: ICachePolicy =
        ICachePolicy.wrap(software.amazon.awscdk.services.cloudfront.CachePolicy.CACHING_OPTIMIZED)

    public val CACHING_OPTIMIZED_FOR_UNCOMPRESSED_OBJECTS: ICachePolicy =
        ICachePolicy.wrap(software.amazon.awscdk.services.cloudfront.CachePolicy.CACHING_OPTIMIZED_FOR_UNCOMPRESSED_OBJECTS)

    public val ELEMENTAL_MEDIA_PACKAGE: ICachePolicy =
        ICachePolicy.wrap(software.amazon.awscdk.services.cloudfront.CachePolicy.ELEMENTAL_MEDIA_PACKAGE)

    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.cloudfront.CachePolicy.PROPERTY_INJECTION_ID

    public val USE_ORIGIN_CACHE_CONTROL_HEADERS: ICachePolicy =
        ICachePolicy.wrap(software.amazon.awscdk.services.cloudfront.CachePolicy.USE_ORIGIN_CACHE_CONTROL_HEADERS)

    public val USE_ORIGIN_CACHE_CONTROL_HEADERS_QUERY_STRINGS: ICachePolicy =
        ICachePolicy.wrap(software.amazon.awscdk.services.cloudfront.CachePolicy.USE_ORIGIN_CACHE_CONTROL_HEADERS_QUERY_STRINGS)

    public fun fromCachePolicyId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      cachePolicyId: String,
    ): ICachePolicy =
        software.amazon.awscdk.services.cloudfront.CachePolicy.fromCachePolicyId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, cachePolicyId).let(ICachePolicy::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CachePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CachePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CachePolicy):
        CachePolicy = CachePolicy(cdkObject)

    internal fun unwrap(wrapped: CachePolicy):
        software.amazon.awscdk.services.cloudfront.CachePolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudfront.CachePolicy
  }
}
