@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cassandra

import software.amazon.awscdk.services.cassandra.CfnKeyspace
import software.amazon.awscdk.services.cassandra.CfnKeyspaceProps
import software.amazon.awscdk.services.cassandra.CfnTable
import software.amazon.awscdk.services.cassandra.CfnTableProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object cassandra {
    public inline fun cfnKeyspace(
        scope: Construct,
        id: String,
        block: CfnKeyspaceDsl.() -> Unit = {},
    ): CfnKeyspace {
        val builder = CfnKeyspaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnKeyspaceProps(block: CfnKeyspacePropsDsl.() -> Unit = {}): CfnKeyspaceProps {
        val builder = CfnKeyspacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnKeyspaceReplicationSpecificationProperty(
        block: CfnKeyspaceReplicationSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnKeyspace.ReplicationSpecificationProperty {
        val builder = CfnKeyspaceReplicationSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTable(
        scope: Construct,
        id: String,
        block: CfnTableDsl.() -> Unit = {},
    ): CfnTable {
        val builder = CfnTableDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableBillingModeProperty(
        block: CfnTableBillingModePropertyDsl.() -> Unit =
            {},
    ): CfnTable.BillingModeProperty {
        val builder = CfnTableBillingModePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableClusteringKeyColumnProperty(
        block: CfnTableClusteringKeyColumnPropertyDsl.() -> Unit =
            {},
    ): CfnTable.ClusteringKeyColumnProperty {
        val builder = CfnTableClusteringKeyColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableColumnProperty(block: CfnTableColumnPropertyDsl.() -> Unit = {}): CfnTable.ColumnProperty {
        val builder = CfnTableColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableEncryptionSpecificationProperty(
        block: CfnTableEncryptionSpecificationPropertyDsl.() -> Unit =
            {},
    ): CfnTable.EncryptionSpecificationProperty {
        val builder = CfnTableEncryptionSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableProps(block: CfnTablePropsDsl.() -> Unit = {}): CfnTableProps {
        val builder = CfnTablePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTableProvisionedThroughputProperty(
        block: CfnTableProvisionedThroughputPropertyDsl.() -> Unit =
            {},
    ): CfnTable.ProvisionedThroughputProperty {
        val builder = CfnTableProvisionedThroughputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
