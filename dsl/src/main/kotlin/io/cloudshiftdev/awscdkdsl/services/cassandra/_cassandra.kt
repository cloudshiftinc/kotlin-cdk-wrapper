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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnKeyspace
import software.amazon.awscdk.services.cassandra.CfnKeyspaceProps
import software.amazon.awscdk.services.cassandra.CfnTable
import software.amazon.awscdk.services.cassandra.CfnTableProps
import software.constructs.Construct

public object cassandra {
    /**
     * You can use the `AWS::Cassandra::Keyspace` resource to create a new keyspace in Amazon
     * Keyspaces (for Apache Cassandra).
     *
     * For more information, see
     * [Create a keyspace and a table](https://docs.aws.amazon.com/keyspaces/latest/devguide/getting-started.ddl.html)
     * in the *Amazon Keyspaces Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cassandra.*;
     * CfnKeyspace cfnKeyspace = CfnKeyspace.Builder.create(this, "MyCfnKeyspace")
     * .keyspaceName("keyspaceName")
     * .replicationSpecification(ReplicationSpecificationProperty.builder()
     * .regionList(List.of("regionList"))
     * .replicationStrategy("replicationStrategy")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html)
     */
    public inline fun cfnKeyspace(
        scope: Construct,
        id: String,
        block: CfnKeyspaceDsl.() -> Unit = {},
    ): CfnKeyspace {
        val builder = CfnKeyspaceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnKeyspace`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cassandra.*;
     * CfnKeyspaceProps cfnKeyspaceProps = CfnKeyspaceProps.builder()
     * .keyspaceName("keyspaceName")
     * .replicationSpecification(ReplicationSpecificationProperty.builder()
     * .regionList(List.of("regionList"))
     * .replicationStrategy("replicationStrategy")
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-keyspace.html)
     */
    public inline fun cfnKeyspaceProps(
        block: CfnKeyspacePropsDsl.() -> Unit = {}
    ): CfnKeyspaceProps {
        val builder = CfnKeyspacePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * You can use `ReplicationSpecification` to configure the `ReplicationStrategy` of a keyspace
     * in Amazon Keyspaces.
     *
     * The `ReplicationSpecification` property is `CreateOnly` and cannot be changed after the
     * keyspace has been created. This property applies automatically to all tables in the keyspace.
     *
     * For more information, see
     * [Multi-Region Replication](https://docs.aws.amazon.com/keyspaces/latest/devguide/multiRegion-replication.html)
     * in the *Amazon Keyspaces Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cassandra.*;
     * ReplicationSpecificationProperty replicationSpecificationProperty =
     * ReplicationSpecificationProperty.builder()
     * .regionList(List.of("regionList"))
     * .replicationStrategy("replicationStrategy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-keyspace-replicationspecification.html)
     */
    public inline fun cfnKeyspaceReplicationSpecificationProperty(
        block: CfnKeyspaceReplicationSpecificationPropertyDsl.() -> Unit = {}
    ): CfnKeyspace.ReplicationSpecificationProperty {
        val builder = CfnKeyspaceReplicationSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * You can use the `AWS::Cassandra::Table` resource to create a new table in Amazon Keyspaces
     * (for Apache Cassandra).
     *
     * For more information, see
     * [Create a keyspace and a table](https://docs.aws.amazon.com/keyspaces/latest/devguide/getting-started.ddl.html)
     * in the *Amazon Keyspaces Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cassandra.*;
     * CfnTable cfnTable = CfnTable.Builder.create(this, "MyCfnTable")
     * .keyspaceName("keyspaceName")
     * .partitionKeyColumns(List.of(ColumnProperty.builder()
     * .columnName("columnName")
     * .columnType("columnType")
     * .build()))
     * // the properties below are optional
     * .billingMode(BillingModeProperty.builder()
     * .mode("mode")
     * // the properties below are optional
     * .provisionedThroughput(ProvisionedThroughputProperty.builder()
     * .readCapacityUnits(123)
     * .writeCapacityUnits(123)
     * .build())
     * .build())
     * .clientSideTimestampsEnabled(false)
     * .clusteringKeyColumns(List.of(ClusteringKeyColumnProperty.builder()
     * .column(ColumnProperty.builder()
     * .columnName("columnName")
     * .columnType("columnType")
     * .build())
     * // the properties below are optional
     * .orderBy("orderBy")
     * .build()))
     * .defaultTimeToLive(123)
     * .encryptionSpecification(EncryptionSpecificationProperty.builder()
     * .encryptionType("encryptionType")
     * // the properties below are optional
     * .kmsKeyIdentifier("kmsKeyIdentifier")
     * .build())
     * .pointInTimeRecoveryEnabled(false)
     * .regularColumns(List.of(ColumnProperty.builder()
     * .columnName("columnName")
     * .columnType("columnType")
     * .build()))
     * .tableName("tableName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html)
     */
    public inline fun cfnTable(
        scope: Construct,
        id: String,
        block: CfnTableDsl.() -> Unit = {},
    ): CfnTable {
        val builder = CfnTableDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Determines the billing mode for the table - on-demand or provisioned.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cassandra.*;
     * BillingModeProperty billingModeProperty = BillingModeProperty.builder()
     * .mode("mode")
     * // the properties below are optional
     * .provisionedThroughput(ProvisionedThroughputProperty.builder()
     * .readCapacityUnits(123)
     * .writeCapacityUnits(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-billingmode.html)
     */
    public inline fun cfnTableBillingModeProperty(
        block: CfnTableBillingModePropertyDsl.() -> Unit = {}
    ): CfnTable.BillingModeProperty {
        val builder = CfnTableBillingModePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines an individual column within the clustering key.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cassandra.*;
     * ClusteringKeyColumnProperty clusteringKeyColumnProperty = ClusteringKeyColumnProperty.builder()
     * .column(ColumnProperty.builder()
     * .columnName("columnName")
     * .columnType("columnType")
     * .build())
     * // the properties below are optional
     * .orderBy("orderBy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-clusteringkeycolumn.html)
     */
    public inline fun cfnTableClusteringKeyColumnProperty(
        block: CfnTableClusteringKeyColumnPropertyDsl.() -> Unit = {}
    ): CfnTable.ClusteringKeyColumnProperty {
        val builder = CfnTableClusteringKeyColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The name and data type of an individual column in a table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cassandra.*;
     * ColumnProperty columnProperty = ColumnProperty.builder()
     * .columnName("columnName")
     * .columnType("columnType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html)
     */
    public inline fun cfnTableColumnProperty(
        block: CfnTableColumnPropertyDsl.() -> Unit = {}
    ): CfnTable.ColumnProperty {
        val builder = CfnTableColumnPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the encryption at rest option selected for the table.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cassandra.*;
     * EncryptionSpecificationProperty encryptionSpecificationProperty =
     * EncryptionSpecificationProperty.builder()
     * .encryptionType("encryptionType")
     * // the properties below are optional
     * .kmsKeyIdentifier("kmsKeyIdentifier")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-encryptionspecification.html)
     */
    public inline fun cfnTableEncryptionSpecificationProperty(
        block: CfnTableEncryptionSpecificationPropertyDsl.() -> Unit = {}
    ): CfnTable.EncryptionSpecificationProperty {
        val builder = CfnTableEncryptionSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTable`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cassandra.*;
     * CfnTableProps cfnTableProps = CfnTableProps.builder()
     * .keyspaceName("keyspaceName")
     * .partitionKeyColumns(List.of(ColumnProperty.builder()
     * .columnName("columnName")
     * .columnType("columnType")
     * .build()))
     * // the properties below are optional
     * .billingMode(BillingModeProperty.builder()
     * .mode("mode")
     * // the properties below are optional
     * .provisionedThroughput(ProvisionedThroughputProperty.builder()
     * .readCapacityUnits(123)
     * .writeCapacityUnits(123)
     * .build())
     * .build())
     * .clientSideTimestampsEnabled(false)
     * .clusteringKeyColumns(List.of(ClusteringKeyColumnProperty.builder()
     * .column(ColumnProperty.builder()
     * .columnName("columnName")
     * .columnType("columnType")
     * .build())
     * // the properties below are optional
     * .orderBy("orderBy")
     * .build()))
     * .defaultTimeToLive(123)
     * .encryptionSpecification(EncryptionSpecificationProperty.builder()
     * .encryptionType("encryptionType")
     * // the properties below are optional
     * .kmsKeyIdentifier("kmsKeyIdentifier")
     * .build())
     * .pointInTimeRecoveryEnabled(false)
     * .regularColumns(List.of(ColumnProperty.builder()
     * .columnName("columnName")
     * .columnType("columnType")
     * .build()))
     * .tableName("tableName")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html)
     */
    public inline fun cfnTableProps(block: CfnTablePropsDsl.() -> Unit = {}): CfnTableProps {
        val builder = CfnTablePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The provisioned throughput for the table, which consists of `ReadCapacityUnits` and
     * `WriteCapacityUnits` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cassandra.*;
     * ProvisionedThroughputProperty provisionedThroughputProperty =
     * ProvisionedThroughputProperty.builder()
     * .readCapacityUnits(123)
     * .writeCapacityUnits(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-provisionedthroughput.html)
     */
    public inline fun cfnTableProvisionedThroughputProperty(
        block: CfnTableProvisionedThroughputPropertyDsl.() -> Unit = {}
    ): CfnTable.ProvisionedThroughputProperty {
        val builder = CfnTableProvisionedThroughputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
