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

package io.cloudshiftdev.awscdkdsl.services.cassandra

import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnKeyspace
import software.amazon.awscdk.services.cassandra.CfnTable

/**
 * Specifies the `ReplicationStrategy` of a keyspace.
 *
 * The options are:.
 */
public inline fun CfnKeyspace.setReplicationSpecification(
    block: CfnKeyspaceReplicationSpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnKeyspaceReplicationSpecificationPropertyDsl()
    builder.apply(block)
    return setReplicationSpecification(builder.build())
}

/** The optional auto scaling capacity settings for a table in provisioned capacity mode. */
public inline fun CfnTable.setAutoScalingSpecifications(
    block: CfnTableAutoScalingSpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTableAutoScalingSpecificationPropertyDsl()
    builder.apply(block)
    return setAutoScalingSpecifications(builder.build())
}

/** The billing mode for the table, which determines how you'll be charged for reads and writes:. */
public inline fun CfnTable.setBillingMode(block: CfnTableBillingModePropertyDsl.() -> Unit = {}) {
    val builder = CfnTableBillingModePropertyDsl()
    builder.apply(block)
    return setBillingMode(builder.build())
}

/** The encryption at rest options for the table. */
public inline fun CfnTable.setEncryptionSpecification(
    block: CfnTableEncryptionSpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTableEncryptionSpecificationPropertyDsl()
    builder.apply(block)
    return setEncryptionSpecification(builder.build())
}
