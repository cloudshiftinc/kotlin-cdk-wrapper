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

import kotlin.Unit
import software.amazon.awscdk.services.managedblockchain.CfnMember
import software.amazon.awscdk.services.managedblockchain.CfnNode

/** Configuration properties of the member. */
public inline fun CfnMember.setMemberConfiguration(
    block: CfnMemberMemberConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMemberMemberConfigurationPropertyDsl()
    builder.apply(block)
    return setMemberConfiguration(builder.build())
}

/** Configuration properties of the network to which the member belongs. */
public inline fun CfnMember.setNetworkConfiguration(
    block: CfnMemberNetworkConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMemberNetworkConfigurationPropertyDsl()
    builder.apply(block)
    return setNetworkConfiguration(builder.build())
}

/** Configuration properties of a peer node. */
public inline fun CfnNode.setNodeConfiguration(
    block: CfnNodeNodeConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnNodeNodeConfigurationPropertyDsl()
    builder.apply(block)
    return setNodeConfiguration(builder.build())
}
