@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

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
  public inline fun addBehaviorOptions(block: AddBehaviorOptionsDsl.() -> Unit = {}):
      AddBehaviorOptions {
    val builder = AddBehaviorOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun behavior(block: BehaviorDsl.() -> Unit = {}): Behavior {
    val builder = BehaviorDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun behaviorOptions(block: BehaviorOptionsDsl.() -> Unit = {}): BehaviorOptions {
    val builder = BehaviorOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cachePolicy(
    scope: Construct,
    id: String,
    block: CachePolicyDsl.() -> Unit = {},
  ): CachePolicy {
    val builder = CachePolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cachePolicyProps(block: CachePolicyPropsDsl.() -> Unit = {}): CachePolicyProps {
    val builder = CachePolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCachePolicy(
    scope: Construct,
    id: String,
    block: CfnCachePolicyDsl.() -> Unit = {},
  ): CfnCachePolicy {
    val builder = CfnCachePolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCachePolicyCachePolicyConfigProperty(block: CfnCachePolicyCachePolicyConfigPropertyDsl.() -> Unit
      = {}): CfnCachePolicy.CachePolicyConfigProperty {
    val builder = CfnCachePolicyCachePolicyConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCachePolicyCookiesConfigProperty(block: CfnCachePolicyCookiesConfigPropertyDsl.() -> Unit
      = {}): CfnCachePolicy.CookiesConfigProperty {
    val builder = CfnCachePolicyCookiesConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCachePolicyHeadersConfigProperty(block: CfnCachePolicyHeadersConfigPropertyDsl.() -> Unit
      = {}): CfnCachePolicy.HeadersConfigProperty {
    val builder = CfnCachePolicyHeadersConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCachePolicyParametersInCacheKeyAndForwardedToOriginProperty(block: CfnCachePolicyParametersInCacheKeyAndForwardedToOriginPropertyDsl.() -> Unit
      = {}): CfnCachePolicy.ParametersInCacheKeyAndForwardedToOriginProperty {
    val builder = CfnCachePolicyParametersInCacheKeyAndForwardedToOriginPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCachePolicyProps(block: CfnCachePolicyPropsDsl.() -> Unit = {}):
      CfnCachePolicyProps {
    val builder = CfnCachePolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCachePolicyQueryStringsConfigProperty(block: CfnCachePolicyQueryStringsConfigPropertyDsl.() -> Unit
      = {}): CfnCachePolicy.QueryStringsConfigProperty {
    val builder = CfnCachePolicyQueryStringsConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCloudFrontOriginAccessIdentity(
    scope: Construct,
    id: String,
    block: CfnCloudFrontOriginAccessIdentityDsl.() -> Unit = {},
  ): CfnCloudFrontOriginAccessIdentity {
    val builder = CfnCloudFrontOriginAccessIdentityDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfigProperty(block: CfnCloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfigPropertyDsl.() -> Unit
      = {}): CfnCloudFrontOriginAccessIdentity.CloudFrontOriginAccessIdentityConfigProperty {
    val builder = CfnCloudFrontOriginAccessIdentityCloudFrontOriginAccessIdentityConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnCloudFrontOriginAccessIdentityProps(block: CfnCloudFrontOriginAccessIdentityPropsDsl.() -> Unit
      = {}): CfnCloudFrontOriginAccessIdentityProps {
    val builder = CfnCloudFrontOriginAccessIdentityPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnContinuousDeploymentPolicy(
    scope: Construct,
    id: String,
    block: CfnContinuousDeploymentPolicyDsl.() -> Unit = {},
  ): CfnContinuousDeploymentPolicy {
    val builder = CfnContinuousDeploymentPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnContinuousDeploymentPolicyContinuousDeploymentPolicyConfigProperty(block: CfnContinuousDeploymentPolicyContinuousDeploymentPolicyConfigPropertyDsl.() -> Unit
      = {}): CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty {
    val builder = CfnContinuousDeploymentPolicyContinuousDeploymentPolicyConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnContinuousDeploymentPolicyProps(block: CfnContinuousDeploymentPolicyPropsDsl.() -> Unit
      = {}): CfnContinuousDeploymentPolicyProps {
    val builder = CfnContinuousDeploymentPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnContinuousDeploymentPolicySessionStickinessConfigProperty(block: CfnContinuousDeploymentPolicySessionStickinessConfigPropertyDsl.() -> Unit
      = {}): CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty {
    val builder = CfnContinuousDeploymentPolicySessionStickinessConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnContinuousDeploymentPolicySingleHeaderConfigProperty(block: CfnContinuousDeploymentPolicySingleHeaderConfigPropertyDsl.() -> Unit
      = {}): CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty {
    val builder = CfnContinuousDeploymentPolicySingleHeaderConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnContinuousDeploymentPolicySingleWeightConfigProperty(block: CfnContinuousDeploymentPolicySingleWeightConfigPropertyDsl.() -> Unit
      = {}): CfnContinuousDeploymentPolicy.SingleWeightConfigProperty {
    val builder = CfnContinuousDeploymentPolicySingleWeightConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnContinuousDeploymentPolicyTrafficConfigProperty(block: CfnContinuousDeploymentPolicyTrafficConfigPropertyDsl.() -> Unit
      = {}): CfnContinuousDeploymentPolicy.TrafficConfigProperty {
    val builder = CfnContinuousDeploymentPolicyTrafficConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDistribution(
    scope: Construct,
    id: String,
    block: CfnDistributionDsl.() -> Unit = {},
  ): CfnDistribution {
    val builder = CfnDistributionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionCacheBehaviorProperty(block: CfnDistributionCacheBehaviorPropertyDsl.() -> Unit
      = {}): CfnDistribution.CacheBehaviorProperty {
    val builder = CfnDistributionCacheBehaviorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionCookiesProperty(block: CfnDistributionCookiesPropertyDsl.() -> Unit = {}):
      CfnDistribution.CookiesProperty {
    val builder = CfnDistributionCookiesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionCustomErrorResponseProperty(block: CfnDistributionCustomErrorResponsePropertyDsl.() -> Unit
      = {}): CfnDistribution.CustomErrorResponseProperty {
    val builder = CfnDistributionCustomErrorResponsePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionCustomOriginConfigProperty(block: CfnDistributionCustomOriginConfigPropertyDsl.() -> Unit
      = {}): CfnDistribution.CustomOriginConfigProperty {
    val builder = CfnDistributionCustomOriginConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionDefaultCacheBehaviorProperty(block: CfnDistributionDefaultCacheBehaviorPropertyDsl.() -> Unit
      = {}): CfnDistribution.DefaultCacheBehaviorProperty {
    val builder = CfnDistributionDefaultCacheBehaviorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionDistributionConfigProperty(block: CfnDistributionDistributionConfigPropertyDsl.() -> Unit
      = {}): CfnDistribution.DistributionConfigProperty {
    val builder = CfnDistributionDistributionConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionForwardedValuesProperty(block: CfnDistributionForwardedValuesPropertyDsl.() -> Unit
      = {}): CfnDistribution.ForwardedValuesProperty {
    val builder = CfnDistributionForwardedValuesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionFunctionAssociationProperty(block: CfnDistributionFunctionAssociationPropertyDsl.() -> Unit
      = {}): CfnDistribution.FunctionAssociationProperty {
    val builder = CfnDistributionFunctionAssociationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionGeoRestrictionProperty(block: CfnDistributionGeoRestrictionPropertyDsl.() -> Unit
      = {}): CfnDistribution.GeoRestrictionProperty {
    val builder = CfnDistributionGeoRestrictionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionLambdaFunctionAssociationProperty(block: CfnDistributionLambdaFunctionAssociationPropertyDsl.() -> Unit
      = {}): CfnDistribution.LambdaFunctionAssociationProperty {
    val builder = CfnDistributionLambdaFunctionAssociationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionLegacyCustomOriginProperty(block: CfnDistributionLegacyCustomOriginPropertyDsl.() -> Unit
      = {}): CfnDistribution.LegacyCustomOriginProperty {
    val builder = CfnDistributionLegacyCustomOriginPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionLegacyS3OriginProperty(block: CfnDistributionLegacyS3OriginPropertyDsl.() -> Unit
      = {}): CfnDistribution.LegacyS3OriginProperty {
    val builder = CfnDistributionLegacyS3OriginPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionLoggingProperty(block: CfnDistributionLoggingPropertyDsl.() -> Unit = {}):
      CfnDistribution.LoggingProperty {
    val builder = CfnDistributionLoggingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionOriginCustomHeaderProperty(block: CfnDistributionOriginCustomHeaderPropertyDsl.() -> Unit
      = {}): CfnDistribution.OriginCustomHeaderProperty {
    val builder = CfnDistributionOriginCustomHeaderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionOriginGroupFailoverCriteriaProperty(block: CfnDistributionOriginGroupFailoverCriteriaPropertyDsl.() -> Unit
      = {}): CfnDistribution.OriginGroupFailoverCriteriaProperty {
    val builder = CfnDistributionOriginGroupFailoverCriteriaPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionOriginGroupMemberProperty(block: CfnDistributionOriginGroupMemberPropertyDsl.() -> Unit
      = {}): CfnDistribution.OriginGroupMemberProperty {
    val builder = CfnDistributionOriginGroupMemberPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionOriginGroupMembersProperty(block: CfnDistributionOriginGroupMembersPropertyDsl.() -> Unit
      = {}): CfnDistribution.OriginGroupMembersProperty {
    val builder = CfnDistributionOriginGroupMembersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionOriginGroupProperty(block: CfnDistributionOriginGroupPropertyDsl.() -> Unit
      = {}): CfnDistribution.OriginGroupProperty {
    val builder = CfnDistributionOriginGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionOriginGroupsProperty(block: CfnDistributionOriginGroupsPropertyDsl.() -> Unit
      = {}): CfnDistribution.OriginGroupsProperty {
    val builder = CfnDistributionOriginGroupsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDistributionOriginProperty(block: CfnDistributionOriginPropertyDsl.() -> Unit
      = {}): CfnDistribution.OriginProperty {
    val builder = CfnDistributionOriginPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionOriginShieldProperty(block: CfnDistributionOriginShieldPropertyDsl.() -> Unit
      = {}): CfnDistribution.OriginShieldProperty {
    val builder = CfnDistributionOriginShieldPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDistributionProps(block: CfnDistributionPropsDsl.() -> Unit = {}):
      CfnDistributionProps {
    val builder = CfnDistributionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionRestrictionsProperty(block: CfnDistributionRestrictionsPropertyDsl.() -> Unit
      = {}): CfnDistribution.RestrictionsProperty {
    val builder = CfnDistributionRestrictionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionS3OriginConfigProperty(block: CfnDistributionS3OriginConfigPropertyDsl.() -> Unit
      = {}): CfnDistribution.S3OriginConfigProperty {
    val builder = CfnDistributionS3OriginConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionStatusCodesProperty(block: CfnDistributionStatusCodesPropertyDsl.() -> Unit
      = {}): CfnDistribution.StatusCodesProperty {
    val builder = CfnDistributionStatusCodesPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnDistributionViewerCertificateProperty(block: CfnDistributionViewerCertificatePropertyDsl.() -> Unit
      = {}): CfnDistribution.ViewerCertificateProperty {
    val builder = CfnDistributionViewerCertificatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunction(
    scope: Construct,
    id: String,
    block: CfnFunctionDsl.() -> Unit = {},
  ): CfnFunction {
    val builder = CfnFunctionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionFunctionConfigProperty(block: CfnFunctionFunctionConfigPropertyDsl.() -> Unit =
      {}): CfnFunction.FunctionConfigProperty {
    val builder = CfnFunctionFunctionConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnFunctionFunctionMetadataProperty(block: CfnFunctionFunctionMetadataPropertyDsl.() -> Unit
      = {}): CfnFunction.FunctionMetadataProperty {
    val builder = CfnFunctionFunctionMetadataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnFunctionProps(block: CfnFunctionPropsDsl.() -> Unit = {}): CfnFunctionProps {
    val builder = CfnFunctionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnKeyGroup(
    scope: Construct,
    id: String,
    block: CfnKeyGroupDsl.() -> Unit = {},
  ): CfnKeyGroup {
    val builder = CfnKeyGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnKeyGroupKeyGroupConfigProperty(block: CfnKeyGroupKeyGroupConfigPropertyDsl.() -> Unit =
      {}): CfnKeyGroup.KeyGroupConfigProperty {
    val builder = CfnKeyGroupKeyGroupConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnKeyGroupProps(block: CfnKeyGroupPropsDsl.() -> Unit = {}): CfnKeyGroupProps {
    val builder = CfnKeyGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMonitoringSubscription(
    scope: Construct,
    id: String,
    block: CfnMonitoringSubscriptionDsl.() -> Unit = {},
  ): CfnMonitoringSubscription {
    val builder = CfnMonitoringSubscriptionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringSubscriptionMonitoringSubscriptionProperty(block: CfnMonitoringSubscriptionMonitoringSubscriptionPropertyDsl.() -> Unit
      = {}): CfnMonitoringSubscription.MonitoringSubscriptionProperty {
    val builder = CfnMonitoringSubscriptionMonitoringSubscriptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringSubscriptionProps(block: CfnMonitoringSubscriptionPropsDsl.() -> Unit = {}):
      CfnMonitoringSubscriptionProps {
    val builder = CfnMonitoringSubscriptionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMonitoringSubscriptionRealtimeMetricsSubscriptionConfigProperty(block: CfnMonitoringSubscriptionRealtimeMetricsSubscriptionConfigPropertyDsl.() -> Unit
      = {}): CfnMonitoringSubscription.RealtimeMetricsSubscriptionConfigProperty {
    val builder = CfnMonitoringSubscriptionRealtimeMetricsSubscriptionConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOriginAccessControl(
    scope: Construct,
    id: String,
    block: CfnOriginAccessControlDsl.() -> Unit = {},
  ): CfnOriginAccessControl {
    val builder = CfnOriginAccessControlDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnOriginAccessControlOriginAccessControlConfigProperty(block: CfnOriginAccessControlOriginAccessControlConfigPropertyDsl.() -> Unit
      = {}): CfnOriginAccessControl.OriginAccessControlConfigProperty {
    val builder = CfnOriginAccessControlOriginAccessControlConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOriginAccessControlProps(block: CfnOriginAccessControlPropsDsl.() -> Unit =
      {}): CfnOriginAccessControlProps {
    val builder = CfnOriginAccessControlPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOriginRequestPolicy(
    scope: Construct,
    id: String,
    block: CfnOriginRequestPolicyDsl.() -> Unit = {},
  ): CfnOriginRequestPolicy {
    val builder = CfnOriginRequestPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnOriginRequestPolicyCookiesConfigProperty(block: CfnOriginRequestPolicyCookiesConfigPropertyDsl.() -> Unit
      = {}): CfnOriginRequestPolicy.CookiesConfigProperty {
    val builder = CfnOriginRequestPolicyCookiesConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnOriginRequestPolicyHeadersConfigProperty(block: CfnOriginRequestPolicyHeadersConfigPropertyDsl.() -> Unit
      = {}): CfnOriginRequestPolicy.HeadersConfigProperty {
    val builder = CfnOriginRequestPolicyHeadersConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnOriginRequestPolicyOriginRequestPolicyConfigProperty(block: CfnOriginRequestPolicyOriginRequestPolicyConfigPropertyDsl.() -> Unit
      = {}): CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty {
    val builder = CfnOriginRequestPolicyOriginRequestPolicyConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnOriginRequestPolicyProps(block: CfnOriginRequestPolicyPropsDsl.() -> Unit =
      {}): CfnOriginRequestPolicyProps {
    val builder = CfnOriginRequestPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnOriginRequestPolicyQueryStringsConfigProperty(block: CfnOriginRequestPolicyQueryStringsConfigPropertyDsl.() -> Unit
      = {}): CfnOriginRequestPolicy.QueryStringsConfigProperty {
    val builder = CfnOriginRequestPolicyQueryStringsConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPublicKey(
    scope: Construct,
    id: String,
    block: CfnPublicKeyDsl.() -> Unit = {},
  ): CfnPublicKey {
    val builder = CfnPublicKeyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnPublicKeyProps(block: CfnPublicKeyPropsDsl.() -> Unit = {}):
      CfnPublicKeyProps {
    val builder = CfnPublicKeyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnPublicKeyPublicKeyConfigProperty(block: CfnPublicKeyPublicKeyConfigPropertyDsl.() -> Unit
      = {}): CfnPublicKey.PublicKeyConfigProperty {
    val builder = CfnPublicKeyPublicKeyConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRealtimeLogConfig(
    scope: Construct,
    id: String,
    block: CfnRealtimeLogConfigDsl.() -> Unit = {},
  ): CfnRealtimeLogConfig {
    val builder = CfnRealtimeLogConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRealtimeLogConfigEndPointProperty(block: CfnRealtimeLogConfigEndPointPropertyDsl.() -> Unit
      = {}): CfnRealtimeLogConfig.EndPointProperty {
    val builder = CfnRealtimeLogConfigEndPointPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRealtimeLogConfigKinesisStreamConfigProperty(block: CfnRealtimeLogConfigKinesisStreamConfigPropertyDsl.() -> Unit
      = {}): CfnRealtimeLogConfig.KinesisStreamConfigProperty {
    val builder = CfnRealtimeLogConfigKinesisStreamConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRealtimeLogConfigProps(block: CfnRealtimeLogConfigPropsDsl.() -> Unit = {}):
      CfnRealtimeLogConfigProps {
    val builder = CfnRealtimeLogConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResponseHeadersPolicy(
    scope: Construct,
    id: String,
    block: CfnResponseHeadersPolicyDsl.() -> Unit = {},
  ): CfnResponseHeadersPolicy {
    val builder = CfnResponseHeadersPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyAccessControlAllowHeadersProperty(block: CfnResponseHeadersPolicyAccessControlAllowHeadersPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.AccessControlAllowHeadersProperty {
    val builder = CfnResponseHeadersPolicyAccessControlAllowHeadersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyAccessControlAllowMethodsProperty(block: CfnResponseHeadersPolicyAccessControlAllowMethodsPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.AccessControlAllowMethodsProperty {
    val builder = CfnResponseHeadersPolicyAccessControlAllowMethodsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyAccessControlAllowOriginsProperty(block: CfnResponseHeadersPolicyAccessControlAllowOriginsPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty {
    val builder = CfnResponseHeadersPolicyAccessControlAllowOriginsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyAccessControlExposeHeadersProperty(block: CfnResponseHeadersPolicyAccessControlExposeHeadersPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.AccessControlExposeHeadersProperty {
    val builder = CfnResponseHeadersPolicyAccessControlExposeHeadersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyContentSecurityPolicyProperty(block: CfnResponseHeadersPolicyContentSecurityPolicyPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.ContentSecurityPolicyProperty {
    val builder = CfnResponseHeadersPolicyContentSecurityPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyContentTypeOptionsProperty(block: CfnResponseHeadersPolicyContentTypeOptionsPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.ContentTypeOptionsProperty {
    val builder = CfnResponseHeadersPolicyContentTypeOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyCorsConfigProperty(block: CfnResponseHeadersPolicyCorsConfigPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.CorsConfigProperty {
    val builder = CfnResponseHeadersPolicyCorsConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyCustomHeaderProperty(block: CfnResponseHeadersPolicyCustomHeaderPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.CustomHeaderProperty {
    val builder = CfnResponseHeadersPolicyCustomHeaderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyCustomHeadersConfigProperty(block: CfnResponseHeadersPolicyCustomHeadersConfigPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.CustomHeadersConfigProperty {
    val builder = CfnResponseHeadersPolicyCustomHeadersConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyFrameOptionsProperty(block: CfnResponseHeadersPolicyFrameOptionsPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.FrameOptionsProperty {
    val builder = CfnResponseHeadersPolicyFrameOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResponseHeadersPolicyProps(block: CfnResponseHeadersPolicyPropsDsl.() -> Unit
      = {}): CfnResponseHeadersPolicyProps {
    val builder = CfnResponseHeadersPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyReferrerPolicyProperty(block: CfnResponseHeadersPolicyReferrerPolicyPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.ReferrerPolicyProperty {
    val builder = CfnResponseHeadersPolicyReferrerPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyRemoveHeaderProperty(block: CfnResponseHeadersPolicyRemoveHeaderPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.RemoveHeaderProperty {
    val builder = CfnResponseHeadersPolicyRemoveHeaderPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyRemoveHeadersConfigProperty(block: CfnResponseHeadersPolicyRemoveHeadersConfigPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.RemoveHeadersConfigProperty {
    val builder = CfnResponseHeadersPolicyRemoveHeadersConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyResponseHeadersPolicyConfigProperty(block: CfnResponseHeadersPolicyResponseHeadersPolicyConfigPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.ResponseHeadersPolicyConfigProperty {
    val builder = CfnResponseHeadersPolicyResponseHeadersPolicyConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicySecurityHeadersConfigProperty(block: CfnResponseHeadersPolicySecurityHeadersConfigPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.SecurityHeadersConfigProperty {
    val builder = CfnResponseHeadersPolicySecurityHeadersConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyServerTimingHeadersConfigProperty(block: CfnResponseHeadersPolicyServerTimingHeadersConfigPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty {
    val builder = CfnResponseHeadersPolicyServerTimingHeadersConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyStrictTransportSecurityProperty(block: CfnResponseHeadersPolicyStrictTransportSecurityPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.StrictTransportSecurityProperty {
    val builder = CfnResponseHeadersPolicyStrictTransportSecurityPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnResponseHeadersPolicyXSSProtectionProperty(block: CfnResponseHeadersPolicyXSSProtectionPropertyDsl.() -> Unit
      = {}): CfnResponseHeadersPolicy.XSSProtectionProperty {
    val builder = CfnResponseHeadersPolicyXSSProtectionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStreamingDistribution(
    scope: Construct,
    id: String,
    block: CfnStreamingDistributionDsl.() -> Unit = {},
  ): CfnStreamingDistribution {
    val builder = CfnStreamingDistributionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamingDistributionLoggingProperty(block: CfnStreamingDistributionLoggingPropertyDsl.() -> Unit
      = {}): CfnStreamingDistribution.LoggingProperty {
    val builder = CfnStreamingDistributionLoggingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnStreamingDistributionProps(block: CfnStreamingDistributionPropsDsl.() -> Unit
      = {}): CfnStreamingDistributionProps {
    val builder = CfnStreamingDistributionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamingDistributionS3OriginProperty(block: CfnStreamingDistributionS3OriginPropertyDsl.() -> Unit
      = {}): CfnStreamingDistribution.S3OriginProperty {
    val builder = CfnStreamingDistributionS3OriginPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamingDistributionStreamingDistributionConfigProperty(block: CfnStreamingDistributionStreamingDistributionConfigPropertyDsl.() -> Unit
      = {}): CfnStreamingDistribution.StreamingDistributionConfigProperty {
    val builder = CfnStreamingDistributionStreamingDistributionConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnStreamingDistributionTrustedSignersProperty(block: CfnStreamingDistributionTrustedSignersPropertyDsl.() -> Unit
      = {}): CfnStreamingDistribution.TrustedSignersProperty {
    val builder = CfnStreamingDistributionTrustedSignersPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cloudFrontWebDistribution(
    scope: Construct,
    id: String,
    block: CloudFrontWebDistributionDsl.() -> Unit = {},
  ): CloudFrontWebDistribution {
    val builder = CloudFrontWebDistributionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cloudFrontWebDistributionAttributes(block: CloudFrontWebDistributionAttributesDsl.() -> Unit
      = {}): CloudFrontWebDistributionAttributes {
    val builder = CloudFrontWebDistributionAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cloudFrontWebDistributionProps(block: CloudFrontWebDistributionPropsDsl.() -> Unit = {}):
      CloudFrontWebDistributionProps {
    val builder = CloudFrontWebDistributionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun customOriginConfig(block: CustomOriginConfigDsl.() -> Unit = {}):
      CustomOriginConfig {
    val builder = CustomOriginConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun distribution(
    scope: Construct,
    id: String,
    block: DistributionDsl.() -> Unit = {},
  ): Distribution {
    val builder = DistributionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun distributionAttributes(block: DistributionAttributesDsl.() -> Unit = {}):
      DistributionAttributes {
    val builder = DistributionAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun distributionProps(block: DistributionPropsDsl.() -> Unit = {}):
      DistributionProps {
    val builder = DistributionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun edgeLambda(block: EdgeLambdaDsl.() -> Unit = {}): EdgeLambda {
    val builder = EdgeLambdaDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun errorResponse(block: ErrorResponseDsl.() -> Unit = {}): ErrorResponse {
    val builder = ErrorResponseDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fileCodeOptions(block: FileCodeOptionsDsl.() -> Unit = {}): FileCodeOptions {
    val builder = FileCodeOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun function(
    scope: Construct,
    id: String,
    block: FunctionDsl.() -> Unit = {},
  ): Function {
    val builder = FunctionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun functionAssociation(block: FunctionAssociationDsl.() -> Unit = {}):
      FunctionAssociation {
    val builder = FunctionAssociationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun functionAttributes(block: FunctionAttributesDsl.() -> Unit = {}):
      FunctionAttributes {
    val builder = FunctionAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun functionProps(block: FunctionPropsDsl.() -> Unit = {}): FunctionProps {
    val builder = FunctionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun keyGroup(
    scope: Construct,
    id: String,
    block: KeyGroupDsl.() -> Unit = {},
  ): KeyGroup {
    val builder = KeyGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun keyGroupProps(block: KeyGroupPropsDsl.() -> Unit = {}): KeyGroupProps {
    val builder = KeyGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun lambdaFunctionAssociation(block: LambdaFunctionAssociationDsl.() -> Unit = {}):
      LambdaFunctionAssociation {
    val builder = LambdaFunctionAssociationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun loggingConfiguration(block: LoggingConfigurationDsl.() -> Unit = {}):
      LoggingConfiguration {
    val builder = LoggingConfigurationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun originAccessIdentity(
    scope: Construct,
    id: String,
    block: OriginAccessIdentityDsl.() -> Unit = {},
  ): OriginAccessIdentity {
    val builder = OriginAccessIdentityDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun originAccessIdentityProps(block: OriginAccessIdentityPropsDsl.() -> Unit = {}):
      OriginAccessIdentityProps {
    val builder = OriginAccessIdentityPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun originBindConfig(block: OriginBindConfigDsl.() -> Unit = {}): OriginBindConfig {
    val builder = OriginBindConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun originBindOptions(block: OriginBindOptionsDsl.() -> Unit = {}):
      OriginBindOptions {
    val builder = OriginBindOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun originFailoverConfig(block: OriginFailoverConfigDsl.() -> Unit = {}):
      OriginFailoverConfig {
    val builder = OriginFailoverConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun originOptions(block: OriginOptionsDsl.() -> Unit = {}): OriginOptions {
    val builder = OriginOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun originProps(block: OriginPropsDsl.() -> Unit = {}): OriginProps {
    val builder = OriginPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun originRequestPolicy(
    scope: Construct,
    id: String,
    block: OriginRequestPolicyDsl.() -> Unit = {},
  ): OriginRequestPolicy {
    val builder = OriginRequestPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun originRequestPolicyProps(block: OriginRequestPolicyPropsDsl.() -> Unit = {}):
      OriginRequestPolicyProps {
    val builder = OriginRequestPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun publicKey(
    scope: Construct,
    id: String,
    block: PublicKeyDsl.() -> Unit = {},
  ): PublicKey {
    val builder = PublicKeyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun publicKeyProps(block: PublicKeyPropsDsl.() -> Unit = {}): PublicKeyProps {
    val builder = PublicKeyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun responseCustomHeader(block: ResponseCustomHeaderDsl.() -> Unit = {}):
      ResponseCustomHeader {
    val builder = ResponseCustomHeaderDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun responseCustomHeadersBehavior(block: ResponseCustomHeadersBehaviorDsl.() -> Unit
      = {}): ResponseCustomHeadersBehavior {
    val builder = ResponseCustomHeadersBehaviorDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun responseHeadersContentSecurityPolicy(block: ResponseHeadersContentSecurityPolicyDsl.() -> Unit
      = {}): ResponseHeadersContentSecurityPolicy {
    val builder = ResponseHeadersContentSecurityPolicyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun responseHeadersContentTypeOptions(block: ResponseHeadersContentTypeOptionsDsl.() -> Unit =
      {}): ResponseHeadersContentTypeOptions {
    val builder = ResponseHeadersContentTypeOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun responseHeadersCorsBehavior(block: ResponseHeadersCorsBehaviorDsl.() -> Unit =
      {}): ResponseHeadersCorsBehavior {
    val builder = ResponseHeadersCorsBehaviorDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun responseHeadersFrameOptions(block: ResponseHeadersFrameOptionsDsl.() -> Unit =
      {}): ResponseHeadersFrameOptions {
    val builder = ResponseHeadersFrameOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun responseHeadersPolicy(
    scope: Construct,
    id: String,
    block: ResponseHeadersPolicyDsl.() -> Unit = {},
  ): ResponseHeadersPolicy {
    val builder = ResponseHeadersPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun responseHeadersPolicyProps(block: ResponseHeadersPolicyPropsDsl.() -> Unit =
      {}): ResponseHeadersPolicyProps {
    val builder = ResponseHeadersPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun responseHeadersReferrerPolicy(block: ResponseHeadersReferrerPolicyDsl.() -> Unit
      = {}): ResponseHeadersReferrerPolicy {
    val builder = ResponseHeadersReferrerPolicyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun responseHeadersStrictTransportSecurity(block: ResponseHeadersStrictTransportSecurityDsl.() -> Unit
      = {}): ResponseHeadersStrictTransportSecurity {
    val builder = ResponseHeadersStrictTransportSecurityDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun responseHeadersXSSProtection(block: ResponseHeadersXSSProtectionDsl.() -> Unit =
      {}): ResponseHeadersXSSProtection {
    val builder = ResponseHeadersXSSProtectionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun responseSecurityHeadersBehavior(block: ResponseSecurityHeadersBehaviorDsl.() -> Unit =
      {}): ResponseSecurityHeadersBehavior {
    val builder = ResponseSecurityHeadersBehaviorDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun s3OriginConfig(block: S3OriginConfigDsl.() -> Unit = {}): S3OriginConfig {
    val builder = S3OriginConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun sourceConfiguration(block: SourceConfigurationDsl.() -> Unit = {}):
      SourceConfiguration {
    val builder = SourceConfigurationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun viewerCertificateOptions(block: ViewerCertificateOptionsDsl.() -> Unit = {}):
      ViewerCertificateOptions {
    val builder = ViewerCertificateOptionsDsl()
    builder.apply(block)
    return builder.build()
  }
}
