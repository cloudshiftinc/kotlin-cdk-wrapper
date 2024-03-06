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

package io.cloudshiftdev.awscdkdsl.services.managedblockchain

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
    /**
     * Creates a new accessor for use with Amazon Managed Blockchain service that supports token
     * based access.
     *
     * The accessor contains information required for token based access.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.managedblockchain.*;
     * CfnAccessor cfnAccessor = CfnAccessor.Builder.create(this, "MyCfnAccessor")
     * .accessorType("accessorType")
     * // the properties below are optional
     * .networkType("networkType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html)
     */
    public inline fun cfnAccessor(
        scope: Construct,
        id: String,
        block: CfnAccessorDsl.() -> Unit = {},
    ): CfnAccessor {
        val builder = CfnAccessorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAccessor`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.managedblockchain.*;
     * CfnAccessorProps cfnAccessorProps = CfnAccessorProps.builder()
     * .accessorType("accessorType")
     * // the properties below are optional
     * .networkType("networkType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-accessor.html)
     */
    public inline fun cfnAccessorProps(
        block: CfnAccessorPropsDsl.() -> Unit = {}
    ): CfnAccessorProps {
        val builder = CfnAccessorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a member within a Managed Blockchain network.
     *
     * Applies only to Hyperledger Fabric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.managedblockchain.*;
     * CfnMember cfnMember = CfnMember.Builder.create(this, "MyCfnMember")
     * .memberConfiguration(MemberConfigurationProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .memberFrameworkConfiguration(MemberFrameworkConfigurationProperty.builder()
     * .memberFabricConfiguration(MemberFabricConfigurationProperty.builder()
     * .adminPassword("adminPassword")
     * .adminUsername("adminUsername")
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .invitationId("invitationId")
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .framework("framework")
     * .frameworkVersion("frameworkVersion")
     * .name("name")
     * .votingPolicy(VotingPolicyProperty.builder()
     * .approvalThresholdPolicy(ApprovalThresholdPolicyProperty.builder()
     * .proposalDurationInHours(123)
     * .thresholdComparator("thresholdComparator")
     * .thresholdPercentage(123)
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .networkFrameworkConfiguration(NetworkFrameworkConfigurationProperty.builder()
     * .networkFabricConfiguration(NetworkFabricConfigurationProperty.builder()
     * .edition("edition")
     * .build())
     * .build())
     * .build())
     * .networkId("networkId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html)
     */
    public inline fun cfnMember(
        scope: Construct,
        id: String,
        block: CfnMemberDsl.() -> Unit = {},
    ): CfnMember {
        val builder = CfnMemberDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A policy type that defines the voting rules for the network.
     *
     * The rules decide if a proposal is approved. Approval may be based on criteria such as the
     * percentage of `YES` votes and the duration of the proposal. The policy applies to all
     * proposals and is specified when the network is created.
     *
     * Applies only to Hyperledger Fabric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.managedblockchain.*;
     * ApprovalThresholdPolicyProperty approvalThresholdPolicyProperty =
     * ApprovalThresholdPolicyProperty.builder()
     * .proposalDurationInHours(123)
     * .thresholdComparator("thresholdComparator")
     * .thresholdPercentage(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-approvalthresholdpolicy.html)
     */
    public inline fun cfnMemberApprovalThresholdPolicyProperty(
        block: CfnMemberApprovalThresholdPolicyPropertyDsl.() -> Unit = {}
    ): CfnMember.ApprovalThresholdPolicyProperty {
        val builder = CfnMemberApprovalThresholdPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration properties of the member.
     *
     * Applies only to Hyperledger Fabric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.managedblockchain.*;
     * MemberConfigurationProperty memberConfigurationProperty = MemberConfigurationProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .memberFrameworkConfiguration(MemberFrameworkConfigurationProperty.builder()
     * .memberFabricConfiguration(MemberFabricConfigurationProperty.builder()
     * .adminPassword("adminPassword")
     * .adminUsername("adminUsername")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberconfiguration.html)
     */
    public inline fun cfnMemberMemberConfigurationProperty(
        block: CfnMemberMemberConfigurationPropertyDsl.() -> Unit = {}
    ): CfnMember.MemberConfigurationProperty {
        val builder = CfnMemberMemberConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration properties for Hyperledger Fabric for a member in a Managed Blockchain network
     * that is using the Hyperledger Fabric framework.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.managedblockchain.*;
     * MemberFabricConfigurationProperty memberFabricConfigurationProperty =
     * MemberFabricConfigurationProperty.builder()
     * .adminPassword("adminPassword")
     * .adminUsername("adminUsername")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html)
     */
    public inline fun cfnMemberMemberFabricConfigurationProperty(
        block: CfnMemberMemberFabricConfigurationPropertyDsl.() -> Unit = {}
    ): CfnMember.MemberFabricConfigurationProperty {
        val builder = CfnMemberMemberFabricConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration properties relevant to a member for the blockchain framework that the Managed
     * Blockchain network uses.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.managedblockchain.*;
     * MemberFrameworkConfigurationProperty memberFrameworkConfigurationProperty =
     * MemberFrameworkConfigurationProperty.builder()
     * .memberFabricConfiguration(MemberFabricConfigurationProperty.builder()
     * .adminPassword("adminPassword")
     * .adminUsername("adminUsername")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberframeworkconfiguration.html)
     */
    public inline fun cfnMemberMemberFrameworkConfigurationProperty(
        block: CfnMemberMemberFrameworkConfigurationPropertyDsl.() -> Unit = {}
    ): CfnMember.MemberFrameworkConfigurationProperty {
        val builder = CfnMemberMemberFrameworkConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration properties of the network to which the member belongs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.managedblockchain.*;
     * NetworkConfigurationProperty networkConfigurationProperty =
     * NetworkConfigurationProperty.builder()
     * .framework("framework")
     * .frameworkVersion("frameworkVersion")
     * .name("name")
     * .votingPolicy(VotingPolicyProperty.builder()
     * .approvalThresholdPolicy(ApprovalThresholdPolicyProperty.builder()
     * .proposalDurationInHours(123)
     * .thresholdComparator("thresholdComparator")
     * .thresholdPercentage(123)
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .networkFrameworkConfiguration(NetworkFrameworkConfigurationProperty.builder()
     * .networkFabricConfiguration(NetworkFabricConfigurationProperty.builder()
     * .edition("edition")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkconfiguration.html)
     */
    public inline fun cfnMemberNetworkConfigurationProperty(
        block: CfnMemberNetworkConfigurationPropertyDsl.() -> Unit = {}
    ): CfnMember.NetworkConfigurationProperty {
        val builder = CfnMemberNetworkConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Hyperledger Fabric configuration properties for the network.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.managedblockchain.*;
     * NetworkFabricConfigurationProperty networkFabricConfigurationProperty =
     * NetworkFabricConfigurationProperty.builder()
     * .edition("edition")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkfabricconfiguration.html)
     */
    public inline fun cfnMemberNetworkFabricConfigurationProperty(
        block: CfnMemberNetworkFabricConfigurationPropertyDsl.() -> Unit = {}
    ): CfnMember.NetworkFabricConfigurationProperty {
        val builder = CfnMemberNetworkFabricConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration properties relevant to the network for the blockchain framework that the
     * network uses.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.managedblockchain.*;
     * NetworkFrameworkConfigurationProperty networkFrameworkConfigurationProperty =
     * NetworkFrameworkConfigurationProperty.builder()
     * .networkFabricConfiguration(NetworkFabricConfigurationProperty.builder()
     * .edition("edition")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-networkframeworkconfiguration.html)
     */
    public inline fun cfnMemberNetworkFrameworkConfigurationProperty(
        block: CfnMemberNetworkFrameworkConfigurationPropertyDsl.() -> Unit = {}
    ): CfnMember.NetworkFrameworkConfigurationProperty {
        val builder = CfnMemberNetworkFrameworkConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMember`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.managedblockchain.*;
     * CfnMemberProps cfnMemberProps = CfnMemberProps.builder()
     * .memberConfiguration(MemberConfigurationProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .memberFrameworkConfiguration(MemberFrameworkConfigurationProperty.builder()
     * .memberFabricConfiguration(MemberFabricConfigurationProperty.builder()
     * .adminPassword("adminPassword")
     * .adminUsername("adminUsername")
     * .build())
     * .build())
     * .build())
     * // the properties below are optional
     * .invitationId("invitationId")
     * .networkConfiguration(NetworkConfigurationProperty.builder()
     * .framework("framework")
     * .frameworkVersion("frameworkVersion")
     * .name("name")
     * .votingPolicy(VotingPolicyProperty.builder()
     * .approvalThresholdPolicy(ApprovalThresholdPolicyProperty.builder()
     * .proposalDurationInHours(123)
     * .thresholdComparator("thresholdComparator")
     * .thresholdPercentage(123)
     * .build())
     * .build())
     * // the properties below are optional
     * .description("description")
     * .networkFrameworkConfiguration(NetworkFrameworkConfigurationProperty.builder()
     * .networkFabricConfiguration(NetworkFabricConfigurationProperty.builder()
     * .edition("edition")
     * .build())
     * .build())
     * .build())
     * .networkId("networkId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-member.html)
     */
    public inline fun cfnMemberProps(block: CfnMemberPropsDsl.() -> Unit = {}): CfnMemberProps {
        val builder = CfnMemberPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The voting rules for the network to decide if a proposal is accepted.
     *
     * Applies only to Hyperledger Fabric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.managedblockchain.*;
     * VotingPolicyProperty votingPolicyProperty = VotingPolicyProperty.builder()
     * .approvalThresholdPolicy(ApprovalThresholdPolicyProperty.builder()
     * .proposalDurationInHours(123)
     * .thresholdComparator("thresholdComparator")
     * .thresholdPercentage(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-votingpolicy.html)
     */
    public inline fun cfnMemberVotingPolicyProperty(
        block: CfnMemberVotingPolicyPropertyDsl.() -> Unit = {}
    ): CfnMember.VotingPolicyProperty {
        val builder = CfnMemberVotingPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a node on the specified blockchain network.
     *
     * Applies to Hyperledger Fabric and Ethereum.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.managedblockchain.*;
     * CfnNode cfnNode = CfnNode.Builder.create(this, "MyCfnNode")
     * .networkId("networkId")
     * .nodeConfiguration(NodeConfigurationProperty.builder()
     * .availabilityZone("availabilityZone")
     * .instanceType("instanceType")
     * .build())
     * // the properties below are optional
     * .memberId("memberId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html)
     */
    public inline fun cfnNode(
        scope: Construct,
        id: String,
        block: CfnNodeDsl.() -> Unit = {},
    ): CfnNode {
        val builder = CfnNodeDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration properties of a peer node within a membership.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.managedblockchain.*;
     * NodeConfigurationProperty nodeConfigurationProperty = NodeConfigurationProperty.builder()
     * .availabilityZone("availabilityZone")
     * .instanceType("instanceType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-node-nodeconfiguration.html)
     */
    public inline fun cfnNodeNodeConfigurationProperty(
        block: CfnNodeNodeConfigurationPropertyDsl.() -> Unit = {}
    ): CfnNode.NodeConfigurationProperty {
        val builder = CfnNodeNodeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnNode`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.managedblockchain.*;
     * CfnNodeProps cfnNodeProps = CfnNodeProps.builder()
     * .networkId("networkId")
     * .nodeConfiguration(NodeConfigurationProperty.builder()
     * .availabilityZone("availabilityZone")
     * .instanceType("instanceType")
     * .build())
     * // the properties below are optional
     * .memberId("memberId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-managedblockchain-node.html)
     */
    public inline fun cfnNodeProps(block: CfnNodePropsDsl.() -> Unit = {}): CfnNodeProps {
        val builder = CfnNodePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
