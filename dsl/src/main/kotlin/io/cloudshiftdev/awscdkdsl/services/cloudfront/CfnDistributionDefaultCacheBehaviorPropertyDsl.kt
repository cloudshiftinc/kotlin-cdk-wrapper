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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * A complex type that describes the default cache behavior if you don't specify a `CacheBehavior`
 * element or if request URLs don't match any of the values of `PathPattern` in `CacheBehavior`
 * elements.
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
@CdkDslMarker
public class CfnDistributionDefaultCacheBehaviorPropertyDsl {
    private val cdkBuilder: CfnDistribution.DefaultCacheBehaviorProperty.Builder =
        CfnDistribution.DefaultCacheBehaviorProperty.builder()

    private val _allowedMethods: MutableList<String> = mutableListOf()

    private val _cachedMethods: MutableList<String> = mutableListOf()

    private val _functionAssociations: MutableList<Any> = mutableListOf()

    private val _lambdaFunctionAssociations: MutableList<Any> = mutableListOf()

    private val _trustedKeyGroups: MutableList<String> = mutableListOf()

    private val _trustedSigners: MutableList<String> = mutableListOf()

    /**
     * @param allowedMethods A complex type that controls which HTTP methods CloudFront processes
     *   and forwards to your Amazon S3 bucket or your custom origin. There are three choices:
     * * CloudFront forwards only `GET` and `HEAD` requests.
     * * CloudFront forwards only `GET` , `HEAD` , and `OPTIONS` requests.
     * * CloudFront forwards `GET, HEAD, OPTIONS, PUT, PATCH, POST` , and `DELETE` requests.
     *
     * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or to
     * your custom origin so users can't perform operations that you don't want them to. For
     * example, you might not want users to have permissions to delete objects from your origin.
     */
    public fun allowedMethods(vararg allowedMethods: String) {
        _allowedMethods.addAll(listOf(*allowedMethods))
    }

    /**
     * @param allowedMethods A complex type that controls which HTTP methods CloudFront processes
     *   and forwards to your Amazon S3 bucket or your custom origin. There are three choices:
     * * CloudFront forwards only `GET` and `HEAD` requests.
     * * CloudFront forwards only `GET` , `HEAD` , and `OPTIONS` requests.
     * * CloudFront forwards `GET, HEAD, OPTIONS, PUT, PATCH, POST` , and `DELETE` requests.
     *
     * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or to
     * your custom origin so users can't perform operations that you don't want them to. For
     * example, you might not want users to have permissions to delete objects from your origin.
     */
    public fun allowedMethods(allowedMethods: Collection<String>) {
        _allowedMethods.addAll(allowedMethods)
    }

    /**
     * @param cachePolicyId The unique identifier of the cache policy that is attached to the
     *   default cache behavior. For more information, see
     *   [Creating cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     *   or
     *   [Using the managed cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     *   in the *Amazon CloudFront Developer Guide* .
     *
     * A `DefaultCacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We
     * recommend that you use a `CachePolicyId` .
     */
    public fun cachePolicyId(cachePolicyId: String) {
        cdkBuilder.cachePolicyId(cachePolicyId)
    }

    /**
     * @param cachedMethods A complex type that controls whether CloudFront caches the response to
     *   requests using the specified HTTP methods. There are two choices:
     * * CloudFront caches responses to `GET` and `HEAD` requests.
     * * CloudFront caches responses to `GET` , `HEAD` , and `OPTIONS` requests.
     *
     * If you pick the second choice for your Amazon S3 Origin, you may need to forward
     * Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the
     * responses to be cached correctly.
     */
    public fun cachedMethods(vararg cachedMethods: String) {
        _cachedMethods.addAll(listOf(*cachedMethods))
    }

    /**
     * @param cachedMethods A complex type that controls whether CloudFront caches the response to
     *   requests using the specified HTTP methods. There are two choices:
     * * CloudFront caches responses to `GET` and `HEAD` requests.
     * * CloudFront caches responses to `GET` , `HEAD` , and `OPTIONS` requests.
     *
     * If you pick the second choice for your Amazon S3 Origin, you may need to forward
     * Access-Control-Request-Method, Access-Control-Request-Headers, and Origin headers for the
     * responses to be cached correctly.
     */
    public fun cachedMethods(cachedMethods: Collection<String>) {
        _cachedMethods.addAll(cachedMethods)
    }

    /**
     * @param compress Whether you want CloudFront to automatically compress certain files for this
     *   cache behavior. If so, specify `true` ; if not, specify `false` . For more information, see
     *   [Serving Compressed Files](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun compress(compress: Boolean) {
        cdkBuilder.compress(compress)
    }

    /**
     * @param compress Whether you want CloudFront to automatically compress certain files for this
     *   cache behavior. If so, specify `true` ; if not, specify `false` . For more information, see
     *   [Serving Compressed Files](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/ServingCompressedFiles.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun compress(compress: IResolvable) {
        cdkBuilder.compress(compress)
    }

    /**
     * @param defaultTtl This field is deprecated. We recommend that you use the `DefaultTTL` field
     *   in a cache policy instead of this field. For more information, see
     *   [Creating cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     *   or
     *   [Using the managed cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     *   in the *Amazon CloudFront Developer Guide* .
     *
     * The default amount of time that you want objects to stay in CloudFront caches before
     * CloudFront forwards another request to your origin to determine whether the object has been
     * updated. The value that you specify applies only when your origin does not add HTTP headers
     * such as `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For
     * more information, see
     * [Managing How Long Content Stays in an Edge Cache (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     * in the *Amazon CloudFront Developer Guide* .
     */
    public fun defaultTtl(defaultTtl: Number) {
        cdkBuilder.defaultTtl(defaultTtl)
    }

    /**
     * @param fieldLevelEncryptionId The value of `ID` for the field-level encryption configuration
     *   that you want CloudFront to use for encrypting specific fields of data for the default
     *   cache behavior.
     */
    public fun fieldLevelEncryptionId(fieldLevelEncryptionId: String) {
        cdkBuilder.fieldLevelEncryptionId(fieldLevelEncryptionId)
    }

    /**
     * @param forwardedValues This field is deprecated. We recommend that you use a cache policy or
     *   an origin request policy instead of this field. For more information, see
     *   [Working with policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
     *   in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to include values in the cache key, use a cache policy. For more information, see
     * [Creating cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * or
     * [Using the managed cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to send values to the origin but not include them in the cache key, use an origin
     * request policy. For more information, see
     * [Creating origin request policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * or
     * [Using the managed origin request policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * A `DefaultCacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We
     * recommend that you use a `CachePolicyId` .
     *
     * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
     * headers.
     */
    public fun forwardedValues(forwardedValues: IResolvable) {
        cdkBuilder.forwardedValues(forwardedValues)
    }

    /**
     * @param forwardedValues This field is deprecated. We recommend that you use a cache policy or
     *   an origin request policy instead of this field. For more information, see
     *   [Working with policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/working-with-policies.html)
     *   in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to include values in the cache key, use a cache policy. For more information, see
     * [Creating cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     * or
     * [Using the managed cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * If you want to send values to the origin but not include them in the cache key, use an origin
     * request policy. For more information, see
     * [Creating origin request policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     * or
     * [Using the managed origin request policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * A `DefaultCacheBehavior` must include either a `CachePolicyId` or `ForwardedValues` . We
     * recommend that you use a `CachePolicyId` .
     *
     * A complex type that specifies how CloudFront handles query strings, cookies, and HTTP
     * headers.
     */
    public fun forwardedValues(forwardedValues: CfnDistribution.ForwardedValuesProperty) {
        cdkBuilder.forwardedValues(forwardedValues)
    }

    /**
     * @param functionAssociations A list of CloudFront functions that are associated with this
     *   cache behavior. CloudFront functions must be published to the `LIVE` stage to associate
     *   them with a cache behavior.
     */
    public fun functionAssociations(vararg functionAssociations: Any) {
        _functionAssociations.addAll(listOf(*functionAssociations))
    }

    /**
     * @param functionAssociations A list of CloudFront functions that are associated with this
     *   cache behavior. CloudFront functions must be published to the `LIVE` stage to associate
     *   them with a cache behavior.
     */
    public fun functionAssociations(functionAssociations: Collection<Any>) {
        _functionAssociations.addAll(functionAssociations)
    }

    /**
     * @param functionAssociations A list of CloudFront functions that are associated with this
     *   cache behavior. CloudFront functions must be published to the `LIVE` stage to associate
     *   them with a cache behavior.
     */
    public fun functionAssociations(functionAssociations: IResolvable) {
        cdkBuilder.functionAssociations(functionAssociations)
    }

    /**
     * @param lambdaFunctionAssociations A complex type that contains zero or more Lambda&#64;Edge
     *   function associations for a cache behavior.
     */
    public fun lambdaFunctionAssociations(vararg lambdaFunctionAssociations: Any) {
        _lambdaFunctionAssociations.addAll(listOf(*lambdaFunctionAssociations))
    }

    /**
     * @param lambdaFunctionAssociations A complex type that contains zero or more Lambda&#64;Edge
     *   function associations for a cache behavior.
     */
    public fun lambdaFunctionAssociations(lambdaFunctionAssociations: Collection<Any>) {
        _lambdaFunctionAssociations.addAll(lambdaFunctionAssociations)
    }

    /**
     * @param lambdaFunctionAssociations A complex type that contains zero or more Lambda&#64;Edge
     *   function associations for a cache behavior.
     */
    public fun lambdaFunctionAssociations(lambdaFunctionAssociations: IResolvable) {
        cdkBuilder.lambdaFunctionAssociations(lambdaFunctionAssociations)
    }

    /**
     * @param maxTtl This field is deprecated. We recommend that you use the `MaxTTL` field in a
     *   cache policy instead of this field. For more information, see
     *   [Creating cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     *   or
     *   [Using the managed cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     *   in the *Amazon CloudFront Developer Guide* .
     *
     * The maximum amount of time that you want objects to stay in CloudFront caches before
     * CloudFront forwards another request to your origin to determine whether the object has been
     * updated. The value that you specify applies only when your origin adds HTTP headers such as
     * `Cache-Control max-age` , `Cache-Control s-maxage` , and `Expires` to objects. For more
     * information, see
     * [Managing How Long Content Stays in an Edge Cache (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     * in the *Amazon CloudFront Developer Guide* .
     */
    public fun maxTtl(maxTtl: Number) {
        cdkBuilder.maxTtl(maxTtl)
    }

    /**
     * @param minTtl This field is deprecated. We recommend that you use the `MinTTL` field in a
     *   cache policy instead of this field. For more information, see
     *   [Creating cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-the-cache-key.html#cache-key-create-cache-policy)
     *   or
     *   [Using the managed cache policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-cache-policies.html)
     *   in the *Amazon CloudFront Developer Guide* .
     *
     * The minimum amount of time that you want objects to stay in CloudFront caches before
     * CloudFront forwards another request to your origin to determine whether the object has been
     * updated. For more information, see
     * [Managing How Long Content Stays in an Edge Cache (Expiration)](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * You must specify `0` for `MinTTL` if you configure CloudFront to forward all headers to your
     * origin (under `Headers` , if you specify `1` for `Quantity` and `*` for `Name` ).
     */
    public fun minTtl(minTtl: Number) {
        cdkBuilder.minTtl(minTtl)
    }

    /**
     * @param originRequestPolicyId The unique identifier of the origin request policy that is
     *   attached to the default cache behavior. For more information, see
     *   [Creating origin request policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/controlling-origin-requests.html#origin-request-create-origin-request-policy)
     *   or
     *   [Using the managed origin request policies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-managed-origin-request-policies.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun originRequestPolicyId(originRequestPolicyId: String) {
        cdkBuilder.originRequestPolicyId(originRequestPolicyId)
    }

    /**
     * @param realtimeLogConfigArn The Amazon Resource Name (ARN) of the real-time log configuration
     *   that is attached to this cache behavior. For more information, see
     *   [Real-time logs](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/real-time-logs.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun realtimeLogConfigArn(realtimeLogConfigArn: String) {
        cdkBuilder.realtimeLogConfigArn(realtimeLogConfigArn)
    }

    /** @param responseHeadersPolicyId The identifier for a response headers policy. */
    public fun responseHeadersPolicyId(responseHeadersPolicyId: String) {
        cdkBuilder.responseHeadersPolicyId(responseHeadersPolicyId)
    }

    /**
     * @param smoothStreaming Indicates whether you want to distribute media files in the Microsoft
     *   Smooth Streaming format using the origin that is associated with this cache behavior. If
     *   so, specify `true` ; if not, specify `false` . If you specify `true` for `SmoothStreaming`
     *   , you can still distribute other content using this cache behavior if the content matches
     *   the value of `PathPattern` .
     */
    public fun smoothStreaming(smoothStreaming: Boolean) {
        cdkBuilder.smoothStreaming(smoothStreaming)
    }

    /**
     * @param smoothStreaming Indicates whether you want to distribute media files in the Microsoft
     *   Smooth Streaming format using the origin that is associated with this cache behavior. If
     *   so, specify `true` ; if not, specify `false` . If you specify `true` for `SmoothStreaming`
     *   , you can still distribute other content using this cache behavior if the content matches
     *   the value of `PathPattern` .
     */
    public fun smoothStreaming(smoothStreaming: IResolvable) {
        cdkBuilder.smoothStreaming(smoothStreaming)
    }

    /**
     * @param targetOriginId The value of `ID` for the origin that you want CloudFront to route
     *   requests to when they use the default cache behavior.
     */
    public fun targetOriginId(targetOriginId: String) {
        cdkBuilder.targetOriginId(targetOriginId)
    }

    /**
     * @param trustedKeyGroups A list of key groups that CloudFront can use to validate signed URLs
     *   or signed cookies. When a cache behavior contains trusted key groups, CloudFront requires
     *   signed URLs or signed cookies for all requests that match the cache behavior. The URLs or
     *   cookies must be signed with a private key whose corresponding public key is in the key
     *   group. The signed URL or cookie contains information about which public key CloudFront
     *   should use to verify the signature. For more information, see
     *   [Serving private content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun trustedKeyGroups(vararg trustedKeyGroups: String) {
        _trustedKeyGroups.addAll(listOf(*trustedKeyGroups))
    }

    /**
     * @param trustedKeyGroups A list of key groups that CloudFront can use to validate signed URLs
     *   or signed cookies. When a cache behavior contains trusted key groups, CloudFront requires
     *   signed URLs or signed cookies for all requests that match the cache behavior. The URLs or
     *   cookies must be signed with a private key whose corresponding public key is in the key
     *   group. The signed URL or cookie contains information about which public key CloudFront
     *   should use to verify the signature. For more information, see
     *   [Serving private content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun trustedKeyGroups(trustedKeyGroups: Collection<String>) {
        _trustedKeyGroups.addAll(trustedKeyGroups)
    }

    /**
     * @param trustedSigners We recommend using `TrustedKeyGroups` instead of `TrustedSigners` . A
     *   list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or
     *   signed cookies.
     *
     * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed
     * cookies for all requests that match the cache behavior. The URLs or cookies must be signed
     * with the private key of a CloudFront key pair in a trusted signer's AWS account . The signed
     * URL or cookie contains information about which public key CloudFront should use to verify the
     * signature. For more information, see
     * [Serving private content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * in the *Amazon CloudFront Developer Guide* .
     */
    public fun trustedSigners(vararg trustedSigners: String) {
        _trustedSigners.addAll(listOf(*trustedSigners))
    }

    /**
     * @param trustedSigners We recommend using `TrustedKeyGroups` instead of `TrustedSigners` . A
     *   list of AWS account IDs whose public keys CloudFront can use to validate signed URLs or
     *   signed cookies.
     *
     * When a cache behavior contains trusted signers, CloudFront requires signed URLs or signed
     * cookies for all requests that match the cache behavior. The URLs or cookies must be signed
     * with the private key of a CloudFront key pair in a trusted signer's AWS account . The signed
     * URL or cookie contains information about which public key CloudFront should use to verify the
     * signature. For more information, see
     * [Serving private content](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     * in the *Amazon CloudFront Developer Guide* .
     */
    public fun trustedSigners(trustedSigners: Collection<String>) {
        _trustedSigners.addAll(trustedSigners)
    }

    /**
     * @param viewerProtocolPolicy The protocol that viewers can use to access the files in the
     *   origin specified by `TargetOriginId` when a request matches the path pattern in
     *   `PathPattern` . You can specify the following options:
     * * `allow-all` : Viewers can use HTTP or HTTPS.
     * * `redirect-to-https` : If a viewer submits an HTTP request, CloudFront returns an HTTP
     *   status code of 301 (Moved Permanently) to the viewer along with the HTTPS URL. The viewer
     *   then resubmits the request using the new URL.
     * * `https-only` : If a viewer sends an HTTP request, CloudFront returns an HTTP status code of
     *   403 (Forbidden).
     *
     * For more information about requiring the HTTPS protocol, see
     * [Requiring HTTPS Between Viewers and CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/using-https-viewers-to-cloudfront.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * The only way to guarantee that viewers retrieve an object that was fetched from the origin
     * using HTTPS is never to use any other protocol to fetch the object. If you have recently
     * changed from HTTP to HTTPS, we recommend that you clear your objects' cache because cached
     * objects are protocol agnostic. That means that an edge location will return an object from
     * the cache regardless of whether the current request protocol matches the protocol used
     * previously. For more information, see
     * [Managing Cache Expiration](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/Expiration.html)
     * in the *Amazon CloudFront Developer Guide* .
     */
    public fun viewerProtocolPolicy(viewerProtocolPolicy: String) {
        cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy)
    }

    public fun build(): CfnDistribution.DefaultCacheBehaviorProperty {
        if (_allowedMethods.isNotEmpty()) cdkBuilder.allowedMethods(_allowedMethods)
        if (_cachedMethods.isNotEmpty()) cdkBuilder.cachedMethods(_cachedMethods)
        if (_functionAssociations.isNotEmpty())
            cdkBuilder.functionAssociations(_functionAssociations)
        if (_lambdaFunctionAssociations.isNotEmpty())
            cdkBuilder.lambdaFunctionAssociations(_lambdaFunctionAssociations)
        if (_trustedKeyGroups.isNotEmpty()) cdkBuilder.trustedKeyGroups(_trustedKeyGroups)
        if (_trustedSigners.isNotEmpty()) cdkBuilder.trustedSigners(_trustedSigners)
        return cdkBuilder.build()
    }
}
