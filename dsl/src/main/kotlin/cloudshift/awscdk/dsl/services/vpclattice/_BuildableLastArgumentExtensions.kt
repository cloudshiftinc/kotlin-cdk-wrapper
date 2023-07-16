@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.vpclattice.CfnAccessLogSubscription
import software.amazon.awscdk.services.vpclattice.CfnAuthPolicy
import software.amazon.awscdk.services.vpclattice.CfnListener
import software.amazon.awscdk.services.vpclattice.CfnResourcePolicy
import software.amazon.awscdk.services.vpclattice.CfnRule
import software.amazon.awscdk.services.vpclattice.CfnService
import software.amazon.awscdk.services.vpclattice.CfnServiceNetwork
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup

public inline fun CfnAccessLogSubscription.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnAuthPolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnListener.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnListener.setDefaultAction(block: CfnListenerDefaultActionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnListenerDefaultActionPropertyDsl()
  builder.apply(block)
  return setDefaultAction(builder.build())
}

public inline fun CfnResourcePolicy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRule.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnRule.setAction(block: CfnRuleActionPropertyDsl.() -> Unit = {}) {
  val builder = CfnRuleActionPropertyDsl()
  builder.apply(block)
  return setAction(builder.build())
}

public inline fun CfnRule.setMatch(block: CfnRuleMatchPropertyDsl.() -> Unit = {}) {
  val builder = CfnRuleMatchPropertyDsl()
  builder.apply(block)
  return setMatch(builder.build())
}

public inline fun CfnService.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnService.setDnsEntry(block: CfnServiceDnsEntryPropertyDsl.() -> Unit = {}) {
  val builder = CfnServiceDnsEntryPropertyDsl()
  builder.apply(block)
  return setDnsEntry(builder.build())
}

public inline fun CfnServiceNetwork.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnServiceNetworkServiceAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnServiceNetworkServiceAssociation.setDnsEntry(block: CfnServiceNetworkServiceAssociationDnsEntryPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnServiceNetworkServiceAssociationDnsEntryPropertyDsl()
  builder.apply(block)
  return setDnsEntry(builder.build())
}

public inline fun CfnServiceNetworkVpcAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTargetGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnTargetGroup.setConfig(block: CfnTargetGroupTargetGroupConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnTargetGroupTargetGroupConfigPropertyDsl()
  builder.apply(block)
  return setConfig(builder.build())
}
