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

import io.cloudshiftdev.awscdkdsl.services.cloudwatch.MetricOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnCachePolicy
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.amazon.awscdk.services.cloudfront.CfnFunction
import software.amazon.awscdk.services.cloudfront.CfnKeyGroup
import software.amazon.awscdk.services.cloudfront.CfnKeyValueStore
import software.amazon.awscdk.services.cloudfront.CfnMonitoringSubscription
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy
import software.amazon.awscdk.services.cloudfront.CfnPublicKey
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution
import software.amazon.awscdk.services.cloudfront.Distribution
import software.amazon.awscdk.services.cloudfront.IOrigin
import software.amazon.awscdk.services.cloudfront.OriginBase
import software.amazon.awscdk.services.cloudfront.OriginBindConfig
import software.amazon.awscdk.services.cloudwatch.Metric
import software.constructs.Construct

/** The cache policy configuration. */
public inline fun CfnCachePolicy.setCachePolicyConfig(
    block: CfnCachePolicyCachePolicyConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCachePolicyCachePolicyConfigPropertyDsl()
    builder.apply(block)
    return setCachePolicyConfig(builder.build())
}

/** The current configuration information for the identity. */
public inline fun CfnCloudFrontOriginAccessIdentity.setCloudFrontOriginAccessIdentityConfig(
    block:
        CfnCloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfigPropertyDsl.(
        ) -> Unit =
        {}
) {
    val builder = CfnCloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfigPropertyDsl()
    builder.apply(block)
    return setCloudFrontOriginAccessIdentityConfig(builder.build())
}

/** Contains the configuration for a continuous deployment policy. */
public inline fun CfnContinuousDeploymentPolicy.setContinuousDeploymentPolicyConfig(
    block: CfnContinuousDeploymentPolicyContinuousDeploymentPolicyConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnContinuousDeploymentPolicyContinuousDeploymentPolicyConfigPropertyDsl()
    builder.apply(block)
    return setContinuousDeploymentPolicyConfig(builder.build())
}

/** The distribution's configuration. */
public inline fun CfnDistribution.setDistributionConfig(
    block: CfnDistributionDistributionConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDistributionDistributionConfigPropertyDsl()
    builder.apply(block)
    return setDistributionConfig(builder.build())
}

/** Contains configuration information about a CloudFront function. */
public inline fun CfnFunction.setFunctionConfig(
    block: CfnFunctionFunctionConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFunctionFunctionConfigPropertyDsl()
    builder.apply(block)
    return setFunctionConfig(builder.build())
}

/** Contains metadata about a CloudFront function. */
public inline fun CfnFunction.setFunctionMetadata(
    block: CfnFunctionFunctionMetadataPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFunctionFunctionMetadataPropertyDsl()
    builder.apply(block)
    return setFunctionMetadata(builder.build())
}

/** The key group configuration. */
public inline fun CfnKeyGroup.setKeyGroupConfig(
    block: CfnKeyGroupKeyGroupConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnKeyGroupKeyGroupConfigPropertyDsl()
    builder.apply(block)
    return setKeyGroupConfig(builder.build())
}

/** The import source for the key value store. */
public inline fun CfnKeyValueStore.setImportSource(
    block: CfnKeyValueStoreImportSourcePropertyDsl.() -> Unit = {}
) {
    val builder = CfnKeyValueStoreImportSourcePropertyDsl()
    builder.apply(block)
    return setImportSource(builder.build())
}

/** A subscription configuration for additional CloudWatch metrics. */
public inline fun CfnMonitoringSubscription.setMonitoringSubscription(
    block: CfnMonitoringSubscriptionMonitoringSubscriptionPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMonitoringSubscriptionMonitoringSubscriptionPropertyDsl()
    builder.apply(block)
    return setMonitoringSubscription(builder.build())
}

/** The origin access control. */
public inline fun CfnOriginAccessControl.setOriginAccessControlConfig(
    block: CfnOriginAccessControlOriginAccessControlConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnOriginAccessControlOriginAccessControlConfigPropertyDsl()
    builder.apply(block)
    return setOriginAccessControlConfig(builder.build())
}

/** The origin request policy configuration. */
public inline fun CfnOriginRequestPolicy.setOriginRequestPolicyConfig(
    block: CfnOriginRequestPolicyOriginRequestPolicyConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnOriginRequestPolicyOriginRequestPolicyConfigPropertyDsl()
    builder.apply(block)
    return setOriginRequestPolicyConfig(builder.build())
}

/**
 * Configuration information about a public key that you can use with
 * [signed URLs and signed cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
 * , or with
 * [field-level encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
 * .
 */
public inline fun CfnPublicKey.setPublicKeyConfig(
    block: CfnPublicKeyPublicKeyConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnPublicKeyPublicKeyConfigPropertyDsl()
    builder.apply(block)
    return setPublicKeyConfig(builder.build())
}

/** A response headers policy configuration. */
public inline fun CfnResponseHeadersPolicy.setResponseHeadersPolicyConfig(
    block: CfnResponseHeadersPolicyResponseHeadersPolicyConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnResponseHeadersPolicyResponseHeadersPolicyConfigPropertyDsl()
    builder.apply(block)
    return setResponseHeadersPolicyConfig(builder.build())
}

/** The current configuration information for the RTMP distribution. */
public inline fun CfnStreamingDistribution.setStreamingDistributionConfig(
    block: CfnStreamingDistributionStreamingDistributionConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnStreamingDistributionStreamingDistributionConfigPropertyDsl()
    builder.apply(block)
    return setStreamingDistributionConfig(builder.build())
}

/**
 * Adds a new behavior to this distribution for the given pathPattern.
 *
 * @param pathPattern the path pattern (e.g., 'images/ *') that specifies which requests to apply
 *   the behavior to.
 * @param origin the origin to use for this behavior.
 * @param behaviorOptions the options for the behavior at this path.
 */
public inline fun Distribution.addBehavior(
    pathPattern: String,
    origin: IOrigin,
    block: AddBehaviorOptionsDsl.() -> Unit = {},
) {
    val builder = AddBehaviorOptionsDsl()
    builder.apply(block)
    return addBehavior(pathPattern, origin, builder.build())
}

/**
 * Return the given named metric for this Distribution.
 *
 * @param metricName
 * @param props
 */
public inline fun Distribution.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * Metric for the percentage of all viewer requests for which the response's HTTP status code
 * is 401.
 *
 * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
 *
 * Default: - average over 5 minutes
 *
 * @param props
 */
public inline fun Distribution.metric401ErrorRate(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric401ErrorRate(builder.build())
}

/**
 * Metric for the percentage of all viewer requests for which the response's HTTP status code
 * is 403.
 *
 * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
 *
 * Default: - average over 5 minutes
 *
 * @param props
 */
public inline fun Distribution.metric403ErrorRate(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric403ErrorRate(builder.build())
}

/**
 * Metric for the percentage of all viewer requests for which the response's HTTP status code
 * is 404.
 *
 * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
 *
 * Default: - average over 5 minutes
 *
 * @param props
 */
public inline fun Distribution.metric404ErrorRate(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric404ErrorRate(builder.build())
}

/**
 * Metric for the percentage of all viewer requests for which the response's HTTP status code is
 * 4xx.
 *
 * Default: - average over 5 minutes
 *
 * @param props
 */
public inline fun Distribution.metric4xxErrorRate(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric4xxErrorRate(builder.build())
}

/**
 * Metric for the percentage of all viewer requests for which the response's HTTP status code
 * is 502.
 *
 * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
 *
 * Default: - average over 5 minutes
 *
 * @param props
 */
public inline fun Distribution.metric502ErrorRate(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric502ErrorRate(builder.build())
}

/**
 * Metric for the percentage of all viewer requests for which the response's HTTP status code
 * is 503.
 *
 * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
 *
 * Default: - average over 5 minutes
 *
 * @param props
 */
public inline fun Distribution.metric503ErrorRate(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric503ErrorRate(builder.build())
}

/**
 * Metric for the percentage of all viewer requests for which the response's HTTP status code
 * is 504.
 *
 * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
 *
 * Default: - average over 5 minutes
 *
 * @param props
 */
public inline fun Distribution.metric504ErrorRate(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric504ErrorRate(builder.build())
}

/**
 * Metric for the percentage of all viewer requests for which the response's HTTP status code is
 * 5xx.
 *
 * Default: - average over 5 minutes
 *
 * @param props
 */
public inline fun Distribution.metric5xxErrorRate(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric5xxErrorRate(builder.build())
}

/**
 * Metric for the total number of bytes downloaded by viewers for GET, HEAD, and OPTIONS requests.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun Distribution.metricBytesDownloaded(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricBytesDownloaded(builder.build())
}

/**
 * Metric for the total number of bytes that viewers uploaded to your origin with CloudFront, using
 * POST and PUT requests.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun Distribution.metricBytesUploaded(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricBytesUploaded(builder.build())
}

/**
 * Metric for the percentage of all cacheable requests for which CloudFront served the content from
 * its cache.
 *
 * HTTP POST and PUT requests, and errors, are not considered cacheable requests.
 *
 * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
 *
 * Default: - average over 5 minutes
 *
 * @param props
 */
public inline fun Distribution.metricCacheHitRate(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricCacheHitRate(builder.build())
}

/**
 * Metric for the total time spent from when CloudFront receives a request to when it starts
 * providing a response to the network (not the viewer), for requests that are served from the
 * origin, not the CloudFront cache.
 *
 * This is also known as first byte latency, or time-to-first-byte.
 *
 * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
 *
 * Default: - average over 5 minutes
 *
 * @param props
 */
public inline fun Distribution.metricOriginLatency(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricOriginLatency(builder.build())
}

/**
 * Metric for the total number of viewer requests received by CloudFront, for all HTTP methods and
 * for both HTTP and HTTPS requests.
 *
 * Default: - sum over 5 minutes
 *
 * @param props
 */
public inline fun Distribution.metricRequests(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricRequests(builder.build())
}

/**
 * Metric for the percentage of all viewer requests for which the response's HTTP status code is 4xx
 * or 5xx.
 *
 * Default: - average over 5 minutes
 *
 * @param props
 */
public inline fun Distribution.metricTotalErrorRate(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricTotalErrorRate(builder.build())
}

/**
 * The method called when a given Origin is added (for the first time) to a Distribution.
 *
 * @param scope
 * @param options
 */
public inline fun IOrigin.bind(
    arg0: Construct,
    block: OriginBindOptionsDsl.() -> Unit = {}
): OriginBindConfig {
    val builder = OriginBindOptionsDsl()
    builder.apply(block)
    return bind(arg0, builder.build())
}

/**
 * Binds the origin to the associated Distribution.
 *
 * Can be used to grant permissions, create dependent resources, etc.
 *
 * @param _scope
 * @param options
 */
public inline fun OriginBase.bind(
    _scope: Construct,
    block: OriginBindOptionsDsl.() -> Unit = {}
): OriginBindConfig {
    val builder = OriginBindOptionsDsl()
    builder.apply(block)
    return bind(_scope, builder.build())
}
