@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.managedblockchain.CfnAccessor
import software.amazon.awscdk.services.managedblockchain.CfnMember
import software.amazon.awscdk.services.managedblockchain.CfnNode

public inline fun CfnAccessor.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnMember.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnMember.setMemberConfiguration(block: CfnMemberMemberConfigurationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnMemberMemberConfigurationPropertyDsl()
  builder.apply(block)
  return setMemberConfiguration(builder.build())
}

public inline
    fun CfnMember.setNetworkConfiguration(block: CfnMemberNetworkConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnMemberNetworkConfigurationPropertyDsl()
  builder.apply(block)
  return setNetworkConfiguration(builder.build())
}

public inline fun CfnNode.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnNode.setNodeConfiguration(block: CfnNodeNodeConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnNodeNodeConfigurationPropertyDsl()
  builder.apply(block)
  return setNodeConfiguration(builder.build())
}
