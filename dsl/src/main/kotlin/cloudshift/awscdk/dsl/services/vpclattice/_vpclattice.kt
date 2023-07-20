@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscription
import software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscriptionProps
import software.amazon.awscdk.services.vpclattice.CfnAuthPolicy
import software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps
import software.amazon.awscdk.services.vpclattice.CfnListener
import software.amazon.awscdk.services.vpclattice.CfnListenerProps
import software.amazon.awscdk.services.vpclattice.CfnResourcePolicy
import software.amazon.awscdk.services.vpclattice.CfnResourcePolicyProps
import software.amazon.awscdk.services.vpclattice.CfnRule
import software.amazon.awscdk.services.vpclattice.CfnRuleProps
import software.amazon.awscdk.services.vpclattice.CfnService
import software.amazon.awscdk.services.vpclattice.CfnServiceNetwork
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkProps
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps
import software.amazon.awscdk.services.vpclattice.CfnServiceProps
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup
import software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps
import software.constructs.Construct

public object vpclattice {
  public inline fun cfnAccessLogSubscription(
    scope: Construct,
    id: String,
    block: CfnAccessLogSubscriptionDsl.() -> Unit = {},
  ): CfnAccessLogSubscription {
    val builder = CfnAccessLogSubscriptionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAccessLogSubscriptionProps(block: CfnAccessLogSubscriptionPropsDsl.() -> Unit
      = {}): CfnAccessLogSubscriptionProps {
    val builder = CfnAccessLogSubscriptionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAuthPolicy(
    scope: Construct,
    id: String,
    block: CfnAuthPolicyDsl.() -> Unit = {},
  ): CfnAuthPolicy {
    val builder = CfnAuthPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAuthPolicyProps(block: CfnAuthPolicyPropsDsl.() -> Unit = {}):
      CfnAuthPolicyProps {
    val builder = CfnAuthPolicyPropsDsl()
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

  public inline
      fun cfnListenerDefaultActionProperty(block: CfnListenerDefaultActionPropertyDsl.() -> Unit =
      {}): CfnListener.DefaultActionProperty {
    val builder = CfnListenerDefaultActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerFixedResponseProperty(block: CfnListenerFixedResponsePropertyDsl.() -> Unit =
      {}): CfnListener.FixedResponseProperty {
    val builder = CfnListenerFixedResponsePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnListenerForwardProperty(block: CfnListenerForwardPropertyDsl.() -> Unit =
      {}): CfnListener.ForwardProperty {
    val builder = CfnListenerForwardPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnListenerProps(block: CfnListenerPropsDsl.() -> Unit = {}): CfnListenerProps {
    val builder = CfnListenerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnListenerWeightedTargetGroupProperty(block: CfnListenerWeightedTargetGroupPropertyDsl.() -> Unit
      = {}): CfnListener.WeightedTargetGroupProperty {
    val builder = CfnListenerWeightedTargetGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourcePolicy(
    scope: Construct,
    id: String,
    block: CfnResourcePolicyDsl.() -> Unit = {},
  ): CfnResourcePolicy {
    val builder = CfnResourcePolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnResourcePolicyProps(block: CfnResourcePolicyPropsDsl.() -> Unit = {}):
      CfnResourcePolicyProps {
    val builder = CfnResourcePolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRule(
    scope: Construct,
    id: String,
    block: CfnRuleDsl.() -> Unit = {},
  ): CfnRule {
    val builder = CfnRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleActionProperty(block: CfnRuleActionPropertyDsl.() -> Unit = {}):
      CfnRule.ActionProperty {
    val builder = CfnRuleActionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleFixedResponseProperty(block: CfnRuleFixedResponsePropertyDsl.() -> Unit =
      {}): CfnRule.FixedResponseProperty {
    val builder = CfnRuleFixedResponsePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleForwardProperty(block: CfnRuleForwardPropertyDsl.() -> Unit = {}):
      CfnRule.ForwardProperty {
    val builder = CfnRuleForwardPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleHeaderMatchProperty(block: CfnRuleHeaderMatchPropertyDsl.() -> Unit =
      {}): CfnRule.HeaderMatchProperty {
    val builder = CfnRuleHeaderMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleHeaderMatchTypeProperty(block: CfnRuleHeaderMatchTypePropertyDsl.() -> Unit = {}):
      CfnRule.HeaderMatchTypeProperty {
    val builder = CfnRuleHeaderMatchTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleHttpMatchProperty(block: CfnRuleHttpMatchPropertyDsl.() -> Unit = {}):
      CfnRule.HttpMatchProperty {
    val builder = CfnRuleHttpMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleMatchProperty(block: CfnRuleMatchPropertyDsl.() -> Unit = {}):
      CfnRule.MatchProperty {
    val builder = CfnRuleMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRulePathMatchProperty(block: CfnRulePathMatchPropertyDsl.() -> Unit = {}):
      CfnRule.PathMatchProperty {
    val builder = CfnRulePathMatchPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRulePathMatchTypeProperty(block: CfnRulePathMatchTypePropertyDsl.() -> Unit =
      {}): CfnRule.PathMatchTypeProperty {
    val builder = CfnRulePathMatchTypePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRuleProps(block: CfnRulePropsDsl.() -> Unit = {}): CfnRuleProps {
    val builder = CfnRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnRuleWeightedTargetGroupProperty(block: CfnRuleWeightedTargetGroupPropertyDsl.() -> Unit
      = {}): CfnRule.WeightedTargetGroupProperty {
    val builder = CfnRuleWeightedTargetGroupPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnService(
    scope: Construct,
    id: String,
    block: CfnServiceDsl.() -> Unit = {},
  ): CfnService {
    val builder = CfnServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServiceDnsEntryProperty(block: CfnServiceDnsEntryPropertyDsl.() -> Unit =
      {}): CfnService.DnsEntryProperty {
    val builder = CfnServiceDnsEntryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServiceNetwork(
    scope: Construct,
    id: String,
    block: CfnServiceNetworkDsl.() -> Unit = {},
  ): CfnServiceNetwork {
    val builder = CfnServiceNetworkDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServiceNetworkProps(block: CfnServiceNetworkPropsDsl.() -> Unit = {}):
      CfnServiceNetworkProps {
    val builder = CfnServiceNetworkPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServiceNetworkServiceAssociation(
    scope: Construct,
    id: String,
    block: CfnServiceNetworkServiceAssociationDsl.() -> Unit = {},
  ): CfnServiceNetworkServiceAssociation {
    val builder = CfnServiceNetworkServiceAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceNetworkServiceAssociationDnsEntryProperty(block: CfnServiceNetworkServiceAssociationDnsEntryPropertyDsl.() -> Unit
      = {}): CfnServiceNetworkServiceAssociation.DnsEntryProperty {
    val builder = CfnServiceNetworkServiceAssociationDnsEntryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceNetworkServiceAssociationProps(block: CfnServiceNetworkServiceAssociationPropsDsl.() -> Unit
      = {}): CfnServiceNetworkServiceAssociationProps {
    val builder = CfnServiceNetworkServiceAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServiceNetworkVpcAssociation(
    scope: Construct,
    id: String,
    block: CfnServiceNetworkVpcAssociationDsl.() -> Unit = {},
  ): CfnServiceNetworkVpcAssociation {
    val builder = CfnServiceNetworkVpcAssociationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnServiceNetworkVpcAssociationProps(block: CfnServiceNetworkVpcAssociationPropsDsl.() -> Unit
      = {}): CfnServiceNetworkVpcAssociationProps {
    val builder = CfnServiceNetworkVpcAssociationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnServiceProps(block: CfnServicePropsDsl.() -> Unit = {}): CfnServiceProps {
    val builder = CfnServicePropsDsl()
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

  public inline
      fun cfnTargetGroupHealthCheckConfigProperty(block: CfnTargetGroupHealthCheckConfigPropertyDsl.() -> Unit
      = {}): CfnTargetGroup.HealthCheckConfigProperty {
    val builder = CfnTargetGroupHealthCheckConfigPropertyDsl()
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
      fun cfnTargetGroupTargetGroupConfigProperty(block: CfnTargetGroupTargetGroupConfigPropertyDsl.() -> Unit
      = {}): CfnTargetGroup.TargetGroupConfigProperty {
    val builder = CfnTargetGroupTargetGroupConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnTargetGroupTargetProperty(block: CfnTargetGroupTargetPropertyDsl.() -> Unit =
      {}): CfnTargetGroup.TargetProperty {
    val builder = CfnTargetGroupTargetPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
