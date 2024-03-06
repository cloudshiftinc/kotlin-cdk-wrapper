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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cassandra.CfnTable
import software.constructs.Construct

/**
 * You can use the `AWS::Cassandra::Table` resource to create a new table in Amazon Keyspaces (for
 * Apache Cassandra).
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
@CdkDslMarker
public class CfnTableDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTable.Builder = CfnTable.Builder.create(scope, id)

    private val _clusteringKeyColumns: MutableList<Any> = mutableListOf()

    private val _partitionKeyColumns: MutableList<Any> = mutableListOf()

    private val _regularColumns: MutableList<Any> = mutableListOf()

    private val _replicaSpecifications: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The optional auto scaling capacity settings for a table in provisioned capacity mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-autoscalingspecifications)
     *
     * @param autoScalingSpecifications The optional auto scaling capacity settings for a table in
     *   provisioned capacity mode.
     */
    public fun autoScalingSpecifications(autoScalingSpecifications: IResolvable) {
        cdkBuilder.autoScalingSpecifications(autoScalingSpecifications)
    }

    /**
     * The optional auto scaling capacity settings for a table in provisioned capacity mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-autoscalingspecifications)
     *
     * @param autoScalingSpecifications The optional auto scaling capacity settings for a table in
     *   provisioned capacity mode.
     */
    public fun autoScalingSpecifications(
        autoScalingSpecifications: CfnTable.AutoScalingSpecificationProperty
    ) {
        cdkBuilder.autoScalingSpecifications(autoScalingSpecifications)
    }

    /**
     * The billing mode for the table, which determines how you'll be charged for reads and writes:.
     * * *On-demand mode* (default) - You pay based on the actual reads and writes your application
     *   performs.
     * * *Provisioned mode* - Lets you specify the number of reads and writes per second that you
     *   need for your application.
     *
     * If you don't specify a value for this property, then the table will use on-demand mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-billingmode)
     *
     * @param billingMode The billing mode for the table, which determines how you'll be charged for
     *   reads and writes:.
     */
    public fun billingMode(billingMode: IResolvable) {
        cdkBuilder.billingMode(billingMode)
    }

    /**
     * The billing mode for the table, which determines how you'll be charged for reads and writes:.
     * * *On-demand mode* (default) - You pay based on the actual reads and writes your application
     *   performs.
     * * *Provisioned mode* - Lets you specify the number of reads and writes per second that you
     *   need for your application.
     *
     * If you don't specify a value for this property, then the table will use on-demand mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-billingmode)
     *
     * @param billingMode The billing mode for the table, which determines how you'll be charged for
     *   reads and writes:.
     */
    public fun billingMode(billingMode: CfnTable.BillingModeProperty) {
        cdkBuilder.billingMode(billingMode)
    }

    /**
     * Enables client-side timestamps for the table.
     *
     * By default, the setting is disabled. You can enable client-side timestamps with the following
     * option:
     * * `status: "enabled"`
     *
     * After client-side timestamps are enabled for a table, you can't disable this setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clientsidetimestampsenabled)
     *
     * @param clientSideTimestampsEnabled Enables client-side timestamps for the table.
     */
    public fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: Boolean) {
        cdkBuilder.clientSideTimestampsEnabled(clientSideTimestampsEnabled)
    }

    /**
     * Enables client-side timestamps for the table.
     *
     * By default, the setting is disabled. You can enable client-side timestamps with the following
     * option:
     * * `status: "enabled"`
     *
     * After client-side timestamps are enabled for a table, you can't disable this setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clientsidetimestampsenabled)
     *
     * @param clientSideTimestampsEnabled Enables client-side timestamps for the table.
     */
    public fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: IResolvable) {
        cdkBuilder.clientSideTimestampsEnabled(clientSideTimestampsEnabled)
    }

    /**
     * One or more columns that determine how the table data is sorted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clusteringkeycolumns)
     *
     * @param clusteringKeyColumns One or more columns that determine how the table data is sorted.
     */
    public fun clusteringKeyColumns(vararg clusteringKeyColumns: Any) {
        _clusteringKeyColumns.addAll(listOf(*clusteringKeyColumns))
    }

    /**
     * One or more columns that determine how the table data is sorted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clusteringkeycolumns)
     *
     * @param clusteringKeyColumns One or more columns that determine how the table data is sorted.
     */
    public fun clusteringKeyColumns(clusteringKeyColumns: Collection<Any>) {
        _clusteringKeyColumns.addAll(clusteringKeyColumns)
    }

    /**
     * One or more columns that determine how the table data is sorted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clusteringkeycolumns)
     *
     * @param clusteringKeyColumns One or more columns that determine how the table data is sorted.
     */
    public fun clusteringKeyColumns(clusteringKeyColumns: IResolvable) {
        cdkBuilder.clusteringKeyColumns(clusteringKeyColumns)
    }

    /**
     * The default Time To Live (TTL) value for all rows in a table in seconds.
     *
     * The maximum configurable value is 630,720,000 seconds, which is the equivalent of 20 years.
     * By default, the TTL value for a table is 0, which means data does not expire.
     *
     * For more information, see
     * [Setting the default TTL value for a table](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl)
     * in the *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-defaulttimetolive)
     *
     * @param defaultTimeToLive The default Time To Live (TTL) value for all rows in a table in
     *   seconds.
     */
    public fun defaultTimeToLive(defaultTimeToLive: Number) {
        cdkBuilder.defaultTimeToLive(defaultTimeToLive)
    }

    /**
     * The encryption at rest options for the table.
     * * *AWS owned key* (default) - The key is owned by Amazon Keyspaces .
     * * *Customer managed key* - The key is stored in your account and is created, owned, and
     *   managed by you.
     *
     * If you choose encryption with a customer managed key, you must specify a valid customer
     * managed KMS key with permissions granted to Amazon Keyspaces.
     *
     * For more information, see
     * [Encryption at rest in Amazon Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html)
     * in the *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-encryptionspecification)
     *
     * @param encryptionSpecification The encryption at rest options for the table.
     */
    public fun encryptionSpecification(encryptionSpecification: IResolvable) {
        cdkBuilder.encryptionSpecification(encryptionSpecification)
    }

    /**
     * The encryption at rest options for the table.
     * * *AWS owned key* (default) - The key is owned by Amazon Keyspaces .
     * * *Customer managed key* - The key is stored in your account and is created, owned, and
     *   managed by you.
     *
     * If you choose encryption with a customer managed key, you must specify a valid customer
     * managed KMS key with permissions granted to Amazon Keyspaces.
     *
     * For more information, see
     * [Encryption at rest in Amazon Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html)
     * in the *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-encryptionspecification)
     *
     * @param encryptionSpecification The encryption at rest options for the table.
     */
    public fun encryptionSpecification(
        encryptionSpecification: CfnTable.EncryptionSpecificationProperty
    ) {
        cdkBuilder.encryptionSpecification(encryptionSpecification)
    }

    /**
     * The name of the keyspace to create the table in.
     *
     * The keyspace must already exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-keyspacename)
     *
     * @param keyspaceName The name of the keyspace to create the table in.
     */
    public fun keyspaceName(keyspaceName: String) {
        cdkBuilder.keyspaceName(keyspaceName)
    }

    /**
     * One or more columns that uniquely identify every row in the table.
     *
     * Every table must have a partition key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-partitionkeycolumns)
     *
     * @param partitionKeyColumns One or more columns that uniquely identify every row in the table.
     */
    public fun partitionKeyColumns(vararg partitionKeyColumns: Any) {
        _partitionKeyColumns.addAll(listOf(*partitionKeyColumns))
    }

    /**
     * One or more columns that uniquely identify every row in the table.
     *
     * Every table must have a partition key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-partitionkeycolumns)
     *
     * @param partitionKeyColumns One or more columns that uniquely identify every row in the table.
     */
    public fun partitionKeyColumns(partitionKeyColumns: Collection<Any>) {
        _partitionKeyColumns.addAll(partitionKeyColumns)
    }

    /**
     * One or more columns that uniquely identify every row in the table.
     *
     * Every table must have a partition key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-partitionkeycolumns)
     *
     * @param partitionKeyColumns One or more columns that uniquely identify every row in the table.
     */
    public fun partitionKeyColumns(partitionKeyColumns: IResolvable) {
        cdkBuilder.partitionKeyColumns(partitionKeyColumns)
    }

    /**
     * Specifies if point-in-time recovery is enabled or disabled for the table.
     *
     * The options are `PointInTimeRecoveryEnabled=true` and `PointInTimeRecoveryEnabled=false` . If
     * not specified, the default is `PointInTimeRecoveryEnabled=false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-pointintimerecoveryenabled)
     *
     * @param pointInTimeRecoveryEnabled Specifies if point-in-time recovery is enabled or disabled
     *   for the table.
     */
    public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean) {
        cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
    }

    /**
     * Specifies if point-in-time recovery is enabled or disabled for the table.
     *
     * The options are `PointInTimeRecoveryEnabled=true` and `PointInTimeRecoveryEnabled=false` . If
     * not specified, the default is `PointInTimeRecoveryEnabled=false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-pointintimerecoveryenabled)
     *
     * @param pointInTimeRecoveryEnabled Specifies if point-in-time recovery is enabled or disabled
     *   for the table.
     */
    public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable) {
        cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
    }

    /**
     * One or more columns that are not part of the primary key - that is, columns that are *not*
     * defined as partition key columns or clustering key columns.
     *
     * You can add regular columns to existing tables by adding them to the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-regularcolumns)
     *
     * @param regularColumns One or more columns that are not part of the primary key - that is,
     *   columns that are *not* defined as partition key columns or clustering key columns.
     */
    public fun regularColumns(vararg regularColumns: Any) {
        _regularColumns.addAll(listOf(*regularColumns))
    }

    /**
     * One or more columns that are not part of the primary key - that is, columns that are *not*
     * defined as partition key columns or clustering key columns.
     *
     * You can add regular columns to existing tables by adding them to the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-regularcolumns)
     *
     * @param regularColumns One or more columns that are not part of the primary key - that is,
     *   columns that are *not* defined as partition key columns or clustering key columns.
     */
    public fun regularColumns(regularColumns: Collection<Any>) {
        _regularColumns.addAll(regularColumns)
    }

    /**
     * One or more columns that are not part of the primary key - that is, columns that are *not*
     * defined as partition key columns or clustering key columns.
     *
     * You can add regular columns to existing tables by adding them to the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-regularcolumns)
     *
     * @param regularColumns One or more columns that are not part of the primary key - that is,
     *   columns that are *not* defined as partition key columns or clustering key columns.
     */
    public fun regularColumns(regularColumns: IResolvable) {
        cdkBuilder.regularColumns(regularColumns)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-replicaspecifications)
     *
     * @param replicaSpecifications The AWS Region specific settings of a multi-Region table.
     */
    public fun replicaSpecifications(vararg replicaSpecifications: Any) {
        _replicaSpecifications.addAll(listOf(*replicaSpecifications))
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-replicaspecifications)
     *
     * @param replicaSpecifications The AWS Region specific settings of a multi-Region table.
     */
    public fun replicaSpecifications(replicaSpecifications: Collection<Any>) {
        _replicaSpecifications.addAll(replicaSpecifications)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-replicaspecifications)
     *
     * @param replicaSpecifications The AWS Region specific settings of a multi-Region table.
     */
    public fun replicaSpecifications(replicaSpecifications: IResolvable) {
        cdkBuilder.replicaSpecifications(replicaSpecifications)
    }

    /**
     * The name of the table to be created.
     *
     * The table name is case sensitive. If you don't specify a name, AWS CloudFormation generates a
     * unique ID and uses that ID for the table name. For more information, see
     * [Name type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * .
     *
     * If you specify a name, you can't perform updates that require replacing this resource. You
     * can perform updates that require no interruption or some interruption. If you must replace
     * the resource, specify a new name.
     *
     * *Length constraints:* Minimum length of 3. Maximum length of 255.
     *
     * *Pattern:* `^[a-zA-Z0-9][a-zA-Z0-9_]{1,47}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-tablename)
     *
     * @param tableName The name of the table to be created.
     */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTable {
        if (_clusteringKeyColumns.isNotEmpty())
            cdkBuilder.clusteringKeyColumns(_clusteringKeyColumns)
        if (_partitionKeyColumns.isNotEmpty()) cdkBuilder.partitionKeyColumns(_partitionKeyColumns)
        if (_regularColumns.isNotEmpty()) cdkBuilder.regularColumns(_regularColumns)
        if (_replicaSpecifications.isNotEmpty())
            cdkBuilder.replicaSpecifications(_replicaSpecifications)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
