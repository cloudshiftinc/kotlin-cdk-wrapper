@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cloudfront

import software.amazon.awscdk.services.cloudfront.CfnCachePolicy
import software.amazon.awscdk.services.cloudfront.CfnCloudFrontOriginAccessIdentity
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy
import software.amazon.awscdk.services.cloudfront.CfnDistribution
import software.amazon.awscdk.services.cloudfront.CfnFunction
import software.amazon.awscdk.services.cloudfront.CfnKeyGroup
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
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public inline fun CfnOriginRequestPolicy.setOriginRequestPolicyConfig(
    block: CfnOriginRequestPolicyOriginRequestPolicyConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnOriginRequestPolicyOriginRequestPolicyConfigPropertyDsl()
    builder.apply(block)
    return setOriginRequestPolicyConfig(builder.build())
}

public inline fun CfnMonitoringSubscription.setMonitoringSubscription(
    block: CfnMonitoringSubscriptionMonitoringSubscriptionPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnMonitoringSubscriptionMonitoringSubscriptionPropertyDsl()
    builder.apply(block)
    return setMonitoringSubscription(builder.build())
}

public inline fun CfnContinuousDeploymentPolicy.setContinuousDeploymentPolicyConfig(
    block: CfnContinuousDeploymentPolicyContinuousDeploymentPolicyConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnContinuousDeploymentPolicyContinuousDeploymentPolicyConfigPropertyDsl()
    builder.apply(block)
    return setContinuousDeploymentPolicyConfig(builder.build())
}

public inline fun IOrigin.bind(arg0: Construct, block: OriginBindOptionsDsl.() -> Unit = {}): OriginBindConfig {
    val builder = OriginBindOptionsDsl()
    builder.apply(block)
    return bind(arg0, builder.build())
}

public inline fun CfnOriginAccessControl.setOriginAccessControlConfig(
    block: CfnOriginAccessControlOriginAccessControlConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnOriginAccessControlOriginAccessControlConfigPropertyDsl()
    builder.apply(block)
    return setOriginAccessControlConfig(builder.build())
}

public inline fun Distribution.addBehavior(
    pathPattern: String,
    origin: IOrigin,
    block: AddBehaviorOptionsDsl.() -> Unit = {},
) {
    val builder = AddBehaviorOptionsDsl()
    builder.apply(block)
    return addBehavior(pathPattern, origin, builder.build())
}

public inline fun CfnPublicKey.setPublicKeyConfig(
    block: CfnPublicKeyPublicKeyConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnPublicKeyPublicKeyConfigPropertyDsl()
    builder.apply(block)
    return setPublicKeyConfig(builder.build())
}

public inline fun CfnStreamingDistribution.setStreamingDistributionConfig(
    block: CfnStreamingDistributionStreamingDistributionConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnStreamingDistributionStreamingDistributionConfigPropertyDsl()
    builder.apply(block)
    return setStreamingDistributionConfig(builder.build())
}

public inline fun CfnCachePolicy.setCachePolicyConfig(
    block: CfnCachePolicyCachePolicyConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnCachePolicyCachePolicyConfigPropertyDsl()
    builder.apply(block)
    return setCachePolicyConfig(builder.build())
}

public inline fun CfnKeyGroup.setKeyGroupConfig(block: CfnKeyGroupKeyGroupConfigPropertyDsl.() -> Unit = {}) {
    val builder = CfnKeyGroupKeyGroupConfigPropertyDsl()
    builder.apply(block)
    return setKeyGroupConfig(builder.build())
}

public inline fun CfnFunction.setFunctionConfig(block: CfnFunctionFunctionConfigPropertyDsl.() -> Unit = {}) {
    val builder = CfnFunctionFunctionConfigPropertyDsl()
    builder.apply(block)
    return setFunctionConfig(builder.build())
}

public inline fun CfnFunction.setFunctionMetadata(
    block: CfnFunctionFunctionMetadataPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnFunctionFunctionMetadataPropertyDsl()
    builder.apply(block)
    return setFunctionMetadata(builder.build())
}

public inline fun CfnDistribution.setDistributionConfig(
    block: CfnDistributionDistributionConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnDistributionDistributionConfigPropertyDsl()
    builder.apply(block)
    return setDistributionConfig(builder.build())
}

public inline fun CfnResponseHeadersPolicy.setResponseHeadersPolicyConfig(
    block: CfnResponseHeadersPolicyResponseHeadersPolicyConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnResponseHeadersPolicyResponseHeadersPolicyConfigPropertyDsl()
    builder.apply(block)
    return setResponseHeadersPolicyConfig(builder.build())
}

public inline fun CfnCloudFrontOriginAccessIdentity.setCloudFrontOriginAccessIdentityConfig(
    block: CfnCloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnCloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfigPropertyDsl()
    builder.apply(block)
    return setCloudFrontOriginAccessIdentityConfig(builder.build())
}

public inline fun OriginBase.bind(_scope: Construct, block: OriginBindOptionsDsl.() -> Unit = {}): OriginBindConfig {
    val builder = OriginBindOptionsDsl()
    builder.apply(block)
    return bind(_scope, builder.build())
}
