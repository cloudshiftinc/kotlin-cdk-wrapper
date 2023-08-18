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
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.Behavior
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.amazon.awscdk.services.cloudfront.CloudFrontAllowedCachedMethods
import software.amazon.awscdk.services.cloudfront.CloudFrontAllowedMethods
import software.amazon.awscdk.services.cloudfront.FunctionAssociation
import software.amazon.awscdk.services.cloudfront.IKeyGroup
import software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation
import software.amazon.awscdk.services.cloudfront.ViewerProtocolPolicy

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
@CdkDslMarker
public class BehaviorDsl {
    private val cdkBuilder: Behavior.Builder = Behavior.builder()

    private val _functionAssociations: MutableList<FunctionAssociation> = mutableListOf()

    private val _lambdaFunctionAssociations: MutableList<LambdaFunctionAssociation> =
        mutableListOf()

    private val _trustedKeyGroups: MutableList<IKeyGroup> = mutableListOf()

    private val _trustedSigners: MutableList<String> = mutableListOf()

    /** @param allowedMethods The method this CloudFront distribution responds do. */
    public fun allowedMethods(allowedMethods: CloudFrontAllowedMethods) {
        cdkBuilder.allowedMethods(allowedMethods)
    }

    /** @param cachedMethods Which methods are cached by CloudFront by default. */
    public fun cachedMethods(cachedMethods: CloudFrontAllowedCachedMethods) {
        cdkBuilder.cachedMethods(cachedMethods)
    }

    /** @param compress If CloudFront should automatically compress some content types. */
    public fun compress(compress: Boolean) {
        cdkBuilder.compress(compress)
    }

    /**
     * @param defaultTtl The default amount of time CloudFront will cache an object. This value
     *   applies only when your custom origin does not add HTTP headers, such as Cache-Control
     *   max-age, Cache-Control s-maxage, and Expires to objects.
     */
    public fun defaultTtl(defaultTtl: Duration) {
        cdkBuilder.defaultTtl(defaultTtl)
    }

    /**
     * @param forwardedValues The values CloudFront will forward to the origin when making a
     *   request.
     */
    public fun forwardedValues(
        forwardedValues: CfnDistributionForwardedValuesPropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnDistributionForwardedValuesPropertyDsl()
        builder.apply(forwardedValues)
        cdkBuilder.forwardedValues(builder.build())
    }

    /**
     * @param forwardedValues The values CloudFront will forward to the origin when making a
     *   request.
     */
    public fun forwardedValues(forwardedValues: CfnDistribution.ForwardedValuesProperty) {
        cdkBuilder.forwardedValues(forwardedValues)
    }

    /**
     * @param functionAssociations The CloudFront functions to invoke before serving the contents.
     */
    public fun functionAssociations(functionAssociations: FunctionAssociationDsl.() -> Unit) {
        _functionAssociations.add(FunctionAssociationDsl().apply(functionAssociations).build())
    }

    /**
     * @param functionAssociations The CloudFront functions to invoke before serving the contents.
     */
    public fun functionAssociations(functionAssociations: Collection<FunctionAssociation>) {
        _functionAssociations.addAll(functionAssociations)
    }

    /**
     * @param isDefaultBehavior If this behavior is the default behavior for the distribution. You
     *   must specify exactly one default distribution per CloudFront distribution. The default
     *   behavior is allowed to omit the "path" property.
     */
    public fun isDefaultBehavior(isDefaultBehavior: Boolean) {
        cdkBuilder.isDefaultBehavior(isDefaultBehavior)
    }

    /**
     * @param lambdaFunctionAssociations Declares associated lambda&#64;edge functions for this
     *   distribution behaviour.
     */
    public fun lambdaFunctionAssociations(
        lambdaFunctionAssociations: LambdaFunctionAssociationDsl.() -> Unit
    ) {
        _lambdaFunctionAssociations.add(
            LambdaFunctionAssociationDsl().apply(lambdaFunctionAssociations).build()
        )
    }

    /**
     * @param lambdaFunctionAssociations Declares associated lambda&#64;edge functions for this
     *   distribution behaviour.
     */
    public fun lambdaFunctionAssociations(
        lambdaFunctionAssociations: Collection<LambdaFunctionAssociation>
    ) {
        _lambdaFunctionAssociations.addAll(lambdaFunctionAssociations)
    }

    /**
     * @param maxTtl The max amount of time you want objects to stay in the cache before CloudFront
     *   queries your origin.
     */
    public fun maxTtl(maxTtl: Duration) {
        cdkBuilder.maxTtl(maxTtl)
    }

    /**
     * @param minTtl The minimum amount of time that you want objects to stay in the cache before
     *   CloudFront queries your origin.
     */
    public fun minTtl(minTtl: Duration) {
        cdkBuilder.minTtl(minTtl)
    }

    /**
     * @param pathPattern The path this behavior responds to. Required for all non-default
     *   behaviors. (The default behavior implicitly has "*" as the path pattern. )
     */
    public fun pathPattern(pathPattern: String) {
        cdkBuilder.pathPattern(pathPattern)
    }

    /**
     * @param trustedKeyGroups A list of Key Groups that CloudFront can use to validate signed URLs
     *   or signed cookies.
     */
    public fun trustedKeyGroups(vararg trustedKeyGroups: IKeyGroup) {
        _trustedKeyGroups.addAll(listOf(*trustedKeyGroups))
    }

    /**
     * @param trustedKeyGroups A list of Key Groups that CloudFront can use to validate signed URLs
     *   or signed cookies.
     */
    public fun trustedKeyGroups(trustedKeyGroups: Collection<IKeyGroup>) {
        _trustedKeyGroups.addAll(trustedKeyGroups)
    }

    /**
     * @param trustedSigners Trusted signers is how CloudFront allows you to serve private content.
     *   The signers are the account IDs that are allowed to sign cookies/presigned URLs for this
     *   distribution.
     *
     * If you pass a non empty value, all requests for this behavior must be signed (no public
     * access will be allowed)
     *
     * @deprecated - We recommend using trustedKeyGroups instead of trustedSigners.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun trustedSigners(vararg trustedSigners: String) {
        _trustedSigners.addAll(listOf(*trustedSigners))
    }

    /**
     * @param trustedSigners Trusted signers is how CloudFront allows you to serve private content.
     *   The signers are the account IDs that are allowed to sign cookies/presigned URLs for this
     *   distribution.
     *
     * If you pass a non empty value, all requests for this behavior must be signed (no public
     * access will be allowed)
     *
     * @deprecated - We recommend using trustedKeyGroups instead of trustedSigners.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun trustedSigners(trustedSigners: Collection<String>) {
        _trustedSigners.addAll(trustedSigners)
    }

    /** @param viewerProtocolPolicy The viewer policy for this behavior. */
    public fun viewerProtocolPolicy(viewerProtocolPolicy: ViewerProtocolPolicy) {
        cdkBuilder.viewerProtocolPolicy(viewerProtocolPolicy)
    }

    public fun build(): Behavior {
        if (_functionAssociations.isNotEmpty())
            cdkBuilder.functionAssociations(_functionAssociations)
        if (_lambdaFunctionAssociations.isNotEmpty())
            cdkBuilder.lambdaFunctionAssociations(_lambdaFunctionAssociations)
        if (_trustedKeyGroups.isNotEmpty()) cdkBuilder.trustedKeyGroups(_trustedKeyGroups)
        if (_trustedSigners.isNotEmpty()) cdkBuilder.trustedSigners(_trustedSigners)
        return cdkBuilder.build()
    }
}
