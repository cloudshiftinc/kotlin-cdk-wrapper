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
     * in Amazon Keyspaces .
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
     * .autoScalingSpecifications(AutoScalingSpecificationProperty.builder()
     * .readCapacityAutoScaling(AutoScalingSettingProperty.builder()
     * .autoScalingDisabled(false)
     * .maximumUnits(123)
     * .minimumUnits(123)
     * .scalingPolicy(ScalingPolicyProperty.builder()
     * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .disableScaleIn(false)
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build())
     * .build())
     * .build())
     * .writeCapacityAutoScaling(AutoScalingSettingProperty.builder()
     * .autoScalingDisabled(false)
     * .maximumUnits(123)
     * .minimumUnits(123)
     * .scalingPolicy(ScalingPolicyProperty.builder()
     * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .disableScaleIn(false)
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build())
     * .build())
     * .build())
     * .build())
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
     * .replicaSpecifications(List.of(ReplicaSpecificationProperty.builder()
     * .region("region")
     * // the properties below are optional
     * .readCapacityAutoScaling(AutoScalingSettingProperty.builder()
     * .autoScalingDisabled(false)
     * .maximumUnits(123)
     * .minimumUnits(123)
     * .scalingPolicy(ScalingPolicyProperty.builder()
     * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .disableScaleIn(false)
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build())
     * .build())
     * .build())
     * .readCapacityUnits(123)
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
     * The optional auto scaling settings for a table with provisioned throughput capacity.
     *
     * To turn on auto scaling for a table in `throughputMode:PROVISIONED` , you must specify the
     * following parameters.
     *
     * Configure the minimum and maximum capacity units. The auto scaling policy ensures that
     * capacity never goes below the minimum or above the maximum range.
     * * `minimumUnits` : The minimum level of throughput the table should always be ready to
     *   support. The value must be between 1 and the max throughput per second quota for your
     *   account (40,000 by default).
     * * `maximumUnits` : The maximum level of throughput the table should always be ready to
     *   support. The value must be between 1 and the max throughput per second quota for your
     *   account (40,000 by default).
     * * `scalingPolicy` : Amazon Keyspaces supports the `target tracking` scaling policy. The auto
     *   scaling target is a percentage of the provisioned capacity of the table.
     *
     * For more information, see
     * [Managing throughput capacity automatically with Amazon Keyspaces auto scaling](https://docs.aws.amazon.com/keyspaces/latest/devguide/autoscaling.html)
     * in the *Amazon Keyspaces Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cassandra.*;
     * AutoScalingSettingProperty autoScalingSettingProperty = AutoScalingSettingProperty.builder()
     * .autoScalingDisabled(false)
     * .maximumUnits(123)
     * .minimumUnits(123)
     * .scalingPolicy(ScalingPolicyProperty.builder()
     * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .disableScaleIn(false)
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingsetting.html)
     */
    public inline fun cfnTableAutoScalingSettingProperty(
        block: CfnTableAutoScalingSettingPropertyDsl.() -> Unit = {}
    ): CfnTable.AutoScalingSettingProperty {
        val builder = CfnTableAutoScalingSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The optional auto scaling capacity settings for a table in provisioned capacity mode.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cassandra.*;
     * AutoScalingSpecificationProperty autoScalingSpecificationProperty =
     * AutoScalingSpecificationProperty.builder()
     * .readCapacityAutoScaling(AutoScalingSettingProperty.builder()
     * .autoScalingDisabled(false)
     * .maximumUnits(123)
     * .minimumUnits(123)
     * .scalingPolicy(ScalingPolicyProperty.builder()
     * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .disableScaleIn(false)
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build())
     * .build())
     * .build())
     * .writeCapacityAutoScaling(AutoScalingSettingProperty.builder()
     * .autoScalingDisabled(false)
     * .maximumUnits(123)
     * .minimumUnits(123)
     * .scalingPolicy(ScalingPolicyProperty.builder()
     * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .disableScaleIn(false)
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build())
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingspecification.html)
     */
    public inline fun cfnTableAutoScalingSpecificationProperty(
        block: CfnTableAutoScalingSpecificationPropertyDsl.() -> Unit = {}
    ): CfnTable.AutoScalingSpecificationProperty {
        val builder = CfnTableAutoScalingSpecificationPropertyDsl()
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
     * In addition to the data type, you can also use the following two keywords:
     * * `STATIC` if the table has a clustering column. Static columns store values that are shared
     *   by all rows in the same partition.
     * * `FROZEN` for collection data types. In frozen collections the values of the collection are
     *   serialized into a single immutable value, and Amazon Keyspaces treats them like a `BLOB` .
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
     * .autoScalingSpecifications(AutoScalingSpecificationProperty.builder()
     * .readCapacityAutoScaling(AutoScalingSettingProperty.builder()
     * .autoScalingDisabled(false)
     * .maximumUnits(123)
     * .minimumUnits(123)
     * .scalingPolicy(ScalingPolicyProperty.builder()
     * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .disableScaleIn(false)
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build())
     * .build())
     * .build())
     * .writeCapacityAutoScaling(AutoScalingSettingProperty.builder()
     * .autoScalingDisabled(false)
     * .maximumUnits(123)
     * .minimumUnits(123)
     * .scalingPolicy(ScalingPolicyProperty.builder()
     * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .disableScaleIn(false)
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build())
     * .build())
     * .build())
     * .build())
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
     * .replicaSpecifications(List.of(ReplicaSpecificationProperty.builder()
     * .region("region")
     * // the properties below are optional
     * .readCapacityAutoScaling(AutoScalingSettingProperty.builder()
     * .autoScalingDisabled(false)
     * .maximumUnits(123)
     * .minimumUnits(123)
     * .scalingPolicy(ScalingPolicyProperty.builder()
     * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .disableScaleIn(false)
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build())
     * .build())
     * .build())
     * .readCapacityUnits(123)
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

    /**
     * The AWS Region specific settings of a multi-Region table.
     *
     * For a multi-Region table, you can configure the table's read capacity differently per AWS
     * Region. You can do this by configuring the following parameters.
     * * `region` : The Region where these settings are applied. (Required)
     * * `readCapacityUnits` : The provisioned read capacity units. (Optional)
     * * `readCapacityAutoScaling` : The read capacity auto scaling settings for the table.
     *   (Optional)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cassandra.*;
     * ReplicaSpecificationProperty replicaSpecificationProperty =
     * ReplicaSpecificationProperty.builder()
     * .region("region")
     * // the properties below are optional
     * .readCapacityAutoScaling(AutoScalingSettingProperty.builder()
     * .autoScalingDisabled(false)
     * .maximumUnits(123)
     * .minimumUnits(123)
     * .scalingPolicy(ScalingPolicyProperty.builder()
     * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .disableScaleIn(false)
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build())
     * .build())
     * .build())
     * .readCapacityUnits(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-replicaspecification.html)
     */
    public inline fun cfnTableReplicaSpecificationProperty(
        block: CfnTableReplicaSpecificationPropertyDsl.() -> Unit = {}
    ): CfnTable.ReplicaSpecificationProperty {
        val builder = CfnTableReplicaSpecificationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Amazon Keyspaces supports the `target tracking` auto scaling policy.
     *
     * With this policy, Amazon Keyspaces auto scaling ensures that the table's ratio of consumed to
     * provisioned capacity stays at or near the target value that you specify. You define the
     * target value as a percentage between 20 and 90.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cassandra.*;
     * ScalingPolicyProperty scalingPolicyProperty = ScalingPolicyProperty.builder()
     * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .disableScaleIn(false)
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-scalingpolicy.html)
     */
    public inline fun cfnTableScalingPolicyProperty(
        block: CfnTableScalingPolicyPropertyDsl.() -> Unit = {}
    ): CfnTable.ScalingPolicyProperty {
        val builder = CfnTableScalingPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Amazon Keyspaces supports the `target tracking` auto scaling policy for a provisioned table.
     *
     * This policy scales a table based on the ratio of consumed to provisioned capacity. The auto
     * scaling target is a percentage of the provisioned capacity of the table.
     * * `targetTrackingScalingPolicyConfiguration` : To define the target tracking policy, you must
     *   define the target value.
     * * `targetValue` : The target utilization rate of the table. Amazon Keyspaces auto scaling
     *   ensures that the ratio of consumed capacity to provisioned capacity stays at or near this
     *   value. You define `targetValue` as a percentage. A `double` between 20 and 90. (Required)
     * * `disableScaleIn` : A `boolean` that specifies if `scale-in` is disabled or enabled for the
     *   table. This parameter is disabled by default. To turn on `scale-in` , set the `boolean`
     *   value to `FALSE` . This means that capacity for a table can be automatically scaled down on
     *   your behalf. (Optional)
     * * `scaleInCooldown` : A cooldown period in seconds between scaling activities that lets the
     *   table stabilize before another scale in activity starts. If no value is provided, the
     *   default is
     * 0. (Optional)
     * * `scaleOutCooldown` : A cooldown period in seconds between scaling activities that lets the
     *   table stabilize before another scale out activity starts. If no value is provided, the
     *   default is
     * 0. (Optional)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cassandra.*;
     * TargetTrackingScalingPolicyConfigurationProperty
     * targetTrackingScalingPolicyConfigurationProperty =
     * TargetTrackingScalingPolicyConfigurationProperty.builder()
     * .targetValue(123)
     * // the properties below are optional
     * .disableScaleIn(false)
     * .scaleInCooldown(123)
     * .scaleOutCooldown(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-targettrackingscalingpolicyconfiguration.html)
     */
    public inline fun cfnTableTargetTrackingScalingPolicyConfigurationProperty(
        block: CfnTableTargetTrackingScalingPolicyConfigurationPropertyDsl.() -> Unit = {}
    ): CfnTable.TargetTrackingScalingPolicyConfigurationProperty {
        val builder = CfnTableTargetTrackingScalingPolicyConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
