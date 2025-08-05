@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cassandra

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * You can use the `AWS::Cassandra::Table` resource to create a new table in Amazon Keyspaces (for
 * Apache Cassandra).
 *
 * For more information, see [Create a
 * table](https://docs.aws.amazon.com/keyspaces/latest/devguide/getting-started.tables.html) in the
 * *Amazon Keyspaces Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cassandra.*;
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
 * .cdcSpecification(CdcSpecificationProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .viewType("viewType")
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
public open class CfnTable(
  cdkObject: software.amazon.awscdk.services.cassandra.CfnTable,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTableProps,
  ) :
      this(software.amazon.awscdk.services.cassandra.CfnTable(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTableProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTableProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTableProps(props)
  )

  /**
   * The optional auto scaling capacity settings for a table in provisioned capacity mode.
   */
  public open fun autoScalingSpecifications(): Any? = unwrap(this).getAutoScalingSpecifications()

  /**
   * The optional auto scaling capacity settings for a table in provisioned capacity mode.
   */
  public open fun autoScalingSpecifications(`value`: IResolvable) {
    unwrap(this).setAutoScalingSpecifications(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The optional auto scaling capacity settings for a table in provisioned capacity mode.
   */
  public open fun autoScalingSpecifications(`value`: AutoScalingSpecificationProperty) {
    unwrap(this).setAutoScalingSpecifications(`value`.let(AutoScalingSpecificationProperty.Companion::unwrap))
  }

  /**
   * The optional auto scaling capacity settings for a table in provisioned capacity mode.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c2130607010229356c6ba6443cdde6ad00f73c7283b808f06a148ca0a6b41056")
  public open
      fun autoScalingSpecifications(`value`: AutoScalingSpecificationProperty.Builder.() -> Unit):
      Unit = autoScalingSpecifications(AutoScalingSpecificationProperty(`value`))

  /**
   * The billing mode for the table, which determines how you'll be charged for reads and writes:.
   */
  public open fun billingMode(): Any? = unwrap(this).getBillingMode()

  /**
   * The billing mode for the table, which determines how you'll be charged for reads and writes:.
   */
  public open fun billingMode(`value`: IResolvable) {
    unwrap(this).setBillingMode(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The billing mode for the table, which determines how you'll be charged for reads and writes:.
   */
  public open fun billingMode(`value`: BillingModeProperty) {
    unwrap(this).setBillingMode(`value`.let(BillingModeProperty.Companion::unwrap))
  }

  /**
   * The billing mode for the table, which determines how you'll be charged for reads and writes:.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0566a41490d57e7aa3afa772835c7907b1626cd5ee4aa891045a85ac1f9ba0ad")
  public open fun billingMode(`value`: BillingModeProperty.Builder.() -> Unit): Unit =
      billingMode(BillingModeProperty(`value`))

  /**
   * The settings for the CDC stream of a table.
   */
  public open fun cdcSpecification(): Any? = unwrap(this).getCdcSpecification()

  /**
   * The settings for the CDC stream of a table.
   */
  public open fun cdcSpecification(`value`: IResolvable) {
    unwrap(this).setCdcSpecification(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The settings for the CDC stream of a table.
   */
  public open fun cdcSpecification(`value`: CdcSpecificationProperty) {
    unwrap(this).setCdcSpecification(`value`.let(CdcSpecificationProperty.Companion::unwrap))
  }

  /**
   * The settings for the CDC stream of a table.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1f0d6675c6df0b5d9e5b0bb4d21d5bf46a8bc6637b97d59edae16fd1fe81068f")
  public open fun cdcSpecification(`value`: CdcSpecificationProperty.Builder.() -> Unit): Unit =
      cdcSpecification(CdcSpecificationProperty(`value`))

  /**
   * Enables client-side timestamps for the table.
   */
  public open fun clientSideTimestampsEnabled(): Any? =
      unwrap(this).getClientSideTimestampsEnabled()

  /**
   * Enables client-side timestamps for the table.
   */
  public open fun clientSideTimestampsEnabled(`value`: Boolean) {
    unwrap(this).setClientSideTimestampsEnabled(`value`)
  }

  /**
   * Enables client-side timestamps for the table.
   */
  public open fun clientSideTimestampsEnabled(`value`: IResolvable) {
    unwrap(this).setClientSideTimestampsEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * One or more columns that determine how the table data is sorted.
   */
  public open fun clusteringKeyColumns(): Any? = unwrap(this).getClusteringKeyColumns()

  /**
   * One or more columns that determine how the table data is sorted.
   */
  public open fun clusteringKeyColumns(`value`: IResolvable) {
    unwrap(this).setClusteringKeyColumns(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * One or more columns that determine how the table data is sorted.
   */
  public open fun clusteringKeyColumns(`value`: List<Any>) {
    unwrap(this).setClusteringKeyColumns(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * One or more columns that determine how the table data is sorted.
   */
  public open fun clusteringKeyColumns(vararg `value`: Any): Unit =
      clusteringKeyColumns(`value`.toList())

  /**
   * The default Time To Live (TTL) value for all rows in a table in seconds.
   */
  public open fun defaultTimeToLive(): Number? = unwrap(this).getDefaultTimeToLive()

  /**
   * The default Time To Live (TTL) value for all rows in a table in seconds.
   */
  public open fun defaultTimeToLive(`value`: Number) {
    unwrap(this).setDefaultTimeToLive(`value`)
  }

  /**
   * The encryption at rest options for the table.
   */
  public open fun encryptionSpecification(): Any? = unwrap(this).getEncryptionSpecification()

  /**
   * The encryption at rest options for the table.
   */
  public open fun encryptionSpecification(`value`: IResolvable) {
    unwrap(this).setEncryptionSpecification(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The encryption at rest options for the table.
   */
  public open fun encryptionSpecification(`value`: EncryptionSpecificationProperty) {
    unwrap(this).setEncryptionSpecification(`value`.let(EncryptionSpecificationProperty.Companion::unwrap))
  }

  /**
   * The encryption at rest options for the table.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e766c2ecd0ddb7d8f1a183745a554c829bd9b747013a5954c5622a546f71ab55")
  public open
      fun encryptionSpecification(`value`: EncryptionSpecificationProperty.Builder.() -> Unit): Unit
      = encryptionSpecification(EncryptionSpecificationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the keyspace to create the table in.
   */
  public open fun keyspaceName(): String = unwrap(this).getKeyspaceName()

  /**
   * The name of the keyspace to create the table in.
   */
  public open fun keyspaceName(`value`: String) {
    unwrap(this).setKeyspaceName(`value`)
  }

  /**
   * One or more columns that uniquely identify every row in the table.
   */
  public open fun partitionKeyColumns(): Any = unwrap(this).getPartitionKeyColumns()

  /**
   * One or more columns that uniquely identify every row in the table.
   */
  public open fun partitionKeyColumns(`value`: IResolvable) {
    unwrap(this).setPartitionKeyColumns(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * One or more columns that uniquely identify every row in the table.
   */
  public open fun partitionKeyColumns(`value`: List<Any>) {
    unwrap(this).setPartitionKeyColumns(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * One or more columns that uniquely identify every row in the table.
   */
  public open fun partitionKeyColumns(vararg `value`: Any): Unit =
      partitionKeyColumns(`value`.toList())

  /**
   * Specifies if point-in-time recovery is enabled or disabled for the table.
   */
  public open fun pointInTimeRecoveryEnabled(): Any? = unwrap(this).getPointInTimeRecoveryEnabled()

  /**
   * Specifies if point-in-time recovery is enabled or disabled for the table.
   */
  public open fun pointInTimeRecoveryEnabled(`value`: Boolean) {
    unwrap(this).setPointInTimeRecoveryEnabled(`value`)
  }

  /**
   * Specifies if point-in-time recovery is enabled or disabled for the table.
   */
  public open fun pointInTimeRecoveryEnabled(`value`: IResolvable) {
    unwrap(this).setPointInTimeRecoveryEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * One or more columns that are not part of the primary key - that is, columns that are *not*
   * defined as partition key columns or clustering key columns.
   */
  public open fun regularColumns(): Any? = unwrap(this).getRegularColumns()

  /**
   * One or more columns that are not part of the primary key - that is, columns that are *not*
   * defined as partition key columns or clustering key columns.
   */
  public open fun regularColumns(`value`: IResolvable) {
    unwrap(this).setRegularColumns(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * One or more columns that are not part of the primary key - that is, columns that are *not*
   * defined as partition key columns or clustering key columns.
   */
  public open fun regularColumns(`value`: List<Any>) {
    unwrap(this).setRegularColumns(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * One or more columns that are not part of the primary key - that is, columns that are *not*
   * defined as partition key columns or clustering key columns.
   */
  public open fun regularColumns(vararg `value`: Any): Unit = regularColumns(`value`.toList())

  /**
   * The AWS Region specific settings of a multi-Region table.
   */
  public open fun replicaSpecifications(): Any? = unwrap(this).getReplicaSpecifications()

  /**
   * The AWS Region specific settings of a multi-Region table.
   */
  public open fun replicaSpecifications(`value`: IResolvable) {
    unwrap(this).setReplicaSpecifications(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The AWS Region specific settings of a multi-Region table.
   */
  public open fun replicaSpecifications(`value`: List<Any>) {
    unwrap(this).setReplicaSpecifications(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The AWS Region specific settings of a multi-Region table.
   */
  public open fun replicaSpecifications(vararg `value`: Any): Unit =
      replicaSpecifications(`value`.toList())

  /**
   * The name of the table to be created.
   */
  public open fun tableName(): String? = unwrap(this).getTableName()

  /**
   * The name of the table to be created.
   */
  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cassandra.CfnTable].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The optional auto scaling capacity settings for a table in provisioned capacity mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-autoscalingspecifications)
     * @param autoScalingSpecifications The optional auto scaling capacity settings for a table in
     * provisioned capacity mode. 
     */
    public fun autoScalingSpecifications(autoScalingSpecifications: IResolvable)

    /**
     * The optional auto scaling capacity settings for a table in provisioned capacity mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-autoscalingspecifications)
     * @param autoScalingSpecifications The optional auto scaling capacity settings for a table in
     * provisioned capacity mode. 
     */
    public
        fun autoScalingSpecifications(autoScalingSpecifications: AutoScalingSpecificationProperty)

    /**
     * The optional auto scaling capacity settings for a table in provisioned capacity mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-autoscalingspecifications)
     * @param autoScalingSpecifications The optional auto scaling capacity settings for a table in
     * provisioned capacity mode. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e766f231662dc2566d0ae3bc2db9b0911ac936f7599d5b543ca9610d4f970383")
    public
        fun autoScalingSpecifications(autoScalingSpecifications: AutoScalingSpecificationProperty.Builder.() -> Unit)

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
     * @param billingMode The billing mode for the table, which determines how you'll be charged for
     * reads and writes:. 
     */
    public fun billingMode(billingMode: IResolvable)

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
     * @param billingMode The billing mode for the table, which determines how you'll be charged for
     * reads and writes:. 
     */
    public fun billingMode(billingMode: BillingModeProperty)

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
     * @param billingMode The billing mode for the table, which determines how you'll be charged for
     * reads and writes:. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67ee3519a80b06e9ad6c8f1ae08b363b5907d831f8e0d8fdf71b54ac1f4d6be4")
    public fun billingMode(billingMode: BillingModeProperty.Builder.() -> Unit)

    /**
     * The settings for the CDC stream of a table.
     *
     * For more information about CDC streams, see [Working with change data capture (CDC) streams
     * in Amazon Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/cdc.html) in the
     * *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-cdcspecification)
     * @param cdcSpecification The settings for the CDC stream of a table. 
     */
    public fun cdcSpecification(cdcSpecification: IResolvable)

    /**
     * The settings for the CDC stream of a table.
     *
     * For more information about CDC streams, see [Working with change data capture (CDC) streams
     * in Amazon Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/cdc.html) in the
     * *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-cdcspecification)
     * @param cdcSpecification The settings for the CDC stream of a table. 
     */
    public fun cdcSpecification(cdcSpecification: CdcSpecificationProperty)

    /**
     * The settings for the CDC stream of a table.
     *
     * For more information about CDC streams, see [Working with change data capture (CDC) streams
     * in Amazon Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/cdc.html) in the
     * *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-cdcspecification)
     * @param cdcSpecification The settings for the CDC stream of a table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40349e5df1b0ae0de570917feb7345f55040728ce414c9dc011906bd08c3d9c9")
    public fun cdcSpecification(cdcSpecification: CdcSpecificationProperty.Builder.() -> Unit)

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
     * @param clientSideTimestampsEnabled Enables client-side timestamps for the table. 
     */
    public fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: Boolean)

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
     * @param clientSideTimestampsEnabled Enables client-side timestamps for the table. 
     */
    public fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: IResolvable)

    /**
     * One or more columns that determine how the table data is sorted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clusteringkeycolumns)
     * @param clusteringKeyColumns One or more columns that determine how the table data is sorted. 
     */
    public fun clusteringKeyColumns(clusteringKeyColumns: IResolvable)

    /**
     * One or more columns that determine how the table data is sorted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clusteringkeycolumns)
     * @param clusteringKeyColumns One or more columns that determine how the table data is sorted. 
     */
    public fun clusteringKeyColumns(clusteringKeyColumns: List<Any>)

    /**
     * One or more columns that determine how the table data is sorted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clusteringkeycolumns)
     * @param clusteringKeyColumns One or more columns that determine how the table data is sorted. 
     */
    public fun clusteringKeyColumns(vararg clusteringKeyColumns: Any)

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
     * @param defaultTimeToLive The default Time To Live (TTL) value for all rows in a table in
     * seconds. 
     */
    public fun defaultTimeToLive(defaultTimeToLive: Number)

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
     * @param encryptionSpecification The encryption at rest options for the table. 
     */
    public fun encryptionSpecification(encryptionSpecification: IResolvable)

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
     * @param encryptionSpecification The encryption at rest options for the table. 
     */
    public fun encryptionSpecification(encryptionSpecification: EncryptionSpecificationProperty)

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
     * @param encryptionSpecification The encryption at rest options for the table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b052269454814355570c6aac83180d224f12e28d7e33efe86c977752a15163aa")
    public
        fun encryptionSpecification(encryptionSpecification: EncryptionSpecificationProperty.Builder.() -> Unit)

    /**
     * The name of the keyspace to create the table in.
     *
     * The keyspace must already exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-keyspacename)
     * @param keyspaceName The name of the keyspace to create the table in. 
     */
    public fun keyspaceName(keyspaceName: String)

    /**
     * One or more columns that uniquely identify every row in the table.
     *
     * Every table must have a partition key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-partitionkeycolumns)
     * @param partitionKeyColumns One or more columns that uniquely identify every row in the table.
     * 
     */
    public fun partitionKeyColumns(partitionKeyColumns: IResolvable)

    /**
     * One or more columns that uniquely identify every row in the table.
     *
     * Every table must have a partition key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-partitionkeycolumns)
     * @param partitionKeyColumns One or more columns that uniquely identify every row in the table.
     * 
     */
    public fun partitionKeyColumns(partitionKeyColumns: List<Any>)

    /**
     * One or more columns that uniquely identify every row in the table.
     *
     * Every table must have a partition key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-partitionkeycolumns)
     * @param partitionKeyColumns One or more columns that uniquely identify every row in the table.
     * 
     */
    public fun partitionKeyColumns(vararg partitionKeyColumns: Any)

    /**
     * Specifies if point-in-time recovery is enabled or disabled for the table.
     *
     * The options are `PointInTimeRecoveryEnabled=true` and `PointInTimeRecoveryEnabled=false` . If
     * not specified, the default is `PointInTimeRecoveryEnabled=false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-pointintimerecoveryenabled)
     * @param pointInTimeRecoveryEnabled Specifies if point-in-time recovery is enabled or disabled
     * for the table. 
     */
    public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean)

    /**
     * Specifies if point-in-time recovery is enabled or disabled for the table.
     *
     * The options are `PointInTimeRecoveryEnabled=true` and `PointInTimeRecoveryEnabled=false` . If
     * not specified, the default is `PointInTimeRecoveryEnabled=false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-pointintimerecoveryenabled)
     * @param pointInTimeRecoveryEnabled Specifies if point-in-time recovery is enabled or disabled
     * for the table. 
     */
    public fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable)

    /**
     * One or more columns that are not part of the primary key - that is, columns that are *not*
     * defined as partition key columns or clustering key columns.
     *
     * You can add regular columns to existing tables by adding them to the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-regularcolumns)
     * @param regularColumns One or more columns that are not part of the primary key - that is,
     * columns that are *not* defined as partition key columns or clustering key columns. 
     */
    public fun regularColumns(regularColumns: IResolvable)

    /**
     * One or more columns that are not part of the primary key - that is, columns that are *not*
     * defined as partition key columns or clustering key columns.
     *
     * You can add regular columns to existing tables by adding them to the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-regularcolumns)
     * @param regularColumns One or more columns that are not part of the primary key - that is,
     * columns that are *not* defined as partition key columns or clustering key columns. 
     */
    public fun regularColumns(regularColumns: List<Any>)

    /**
     * One or more columns that are not part of the primary key - that is, columns that are *not*
     * defined as partition key columns or clustering key columns.
     *
     * You can add regular columns to existing tables by adding them to the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-regularcolumns)
     * @param regularColumns One or more columns that are not part of the primary key - that is,
     * columns that are *not* defined as partition key columns or clustering key columns. 
     */
    public fun regularColumns(vararg regularColumns: Any)

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
     * @param replicaSpecifications The AWS Region specific settings of a multi-Region table. 
     */
    public fun replicaSpecifications(replicaSpecifications: IResolvable)

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
     * @param replicaSpecifications The AWS Region specific settings of a multi-Region table. 
     */
    public fun replicaSpecifications(replicaSpecifications: List<Any>)

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
     * @param replicaSpecifications The AWS Region specific settings of a multi-Region table. 
     */
    public fun replicaSpecifications(vararg replicaSpecifications: Any)

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
     * @param tableName The name of the table to be created. 
     */
    public fun tableName(tableName: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cassandra.CfnTable.Builder =
        software.amazon.awscdk.services.cassandra.CfnTable.Builder.create(scope, id)

    /**
     * The optional auto scaling capacity settings for a table in provisioned capacity mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-autoscalingspecifications)
     * @param autoScalingSpecifications The optional auto scaling capacity settings for a table in
     * provisioned capacity mode. 
     */
    override fun autoScalingSpecifications(autoScalingSpecifications: IResolvable) {
      cdkBuilder.autoScalingSpecifications(autoScalingSpecifications.let(IResolvable.Companion::unwrap))
    }

    /**
     * The optional auto scaling capacity settings for a table in provisioned capacity mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-autoscalingspecifications)
     * @param autoScalingSpecifications The optional auto scaling capacity settings for a table in
     * provisioned capacity mode. 
     */
    override
        fun autoScalingSpecifications(autoScalingSpecifications: AutoScalingSpecificationProperty) {
      cdkBuilder.autoScalingSpecifications(autoScalingSpecifications.let(AutoScalingSpecificationProperty.Companion::unwrap))
    }

    /**
     * The optional auto scaling capacity settings for a table in provisioned capacity mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-autoscalingspecifications)
     * @param autoScalingSpecifications The optional auto scaling capacity settings for a table in
     * provisioned capacity mode. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e766f231662dc2566d0ae3bc2db9b0911ac936f7599d5b543ca9610d4f970383")
    override
        fun autoScalingSpecifications(autoScalingSpecifications: AutoScalingSpecificationProperty.Builder.() -> Unit):
        Unit =
        autoScalingSpecifications(AutoScalingSpecificationProperty(autoScalingSpecifications))

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
     * @param billingMode The billing mode for the table, which determines how you'll be charged for
     * reads and writes:. 
     */
    override fun billingMode(billingMode: IResolvable) {
      cdkBuilder.billingMode(billingMode.let(IResolvable.Companion::unwrap))
    }

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
     * @param billingMode The billing mode for the table, which determines how you'll be charged for
     * reads and writes:. 
     */
    override fun billingMode(billingMode: BillingModeProperty) {
      cdkBuilder.billingMode(billingMode.let(BillingModeProperty.Companion::unwrap))
    }

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
     * @param billingMode The billing mode for the table, which determines how you'll be charged for
     * reads and writes:. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67ee3519a80b06e9ad6c8f1ae08b363b5907d831f8e0d8fdf71b54ac1f4d6be4")
    override fun billingMode(billingMode: BillingModeProperty.Builder.() -> Unit): Unit =
        billingMode(BillingModeProperty(billingMode))

    /**
     * The settings for the CDC stream of a table.
     *
     * For more information about CDC streams, see [Working with change data capture (CDC) streams
     * in Amazon Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/cdc.html) in the
     * *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-cdcspecification)
     * @param cdcSpecification The settings for the CDC stream of a table. 
     */
    override fun cdcSpecification(cdcSpecification: IResolvable) {
      cdkBuilder.cdcSpecification(cdcSpecification.let(IResolvable.Companion::unwrap))
    }

    /**
     * The settings for the CDC stream of a table.
     *
     * For more information about CDC streams, see [Working with change data capture (CDC) streams
     * in Amazon Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/cdc.html) in the
     * *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-cdcspecification)
     * @param cdcSpecification The settings for the CDC stream of a table. 
     */
    override fun cdcSpecification(cdcSpecification: CdcSpecificationProperty) {
      cdkBuilder.cdcSpecification(cdcSpecification.let(CdcSpecificationProperty.Companion::unwrap))
    }

    /**
     * The settings for the CDC stream of a table.
     *
     * For more information about CDC streams, see [Working with change data capture (CDC) streams
     * in Amazon Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/cdc.html) in the
     * *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-cdcspecification)
     * @param cdcSpecification The settings for the CDC stream of a table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("40349e5df1b0ae0de570917feb7345f55040728ce414c9dc011906bd08c3d9c9")
    override fun cdcSpecification(cdcSpecification: CdcSpecificationProperty.Builder.() -> Unit):
        Unit = cdcSpecification(CdcSpecificationProperty(cdcSpecification))

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
     * @param clientSideTimestampsEnabled Enables client-side timestamps for the table. 
     */
    override fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: Boolean) {
      cdkBuilder.clientSideTimestampsEnabled(clientSideTimestampsEnabled)
    }

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
     * @param clientSideTimestampsEnabled Enables client-side timestamps for the table. 
     */
    override fun clientSideTimestampsEnabled(clientSideTimestampsEnabled: IResolvable) {
      cdkBuilder.clientSideTimestampsEnabled(clientSideTimestampsEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * One or more columns that determine how the table data is sorted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clusteringkeycolumns)
     * @param clusteringKeyColumns One or more columns that determine how the table data is sorted. 
     */
    override fun clusteringKeyColumns(clusteringKeyColumns: IResolvable) {
      cdkBuilder.clusteringKeyColumns(clusteringKeyColumns.let(IResolvable.Companion::unwrap))
    }

    /**
     * One or more columns that determine how the table data is sorted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clusteringkeycolumns)
     * @param clusteringKeyColumns One or more columns that determine how the table data is sorted. 
     */
    override fun clusteringKeyColumns(clusteringKeyColumns: List<Any>) {
      cdkBuilder.clusteringKeyColumns(clusteringKeyColumns.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * One or more columns that determine how the table data is sorted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clusteringkeycolumns)
     * @param clusteringKeyColumns One or more columns that determine how the table data is sorted. 
     */
    override fun clusteringKeyColumns(vararg clusteringKeyColumns: Any): Unit =
        clusteringKeyColumns(clusteringKeyColumns.toList())

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
     * @param defaultTimeToLive The default Time To Live (TTL) value for all rows in a table in
     * seconds. 
     */
    override fun defaultTimeToLive(defaultTimeToLive: Number) {
      cdkBuilder.defaultTimeToLive(defaultTimeToLive)
    }

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
     * @param encryptionSpecification The encryption at rest options for the table. 
     */
    override fun encryptionSpecification(encryptionSpecification: IResolvable) {
      cdkBuilder.encryptionSpecification(encryptionSpecification.let(IResolvable.Companion::unwrap))
    }

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
     * @param encryptionSpecification The encryption at rest options for the table. 
     */
    override fun encryptionSpecification(encryptionSpecification: EncryptionSpecificationProperty) {
      cdkBuilder.encryptionSpecification(encryptionSpecification.let(EncryptionSpecificationProperty.Companion::unwrap))
    }

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
     * @param encryptionSpecification The encryption at rest options for the table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b052269454814355570c6aac83180d224f12e28d7e33efe86c977752a15163aa")
    override
        fun encryptionSpecification(encryptionSpecification: EncryptionSpecificationProperty.Builder.() -> Unit):
        Unit = encryptionSpecification(EncryptionSpecificationProperty(encryptionSpecification))

    /**
     * The name of the keyspace to create the table in.
     *
     * The keyspace must already exist.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-keyspacename)
     * @param keyspaceName The name of the keyspace to create the table in. 
     */
    override fun keyspaceName(keyspaceName: String) {
      cdkBuilder.keyspaceName(keyspaceName)
    }

    /**
     * One or more columns that uniquely identify every row in the table.
     *
     * Every table must have a partition key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-partitionkeycolumns)
     * @param partitionKeyColumns One or more columns that uniquely identify every row in the table.
     * 
     */
    override fun partitionKeyColumns(partitionKeyColumns: IResolvable) {
      cdkBuilder.partitionKeyColumns(partitionKeyColumns.let(IResolvable.Companion::unwrap))
    }

    /**
     * One or more columns that uniquely identify every row in the table.
     *
     * Every table must have a partition key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-partitionkeycolumns)
     * @param partitionKeyColumns One or more columns that uniquely identify every row in the table.
     * 
     */
    override fun partitionKeyColumns(partitionKeyColumns: List<Any>) {
      cdkBuilder.partitionKeyColumns(partitionKeyColumns.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * One or more columns that uniquely identify every row in the table.
     *
     * Every table must have a partition key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-partitionkeycolumns)
     * @param partitionKeyColumns One or more columns that uniquely identify every row in the table.
     * 
     */
    override fun partitionKeyColumns(vararg partitionKeyColumns: Any): Unit =
        partitionKeyColumns(partitionKeyColumns.toList())

    /**
     * Specifies if point-in-time recovery is enabled or disabled for the table.
     *
     * The options are `PointInTimeRecoveryEnabled=true` and `PointInTimeRecoveryEnabled=false` . If
     * not specified, the default is `PointInTimeRecoveryEnabled=false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-pointintimerecoveryenabled)
     * @param pointInTimeRecoveryEnabled Specifies if point-in-time recovery is enabled or disabled
     * for the table. 
     */
    override fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: Boolean) {
      cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled)
    }

    /**
     * Specifies if point-in-time recovery is enabled or disabled for the table.
     *
     * The options are `PointInTimeRecoveryEnabled=true` and `PointInTimeRecoveryEnabled=false` . If
     * not specified, the default is `PointInTimeRecoveryEnabled=false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-pointintimerecoveryenabled)
     * @param pointInTimeRecoveryEnabled Specifies if point-in-time recovery is enabled or disabled
     * for the table. 
     */
    override fun pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled: IResolvable) {
      cdkBuilder.pointInTimeRecoveryEnabled(pointInTimeRecoveryEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * One or more columns that are not part of the primary key - that is, columns that are *not*
     * defined as partition key columns or clustering key columns.
     *
     * You can add regular columns to existing tables by adding them to the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-regularcolumns)
     * @param regularColumns One or more columns that are not part of the primary key - that is,
     * columns that are *not* defined as partition key columns or clustering key columns. 
     */
    override fun regularColumns(regularColumns: IResolvable) {
      cdkBuilder.regularColumns(regularColumns.let(IResolvable.Companion::unwrap))
    }

    /**
     * One or more columns that are not part of the primary key - that is, columns that are *not*
     * defined as partition key columns or clustering key columns.
     *
     * You can add regular columns to existing tables by adding them to the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-regularcolumns)
     * @param regularColumns One or more columns that are not part of the primary key - that is,
     * columns that are *not* defined as partition key columns or clustering key columns. 
     */
    override fun regularColumns(regularColumns: List<Any>) {
      cdkBuilder.regularColumns(regularColumns.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * One or more columns that are not part of the primary key - that is, columns that are *not*
     * defined as partition key columns or clustering key columns.
     *
     * You can add regular columns to existing tables by adding them to the template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-regularcolumns)
     * @param regularColumns One or more columns that are not part of the primary key - that is,
     * columns that are *not* defined as partition key columns or clustering key columns. 
     */
    override fun regularColumns(vararg regularColumns: Any): Unit =
        regularColumns(regularColumns.toList())

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
     * @param replicaSpecifications The AWS Region specific settings of a multi-Region table. 
     */
    override fun replicaSpecifications(replicaSpecifications: IResolvable) {
      cdkBuilder.replicaSpecifications(replicaSpecifications.let(IResolvable.Companion::unwrap))
    }

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
     * @param replicaSpecifications The AWS Region specific settings of a multi-Region table. 
     */
    override fun replicaSpecifications(replicaSpecifications: List<Any>) {
      cdkBuilder.replicaSpecifications(replicaSpecifications.map{CdkObjectWrappers.unwrap(it)})
    }

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
     * @param replicaSpecifications The AWS Region specific settings of a multi-Region table. 
     */
    override fun replicaSpecifications(vararg replicaSpecifications: Any): Unit =
        replicaSpecifications(replicaSpecifications.toList())

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
     * @param tableName The name of the table to be created. 
     */
    override fun tableName(tableName: String) {
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
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cassandra.CfnTable = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cassandra.CfnTable.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable): CfnTable =
        CfnTable(cdkObject)

    internal fun unwrap(wrapped: CfnTable): software.amazon.awscdk.services.cassandra.CfnTable =
        wrapped.cdkObject as software.amazon.awscdk.services.cassandra.CfnTable
  }

  /**
   * The optional auto scaling settings for a table with provisioned throughput capacity.
   *
   * To turn on auto scaling for a table in `throughputMode:PROVISIONED` , you must specify the
   * following parameters.
   *
   * Configure the minimum and maximum capacity units. The auto scaling policy ensures that capacity
   * never goes below the minimum or above the maximum range.
   *
   * * `minimumUnits` : The minimum level of throughput the table should always be ready to support.
   * The value must be between 1 and the max throughput per second quota for your account (40,000 by
   * default).
   * * `maximumUnits` : The maximum level of throughput the table should always be ready to support.
   * The value must be between 1 and the max throughput per second quota for your account (40,000 by
   * default).
   * * `scalingPolicy` : Amazon Keyspaces supports the `target tracking` scaling policy. The auto
   * scaling target is a percentage of the provisioned capacity of the table.
   *
   * For more information, see [Managing throughput capacity automatically with Amazon Keyspaces
   * auto scaling](https://docs.aws.amazon.com/keyspaces/latest/devguide/autoscaling.html) in the
   * *Amazon Keyspaces Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cassandra.*;
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
  public interface AutoScalingSettingProperty {
    /**
     * This optional parameter enables auto scaling for the table if set to `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingsetting.html#cfn-cassandra-table-autoscalingsetting-autoscalingdisabled)
     */
    public fun autoScalingDisabled(): Any? = unwrap(this).getAutoScalingDisabled()

    /**
     * Manage costs by specifying the maximum amount of throughput to provision.
     *
     * The value must be between 1 and the max throughput per second quota for your account (40,000
     * by default).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingsetting.html#cfn-cassandra-table-autoscalingsetting-maximumunits)
     */
    public fun maximumUnits(): Number? = unwrap(this).getMaximumUnits()

    /**
     * The minimum level of throughput the table should always be ready to support.
     *
     * The value must be between 1 and the max throughput per second quota for your account (40,000
     * by default).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingsetting.html#cfn-cassandra-table-autoscalingsetting-minimumunits)
     */
    public fun minimumUnits(): Number? = unwrap(this).getMinimumUnits()

    /**
     * Amazon Keyspaces supports the `target tracking` auto scaling policy.
     *
     * With this policy, Amazon Keyspaces auto scaling ensures that the table's ratio of consumed to
     * provisioned capacity stays at or near the target value that you specify. You define the target
     * value as a percentage between 20 and 90.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingsetting.html#cfn-cassandra-table-autoscalingsetting-scalingpolicy)
     */
    public fun scalingPolicy(): Any? = unwrap(this).getScalingPolicy()

    /**
     * A builder for [AutoScalingSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoScalingDisabled This optional parameter enables auto scaling for the table if
       * set to `false` .
       */
      public fun autoScalingDisabled(autoScalingDisabled: Boolean)

      /**
       * @param autoScalingDisabled This optional parameter enables auto scaling for the table if
       * set to `false` .
       */
      public fun autoScalingDisabled(autoScalingDisabled: IResolvable)

      /**
       * @param maximumUnits Manage costs by specifying the maximum amount of throughput to
       * provision.
       * The value must be between 1 and the max throughput per second quota for your account
       * (40,000 by default).
       */
      public fun maximumUnits(maximumUnits: Number)

      /**
       * @param minimumUnits The minimum level of throughput the table should always be ready to
       * support.
       * The value must be between 1 and the max throughput per second quota for your account
       * (40,000 by default).
       */
      public fun minimumUnits(minimumUnits: Number)

      /**
       * @param scalingPolicy Amazon Keyspaces supports the `target tracking` auto scaling policy.
       * With this policy, Amazon Keyspaces auto scaling ensures that the table's ratio of consumed
       * to provisioned capacity stays at or near the target value that you specify. You define the
       * target value as a percentage between 20 and 90.
       */
      public fun scalingPolicy(scalingPolicy: IResolvable)

      /**
       * @param scalingPolicy Amazon Keyspaces supports the `target tracking` auto scaling policy.
       * With this policy, Amazon Keyspaces auto scaling ensures that the table's ratio of consumed
       * to provisioned capacity stays at or near the target value that you specify. You define the
       * target value as a percentage between 20 and 90.
       */
      public fun scalingPolicy(scalingPolicy: ScalingPolicyProperty)

      /**
       * @param scalingPolicy Amazon Keyspaces supports the `target tracking` auto scaling policy.
       * With this policy, Amazon Keyspaces auto scaling ensures that the table's ratio of consumed
       * to provisioned capacity stays at or near the target value that you specify. You define the
       * target value as a percentage between 20 and 90.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("53d2bbef462e8fe3680a3f07236b4bd7c8adab847dcbe52a82a427c23baadb48")
      public fun scalingPolicy(scalingPolicy: ScalingPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSettingProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSettingProperty.builder()

      /**
       * @param autoScalingDisabled This optional parameter enables auto scaling for the table if
       * set to `false` .
       */
      override fun autoScalingDisabled(autoScalingDisabled: Boolean) {
        cdkBuilder.autoScalingDisabled(autoScalingDisabled)
      }

      /**
       * @param autoScalingDisabled This optional parameter enables auto scaling for the table if
       * set to `false` .
       */
      override fun autoScalingDisabled(autoScalingDisabled: IResolvable) {
        cdkBuilder.autoScalingDisabled(autoScalingDisabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param maximumUnits Manage costs by specifying the maximum amount of throughput to
       * provision.
       * The value must be between 1 and the max throughput per second quota for your account
       * (40,000 by default).
       */
      override fun maximumUnits(maximumUnits: Number) {
        cdkBuilder.maximumUnits(maximumUnits)
      }

      /**
       * @param minimumUnits The minimum level of throughput the table should always be ready to
       * support.
       * The value must be between 1 and the max throughput per second quota for your account
       * (40,000 by default).
       */
      override fun minimumUnits(minimumUnits: Number) {
        cdkBuilder.minimumUnits(minimumUnits)
      }

      /**
       * @param scalingPolicy Amazon Keyspaces supports the `target tracking` auto scaling policy.
       * With this policy, Amazon Keyspaces auto scaling ensures that the table's ratio of consumed
       * to provisioned capacity stays at or near the target value that you specify. You define the
       * target value as a percentage between 20 and 90.
       */
      override fun scalingPolicy(scalingPolicy: IResolvable) {
        cdkBuilder.scalingPolicy(scalingPolicy.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param scalingPolicy Amazon Keyspaces supports the `target tracking` auto scaling policy.
       * With this policy, Amazon Keyspaces auto scaling ensures that the table's ratio of consumed
       * to provisioned capacity stays at or near the target value that you specify. You define the
       * target value as a percentage between 20 and 90.
       */
      override fun scalingPolicy(scalingPolicy: ScalingPolicyProperty) {
        cdkBuilder.scalingPolicy(scalingPolicy.let(ScalingPolicyProperty.Companion::unwrap))
      }

      /**
       * @param scalingPolicy Amazon Keyspaces supports the `target tracking` auto scaling policy.
       * With this policy, Amazon Keyspaces auto scaling ensures that the table's ratio of consumed
       * to provisioned capacity stays at or near the target value that you specify. You define the
       * target value as a percentage between 20 and 90.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("53d2bbef462e8fe3680a3f07236b4bd7c8adab847dcbe52a82a427c23baadb48")
      override fun scalingPolicy(scalingPolicy: ScalingPolicyProperty.Builder.() -> Unit): Unit =
          scalingPolicy(ScalingPolicyProperty(scalingPolicy))

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSettingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSettingProperty,
    ) : CdkObject(cdkObject),
        AutoScalingSettingProperty {
      /**
       * This optional parameter enables auto scaling for the table if set to `false` .
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingsetting.html#cfn-cassandra-table-autoscalingsetting-autoscalingdisabled)
       */
      override fun autoScalingDisabled(): Any? = unwrap(this).getAutoScalingDisabled()

      /**
       * Manage costs by specifying the maximum amount of throughput to provision.
       *
       * The value must be between 1 and the max throughput per second quota for your account
       * (40,000 by default).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingsetting.html#cfn-cassandra-table-autoscalingsetting-maximumunits)
       */
      override fun maximumUnits(): Number? = unwrap(this).getMaximumUnits()

      /**
       * The minimum level of throughput the table should always be ready to support.
       *
       * The value must be between 1 and the max throughput per second quota for your account
       * (40,000 by default).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingsetting.html#cfn-cassandra-table-autoscalingsetting-minimumunits)
       */
      override fun minimumUnits(): Number? = unwrap(this).getMinimumUnits()

      /**
       * Amazon Keyspaces supports the `target tracking` auto scaling policy.
       *
       * With this policy, Amazon Keyspaces auto scaling ensures that the table's ratio of consumed
       * to provisioned capacity stays at or near the target value that you specify. You define the
       * target value as a percentage between 20 and 90.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingsetting.html#cfn-cassandra-table-autoscalingsetting-scalingpolicy)
       */
      override fun scalingPolicy(): Any? = unwrap(this).getScalingPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSettingProperty):
          AutoScalingSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutoScalingSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingSettingProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSettingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSettingProperty
    }
  }

  /**
   * The optional auto scaling capacity settings for a table in provisioned capacity mode.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cassandra.*;
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
  public interface AutoScalingSpecificationProperty {
    /**
     * The auto scaling settings for the table's read capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingspecification.html#cfn-cassandra-table-autoscalingspecification-readcapacityautoscaling)
     */
    public fun readCapacityAutoScaling(): Any? = unwrap(this).getReadCapacityAutoScaling()

    /**
     * The auto scaling settings for the table's write capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingspecification.html#cfn-cassandra-table-autoscalingspecification-writecapacityautoscaling)
     */
    public fun writeCapacityAutoScaling(): Any? = unwrap(this).getWriteCapacityAutoScaling()

    /**
     * A builder for [AutoScalingSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param readCapacityAutoScaling The auto scaling settings for the table's read capacity.
       */
      public fun readCapacityAutoScaling(readCapacityAutoScaling: IResolvable)

      /**
       * @param readCapacityAutoScaling The auto scaling settings for the table's read capacity.
       */
      public fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty)

      /**
       * @param readCapacityAutoScaling The auto scaling settings for the table's read capacity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70e2f1cb5478a4cbae1d99c8d7df305cf0dcdd513f625d7ebc4c9c89e495ded8")
      public
          fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty.Builder.() -> Unit)

      /**
       * @param writeCapacityAutoScaling The auto scaling settings for the table's write capacity.
       */
      public fun writeCapacityAutoScaling(writeCapacityAutoScaling: IResolvable)

      /**
       * @param writeCapacityAutoScaling The auto scaling settings for the table's write capacity.
       */
      public fun writeCapacityAutoScaling(writeCapacityAutoScaling: AutoScalingSettingProperty)

      /**
       * @param writeCapacityAutoScaling The auto scaling settings for the table's write capacity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe683f396f3380315b3d21fe213e16fbe5bd7f327ac1abebef53993bc080cc5d")
      public
          fun writeCapacityAutoScaling(writeCapacityAutoScaling: AutoScalingSettingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSpecificationProperty.builder()

      /**
       * @param readCapacityAutoScaling The auto scaling settings for the table's read capacity.
       */
      override fun readCapacityAutoScaling(readCapacityAutoScaling: IResolvable) {
        cdkBuilder.readCapacityAutoScaling(readCapacityAutoScaling.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param readCapacityAutoScaling The auto scaling settings for the table's read capacity.
       */
      override fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty) {
        cdkBuilder.readCapacityAutoScaling(readCapacityAutoScaling.let(AutoScalingSettingProperty.Companion::unwrap))
      }

      /**
       * @param readCapacityAutoScaling The auto scaling settings for the table's read capacity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70e2f1cb5478a4cbae1d99c8d7df305cf0dcdd513f625d7ebc4c9c89e495ded8")
      override
          fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty.Builder.() -> Unit):
          Unit = readCapacityAutoScaling(AutoScalingSettingProperty(readCapacityAutoScaling))

      /**
       * @param writeCapacityAutoScaling The auto scaling settings for the table's write capacity.
       */
      override fun writeCapacityAutoScaling(writeCapacityAutoScaling: IResolvable) {
        cdkBuilder.writeCapacityAutoScaling(writeCapacityAutoScaling.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param writeCapacityAutoScaling The auto scaling settings for the table's write capacity.
       */
      override fun writeCapacityAutoScaling(writeCapacityAutoScaling: AutoScalingSettingProperty) {
        cdkBuilder.writeCapacityAutoScaling(writeCapacityAutoScaling.let(AutoScalingSettingProperty.Companion::unwrap))
      }

      /**
       * @param writeCapacityAutoScaling The auto scaling settings for the table's write capacity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fe683f396f3380315b3d21fe213e16fbe5bd7f327ac1abebef53993bc080cc5d")
      override
          fun writeCapacityAutoScaling(writeCapacityAutoScaling: AutoScalingSettingProperty.Builder.() -> Unit):
          Unit = writeCapacityAutoScaling(AutoScalingSettingProperty(writeCapacityAutoScaling))

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSpecificationProperty,
    ) : CdkObject(cdkObject),
        AutoScalingSpecificationProperty {
      /**
       * The auto scaling settings for the table's read capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingspecification.html#cfn-cassandra-table-autoscalingspecification-readcapacityautoscaling)
       */
      override fun readCapacityAutoScaling(): Any? = unwrap(this).getReadCapacityAutoScaling()

      /**
       * The auto scaling settings for the table's write capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingspecification.html#cfn-cassandra-table-autoscalingspecification-writecapacityautoscaling)
       */
      override fun writeCapacityAutoScaling(): Any? = unwrap(this).getWriteCapacityAutoScaling()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AutoScalingSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSpecificationProperty):
          AutoScalingSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AutoScalingSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AutoScalingSpecificationProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cassandra.CfnTable.AutoScalingSpecificationProperty
    }
  }

  /**
   * Determines the billing mode for the table - on-demand or provisioned.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cassandra.*;
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
  public interface BillingModeProperty {
    /**
     * The billing mode for the table:.
     *
     * * On-demand mode - `ON_DEMAND`
     * * Provisioned mode - `PROVISIONED`
     *
     *
     * If you choose `PROVISIONED` mode, then you also need to specify provisioned throughput (read
     * and write capacity) for the table.
     *
     *
     * Valid values: `ON_DEMAND` | `PROVISIONED`
     *
     * Default: - "ON_DEMAND"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-billingmode.html#cfn-cassandra-table-billingmode-mode)
     */
    public fun mode(): String

    /**
     * The provisioned read capacity and write capacity for the table.
     *
     * For more information, see [Provisioned throughput capacity
     * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html#ReadWriteCapacityMode.Provisioned)
     * in the *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-billingmode.html#cfn-cassandra-table-billingmode-provisionedthroughput)
     */
    public fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()

    /**
     * A builder for [BillingModeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mode The billing mode for the table:. 
       * * On-demand mode - `ON_DEMAND`
       * * Provisioned mode - `PROVISIONED`
       *
       *
       * If you choose `PROVISIONED` mode, then you also need to specify provisioned throughput
       * (read and write capacity) for the table.
       *
       *
       * Valid values: `ON_DEMAND` | `PROVISIONED`
       */
      public fun mode(mode: String)

      /**
       * @param provisionedThroughput The provisioned read capacity and write capacity for the
       * table.
       * For more information, see [Provisioned throughput capacity
       * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html#ReadWriteCapacityMode.Provisioned)
       * in the *Amazon Keyspaces Developer Guide* .
       */
      public fun provisionedThroughput(provisionedThroughput: IResolvable)

      /**
       * @param provisionedThroughput The provisioned read capacity and write capacity for the
       * table.
       * For more information, see [Provisioned throughput capacity
       * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html#ReadWriteCapacityMode.Provisioned)
       * in the *Amazon Keyspaces Developer Guide* .
       */
      public fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty)

      /**
       * @param provisionedThroughput The provisioned read capacity and write capacity for the
       * table.
       * For more information, see [Provisioned throughput capacity
       * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html#ReadWriteCapacityMode.Provisioned)
       * in the *Amazon Keyspaces Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6229fc1deb4ce36008eb6519392ee66844b20166c36bebacd90cc6680480125e")
      public
          fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty.builder()

      /**
       * @param mode The billing mode for the table:. 
       * * On-demand mode - `ON_DEMAND`
       * * Provisioned mode - `PROVISIONED`
       *
       *
       * If you choose `PROVISIONED` mode, then you also need to specify provisioned throughput
       * (read and write capacity) for the table.
       *
       *
       * Valid values: `ON_DEMAND` | `PROVISIONED`
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      /**
       * @param provisionedThroughput The provisioned read capacity and write capacity for the
       * table.
       * For more information, see [Provisioned throughput capacity
       * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html#ReadWriteCapacityMode.Provisioned)
       * in the *Amazon Keyspaces Developer Guide* .
       */
      override fun provisionedThroughput(provisionedThroughput: IResolvable) {
        cdkBuilder.provisionedThroughput(provisionedThroughput.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param provisionedThroughput The provisioned read capacity and write capacity for the
       * table.
       * For more information, see [Provisioned throughput capacity
       * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html#ReadWriteCapacityMode.Provisioned)
       * in the *Amazon Keyspaces Developer Guide* .
       */
      override fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty) {
        cdkBuilder.provisionedThroughput(provisionedThroughput.let(ProvisionedThroughputProperty.Companion::unwrap))
      }

      /**
       * @param provisionedThroughput The provisioned read capacity and write capacity for the
       * table.
       * For more information, see [Provisioned throughput capacity
       * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html#ReadWriteCapacityMode.Provisioned)
       * in the *Amazon Keyspaces Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6229fc1deb4ce36008eb6519392ee66844b20166c36bebacd90cc6680480125e")
      override
          fun provisionedThroughput(provisionedThroughput: ProvisionedThroughputProperty.Builder.() -> Unit):
          Unit = provisionedThroughput(ProvisionedThroughputProperty(provisionedThroughput))

      public fun build(): software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty,
    ) : CdkObject(cdkObject),
        BillingModeProperty {
      /**
       * The billing mode for the table:.
       *
       * * On-demand mode - `ON_DEMAND`
       * * Provisioned mode - `PROVISIONED`
       *
       *
       * If you choose `PROVISIONED` mode, then you also need to specify provisioned throughput
       * (read and write capacity) for the table.
       *
       *
       * Valid values: `ON_DEMAND` | `PROVISIONED`
       *
       * Default: - "ON_DEMAND"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-billingmode.html#cfn-cassandra-table-billingmode-mode)
       */
      override fun mode(): String = unwrap(this).getMode()

      /**
       * The provisioned read capacity and write capacity for the table.
       *
       * For more information, see [Provisioned throughput capacity
       * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html#ReadWriteCapacityMode.Provisioned)
       * in the *Amazon Keyspaces Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-billingmode.html#cfn-cassandra-table-billingmode-provisionedthroughput)
       */
      override fun provisionedThroughput(): Any? = unwrap(this).getProvisionedThroughput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BillingModeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty):
          BillingModeProperty = CdkObjectWrappers.wrap(cdkObject) as? BillingModeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: BillingModeProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cassandra.CfnTable.BillingModeProperty
    }
  }

  /**
   * The settings for the CDC stream of a table.
   *
   * For more information about CDC streams, see [Working with change data capture (CDC) streams in
   * Amazon Keyspaces](https://docs.aws.amazon.com/keyspaces/latest/devguide/cdc.html) in the *Amazon
   * Keyspaces Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cassandra.*;
   * CdcSpecificationProperty cdcSpecificationProperty = CdcSpecificationProperty.builder()
   * .status("status")
   * // the properties below are optional
   * .viewType("viewType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-cdcspecification.html)
   */
  public interface CdcSpecificationProperty {
    /**
     * The status of the CDC stream.
     *
     * You can enable or disable a stream for a table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-cdcspecification.html#cfn-cassandra-table-cdcspecification-status)
     */
    public fun status(): String

    /**
     * The view type specifies the changes Amazon Keyspaces records for each changed row in the
     * stream.
     *
     * After you create the stream, you can't make changes to this selection.
     *
     * The options are:
     *
     * * `NEW_AND_OLD_IMAGES` - both versions of the row, before and after the change. This is the
     * default.
     * * `NEW_IMAGE` - the version of the row after the change.
     * * `OLD_IMAGE` - the version of the row before the change.
     * * `KEYS_ONLY` - the partition and clustering keys of the row that was changed.
     *
     * Default: - "NEW_AND_OLD_IMAGES"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-cdcspecification.html#cfn-cassandra-table-cdcspecification-viewtype)
     */
    public fun viewType(): String? = unwrap(this).getViewType()

    /**
     * A builder for [CdcSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param status The status of the CDC stream. 
       * You can enable or disable a stream for a table.
       */
      public fun status(status: String)

      /**
       * @param viewType The view type specifies the changes Amazon Keyspaces records for each
       * changed row in the stream.
       * After you create the stream, you can't make changes to this selection.
       *
       * The options are:
       *
       * * `NEW_AND_OLD_IMAGES` - both versions of the row, before and after the change. This is the
       * default.
       * * `NEW_IMAGE` - the version of the row after the change.
       * * `OLD_IMAGE` - the version of the row before the change.
       * * `KEYS_ONLY` - the partition and clustering keys of the row that was changed.
       */
      public fun viewType(viewType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.CdcSpecificationProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnTable.CdcSpecificationProperty.builder()

      /**
       * @param status The status of the CDC stream. 
       * You can enable or disable a stream for a table.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param viewType The view type specifies the changes Amazon Keyspaces records for each
       * changed row in the stream.
       * After you create the stream, you can't make changes to this selection.
       *
       * The options are:
       *
       * * `NEW_AND_OLD_IMAGES` - both versions of the row, before and after the change. This is the
       * default.
       * * `NEW_IMAGE` - the version of the row after the change.
       * * `OLD_IMAGE` - the version of the row before the change.
       * * `KEYS_ONLY` - the partition and clustering keys of the row that was changed.
       */
      override fun viewType(viewType: String) {
        cdkBuilder.viewType(viewType)
      }

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnTable.CdcSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.CdcSpecificationProperty,
    ) : CdkObject(cdkObject),
        CdcSpecificationProperty {
      /**
       * The status of the CDC stream.
       *
       * You can enable or disable a stream for a table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-cdcspecification.html#cfn-cassandra-table-cdcspecification-status)
       */
      override fun status(): String = unwrap(this).getStatus()

      /**
       * The view type specifies the changes Amazon Keyspaces records for each changed row in the
       * stream.
       *
       * After you create the stream, you can't make changes to this selection.
       *
       * The options are:
       *
       * * `NEW_AND_OLD_IMAGES` - both versions of the row, before and after the change. This is the
       * default.
       * * `NEW_IMAGE` - the version of the row after the change.
       * * `OLD_IMAGE` - the version of the row before the change.
       * * `KEYS_ONLY` - the partition and clustering keys of the row that was changed.
       *
       * Default: - "NEW_AND_OLD_IMAGES"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-cdcspecification.html#cfn-cassandra-table-cdcspecification-viewtype)
       */
      override fun viewType(): String? = unwrap(this).getViewType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CdcSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.CdcSpecificationProperty):
          CdcSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as? CdcSpecificationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CdcSpecificationProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.CdcSpecificationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cassandra.CfnTable.CdcSpecificationProperty
    }
  }

  /**
   * Defines an individual column within the clustering key.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cassandra.*;
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
  public interface ClusteringKeyColumnProperty {
    /**
     * The name and data type of this clustering key column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-clusteringkeycolumn.html#cfn-cassandra-table-clusteringkeycolumn-column)
     */
    public fun column(): Any

    /**
     * The order in which this column's data is stored:.
     *
     * * `ASC` (default) - The column's data is stored in ascending order.
     * * `DESC` - The column's data is stored in descending order.
     *
     * Default: - "ASC"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-clusteringkeycolumn.html#cfn-cassandra-table-clusteringkeycolumn-orderby)
     */
    public fun orderBy(): String? = unwrap(this).getOrderBy()

    /**
     * A builder for [ClusteringKeyColumnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param column The name and data type of this clustering key column. 
       */
      public fun column(column: IResolvable)

      /**
       * @param column The name and data type of this clustering key column. 
       */
      public fun column(column: ColumnProperty)

      /**
       * @param column The name and data type of this clustering key column. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1719c3c601457175d08dcf7402b4c82cda20c2e09b59385102ee0c6f5af0e8cb")
      public fun column(column: ColumnProperty.Builder.() -> Unit)

      /**
       * @param orderBy The order in which this column's data is stored:.
       * * `ASC` (default) - The column's data is stored in ascending order.
       * * `DESC` - The column's data is stored in descending order.
       */
      public fun orderBy(orderBy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty.builder()

      /**
       * @param column The name and data type of this clustering key column. 
       */
      override fun column(column: IResolvable) {
        cdkBuilder.column(column.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param column The name and data type of this clustering key column. 
       */
      override fun column(column: ColumnProperty) {
        cdkBuilder.column(column.let(ColumnProperty.Companion::unwrap))
      }

      /**
       * @param column The name and data type of this clustering key column. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1719c3c601457175d08dcf7402b4c82cda20c2e09b59385102ee0c6f5af0e8cb")
      override fun column(column: ColumnProperty.Builder.() -> Unit): Unit =
          column(ColumnProperty(column))

      /**
       * @param orderBy The order in which this column's data is stored:.
       * * `ASC` (default) - The column's data is stored in ascending order.
       * * `DESC` - The column's data is stored in descending order.
       */
      override fun orderBy(orderBy: String) {
        cdkBuilder.orderBy(orderBy)
      }

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty,
    ) : CdkObject(cdkObject),
        ClusteringKeyColumnProperty {
      /**
       * The name and data type of this clustering key column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-clusteringkeycolumn.html#cfn-cassandra-table-clusteringkeycolumn-column)
       */
      override fun column(): Any = unwrap(this).getColumn()

      /**
       * The order in which this column's data is stored:.
       *
       * * `ASC` (default) - The column's data is stored in ascending order.
       * * `DESC` - The column's data is stored in descending order.
       *
       * Default: - "ASC"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-clusteringkeycolumn.html#cfn-cassandra-table-clusteringkeycolumn-orderby)
       */
      override fun orderBy(): String? = unwrap(this).getOrderBy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusteringKeyColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty):
          ClusteringKeyColumnProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ClusteringKeyColumnProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusteringKeyColumnProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cassandra.CfnTable.ClusteringKeyColumnProperty
    }
  }

  /**
   * The name and data type of an individual column in a table.
   *
   * In addition to the data type, you can also use the following two keywords:
   *
   * * `STATIC` if the table has a clustering column. Static columns store values that are shared by
   * all rows in the same partition.
   * * `FROZEN` for collection data types. In frozen collections the values of the collection are
   * serialized into a single immutable value, and Amazon Keyspaces treats them like a `BLOB` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cassandra.*;
   * ColumnProperty columnProperty = ColumnProperty.builder()
   * .columnName("columnName")
   * .columnType("columnType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html)
   */
  public interface ColumnProperty {
    /**
     * The name of the column.
     *
     * For more information, see
     * [Identifiers](https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.elements.identifier)
     * in the *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html#cfn-cassandra-table-column-columnname)
     */
    public fun columnName(): String

    /**
     * The data type of the column.
     *
     * For more information, see [Data
     * types](https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types)
     * in the *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html#cfn-cassandra-table-column-columntype)
     */
    public fun columnType(): String

    /**
     * A builder for [ColumnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columnName The name of the column. 
       * For more information, see
       * [Identifiers](https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.elements.identifier)
       * in the *Amazon Keyspaces Developer Guide* .
       */
      public fun columnName(columnName: String)

      /**
       * @param columnType The data type of the column. 
       * For more information, see [Data
       * types](https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types)
       * in the *Amazon Keyspaces Developer Guide* .
       */
      public fun columnType(columnType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty.builder()

      /**
       * @param columnName The name of the column. 
       * For more information, see
       * [Identifiers](https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.elements.identifier)
       * in the *Amazon Keyspaces Developer Guide* .
       */
      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      /**
       * @param columnType The data type of the column. 
       * For more information, see [Data
       * types](https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types)
       * in the *Amazon Keyspaces Developer Guide* .
       */
      override fun columnType(columnType: String) {
        cdkBuilder.columnType(columnType)
      }

      public fun build(): software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty,
    ) : CdkObject(cdkObject),
        ColumnProperty {
      /**
       * The name of the column.
       *
       * For more information, see
       * [Identifiers](https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.elements.identifier)
       * in the *Amazon Keyspaces Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html#cfn-cassandra-table-column-columnname)
       */
      override fun columnName(): String = unwrap(this).getColumnName()

      /**
       * The data type of the column.
       *
       * For more information, see [Data
       * types](https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types)
       * in the *Amazon Keyspaces Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html#cfn-cassandra-table-column-columntype)
       */
      override fun columnType(): String = unwrap(this).getColumnType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty):
          ColumnProperty = CdkObjectWrappers.wrap(cdkObject) as? ColumnProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.cassandra.CfnTable.ColumnProperty
    }
  }

  /**
   * Specifies the encryption at rest option selected for the table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cassandra.*;
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
  public interface EncryptionSpecificationProperty {
    /**
     * The encryption at rest options for the table.
     *
     * * *AWS owned key* (default) - `AWS_OWNED_KMS_KEY`
     * * *Customer managed key* - `CUSTOMER_MANAGED_KMS_KEY`
     *
     *
     * If you choose `CUSTOMER_MANAGED_KMS_KEY` , a `kms_key_identifier` in the format of a key ARN
     * is required.
     *
     *
     * Valid values: `CUSTOMER_MANAGED_KMS_KEY` | `AWS_OWNED_KMS_KEY` .
     *
     * Default: - "AWS_OWNED_KMS_KEY"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-encryptionspecification.html#cfn-cassandra-table-encryptionspecification-encryptiontype)
     */
    public fun encryptionType(): String

    /**
     * Requires a `kms_key_identifier` in the format of a key ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-encryptionspecification.html#cfn-cassandra-table-encryptionspecification-kmskeyidentifier)
     */
    public fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

    /**
     * A builder for [EncryptionSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionType The encryption at rest options for the table. 
       * * *AWS owned key* (default) - `AWS_OWNED_KMS_KEY`
       * * *Customer managed key* - `CUSTOMER_MANAGED_KMS_KEY`
       *
       *
       * If you choose `CUSTOMER_MANAGED_KMS_KEY` , a `kms_key_identifier` in the format of a key
       * ARN is required.
       *
       *
       * Valid values: `CUSTOMER_MANAGED_KMS_KEY` | `AWS_OWNED_KMS_KEY` .
       */
      public fun encryptionType(encryptionType: String)

      /**
       * @param kmsKeyIdentifier Requires a `kms_key_identifier` in the format of a key ARN.
       */
      public fun kmsKeyIdentifier(kmsKeyIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty.builder()

      /**
       * @param encryptionType The encryption at rest options for the table. 
       * * *AWS owned key* (default) - `AWS_OWNED_KMS_KEY`
       * * *Customer managed key* - `CUSTOMER_MANAGED_KMS_KEY`
       *
       *
       * If you choose `CUSTOMER_MANAGED_KMS_KEY` , a `kms_key_identifier` in the format of a key
       * ARN is required.
       *
       *
       * Valid values: `CUSTOMER_MANAGED_KMS_KEY` | `AWS_OWNED_KMS_KEY` .
       */
      override fun encryptionType(encryptionType: String) {
        cdkBuilder.encryptionType(encryptionType)
      }

      /**
       * @param kmsKeyIdentifier Requires a `kms_key_identifier` in the format of a key ARN.
       */
      override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
        cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty,
    ) : CdkObject(cdkObject),
        EncryptionSpecificationProperty {
      /**
       * The encryption at rest options for the table.
       *
       * * *AWS owned key* (default) - `AWS_OWNED_KMS_KEY`
       * * *Customer managed key* - `CUSTOMER_MANAGED_KMS_KEY`
       *
       *
       * If you choose `CUSTOMER_MANAGED_KMS_KEY` , a `kms_key_identifier` in the format of a key
       * ARN is required.
       *
       *
       * Valid values: `CUSTOMER_MANAGED_KMS_KEY` | `AWS_OWNED_KMS_KEY` .
       *
       * Default: - "AWS_OWNED_KMS_KEY"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-encryptionspecification.html#cfn-cassandra-table-encryptionspecification-encryptiontype)
       */
      override fun encryptionType(): String = unwrap(this).getEncryptionType()

      /**
       * Requires a `kms_key_identifier` in the format of a key ARN.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-encryptionspecification.html#cfn-cassandra-table-encryptionspecification-kmskeyidentifier)
       */
      override fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty):
          EncryptionSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionSpecificationProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cassandra.CfnTable.EncryptionSpecificationProperty
    }
  }

  /**
   * The provisioned throughput for the table, which consists of `ReadCapacityUnits` and
   * `WriteCapacityUnits` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cassandra.*;
   * ProvisionedThroughputProperty provisionedThroughputProperty =
   * ProvisionedThroughputProperty.builder()
   * .readCapacityUnits(123)
   * .writeCapacityUnits(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-provisionedthroughput.html)
   */
  public interface ProvisionedThroughputProperty {
    /**
     * The amount of read capacity that's provisioned for the table.
     *
     * For more information, see [Read/write capacity
     * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html) in the
     * *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-provisionedthroughput.html#cfn-cassandra-table-provisionedthroughput-readcapacityunits)
     */
    public fun readCapacityUnits(): Number

    /**
     * The amount of write capacity that's provisioned for the table.
     *
     * For more information, see [Read/write capacity
     * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html) in the
     * *Amazon Keyspaces Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-provisionedthroughput.html#cfn-cassandra-table-provisionedthroughput-writecapacityunits)
     */
    public fun writeCapacityUnits(): Number

    /**
     * A builder for [ProvisionedThroughputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param readCapacityUnits The amount of read capacity that's provisioned for the table. 
       * For more information, see [Read/write capacity
       * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html) in the
       * *Amazon Keyspaces Developer Guide* .
       */
      public fun readCapacityUnits(readCapacityUnits: Number)

      /**
       * @param writeCapacityUnits The amount of write capacity that's provisioned for the table. 
       * For more information, see [Read/write capacity
       * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html) in the
       * *Amazon Keyspaces Developer Guide* .
       */
      public fun writeCapacityUnits(writeCapacityUnits: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty.builder()

      /**
       * @param readCapacityUnits The amount of read capacity that's provisioned for the table. 
       * For more information, see [Read/write capacity
       * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html) in the
       * *Amazon Keyspaces Developer Guide* .
       */
      override fun readCapacityUnits(readCapacityUnits: Number) {
        cdkBuilder.readCapacityUnits(readCapacityUnits)
      }

      /**
       * @param writeCapacityUnits The amount of write capacity that's provisioned for the table. 
       * For more information, see [Read/write capacity
       * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html) in the
       * *Amazon Keyspaces Developer Guide* .
       */
      override fun writeCapacityUnits(writeCapacityUnits: Number) {
        cdkBuilder.writeCapacityUnits(writeCapacityUnits)
      }

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty,
    ) : CdkObject(cdkObject),
        ProvisionedThroughputProperty {
      /**
       * The amount of read capacity that's provisioned for the table.
       *
       * For more information, see [Read/write capacity
       * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html) in the
       * *Amazon Keyspaces Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-provisionedthroughput.html#cfn-cassandra-table-provisionedthroughput-readcapacityunits)
       */
      override fun readCapacityUnits(): Number = unwrap(this).getReadCapacityUnits()

      /**
       * The amount of write capacity that's provisioned for the table.
       *
       * For more information, see [Read/write capacity
       * mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html) in the
       * *Amazon Keyspaces Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-provisionedthroughput.html#cfn-cassandra-table-provisionedthroughput-writecapacityunits)
       */
      override fun writeCapacityUnits(): Number = unwrap(this).getWriteCapacityUnits()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionedThroughputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty):
          ProvisionedThroughputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProvisionedThroughputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedThroughputProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cassandra.CfnTable.ProvisionedThroughputProperty
    }
  }

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
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cassandra.*;
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
  public interface ReplicaSpecificationProperty {
    /**
     * The read capacity auto scaling settings for the multi-Region table in the specified AWS
     * Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-replicaspecification.html#cfn-cassandra-table-replicaspecification-readcapacityautoscaling)
     */
    public fun readCapacityAutoScaling(): Any? = unwrap(this).getReadCapacityAutoScaling()

    /**
     * The provisioned read capacity units for the multi-Region table in the specified AWS Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-replicaspecification.html#cfn-cassandra-table-replicaspecification-readcapacityunits)
     */
    public fun readCapacityUnits(): Number? = unwrap(this).getReadCapacityUnits()

    /**
     * The AWS Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-replicaspecification.html#cfn-cassandra-table-replicaspecification-region)
     */
    public fun region(): String

    /**
     * A builder for [ReplicaSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param readCapacityAutoScaling The read capacity auto scaling settings for the multi-Region
       * table in the specified AWS Region.
       */
      public fun readCapacityAutoScaling(readCapacityAutoScaling: IResolvable)

      /**
       * @param readCapacityAutoScaling The read capacity auto scaling settings for the multi-Region
       * table in the specified AWS Region.
       */
      public fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty)

      /**
       * @param readCapacityAutoScaling The read capacity auto scaling settings for the multi-Region
       * table in the specified AWS Region.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7c8a80c817160ff83e18bab565ddc70e61f3fc146dcbb78e6ed386045600db9")
      public
          fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty.Builder.() -> Unit)

      /**
       * @param readCapacityUnits The provisioned read capacity units for the multi-Region table in
       * the specified AWS Region.
       */
      public fun readCapacityUnits(readCapacityUnits: Number)

      /**
       * @param region The AWS Region. 
       */
      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.ReplicaSpecificationProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnTable.ReplicaSpecificationProperty.builder()

      /**
       * @param readCapacityAutoScaling The read capacity auto scaling settings for the multi-Region
       * table in the specified AWS Region.
       */
      override fun readCapacityAutoScaling(readCapacityAutoScaling: IResolvable) {
        cdkBuilder.readCapacityAutoScaling(readCapacityAutoScaling.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param readCapacityAutoScaling The read capacity auto scaling settings for the multi-Region
       * table in the specified AWS Region.
       */
      override fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty) {
        cdkBuilder.readCapacityAutoScaling(readCapacityAutoScaling.let(AutoScalingSettingProperty.Companion::unwrap))
      }

      /**
       * @param readCapacityAutoScaling The read capacity auto scaling settings for the multi-Region
       * table in the specified AWS Region.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7c8a80c817160ff83e18bab565ddc70e61f3fc146dcbb78e6ed386045600db9")
      override
          fun readCapacityAutoScaling(readCapacityAutoScaling: AutoScalingSettingProperty.Builder.() -> Unit):
          Unit = readCapacityAutoScaling(AutoScalingSettingProperty(readCapacityAutoScaling))

      /**
       * @param readCapacityUnits The provisioned read capacity units for the multi-Region table in
       * the specified AWS Region.
       */
      override fun readCapacityUnits(readCapacityUnits: Number) {
        cdkBuilder.readCapacityUnits(readCapacityUnits)
      }

      /**
       * @param region The AWS Region. 
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnTable.ReplicaSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ReplicaSpecificationProperty,
    ) : CdkObject(cdkObject),
        ReplicaSpecificationProperty {
      /**
       * The read capacity auto scaling settings for the multi-Region table in the specified AWS
       * Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-replicaspecification.html#cfn-cassandra-table-replicaspecification-readcapacityautoscaling)
       */
      override fun readCapacityAutoScaling(): Any? = unwrap(this).getReadCapacityAutoScaling()

      /**
       * The provisioned read capacity units for the multi-Region table in the specified AWS Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-replicaspecification.html#cfn-cassandra-table-replicaspecification-readcapacityunits)
       */
      override fun readCapacityUnits(): Number? = unwrap(this).getReadCapacityUnits()

      /**
       * The AWS Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-replicaspecification.html#cfn-cassandra-table-replicaspecification-region)
       */
      override fun region(): String = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplicaSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ReplicaSpecificationProperty):
          ReplicaSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReplicaSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplicaSpecificationProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.ReplicaSpecificationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cassandra.CfnTable.ReplicaSpecificationProperty
    }
  }

  /**
   * Amazon Keyspaces supports the `target tracking` auto scaling policy.
   *
   * With this policy, Amazon Keyspaces auto scaling ensures that the table's ratio of consumed to
   * provisioned capacity stays at or near the target value that you specify. You define the target
   * value as a percentage between 20 and 90.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cassandra.*;
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
  public interface ScalingPolicyProperty {
    /**
     * The auto scaling policy that scales a table based on the ratio of consumed to provisioned
     * capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-scalingpolicy.html#cfn-cassandra-table-scalingpolicy-targettrackingscalingpolicyconfiguration)
     */
    public fun targetTrackingScalingPolicyConfiguration(): Any? =
        unwrap(this).getTargetTrackingScalingPolicyConfiguration()

    /**
     * A builder for [ScalingPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetTrackingScalingPolicyConfiguration The auto scaling policy that scales a table
       * based on the ratio of consumed to provisioned capacity.
       */
      public
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable)

      /**
       * @param targetTrackingScalingPolicyConfiguration The auto scaling policy that scales a table
       * based on the ratio of consumed to provisioned capacity.
       */
      public
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty)

      /**
       * @param targetTrackingScalingPolicyConfiguration The auto scaling policy that scales a table
       * based on the ratio of consumed to provisioned capacity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c0719136d5761003d3e30200cf94101b28345ce0596e84b87cc72daaeb879fb")
      public
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.ScalingPolicyProperty.Builder =
          software.amazon.awscdk.services.cassandra.CfnTable.ScalingPolicyProperty.builder()

      /**
       * @param targetTrackingScalingPolicyConfiguration The auto scaling policy that scales a table
       * based on the ratio of consumed to provisioned capacity.
       */
      override
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param targetTrackingScalingPolicyConfiguration The auto scaling policy that scales a table
       * based on the ratio of consumed to provisioned capacity.
       */
      override
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(TargetTrackingScalingPolicyConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param targetTrackingScalingPolicyConfiguration The auto scaling policy that scales a table
       * based on the ratio of consumed to provisioned capacity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c0719136d5761003d3e30200cf94101b28345ce0596e84b87cc72daaeb879fb")
      override
          fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit):
          Unit =
          targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty(targetTrackingScalingPolicyConfiguration))

      public fun build(): software.amazon.awscdk.services.cassandra.CfnTable.ScalingPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ScalingPolicyProperty,
    ) : CdkObject(cdkObject),
        ScalingPolicyProperty {
      /**
       * The auto scaling policy that scales a table based on the ratio of consumed to provisioned
       * capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-scalingpolicy.html#cfn-cassandra-table-scalingpolicy-targettrackingscalingpolicyconfiguration)
       */
      override fun targetTrackingScalingPolicyConfiguration(): Any? =
          unwrap(this).getTargetTrackingScalingPolicyConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.ScalingPolicyProperty):
          ScalingPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? ScalingPolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingPolicyProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.ScalingPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.cassandra.CfnTable.ScalingPolicyProperty
    }
  }

  /**
   * Amazon Keyspaces supports the `target tracking` auto scaling policy for a provisioned table.
   *
   * This policy scales a table based on the ratio of consumed to provisioned capacity. The auto
   * scaling target is a percentage of the provisioned capacity of the table.
   *
   * * `targetTrackingScalingPolicyConfiguration` : To define the target tracking policy, you must
   * define the target value.
   * * `targetValue` : The target utilization rate of the table. Amazon Keyspaces auto scaling
   * ensures that the ratio of consumed capacity to provisioned capacity stays at or near this value.
   * You define `targetValue` as a percentage. A `double` between 20 and 90. (Required)
   * * `disableScaleIn` : A `boolean` that specifies if `scale-in` is disabled or enabled for the
   * table. This parameter is disabled by default. To turn on `scale-in` , set the `boolean` value to
   * `FALSE` . This means that capacity for a table can be automatically scaled down on your behalf.
   * (Optional)
   * * `scaleInCooldown` : A cooldown period in seconds between scaling activities that lets the
   * table stabilize before another scale in activity starts. If no value is provided, the default is
   * 0. (Optional)
   * * `scaleOutCooldown` : A cooldown period in seconds between scaling activities that lets the
   * table stabilize before another scale out activity starts. If no value is provided, the default is
   * 0. (Optional)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cassandra.*;
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
  public interface TargetTrackingScalingPolicyConfigurationProperty {
    /**
     * Specifies if `scale-in` is enabled.
     *
     * When auto scaling automatically decreases capacity for a table, the table *scales in* . When
     * scaling policies are set, they can't scale in the table lower than its minimum capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-targettrackingscalingpolicyconfiguration.html#cfn-cassandra-table-targettrackingscalingpolicyconfiguration-disablescalein)
     */
    public fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

    /**
     * Specifies a `scale-in` cool down period.
     *
     * A cooldown period in seconds between scaling activities that lets the table stabilize before
     * another scaling activity starts.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-targettrackingscalingpolicyconfiguration.html#cfn-cassandra-table-targettrackingscalingpolicyconfiguration-scaleincooldown)
     */
    public fun scaleInCooldown(): Number? = unwrap(this).getScaleInCooldown()

    /**
     * Specifies a scale out cool down period.
     *
     * A cooldown period in seconds between scaling activities that lets the table stabilize before
     * another scaling activity starts.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-targettrackingscalingpolicyconfiguration.html#cfn-cassandra-table-targettrackingscalingpolicyconfiguration-scaleoutcooldown)
     */
    public fun scaleOutCooldown(): Number? = unwrap(this).getScaleOutCooldown()

    /**
     * Specifies the target value for the target tracking auto scaling policy.
     *
     * Amazon Keyspaces auto scaling scales up capacity automatically when traffic exceeds this
     * target utilization rate, and then back down when it falls below the target. This ensures that
     * the ratio of consumed capacity to provisioned capacity stays at or near this value. You define
     * `targetValue` as a percentage. An `integer` between 20 and 90.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-targettrackingscalingpolicyconfiguration.html#cfn-cassandra-table-targettrackingscalingpolicyconfiguration-targetvalue)
     */
    public fun targetValue(): Number

    /**
     * A builder for [TargetTrackingScalingPolicyConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param disableScaleIn Specifies if `scale-in` is enabled.
       * When auto scaling automatically decreases capacity for a table, the table *scales in* .
       * When scaling policies are set, they can't scale in the table lower than its minimum capacity.
       */
      public fun disableScaleIn(disableScaleIn: Boolean)

      /**
       * @param disableScaleIn Specifies if `scale-in` is enabled.
       * When auto scaling automatically decreases capacity for a table, the table *scales in* .
       * When scaling policies are set, they can't scale in the table lower than its minimum capacity.
       */
      public fun disableScaleIn(disableScaleIn: IResolvable)

      /**
       * @param scaleInCooldown Specifies a `scale-in` cool down period.
       * A cooldown period in seconds between scaling activities that lets the table stabilize
       * before another scaling activity starts.
       */
      public fun scaleInCooldown(scaleInCooldown: Number)

      /**
       * @param scaleOutCooldown Specifies a scale out cool down period.
       * A cooldown period in seconds between scaling activities that lets the table stabilize
       * before another scaling activity starts.
       */
      public fun scaleOutCooldown(scaleOutCooldown: Number)

      /**
       * @param targetValue Specifies the target value for the target tracking auto scaling policy. 
       * Amazon Keyspaces auto scaling scales up capacity automatically when traffic exceeds this
       * target utilization rate, and then back down when it falls below the target. This ensures that
       * the ratio of consumed capacity to provisioned capacity stays at or near this value. You define
       * `targetValue` as a percentage. An `integer` between 20 and 90.
       */
      public fun targetValue(targetValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cassandra.CfnTable.TargetTrackingScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cassandra.CfnTable.TargetTrackingScalingPolicyConfigurationProperty.builder()

      /**
       * @param disableScaleIn Specifies if `scale-in` is enabled.
       * When auto scaling automatically decreases capacity for a table, the table *scales in* .
       * When scaling policies are set, they can't scale in the table lower than its minimum capacity.
       */
      override fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
      }

      /**
       * @param disableScaleIn Specifies if `scale-in` is enabled.
       * When auto scaling automatically decreases capacity for a table, the table *scales in* .
       * When scaling policies are set, they can't scale in the table lower than its minimum capacity.
       */
      override fun disableScaleIn(disableScaleIn: IResolvable) {
        cdkBuilder.disableScaleIn(disableScaleIn.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param scaleInCooldown Specifies a `scale-in` cool down period.
       * A cooldown period in seconds between scaling activities that lets the table stabilize
       * before another scaling activity starts.
       */
      override fun scaleInCooldown(scaleInCooldown: Number) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
      }

      /**
       * @param scaleOutCooldown Specifies a scale out cool down period.
       * A cooldown period in seconds between scaling activities that lets the table stabilize
       * before another scaling activity starts.
       */
      override fun scaleOutCooldown(scaleOutCooldown: Number) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
      }

      /**
       * @param targetValue Specifies the target value for the target tracking auto scaling policy. 
       * Amazon Keyspaces auto scaling scales up capacity automatically when traffic exceeds this
       * target utilization rate, and then back down when it falls below the target. This ensures that
       * the ratio of consumed capacity to provisioned capacity stays at or near this value. You define
       * `targetValue` as a percentage. An `integer` between 20 and 90.
       */
      override fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
      }

      public fun build():
          software.amazon.awscdk.services.cassandra.CfnTable.TargetTrackingScalingPolicyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.TargetTrackingScalingPolicyConfigurationProperty,
    ) : CdkObject(cdkObject),
        TargetTrackingScalingPolicyConfigurationProperty {
      /**
       * Specifies if `scale-in` is enabled.
       *
       * When auto scaling automatically decreases capacity for a table, the table *scales in* .
       * When scaling policies are set, they can't scale in the table lower than its minimum capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-targettrackingscalingpolicyconfiguration.html#cfn-cassandra-table-targettrackingscalingpolicyconfiguration-disablescalein)
       */
      override fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

      /**
       * Specifies a `scale-in` cool down period.
       *
       * A cooldown period in seconds between scaling activities that lets the table stabilize
       * before another scaling activity starts.
       *
       * Default: - 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-targettrackingscalingpolicyconfiguration.html#cfn-cassandra-table-targettrackingscalingpolicyconfiguration-scaleincooldown)
       */
      override fun scaleInCooldown(): Number? = unwrap(this).getScaleInCooldown()

      /**
       * Specifies a scale out cool down period.
       *
       * A cooldown period in seconds between scaling activities that lets the table stabilize
       * before another scaling activity starts.
       *
       * Default: - 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-targettrackingscalingpolicyconfiguration.html#cfn-cassandra-table-targettrackingscalingpolicyconfiguration-scaleoutcooldown)
       */
      override fun scaleOutCooldown(): Number? = unwrap(this).getScaleOutCooldown()

      /**
       * Specifies the target value for the target tracking auto scaling policy.
       *
       * Amazon Keyspaces auto scaling scales up capacity automatically when traffic exceeds this
       * target utilization rate, and then back down when it falls below the target. This ensures that
       * the ratio of consumed capacity to provisioned capacity stays at or near this value. You define
       * `targetValue` as a percentage. An `integer` between 20 and 90.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-targettrackingscalingpolicyconfiguration.html#cfn-cassandra-table-targettrackingscalingpolicyconfiguration-targetvalue)
       */
      override fun targetValue(): Number = unwrap(this).getTargetValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetTrackingScalingPolicyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cassandra.CfnTable.TargetTrackingScalingPolicyConfigurationProperty):
          TargetTrackingScalingPolicyConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetTrackingScalingPolicyConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingScalingPolicyConfigurationProperty):
          software.amazon.awscdk.services.cassandra.CfnTable.TargetTrackingScalingPolicyConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cassandra.CfnTable.TargetTrackingScalingPolicyConfigurationProperty
    }
  }
}
