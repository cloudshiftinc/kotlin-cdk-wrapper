@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.managedblockchain

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.managedblockchain.CfnAccessor
import software.amazon.awscdk.services.managedblockchain.CfnAccessorProps
import software.amazon.awscdk.services.managedblockchain.CfnMember
import software.amazon.awscdk.services.managedblockchain.CfnMemberProps
import software.amazon.awscdk.services.managedblockchain.CfnNode
import software.amazon.awscdk.services.managedblockchain.CfnNodeProps
import software.constructs.Construct

public object managedblockchain {
  public inline fun cfnAccessor(
    scope: Construct,
    id: String,
    block: CfnAccessorDsl.() -> Unit = {},
  ): CfnAccessor {
    val builder = CfnAccessorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAccessorProps(block: CfnAccessorPropsDsl.() -> Unit = {}): CfnAccessorProps {
    val builder = CfnAccessorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMember(
    scope: Construct,
    id: String,
    block: CfnMemberDsl.() -> Unit = {},
  ): CfnMember {
    val builder = CfnMemberDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMemberApprovalThresholdPolicyProperty(block: CfnMemberApprovalThresholdPolicyPropertyDsl.() -> Unit
      = {}): CfnMember.ApprovalThresholdPolicyProperty {
    val builder = CfnMemberApprovalThresholdPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMemberMemberConfigurationProperty(block: CfnMemberMemberConfigurationPropertyDsl.() -> Unit
      = {}): CfnMember.MemberConfigurationProperty {
    val builder = CfnMemberMemberConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMemberMemberFabricConfigurationProperty(block: CfnMemberMemberFabricConfigurationPropertyDsl.() -> Unit
      = {}): CfnMember.MemberFabricConfigurationProperty {
    val builder = CfnMemberMemberFabricConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMemberMemberFrameworkConfigurationProperty(block: CfnMemberMemberFrameworkConfigurationPropertyDsl.() -> Unit
      = {}): CfnMember.MemberFrameworkConfigurationProperty {
    val builder = CfnMemberMemberFrameworkConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMemberNetworkConfigurationProperty(block: CfnMemberNetworkConfigurationPropertyDsl.() -> Unit
      = {}): CfnMember.NetworkConfigurationProperty {
    val builder = CfnMemberNetworkConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMemberNetworkFabricConfigurationProperty(block: CfnMemberNetworkFabricConfigurationPropertyDsl.() -> Unit
      = {}): CfnMember.NetworkFabricConfigurationProperty {
    val builder = CfnMemberNetworkFabricConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMemberNetworkFrameworkConfigurationProperty(block: CfnMemberNetworkFrameworkConfigurationPropertyDsl.() -> Unit
      = {}): CfnMember.NetworkFrameworkConfigurationProperty {
    val builder = CfnMemberNetworkFrameworkConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMemberProps(block: CfnMemberPropsDsl.() -> Unit = {}): CfnMemberProps {
    val builder = CfnMemberPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMemberVotingPolicyProperty(block: CfnMemberVotingPolicyPropertyDsl.() -> Unit
      = {}): CfnMember.VotingPolicyProperty {
    val builder = CfnMemberVotingPolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNode(
    scope: Construct,
    id: String,
    block: CfnNodeDsl.() -> Unit = {},
  ): CfnNode {
    val builder = CfnNodeDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnNodeNodeConfigurationProperty(block: CfnNodeNodeConfigurationPropertyDsl.() -> Unit =
      {}): CfnNode.NodeConfigurationProperty {
    val builder = CfnNodeNodeConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnNodeProps(block: CfnNodePropsDsl.() -> Unit = {}): CfnNodeProps {
    val builder = CfnNodePropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
