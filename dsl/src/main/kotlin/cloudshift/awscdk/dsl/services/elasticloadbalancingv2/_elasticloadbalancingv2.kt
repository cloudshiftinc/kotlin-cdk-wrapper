@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps
import software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps
import software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetsProps
import software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkActionProps
import software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps
import software.amazon.awscdk.services.elasticloadbalancingv2.AddRuleProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerAttributes
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerCertificateProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRule
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListenerRuleProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerAttributes
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerRuleProps
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseListenerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseNetworkListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.BaseTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificate
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerCertificateProps
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRuleProps
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.FixedResponseOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.ForwardOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkForwardOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListener
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkListenerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerLookupOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkTargetGroupProps
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.QueryStringCondition
import software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes
import software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup
import software.constructs.Construct

public object elasticloadbalancingv2 {
  public inline fun addApplicationActionProps(block: AddApplicationActionPropsDsl.() -> Unit = {}):
      AddApplicationActionProps {
    val builder = AddApplicationActionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun addApplicationTargetGroupsProps(block: AddApplicationTargetGroupsPropsDsl.() -> Unit =
      {}): AddApplicationTargetGroupsProps {
    val builder = AddApplicationTargetGroupsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun addApplicationTargetsProps(block: AddApplicationTargetsPropsDsl.() -> Unit =
      {}): AddApplicationTargetsProps {
    val builder = AddApplicationTargetsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun addNetworkActionProps(block: AddNetworkActionPropsDsl.() -> Unit = {}):
      AddNetworkActionProps {
    val builder = AddNetworkActionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun addNetworkTargetsProps(block: AddNetworkTargetsPropsDsl.() -> Unit = {}):
      AddNetworkTargetsProps {
    val builder = AddNetworkTargetsPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun addRuleProps(block: AddRulePropsDsl.() -> Unit = {}): AddRuleProps {
    val builder = AddRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationListener(
    scope: Construct,
    id: String,
    block: ApplicationListenerDsl.() -> Unit = {},
  ): ApplicationListener {
    val builder = ApplicationListenerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationListenerAttributes(block: ApplicationListenerAttributesDsl.() -> Unit
      = {}): ApplicationListenerAttributes {
    val builder = ApplicationListenerAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationListenerCertificate(
    scope: Construct,
    id: String,
    block: ApplicationListenerCertificateDsl.() -> Unit = {},
  ): ApplicationListenerCertificate {
    val builder = ApplicationListenerCertificateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun applicationListenerCertificateProps(block: ApplicationListenerCertificatePropsDsl.() -> Unit
      = {}): ApplicationListenerCertificateProps {
    val builder = ApplicationListenerCertificatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun applicationListenerLookupOptions(block: ApplicationListenerLookupOptionsDsl.() -> Unit =
      {}): ApplicationListenerLookupOptions {
    val builder = ApplicationListenerLookupOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationListenerProps(block: ApplicationListenerPropsDsl.() -> Unit = {}):
      ApplicationListenerProps {
    val builder = ApplicationListenerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationListenerRule(
    scope: Construct,
    id: String,
    block: ApplicationListenerRuleDsl.() -> Unit = {},
  ): ApplicationListenerRule {
    val builder = ApplicationListenerRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationListenerRuleProps(block: ApplicationListenerRulePropsDsl.() -> Unit =
      {}): ApplicationListenerRuleProps {
    val builder = ApplicationListenerRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationLoadBalancer(
    scope: Construct,
    id: String,
    block: ApplicationLoadBalancerDsl.() -> Unit = {},
  ): ApplicationLoadBalancer {
    val builder = ApplicationLoadBalancerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun applicationLoadBalancerAttributes(block: ApplicationLoadBalancerAttributesDsl.() -> Unit =
      {}): ApplicationLoadBalancerAttributes {
    val builder = ApplicationLoadBalancerAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun applicationLoadBalancerLookupOptions(block: ApplicationLoadBalancerLookupOptionsDsl.() -> Unit
      = {}): ApplicationLoadBalancerLookupOptions {
    val builder = ApplicationLoadBalancerLookupOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationLoadBalancerProps(block: ApplicationLoadBalancerPropsDsl.() -> Unit =
      {}): ApplicationLoadBalancerProps {
    val builder = ApplicationLoadBalancerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun applicationLoadBalancerRedirectConfig(block: ApplicationLoadBalancerRedirectConfigDsl.() -> Unit
      = {}): ApplicationLoadBalancerRedirectConfig {
    val builder = ApplicationLoadBalancerRedirectConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationTargetGroup(
    scope: Construct,
    id: String,
    block: ApplicationTargetGroupDsl.() -> Unit = {},
  ): ApplicationTargetGroup {
    val builder = ApplicationTargetGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun applicationTargetGroupProps(block: ApplicationTargetGroupPropsDsl.() -> Unit =
      {}): ApplicationTargetGroupProps {
    val builder = ApplicationTargetGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun authenticateOidcOptions(block: AuthenticateOidcOptionsDsl.() -> Unit = {}):
      AuthenticateOidcOptions {
    val builder = AuthenticateOidcOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun baseApplicationListenerProps(block: BaseApplicationListenerPropsDsl.() -> Unit =
      {}): BaseApplicationListenerProps {
    val builder = BaseApplicationListenerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun baseApplicationListenerRuleProps(block: BaseApplicationListenerRulePropsDsl.() -> Unit =
      {}): BaseApplicationListenerRuleProps {
    val builder = BaseApplicationListenerRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun baseListenerLookupOptions(block: BaseListenerLookupOptionsDsl.() -> Unit = {}):
      BaseListenerLookupOptions {
    val builder = BaseListenerLookupOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun baseLoadBalancerLookupOptions(block: BaseLoadBalancerLookupOptionsDsl.() -> Unit
      = {}): BaseLoadBalancerLookupOptions {
    val builder = BaseLoadBalancerLookupOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun baseLoadBalancerProps(block: BaseLoadBalancerPropsDsl.() -> Unit = {}):
      BaseLoadBalancerProps {
    val builder = BaseLoadBalancerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun baseNetworkListenerProps(block: BaseNetworkListenerPropsDsl.() -> Unit = {}):
      BaseNetworkListenerProps {
    val builder = BaseNetworkListenerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun baseTargetGroupProps(block: BaseTargetGroupPropsDsl.() -> Unit = {}):
      BaseTargetGroupProps {
    val builder = BaseTargetGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnListener(
    scope: Construct,
    id: String,
    block: CfnListenerDsl.() -> Unit = {},
  ): CfnListener {
    val builder = CfnListenerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnListenerActionProperty(block: CfnListenerActionPropertyDsl.() -> Unit = {}):
      CfnListener.ActionProperty {
    val builder = CfnListenerActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerAuthenticateCognitoConfigProperty(block: CfnListenerAuthenticateCognitoConfigPropertyDsl.() -> Unit
      = {}): CfnListener.AuthenticateCognitoConfigProperty {
    val builder = CfnListenerAuthenticateCognitoConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerAuthenticateOidcConfigProperty(block: CfnListenerAuthenticateOidcConfigPropertyDsl.() -> Unit
      = {}): CfnListener.AuthenticateOidcConfigProperty {
    val builder = CfnListenerAuthenticateOidcConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnListenerCertificate(
    scope: Construct,
    id: String,
    block: CfnListenerCertificateDsl.() -> Unit = {},
  ): CfnListenerCertificate {
    val builder = CfnListenerCertificateDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerCertificateCertificateProperty(block: CfnListenerCertificateCertificatePropertyDsl.() -> Unit
      = {}): CfnListenerCertificate.CertificateProperty {
    val builder = CfnListenerCertificateCertificatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerCertificateProperty(block: CfnListenerCertificatePropertyDsl.() -> Unit = {}):
      CfnListener.CertificateProperty {
    val builder = CfnListenerCertificatePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnListenerCertificateProps(block: CfnListenerCertificatePropsDsl.() -> Unit =
      {}): CfnListenerCertificateProps {
    val builder = CfnListenerCertificatePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerFixedResponseConfigProperty(block: CfnListenerFixedResponseConfigPropertyDsl.() -> Unit
      = {}): CfnListener.FixedResponseConfigProperty {
    val builder = CfnListenerFixedResponseConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerForwardConfigProperty(block: CfnListenerForwardConfigPropertyDsl.() -> Unit =
      {}): CfnListener.ForwardConfigProperty {
    val builder = CfnListenerForwardConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnListenerProps(block: CfnListenerPropsDsl.() -> Unit = {}): CfnListenerProps {
    val builder = CfnListenerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRedirectConfigProperty(block: CfnListenerRedirectConfigPropertyDsl.() -> Unit =
      {}): CfnListener.RedirectConfigProperty {
    val builder = CfnListenerRedirectConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnListenerRule(
    scope: Construct,
    id: String,
    block: CfnListenerRuleDsl.() -> Unit = {},
  ): CfnListenerRule {
    val builder = CfnListenerRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnListenerRuleActionProperty(block: CfnListenerRuleActionPropertyDsl.() -> Unit
      = {}): CfnListenerRule.ActionProperty {
    val builder = CfnListenerRuleActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRuleAuthenticateCognitoConfigProperty(block: CfnListenerRuleAuthenticateCognitoConfigPropertyDsl.() -> Unit
      = {}): CfnListenerRule.AuthenticateCognitoConfigProperty {
    val builder = CfnListenerRuleAuthenticateCognitoConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRuleAuthenticateOidcConfigProperty(block: CfnListenerRuleAuthenticateOidcConfigPropertyDsl.() -> Unit
      = {}): CfnListenerRule.AuthenticateOidcConfigProperty {
    val builder = CfnListenerRuleAuthenticateOidcConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRuleFixedResponseConfigProperty(block: CfnListenerRuleFixedResponseConfigPropertyDsl.() -> Unit
      = {}): CfnListenerRule.FixedResponseConfigProperty {
    val builder = CfnListenerRuleFixedResponseConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRuleForwardConfigProperty(block: CfnListenerRuleForwardConfigPropertyDsl.() -> Unit
      = {}): CfnListenerRule.ForwardConfigProperty {
    val builder = CfnListenerRuleForwardConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRuleHostHeaderConfigProperty(block: CfnListenerRuleHostHeaderConfigPropertyDsl.() -> Unit
      = {}): CfnListenerRule.HostHeaderConfigProperty {
    val builder = CfnListenerRuleHostHeaderConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRuleHttpHeaderConfigProperty(block: CfnListenerRuleHttpHeaderConfigPropertyDsl.() -> Unit
      = {}): CfnListenerRule.HttpHeaderConfigProperty {
    val builder = CfnListenerRuleHttpHeaderConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRuleHttpRequestMethodConfigProperty(block: CfnListenerRuleHttpRequestMethodConfigPropertyDsl.() -> Unit
      = {}): CfnListenerRule.HttpRequestMethodConfigProperty {
    val builder = CfnListenerRuleHttpRequestMethodConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRulePathPatternConfigProperty(block: CfnListenerRulePathPatternConfigPropertyDsl.() -> Unit
      = {}): CfnListenerRule.PathPatternConfigProperty {
    val builder = CfnListenerRulePathPatternConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnListenerRuleProps(block: CfnListenerRulePropsDsl.() -> Unit = {}):
      CfnListenerRuleProps {
    val builder = CfnListenerRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRuleQueryStringConfigProperty(block: CfnListenerRuleQueryStringConfigPropertyDsl.() -> Unit
      = {}): CfnListenerRule.QueryStringConfigProperty {
    val builder = CfnListenerRuleQueryStringConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRuleQueryStringKeyValueProperty(block: CfnListenerRuleQueryStringKeyValuePropertyDsl.() -> Unit
      = {}): CfnListenerRule.QueryStringKeyValueProperty {
    val builder = CfnListenerRuleQueryStringKeyValuePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRuleRedirectConfigProperty(block: CfnListenerRuleRedirectConfigPropertyDsl.() -> Unit
      = {}): CfnListenerRule.RedirectConfigProperty {
    val builder = CfnListenerRuleRedirectConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRuleRuleConditionProperty(block: CfnListenerRuleRuleConditionPropertyDsl.() -> Unit
      = {}): CfnListenerRule.RuleConditionProperty {
    val builder = CfnListenerRuleRuleConditionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRuleSourceIpConfigProperty(block: CfnListenerRuleSourceIpConfigPropertyDsl.() -> Unit
      = {}): CfnListenerRule.SourceIpConfigProperty {
    val builder = CfnListenerRuleSourceIpConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRuleTargetGroupStickinessConfigProperty(block: CfnListenerRuleTargetGroupStickinessConfigPropertyDsl.() -> Unit
      = {}): CfnListenerRule.TargetGroupStickinessConfigProperty {
    val builder = CfnListenerRuleTargetGroupStickinessConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerRuleTargetGroupTupleProperty(block: CfnListenerRuleTargetGroupTuplePropertyDsl.() -> Unit
      = {}): CfnListenerRule.TargetGroupTupleProperty {
    val builder = CfnListenerRuleTargetGroupTuplePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerTargetGroupStickinessConfigProperty(block: CfnListenerTargetGroupStickinessConfigPropertyDsl.() -> Unit
      = {}): CfnListener.TargetGroupStickinessConfigProperty {
    val builder = CfnListenerTargetGroupStickinessConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerTargetGroupTupleProperty(block: CfnListenerTargetGroupTuplePropertyDsl.() -> Unit
      = {}): CfnListener.TargetGroupTupleProperty {
    val builder = CfnListenerTargetGroupTuplePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLoadBalancer(
    scope: Construct,
    id: String,
    block: CfnLoadBalancerDsl.() -> Unit = {},
  ): CfnLoadBalancer {
    val builder = CfnLoadBalancerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoadBalancerLoadBalancerAttributeProperty(block: CfnLoadBalancerLoadBalancerAttributePropertyDsl.() -> Unit
      = {}): CfnLoadBalancer.LoadBalancerAttributeProperty {
    val builder = CfnLoadBalancerLoadBalancerAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnLoadBalancerProps(block: CfnLoadBalancerPropsDsl.() -> Unit = {}):
      CfnLoadBalancerProps {
    val builder = CfnLoadBalancerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnLoadBalancerSubnetMappingProperty(block: CfnLoadBalancerSubnetMappingPropertyDsl.() -> Unit
      = {}): CfnLoadBalancer.SubnetMappingProperty {
    val builder = CfnLoadBalancerSubnetMappingPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTargetGroup(
    scope: Construct,
    id: String,
    block: CfnTargetGroupDsl.() -> Unit = {},
  ): CfnTargetGroup {
    val builder = CfnTargetGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTargetGroupMatcherProperty(block: CfnTargetGroupMatcherPropertyDsl.() -> Unit
      = {}): CfnTargetGroup.MatcherProperty {
    val builder = CfnTargetGroupMatcherPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTargetGroupProps(block: CfnTargetGroupPropsDsl.() -> Unit = {}):
      CfnTargetGroupProps {
    val builder = CfnTargetGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTargetGroupTargetDescriptionProperty(block: CfnTargetGroupTargetDescriptionPropertyDsl.() -> Unit
      = {}): CfnTargetGroup.TargetDescriptionProperty {
    val builder = CfnTargetGroupTargetDescriptionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnTargetGroupTargetGroupAttributeProperty(block: CfnTargetGroupTargetGroupAttributePropertyDsl.() -> Unit
      = {}): CfnTargetGroup.TargetGroupAttributeProperty {
    val builder = CfnTargetGroupTargetGroupAttributePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun fixedResponseOptions(block: FixedResponseOptionsDsl.() -> Unit = {}):
      FixedResponseOptions {
    val builder = FixedResponseOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun forwardOptions(block: ForwardOptionsDsl.() -> Unit = {}): ForwardOptions {
    val builder = ForwardOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun healthCheck(block: HealthCheckDsl.() -> Unit = {}): HealthCheck {
    val builder = HealthCheckDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun loadBalancerTargetProps(block: LoadBalancerTargetPropsDsl.() -> Unit = {}):
      LoadBalancerTargetProps {
    val builder = LoadBalancerTargetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkForwardOptions(block: NetworkForwardOptionsDsl.() -> Unit = {}):
      NetworkForwardOptions {
    val builder = NetworkForwardOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkListener(
    scope: Construct,
    id: String,
    block: NetworkListenerDsl.() -> Unit = {},
  ): NetworkListener {
    val builder = NetworkListenerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkListenerLookupOptions(block: NetworkListenerLookupOptionsDsl.() -> Unit =
      {}): NetworkListenerLookupOptions {
    val builder = NetworkListenerLookupOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkListenerProps(block: NetworkListenerPropsDsl.() -> Unit = {}):
      NetworkListenerProps {
    val builder = NetworkListenerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkLoadBalancer(
    scope: Construct,
    id: String,
    block: NetworkLoadBalancerDsl.() -> Unit = {},
  ): NetworkLoadBalancer {
    val builder = NetworkLoadBalancerDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkLoadBalancerAttributes(block: NetworkLoadBalancerAttributesDsl.() -> Unit
      = {}): NetworkLoadBalancerAttributes {
    val builder = NetworkLoadBalancerAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun networkLoadBalancerLookupOptions(block: NetworkLoadBalancerLookupOptionsDsl.() -> Unit =
      {}): NetworkLoadBalancerLookupOptions {
    val builder = NetworkLoadBalancerLookupOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkLoadBalancerProps(block: NetworkLoadBalancerPropsDsl.() -> Unit = {}):
      NetworkLoadBalancerProps {
    val builder = NetworkLoadBalancerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkTargetGroup(
    scope: Construct,
    id: String,
    block: NetworkTargetGroupDsl.() -> Unit = {},
  ): NetworkTargetGroup {
    val builder = NetworkTargetGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkTargetGroupProps(block: NetworkTargetGroupPropsDsl.() -> Unit = {}):
      NetworkTargetGroupProps {
    val builder = NetworkTargetGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun networkWeightedTargetGroup(block: NetworkWeightedTargetGroupDsl.() -> Unit =
      {}): NetworkWeightedTargetGroup {
    val builder = NetworkWeightedTargetGroupDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun queryStringCondition(block: QueryStringConditionDsl.() -> Unit = {}):
      QueryStringCondition {
    val builder = QueryStringConditionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun redirectOptions(block: RedirectOptionsDsl.() -> Unit = {}): RedirectOptions {
    val builder = RedirectOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun targetGroupAttributes(block: TargetGroupAttributesDsl.() -> Unit = {}):
      TargetGroupAttributes {
    val builder = TargetGroupAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun weightedTargetGroup(block: WeightedTargetGroupDsl.() -> Unit = {}):
      WeightedTargetGroup {
    val builder = WeightedTargetGroupDsl()
    builder.apply(block)
    return builder.build()
  }
}
