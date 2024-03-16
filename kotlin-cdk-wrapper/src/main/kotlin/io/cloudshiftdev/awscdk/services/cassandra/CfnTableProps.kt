@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cassandra

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTable`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cassandra.*;
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
public interface CfnTableProps {
  /**
   * The optional auto scaling capacity settings for a table in provisioned capacity mode.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-autoscalingspecifications)
   */
  public fun autoScalingSpecifications(): Any? = unwrap(this).getAutoScalingSpecifications()

  /**
   * The billing mode for the table, which determines how you'll be charged for reads and writes:.
   *
   * * *On-demand mode* (default) - You pay based on the actual reads and writes your application
   * performs.
   * * *Provisioned mode* - Lets you specify the number of reads and writes per second that you need
   * for your application.
   *
   * If you don't specify a value for this property, then the table will use on-demand mode.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-billingmode)
   */
  public fun billingMode(): Any? = unwrap(this).getBillingMode()

  /**
   * Enables client-side timestamps for the table.
   *
   * By default, the setting is disabled. You can enable client-side timestamps with the following
   * option:
   *
   * * `status: "enabled"`
   *
   * After client-side timestamps are enabled for a table, you can't disable this setting.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clientsidetimestampsenabled)
   */
  public fun clientSideTimestampsEnabled(): Any? = unwrap(this).getClientSideTimestampsEnabled()

  /**
   * One or more columns that determine how the table data is sorted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clusteringkeycolumns)
   */
  public fun clusteringKeyColumns(): Any? = unwrap(this).getClusteringKeyColumns()

  /**
   * The default Time To Live (TTL) value for all rows in a table in seconds.
   *
   * The maximum configurable value is 630,720,000 seconds, which is the equivalent of 20 years. By
   * default, the TTL value for a table is 0, which means data does not expire.
   *
   * For more information, see [Setting the default TTL value for a
   * table](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl)
   * in the *Amazon Keyspaces Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-defaulttimetolive)
   */
  public fun defaultTimeToLive(): Number? = unwrap(this).getDefaultTimeToLive()

  /**
   * The encryption at rest options for the table.
   *
   * * *AWS owned key* (default) - The key is owned by Amazon Keyspaces .
   * * *Customer managed key* - The key is stored in your account and is created, owned, and managed
   * by you.
   *
   *
   * If you choose encryption with a customer managed key, you must specify a valid customer managed
   * KMS key with permissions granted to Amazon Keyspaces.
   *
   *
   * For more information, see [Encryption at rest in Amazon
   * Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html) in the
   * *Amazon Keyspaces Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-encryptionspecification)
   */
  public fun encryptionSpecification(): Any? = unwrap(this).getEncryptionSpecification()

  /**
   * The name of the keyspace to create the table in.
   *
   * The keyspace must already exist.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-keyspacename)
   */
  public fun keyspaceName(): String

  /**
   * One or more columns that uniquely identify every row in the table.
   *
   * Every table must have a partition key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-partitionkeycolumns)
   */
  public fun partitionKeyColumns(): Any

  /**
   * Specifies if point-in-time recovery is enabled or disabled for the table.
   *
   * The options are `PointInTimeRecoveryEnabled=true` and `PointInTimeRecoveryEnabled=false` . If
   * not specified, the default is `PointInTimeRecoveryEnabled=false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-pointintimerecoveryenabled)
   */
  public fun pointInTimeRecoveryEnabled(): Any? = unwrap(this).getPointInTimeRecoveryEnabled()

  /**
   * One or more columns that are not part of the primary key - that is, columns that are *not*
   * defined as partition key columns or clustering key columns.
   *
   * You can add regular columns to existing tables by adding them to the template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-regularcolumns)
   */
  public fun regularColumns(): Any? = unwrap(this).getRegularColumns()

  /**
   * The AWS Region specific settings of a multi-Region table.
   *
   * For a multi-Region table, you can configure the table's read capacity differently per AWS
   * Region. You can do this by configuring the following parameters.
   *
   * * `region` : The Region where these settings are applied. (Required)
   * * `readCapacityUnits` : The provisioned read capacity units. (Optional)
   * * `readCapacityAutoScaling` : The read capacity auto scaling settings for the table. (Optional)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-replicaspecifications)
   */
  public fun replicaSpecifications(): Any? = unwrap(this).getReplicaSpecifications()

  /**
   * The name of the table to be created.
   *
   * The table name is case sensitive. If you don't specify a name, AWS CloudFormation generates a
   * unique ID and uses that ID for the table name. For more information, see [Name
   * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * If you specify a name, you can't perform updates that require replacing this resource. You can
   * perform updates that require no interruption or some interruption. If you must replace the
   * resource, specify a new name.
   *
   *
   * *Length constraints:* Minimum length of 3. Maximum length of 255.
   *
   * *Pattern:* `^[a-zA-Z0-9][a-zA-Z0-9_]{1,47}$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-tablename)
   */
  public fun tableName(): String? = unwrap(this).getTableName()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnTableProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param autoScalingSpecifications The optional auto scaling capacity settings for a table in
     * provisioned capacity mode.
     */
    public fun autoScalingSpecifications(autoScalingSpecifications: IResolvable)

    /**
     * @param autoScalingSpecifications The optional auto scaling capacity settings for a table in
     * provisioned capacity mode.
     */
    public
        fun autoScalingSpecifications(autoScalingSpecifications: CfnTable.AutoScalingSpecificationProperty)

    /**
     * @param autoScalingSpecifications The optional auto scaling capacity settings for a table in
     * provisioned capacity mode.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1ed334d8d048ad1a63723888ba6b52a5733fd3ca7d135585407a63652fbb423")
    public
        fun autoScalingSpecifications(autoScalingSpecifications: CfnTable.AutoScalingSpecificationProperty.Builder.() -> Unit)

    /**
     * @param billingMode The billing mode for the table, which determines how you'll be charged for
     * reads and writes:.
     * * *On-demand mode* (default) - You pay based on the actual reads and writes your application
     * performs.
     * * *Provisioned mode* - Lets you specify the number of reads and writes per second that you
     * need for your application.
     *
     * If you don't specify a value for this property, then the table will use on-demand mode.
     */
    public fun billingMode(billingMode: IResolvable)

    /**
     * @param billingMode The billing mode for the table, which determines how you'll be charged for
     * reads and writes:.
     * * *On-demand mode* (default) - You pay based on the actual reads and writes your application
     * performs.
     * * *Provisioned mode* - Lets you specify the number of reads and writes per second that you
     * need for your application.
     *
     * If you don't specify a value for this property, then the table will use on-demand mode.
     */
    public fun billingMode(billingMode: CfnTable.BillingModeProperty)

    /**
     * @param billingMode The billing mode for the table, which determines how you'll be charged for
     * reads and writes:.
     * * *On-demand mode* (default) - You pay based on the actual reads and writes your application
     * performs.
     * * *Provisioned mode* - Lets you specify the number of reads and writes per second that you
     * need for your application.
     *
     * If you don't specify a value for this property, then the table will use on-demand mode.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb8d6dbc6f6662222780a9bfad95d32dd40625124100e2249da324e1eed3c3b3")
    public fun billingMode(billingMode: CfnTable.BillingModeProperty.Builder.() -> Unit)

    /**
     * @param clientSideTimestampsEnabled Enables client-side timestamps for the table.
     * By default, the setting is disabled. You can enable client-side timestamps with the following
     * option:
     *
     * * `status: "enabled"`
     *
     * After client-side timestamps are enabled for a table, you can't disable this setting.
     */
    public fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: Boolean)

    /**
     * @param clientSideTimestampsEnabled Enables client-side timestamps for the table.
     * By default, the setting is disabled. You can enable client-side timestamps with the following
     * option:
     *
     * * `status: "enabled"`
     *
     * After client-side timestamps are enabled for a table, you can't disable this setting.
     */
    public fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: IResolvable)

    /**
     * @param clusteringKeyColumns One or more columns that determine how the table data is sorted.
     */
    public fun clusteringKeyColumns(clusteringKeyColumns: IResolvable)

    /**
     * @param clusteringKeyColumns One or more columns that determine how the table data is sorted.
     */
    public fun clusteringKeyColumns(clusteringKeyColumns: List<Any>)

    /**
     * @param clusteringKeyColumns One or more columns that determine how the table data is sorted.
     */
    public fun clusteringKeyColumns(vararg clusteringKeyColumns: Any)

    /**
     * @param defaultTimeToLive The default Time To Live (TTL) value for all rows in a table in
     * seconds.
     * The maximum configurable value is 630,720,000 seconds, which is the equivalent of 20 years.
     * By default, the TTL value for a table is 0, which means data does not expire.
     *
     * For more information, see [Setting the default TTL value for a
     * table](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl)
     * in the *Amazon Keyspaces Developer Guide* .
     */
    public fun defaultTimeToLive(defaultTimeToLive: Number)

    /**
     * @param encryptionSpecification The encryption at rest options for the table.
     * * *AWS owned key* (default) - The key is owned by Amazon Keyspaces .
     * * *Customer managed key* - The key is stored in your account and is created, owned, and
     * managed by you.
     *
     *
     * If you choose encryption with a customer managed key, you must specify a valid customer
     * managed KMS key with permissions granted to Amazon Keyspaces.
     *
     *
     * For more information, see [Encryption at rest in Amazon
     * Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html) in the
     * *Amazon Keyspaces Developer Guide* .
     */
    public fun encryptionSpecification(encryptionSpecification: IResolvable)

    /**
     * @param encryptionSpecification The encryption at rest options for the table.
     * * *AWS owned key* (default) - The key is owned by Amazon Keyspaces .
     * * *Customer managed key* - The key is stored in your account and is created, owned, and
     * managed by you.
     *
     *
     * If you choose encryption with a customer managed key, you must specify a valid customer
     * managed KMS key with permissions granted to Amazon Keyspaces.
     *
     *
     * For more information, see [Encryption at rest in Amazon
     * Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html) in the
     * *Amazon Keyspaces Developer Guide* .
     */
    public
        fun encryptionSpecification(encryptionSpecification: CfnTable.EncryptionSpecificationProperty)

    /**
     * @param encryptionSpecification The encryption at rest options for the table.
     * * *AWS owned key* (default) - The key is owned by Amazon Keyspaces .
     * * *Customer managed key* - The key is stored in your account and is created, owned, and
     * managed by you.
     *
     *
     * If you choose encryption with a customer managed key, you must specify a valid customer
     * managed KMS key with permissions granted to Amazon Keyspaces.
     *
     *
     * For more information, see [Encryption at rest in Amazon
     * Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html) in the
     * *Amazon Keyspaces Developer Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ced13bae27275c155e5090b60d17a496dae2ef4db4b0a95625f4b87fb275de61")
    public
        fun encryptionSpecification(encryptionSpecification: CfnTable.EncryptionSpecificationProperty.Builder.() -> Unit)

    /**
     * @param keyspaceName The name of the keyspace to create the table in. 
     * The keyspace must already exist.
     */
    public fun keyspaceName(keyspaceName: String)

    /**
     * @param partitionKeyColumns One or more columns that uniquely identify every row in the table.
     * 
     * Every table must have a partition key.
     */
    public fun partitionKeyColumns(partitionKeyColumns: IResolvable)

    /**
     * @param partitionKeyColumns One or more columns that uniquely identify every row in the table.
     * 
     * Every table must have a partition key.
     */
    public fun partitionKeyColumns(partitionKeyColumns: List<Any>)

    /**
     * @param partitionKeyColumns One or more columns that uniquely identify every row in the table.
     * 
     * Every table must have a partition key.
     */
    public fun partitionKeyColumns(vararg partitionKeyColumns: Any)

    /**
     * @param pointInTimeRecoveryEnabled Specifies if point-in-time recovery is enabled or disabled
     * for the table.
     * The options are `PointInTimeRecoveryEnabled=true` and `PointInTimeRecoveryEnabled=false` . If
     * not specified, the default is `PointInTimeRecoveryEnabled=false` .
     */
    public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean)

    /**
     * @param pointInTimeRecoveryEnabled Specifies if point-in-time recovery is enabled or disabled
     * for the table.
     * The options are `PointInTimeRecoveryEnabled=true` and `PointInTimeRecoveryEnabled=false` . If
     * not specified, the default is `PointInTimeRecoveryEnabled=false` .
     */
    public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable)

    /**
     * @param regularColumns One or more columns that are not part of the primary key - that is,
     * columns that are *not* defined as partition key columns or clustering key columns.
     * You can add regular columns to existing tables by adding them to the template.
     */
    public fun regularColumns(regularColumns: IResolvable)

    /**
     * @param regularColumns One or more columns that are not part of the primary key - that is,
     * columns that are *not* defined as partition key columns or clustering key columns.
     * You can add regular columns to existing tables by adding them to the template.
     */
    public fun regularColumns(regularColumns: List<Any>)

    /**
     * @param regularColumns One or more columns that are not part of the primary key - that is,
     * columns that are *not* defined as partition key columns or clustering key columns.
     * You can add regular columns to existing tables by adding them to the template.
     */
    public fun regularColumns(vararg regularColumns: Any)

    /**
     * @param replicaSpecifications The AWS Region specific settings of a multi-Region table.
     * For a multi-Region table, you can configure the table's read capacity differently per AWS
     * Region. You can do this by configuring the following parameters.
     *
     * * `region` : The Region where these settings are applied. (Required)
     * * `readCapacityUnits` : The provisioned read capacity units. (Optional)
     * * `readCapacityAutoScaling` : The read capacity auto scaling settings for the table.
     * (Optional)
     */
    public fun replicaSpecifications(replicaSpecifications: IResolvable)

    /**
     * @param replicaSpecifications The AWS Region specific settings of a multi-Region table.
     * For a multi-Region table, you can configure the table's read capacity differently per AWS
     * Region. You can do this by configuring the following parameters.
     *
     * * `region` : The Region where these settings are applied. (Required)
     * * `readCapacityUnits` : The provisioned read capacity units. (Optional)
     * * `readCapacityAutoScaling` : The read capacity auto scaling settings for the table.
     * (Optional)
     */
    public fun replicaSpecifications(replicaSpecifications: List<Any>)

    /**
     * @param replicaSpecifications The AWS Region specific settings of a multi-Region table.
     * For a multi-Region table, you can configure the table's read capacity differently per AWS
     * Region. You can do this by configuring the following parameters.
     *
     * * `region` : The Region where these settings are applied. (Required)
     * * `readCapacityUnits` : The provisioned read capacity units. (Optional)
     * * `readCapacityAutoScaling` : The read capacity auto scaling settings for the table.
     * (Optional)
     */
    public fun replicaSpecifications(vararg replicaSpecifications: Any)

    /**
     * @param tableName The name of the table to be created.
     * The table name is case sensitive. If you don't specify a name, AWS CloudFormation generates a
     * unique ID and uses that ID for the table name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you can't perform updates that require replacing this resource. You
     * can perform updates that require no interruption or some interruption. If you must replace the
     * resource, specify a new name.
     *
     *
     * *Length constraints:* Minimum length of 3. Maximum length of 255.
     *
     * *Pattern:* `^[a-zA-Z0-9][a-zA-Z0-9_]{1,47}$`
     */
    public fun tableName(tableName: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cassandra.CfnTableProps.Builder =
        software.amazon.awscdk.services.cassandra.CfnTableProps.builder()

    /**
     * @param autoScalingSpecifications The optional auto scaling capacity settings for a table in
     * provisioned capacity mode.
     */
    override fun autoScalingSpecifications(autoScalingSpecifications: IResolvable) {
      cdkBuilder.autoScalingSpecifications(autoScalingSpecifications.let(IResolvable::unwrap))
    }

    /**
     * @param autoScalingSpecifications The optional auto scaling capacity settings for a table in
     * provisioned capacity mode.
     */
    override
        fun autoScalingSpecifications(autoScalingSpecifications: CfnTable.AutoScalingSpecificationProperty) {
      cdkBuilder.autoScalingSpecifications(autoScalingSpecifications.let(CfnTable.AutoScalingSpecificationProperty::unwrap))
    }

    /**
     * @param autoScalingSpecifications The optional auto scaling capacity settings for a table in
     * provisioned capacity mode.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1ed334d8d048ad1a63723888ba6b52a5733fd3ca7d135585407a63652fbb423")
    override
        fun autoScalingSpecifications(autoScalingSpecifications: CfnTable.AutoScalingSpecificationProperty.Builder.() -> Unit):
        Unit =
        autoScalingSpecifications(CfnTable.AutoScalingSpecificationProperty(autoScalingSpecifications))

    /**
     * @param billingMode The billing mode for the table, which determines how you'll be charged for
     * reads and writes:.
     * * *On-demand mode* (default) - You pay based on the actual reads and writes your application
     * performs.
     * * *Provisioned mode* - Lets you specify the number of reads and writes per second that you
     * need for your application.
     *
     * If you don't specify a value for this property, then the table will use on-demand mode.
     */
    override fun billingMode(billingMode: IResolvable) {
      cdkBuilder.billingMode(billingMode.let(IResolvable::unwrap))
    }

    /**
     * @param billingMode The billing mode for the table, which determines how you'll be charged for
     * reads and writes:.
     * * *On-demand mode* (default) - You pay based on the actual reads and writes your application
     * performs.
     * * *Provisioned mode* - Lets you specify the number of reads and writes per second that you
     * need for your application.
     *
     * If you don't specify a value for this property, then the table will use on-demand mode.
     */
    override fun billingMode(billingMode: CfnTable.BillingModeProperty) {
      cdkBuilder.billingMode(billingMode.let(CfnTable.BillingModeProperty::unwrap))
    }

    /**
     * @param billingMode The billing mode for the table, which determines how you'll be charged for
     * reads and writes:.
     * * *On-demand mode* (default) - You pay based on the actual reads and writes your application
     * performs.
     * * *Provisioned mode* - Lets you specify the number of reads and writes per second that you
     * need for your application.
     *
     * If you don't specify a value for this property, then the table will use on-demand mode.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb8d6dbc6f6662222780a9bfad95d32dd40625124100e2249da324e1eed3c3b3")
    override fun billingMode(billingMode: CfnTable.BillingModeProperty.Builder.() -> Unit): Unit =
        billingMode(CfnTable.BillingModeProperty(billingMode))

    /**
     * @param clientSideTimestampsEnabled Enables client-side timestamps for the table.
     * By default, the setting is disabled. You can enable client-side timestamps with the following
     * option:
     *
     * * `status: "enabled"`
     *
     * After client-side timestamps are enabled for a table, you can't disable this setting.
     */
    override fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: Boolean) {
      cdkBuilder.clientSideTimestampsEnabled(clientSideTimestampsEnabled)
    }

    /**
     * @param clientSideTimestampsEnabled Enables client-side timestamps for the table.
     * By default, the setting is disabled. You can enable client-side timestamps with the following
     * option:
     *
     * * `status: "enabled"`
     *
     * After client-side timestamps are enabled for a table, you can't disable this setting.
     */
    override fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: IResolvable) {
      cdkBuilder.clientSideTimestampsEnabled(clientSideTimestampsEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param clusteringKeyColumns One or more columns that determine how the table data is sorted.
     */
    override fun clusteringKeyColumns(clusteringKeyColumns: IResolvable) {
      cdkBuilder.clusteringKeyColumns(clusteringKeyColumns.let(IResolvable::unwrap))
    }

    /**
     * @param clusteringKeyColumns One or more columns that determine how the table data is sorted.
     */
    override fun clusteringKeyColumns(clusteringKeyColumns: List<Any>) {
      cdkBuilder.clusteringKeyColumns(clusteringKeyColumns)
    }

    /**
     * @param clusteringKeyColumns One or more columns that determine how the table data is sorted.
     */
    override fun clusteringKeyColumns(vararg clusteringKeyColumns: Any): Unit =
        clusteringKeyColumns(clusteringKeyColumns.toList())

    /**
     * @param defaultTimeToLive The default Time To Live (TTL) value for all rows in a table in
     * seconds.
     * The maximum configurable value is 630,720,000 seconds, which is the equivalent of 20 years.
     * By default, the TTL value for a table is 0, which means data does not expire.
     *
     * For more information, see [Setting the default TTL value for a
     * table](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl)
     * in the *Amazon Keyspaces Developer Guide* .
     */
    override fun defaultTimeToLive(defaultTimeToLive: Number) {
      cdkBuilder.defaultTimeToLive(defaultTimeToLive)
    }

    /**
     * @param encryptionSpecification The encryption at rest options for the table.
     * * *AWS owned key* (default) - The key is owned by Amazon Keyspaces .
     * * *Customer managed key* - The key is stored in your account and is created, owned, and
     * managed by you.
     *
     *
     * If you choose encryption with a customer managed key, you must specify a valid customer
     * managed KMS key with permissions granted to Amazon Keyspaces.
     *
     *
     * For more information, see [Encryption at rest in Amazon
     * Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html) in the
     * *Amazon Keyspaces Developer Guide* .
     */
    override fun encryptionSpecification(encryptionSpecification: IResolvable) {
      cdkBuilder.encryptionSpecification(encryptionSpecification.let(IResolvable::unwrap))
    }

    /**
     * @param encryptionSpecification The encryption at rest options for the table.
     * * *AWS owned key* (default) - The key is owned by Amazon Keyspaces .
     * * *Customer managed key* - The key is stored in your account and is created, owned, and
     * managed by you.
     *
     *
     * If you choose encryption with a customer managed key, you must specify a valid customer
     * managed KMS key with permissions granted to Amazon Keyspaces.
     *
     *
     * For more information, see [Encryption at rest in Amazon
     * Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html) in the
     * *Amazon Keyspaces Developer Guide* .
     */
    override
        fun encryptionSpecification(encryptionSpecification: CfnTable.EncryptionSpecificationProperty) {
      cdkBuilder.encryptionSpecification(encryptionSpecification.let(CfnTable.EncryptionSpecificationProperty::unwrap))
    }

    /**
     * @param encryptionSpecification The encryption at rest options for the table.
     * * *AWS owned key* (default) - The key is owned by Amazon Keyspaces .
     * * *Customer managed key* - The key is stored in your account and is created, owned, and
     * managed by you.
     *
     *
     * If you choose encryption with a customer managed key, you must specify a valid customer
     * managed KMS key with permissions granted to Amazon Keyspaces.
     *
     *
     * For more information, see [Encryption at rest in Amazon
     * Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html) in the
     * *Amazon Keyspaces Developer Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ced13bae27275c155e5090b60d17a496dae2ef4db4b0a95625f4b87fb275de61")
    override
        fun encryptionSpecification(encryptionSpecification: CfnTable.EncryptionSpecificationProperty.Builder.() -> Unit):
        Unit =
        encryptionSpecification(CfnTable.EncryptionSpecificationProperty(encryptionSpecification))

    /**
     * @param keyspaceName The name of the keyspace to create the table in. 
     * The keyspace must already exist.
     */
    override fun keyspaceName(keyspaceName: String) {
      cdkBuilder.keyspaceName(keyspaceName)
    }

    /**
     * @param partitionKeyColumns One or more columns that uniquely identify every row in the table.
     * 
     * Every table must have a partition key.
     */
    override fun partitionKeyColumns(partitionKeyColumns: IResolvable) {
      cdkBuilder.partitionKeyColumns(partitionKeyColumns.let(IResolvable::unwrap))
    }

    /**
     * @param partitionKeyColumns One or more columns that uniquely identify every row in the table.
     * 
     * Every table must have a partition key.
     */
    override fun partitionKeyColumns(partitionKeyColumns: List<Any>) {
      cdkBuilder.partitionKeyColumns(partitionKeyColumns)
    }

    /**
     * @param partitionKeyColumns One or more columns that uniquely identify every row in the table.
     * 
     * Every table must have a partition key.
     */
    override fun partitionKeyColumns(vararg partitionKeyColumns: Any): Unit =
        partitionKeyColumns(partitionKeyColumns.toList())

    /**
     * @param pointInTimeRecoveryEnabled Specifies if point-in-time recovery is enabled or disabled
     * for the table.
     * The options are `PointInTimeRecoveryEnabled=true` and `PointInTimeRecoveryEnabled=false` . If
     * not specified, the default is `PointInTimeRecoveryEnabled=false` .
     */
    override fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean) {
      cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
    }

    /**
     * @param pointInTimeRecoveryEnabled Specifies if point-in-time recovery is enabled or disabled
     * for the table.
     * The options are `PointInTimeRecoveryEnabled=true` and `PointInTimeRecoveryEnabled=false` . If
     * not specified, the default is `PointInTimeRecoveryEnabled=false` .
     */
    override fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable) {
      cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param regularColumns One or more columns that are not part of the primary key - that is,
     * columns that are *not* defined as partition key columns or clustering key columns.
     * You can add regular columns to existing tables by adding them to the template.
     */
    override fun regularColumns(regularColumns: IResolvable) {
      cdkBuilder.regularColumns(regularColumns.let(IResolvable::unwrap))
    }

    /**
     * @param regularColumns One or more columns that are not part of the primary key - that is,
     * columns that are *not* defined as partition key columns or clustering key columns.
     * You can add regular columns to existing tables by adding them to the template.
     */
    override fun regularColumns(regularColumns: List<Any>) {
      cdkBuilder.regularColumns(regularColumns)
    }

    /**
     * @param regularColumns One or more columns that are not part of the primary key - that is,
     * columns that are *not* defined as partition key columns or clustering key columns.
     * You can add regular columns to existing tables by adding them to the template.
     */
    override fun regularColumns(vararg regularColumns: Any): Unit =
        regularColumns(regularColumns.toList())

    /**
     * @param replicaSpecifications The AWS Region specific settings of a multi-Region table.
     * For a multi-Region table, you can configure the table's read capacity differently per AWS
     * Region. You can do this by configuring the following parameters.
     *
     * * `region` : The Region where these settings are applied. (Required)
     * * `readCapacityUnits` : The provisioned read capacity units. (Optional)
     * * `readCapacityAutoScaling` : The read capacity auto scaling settings for the table.
     * (Optional)
     */
    override fun replicaSpecifications(replicaSpecifications: IResolvable) {
      cdkBuilder.replicaSpecifications(replicaSpecifications.let(IResolvable::unwrap))
    }

    /**
     * @param replicaSpecifications The AWS Region specific settings of a multi-Region table.
     * For a multi-Region table, you can configure the table's read capacity differently per AWS
     * Region. You can do this by configuring the following parameters.
     *
     * * `region` : The Region where these settings are applied. (Required)
     * * `readCapacityUnits` : The provisioned read capacity units. (Optional)
     * * `readCapacityAutoScaling` : The read capacity auto scaling settings for the table.
     * (Optional)
     */
    override fun replicaSpecifications(replicaSpecifications: List<Any>) {
      cdkBuilder.replicaSpecifications(replicaSpecifications)
    }

    /**
     * @param replicaSpecifications The AWS Region specific settings of a multi-Region table.
     * For a multi-Region table, you can configure the table's read capacity differently per AWS
     * Region. You can do this by configuring the following parameters.
     *
     * * `region` : The Region where these settings are applied. (Required)
     * * `readCapacityUnits` : The provisioned read capacity units. (Optional)
     * * `readCapacityAutoScaling` : The read capacity auto scaling settings for the table.
     * (Optional)
     */
    override fun replicaSpecifications(vararg replicaSpecifications: Any): Unit =
        replicaSpecifications(replicaSpecifications.toList())

    /**
     * @param tableName The name of the table to be created.
     * The table name is case sensitive. If you don't specify a name, AWS CloudFormation generates a
     * unique ID and uses that ID for the table name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you can't perform updates that require replacing this resource. You
     * can perform updates that require no interruption or some interruption. If you must replace the
     * resource, specify a new name.
     *
     *
     * *Length constraints:* Minimum length of 3. Maximum length of 255.
     *
     * *Pattern:* `^[a-zA-Z0-9][a-zA-Z0-9_]{1,47}$`
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cassandra.CfnTableProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cassandra.CfnTableProps,
  ) : CdkObject(cdkObject), CfnTableProps {
    /**
     * The optional auto scaling capacity settings for a table in provisioned capacity mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-autoscalingspecifications)
     */
    override fun autoScalingSpecifications(): Any? = unwrap(this).getAutoScalingSpecifications()

    /**
     * The billing mode for the table, which determines how you'll be charged for reads and writes:.
     *
     * * *On-demand mode* (default) - You pay based on the actual reads and writes your application
     * performs.
     * * *Provisioned mode* - Lets you specify the number of reads and writes per second that you
     * need for your application.
     *
     * If you don't specify a value for this property, then the table will use on-demand mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-billingmode)
     */
    override fun billingMode(): Any? = unwrap(this).getBillingMode()

    /**
     * Enables client-side timestamps for the table.
     *
     * By default, the setting is disabled. You can enable client-side timestamps with the following
     * option:
     *
     * * `status: "enabled"`
     *
     * After client-side timestamps are enabled for a table, you can't disable this setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clientsidetimestampsenabled)
     */
    override fun clientSideTimestampsEnabled(): Any? = unwrap(this).getClientSideTimestampsEnabled()

    /**
     * One or more columns that determine how the table data is sorted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clusteringkeycolumns)
     */
    override fun clusteringKeyColumns(): Any? = unwrap(this).getClusteringKeyColumns()

    /**
     * The default Time To Live (TTL) value for all rows in a table in seconds.
     *
     * The maximum configurable value is 630,720,000 seconds, which is the equivalent of 20 years.
     * By default, the TTL value for a table is 0, which means data does not expire.
     *
     * For more information, see [Setting the default TTL value for a
     * table](https://docs.aws.amazon.com/keyspaces/latest/devguide/TTL-how-it-works.html#ttl-howitworks_default_ttl)
     * in the *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-defaulttimetolive)
     */
    override fun defaultTimeToLive(): Number? = unwrap(this).getDefaultTimeToLive()

    /**
     * The encryption at rest options for the table.
     *
     * * *AWS owned key* (default) - The key is owned by Amazon Keyspaces .
     * * *Customer managed key* - The key is stored in your account and is created, owned, and
     * managed by you.
     *
     *
     * If you choose encryption with a customer managed key, you must specify a valid customer
     * managed KMS key with permissions granted to Amazon Keyspaces.
     *
     *
     * For more information, see [Encryption at rest in Amazon
     * Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html) in the
     * *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-encryptionspecification)
     */
    override fun encryptionSpecification(): Any? = unwrap(this).getEncryptionSpecification()

    /**
     * The name of the keyspace to create the table in.
     *
     * The keyspace must already exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-keyspacename)
     */
    override fun keyspaceName(): String = unwrap(this).getKeyspaceName()

    /**
     * One or more columns that uniquely identify every row in the table.
     *
     * Every table must have a partition key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-partitionkeycolumns)
     */
    override fun partitionKeyColumns(): Any = unwrap(this).getPartitionKeyColumns()

    /**
     * Specifies if point-in-time recovery is enabled or disabled for the table.
     *
     * The options are `PointInTimeRecoveryEnabled=true` and `PointInTimeRecoveryEnabled=false` . If
     * not specified, the default is `PointInTimeRecoveryEnabled=false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-pointintimerecoveryenabled)
     */
    override fun pointInTimeRecoveryEnabled(): Any? = unwrap(this).getPointInTimeRecoveryEnabled()

    /**
     * One or more columns that are not part of the primary key - that is, columns that are *not*
     * defined as partition key columns or clustering key columns.
     *
     * You can add regular columns to existing tables by adding them to the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-regularcolumns)
     */
    override fun regularColumns(): Any? = unwrap(this).getRegularColumns()

    /**
     * The AWS Region specific settings of a multi-Region table.
     *
     * For a multi-Region table, you can configure the table's read capacity differently per AWS
     * Region. You can do this by configuring the following parameters.
     *
     * * `region` : The Region where these settings are applied. (Required)
     * * `readCapacityUnits` : The provisioned read capacity units. (Optional)
     * * `readCapacityAutoScaling` : The read capacity auto scaling settings for the table.
     * (Optional)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-replicaspecifications)
     */
    override fun replicaSpecifications(): Any? = unwrap(this).getReplicaSpecifications()

    /**
     * The name of the table to be created.
     *
     * The table name is case sensitive. If you don't specify a name, AWS CloudFormation generates a
     * unique ID and uses that ID for the table name. For more information, see [Name
     * type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you can't perform updates that require replacing this resource. You
     * can perform updates that require no interruption or some interruption. If you must replace the
     * resource, specify a new name.
     *
     *
     * *Length constraints:* Minimum length of 3. Maximum length of 255.
     *
     * *Pattern:* `^[a-zA-Z0-9][a-zA-Z0-9_]{1,47}$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-tablename)
     */
    override fun tableName(): String? = unwrap(this).getTableName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTableProps):
        CfnTableProps = CdkObjectWrappers.wrap(cdkObject) as CfnTableProps

    internal fun unwrap(wrapped: CfnTableProps):
        software.amazon.awscdk.services.cassandra.CfnTableProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cassandra.CfnTableProps
  }
}
