@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import kotlin.Unit
import software.amazon.awscdk.services.managedblockchain.CfnMember
import software.amazon.awscdk.services.managedblockchain.CfnNode

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

public inline fun CfnNode.setNodeConfiguration(block: CfnNodeNodeConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnNodeNodeConfigurationPropertyDsl()
  builder.apply(block)
  return setNodeConfiguration(builder.build())
}
