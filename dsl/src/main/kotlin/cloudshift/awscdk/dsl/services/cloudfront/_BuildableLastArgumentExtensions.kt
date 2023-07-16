@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
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
import software.amazon.awscdk.services.cloudfront.CfnRealtimeLogConfig
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution
import software.amazon.awscdk.services.cloudfront.Distribution
import software.amazon.awscdk.services.cloudfront.IOrigin

public inline fun CfnCachePolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnCachePolicy.setCachePolicyConfig(block: CfnCachePolicyCachePolicyConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCachePolicyCachePolicyConfigPropertyDsl()
  builder.apply(block)
  return setCachePolicyConfig(builder.build())
}

public inline fun CfnCloudFrontOriginAccessIdentity.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnCloudFrontOriginAccessIdentity.setCloudFrontOriginAccessIdentityConfig(block: CfnCloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfigPropertyDsl()
  builder.apply(block)
  return setCloudFrontOriginAccessIdentityConfig(builder.build())
}

public inline fun CfnContinuousDeploymentPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnContinuousDeploymentPolicy.setContinuousDeploymentPolicyConfig(block: CfnContinuousDeploymentPolicyContinuousDeploymentPolicyConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnContinuousDeploymentPolicyContinuousDeploymentPolicyConfigPropertyDsl()
  builder.apply(block)
  return setContinuousDeploymentPolicyConfig(builder.build())
}

public inline fun CfnDistribution.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDistribution.setDistributionConfig(block: CfnDistributionDistributionConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDistributionDistributionConfigPropertyDsl()
  builder.apply(block)
  return setDistributionConfig(builder.build())
}

public inline fun CfnFunction.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnFunction.setFunctionConfig(block: CfnFunctionFunctionConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnFunctionFunctionConfigPropertyDsl()
  builder.apply(block)
  return setFunctionConfig(builder.build())
}

public inline
    fun CfnFunction.setFunctionMetadata(block: CfnFunctionFunctionMetadataPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnFunctionFunctionMetadataPropertyDsl()
  builder.apply(block)
  return setFunctionMetadata(builder.build())
}

public inline fun CfnKeyGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnKeyGroup.setKeyGroupConfig(block: CfnKeyGroupKeyGroupConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnKeyGroupKeyGroupConfigPropertyDsl()
  builder.apply(block)
  return setKeyGroupConfig(builder.build())
}

public inline fun CfnMonitoringSubscription.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnMonitoringSubscription.setMonitoringSubscription(block: CfnMonitoringSubscriptionMonitoringSubscriptionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMonitoringSubscriptionMonitoringSubscriptionPropertyDsl()
  builder.apply(block)
  return setMonitoringSubscription(builder.build())
}

public inline fun CfnOriginAccessControl.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnOriginAccessControl.setOriginAccessControlConfig(block: CfnOriginAccessControlOriginAccessControlConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnOriginAccessControlOriginAccessControlConfigPropertyDsl()
  builder.apply(block)
  return setOriginAccessControlConfig(builder.build())
}

public inline fun CfnOriginRequestPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnOriginRequestPolicy.setOriginRequestPolicyConfig(block: CfnOriginRequestPolicyOriginRequestPolicyConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnOriginRequestPolicyOriginRequestPolicyConfigPropertyDsl()
  builder.apply(block)
  return setOriginRequestPolicyConfig(builder.build())
}

public inline fun CfnPublicKey.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnPublicKey.setPublicKeyConfig(block: CfnPublicKeyPublicKeyConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnPublicKeyPublicKeyConfigPropertyDsl()
  builder.apply(block)
  return setPublicKeyConfig(builder.build())
}

public inline fun CfnRealtimeLogConfig.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnResponseHeadersPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnResponseHeadersPolicy.setResponseHeadersPolicyConfig(block: CfnResponseHeadersPolicyResponseHeadersPolicyConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnResponseHeadersPolicyResponseHeadersPolicyConfigPropertyDsl()
  builder.apply(block)
  return setResponseHeadersPolicyConfig(builder.build())
}

public inline fun CfnStreamingDistribution.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnStreamingDistribution.setStreamingDistributionConfig(block: CfnStreamingDistributionStreamingDistributionConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStreamingDistributionStreamingDistributionConfigPropertyDsl()
  builder.apply(block)
  return setStreamingDistributionConfig(builder.build())
}

public inline fun Distribution.addBehavior(
  arg0: String,
  arg1: IOrigin,
  block: AddBehaviorOptionsDsl.() -> Unit = {},
) {
  val builder = AddBehaviorOptionsDsl()
  builder.apply(block)
  return addBehavior(arg0,arg1,builder.build())
}
