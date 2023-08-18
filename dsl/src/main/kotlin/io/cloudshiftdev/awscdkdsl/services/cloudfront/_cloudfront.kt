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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.AddBehaviorOptions
import software.amazon.awscdk.services.cloudfront.Behavior
import software.amazon.awscdk.services.cloudfront.BehaviorOptions
import software.amazon.awscdk.services.cloudfront.CachePolicy
import software.amazon.awscdk.services.cloudfront.CachePolicyProps
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy
import software.amazon.awscdk.services.cloudfront.CfnCachePolicyProps
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentityProps
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicyProps
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.amazon.awscdk.services.cloudfront.CfnDistributionProps
import software.amazon.awscdk.services.cloudfront.CfnFunction
import software.amazon.awscdk.services.cloudfront.CfnFunctionProps
import software.amazon.awscdk.services.cloudfront.CfnKeyGroup
import software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscriptionProps
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControlProps
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps
import software.amazon.awscdk.services.cloudfront.CfnPublicKey
import software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfigProps
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicyProps
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistribution
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionAttributes
import software.amazon.awscdk.services.cloudfront.CloudFrontWebDistributionProps
import software.amazon.awscdk.services.cloudfront.CustomOriginConfig
import software.amazon.awscdk.services.cloudfront.Distribution
import software.amazon.awscdk.services.cloudfront.DistributionAttributes
import software.amazon.awscdk.services.cloudfront.DistributionProps
import software.amazon.awscdk.services.cloudfront.EdgeLambda
import software.amazon.awscdk.services.cloudfront.ErrorResponse
import software.amazon.awscdk.services.cloudfront.FileCodeOptions
import software.amazon.awscdk.services.cloudfront.Function
import software.amazon.awscdk.services.cloudfront.FunctionAssociation
import software.amazon.awscdk.services.cloudfront.FunctionAttributes
import software.amazon.awscdk.services.cloudfront.FunctionProps
import software.amazon.awscdk.services.cloudfront.KeyGroup
import software.amazon.awscdk.services.cloudfront.KeyGroupProps
import software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation
import software.amazon.awscdk.services.cloudfront.LoggingConfiguration
import software.amazon.awscdk.services.cloudfront.OriginAccessIdentity
import software.amazon.awscdk.services.cloudfront.OriginAccessIdentityProps
import software.amazon.awscdk.services.cloudfront.OriginBindConfig
import software.amazon.awscdk.services.cloudfront.OriginBindOptions
import software.amazon.awscdk.services.cloudfront.OriginFailoverConfig
import software.amazon.awscdk.services.cloudfront.OriginOptions
import software.amazon.awscdk.services.cloudfront.OriginProps
import software.amazon.awscdk.services.cloudfront.OriginRequestPolicy
import software.amazon.awscdk.services.cloudfront.OriginRequestPolicyProps
import software.amazon.awscdk.services.cloudfront.PublicKey
import software.amazon.awscdk.services.cloudfront.PublicKeyProps
import software.amazon.awscdk.services.cloudfront.ResponseCustomHeader
import software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior
import software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy
import software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions
import software.amazon.awscdk.services.cloudfront.ResponseHeadersCorsBehavior
import software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions
import software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy
import software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicyProps
import software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy
import software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity
import software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection
import software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior
import software.amazon.awscdk.services.cloudfront.S3OriginConfig
import software.amazon.awscdk.services.cloudfront.SourceConfiguration
import software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions
import software.constructs.Construct

public object cloudfront {
    /**
     * Options for adding a new behavior to a Distribution.
     *
     * Example:
     * ```
     * // Add a behavior to a Distribution after initial creation.
     * Bucket myBucket;
     * Distribution myWebDistribution;
     * myWebDistribution.addBehavior("/images/ *.jpg", new S3Origin(myBucket),
     * AddBehaviorOptions.builder()
     * .viewerProtocolPolicy(ViewerProtocolPolicy.REDIRECT_TO_HTTPS)
     * .build());
     * ```
     */
    public inline fun addBehaviorOptions(
        block: AddBehaviorOptionsDsl.() -> Unit = {}
    ): AddBehaviorOptions {
        val builder = AddBehaviorOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A CloudFront behavior wrapper.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.cloudfront.*;
     * import software.amazon.awscdk.services.lambda.*;
     * Function function_;
     * KeyGroup keyGroup;
     * Version version;
     * Behavior behavior = Behavior.builder()
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
     * .build();
     * ```
     */
    public inline fun behavior(block: BehaviorDsl.() -> Unit = {}): Behavior {
        val builder = BehaviorDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for creating a new behavior.
     *
     * Example:
     * ```
     * Bucket s3Bucket;
     * // Add a cloudfront Function to a Distribution
     * Function cfFunction = Function.Builder.create(this, "Function")
     * .code(FunctionCode.fromInline("function handler(event) { return event.request }"))
     * .build();
     * Distribution.Builder.create(this, "distro")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(new S3Origin(s3Bucket))
     * .functionAssociations(List.of(FunctionAssociation.builder()
     * .function(cfFunction)
     * .eventType(FunctionEventType.VIEWER_REQUEST)
     * .build()))
     * .build())
     * .build();
     * ```
     */
    public inline fun behaviorOptions(block: BehaviorOptionsDsl.() -> Unit = {}): BehaviorOptions {
        val builder = BehaviorOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Cache Policy configuration.
     *
     * Example:
     * ```
     * // Using an existing cache policy for a Distribution
     * S3Origin bucketOrigin;
     * Distribution.Builder.create(this, "myDistManagedPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .cachePolicy(CachePolicy.CACHING_OPTIMIZED)
     * .build())
     * .build();
     * ```
     */
    public inline fun cachePolicy(
        scope: Construct,
        id: String,
        block: CachePolicyDsl.() -> Unit = {},
    ): CachePolicy {
        val builder = CachePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating a Cache Policy.
     *
     * Example:
     * ```
     * // Creating a custom cache policy for a Distribution -- all parameters optional
     * S3Origin bucketOrigin;
     * CachePolicy myCachePolicy = CachePolicy.Builder.create(this, "myCachePolicy")
     * .cachePolicyName("MyPolicy")
     * .comment("A default policy")
     * .defaultTtl(Duration.days(2))
     * .minTtl(Duration.minutes(1))
     * .maxTtl(Duration.days(10))
     * .cookieBehavior(CacheCookieBehavior.all())
     * .headerBehavior(CacheHeaderBehavior.allowList("X-CustomHeader"))
     * .queryStringBehavior(CacheQueryStringBehavior.denyList("username"))
     * .enableAcceptEncodingGzip(true)
     * .enableAcceptEncodingBrotli(true)
     * .build();
     * Distribution.Builder.create(this, "myDistCustomPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .cachePolicy(myCachePolicy)
     * .build())
     * .build();
     * ```
     */
    public inline fun cachePolicyProps(
        block: CachePolicyPropsDsl.() -> Unit = {}
    ): CachePolicyProps {
        val builder = CachePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A cache policy.
     *
     * When it's attached to a cache behavior, the cache policy determines the following:
     * * The values that CloudFront includes in the cache key. These values can include HTTP
     *   headers, cookies, and URL query strings. CloudFront uses the cache key to find an object in
     *   its cache that it can return to the viewer.
     * * The default, minimum, and maximum time to live (TTL) values that you want objects to stay
     *   in the CloudFront cache.
     *
     * The headers, cookies, and query strings that are included in the cache key are also included
     * in requests that CloudFront sends to the origin. CloudFront sends a request when it can't
     * find a valid object in its cache that matches the request's cache key. If you want to send
     * values to the origin but *not* include them in the cache key, use `OriginRequestPolicy` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnCachePolicy cfnCachePolicy = CfnCachePolicy.Builder.create(this, "MyCfnCachePolicy")
     * .cachePolicyConfig(CachePolicyConfigProperty.builder()
     * .defaultTtl(123)
     * .maxTtl(123)
     * .minTtl(123)
     * .name("name")
     * .parametersInCacheKeyAndForwardedToOrigin(ParametersInCacheKeyAndForwardedToOriginProperty.builder()
     * .cookiesConfig(CookiesConfigProperty.builder()
     * .cookieBehavior("cookieBehavior")
     * // the properties below are optional
     * .cookies(List.of("cookies"))
     * .build())
     * .enableAcceptEncodingGzip(false)
     * .headersConfig(HeadersConfigProperty.builder()
     * .headerBehavior("headerBehavior")
     * // the properties below are optional
     * .headers(List.of("headers"))
     * .build())
     * .queryStringsConfig(QueryStringsConfigProperty.builder()
     * .queryStringBehavior("queryStringBehavior")
     * // the properties below are optional
     * .queryStrings(List.of("queryStrings"))
     * .build())
     * // the properties below are optional
     * .enableAcceptEncodingBrotli(false)
     * .build())
     * // the properties below are optional
     * .comment("comment")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cachepolicy.html)
     */
    public inline fun cfnCachePolicy(
        scope: Construct,
        id: String,
        block: CfnCachePolicyDsl.() -> Unit = {},
    ): CfnCachePolicy {
        val builder = CfnCachePolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A cache policy configuration.
     *
     * This configuration determines the following:
     * * The values that CloudFront includes in the cache key. These values can include HTTP
     *   headers, cookies, and URL query strings. CloudFront uses the cache key to find an object in
     *   its cache that it can return to the viewer.
     * * The default, minimum, and maximum time to live (TTL) values that you want objects to stay
     *   in the CloudFront cache.
     *
     * The headers, cookies, and query strings that are included in the cache key are also included
     * in requests that CloudFront sends to the origin. CloudFront sends a request when it can't
     * find a valid object in its cache that matches the request's cache key. If you want to send
     * values to the origin but *not* include them in the cache key, use `OriginRequestPolicy` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CachePolicyConfigProperty cachePolicyConfigProperty = CachePolicyConfigProperty.builder()
     * .defaultTtl(123)
     * .maxTtl(123)
     * .minTtl(123)
     * .name("name")
     * .parametersInCacheKeyAndForwardedToOrigin(ParametersInCacheKeyAndForwardedToOriginProperty.builder()
     * .cookiesConfig(CookiesConfigProperty.builder()
     * .cookieBehavior("cookieBehavior")
     * // the properties below are optional
     * .cookies(List.of("cookies"))
     * .build())
     * .enableAcceptEncodingGzip(false)
     * .headersConfig(HeadersConfigProperty.builder()
     * .headerBehavior("headerBehavior")
     * // the properties below are optional
     * .headers(List.of("headers"))
     * .build())
     * .queryStringsConfig(QueryStringsConfigProperty.builder()
     * .queryStringBehavior("queryStringBehavior")
     * // the properties below are optional
     * .queryStrings(List.of("queryStrings"))
     * .build())
     * // the properties below are optional
     * .enableAcceptEncodingBrotli(false)
     * .build())
     * // the properties below are optional
     * .comment("comment")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cachepolicyconfig.html)
     */
    public inline fun cfnCachePolicyCachePolicyConfigProperty(
        block: CfnCachePolicyCachePolicyConfigPropertyDsl.() -> Unit = {}
    ): CfnCachePolicy.CachePolicyConfigProperty {
        val builder = CfnCachePolicyCachePolicyConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that determines whether any cookies in viewer requests (and if so, which cookies)
     * are included in the cache key and in requests that CloudFront sends to the origin.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CookiesConfigProperty cookiesConfigProperty = CookiesConfigProperty.builder()
     * .cookieBehavior("cookieBehavior")
     * // the properties below are optional
     * .cookies(List.of("cookies"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-cookiesconfig.html)
     */
    public inline fun cfnCachePolicyCookiesConfigProperty(
        block: CfnCachePolicyCookiesConfigPropertyDsl.() -> Unit = {}
    ): CfnCachePolicy.CookiesConfigProperty {
        val builder = CfnCachePolicyCookiesConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that determines whether any HTTP headers (and if so, which headers) are included in
     * the cache key and in requests that CloudFront sends to the origin.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * HeadersConfigProperty headersConfigProperty = HeadersConfigProperty.builder()
     * .headerBehavior("headerBehavior")
     * // the properties below are optional
     * .headers(List.of("headers"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-headersconfig.html)
     */
    public inline fun cfnCachePolicyHeadersConfigProperty(
        block: CfnCachePolicyHeadersConfigPropertyDsl.() -> Unit = {}
    ): CfnCachePolicy.HeadersConfigProperty {
        val builder = CfnCachePolicyHeadersConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This object determines the values that CloudFront includes in the cache key.
     *
     * These values can include HTTP headers, cookies, and URL query strings. CloudFront uses the
     * cache key to find an object in its cache that it can return to the viewer.
     *
     * The headers, cookies, and query strings that are included in the cache key are also included
     * in requests that CloudFront sends to the origin. CloudFront sends a request when it can't
     * find an object in its cache that matches the request's cache key. If you want to send values
     * to the origin but *not* include them in the cache key, use `OriginRequestPolicy` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * ParametersInCacheKeyAndForwardedToOriginProperty
     * parametersInCacheKeyAndForwardedToOriginProperty =
     * ParametersInCacheKeyAndForwardedToOriginProperty.builder()
     * .cookiesConfig(CookiesConfigProperty.builder()
     * .cookieBehavior("cookieBehavior")
     * // the properties below are optional
     * .cookies(List.of("cookies"))
     * .build())
     * .enableAcceptEncodingGzip(false)
     * .headersConfig(HeadersConfigProperty.builder()
     * .headerBehavior("headerBehavior")
     * // the properties below are optional
     * .headers(List.of("headers"))
     * .build())
     * .queryStringsConfig(QueryStringsConfigProperty.builder()
     * .queryStringBehavior("queryStringBehavior")
     * // the properties below are optional
     * .queryStrings(List.of("queryStrings"))
     * .build())
     * // the properties below are optional
     * .enableAcceptEncodingBrotli(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-parametersincachekeyandforwardedtoorigin.html)
     */
    public inline fun cfnCachePolicyParametersInCacheKeyAndForwardedToOriginProperty(
        block: CfnCachePolicyParametersInCacheKeyAndForwardedToOriginPropertyDsl.() -> Unit = {}
    ): CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty {
        val builder = CfnCachePolicyParametersInCacheKeyAndForwardedToOriginPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCachePolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnCachePolicyProps cfnCachePolicyProps = CfnCachePolicyProps.builder()
     * .cachePolicyConfig(CachePolicyConfigProperty.builder()
     * .defaultTtl(123)
     * .maxTtl(123)
     * .minTtl(123)
     * .name("name")
     * .parametersInCacheKeyAndForwardedToOrigin(ParametersInCacheKeyAndForwardedToOriginProperty.builder()
     * .cookiesConfig(CookiesConfigProperty.builder()
     * .cookieBehavior("cookieBehavior")
     * // the properties below are optional
     * .cookies(List.of("cookies"))
     * .build())
     * .enableAcceptEncodingGzip(false)
     * .headersConfig(HeadersConfigProperty.builder()
     * .headerBehavior("headerBehavior")
     * // the properties below are optional
     * .headers(List.of("headers"))
     * .build())
     * .queryStringsConfig(QueryStringsConfigProperty.builder()
     * .queryStringBehavior("queryStringBehavior")
     * // the properties below are optional
     * .queryStrings(List.of("queryStrings"))
     * .build())
     * // the properties below are optional
     * .enableAcceptEncodingBrotli(false)
     * .build())
     * // the properties below are optional
     * .comment("comment")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cachepolicy.html)
     */
    public inline fun cfnCachePolicyProps(
        block: CfnCachePolicyPropsDsl.() -> Unit = {}
    ): CfnCachePolicyProps {
        val builder = CfnCachePolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that determines whether any URL query strings in viewer requests (and if so, which
     * query strings) are included in the cache key and in requests that CloudFront sends to the
     * origin.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * QueryStringsConfigProperty queryStringsConfigProperty = QueryStringsConfigProperty.builder()
     * .queryStringBehavior("queryStringBehavior")
     * // the properties below are optional
     * .queryStrings(List.of("queryStrings"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cachepolicy-querystringsconfig.html)
     */
    public inline fun cfnCachePolicyQueryStringsConfigProperty(
        block: CfnCachePolicyQueryStringsConfigPropertyDsl.() -> Unit = {}
    ): CfnCachePolicy.QueryStringsConfigProperty {
        val builder = CfnCachePolicyQueryStringsConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The request to create a new origin access identity (OAI).
     *
     * An origin access identity is a special CloudFront user that you can associate with Amazon S3
     * origins, so that you can secure all or just some of your Amazon S3 content. For more
     * information, see
     * [Restricting Access to Amazon S3 Content by Using an Origin Access Identity](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnCloudFrontOriginAccessIdentity cfnCloudFrontOriginAccessIdentity =
     * CfnCloudFrontOriginAccessIdentity.Builder.create(this, "MyCfnCloudFrontOriginAccessIdentity")
     * .cloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfigProperty.builder()
     * .comment("comment")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html)
     */
    public inline fun cfnCloudFrontOriginAccessIdentity(
        scope: Construct,
        id: String,
        block: CfnCloudFrontOriginAccessIdentityDsl.() -> Unit = {},
    ): CfnCloudFrontOriginAccessIdentity {
        val builder = CfnCloudFrontOriginAccessIdentityDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Origin access identity configuration.
     *
     * Send a `GET` request to the `/ *CloudFront API version* /CloudFront/identity ID/config`
     * resource.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CloudFrontOriginAccessIdentityConfigProperty cloudFrontOriginAccessIdentityConfigProperty =
     * CloudFrontOriginAccessIdentityConfigProperty.builder()
     * .comment("comment")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-cloudfrontoriginaccessidentity-cloudfrontoriginaccessidentityconfig.html)
     */
    public inline fun cfnCloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfigProperty(
        block:
            CfnCloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfigPropertyDsl.(
            ) -> Unit =
            {}
    ): CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty {
        val builder =
            CfnCloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCloudFrontOriginAccessIdentity`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnCloudFrontOriginAccessIdentityProps cfnCloudFrontOriginAccessIdentityProps =
     * CfnCloudFrontOriginAccessIdentityProps.builder()
     * .cloudFrontOriginAccessIdentityConfig(CloudFrontOriginAccessIdentityConfigProperty.builder()
     * .comment("comment")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-cloudfrontoriginaccessidentity.html)
     */
    public inline fun cfnCloudFrontOriginAccessIdentityProps(
        block: CfnCloudFrontOriginAccessIdentityPropsDsl.() -> Unit = {}
    ): CfnCloudFrontOriginAccessIdentityProps {
        val builder = CfnCloudFrontOriginAccessIdentityPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a continuous deployment policy that routes a subset of production traffic from a
     * primary distribution to a staging distribution.
     *
     * After you create and update a staging distribution, you can use a continuous deployment
     * policy to incrementally move traffic to the staging distribution. This enables you to test
     * changes to a distribution's configuration before moving all of your production traffic to the
     * new configuration.
     *
     * For more information, see
     * [Using CloudFront continuous deployment to safely test CDN configuration changes](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/continuous-deployment.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnContinuousDeploymentPolicy cfnContinuousDeploymentPolicy =
     * CfnContinuousDeploymentPolicy.Builder.create(this, "MyCfnContinuousDeploymentPolicy")
     * .continuousDeploymentPolicyConfig(ContinuousDeploymentPolicyConfigProperty.builder()
     * .enabled(false)
     * .stagingDistributionDnsNames(List.of("stagingDistributionDnsNames"))
     * // the properties below are optional
     * .trafficConfig(TrafficConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .singleHeaderConfig(SingleHeaderConfigProperty.builder()
     * .header("header")
     * .value("value")
     * .build())
     * .singleWeightConfig(SingleWeightConfigProperty.builder()
     * .weight(123)
     * // the properties below are optional
     * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
     * .idleTtl(123)
     * .maximumTtl(123)
     * .build())
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html)
     */
    public inline fun cfnContinuousDeploymentPolicy(
        scope: Construct,
        id: String,
        block: CfnContinuousDeploymentPolicyDsl.() -> Unit = {},
    ): CfnContinuousDeploymentPolicy {
        val builder = CfnContinuousDeploymentPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the configuration for a continuous deployment policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * ContinuousDeploymentPolicyConfigProperty continuousDeploymentPolicyConfigProperty =
     * ContinuousDeploymentPolicyConfigProperty.builder()
     * .enabled(false)
     * .stagingDistributionDnsNames(List.of("stagingDistributionDnsNames"))
     * // the properties below are optional
     * .trafficConfig(TrafficConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .singleHeaderConfig(SingleHeaderConfigProperty.builder()
     * .header("header")
     * .value("value")
     * .build())
     * .singleWeightConfig(SingleWeightConfigProperty.builder()
     * .weight(123)
     * // the properties below are optional
     * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
     * .idleTtl(123)
     * .maximumTtl(123)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig.html)
     */
    public inline fun cfnContinuousDeploymentPolicyContinuousDeploymentPolicyConfigProperty(
        block: CfnContinuousDeploymentPolicyContinuousDeploymentPolicyConfigPropertyDsl.() -> Unit =
            {}
    ): CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty {
        val builder = CfnContinuousDeploymentPolicyContinuousDeploymentPolicyConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnContinuousDeploymentPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnContinuousDeploymentPolicyProps cfnContinuousDeploymentPolicyProps =
     * CfnContinuousDeploymentPolicyProps.builder()
     * .continuousDeploymentPolicyConfig(ContinuousDeploymentPolicyConfigProperty.builder()
     * .enabled(false)
     * .stagingDistributionDnsNames(List.of("stagingDistributionDnsNames"))
     * // the properties below are optional
     * .trafficConfig(TrafficConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .singleHeaderConfig(SingleHeaderConfigProperty.builder()
     * .header("header")
     * .value("value")
     * .build())
     * .singleWeightConfig(SingleWeightConfigProperty.builder()
     * .weight(123)
     * // the properties below are optional
     * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
     * .idleTtl(123)
     * .maximumTtl(123)
     * .build())
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html)
     */
    public inline fun cfnContinuousDeploymentPolicyProps(
        block: CfnContinuousDeploymentPolicyPropsDsl.() -> Unit = {}
    ): CfnContinuousDeploymentPolicyProps {
        val builder = CfnContinuousDeploymentPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Session stickiness provides the ability to define multiple requests from a single viewer as a
     * single session.
     *
     * This prevents the potentially inconsistent experience of sending some of a given user's
     * requests to your staging distribution, while others are sent to your primary distribution.
     * Define the session duration using TTL values.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * SessionStickinessConfigProperty sessionStickinessConfigProperty =
     * SessionStickinessConfigProperty.builder()
     * .idleTtl(123)
     * .maximumTtl(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-sessionstickinessconfig.html)
     */
    public inline fun cfnContinuousDeploymentPolicySessionStickinessConfigProperty(
        block: CfnContinuousDeploymentPolicySessionStickinessConfigPropertyDsl.() -> Unit = {}
    ): CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty {
        val builder = CfnContinuousDeploymentPolicySessionStickinessConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines which HTTP requests are sent to the staging distribution.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * SingleHeaderConfigProperty singleHeaderConfigProperty = SingleHeaderConfigProperty.builder()
     * .header("header")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleheaderconfig.html)
     */
    public inline fun cfnContinuousDeploymentPolicySingleHeaderConfigProperty(
        block: CfnContinuousDeploymentPolicySingleHeaderConfigPropertyDsl.() -> Unit = {}
    ): CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty {
        val builder = CfnContinuousDeploymentPolicySingleHeaderConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This configuration determines the percentage of HTTP requests that are sent to the staging
     * distribution.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * SingleWeightConfigProperty singleWeightConfigProperty = SingleWeightConfigProperty.builder()
     * .weight(123)
     * // the properties below are optional
     * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
     * .idleTtl(123)
     * .maximumTtl(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleweightconfig.html)
     */
    public inline fun cfnContinuousDeploymentPolicySingleWeightConfigProperty(
        block: CfnContinuousDeploymentPolicySingleWeightConfigPropertyDsl.() -> Unit = {}
    ): CfnContinuousDeploymentPolicy.SingleWeightConfigProperty {
        val builder = CfnContinuousDeploymentPolicySingleWeightConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The traffic configuration of your continuous deployment.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * TrafficConfigProperty trafficConfigProperty = TrafficConfigProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .singleHeaderConfig(SingleHeaderConfigProperty.builder()
     * .header("header")
     * .value("value")
     * .build())
     * .singleWeightConfig(SingleWeightConfigProperty.builder()
     * .weight(123)
     * // the properties below are optional
     * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
     * .idleTtl(123)
     * .maximumTtl(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-trafficconfig.html)
     */
    public inline fun cfnContinuousDeploymentPolicyTrafficConfigProperty(
        block: CfnContinuousDeploymentPolicyTrafficConfigPropertyDsl.() -> Unit = {}
    ): CfnContinuousDeploymentPolicy.TrafficConfigProperty {
        val builder = CfnContinuousDeploymentPolicyTrafficConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A distribution tells CloudFront where you want content to be delivered from, and the details
     * about how to track and manage content delivery.
     *
     * Example:
     * ```
     * Bucket sourceBucket;
     * Distribution myDistribution = Distribution.Builder.create(this, "MyCfWebDistribution")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(new S3Origin(sourceBucket))
     * .build())
     * .build();
     * CfnDistribution cfnDistribution = (CfnDistribution)myDistribution.getNode().getDefaultChild();
     * cfnDistribution.overrideLogicalId("MyDistributionCFDistribution3H55TI9Q");
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html)
     */
    public inline fun cfnDistribution(
        scope: Construct,
        id: String,
        block: CfnDistributionDsl.() -> Unit = {},
    ): CfnDistribution {
        val builder = CfnDistributionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that describes how CloudFront processes requests.
     *
     * You must create at least as many cache behaviors (including the default cache behavior) as
     * you have origins if you want CloudFront to serve objects from all of the origins. Each cache
     * behavior specifies the one origin from which you want CloudFront to get objects. If you have
     * two origins and only the default cache behavior, the default cache behavior will cause
     * CloudFront to get objects from one of the origins, but the other origin is never used.
     *
     * For the current quota (formerly known as limit) on the number of cache behaviors that you can
     * add to a distribution, see
     * [Quotas](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/cloudfront-limits.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you don't want to specify any cache behaviors, include only an empty `CacheBehaviors`
     * element. Don't include an empty `CacheBehavior` element because this is invalid.
     *
     * To delete all cache behaviors in an existing distribution, update the distribution
     * configuration and include only an empty `CacheBehaviors` element.
     *
     * To add, change, or remove one or more cache behaviors, update the distribution configuration
     * and specify all of the cache behaviors that you want to include in the updated distribution.
     *
     * For more information about cache behaviors, see
     * [Cache Behavior Settings](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesCacheBehavior)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CacheBehaviorProperty cacheBehaviorProperty = CacheBehaviorProperty.builder()
     * .pathPattern("pathPattern")
     * .targetOriginId("targetOriginId")
     * .viewerProtocolPolicy("viewerProtocolPolicy")
     * // the properties below are optional
     * .allowedMethods(List.of("allowedMethods"))
     * .cachedMethods(List.of("cachedMethods"))
     * .cachePolicyId("cachePolicyId")
     * .compress(false)
     * .defaultTtl(123)
     * .fieldLevelEncryptionId("fieldLevelEncryptionId")
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
     * .functionAssociations(List.of(FunctionAssociationProperty.builder()
     * .eventType("eventType")
     * .functionArn("functionArn")
     * .build()))
     * .lambdaFunctionAssociations(List.of(LambdaFunctionAssociationProperty.builder()
     * .eventType("eventType")
     * .includeBody(false)
     * .lambdaFunctionArn("lambdaFunctionArn")
     * .build()))
     * .maxTtl(123)
     * .minTtl(123)
     * .originRequestPolicyId("originRequestPolicyId")
     * .realtimeLogConfigArn("realtimeLogConfigArn")
     * .responseHeadersPolicyId("responseHeadersPolicyId")
     * .smoothStreaming(false)
     * .trustedKeyGroups(List.of("trustedKeyGroups"))
     * .trustedSigners(List.of("trustedSigners"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cachebehavior.html)
     */
    public inline fun cfnDistributionCacheBehaviorProperty(
        block: CfnDistributionCacheBehaviorPropertyDsl.() -> Unit = {}
    ): CfnDistribution.CacheBehaviorProperty {
        val builder = CfnDistributionCacheBehaviorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This field is deprecated.
     *
     * We recommend that you use a cache policy or an origin request policy instead of this field.
     *
     * If you want to include cookies in the cache key, use a cache policy. For more information,
     * see
     * [Creating cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to send cookies to the origin but not include them in the cache key, use an
     * origin request policy. For more information, see
     * [Creating origin request policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * A complex type that specifies whether you want CloudFront to forward cookies to the origin
     * and, if so, which ones. For more information about forwarding cookies to the origin, see
     * [How CloudFront Forwards, Caches, and Logs Cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Cookies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CookiesProperty cookiesProperty = CookiesProperty.builder()
     * .forward("forward")
     * // the properties below are optional
     * .whitelistedNames(List.of("whitelistedNames"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html)
     */
    public inline fun cfnDistributionCookiesProperty(
        block: CfnDistributionCookiesPropertyDsl.() -> Unit = {}
    ): CfnDistribution.CookiesProperty {
        val builder = CfnDistributionCookiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that controls:.
     * * Whether CloudFront replaces HTTP status codes in the 4xx and 5xx range with custom error
     *   messages before returning the response to the viewer.
     * * How long CloudFront caches HTTP status codes in the 4xx and 5xx range.
     *
     * For more information about custom error pages, see
     * [Customizing Error Responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/custom-error-pages.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CustomErrorResponseProperty customErrorResponseProperty = CustomErrorResponseProperty.builder()
     * .errorCode(123)
     * // the properties below are optional
     * .errorCachingMinTtl(123)
     * .responseCode(123)
     * .responsePagePath("responsePagePath")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html)
     */
    public inline fun cfnDistributionCustomErrorResponseProperty(
        block: CfnDistributionCustomErrorResponsePropertyDsl.() -> Unit = {}
    ): CfnDistribution.CustomErrorResponseProperty {
        val builder = CfnDistributionCustomErrorResponsePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom origin.
     *
     * A custom origin is any origin that is *not* an Amazon S3 bucket, with one exception. An
     * Amazon S3 bucket that is
     * [configured with static website hosting](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html)
     * *is* a custom origin.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CustomOriginConfigProperty customOriginConfigProperty = CustomOriginConfigProperty.builder()
     * .originProtocolPolicy("originProtocolPolicy")
     * // the properties below are optional
     * .httpPort(123)
     * .httpsPort(123)
     * .originKeepaliveTimeout(123)
     * .originReadTimeout(123)
     * .originSslProtocols(List.of("originSslProtocols"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html)
     */
    public inline fun cfnDistributionCustomOriginConfigProperty(
        block: CfnDistributionCustomOriginConfigPropertyDsl.() -> Unit = {}
    ): CfnDistribution.CustomOriginConfigProperty {
        val builder = CfnDistributionCustomOriginConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that describes the default cache behavior if you don't specify a
     * `CacheBehavior` element or if request URLs don't match any of the values of `PathPattern` in
     * `CacheBehavior` elements.
     *
     * You must create exactly one default cache behavior.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * DefaultCacheBehaviorProperty defaultCacheBehaviorProperty =
     * DefaultCacheBehaviorProperty.builder()
     * .targetOriginId("targetOriginId")
     * .viewerProtocolPolicy("viewerProtocolPolicy")
     * // the properties below are optional
     * .allowedMethods(List.of("allowedMethods"))
     * .cachedMethods(List.of("cachedMethods"))
     * .cachePolicyId("cachePolicyId")
     * .compress(false)
     * .defaultTtl(123)
     * .fieldLevelEncryptionId("fieldLevelEncryptionId")
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
     * .functionAssociations(List.of(FunctionAssociationProperty.builder()
     * .eventType("eventType")
     * .functionArn("functionArn")
     * .build()))
     * .lambdaFunctionAssociations(List.of(LambdaFunctionAssociationProperty.builder()
     * .eventType("eventType")
     * .includeBody(false)
     * .lambdaFunctionArn("lambdaFunctionArn")
     * .build()))
     * .maxTtl(123)
     * .minTtl(123)
     * .originRequestPolicyId("originRequestPolicyId")
     * .realtimeLogConfigArn("realtimeLogConfigArn")
     * .responseHeadersPolicyId("responseHeadersPolicyId")
     * .smoothStreaming(false)
     * .trustedKeyGroups(List.of("trustedKeyGroups"))
     * .trustedSigners(List.of("trustedSigners"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-defaultcachebehavior.html)
     */
    public inline fun cfnDistributionDefaultCacheBehaviorProperty(
        block: CfnDistributionDefaultCacheBehaviorPropertyDsl.() -> Unit = {}
    ): CfnDistribution.DefaultCacheBehaviorProperty {
        val builder = CfnDistributionDefaultCacheBehaviorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A distribution configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * DistributionConfigProperty distributionConfigProperty = DistributionConfigProperty.builder()
     * .defaultCacheBehavior(DefaultCacheBehaviorProperty.builder()
     * .targetOriginId("targetOriginId")
     * .viewerProtocolPolicy("viewerProtocolPolicy")
     * // the properties below are optional
     * .allowedMethods(List.of("allowedMethods"))
     * .cachedMethods(List.of("cachedMethods"))
     * .cachePolicyId("cachePolicyId")
     * .compress(false)
     * .defaultTtl(123)
     * .fieldLevelEncryptionId("fieldLevelEncryptionId")
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
     * .functionAssociations(List.of(FunctionAssociationProperty.builder()
     * .eventType("eventType")
     * .functionArn("functionArn")
     * .build()))
     * .lambdaFunctionAssociations(List.of(LambdaFunctionAssociationProperty.builder()
     * .eventType("eventType")
     * .includeBody(false)
     * .lambdaFunctionArn("lambdaFunctionArn")
     * .build()))
     * .maxTtl(123)
     * .minTtl(123)
     * .originRequestPolicyId("originRequestPolicyId")
     * .realtimeLogConfigArn("realtimeLogConfigArn")
     * .responseHeadersPolicyId("responseHeadersPolicyId")
     * .smoothStreaming(false)
     * .trustedKeyGroups(List.of("trustedKeyGroups"))
     * .trustedSigners(List.of("trustedSigners"))
     * .build())
     * .enabled(false)
     * // the properties below are optional
     * .aliases(List.of("aliases"))
     * .cacheBehaviors(List.of(CacheBehaviorProperty.builder()
     * .pathPattern("pathPattern")
     * .targetOriginId("targetOriginId")
     * .viewerProtocolPolicy("viewerProtocolPolicy")
     * // the properties below are optional
     * .allowedMethods(List.of("allowedMethods"))
     * .cachedMethods(List.of("cachedMethods"))
     * .cachePolicyId("cachePolicyId")
     * .compress(false)
     * .defaultTtl(123)
     * .fieldLevelEncryptionId("fieldLevelEncryptionId")
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
     * .functionAssociations(List.of(FunctionAssociationProperty.builder()
     * .eventType("eventType")
     * .functionArn("functionArn")
     * .build()))
     * .lambdaFunctionAssociations(List.of(LambdaFunctionAssociationProperty.builder()
     * .eventType("eventType")
     * .includeBody(false)
     * .lambdaFunctionArn("lambdaFunctionArn")
     * .build()))
     * .maxTtl(123)
     * .minTtl(123)
     * .originRequestPolicyId("originRequestPolicyId")
     * .realtimeLogConfigArn("realtimeLogConfigArn")
     * .responseHeadersPolicyId("responseHeadersPolicyId")
     * .smoothStreaming(false)
     * .trustedKeyGroups(List.of("trustedKeyGroups"))
     * .trustedSigners(List.of("trustedSigners"))
     * .build()))
     * .cnamEs(List.of("cnamEs"))
     * .comment("comment")
     * .continuousDeploymentPolicyId("continuousDeploymentPolicyId")
     * .customErrorResponses(List.of(CustomErrorResponseProperty.builder()
     * .errorCode(123)
     * // the properties below are optional
     * .errorCachingMinTtl(123)
     * .responseCode(123)
     * .responsePagePath("responsePagePath")
     * .build()))
     * .customOrigin(LegacyCustomOriginProperty.builder()
     * .dnsName("dnsName")
     * .originProtocolPolicy("originProtocolPolicy")
     * .originSslProtocols(List.of("originSslProtocols"))
     * // the properties below are optional
     * .httpPort(123)
     * .httpsPort(123)
     * .build())
     * .defaultRootObject("defaultRootObject")
     * .httpVersion("httpVersion")
     * .ipv6Enabled(false)
     * .logging(LoggingProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .includeCookies(false)
     * .prefix("prefix")
     * .build())
     * .originGroups(OriginGroupsProperty.builder()
     * .quantity(123)
     * // the properties below are optional
     * .items(List.of(OriginGroupProperty.builder()
     * .failoverCriteria(OriginGroupFailoverCriteriaProperty.builder()
     * .statusCodes(StatusCodesProperty.builder()
     * .items(List.of(123))
     * .quantity(123)
     * .build())
     * .build())
     * .id("id")
     * .members(OriginGroupMembersProperty.builder()
     * .items(List.of(OriginGroupMemberProperty.builder()
     * .originId("originId")
     * .build()))
     * .quantity(123)
     * .build())
     * .build()))
     * .build())
     * .origins(List.of(OriginProperty.builder()
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
     * .build()))
     * .priceClass("priceClass")
     * .restrictions(RestrictionsProperty.builder()
     * .geoRestriction(GeoRestrictionProperty.builder()
     * .restrictionType("restrictionType")
     * // the properties below are optional
     * .locations(List.of("locations"))
     * .build())
     * .build())
     * .s3Origin(LegacyS3OriginProperty.builder()
     * .dnsName("dnsName")
     * // the properties below are optional
     * .originAccessIdentity("originAccessIdentity")
     * .build())
     * .staging(false)
     * .viewerCertificate(ViewerCertificateProperty.builder()
     * .acmCertificateArn("acmCertificateArn")
     * .cloudFrontDefaultCertificate(false)
     * .iamCertificateId("iamCertificateId")
     * .minimumProtocolVersion("minimumProtocolVersion")
     * .sslSupportMethod("sslSupportMethod")
     * .build())
     * .webAclId("webAclId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html)
     */
    public inline fun cfnDistributionDistributionConfigProperty(
        block: CfnDistributionDistributionConfigPropertyDsl.() -> Unit = {}
    ): CfnDistribution.DistributionConfigProperty {
        val builder = CfnDistributionDistributionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This field is deprecated.
     *
     * We recommend that you use a cache policy or an origin request policy instead of this field.
     *
     * If you want to include values in the cache key, use a cache policy. For more information, see
     * [Creating cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to send values to the origin but not include them in the cache key, use an origin
     * request policy. For more information, see
     * [Creating origin request policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
     * headers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * ForwardedValuesProperty forwardedValuesProperty = ForwardedValuesProperty.builder()
     * .queryString(false)
     * // the properties below are optional
     * .cookies(CookiesProperty.builder()
     * .forward("forward")
     * // the properties below are optional
     * .whitelistedNames(List.of("whitelistedNames"))
     * .build())
     * .headers(List.of("headers"))
     * .queryStringCacheKeys(List.of("queryStringCacheKeys"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html)
     */
    public inline fun cfnDistributionForwardedValuesProperty(
        block: CfnDistributionForwardedValuesPropertyDsl.() -> Unit = {}
    ): CfnDistribution.ForwardedValuesProperty {
        val builder = CfnDistributionForwardedValuesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A CloudFront function that is associated with a cache behavior in a CloudFront distribution.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * FunctionAssociationProperty functionAssociationProperty = FunctionAssociationProperty.builder()
     * .eventType("eventType")
     * .functionArn("functionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-functionassociation.html)
     */
    public inline fun cfnDistributionFunctionAssociationProperty(
        block: CfnDistributionFunctionAssociationPropertyDsl.() -> Unit = {}
    ): CfnDistribution.FunctionAssociationProperty {
        val builder = CfnDistributionFunctionAssociationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that controls the countries in which your content is distributed.
     *
     * CloudFront determines the location of your users using `MaxMind` GeoIP databases. To disable
     * geo restriction, remove the
     * [Restrictions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-distributionconfig.html#cfn-cloudfront-distribution-distributionconfig-restrictions)
     * property from your stack template.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * GeoRestrictionProperty geoRestrictionProperty = GeoRestrictionProperty.builder()
     * .restrictionType("restrictionType")
     * // the properties below are optional
     * .locations(List.of("locations"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-georestriction.html)
     */
    public inline fun cfnDistributionGeoRestrictionProperty(
        block: CfnDistributionGeoRestrictionPropertyDsl.() -> Unit = {}
    ): CfnDistribution.GeoRestrictionProperty {
        val builder = CfnDistributionGeoRestrictionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains a Lambda&#64;Edge function association.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * LambdaFunctionAssociationProperty lambdaFunctionAssociationProperty =
     * LambdaFunctionAssociationProperty.builder()
     * .eventType("eventType")
     * .includeBody(false)
     * .lambdaFunctionArn("lambdaFunctionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html)
     */
    public inline fun cfnDistributionLambdaFunctionAssociationProperty(
        block: CfnDistributionLambdaFunctionAssociationPropertyDsl.() -> Unit = {}
    ): CfnDistribution.LambdaFunctionAssociationProperty {
        val builder = CfnDistributionLambdaFunctionAssociationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * LegacyCustomOriginProperty legacyCustomOriginProperty = LegacyCustomOriginProperty.builder()
     * .dnsName("dnsName")
     * .originProtocolPolicy("originProtocolPolicy")
     * .originSslProtocols(List.of("originSslProtocols"))
     * // the properties below are optional
     * .httpPort(123)
     * .httpsPort(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacycustomorigin.html)
     */
    public inline fun cfnDistributionLegacyCustomOriginProperty(
        block: CfnDistributionLegacyCustomOriginPropertyDsl.() -> Unit = {}
    ): CfnDistribution.LegacyCustomOriginProperty {
        val builder = CfnDistributionLegacyCustomOriginPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * LegacyS3OriginProperty legacyS3OriginProperty = LegacyS3OriginProperty.builder()
     * .dnsName("dnsName")
     * // the properties below are optional
     * .originAccessIdentity("originAccessIdentity")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-legacys3origin.html)
     */
    public inline fun cfnDistributionLegacyS3OriginProperty(
        block: CfnDistributionLegacyS3OriginPropertyDsl.() -> Unit = {}
    ): CfnDistribution.LegacyS3OriginProperty {
        val builder = CfnDistributionLegacyS3OriginPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that controls whether access logs are written for the distribution.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * LoggingProperty loggingProperty = LoggingProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .includeCookies(false)
     * .prefix("prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-logging.html)
     */
    public inline fun cfnDistributionLoggingProperty(
        block: CfnDistributionLoggingPropertyDsl.() -> Unit = {}
    ): CfnDistribution.LoggingProperty {
        val builder = CfnDistributionLoggingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains `HeaderName` and `HeaderValue` elements, if any, for this
     * distribution.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * OriginCustomHeaderProperty originCustomHeaderProperty = OriginCustomHeaderProperty.builder()
     * .headerName("headerName")
     * .headerValue("headerValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html)
     */
    public inline fun cfnDistributionOriginCustomHeaderProperty(
        block: CfnDistributionOriginCustomHeaderPropertyDsl.() -> Unit = {}
    ): CfnDistribution.OriginCustomHeaderProperty {
        val builder = CfnDistributionOriginCustomHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex data type that includes information about the failover criteria for an origin
     * group, including the status codes for which CloudFront will failover from the primary origin
     * to the second origin.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * OriginGroupFailoverCriteriaProperty originGroupFailoverCriteriaProperty =
     * OriginGroupFailoverCriteriaProperty.builder()
     * .statusCodes(StatusCodesProperty.builder()
     * .items(List.of(123))
     * .quantity(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupfailovercriteria.html)
     */
    public inline fun cfnDistributionOriginGroupFailoverCriteriaProperty(
        block: CfnDistributionOriginGroupFailoverCriteriaPropertyDsl.() -> Unit = {}
    ): CfnDistribution.OriginGroupFailoverCriteriaProperty {
        val builder = CfnDistributionOriginGroupFailoverCriteriaPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An origin in an origin group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * OriginGroupMemberProperty originGroupMemberProperty = OriginGroupMemberProperty.builder()
     * .originId("originId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmember.html)
     */
    public inline fun cfnDistributionOriginGroupMemberProperty(
        block: CfnDistributionOriginGroupMemberPropertyDsl.() -> Unit = {}
    ): CfnDistribution.OriginGroupMemberProperty {
        val builder = CfnDistributionOriginGroupMemberPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex data type for the origins included in an origin group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * OriginGroupMembersProperty originGroupMembersProperty = OriginGroupMembersProperty.builder()
     * .items(List.of(OriginGroupMemberProperty.builder()
     * .originId("originId")
     * .build()))
     * .quantity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html)
     */
    public inline fun cfnDistributionOriginGroupMembersProperty(
        block: CfnDistributionOriginGroupMembersPropertyDsl.() -> Unit = {}
    ): CfnDistribution.OriginGroupMembersProperty {
        val builder = CfnDistributionOriginGroupMembersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An origin group includes two origins (a primary origin and a second origin to failover to)
     * and a failover criteria that you specify.
     *
     * You create an origin group to support origin failover in CloudFront. When you create or
     * update a distribution, you can specifiy the origin group instead of a single origin, and
     * CloudFront will failover from the primary origin to the second origin under the failover
     * conditions that you've chosen.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * OriginGroupProperty originGroupProperty = OriginGroupProperty.builder()
     * .failoverCriteria(OriginGroupFailoverCriteriaProperty.builder()
     * .statusCodes(StatusCodesProperty.builder()
     * .items(List.of(123))
     * .quantity(123)
     * .build())
     * .build())
     * .id("id")
     * .members(OriginGroupMembersProperty.builder()
     * .items(List.of(OriginGroupMemberProperty.builder()
     * .originId("originId")
     * .build()))
     * .quantity(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroup.html)
     */
    public inline fun cfnDistributionOriginGroupProperty(
        block: CfnDistributionOriginGroupPropertyDsl.() -> Unit = {}
    ): CfnDistribution.OriginGroupProperty {
        val builder = CfnDistributionOriginGroupPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex data type for the origin groups specified for a distribution.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * OriginGroupsProperty originGroupsProperty = OriginGroupsProperty.builder()
     * .quantity(123)
     * // the properties below are optional
     * .items(List.of(OriginGroupProperty.builder()
     * .failoverCriteria(OriginGroupFailoverCriteriaProperty.builder()
     * .statusCodes(StatusCodesProperty.builder()
     * .items(List.of(123))
     * .quantity(123)
     * .build())
     * .build())
     * .id("id")
     * .members(OriginGroupMembersProperty.builder()
     * .items(List.of(OriginGroupMemberProperty.builder()
     * .originId("originId")
     * .build()))
     * .quantity(123)
     * .build())
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroups.html)
     */
    public inline fun cfnDistributionOriginGroupsProperty(
        block: CfnDistributionOriginGroupsPropertyDsl.() -> Unit = {}
    ): CfnDistribution.OriginGroupsProperty {
        val builder = CfnDistributionOriginGroupsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An origin.
     *
     * An origin is the location where content is stored, and from which CloudFront gets content to
     * serve to viewers. To specify an origin:
     * * Use `S3OriginConfig` to specify an Amazon S3 bucket that is not configured with static
     *   website hosting.
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
    public inline fun cfnDistributionOriginProperty(
        block: CfnDistributionOriginPropertyDsl.() -> Unit = {}
    ): CfnDistribution.OriginProperty {
        val builder = CfnDistributionOriginPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * CloudFront Origin Shield.
     *
     * Using Origin Shield can help reduce the load on your origin. For more information, see
     * [Using Origin Shield](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * OriginShieldProperty originShieldProperty = OriginShieldProperty.builder()
     * .enabled(false)
     * .originShieldRegion("originShieldRegion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-originshield.html)
     */
    public inline fun cfnDistributionOriginShieldProperty(
        block: CfnDistributionOriginShieldPropertyDsl.() -> Unit = {}
    ): CfnDistribution.OriginShieldProperty {
        val builder = CfnDistributionOriginShieldPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDistribution`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnDistributionProps cfnDistributionProps = CfnDistributionProps.builder()
     * .distributionConfig(DistributionConfigProperty.builder()
     * .defaultCacheBehavior(DefaultCacheBehaviorProperty.builder()
     * .targetOriginId("targetOriginId")
     * .viewerProtocolPolicy("viewerProtocolPolicy")
     * // the properties below are optional
     * .allowedMethods(List.of("allowedMethods"))
     * .cachedMethods(List.of("cachedMethods"))
     * .cachePolicyId("cachePolicyId")
     * .compress(false)
     * .defaultTtl(123)
     * .fieldLevelEncryptionId("fieldLevelEncryptionId")
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
     * .functionAssociations(List.of(FunctionAssociationProperty.builder()
     * .eventType("eventType")
     * .functionArn("functionArn")
     * .build()))
     * .lambdaFunctionAssociations(List.of(LambdaFunctionAssociationProperty.builder()
     * .eventType("eventType")
     * .includeBody(false)
     * .lambdaFunctionArn("lambdaFunctionArn")
     * .build()))
     * .maxTtl(123)
     * .minTtl(123)
     * .originRequestPolicyId("originRequestPolicyId")
     * .realtimeLogConfigArn("realtimeLogConfigArn")
     * .responseHeadersPolicyId("responseHeadersPolicyId")
     * .smoothStreaming(false)
     * .trustedKeyGroups(List.of("trustedKeyGroups"))
     * .trustedSigners(List.of("trustedSigners"))
     * .build())
     * .enabled(false)
     * // the properties below are optional
     * .aliases(List.of("aliases"))
     * .cacheBehaviors(List.of(CacheBehaviorProperty.builder()
     * .pathPattern("pathPattern")
     * .targetOriginId("targetOriginId")
     * .viewerProtocolPolicy("viewerProtocolPolicy")
     * // the properties below are optional
     * .allowedMethods(List.of("allowedMethods"))
     * .cachedMethods(List.of("cachedMethods"))
     * .cachePolicyId("cachePolicyId")
     * .compress(false)
     * .defaultTtl(123)
     * .fieldLevelEncryptionId("fieldLevelEncryptionId")
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
     * .functionAssociations(List.of(FunctionAssociationProperty.builder()
     * .eventType("eventType")
     * .functionArn("functionArn")
     * .build()))
     * .lambdaFunctionAssociations(List.of(LambdaFunctionAssociationProperty.builder()
     * .eventType("eventType")
     * .includeBody(false)
     * .lambdaFunctionArn("lambdaFunctionArn")
     * .build()))
     * .maxTtl(123)
     * .minTtl(123)
     * .originRequestPolicyId("originRequestPolicyId")
     * .realtimeLogConfigArn("realtimeLogConfigArn")
     * .responseHeadersPolicyId("responseHeadersPolicyId")
     * .smoothStreaming(false)
     * .trustedKeyGroups(List.of("trustedKeyGroups"))
     * .trustedSigners(List.of("trustedSigners"))
     * .build()))
     * .cnamEs(List.of("cnamEs"))
     * .comment("comment")
     * .continuousDeploymentPolicyId("continuousDeploymentPolicyId")
     * .customErrorResponses(List.of(CustomErrorResponseProperty.builder()
     * .errorCode(123)
     * // the properties below are optional
     * .errorCachingMinTtl(123)
     * .responseCode(123)
     * .responsePagePath("responsePagePath")
     * .build()))
     * .customOrigin(LegacyCustomOriginProperty.builder()
     * .dnsName("dnsName")
     * .originProtocolPolicy("originProtocolPolicy")
     * .originSslProtocols(List.of("originSslProtocols"))
     * // the properties below are optional
     * .httpPort(123)
     * .httpsPort(123)
     * .build())
     * .defaultRootObject("defaultRootObject")
     * .httpVersion("httpVersion")
     * .ipv6Enabled(false)
     * .logging(LoggingProperty.builder()
     * .bucket("bucket")
     * // the properties below are optional
     * .includeCookies(false)
     * .prefix("prefix")
     * .build())
     * .originGroups(OriginGroupsProperty.builder()
     * .quantity(123)
     * // the properties below are optional
     * .items(List.of(OriginGroupProperty.builder()
     * .failoverCriteria(OriginGroupFailoverCriteriaProperty.builder()
     * .statusCodes(StatusCodesProperty.builder()
     * .items(List.of(123))
     * .quantity(123)
     * .build())
     * .build())
     * .id("id")
     * .members(OriginGroupMembersProperty.builder()
     * .items(List.of(OriginGroupMemberProperty.builder()
     * .originId("originId")
     * .build()))
     * .quantity(123)
     * .build())
     * .build()))
     * .build())
     * .origins(List.of(OriginProperty.builder()
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
     * .build()))
     * .priceClass("priceClass")
     * .restrictions(RestrictionsProperty.builder()
     * .geoRestriction(GeoRestrictionProperty.builder()
     * .restrictionType("restrictionType")
     * // the properties below are optional
     * .locations(List.of("locations"))
     * .build())
     * .build())
     * .s3Origin(LegacyS3OriginProperty.builder()
     * .dnsName("dnsName")
     * // the properties below are optional
     * .originAccessIdentity("originAccessIdentity")
     * .build())
     * .staging(false)
     * .viewerCertificate(ViewerCertificateProperty.builder()
     * .acmCertificateArn("acmCertificateArn")
     * .cloudFrontDefaultCertificate(false)
     * .iamCertificateId("iamCertificateId")
     * .minimumProtocolVersion("minimumProtocolVersion")
     * .sslSupportMethod("sslSupportMethod")
     * .build())
     * .webAclId("webAclId")
     * .build())
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-distribution.html)
     */
    public inline fun cfnDistributionProps(
        block: CfnDistributionPropsDsl.() -> Unit = {}
    ): CfnDistributionProps {
        val builder = CfnDistributionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that identifies ways in which you want to restrict distribution of your
     * content.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * RestrictionsProperty restrictionsProperty = RestrictionsProperty.builder()
     * .geoRestriction(GeoRestrictionProperty.builder()
     * .restrictionType("restrictionType")
     * // the properties below are optional
     * .locations(List.of("locations"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-restrictions.html)
     */
    public inline fun cfnDistributionRestrictionsProperty(
        block: CfnDistributionRestrictionsPropertyDsl.() -> Unit = {}
    ): CfnDistribution.RestrictionsProperty {
        val builder = CfnDistributionRestrictionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains information about the Amazon S3 origin.
     *
     * If the origin is a custom origin or an S3 bucket that is configured as a website endpoint,
     * use the `CustomOriginConfig` element instead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * S3OriginConfigProperty s3OriginConfigProperty = S3OriginConfigProperty.builder()
     * .originAccessIdentity("originAccessIdentity")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-s3originconfig.html)
     */
    public inline fun cfnDistributionS3OriginConfigProperty(
        block: CfnDistributionS3OriginConfigPropertyDsl.() -> Unit = {}
    ): CfnDistribution.S3OriginConfigProperty {
        val builder = CfnDistributionS3OriginConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex data type for the status codes that you specify that, when returned by a primary
     * origin, trigger CloudFront to failover to a second origin.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * StatusCodesProperty statusCodesProperty = StatusCodesProperty.builder()
     * .items(List.of(123))
     * .quantity(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-statuscodes.html)
     */
    public inline fun cfnDistributionStatusCodesProperty(
        block: CfnDistributionStatusCodesPropertyDsl.() -> Unit = {}
    ): CfnDistribution.StatusCodesProperty {
        val builder = CfnDistributionStatusCodesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that determines the distribution's SSL/TLS configuration for communicating
     * with viewers.
     *
     * If the distribution doesn't use `Aliases` (also known as alternate domain names or
     * CNAMEs)—that is, if the distribution uses the CloudFront domain name such as
     * `d111111abcdef8.cloudfront.net` —set `CloudFrontDefaultCertificate` to `true` and leave all
     * other fields empty.
     *
     * If the distribution uses `Aliases` (alternate domain names or CNAMEs), use the fields in this
     * type to specify the following settings:
     * * Which viewers the distribution accepts HTTPS connections from: only viewers that support
     *   [server name indication (SNI)](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Server_Name_Indication)
     *   (recommended), or all viewers including those that don't support SNI.
     * * To accept HTTPS connections from only viewers that support SNI, set `SSLSupportMethod` to
     *   `sni-only` . This is recommended. Most browsers and clients support SNI. (In
     *   CloudFormation, the field name is `SslSupportMethod` . Note the different capitalization.)
     * * To accept HTTPS connections from all viewers, including those that don't support SNI, set
     *   `SSLSupportMethod` to `vip` . This is not recommended, and results in additional monthly
     *   charges from CloudFront. (In CloudFormation, the field name is `SslSupportMethod` . Note
     *   the different capitalization.)
     * * The minimum SSL/TLS protocol version that the distribution can use to communicate with
     *   viewers. To specify a minimum version, choose a value for `MinimumProtocolVersion` . For
     *   more information, see
     *   [Security Policy](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValues-security-policy)
     *   in the *Amazon CloudFront Developer Guide* .
     * * The location of the SSL/TLS certificate,
     *   [AWS Certificate Manager (ACM)](https://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html)
     *   (recommended) or
     *   [AWS Identity and Access Management (IAM)](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html)
     *   . You specify the location by setting a value in one of the following fields (not both):
     * * `ACMCertificateArn` (In CloudFormation, this field name is `AcmCertificateArn` . Note the
     *   different capitalization.)
     * * `IAMCertificateId` (In CloudFormation, this field name is `IamCertificateId` . Note the
     *   different capitalization.)
     *
     * All distributions support HTTPS connections from viewers. To require viewers to use HTTPS
     * only, or to redirect them from HTTP to HTTPS, use `ViewerProtocolPolicy` in the
     * `CacheBehavior` or `DefaultCacheBehavior` . To specify how CloudFront should use SSL/TLS to
     * communicate with your custom origin, use `CustomOriginConfig` .
     *
     * For more information, see
     * [Using HTTPS with CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https.html)
     * and
     * [Using Alternate Domain Names and HTTPS](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-alternate-domain-names.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * ViewerCertificateProperty viewerCertificateProperty = ViewerCertificateProperty.builder()
     * .acmCertificateArn("acmCertificateArn")
     * .cloudFrontDefaultCertificate(false)
     * .iamCertificateId("iamCertificateId")
     * .minimumProtocolVersion("minimumProtocolVersion")
     * .sslSupportMethod("sslSupportMethod")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html)
     */
    public inline fun cfnDistributionViewerCertificateProperty(
        block: CfnDistributionViewerCertificatePropertyDsl.() -> Unit = {}
    ): CfnDistribution.ViewerCertificateProperty {
        val builder = CfnDistributionViewerCertificatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a CloudFront function.
     *
     * To create a function, you provide the function code and some configuration information about
     * the function. The response contains an Amazon Resource Name (ARN) that uniquely identifies
     * the function, and the function’s stage.
     *
     * By default, when you create a function, it’s in the `DEVELOPMENT` stage. In this stage, you
     * can
     * [test the function](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/test-function.html)
     * in the CloudFront console (or with `TestFunction` in the CloudFront API).
     *
     * When you’re ready to use your function with a CloudFront distribution, publish the function
     * to the `LIVE` stage. You can do this in the CloudFront console, with `PublishFunction` in the
     * CloudFront API, or by updating the `AWS::CloudFront::Function` resource with the
     * `AutoPublish` property set to `true` . When the function is published to the `LIVE` stage,
     * you can attach it to a distribution’s cache behavior, using the function’s ARN.
     *
     * To automatically publish the function to the `LIVE` stage when it’s created, set the
     * `AutoPublish` property to `true` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnFunction cfnFunction = CfnFunction.Builder.create(this, "MyCfnFunction")
     * .functionCode("functionCode")
     * .functionConfig(FunctionConfigProperty.builder()
     * .comment("comment")
     * .runtime("runtime")
     * .build())
     * .name("name")
     * // the properties below are optional
     * .autoPublish(false)
     * .functionMetadata(FunctionMetadataProperty.builder()
     * .functionArn("functionArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html)
     */
    public inline fun cfnFunction(
        scope: Construct,
        id: String,
        block: CfnFunctionDsl.() -> Unit = {},
    ): CfnFunction {
        val builder = CfnFunctionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains configuration information about a CloudFront function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * FunctionConfigProperty functionConfigProperty = FunctionConfigProperty.builder()
     * .comment("comment")
     * .runtime("runtime")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-functionconfig.html)
     */
    public inline fun cfnFunctionFunctionConfigProperty(
        block: CfnFunctionFunctionConfigPropertyDsl.() -> Unit = {}
    ): CfnFunction.FunctionConfigProperty {
        val builder = CfnFunctionFunctionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains metadata about a CloudFront function.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * FunctionMetadataProperty functionMetadataProperty = FunctionMetadataProperty.builder()
     * .functionArn("functionArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-functionmetadata.html)
     */
    public inline fun cfnFunctionFunctionMetadataProperty(
        block: CfnFunctionFunctionMetadataPropertyDsl.() -> Unit = {}
    ): CfnFunction.FunctionMetadataProperty {
        val builder = CfnFunctionFunctionMetadataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnFunction`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnFunctionProps cfnFunctionProps = CfnFunctionProps.builder()
     * .functionCode("functionCode")
     * .functionConfig(FunctionConfigProperty.builder()
     * .comment("comment")
     * .runtime("runtime")
     * .build())
     * .name("name")
     * // the properties below are optional
     * .autoPublish(false)
     * .functionMetadata(FunctionMetadataProperty.builder()
     * .functionArn("functionArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html)
     */
    public inline fun cfnFunctionProps(
        block: CfnFunctionPropsDsl.() -> Unit = {}
    ): CfnFunctionProps {
        val builder = CfnFunctionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A key group.
     *
     * A key group contains a list of public keys that you can use with
     * [CloudFront signed URLs and signed cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnKeyGroup cfnKeyGroup = CfnKeyGroup.Builder.create(this, "MyCfnKeyGroup")
     * .keyGroupConfig(KeyGroupConfigProperty.builder()
     * .items(List.of("items"))
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keygroup.html)
     */
    public inline fun cfnKeyGroup(
        scope: Construct,
        id: String,
        block: CfnKeyGroupDsl.() -> Unit = {},
    ): CfnKeyGroup {
        val builder = CfnKeyGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A key group configuration.
     *
     * A key group contains a list of public keys that you can use with
     * [CloudFront signed URLs and signed cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * KeyGroupConfigProperty keyGroupConfigProperty = KeyGroupConfigProperty.builder()
     * .items(List.of("items"))
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-keygroup-keygroupconfig.html)
     */
    public inline fun cfnKeyGroupKeyGroupConfigProperty(
        block: CfnKeyGroupKeyGroupConfigPropertyDsl.() -> Unit = {}
    ): CfnKeyGroup.KeyGroupConfigProperty {
        val builder = CfnKeyGroupKeyGroupConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnKeyGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnKeyGroupProps cfnKeyGroupProps = CfnKeyGroupProps.builder()
     * .keyGroupConfig(KeyGroupConfigProperty.builder()
     * .items(List.of("items"))
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-keygroup.html)
     */
    public inline fun cfnKeyGroupProps(
        block: CfnKeyGroupPropsDsl.() -> Unit = {}
    ): CfnKeyGroupProps {
        val builder = CfnKeyGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A monitoring subscription.
     *
     * This structure contains information about whether additional CloudWatch metrics are enabled
     * for a given CloudFront distribution.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnMonitoringSubscription cfnMonitoringSubscription =
     * CfnMonitoringSubscription.Builder.create(this, "MyCfnMonitoringSubscription")
     * .distributionId("distributionId")
     * .monitoringSubscription(MonitoringSubscriptionProperty.builder()
     * .realtimeMetricsSubscriptionConfig(RealtimeMetricsSubscriptionConfigProperty.builder()
     * .realtimeMetricsSubscriptionStatus("realtimeMetricsSubscriptionStatus")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html)
     */
    public inline fun cfnMonitoringSubscription(
        scope: Construct,
        id: String,
        block: CfnMonitoringSubscriptionDsl.() -> Unit = {},
    ): CfnMonitoringSubscription {
        val builder = CfnMonitoringSubscriptionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A monitoring subscription.
     *
     * This structure contains information about whether additional CloudWatch metrics are enabled
     * for a given CloudFront distribution.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * MonitoringSubscriptionProperty monitoringSubscriptionProperty =
     * MonitoringSubscriptionProperty.builder()
     * .realtimeMetricsSubscriptionConfig(RealtimeMetricsSubscriptionConfigProperty.builder()
     * .realtimeMetricsSubscriptionStatus("realtimeMetricsSubscriptionStatus")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-monitoringsubscription-monitoringsubscription.html)
     */
    public inline fun cfnMonitoringSubscriptionMonitoringSubscriptionProperty(
        block: CfnMonitoringSubscriptionMonitoringSubscriptionPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSubscription.MonitoringSubscriptionProperty {
        val builder = CfnMonitoringSubscriptionMonitoringSubscriptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMonitoringSubscription`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnMonitoringSubscriptionProps cfnMonitoringSubscriptionProps =
     * CfnMonitoringSubscriptionProps.builder()
     * .distributionId("distributionId")
     * .monitoringSubscription(MonitoringSubscriptionProperty.builder()
     * .realtimeMetricsSubscriptionConfig(RealtimeMetricsSubscriptionConfigProperty.builder()
     * .realtimeMetricsSubscriptionStatus("realtimeMetricsSubscriptionStatus")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-monitoringsubscription.html)
     */
    public inline fun cfnMonitoringSubscriptionProps(
        block: CfnMonitoringSubscriptionPropsDsl.() -> Unit = {}
    ): CfnMonitoringSubscriptionProps {
        val builder = CfnMonitoringSubscriptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A subscription configuration for additional CloudWatch metrics.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * RealtimeMetricsSubscriptionConfigProperty realtimeMetricsSubscriptionConfigProperty =
     * RealtimeMetricsSubscriptionConfigProperty.builder()
     * .realtimeMetricsSubscriptionStatus("realtimeMetricsSubscriptionStatus")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-monitoringsubscription-realtimemetricssubscriptionconfig.html)
     */
    public inline fun cfnMonitoringSubscriptionRealtimeMetricsSubscriptionConfigProperty(
        block: CfnMonitoringSubscriptionRealtimeMetricsSubscriptionConfigPropertyDsl.() -> Unit = {}
    ): CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty {
        val builder = CfnMonitoringSubscriptionRealtimeMetricsSubscriptionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new origin access control in CloudFront.
     *
     * After you create an origin access control, you can add it to an origin in a CloudFront
     * distribution so that CloudFront sends authenticated (signed) requests to the origin.
     *
     * This makes it possible to block public access to the origin, allowing viewers (users) to
     * access the origin's content only through CloudFront.
     *
     * For more information about using a CloudFront origin access control, see
     * [Restricting access to an AWS origin](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-origin.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnOriginAccessControl cfnOriginAccessControl = CfnOriginAccessControl.Builder.create(this,
     * "MyCfnOriginAccessControl")
     * .originAccessControlConfig(OriginAccessControlConfigProperty.builder()
     * .name("name")
     * .originAccessControlOriginType("originAccessControlOriginType")
     * .signingBehavior("signingBehavior")
     * .signingProtocol("signingProtocol")
     * // the properties below are optional
     * .description("description")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html)
     */
    public inline fun cfnOriginAccessControl(
        scope: Construct,
        id: String,
        block: CfnOriginAccessControlDsl.() -> Unit = {},
    ): CfnOriginAccessControl {
        val builder = CfnOriginAccessControlDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a new origin access control in CloudFront.
     *
     * After you create an origin access control, you can add it to an origin in a CloudFront
     * distribution so that CloudFront sends authenticated (signed) requests to the origin.
     *
     * This makes it possible to block public access to the origin, allowing viewers (users) to
     * access the origin's content only through CloudFront.
     *
     * For more information about using a CloudFront origin access control, see
     * [Restricting access to an AWS origin](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-origin.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * OriginAccessControlConfigProperty originAccessControlConfigProperty =
     * OriginAccessControlConfigProperty.builder()
     * .name("name")
     * .originAccessControlOriginType("originAccessControlOriginType")
     * .signingBehavior("signingBehavior")
     * .signingProtocol("signingProtocol")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originaccesscontrol-originaccesscontrolconfig.html)
     */
    public inline fun cfnOriginAccessControlOriginAccessControlConfigProperty(
        block: CfnOriginAccessControlOriginAccessControlConfigPropertyDsl.() -> Unit = {}
    ): CfnOriginAccessControl.OriginAccessControlConfigProperty {
        val builder = CfnOriginAccessControlOriginAccessControlConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnOriginAccessControl`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnOriginAccessControlProps cfnOriginAccessControlProps = CfnOriginAccessControlProps.builder()
     * .originAccessControlConfig(OriginAccessControlConfigProperty.builder()
     * .name("name")
     * .originAccessControlOriginType("originAccessControlOriginType")
     * .signingBehavior("signingBehavior")
     * .signingProtocol("signingProtocol")
     * // the properties below are optional
     * .description("description")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html)
     */
    public inline fun cfnOriginAccessControlProps(
        block: CfnOriginAccessControlPropsDsl.() -> Unit = {}
    ): CfnOriginAccessControlProps {
        val builder = CfnOriginAccessControlPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An origin request policy.
     *
     * When it's attached to a cache behavior, the origin request policy determines the values that
     * CloudFront includes in requests that it sends to the origin. Each request that CloudFront
     * sends to the origin includes the following:
     * * The request body and the URL path (without the domain name) from the viewer request.
     * * The headers that CloudFront automatically includes in every origin request, including
     *   `Host` , `User-Agent` , and `X-Amz-Cf-Id` .
     * * All HTTP headers, cookies, and URL query strings that are specified in the cache policy or
     *   the origin request policy. These can include items from the viewer request and, in the case
     *   of headers, additional ones that are added by CloudFront.
     *
     * CloudFront sends a request when it can't find an object in its cache that matches the
     * request. If you want to send values to the origin and also include them in the cache key, use
     * `CachePolicy` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnOriginRequestPolicy cfnOriginRequestPolicy = CfnOriginRequestPolicy.Builder.create(this,
     * "MyCfnOriginRequestPolicy")
     * .originRequestPolicyConfig(OriginRequestPolicyConfigProperty.builder()
     * .cookiesConfig(CookiesConfigProperty.builder()
     * .cookieBehavior("cookieBehavior")
     * // the properties below are optional
     * .cookies(List.of("cookies"))
     * .build())
     * .headersConfig(HeadersConfigProperty.builder()
     * .headerBehavior("headerBehavior")
     * // the properties below are optional
     * .headers(List.of("headers"))
     * .build())
     * .name("name")
     * .queryStringsConfig(QueryStringsConfigProperty.builder()
     * .queryStringBehavior("queryStringBehavior")
     * // the properties below are optional
     * .queryStrings(List.of("queryStrings"))
     * .build())
     * // the properties below are optional
     * .comment("comment")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originrequestpolicy.html)
     */
    public inline fun cfnOriginRequestPolicy(
        scope: Construct,
        id: String,
        block: CfnOriginRequestPolicyDsl.() -> Unit = {},
    ): CfnOriginRequestPolicy {
        val builder = CfnOriginRequestPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that determines whether any cookies in viewer requests (and if so, which cookies)
     * are included in requests that CloudFront sends to the origin.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CookiesConfigProperty cookiesConfigProperty = CookiesConfigProperty.builder()
     * .cookieBehavior("cookieBehavior")
     * // the properties below are optional
     * .cookies(List.of("cookies"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-cookiesconfig.html)
     */
    public inline fun cfnOriginRequestPolicyCookiesConfigProperty(
        block: CfnOriginRequestPolicyCookiesConfigPropertyDsl.() -> Unit = {}
    ): CfnOriginRequestPolicy.CookiesConfigProperty {
        val builder = CfnOriginRequestPolicyCookiesConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that determines whether any HTTP headers (and if so, which headers) are included in
     * requests that CloudFront sends to the origin.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * HeadersConfigProperty headersConfigProperty = HeadersConfigProperty.builder()
     * .headerBehavior("headerBehavior")
     * // the properties below are optional
     * .headers(List.of("headers"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-headersconfig.html)
     */
    public inline fun cfnOriginRequestPolicyHeadersConfigProperty(
        block: CfnOriginRequestPolicyHeadersConfigPropertyDsl.() -> Unit = {}
    ): CfnOriginRequestPolicy.HeadersConfigProperty {
        val builder = CfnOriginRequestPolicyHeadersConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An origin request policy configuration.
     *
     * This configuration determines the values that CloudFront includes in requests that it sends
     * to the origin. Each request that CloudFront sends to the origin includes the following:
     * * The request body and the URL path (without the domain name) from the viewer request.
     * * The headers that CloudFront automatically includes in every origin request, including
     *   `Host` , `User-Agent` , and `X-Amz-Cf-Id` .
     * * All HTTP headers, cookies, and URL query strings that are specified in the cache policy or
     *   the origin request policy. These can include items from the viewer request and, in the case
     *   of headers, additional ones that are added by CloudFront.
     *
     * CloudFront sends a request when it can't find an object in its cache that matches the
     * request. If you want to send values to the origin and also include them in the cache key, use
     * `CachePolicy` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * OriginRequestPolicyConfigProperty originRequestPolicyConfigProperty =
     * OriginRequestPolicyConfigProperty.builder()
     * .cookiesConfig(CookiesConfigProperty.builder()
     * .cookieBehavior("cookieBehavior")
     * // the properties below are optional
     * .cookies(List.of("cookies"))
     * .build())
     * .headersConfig(HeadersConfigProperty.builder()
     * .headerBehavior("headerBehavior")
     * // the properties below are optional
     * .headers(List.of("headers"))
     * .build())
     * .name("name")
     * .queryStringsConfig(QueryStringsConfigProperty.builder()
     * .queryStringBehavior("queryStringBehavior")
     * // the properties below are optional
     * .queryStrings(List.of("queryStrings"))
     * .build())
     * // the properties below are optional
     * .comment("comment")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-originrequestpolicyconfig.html)
     */
    public inline fun cfnOriginRequestPolicyOriginRequestPolicyConfigProperty(
        block: CfnOriginRequestPolicyOriginRequestPolicyConfigPropertyDsl.() -> Unit = {}
    ): CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty {
        val builder = CfnOriginRequestPolicyOriginRequestPolicyConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnOriginRequestPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnOriginRequestPolicyProps cfnOriginRequestPolicyProps = CfnOriginRequestPolicyProps.builder()
     * .originRequestPolicyConfig(OriginRequestPolicyConfigProperty.builder()
     * .cookiesConfig(CookiesConfigProperty.builder()
     * .cookieBehavior("cookieBehavior")
     * // the properties below are optional
     * .cookies(List.of("cookies"))
     * .build())
     * .headersConfig(HeadersConfigProperty.builder()
     * .headerBehavior("headerBehavior")
     * // the properties below are optional
     * .headers(List.of("headers"))
     * .build())
     * .name("name")
     * .queryStringsConfig(QueryStringsConfigProperty.builder()
     * .queryStringBehavior("queryStringBehavior")
     * // the properties below are optional
     * .queryStrings(List.of("queryStrings"))
     * .build())
     * // the properties below are optional
     * .comment("comment")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originrequestpolicy.html)
     */
    public inline fun cfnOriginRequestPolicyProps(
        block: CfnOriginRequestPolicyPropsDsl.() -> Unit = {}
    ): CfnOriginRequestPolicyProps {
        val builder = CfnOriginRequestPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object that determines whether any URL query strings in viewer requests (and if so, which
     * query strings) are included in requests that CloudFront sends to the origin.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * QueryStringsConfigProperty queryStringsConfigProperty = QueryStringsConfigProperty.builder()
     * .queryStringBehavior("queryStringBehavior")
     * // the properties below are optional
     * .queryStrings(List.of("queryStrings"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-originrequestpolicy-querystringsconfig.html)
     */
    public inline fun cfnOriginRequestPolicyQueryStringsConfigProperty(
        block: CfnOriginRequestPolicyQueryStringsConfigPropertyDsl.() -> Unit = {}
    ): CfnOriginRequestPolicy.QueryStringsConfigProperty {
        val builder = CfnOriginRequestPolicyQueryStringsConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A public key that you can use with
     * [signed URLs and signed cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with
     * [field-level encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnPublicKey cfnPublicKey = CfnPublicKey.Builder.create(this, "MyCfnPublicKey")
     * .publicKeyConfig(PublicKeyConfigProperty.builder()
     * .callerReference("callerReference")
     * .encodedKey("encodedKey")
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-publickey.html)
     */
    public inline fun cfnPublicKey(
        scope: Construct,
        id: String,
        block: CfnPublicKeyDsl.() -> Unit = {},
    ): CfnPublicKey {
        val builder = CfnPublicKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPublicKey`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnPublicKeyProps cfnPublicKeyProps = CfnPublicKeyProps.builder()
     * .publicKeyConfig(PublicKeyConfigProperty.builder()
     * .callerReference("callerReference")
     * .encodedKey("encodedKey")
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-publickey.html)
     */
    public inline fun cfnPublicKeyProps(
        block: CfnPublicKeyPropsDsl.() -> Unit = {}
    ): CfnPublicKeyProps {
        val builder = CfnPublicKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration information about a public key that you can use with
     * [signed URLs and signed cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * , or with
     * [field-level encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * PublicKeyConfigProperty publicKeyConfigProperty = PublicKeyConfigProperty.builder()
     * .callerReference("callerReference")
     * .encodedKey("encodedKey")
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-publickey-publickeyconfig.html)
     */
    public inline fun cfnPublicKeyPublicKeyConfigProperty(
        block: CfnPublicKeyPublicKeyConfigPropertyDsl.() -> Unit = {}
    ): CfnPublicKey.PublicKeyConfigProperty {
        val builder = CfnPublicKeyPublicKeyConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A real-time log configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnRealtimeLogConfig cfnRealtimeLogConfig = CfnRealtimeLogConfig.Builder.create(this,
     * "MyCfnRealtimeLogConfig")
     * .endPoints(List.of(EndPointProperty.builder()
     * .kinesisStreamConfig(KinesisStreamConfigProperty.builder()
     * .roleArn("roleArn")
     * .streamArn("streamArn")
     * .build())
     * .streamType("streamType")
     * .build()))
     * .fields(List.of("fields"))
     * .name("name")
     * .samplingRate(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html)
     */
    public inline fun cfnRealtimeLogConfig(
        scope: Construct,
        id: String,
        block: CfnRealtimeLogConfigDsl.() -> Unit = {},
    ): CfnRealtimeLogConfig {
        val builder = CfnRealtimeLogConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data in a real-time log configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * EndPointProperty endPointProperty = EndPointProperty.builder()
     * .kinesisStreamConfig(KinesisStreamConfigProperty.builder()
     * .roleArn("roleArn")
     * .streamArn("streamArn")
     * .build())
     * .streamType("streamType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-realtimelogconfig-endpoint.html)
     */
    public inline fun cfnRealtimeLogConfigEndPointProperty(
        block: CfnRealtimeLogConfigEndPointPropertyDsl.() -> Unit = {}
    ): CfnRealtimeLogConfig.EndPointProperty {
        val builder = CfnRealtimeLogConfigEndPointPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log
     * data.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * KinesisStreamConfigProperty kinesisStreamConfigProperty = KinesisStreamConfigProperty.builder()
     * .roleArn("roleArn")
     * .streamArn("streamArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-realtimelogconfig-kinesisstreamconfig.html)
     */
    public inline fun cfnRealtimeLogConfigKinesisStreamConfigProperty(
        block: CfnRealtimeLogConfigKinesisStreamConfigPropertyDsl.() -> Unit = {}
    ): CfnRealtimeLogConfig.KinesisStreamConfigProperty {
        val builder = CfnRealtimeLogConfigKinesisStreamConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRealtimeLogConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnRealtimeLogConfigProps cfnRealtimeLogConfigProps = CfnRealtimeLogConfigProps.builder()
     * .endPoints(List.of(EndPointProperty.builder()
     * .kinesisStreamConfig(KinesisStreamConfigProperty.builder()
     * .roleArn("roleArn")
     * .streamArn("streamArn")
     * .build())
     * .streamType("streamType")
     * .build()))
     * .fields(List.of("fields"))
     * .name("name")
     * .samplingRate(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-realtimelogconfig.html)
     */
    public inline fun cfnRealtimeLogConfigProps(
        block: CfnRealtimeLogConfigPropsDsl.() -> Unit = {}
    ): CfnRealtimeLogConfigProps {
        val builder = CfnRealtimeLogConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A response headers policy.
     *
     * A response headers policy contains information about a set of HTTP response headers.
     *
     * After you create a response headers policy, you can use its ID to attach it to one or more
     * cache behaviors in a CloudFront distribution. When it's attached to a cache behavior, the
     * response headers policy affects the HTTP headers that CloudFront includes in HTTP responses
     * to requests that match the cache behavior. CloudFront adds or removes response headers
     * according to the configuration of the response headers policy.
     *
     * For more information, see
     * [Adding or removing HTTP headers in CloudFront responses](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/modifying-response-headers.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnResponseHeadersPolicy cfnResponseHeadersPolicy =
     * CfnResponseHeadersPolicy.Builder.create(this, "MyCfnResponseHeadersPolicy")
     * .responseHeadersPolicyConfig(ResponseHeadersPolicyConfigProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .corsConfig(CorsConfigProperty.builder()
     * .accessControlAllowCredentials(false)
     * .accessControlAllowHeaders(AccessControlAllowHeadersProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .accessControlAllowMethods(AccessControlAllowMethodsProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .accessControlAllowOrigins(AccessControlAllowOriginsProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .originOverride(false)
     * // the properties below are optional
     * .accessControlExposeHeaders(AccessControlExposeHeadersProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .accessControlMaxAgeSec(123)
     * .build())
     * .customHeadersConfig(CustomHeadersConfigProperty.builder()
     * .items(List.of(CustomHeaderProperty.builder()
     * .header("header")
     * .override(false)
     * .value("value")
     * .build()))
     * .build())
     * .removeHeadersConfig(RemoveHeadersConfigProperty.builder()
     * .items(List.of(RemoveHeaderProperty.builder()
     * .header("header")
     * .build()))
     * .build())
     * .securityHeadersConfig(SecurityHeadersConfigProperty.builder()
     * .contentSecurityPolicy(ContentSecurityPolicyProperty.builder()
     * .contentSecurityPolicy("contentSecurityPolicy")
     * .override(false)
     * .build())
     * .contentTypeOptions(ContentTypeOptionsProperty.builder()
     * .override(false)
     * .build())
     * .frameOptions(FrameOptionsProperty.builder()
     * .frameOption("frameOption")
     * .override(false)
     * .build())
     * .referrerPolicy(ReferrerPolicyProperty.builder()
     * .override(false)
     * .referrerPolicy("referrerPolicy")
     * .build())
     * .strictTransportSecurity(StrictTransportSecurityProperty.builder()
     * .accessControlMaxAgeSec(123)
     * .override(false)
     * // the properties below are optional
     * .includeSubdomains(false)
     * .preload(false)
     * .build())
     * .xssProtection(XSSProtectionProperty.builder()
     * .override(false)
     * .protection(false)
     * // the properties below are optional
     * .modeBlock(false)
     * .reportUri("reportUri")
     * .build())
     * .build())
     * .serverTimingHeadersConfig(ServerTimingHeadersConfigProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .samplingRate(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html)
     */
    public inline fun cfnResponseHeadersPolicy(
        scope: Construct,
        id: String,
        block: CfnResponseHeadersPolicyDsl.() -> Unit = {},
    ): CfnResponseHeadersPolicy {
        val builder = CfnResponseHeadersPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of HTTP header names that CloudFront includes as values for the
     * `Access-Control-Allow-Headers` HTTP response header.
     *
     * For more information about the `Access-Control-Allow-Headers` HTTP response header, see
     * [Access-Control-Allow-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Headers)
     * in the MDN Web Docs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * AccessControlAllowHeadersProperty accessControlAllowHeadersProperty =
     * AccessControlAllowHeadersProperty.builder()
     * .items(List.of("items"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolallowheaders.html)
     */
    public inline fun cfnResponseHeadersPolicyAccessControlAllowHeadersProperty(
        block: CfnResponseHeadersPolicyAccessControlAllowHeadersPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty {
        val builder = CfnResponseHeadersPolicyAccessControlAllowHeadersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of HTTP methods that CloudFront includes as values for the
     * `Access-Control-Allow-Methods` HTTP response header.
     *
     * For more information about the `Access-Control-Allow-Methods` HTTP response header, see
     * [Access-Control-Allow-Methods](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Methods)
     * in the MDN Web Docs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * AccessControlAllowMethodsProperty accessControlAllowMethodsProperty =
     * AccessControlAllowMethodsProperty.builder()
     * .items(List.of("items"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolallowmethods.html)
     */
    public inline fun cfnResponseHeadersPolicyAccessControlAllowMethodsProperty(
        block: CfnResponseHeadersPolicyAccessControlAllowMethodsPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty {
        val builder = CfnResponseHeadersPolicyAccessControlAllowMethodsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of origins (domain names) that CloudFront can use as the value for the
     * `Access-Control-Allow-Origin` HTTP response header.
     *
     * For more information about the `Access-Control-Allow-Origin` HTTP response header, see
     * [Access-Control-Allow-Origin](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Allow-Origin)
     * in the MDN Web Docs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * AccessControlAllowOriginsProperty accessControlAllowOriginsProperty =
     * AccessControlAllowOriginsProperty.builder()
     * .items(List.of("items"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolalloworigins.html)
     */
    public inline fun cfnResponseHeadersPolicyAccessControlAllowOriginsProperty(
        block: CfnResponseHeadersPolicyAccessControlAllowOriginsPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty {
        val builder = CfnResponseHeadersPolicyAccessControlAllowOriginsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of HTTP headers that CloudFront includes as values for the
     * `Access-Control-Expose-Headers` HTTP response header.
     *
     * For more information about the `Access-Control-Expose-Headers` HTTP response header, see
     * [Access-Control-Expose-Headers](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Access-Control-Expose-Headers)
     * in the MDN Web Docs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * AccessControlExposeHeadersProperty accessControlExposeHeadersProperty =
     * AccessControlExposeHeadersProperty.builder()
     * .items(List.of("items"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-accesscontrolexposeheaders.html)
     */
    public inline fun cfnResponseHeadersPolicyAccessControlExposeHeadersProperty(
        block: CfnResponseHeadersPolicyAccessControlExposeHeadersPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty {
        val builder = CfnResponseHeadersPolicyAccessControlExposeHeadersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The policy directives and their values that CloudFront includes as values for the
     * `Content-Security-Policy` HTTP response header.
     *
     * For more information about the `Content-Security-Policy` HTTP response header, see
     * [Content-Security-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Content-Security-Policy)
     * in the MDN Web Docs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * ContentSecurityPolicyProperty contentSecurityPolicyProperty =
     * ContentSecurityPolicyProperty.builder()
     * .contentSecurityPolicy("contentSecurityPolicy")
     * .override(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-contentsecuritypolicy.html)
     */
    public inline fun cfnResponseHeadersPolicyContentSecurityPolicyProperty(
        block: CfnResponseHeadersPolicyContentSecurityPolicyPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.ContentSecurityPolicyProperty {
        val builder = CfnResponseHeadersPolicyContentSecurityPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header with
     * its value set to `nosniff` .
     *
     * For more information about the `X-Content-Type-Options` HTTP response header, see
     * [X-Content-Type-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options)
     * in the MDN Web Docs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * ContentTypeOptionsProperty contentTypeOptionsProperty = ContentTypeOptionsProperty.builder()
     * .override(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-contenttypeoptions.html)
     */
    public inline fun cfnResponseHeadersPolicyContentTypeOptionsProperty(
        block: CfnResponseHeadersPolicyContentTypeOptionsPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.ContentTypeOptionsProperty {
        val builder = CfnResponseHeadersPolicyContentTypeOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A configuration for a set of HTTP response headers that are used for cross-origin resource
     * sharing (CORS).
     *
     * CloudFront adds these headers to HTTP responses that it sends for CORS requests that match a
     * cache behavior associated with this response headers policy.
     *
     * For more information about CORS, see
     * [Cross-Origin Resource Sharing (CORS)](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS)
     * in the MDN Web Docs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CorsConfigProperty corsConfigProperty = CorsConfigProperty.builder()
     * .accessControlAllowCredentials(false)
     * .accessControlAllowHeaders(AccessControlAllowHeadersProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .accessControlAllowMethods(AccessControlAllowMethodsProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .accessControlAllowOrigins(AccessControlAllowOriginsProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .originOverride(false)
     * // the properties below are optional
     * .accessControlExposeHeaders(AccessControlExposeHeadersProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .accessControlMaxAgeSec(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-corsconfig.html)
     */
    public inline fun cfnResponseHeadersPolicyCorsConfigProperty(
        block: CfnResponseHeadersPolicyCorsConfigPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.CorsConfigProperty {
        val builder = CfnResponseHeadersPolicyCorsConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An HTTP response header name and its value.
     *
     * CloudFront includes this header in HTTP responses that it sends for requests that match a
     * cache behavior that's associated with this response headers policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CustomHeaderProperty customHeaderProperty = CustomHeaderProperty.builder()
     * .header("header")
     * .override(false)
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-customheader.html)
     */
    public inline fun cfnResponseHeadersPolicyCustomHeaderProperty(
        block: CfnResponseHeadersPolicyCustomHeaderPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.CustomHeaderProperty {
        val builder = CfnResponseHeadersPolicyCustomHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of HTTP response header names and their values.
     *
     * CloudFront includes these headers in HTTP responses that it sends for requests that match a
     * cache behavior that's associated with this response headers policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CustomHeadersConfigProperty customHeadersConfigProperty = CustomHeadersConfigProperty.builder()
     * .items(List.of(CustomHeaderProperty.builder()
     * .header("header")
     * .override(false)
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-customheadersconfig.html)
     */
    public inline fun cfnResponseHeadersPolicyCustomHeadersConfigProperty(
        block: CfnResponseHeadersPolicyCustomHeadersConfigPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.CustomHeadersConfigProperty {
        val builder = CfnResponseHeadersPolicyCustomHeadersConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines whether CloudFront includes the `X-Frame-Options` HTTP response header and the
     * header's value.
     *
     * For more information about the `X-Frame-Options` HTTP response header, see
     * [X-Frame-Options](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options)
     * in the MDN Web Docs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * FrameOptionsProperty frameOptionsProperty = FrameOptionsProperty.builder()
     * .frameOption("frameOption")
     * .override(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-frameoptions.html)
     */
    public inline fun cfnResponseHeadersPolicyFrameOptionsProperty(
        block: CfnResponseHeadersPolicyFrameOptionsPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.FrameOptionsProperty {
        val builder = CfnResponseHeadersPolicyFrameOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResponseHeadersPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnResponseHeadersPolicyProps cfnResponseHeadersPolicyProps =
     * CfnResponseHeadersPolicyProps.builder()
     * .responseHeadersPolicyConfig(ResponseHeadersPolicyConfigProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .corsConfig(CorsConfigProperty.builder()
     * .accessControlAllowCredentials(false)
     * .accessControlAllowHeaders(AccessControlAllowHeadersProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .accessControlAllowMethods(AccessControlAllowMethodsProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .accessControlAllowOrigins(AccessControlAllowOriginsProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .originOverride(false)
     * // the properties below are optional
     * .accessControlExposeHeaders(AccessControlExposeHeadersProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .accessControlMaxAgeSec(123)
     * .build())
     * .customHeadersConfig(CustomHeadersConfigProperty.builder()
     * .items(List.of(CustomHeaderProperty.builder()
     * .header("header")
     * .override(false)
     * .value("value")
     * .build()))
     * .build())
     * .removeHeadersConfig(RemoveHeadersConfigProperty.builder()
     * .items(List.of(RemoveHeaderProperty.builder()
     * .header("header")
     * .build()))
     * .build())
     * .securityHeadersConfig(SecurityHeadersConfigProperty.builder()
     * .contentSecurityPolicy(ContentSecurityPolicyProperty.builder()
     * .contentSecurityPolicy("contentSecurityPolicy")
     * .override(false)
     * .build())
     * .contentTypeOptions(ContentTypeOptionsProperty.builder()
     * .override(false)
     * .build())
     * .frameOptions(FrameOptionsProperty.builder()
     * .frameOption("frameOption")
     * .override(false)
     * .build())
     * .referrerPolicy(ReferrerPolicyProperty.builder()
     * .override(false)
     * .referrerPolicy("referrerPolicy")
     * .build())
     * .strictTransportSecurity(StrictTransportSecurityProperty.builder()
     * .accessControlMaxAgeSec(123)
     * .override(false)
     * // the properties below are optional
     * .includeSubdomains(false)
     * .preload(false)
     * .build())
     * .xssProtection(XSSProtectionProperty.builder()
     * .override(false)
     * .protection(false)
     * // the properties below are optional
     * .modeBlock(false)
     * .reportUri("reportUri")
     * .build())
     * .build())
     * .serverTimingHeadersConfig(ServerTimingHeadersConfigProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .samplingRate(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-responseheaderspolicy.html)
     */
    public inline fun cfnResponseHeadersPolicyProps(
        block: CfnResponseHeadersPolicyPropsDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicyProps {
        val builder = CfnResponseHeadersPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines whether CloudFront includes the `Referrer-Policy` HTTP response header and the
     * header's value.
     *
     * For more information about the `Referrer-Policy` HTTP response header, see
     * [Referrer-Policy](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Referrer-Policy)
     * in the MDN Web Docs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * ReferrerPolicyProperty referrerPolicyProperty = ReferrerPolicyProperty.builder()
     * .override(false)
     * .referrerPolicy("referrerPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-referrerpolicy.html)
     */
    public inline fun cfnResponseHeadersPolicyReferrerPolicyProperty(
        block: CfnResponseHeadersPolicyReferrerPolicyPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.ReferrerPolicyProperty {
        val builder = CfnResponseHeadersPolicyReferrerPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The name of an HTTP header that CloudFront removes from HTTP responses to requests that match
     * the cache behavior that this response headers policy is attached to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * RemoveHeaderProperty removeHeaderProperty = RemoveHeaderProperty.builder()
     * .header("header")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-removeheader.html)
     */
    public inline fun cfnResponseHeadersPolicyRemoveHeaderProperty(
        block: CfnResponseHeadersPolicyRemoveHeaderPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.RemoveHeaderProperty {
        val builder = CfnResponseHeadersPolicyRemoveHeaderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of HTTP header names that CloudFront removes from HTTP responses to requests that
     * match the cache behavior that this response headers policy is attached to.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * RemoveHeadersConfigProperty removeHeadersConfigProperty = RemoveHeadersConfigProperty.builder()
     * .items(List.of(RemoveHeaderProperty.builder()
     * .header("header")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-removeheadersconfig.html)
     */
    public inline fun cfnResponseHeadersPolicyRemoveHeadersConfigProperty(
        block: CfnResponseHeadersPolicyRemoveHeadersConfigPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.RemoveHeadersConfigProperty {
        val builder = CfnResponseHeadersPolicyRemoveHeadersConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A response headers policy configuration.
     *
     * A response headers policy configuration contains metadata about the response headers policy,
     * and configurations for sets of HTTP response headers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * ResponseHeadersPolicyConfigProperty responseHeadersPolicyConfigProperty =
     * ResponseHeadersPolicyConfigProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .comment("comment")
     * .corsConfig(CorsConfigProperty.builder()
     * .accessControlAllowCredentials(false)
     * .accessControlAllowHeaders(AccessControlAllowHeadersProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .accessControlAllowMethods(AccessControlAllowMethodsProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .accessControlAllowOrigins(AccessControlAllowOriginsProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .originOverride(false)
     * // the properties below are optional
     * .accessControlExposeHeaders(AccessControlExposeHeadersProperty.builder()
     * .items(List.of("items"))
     * .build())
     * .accessControlMaxAgeSec(123)
     * .build())
     * .customHeadersConfig(CustomHeadersConfigProperty.builder()
     * .items(List.of(CustomHeaderProperty.builder()
     * .header("header")
     * .override(false)
     * .value("value")
     * .build()))
     * .build())
     * .removeHeadersConfig(RemoveHeadersConfigProperty.builder()
     * .items(List.of(RemoveHeaderProperty.builder()
     * .header("header")
     * .build()))
     * .build())
     * .securityHeadersConfig(SecurityHeadersConfigProperty.builder()
     * .contentSecurityPolicy(ContentSecurityPolicyProperty.builder()
     * .contentSecurityPolicy("contentSecurityPolicy")
     * .override(false)
     * .build())
     * .contentTypeOptions(ContentTypeOptionsProperty.builder()
     * .override(false)
     * .build())
     * .frameOptions(FrameOptionsProperty.builder()
     * .frameOption("frameOption")
     * .override(false)
     * .build())
     * .referrerPolicy(ReferrerPolicyProperty.builder()
     * .override(false)
     * .referrerPolicy("referrerPolicy")
     * .build())
     * .strictTransportSecurity(StrictTransportSecurityProperty.builder()
     * .accessControlMaxAgeSec(123)
     * .override(false)
     * // the properties below are optional
     * .includeSubdomains(false)
     * .preload(false)
     * .build())
     * .xssProtection(XSSProtectionProperty.builder()
     * .override(false)
     * .protection(false)
     * // the properties below are optional
     * .modeBlock(false)
     * .reportUri("reportUri")
     * .build())
     * .build())
     * .serverTimingHeadersConfig(ServerTimingHeadersConfigProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .samplingRate(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-responseheaderspolicyconfig.html)
     */
    public inline fun cfnResponseHeadersPolicyResponseHeadersPolicyConfigProperty(
        block: CfnResponseHeadersPolicyResponseHeadersPolicyConfigPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty {
        val builder = CfnResponseHeadersPolicyResponseHeadersPolicyConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A configuration for a set of security-related HTTP response headers.
     *
     * CloudFront adds these headers to HTTP responses that it sends for requests that match a cache
     * behavior associated with this response headers policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * SecurityHeadersConfigProperty securityHeadersConfigProperty =
     * SecurityHeadersConfigProperty.builder()
     * .contentSecurityPolicy(ContentSecurityPolicyProperty.builder()
     * .contentSecurityPolicy("contentSecurityPolicy")
     * .override(false)
     * .build())
     * .contentTypeOptions(ContentTypeOptionsProperty.builder()
     * .override(false)
     * .build())
     * .frameOptions(FrameOptionsProperty.builder()
     * .frameOption("frameOption")
     * .override(false)
     * .build())
     * .referrerPolicy(ReferrerPolicyProperty.builder()
     * .override(false)
     * .referrerPolicy("referrerPolicy")
     * .build())
     * .strictTransportSecurity(StrictTransportSecurityProperty.builder()
     * .accessControlMaxAgeSec(123)
     * .override(false)
     * // the properties below are optional
     * .includeSubdomains(false)
     * .preload(false)
     * .build())
     * .xssProtection(XSSProtectionProperty.builder()
     * .override(false)
     * .protection(false)
     * // the properties below are optional
     * .modeBlock(false)
     * .reportUri("reportUri")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-securityheadersconfig.html)
     */
    public inline fun cfnResponseHeadersPolicySecurityHeadersConfigProperty(
        block: CfnResponseHeadersPolicySecurityHeadersConfigPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.SecurityHeadersConfigProperty {
        val builder = CfnResponseHeadersPolicySecurityHeadersConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A configuration for enabling the `Server-Timing` header in HTTP responses sent from
     * CloudFront.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * ServerTimingHeadersConfigProperty serverTimingHeadersConfigProperty =
     * ServerTimingHeadersConfigProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .samplingRate(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-servertimingheadersconfig.html)
     */
    public inline fun cfnResponseHeadersPolicyServerTimingHeadersConfigProperty(
        block: CfnResponseHeadersPolicyServerTimingHeadersConfigPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty {
        val builder = CfnResponseHeadersPolicyServerTimingHeadersConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header
     * and the header's value.
     *
     * For more information about the `Strict-Transport-Security` HTTP response header, see
     * [Strict-Transport-Security](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Strict-Transport-Security)
     * in the MDN Web Docs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * StrictTransportSecurityProperty strictTransportSecurityProperty =
     * StrictTransportSecurityProperty.builder()
     * .accessControlMaxAgeSec(123)
     * .override(false)
     * // the properties below are optional
     * .includeSubdomains(false)
     * .preload(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-stricttransportsecurity.html)
     */
    public inline fun cfnResponseHeadersPolicyStrictTransportSecurityProperty(
        block: CfnResponseHeadersPolicyStrictTransportSecurityPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.StrictTransportSecurityProperty {
        val builder = CfnResponseHeadersPolicyStrictTransportSecurityPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines whether CloudFront includes the `X-XSS-Protection` HTTP response header and the
     * header's value.
     *
     * For more information about the `X-XSS-Protection` HTTP response header, see
     * [X-XSS-Protection](https://docs.aws.amazon.com/https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-XSS-Protection)
     * in the MDN Web Docs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * XSSProtectionProperty xSSProtectionProperty = XSSProtectionProperty.builder()
     * .override(false)
     * .protection(false)
     * // the properties below are optional
     * .modeBlock(false)
     * .reportUri("reportUri")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-responseheaderspolicy-xssprotection.html)
     */
    public inline fun cfnResponseHeadersPolicyXSSProtectionProperty(
        block: CfnResponseHeadersPolicyXSSProtectionPropertyDsl.() -> Unit = {}
    ): CfnResponseHeadersPolicy.XSSProtectionProperty {
        val builder = CfnResponseHeadersPolicyXSSProtectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This resource is deprecated.
     *
     * Amazon CloudFront is deprecating real-time messaging protocol (RTMP) distributions on
     * December 31, 2020. For more information,
     * [read the announcement](https://docs.aws.amazon.com/ann.jspa?annID=7356) on the Amazon
     * CloudFront discussion forum.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnStreamingDistribution cfnStreamingDistribution =
     * CfnStreamingDistribution.Builder.create(this, "MyCfnStreamingDistribution")
     * .streamingDistributionConfig(StreamingDistributionConfigProperty.builder()
     * .comment("comment")
     * .enabled(false)
     * .s3Origin(S3OriginProperty.builder()
     * .domainName("domainName")
     * .originAccessIdentity("originAccessIdentity")
     * .build())
     * .trustedSigners(TrustedSignersProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .awsAccountNumbers(List.of("awsAccountNumbers"))
     * .build())
     * // the properties below are optional
     * .aliases(List.of("aliases"))
     * .logging(LoggingProperty.builder()
     * .bucket("bucket")
     * .enabled(false)
     * .prefix("prefix")
     * .build())
     * .priceClass("priceClass")
     * .build())
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html)
     */
    public inline fun cfnStreamingDistribution(
        scope: Construct,
        id: String,
        block: CfnStreamingDistributionDsl.() -> Unit = {},
    ): CfnStreamingDistribution {
        val builder = CfnStreamingDistributionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that controls whether access logs are written for the streaming distribution.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * LoggingProperty loggingProperty = LoggingProperty.builder()
     * .bucket("bucket")
     * .enabled(false)
     * .prefix("prefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html)
     */
    public inline fun cfnStreamingDistributionLoggingProperty(
        block: CfnStreamingDistributionLoggingPropertyDsl.() -> Unit = {}
    ): CfnStreamingDistribution.LoggingProperty {
        val builder = CfnStreamingDistributionLoggingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStreamingDistribution`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CfnStreamingDistributionProps cfnStreamingDistributionProps =
     * CfnStreamingDistributionProps.builder()
     * .streamingDistributionConfig(StreamingDistributionConfigProperty.builder()
     * .comment("comment")
     * .enabled(false)
     * .s3Origin(S3OriginProperty.builder()
     * .domainName("domainName")
     * .originAccessIdentity("originAccessIdentity")
     * .build())
     * .trustedSigners(TrustedSignersProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .awsAccountNumbers(List.of("awsAccountNumbers"))
     * .build())
     * // the properties below are optional
     * .aliases(List.of("aliases"))
     * .logging(LoggingProperty.builder()
     * .bucket("bucket")
     * .enabled(false)
     * .prefix("prefix")
     * .build())
     * .priceClass("priceClass")
     * .build())
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html)
     */
    public inline fun cfnStreamingDistributionProps(
        block: CfnStreamingDistributionPropsDsl.() -> Unit = {}
    ): CfnStreamingDistributionProps {
        val builder = CfnStreamingDistributionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A complex type that contains information about the Amazon S3 bucket from which you want
     * CloudFront to get your media files for distribution.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * S3OriginProperty s3OriginProperty = S3OriginProperty.builder()
     * .domainName("domainName")
     * .originAccessIdentity("originAccessIdentity")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-s3origin.html)
     */
    public inline fun cfnStreamingDistributionS3OriginProperty(
        block: CfnStreamingDistributionS3OriginPropertyDsl.() -> Unit = {}
    ): CfnStreamingDistribution.S3OriginProperty {
        val builder = CfnStreamingDistributionS3OriginPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The RTMP distribution's configuration information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * StreamingDistributionConfigProperty streamingDistributionConfigProperty =
     * StreamingDistributionConfigProperty.builder()
     * .comment("comment")
     * .enabled(false)
     * .s3Origin(S3OriginProperty.builder()
     * .domainName("domainName")
     * .originAccessIdentity("originAccessIdentity")
     * .build())
     * .trustedSigners(TrustedSignersProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .awsAccountNumbers(List.of("awsAccountNumbers"))
     * .build())
     * // the properties below are optional
     * .aliases(List.of("aliases"))
     * .logging(LoggingProperty.builder()
     * .bucket("bucket")
     * .enabled(false)
     * .prefix("prefix")
     * .build())
     * .priceClass("priceClass")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html)
     */
    public inline fun cfnStreamingDistributionStreamingDistributionConfigProperty(
        block: CfnStreamingDistributionStreamingDistributionConfigPropertyDsl.() -> Unit = {}
    ): CfnStreamingDistribution.StreamingDistributionConfigProperty {
        val builder = CfnStreamingDistributionStreamingDistributionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of AWS accounts whose public keys CloudFront can use to verify the signatures of
     * signed URLs and signed cookies.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * TrustedSignersProperty trustedSignersProperty = TrustedSignersProperty.builder()
     * .enabled(false)
     * // the properties below are optional
     * .awsAccountNumbers(List.of("awsAccountNumbers"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html)
     */
    public inline fun cfnStreamingDistributionTrustedSignersProperty(
        block: CfnStreamingDistributionTrustedSignersPropertyDsl.() -> Unit = {}
    ): CfnStreamingDistribution.TrustedSignersProperty {
        val builder = CfnStreamingDistributionTrustedSignersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Amazon CloudFront is a global content delivery network (CDN) service that securely delivers
     * data, videos, applications, and APIs to your viewers with low latency and high transfer
     * speeds.
     *
     * CloudFront fronts user provided content and caches it at edge locations across the world.
     *
     * Here's how you can use this construct:
     * ```
     * Bucket sourceBucket = new Bucket(this, "Bucket");
     * CloudFrontWebDistribution distribution = CloudFrontWebDistribution.Builder.create(this,
     * "MyDistribution")
     * .originConfigs(List.of(SourceConfiguration.builder()
     * .s3OriginSource(S3OriginConfig.builder()
     * .s3BucketSource(sourceBucket)
     * .build())
     * .behaviors(List.of(Behavior.builder().isDefaultBehavior(true).build()))
     * .build()))
     * .build();
     * ```
     *
     * This will create a CloudFront distribution that uses your S3Bucket as it's origin.
     *
     * You can customize the distribution using additional properties from the
     * CloudFrontWebDistributionProps interface.
     *
     * Example:
     * ```
     * Bucket sourceBucket;
     * ViewerCertificate viewerCertificate =
     * ViewerCertificate.fromIamCertificate("MYIAMROLEIDENTIFIER", ViewerCertificateOptions.builder()
     * .aliases(List.of("MYALIAS"))
     * .build());
     * CloudFrontWebDistribution.Builder.create(this, "MyCfWebDistribution")
     * .originConfigs(List.of(SourceConfiguration.builder()
     * .s3OriginSource(S3OriginConfig.builder()
     * .s3BucketSource(sourceBucket)
     * .build())
     * .behaviors(List.of(Behavior.builder().isDefaultBehavior(true).build()))
     * .build()))
     * .viewerCertificate(viewerCertificate)
     * .build();
     * ```
     */
    public inline fun cloudFrontWebDistribution(
        scope: Construct,
        id: String,
        block: CloudFrontWebDistributionDsl.() -> Unit = {},
    ): CloudFrontWebDistribution {
        val builder = CloudFrontWebDistributionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes used to import a Distribution.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * CloudFrontWebDistributionAttributes cloudFrontWebDistributionAttributes =
     * CloudFrontWebDistributionAttributes.builder()
     * .distributionId("distributionId")
     * .domainName("domainName")
     * .build();
     * ```
     */
    public inline fun cloudFrontWebDistributionAttributes(
        block: CloudFrontWebDistributionAttributesDsl.() -> Unit = {}
    ): CloudFrontWebDistributionAttributes {
        val builder = CloudFrontWebDistributionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Bucket sourceBucket;
     * ViewerCertificate viewerCertificate =
     * ViewerCertificate.fromIamCertificate("MYIAMROLEIDENTIFIER", ViewerCertificateOptions.builder()
     * .aliases(List.of("MYALIAS"))
     * .build());
     * CloudFrontWebDistribution.Builder.create(this, "MyCfWebDistribution")
     * .originConfigs(List.of(SourceConfiguration.builder()
     * .s3OriginSource(S3OriginConfig.builder()
     * .s3BucketSource(sourceBucket)
     * .build())
     * .behaviors(List.of(Behavior.builder().isDefaultBehavior(true).build()))
     * .build()))
     * .viewerCertificate(viewerCertificate)
     * .build();
     * ```
     */
    public inline fun cloudFrontWebDistributionProps(
        block: CloudFrontWebDistributionPropsDsl.() -> Unit = {}
    ): CloudFrontWebDistributionProps {
        val builder = CloudFrontWebDistributionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom origin configuration.
     *
     * Example:
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
    public inline fun customOriginConfig(
        block: CustomOriginConfigDsl.() -> Unit = {}
    ): CustomOriginConfig {
        val builder = CustomOriginConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A CloudFront distribution with associated origin(s) and caching behavior(s).
     *
     * Example:
     * ```
     * Bucket s3Bucket;
     * // Add a cloudfront Function to a Distribution
     * Function cfFunction = Function.Builder.create(this, "Function")
     * .code(FunctionCode.fromInline("function handler(event) { return event.request }"))
     * .build();
     * Distribution.Builder.create(this, "distro")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(new S3Origin(s3Bucket))
     * .functionAssociations(List.of(FunctionAssociation.builder()
     * .function(cfFunction)
     * .eventType(FunctionEventType.VIEWER_REQUEST)
     * .build()))
     * .build())
     * .build();
     * ```
     */
    public inline fun distribution(
        scope: Construct,
        id: String,
        block: DistributionDsl.() -> Unit = {},
    ): Distribution {
        val builder = DistributionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes used to import a Distribution.
     *
     * Example:
     * ```
     * // Using a reference to an imported Distribution
     * IDistribution distribution = Distribution.fromDistributionAttributes(this, "ImportedDist",
     * DistributionAttributes.builder()
     * .domainName("d111111abcdef8.cloudfront.net")
     * .distributionId("012345ABCDEF")
     * .build());
     * ```
     */
    public inline fun distributionAttributes(
        block: DistributionAttributesDsl.() -> Unit = {}
    ): DistributionAttributes {
        val builder = DistributionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a Distribution.
     *
     * Example:
     * ```
     * Bucket s3Bucket;
     * // Add a cloudfront Function to a Distribution
     * Function cfFunction = Function.Builder.create(this, "Function")
     * .code(FunctionCode.fromInline("function handler(event) { return event.request }"))
     * .build();
     * Distribution.Builder.create(this, "distro")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(new S3Origin(s3Bucket))
     * .functionAssociations(List.of(FunctionAssociation.builder()
     * .function(cfFunction)
     * .eventType(FunctionEventType.VIEWER_REQUEST)
     * .build()))
     * .build())
     * .build();
     * ```
     */
    public inline fun distributionProps(
        block: DistributionPropsDsl.() -> Unit = {}
    ): DistributionProps {
        val builder = DistributionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a Lambda function version and event type when using Lambda&#64;Edge.
     *
     * The type of the `AddBehaviorOptions.edgeLambdas` property.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * import software.amazon.awscdk.services.lambda.*;
     * Version version;
     * EdgeLambda edgeLambda = EdgeLambda.builder()
     * .eventType(LambdaEdgeEventType.ORIGIN_REQUEST)
     * .functionVersion(version)
     * // the properties below are optional
     * .includeBody(false)
     * .build();
     * ```
     */
    public inline fun edgeLambda(block: EdgeLambdaDsl.() -> Unit = {}): EdgeLambda {
        val builder = EdgeLambdaDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for configuring custom error responses.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.cloudfront.*;
     * ErrorResponse errorResponse = ErrorResponse.builder()
     * .httpStatus(123)
     * // the properties below are optional
     * .responseHttpStatus(123)
     * .responsePagePath("responsePagePath")
     * .ttl(Duration.minutes(30))
     * .build();
     * ```
     */
    public inline fun errorResponse(block: ErrorResponseDsl.() -> Unit = {}): ErrorResponse {
        val builder = ErrorResponseDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options when reading the function's code from an external file.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * FileCodeOptions fileCodeOptions = FileCodeOptions.builder()
     * .filePath("filePath")
     * .build();
     * ```
     */
    public inline fun fileCodeOptions(block: FileCodeOptionsDsl.() -> Unit = {}): FileCodeOptions {
        val builder = FileCodeOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A CloudFront Function.
     *
     * Example:
     * ```
     * Bucket s3Bucket;
     * // Add a cloudfront Function to a Distribution
     * Function cfFunction = Function.Builder.create(this, "Function")
     * .code(FunctionCode.fromInline("function handler(event) { return event.request }"))
     * .build();
     * Distribution.Builder.create(this, "distro")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(new S3Origin(s3Bucket))
     * .functionAssociations(List.of(FunctionAssociation.builder()
     * .function(cfFunction)
     * .eventType(FunctionEventType.VIEWER_REQUEST)
     * .build()))
     * .build())
     * .build();
     * ```
     */
    public inline fun function(
        scope: Construct,
        id: String,
        block: FunctionDsl.() -> Unit = {},
    ): Function {
        val builder = FunctionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a CloudFront function and event type when using CF Functions.
     *
     * The type of the `AddBehaviorOptions.functionAssociations` property.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * Function function_;
     * FunctionAssociation functionAssociation = FunctionAssociation.builder()
     * .eventType(FunctionEventType.VIEWER_REQUEST)
     * .function(function_)
     * .build();
     * ```
     */
    public inline fun functionAssociation(
        block: FunctionAssociationDsl.() -> Unit = {}
    ): FunctionAssociation {
        val builder = FunctionAssociationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes of an existing CloudFront Function to import it.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * FunctionAttributes functionAttributes = FunctionAttributes.builder()
     * .functionArn("functionArn")
     * .functionName("functionName")
     * .build();
     * ```
     */
    public inline fun functionAttributes(
        block: FunctionAttributesDsl.() -> Unit = {}
    ): FunctionAttributes {
        val builder = FunctionAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating a CloudFront Function.
     *
     * Example:
     * ```
     * Bucket s3Bucket;
     * // Add a cloudfront Function to a Distribution
     * Function cfFunction = Function.Builder.create(this, "Function")
     * .code(FunctionCode.fromInline("function handler(event) { return event.request }"))
     * .build();
     * Distribution.Builder.create(this, "distro")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(new S3Origin(s3Bucket))
     * .functionAssociations(List.of(FunctionAssociation.builder()
     * .function(cfFunction)
     * .eventType(FunctionEventType.VIEWER_REQUEST)
     * .build()))
     * .build())
     * .build();
     * ```
     */
    public inline fun functionProps(block: FunctionPropsDsl.() -> Unit = {}): FunctionProps {
        val builder = FunctionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Key Group configuration.
     *
     * Example:
     * ```
     * // Validating signed URLs or signed cookies with Trusted Key Groups
     * // public key in PEM format
     * String publicKey;
     * PublicKey pubKey = PublicKey.Builder.create(this, "MyPubKey")
     * .encodedKey(publicKey)
     * .build();
     * KeyGroup keyGroup = KeyGroup.Builder.create(this, "MyKeyGroup")
     * .items(List.of(pubKey))
     * .build();
     * Distribution.Builder.create(this, "Dist")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(new HttpOrigin("www.example.com"))
     * .trustedKeyGroups(List.of(keyGroup))
     * .build())
     * .build();
     * ```
     */
    public inline fun keyGroup(
        scope: Construct,
        id: String,
        block: KeyGroupDsl.() -> Unit = {},
    ): KeyGroup {
        val builder = KeyGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating a Public Key.
     *
     * Example:
     * ```
     * // Validating signed URLs or signed cookies with Trusted Key Groups
     * // public key in PEM format
     * String publicKey;
     * PublicKey pubKey = PublicKey.Builder.create(this, "MyPubKey")
     * .encodedKey(publicKey)
     * .build();
     * KeyGroup keyGroup = KeyGroup.Builder.create(this, "MyKeyGroup")
     * .items(List.of(pubKey))
     * .build();
     * Distribution.Builder.create(this, "Dist")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(new HttpOrigin("www.example.com"))
     * .trustedKeyGroups(List.of(keyGroup))
     * .build())
     * .build();
     * ```
     */
    public inline fun keyGroupProps(block: KeyGroupPropsDsl.() -> Unit = {}): KeyGroupProps {
        val builder = KeyGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * import software.amazon.awscdk.services.lambda.*;
     * Version version;
     * LambdaFunctionAssociation lambdaFunctionAssociation = LambdaFunctionAssociation.builder()
     * .eventType(LambdaEdgeEventType.ORIGIN_REQUEST)
     * .lambdaFunction(version)
     * // the properties below are optional
     * .includeBody(false)
     * .build();
     * ```
     */
    public inline fun lambdaFunctionAssociation(
        block: LambdaFunctionAssociationDsl.() -> Unit = {}
    ): LambdaFunctionAssociation {
        val builder = LambdaFunctionAssociationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Logging configuration for incoming requests.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * import software.amazon.awscdk.services.s3.*;
     * Bucket bucket;
     * LoggingConfiguration loggingConfiguration = LoggingConfiguration.builder()
     * .bucket(bucket)
     * .includeCookies(false)
     * .prefix("prefix")
     * .build();
     * ```
     */
    public inline fun loggingConfiguration(
        block: LoggingConfigurationDsl.() -> Unit = {}
    ): LoggingConfiguration {
        val builder = LoggingConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An origin access identity is a special CloudFront user that you can associate with Amazon S3
     * origins, so that you can secure all or just some of your Amazon S3 content.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * OriginAccessIdentity originAccessIdentity = OriginAccessIdentity.Builder.create(this,
     * "MyOriginAccessIdentity")
     * .comment("comment")
     * .build();
     * ```
     */
    public inline fun originAccessIdentity(
        scope: Construct,
        id: String,
        block: OriginAccessIdentityDsl.() -> Unit = {},
    ): OriginAccessIdentity {
        val builder = OriginAccessIdentityDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of CloudFront OriginAccessIdentity.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * OriginAccessIdentityProps originAccessIdentityProps = OriginAccessIdentityProps.builder()
     * .comment("comment")
     * .build();
     * ```
     */
    public inline fun originAccessIdentityProps(
        block: OriginAccessIdentityPropsDsl.() -> Unit = {}
    ): OriginAccessIdentityProps {
        val builder = OriginAccessIdentityPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The struct returned from `IOrigin.bind`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * IOrigin origin;
     * OriginBindConfig originBindConfig = OriginBindConfig.builder()
     * .failoverConfig(OriginFailoverConfig.builder()
     * .failoverOrigin(origin)
     * // the properties below are optional
     * .statusCodes(List.of(123))
     * .build())
     * .originProperty(OriginProperty.builder()
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
     * .build())
     * .build();
     * ```
     */
    public inline fun originBindConfig(
        block: OriginBindConfigDsl.() -> Unit = {}
    ): OriginBindConfig {
        val builder = OriginBindConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options passed to Origin.bind().
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * OriginBindOptions originBindOptions = OriginBindOptions.builder()
     * .originId("originId")
     * .build();
     * ```
     */
    public inline fun originBindOptions(
        block: OriginBindOptionsDsl.() -> Unit = {}
    ): OriginBindOptions {
        val builder = OriginBindOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The failover configuration used for Origin Groups, returned in
     * `OriginBindConfig.failoverConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * IOrigin origin;
     * OriginFailoverConfig originFailoverConfig = OriginFailoverConfig.builder()
     * .failoverOrigin(origin)
     * // the properties below are optional
     * .statusCodes(List.of(123))
     * .build();
     * ```
     */
    public inline fun originFailoverConfig(
        block: OriginFailoverConfigDsl.() -> Unit = {}
    ): OriginFailoverConfig {
        val builder = OriginFailoverConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to define an Origin.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.cloudfront.*;
     * OriginOptions originOptions = OriginOptions.builder()
     * .connectionAttempts(123)
     * .connectionTimeout(Duration.minutes(30))
     * .customHeaders(Map.of(
     * "customHeadersKey", "customHeaders"))
     * .originId("originId")
     * .originShieldEnabled(false)
     * .originShieldRegion("originShieldRegion")
     * .build();
     * ```
     */
    public inline fun originOptions(block: OriginOptionsDsl.() -> Unit = {}): OriginOptions {
        val builder = OriginOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to define an Origin.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.cloudfront.*;
     * OriginProps originProps = OriginProps.builder()
     * .connectionAttempts(123)
     * .connectionTimeout(Duration.minutes(30))
     * .customHeaders(Map.of(
     * "customHeadersKey", "customHeaders"))
     * .originId("originId")
     * .originPath("originPath")
     * .originShieldEnabled(false)
     * .originShieldRegion("originShieldRegion")
     * .build();
     * ```
     */
    public inline fun originProps(block: OriginPropsDsl.() -> Unit = {}): OriginProps {
        val builder = OriginPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Origin Request Policy configuration.
     *
     * Example:
     * ```
     * // Using an existing origin request policy for a Distribution
     * S3Origin bucketOrigin;
     * Distribution.Builder.create(this, "myDistManagedPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .originRequestPolicy(OriginRequestPolicy.CORS_S3_ORIGIN)
     * .build())
     * .build();
     * ```
     */
    public inline fun originRequestPolicy(
        scope: Construct,
        id: String,
        block: OriginRequestPolicyDsl.() -> Unit = {},
    ): OriginRequestPolicy {
        val builder = OriginRequestPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating a Origin Request Policy.
     *
     * Example:
     * ```
     * // Creating a custom origin request policy for a Distribution -- all parameters optional
     * S3Origin bucketOrigin;
     * OriginRequestPolicy myOriginRequestPolicy = OriginRequestPolicy.Builder.create(this,
     * "OriginRequestPolicy")
     * .originRequestPolicyName("MyPolicy")
     * .comment("A default policy")
     * .cookieBehavior(OriginRequestCookieBehavior.none())
     * .headerBehavior(OriginRequestHeaderBehavior.all("CloudFront-Is-Android-Viewer"))
     * .queryStringBehavior(OriginRequestQueryStringBehavior.allowList("username"))
     * .build();
     * Distribution.Builder.create(this, "myDistCustomPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .originRequestPolicy(myOriginRequestPolicy)
     * .build())
     * .build();
     * ```
     */
    public inline fun originRequestPolicyProps(
        block: OriginRequestPolicyPropsDsl.() -> Unit = {}
    ): OriginRequestPolicyProps {
        val builder = OriginRequestPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Public Key Configuration.
     *
     * Example:
     * ```
     * // Validating signed URLs or signed cookies with Trusted Key Groups
     * // public key in PEM format
     * String publicKey;
     * PublicKey pubKey = PublicKey.Builder.create(this, "MyPubKey")
     * .encodedKey(publicKey)
     * .build();
     * KeyGroup keyGroup = KeyGroup.Builder.create(this, "MyKeyGroup")
     * .items(List.of(pubKey))
     * .build();
     * Distribution.Builder.create(this, "Dist")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(new HttpOrigin("www.example.com"))
     * .trustedKeyGroups(List.of(keyGroup))
     * .build())
     * .build();
     * ```
     */
    public inline fun publicKey(
        scope: Construct,
        id: String,
        block: PublicKeyDsl.() -> Unit = {},
    ): PublicKey {
        val builder = PublicKeyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating a Public Key.
     *
     * Example:
     * ```
     * // Validating signed URLs or signed cookies with Trusted Key Groups
     * // public key in PEM format
     * String publicKey;
     * PublicKey pubKey = PublicKey.Builder.create(this, "MyPubKey")
     * .encodedKey(publicKey)
     * .build();
     * KeyGroup keyGroup = KeyGroup.Builder.create(this, "MyKeyGroup")
     * .items(List.of(pubKey))
     * .build();
     * Distribution.Builder.create(this, "Dist")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(new HttpOrigin("www.example.com"))
     * .trustedKeyGroups(List.of(keyGroup))
     * .build())
     * .build();
     * ```
     */
    public inline fun publicKeyProps(block: PublicKeyPropsDsl.() -> Unit = {}): PublicKeyProps {
        val builder = PublicKeyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An HTTP response header name and its value.
     *
     * CloudFront includes this header in HTTP responses that it sends for requests that match a
     * cache behavior that’s associated with this response headers policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudfront.*;
     * ResponseCustomHeader responseCustomHeader = ResponseCustomHeader.builder()
     * .header("header")
     * .override(false)
     * .value("value")
     * .build();
     * ```
     */
    public inline fun responseCustomHeader(
        block: ResponseCustomHeaderDsl.() -> Unit = {}
    ): ResponseCustomHeader {
        val builder = ResponseCustomHeaderDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for a set of HTTP response headers that are sent for requests that match a
     * cache behavior that’s associated with this response headers policy.
     *
     * Example:
     * ```
     * // Using an existing managed response headers policy
     * S3Origin bucketOrigin;
     * Distribution.Builder.create(this, "myDistManagedPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)
     * .build())
     * .build();
     * // Creating a custom response headers policy -- all parameters optional
     * ResponseHeadersPolicy myResponseHeadersPolicy = ResponseHeadersPolicy.Builder.create(this,
     * "ResponseHeadersPolicy")
     * .responseHeadersPolicyName("MyPolicy")
     * .comment("A default policy")
     * .corsBehavior(ResponseHeadersCorsBehavior.builder()
     * .accessControlAllowCredentials(false)
     * .accessControlAllowHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlAllowMethods(List.of("GET", "POST"))
     * .accessControlAllowOrigins(List.of("*"))
     * .accessControlExposeHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlMaxAge(Duration.seconds(600))
     * .originOverride(true)
     * .build())
     * .customHeadersBehavior(ResponseCustomHeadersBehavior.builder()
     * .customHeaders(List.of(ResponseCustomHeader.builder().header("X-Amz-Date").value("some-value").override(true).build(),
     * ResponseCustomHeader.builder().header("X-Amz-Security-Token").value("some-value").override(false).build()))
     * .build())
     * .securityHeadersBehavior(ResponseSecurityHeadersBehavior.builder()
     * .contentSecurityPolicy(ResponseHeadersContentSecurityPolicy.builder().contentSecurityPolicy("default-src
     * https:;").override(true).build())
     * .contentTypeOptions(ResponseHeadersContentTypeOptions.builder().override(true).build())
     * .frameOptions(ResponseHeadersFrameOptions.builder().frameOption(HeadersFrameOption.DENY).override(true).build())
     * .referrerPolicy(ResponseHeadersReferrerPolicy.builder().referrerPolicy(HeadersReferrerPolicy.NO_REFERRER).override(true).build())
     * .strictTransportSecurity(ResponseHeadersStrictTransportSecurity.builder().accessControlMaxAge(Duration.seconds(600)).includeSubdomains(true).override(true).build())
     * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(true).reportUri("https://example.com/csp-report").override(true).build())
     * .build())
     * .removeHeaders(List.of("Server"))
     * .serverTimingSamplingRate(50)
     * .build();
     * Distribution.Builder.create(this, "myDistCustomPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(myResponseHeadersPolicy)
     * .build())
     * .build();
     * ```
     */
    public inline fun responseCustomHeadersBehavior(
        block: ResponseCustomHeadersBehaviorDsl.() -> Unit = {}
    ): ResponseCustomHeadersBehavior {
        val builder = ResponseCustomHeadersBehaviorDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The policy directives and their values that CloudFront includes as values for the
     * Content-Security-Policy HTTP response header.
     *
     * Example:
     * ```
     * // Using an existing managed response headers policy
     * S3Origin bucketOrigin;
     * Distribution.Builder.create(this, "myDistManagedPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)
     * .build())
     * .build();
     * // Creating a custom response headers policy -- all parameters optional
     * ResponseHeadersPolicy myResponseHeadersPolicy = ResponseHeadersPolicy.Builder.create(this,
     * "ResponseHeadersPolicy")
     * .responseHeadersPolicyName("MyPolicy")
     * .comment("A default policy")
     * .corsBehavior(ResponseHeadersCorsBehavior.builder()
     * .accessControlAllowCredentials(false)
     * .accessControlAllowHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlAllowMethods(List.of("GET", "POST"))
     * .accessControlAllowOrigins(List.of("*"))
     * .accessControlExposeHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlMaxAge(Duration.seconds(600))
     * .originOverride(true)
     * .build())
     * .customHeadersBehavior(ResponseCustomHeadersBehavior.builder()
     * .customHeaders(List.of(ResponseCustomHeader.builder().header("X-Amz-Date").value("some-value").override(true).build(),
     * ResponseCustomHeader.builder().header("X-Amz-Security-Token").value("some-value").override(false).build()))
     * .build())
     * .securityHeadersBehavior(ResponseSecurityHeadersBehavior.builder()
     * .contentSecurityPolicy(ResponseHeadersContentSecurityPolicy.builder().contentSecurityPolicy("default-src
     * https:;").override(true).build())
     * .contentTypeOptions(ResponseHeadersContentTypeOptions.builder().override(true).build())
     * .frameOptions(ResponseHeadersFrameOptions.builder().frameOption(HeadersFrameOption.DENY).override(true).build())
     * .referrerPolicy(ResponseHeadersReferrerPolicy.builder().referrerPolicy(HeadersReferrerPolicy.NO_REFERRER).override(true).build())
     * .strictTransportSecurity(ResponseHeadersStrictTransportSecurity.builder().accessControlMaxAge(Duration.seconds(600)).includeSubdomains(true).override(true).build())
     * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(true).reportUri("https://example.com/csp-report").override(true).build())
     * .build())
     * .removeHeaders(List.of("Server"))
     * .serverTimingSamplingRate(50)
     * .build();
     * Distribution.Builder.create(this, "myDistCustomPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(myResponseHeadersPolicy)
     * .build())
     * .build();
     * ```
     */
    public inline fun responseHeadersContentSecurityPolicy(
        block: ResponseHeadersContentSecurityPolicyDsl.() -> Unit = {}
    ): ResponseHeadersContentSecurityPolicy {
        val builder = ResponseHeadersContentSecurityPolicyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines whether CloudFront includes the X-Content-Type-Options HTTP response header with
     * its value set to nosniff.
     *
     * Example:
     * ```
     * // Using an existing managed response headers policy
     * S3Origin bucketOrigin;
     * Distribution.Builder.create(this, "myDistManagedPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)
     * .build())
     * .build();
     * // Creating a custom response headers policy -- all parameters optional
     * ResponseHeadersPolicy myResponseHeadersPolicy = ResponseHeadersPolicy.Builder.create(this,
     * "ResponseHeadersPolicy")
     * .responseHeadersPolicyName("MyPolicy")
     * .comment("A default policy")
     * .corsBehavior(ResponseHeadersCorsBehavior.builder()
     * .accessControlAllowCredentials(false)
     * .accessControlAllowHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlAllowMethods(List.of("GET", "POST"))
     * .accessControlAllowOrigins(List.of("*"))
     * .accessControlExposeHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlMaxAge(Duration.seconds(600))
     * .originOverride(true)
     * .build())
     * .customHeadersBehavior(ResponseCustomHeadersBehavior.builder()
     * .customHeaders(List.of(ResponseCustomHeader.builder().header("X-Amz-Date").value("some-value").override(true).build(),
     * ResponseCustomHeader.builder().header("X-Amz-Security-Token").value("some-value").override(false).build()))
     * .build())
     * .securityHeadersBehavior(ResponseSecurityHeadersBehavior.builder()
     * .contentSecurityPolicy(ResponseHeadersContentSecurityPolicy.builder().contentSecurityPolicy("default-src
     * https:;").override(true).build())
     * .contentTypeOptions(ResponseHeadersContentTypeOptions.builder().override(true).build())
     * .frameOptions(ResponseHeadersFrameOptions.builder().frameOption(HeadersFrameOption.DENY).override(true).build())
     * .referrerPolicy(ResponseHeadersReferrerPolicy.builder().referrerPolicy(HeadersReferrerPolicy.NO_REFERRER).override(true).build())
     * .strictTransportSecurity(ResponseHeadersStrictTransportSecurity.builder().accessControlMaxAge(Duration.seconds(600)).includeSubdomains(true).override(true).build())
     * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(true).reportUri("https://example.com/csp-report").override(true).build())
     * .build())
     * .removeHeaders(List.of("Server"))
     * .serverTimingSamplingRate(50)
     * .build();
     * Distribution.Builder.create(this, "myDistCustomPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(myResponseHeadersPolicy)
     * .build())
     * .build();
     * ```
     */
    public inline fun responseHeadersContentTypeOptions(
        block: ResponseHeadersContentTypeOptionsDsl.() -> Unit = {}
    ): ResponseHeadersContentTypeOptions {
        val builder = ResponseHeadersContentTypeOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for a set of HTTP response headers that are used for cross-origin resource
     * sharing (CORS).
     *
     * CloudFront adds these headers to HTTP responses that it sends for CORS requests that match a
     * cache behavior associated with this response headers policy.
     *
     * Example:
     * ```
     * // Using an existing managed response headers policy
     * S3Origin bucketOrigin;
     * Distribution.Builder.create(this, "myDistManagedPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)
     * .build())
     * .build();
     * // Creating a custom response headers policy -- all parameters optional
     * ResponseHeadersPolicy myResponseHeadersPolicy = ResponseHeadersPolicy.Builder.create(this,
     * "ResponseHeadersPolicy")
     * .responseHeadersPolicyName("MyPolicy")
     * .comment("A default policy")
     * .corsBehavior(ResponseHeadersCorsBehavior.builder()
     * .accessControlAllowCredentials(false)
     * .accessControlAllowHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlAllowMethods(List.of("GET", "POST"))
     * .accessControlAllowOrigins(List.of("*"))
     * .accessControlExposeHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlMaxAge(Duration.seconds(600))
     * .originOverride(true)
     * .build())
     * .customHeadersBehavior(ResponseCustomHeadersBehavior.builder()
     * .customHeaders(List.of(ResponseCustomHeader.builder().header("X-Amz-Date").value("some-value").override(true).build(),
     * ResponseCustomHeader.builder().header("X-Amz-Security-Token").value("some-value").override(false).build()))
     * .build())
     * .securityHeadersBehavior(ResponseSecurityHeadersBehavior.builder()
     * .contentSecurityPolicy(ResponseHeadersContentSecurityPolicy.builder().contentSecurityPolicy("default-src
     * https:;").override(true).build())
     * .contentTypeOptions(ResponseHeadersContentTypeOptions.builder().override(true).build())
     * .frameOptions(ResponseHeadersFrameOptions.builder().frameOption(HeadersFrameOption.DENY).override(true).build())
     * .referrerPolicy(ResponseHeadersReferrerPolicy.builder().referrerPolicy(HeadersReferrerPolicy.NO_REFERRER).override(true).build())
     * .strictTransportSecurity(ResponseHeadersStrictTransportSecurity.builder().accessControlMaxAge(Duration.seconds(600)).includeSubdomains(true).override(true).build())
     * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(true).reportUri("https://example.com/csp-report").override(true).build())
     * .build())
     * .removeHeaders(List.of("Server"))
     * .serverTimingSamplingRate(50)
     * .build();
     * Distribution.Builder.create(this, "myDistCustomPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(myResponseHeadersPolicy)
     * .build())
     * .build();
     * ```
     */
    public inline fun responseHeadersCorsBehavior(
        block: ResponseHeadersCorsBehaviorDsl.() -> Unit = {}
    ): ResponseHeadersCorsBehavior {
        val builder = ResponseHeadersCorsBehaviorDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines whether CloudFront includes the X-Frame-Options HTTP response header and the
     * header’s value.
     *
     * Example:
     * ```
     * // Using an existing managed response headers policy
     * S3Origin bucketOrigin;
     * Distribution.Builder.create(this, "myDistManagedPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)
     * .build())
     * .build();
     * // Creating a custom response headers policy -- all parameters optional
     * ResponseHeadersPolicy myResponseHeadersPolicy = ResponseHeadersPolicy.Builder.create(this,
     * "ResponseHeadersPolicy")
     * .responseHeadersPolicyName("MyPolicy")
     * .comment("A default policy")
     * .corsBehavior(ResponseHeadersCorsBehavior.builder()
     * .accessControlAllowCredentials(false)
     * .accessControlAllowHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlAllowMethods(List.of("GET", "POST"))
     * .accessControlAllowOrigins(List.of("*"))
     * .accessControlExposeHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlMaxAge(Duration.seconds(600))
     * .originOverride(true)
     * .build())
     * .customHeadersBehavior(ResponseCustomHeadersBehavior.builder()
     * .customHeaders(List.of(ResponseCustomHeader.builder().header("X-Amz-Date").value("some-value").override(true).build(),
     * ResponseCustomHeader.builder().header("X-Amz-Security-Token").value("some-value").override(false).build()))
     * .build())
     * .securityHeadersBehavior(ResponseSecurityHeadersBehavior.builder()
     * .contentSecurityPolicy(ResponseHeadersContentSecurityPolicy.builder().contentSecurityPolicy("default-src
     * https:;").override(true).build())
     * .contentTypeOptions(ResponseHeadersContentTypeOptions.builder().override(true).build())
     * .frameOptions(ResponseHeadersFrameOptions.builder().frameOption(HeadersFrameOption.DENY).override(true).build())
     * .referrerPolicy(ResponseHeadersReferrerPolicy.builder().referrerPolicy(HeadersReferrerPolicy.NO_REFERRER).override(true).build())
     * .strictTransportSecurity(ResponseHeadersStrictTransportSecurity.builder().accessControlMaxAge(Duration.seconds(600)).includeSubdomains(true).override(true).build())
     * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(true).reportUri("https://example.com/csp-report").override(true).build())
     * .build())
     * .removeHeaders(List.of("Server"))
     * .serverTimingSamplingRate(50)
     * .build();
     * Distribution.Builder.create(this, "myDistCustomPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(myResponseHeadersPolicy)
     * .build())
     * .build();
     * ```
     */
    public inline fun responseHeadersFrameOptions(
        block: ResponseHeadersFrameOptionsDsl.() -> Unit = {}
    ): ResponseHeadersFrameOptions {
        val builder = ResponseHeadersFrameOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Response Headers Policy configuration.
     *
     * Example:
     * ```
     * // Using an existing managed response headers policy
     * S3Origin bucketOrigin;
     * Distribution.Builder.create(this, "myDistManagedPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)
     * .build())
     * .build();
     * // Creating a custom response headers policy -- all parameters optional
     * ResponseHeadersPolicy myResponseHeadersPolicy = ResponseHeadersPolicy.Builder.create(this,
     * "ResponseHeadersPolicy")
     * .responseHeadersPolicyName("MyPolicy")
     * .comment("A default policy")
     * .corsBehavior(ResponseHeadersCorsBehavior.builder()
     * .accessControlAllowCredentials(false)
     * .accessControlAllowHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlAllowMethods(List.of("GET", "POST"))
     * .accessControlAllowOrigins(List.of("*"))
     * .accessControlExposeHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlMaxAge(Duration.seconds(600))
     * .originOverride(true)
     * .build())
     * .customHeadersBehavior(ResponseCustomHeadersBehavior.builder()
     * .customHeaders(List.of(ResponseCustomHeader.builder().header("X-Amz-Date").value("some-value").override(true).build(),
     * ResponseCustomHeader.builder().header("X-Amz-Security-Token").value("some-value").override(false).build()))
     * .build())
     * .securityHeadersBehavior(ResponseSecurityHeadersBehavior.builder()
     * .contentSecurityPolicy(ResponseHeadersContentSecurityPolicy.builder().contentSecurityPolicy("default-src
     * https:;").override(true).build())
     * .contentTypeOptions(ResponseHeadersContentTypeOptions.builder().override(true).build())
     * .frameOptions(ResponseHeadersFrameOptions.builder().frameOption(HeadersFrameOption.DENY).override(true).build())
     * .referrerPolicy(ResponseHeadersReferrerPolicy.builder().referrerPolicy(HeadersReferrerPolicy.NO_REFERRER).override(true).build())
     * .strictTransportSecurity(ResponseHeadersStrictTransportSecurity.builder().accessControlMaxAge(Duration.seconds(600)).includeSubdomains(true).override(true).build())
     * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(true).reportUri("https://example.com/csp-report").override(true).build())
     * .build())
     * .removeHeaders(List.of("Server"))
     * .serverTimingSamplingRate(50)
     * .build();
     * Distribution.Builder.create(this, "myDistCustomPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(myResponseHeadersPolicy)
     * .build())
     * .build();
     * ```
     */
    public inline fun responseHeadersPolicy(
        scope: Construct,
        id: String,
        block: ResponseHeadersPolicyDsl.() -> Unit = {},
    ): ResponseHeadersPolicy {
        val builder = ResponseHeadersPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating a Response Headers Policy.
     *
     * Example:
     * ```
     * // Using an existing managed response headers policy
     * S3Origin bucketOrigin;
     * Distribution.Builder.create(this, "myDistManagedPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)
     * .build())
     * .build();
     * // Creating a custom response headers policy -- all parameters optional
     * ResponseHeadersPolicy myResponseHeadersPolicy = ResponseHeadersPolicy.Builder.create(this,
     * "ResponseHeadersPolicy")
     * .responseHeadersPolicyName("MyPolicy")
     * .comment("A default policy")
     * .corsBehavior(ResponseHeadersCorsBehavior.builder()
     * .accessControlAllowCredentials(false)
     * .accessControlAllowHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlAllowMethods(List.of("GET", "POST"))
     * .accessControlAllowOrigins(List.of("*"))
     * .accessControlExposeHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlMaxAge(Duration.seconds(600))
     * .originOverride(true)
     * .build())
     * .customHeadersBehavior(ResponseCustomHeadersBehavior.builder()
     * .customHeaders(List.of(ResponseCustomHeader.builder().header("X-Amz-Date").value("some-value").override(true).build(),
     * ResponseCustomHeader.builder().header("X-Amz-Security-Token").value("some-value").override(false).build()))
     * .build())
     * .securityHeadersBehavior(ResponseSecurityHeadersBehavior.builder()
     * .contentSecurityPolicy(ResponseHeadersContentSecurityPolicy.builder().contentSecurityPolicy("default-src
     * https:;").override(true).build())
     * .contentTypeOptions(ResponseHeadersContentTypeOptions.builder().override(true).build())
     * .frameOptions(ResponseHeadersFrameOptions.builder().frameOption(HeadersFrameOption.DENY).override(true).build())
     * .referrerPolicy(ResponseHeadersReferrerPolicy.builder().referrerPolicy(HeadersReferrerPolicy.NO_REFERRER).override(true).build())
     * .strictTransportSecurity(ResponseHeadersStrictTransportSecurity.builder().accessControlMaxAge(Duration.seconds(600)).includeSubdomains(true).override(true).build())
     * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(true).reportUri("https://example.com/csp-report").override(true).build())
     * .build())
     * .removeHeaders(List.of("Server"))
     * .serverTimingSamplingRate(50)
     * .build();
     * Distribution.Builder.create(this, "myDistCustomPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(myResponseHeadersPolicy)
     * .build())
     * .build();
     * ```
     */
    public inline fun responseHeadersPolicyProps(
        block: ResponseHeadersPolicyPropsDsl.() -> Unit = {}
    ): ResponseHeadersPolicyProps {
        val builder = ResponseHeadersPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines whether CloudFront includes the Referrer-Policy HTTP response header and the
     * header’s value.
     *
     * Example:
     * ```
     * // Using an existing managed response headers policy
     * S3Origin bucketOrigin;
     * Distribution.Builder.create(this, "myDistManagedPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)
     * .build())
     * .build();
     * // Creating a custom response headers policy -- all parameters optional
     * ResponseHeadersPolicy myResponseHeadersPolicy = ResponseHeadersPolicy.Builder.create(this,
     * "ResponseHeadersPolicy")
     * .responseHeadersPolicyName("MyPolicy")
     * .comment("A default policy")
     * .corsBehavior(ResponseHeadersCorsBehavior.builder()
     * .accessControlAllowCredentials(false)
     * .accessControlAllowHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlAllowMethods(List.of("GET", "POST"))
     * .accessControlAllowOrigins(List.of("*"))
     * .accessControlExposeHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlMaxAge(Duration.seconds(600))
     * .originOverride(true)
     * .build())
     * .customHeadersBehavior(ResponseCustomHeadersBehavior.builder()
     * .customHeaders(List.of(ResponseCustomHeader.builder().header("X-Amz-Date").value("some-value").override(true).build(),
     * ResponseCustomHeader.builder().header("X-Amz-Security-Token").value("some-value").override(false).build()))
     * .build())
     * .securityHeadersBehavior(ResponseSecurityHeadersBehavior.builder()
     * .contentSecurityPolicy(ResponseHeadersContentSecurityPolicy.builder().contentSecurityPolicy("default-src
     * https:;").override(true).build())
     * .contentTypeOptions(ResponseHeadersContentTypeOptions.builder().override(true).build())
     * .frameOptions(ResponseHeadersFrameOptions.builder().frameOption(HeadersFrameOption.DENY).override(true).build())
     * .referrerPolicy(ResponseHeadersReferrerPolicy.builder().referrerPolicy(HeadersReferrerPolicy.NO_REFERRER).override(true).build())
     * .strictTransportSecurity(ResponseHeadersStrictTransportSecurity.builder().accessControlMaxAge(Duration.seconds(600)).includeSubdomains(true).override(true).build())
     * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(true).reportUri("https://example.com/csp-report").override(true).build())
     * .build())
     * .removeHeaders(List.of("Server"))
     * .serverTimingSamplingRate(50)
     * .build();
     * Distribution.Builder.create(this, "myDistCustomPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(myResponseHeadersPolicy)
     * .build())
     * .build();
     * ```
     */
    public inline fun responseHeadersReferrerPolicy(
        block: ResponseHeadersReferrerPolicyDsl.() -> Unit = {}
    ): ResponseHeadersReferrerPolicy {
        val builder = ResponseHeadersReferrerPolicyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines whether CloudFront includes the Strict-Transport-Security HTTP response header and
     * the header’s value.
     *
     * Example:
     * ```
     * // Using an existing managed response headers policy
     * S3Origin bucketOrigin;
     * Distribution.Builder.create(this, "myDistManagedPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)
     * .build())
     * .build();
     * // Creating a custom response headers policy -- all parameters optional
     * ResponseHeadersPolicy myResponseHeadersPolicy = ResponseHeadersPolicy.Builder.create(this,
     * "ResponseHeadersPolicy")
     * .responseHeadersPolicyName("MyPolicy")
     * .comment("A default policy")
     * .corsBehavior(ResponseHeadersCorsBehavior.builder()
     * .accessControlAllowCredentials(false)
     * .accessControlAllowHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlAllowMethods(List.of("GET", "POST"))
     * .accessControlAllowOrigins(List.of("*"))
     * .accessControlExposeHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlMaxAge(Duration.seconds(600))
     * .originOverride(true)
     * .build())
     * .customHeadersBehavior(ResponseCustomHeadersBehavior.builder()
     * .customHeaders(List.of(ResponseCustomHeader.builder().header("X-Amz-Date").value("some-value").override(true).build(),
     * ResponseCustomHeader.builder().header("X-Amz-Security-Token").value("some-value").override(false).build()))
     * .build())
     * .securityHeadersBehavior(ResponseSecurityHeadersBehavior.builder()
     * .contentSecurityPolicy(ResponseHeadersContentSecurityPolicy.builder().contentSecurityPolicy("default-src
     * https:;").override(true).build())
     * .contentTypeOptions(ResponseHeadersContentTypeOptions.builder().override(true).build())
     * .frameOptions(ResponseHeadersFrameOptions.builder().frameOption(HeadersFrameOption.DENY).override(true).build())
     * .referrerPolicy(ResponseHeadersReferrerPolicy.builder().referrerPolicy(HeadersReferrerPolicy.NO_REFERRER).override(true).build())
     * .strictTransportSecurity(ResponseHeadersStrictTransportSecurity.builder().accessControlMaxAge(Duration.seconds(600)).includeSubdomains(true).override(true).build())
     * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(true).reportUri("https://example.com/csp-report").override(true).build())
     * .build())
     * .removeHeaders(List.of("Server"))
     * .serverTimingSamplingRate(50)
     * .build();
     * Distribution.Builder.create(this, "myDistCustomPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(myResponseHeadersPolicy)
     * .build())
     * .build();
     * ```
     */
    public inline fun responseHeadersStrictTransportSecurity(
        block: ResponseHeadersStrictTransportSecurityDsl.() -> Unit = {}
    ): ResponseHeadersStrictTransportSecurity {
        val builder = ResponseHeadersStrictTransportSecurityDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines whether CloudFront includes the X-XSS-Protection HTTP response header and the
     * header’s value.
     *
     * Example:
     * ```
     * // Using an existing managed response headers policy
     * S3Origin bucketOrigin;
     * Distribution.Builder.create(this, "myDistManagedPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)
     * .build())
     * .build();
     * // Creating a custom response headers policy -- all parameters optional
     * ResponseHeadersPolicy myResponseHeadersPolicy = ResponseHeadersPolicy.Builder.create(this,
     * "ResponseHeadersPolicy")
     * .responseHeadersPolicyName("MyPolicy")
     * .comment("A default policy")
     * .corsBehavior(ResponseHeadersCorsBehavior.builder()
     * .accessControlAllowCredentials(false)
     * .accessControlAllowHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlAllowMethods(List.of("GET", "POST"))
     * .accessControlAllowOrigins(List.of("*"))
     * .accessControlExposeHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlMaxAge(Duration.seconds(600))
     * .originOverride(true)
     * .build())
     * .customHeadersBehavior(ResponseCustomHeadersBehavior.builder()
     * .customHeaders(List.of(ResponseCustomHeader.builder().header("X-Amz-Date").value("some-value").override(true).build(),
     * ResponseCustomHeader.builder().header("X-Amz-Security-Token").value("some-value").override(false).build()))
     * .build())
     * .securityHeadersBehavior(ResponseSecurityHeadersBehavior.builder()
     * .contentSecurityPolicy(ResponseHeadersContentSecurityPolicy.builder().contentSecurityPolicy("default-src
     * https:;").override(true).build())
     * .contentTypeOptions(ResponseHeadersContentTypeOptions.builder().override(true).build())
     * .frameOptions(ResponseHeadersFrameOptions.builder().frameOption(HeadersFrameOption.DENY).override(true).build())
     * .referrerPolicy(ResponseHeadersReferrerPolicy.builder().referrerPolicy(HeadersReferrerPolicy.NO_REFERRER).override(true).build())
     * .strictTransportSecurity(ResponseHeadersStrictTransportSecurity.builder().accessControlMaxAge(Duration.seconds(600)).includeSubdomains(true).override(true).build())
     * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(true).reportUri("https://example.com/csp-report").override(true).build())
     * .build())
     * .removeHeaders(List.of("Server"))
     * .serverTimingSamplingRate(50)
     * .build();
     * Distribution.Builder.create(this, "myDistCustomPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(myResponseHeadersPolicy)
     * .build())
     * .build();
     * ```
     */
    public inline fun responseHeadersXSSProtection(
        block: ResponseHeadersXSSProtectionDsl.() -> Unit = {}
    ): ResponseHeadersXSSProtection {
        val builder = ResponseHeadersXSSProtectionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for a set of security-related HTTP response headers.
     *
     * CloudFront adds these headers to HTTP responses that it sends for requests that match a cache
     * behavior associated with this response headers policy.
     *
     * Example:
     * ```
     * // Using an existing managed response headers policy
     * S3Origin bucketOrigin;
     * Distribution.Builder.create(this, "myDistManagedPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)
     * .build())
     * .build();
     * // Creating a custom response headers policy -- all parameters optional
     * ResponseHeadersPolicy myResponseHeadersPolicy = ResponseHeadersPolicy.Builder.create(this,
     * "ResponseHeadersPolicy")
     * .responseHeadersPolicyName("MyPolicy")
     * .comment("A default policy")
     * .corsBehavior(ResponseHeadersCorsBehavior.builder()
     * .accessControlAllowCredentials(false)
     * .accessControlAllowHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlAllowMethods(List.of("GET", "POST"))
     * .accessControlAllowOrigins(List.of("*"))
     * .accessControlExposeHeaders(List.of("X-Custom-Header-1", "X-Custom-Header-2"))
     * .accessControlMaxAge(Duration.seconds(600))
     * .originOverride(true)
     * .build())
     * .customHeadersBehavior(ResponseCustomHeadersBehavior.builder()
     * .customHeaders(List.of(ResponseCustomHeader.builder().header("X-Amz-Date").value("some-value").override(true).build(),
     * ResponseCustomHeader.builder().header("X-Amz-Security-Token").value("some-value").override(false).build()))
     * .build())
     * .securityHeadersBehavior(ResponseSecurityHeadersBehavior.builder()
     * .contentSecurityPolicy(ResponseHeadersContentSecurityPolicy.builder().contentSecurityPolicy("default-src
     * https:;").override(true).build())
     * .contentTypeOptions(ResponseHeadersContentTypeOptions.builder().override(true).build())
     * .frameOptions(ResponseHeadersFrameOptions.builder().frameOption(HeadersFrameOption.DENY).override(true).build())
     * .referrerPolicy(ResponseHeadersReferrerPolicy.builder().referrerPolicy(HeadersReferrerPolicy.NO_REFERRER).override(true).build())
     * .strictTransportSecurity(ResponseHeadersStrictTransportSecurity.builder().accessControlMaxAge(Duration.seconds(600)).includeSubdomains(true).override(true).build())
     * .xssProtection(ResponseHeadersXSSProtection.builder().protection(true).modeBlock(true).reportUri("https://example.com/csp-report").override(true).build())
     * .build())
     * .removeHeaders(List.of("Server"))
     * .serverTimingSamplingRate(50)
     * .build();
     * Distribution.Builder.create(this, "myDistCustomPolicy")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(bucketOrigin)
     * .responseHeadersPolicy(myResponseHeadersPolicy)
     * .build())
     * .build();
     * ```
     */
    public inline fun responseSecurityHeadersBehavior(
        block: ResponseSecurityHeadersBehaviorDsl.() -> Unit = {}
    ): ResponseSecurityHeadersBehavior {
        val builder = ResponseSecurityHeadersBehaviorDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * S3 origin configuration for CloudFront.
     *
     * Example:
     * ```
     * Bucket sourceBucket;
     * ViewerCertificate viewerCertificate =
     * ViewerCertificate.fromIamCertificate("MYIAMROLEIDENTIFIER", ViewerCertificateOptions.builder()
     * .aliases(List.of("MYALIAS"))
     * .build());
     * CloudFrontWebDistribution.Builder.create(this, "MyCfWebDistribution")
     * .originConfigs(List.of(SourceConfiguration.builder()
     * .s3OriginSource(S3OriginConfig.builder()
     * .s3BucketSource(sourceBucket)
     * .build())
     * .behaviors(List.of(Behavior.builder().isDefaultBehavior(true).build()))
     * .build()))
     * .viewerCertificate(viewerCertificate)
     * .build();
     * ```
     */
    public inline fun s3OriginConfig(block: S3OriginConfigDsl.() -> Unit = {}): S3OriginConfig {
        val builder = S3OriginConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A source configuration is a wrapper for CloudFront origins and behaviors.
     *
     * An origin is what CloudFront will "be in front of" - that is, CloudFront will pull it's
     * assets from an origin.
     *
     * If you're using s3 as a source - pass the `s3Origin` property, otherwise, pass the
     * `customOriginSource` property.
     *
     * One or the other must be passed, and it is invalid to pass both in the same
     * SourceConfiguration.
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
    public inline fun sourceConfiguration(
        block: SourceConfigurationDsl.() -> Unit = {}
    ): SourceConfiguration {
        val builder = SourceConfigurationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
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
    public inline fun viewerCertificateOptions(
        block: ViewerCertificateOptionsDsl.() -> Unit = {}
    ): ViewerCertificateOptions {
        val builder = ViewerCertificateOptionsDsl()
        builder.apply(block)
        return builder.build()
    }
}
