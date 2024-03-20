@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotanalytics

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
 * AWS::IoTAnalytics::Datastore resource is a repository for messages.
 *
 * For more information, see [How to Use AWS IoT
 * Analytics](https://docs.aws.amazon.com/iotanalytics/latest/userguide/welcome.html#aws-iot-analytics-how)
 * in the *AWS IoT Analytics User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
 * Object jsonConfiguration;
 * Object serviceManagedS3;
 * CfnDatastore cfnDatastore = CfnDatastore.Builder.create(this, "MyCfnDatastore")
 * .datastoreName("datastoreName")
 * .datastorePartitions(DatastorePartitionsProperty.builder()
 * .partitions(List.of(DatastorePartitionProperty.builder()
 * .partition(PartitionProperty.builder()
 * .attributeName("attributeName")
 * .build())
 * .timestampPartition(TimestampPartitionProperty.builder()
 * .attributeName("attributeName")
 * // the properties below are optional
 * .timestampFormat("timestampFormat")
 * .build())
 * .build()))
 * .build())
 * .datastoreStorage(DatastoreStorageProperty.builder()
 * .customerManagedS3(CustomerManagedS3Property.builder()
 * .bucket("bucket")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build())
 * .iotSiteWiseMultiLayerStorage(IotSiteWiseMultiLayerStorageProperty.builder()
 * .customerManagedS3Storage(CustomerManagedS3StorageProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .keyPrefix("keyPrefix")
 * .build())
 * .build())
 * .serviceManagedS3(serviceManagedS3)
 * .build())
 * .fileFormatConfiguration(FileFormatConfigurationProperty.builder()
 * .jsonConfiguration(jsonConfiguration)
 * .parquetConfiguration(ParquetConfigurationProperty.builder()
 * .schemaDefinition(SchemaDefinitionProperty.builder()
 * .columns(List.of(ColumnProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * .build())
 * .build())
 * .build())
 * .retentionPeriod(RetentionPeriodProperty.builder()
 * .numberOfDays(123)
 * .unlimited(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html)
 */
public open class CfnDatastore internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.iotanalytics.CfnDatastore(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDatastoreProps,
  ) :
      this(software.amazon.awscdk.services.iotanalytics.CfnDatastore(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDatastoreProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDatastoreProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDatastoreProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the data store.
   */
  public open fun datastoreName(): String? = unwrap(this).getDatastoreName()

  /**
   * The name of the data store.
   */
  public open fun datastoreName(`value`: String) {
    unwrap(this).setDatastoreName(`value`)
  }

  /**
   * Information about the partition dimensions in a data store.
   */
  public open fun datastorePartitions(): Any? = unwrap(this).getDatastorePartitions()

  /**
   * Information about the partition dimensions in a data store.
   */
  public open fun datastorePartitions(`value`: IResolvable) {
    unwrap(this).setDatastorePartitions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the partition dimensions in a data store.
   */
  public open fun datastorePartitions(`value`: DatastorePartitionsProperty) {
    unwrap(this).setDatastorePartitions(`value`.let(DatastorePartitionsProperty::unwrap))
  }

  /**
   * Information about the partition dimensions in a data store.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6e911e57e9c60a55a021ebfb100e79165d58e541fce4cc91b448dfe0abe030be")
  public open fun datastorePartitions(`value`: DatastorePartitionsProperty.Builder.() -> Unit): Unit
      = datastorePartitions(DatastorePartitionsProperty(`value`))

  /**
   * Where data store data is stored.
   */
  public open fun datastoreStorage(): Any? = unwrap(this).getDatastoreStorage()

  /**
   * Where data store data is stored.
   */
  public open fun datastoreStorage(`value`: IResolvable) {
    unwrap(this).setDatastoreStorage(`value`.let(IResolvable::unwrap))
  }

  /**
   * Where data store data is stored.
   */
  public open fun datastoreStorage(`value`: DatastoreStorageProperty) {
    unwrap(this).setDatastoreStorage(`value`.let(DatastoreStorageProperty::unwrap))
  }

  /**
   * Where data store data is stored.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dfd94dd7d10cc8488debe966f6b1d1b15d506abd59321dce52327e1b3df1ae5f")
  public open fun datastoreStorage(`value`: DatastoreStorageProperty.Builder.() -> Unit): Unit =
      datastoreStorage(DatastoreStorageProperty(`value`))

  /**
   * Contains the configuration information of file formats.
   *
   * AWS IoT Analytics data stores support JSON and
   * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
   */
  public open fun fileFormatConfiguration(): Any? = unwrap(this).getFileFormatConfiguration()

  /**
   * Contains the configuration information of file formats.
   *
   * AWS IoT Analytics data stores support JSON and
   * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
   */
  public open fun fileFormatConfiguration(`value`: IResolvable) {
    unwrap(this).setFileFormatConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains the configuration information of file formats.
   *
   * AWS IoT Analytics data stores support JSON and
   * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
   */
  public open fun fileFormatConfiguration(`value`: FileFormatConfigurationProperty) {
    unwrap(this).setFileFormatConfiguration(`value`.let(FileFormatConfigurationProperty::unwrap))
  }

  /**
   * Contains the configuration information of file formats.
   *
   * AWS IoT Analytics data stores support JSON and
   * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("502cf3017f6f0380bcdd7f72d65be2351f36101115c19646417d099e63bbfe39")
  public open
      fun fileFormatConfiguration(`value`: FileFormatConfigurationProperty.Builder.() -> Unit): Unit
      = fileFormatConfiguration(FileFormatConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * How long, in days, message data is kept for the data store.
   */
  public open fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

  /**
   * How long, in days, message data is kept for the data store.
   */
  public open fun retentionPeriod(`value`: IResolvable) {
    unwrap(this).setRetentionPeriod(`value`.let(IResolvable::unwrap))
  }

  /**
   * How long, in days, message data is kept for the data store.
   */
  public open fun retentionPeriod(`value`: RetentionPeriodProperty) {
    unwrap(this).setRetentionPeriod(`value`.let(RetentionPeriodProperty::unwrap))
  }

  /**
   * How long, in days, message data is kept for the data store.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9ea9cb497dff2740d5a5bcf2ca94646fef8d139cf3602802084ac68170a37c24")
  public open fun retentionPeriod(`value`: RetentionPeriodProperty.Builder.() -> Unit): Unit =
      retentionPeriod(RetentionPeriodProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata which can be used to manage the data store.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata which can be used to manage the data store.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata which can be used to manage the data store.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iotanalytics.CfnDatastore].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorename)
     * @param datastoreName The name of the data store. 
     */
    public fun datastoreName(datastoreName: String)

    /**
     * Information about the partition dimensions in a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorepartitions)
     * @param datastorePartitions Information about the partition dimensions in a data store. 
     */
    public fun datastorePartitions(datastorePartitions: IResolvable)

    /**
     * Information about the partition dimensions in a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorepartitions)
     * @param datastorePartitions Information about the partition dimensions in a data store. 
     */
    public fun datastorePartitions(datastorePartitions: DatastorePartitionsProperty)

    /**
     * Information about the partition dimensions in a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorepartitions)
     * @param datastorePartitions Information about the partition dimensions in a data store. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35d75580ada733c689a04ca35419661cb84e009843e7f386a19fcfcc775f4ea4")
    public
        fun datastorePartitions(datastorePartitions: DatastorePartitionsProperty.Builder.() -> Unit)

    /**
     * Where data store data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorestorage)
     * @param datastoreStorage Where data store data is stored. 
     */
    public fun datastoreStorage(datastoreStorage: IResolvable)

    /**
     * Where data store data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorestorage)
     * @param datastoreStorage Where data store data is stored. 
     */
    public fun datastoreStorage(datastoreStorage: DatastoreStorageProperty)

    /**
     * Where data store data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorestorage)
     * @param datastoreStorage Where data store data is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d74173f897723d0dbb0c52095b8dd1bc4397a08f4a5283a8da5be0e5812552e6")
    public fun datastoreStorage(datastoreStorage: DatastoreStorageProperty.Builder.() -> Unit)

    /**
     * Contains the configuration information of file formats. AWS IoT Analytics data stores support
     * JSON and [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
     *
     * The default file format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-fileformatconfiguration)
     * @param fileFormatConfiguration Contains the configuration information of file formats. AWS
     * IoT Analytics data stores support JSON and
     * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) . 
     */
    public fun fileFormatConfiguration(fileFormatConfiguration: IResolvable)

    /**
     * Contains the configuration information of file formats. AWS IoT Analytics data stores support
     * JSON and [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
     *
     * The default file format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-fileformatconfiguration)
     * @param fileFormatConfiguration Contains the configuration information of file formats. AWS
     * IoT Analytics data stores support JSON and
     * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) . 
     */
    public fun fileFormatConfiguration(fileFormatConfiguration: FileFormatConfigurationProperty)

    /**
     * Contains the configuration information of file formats. AWS IoT Analytics data stores support
     * JSON and [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
     *
     * The default file format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-fileformatconfiguration)
     * @param fileFormatConfiguration Contains the configuration information of file formats. AWS
     * IoT Analytics data stores support JSON and
     * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea346d9f6f29b6918210b47f5498d9879180f41ae5d75079a352471b1d5b27f2")
    public
        fun fileFormatConfiguration(fileFormatConfiguration: FileFormatConfigurationProperty.Builder.() -> Unit)

    /**
     * How long, in days, message data is kept for the data store.
     *
     * When `customerManagedS3` storage is selected, this parameter is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-retentionperiod)
     * @param retentionPeriod How long, in days, message data is kept for the data store. 
     */
    public fun retentionPeriod(retentionPeriod: IResolvable)

    /**
     * How long, in days, message data is kept for the data store.
     *
     * When `customerManagedS3` storage is selected, this parameter is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-retentionperiod)
     * @param retentionPeriod How long, in days, message data is kept for the data store. 
     */
    public fun retentionPeriod(retentionPeriod: RetentionPeriodProperty)

    /**
     * How long, in days, message data is kept for the data store.
     *
     * When `customerManagedS3` storage is selected, this parameter is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-retentionperiod)
     * @param retentionPeriod How long, in days, message data is kept for the data store. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3879f84a0ef25cb591320f2a5bf8b1583a0f73d5d5409c1928435a8f04683d9")
    public fun retentionPeriod(retentionPeriod: RetentionPeriodProperty.Builder.() -> Unit)

    /**
     * Metadata which can be used to manage the data store.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-tags)
     * @param tags Metadata which can be used to manage the data store. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata which can be used to manage the data store.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-tags)
     * @param tags Metadata which can be used to manage the data store. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotanalytics.CfnDatastore.Builder =
        software.amazon.awscdk.services.iotanalytics.CfnDatastore.Builder.create(scope, id)

    /**
     * The name of the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorename)
     * @param datastoreName The name of the data store. 
     */
    override fun datastoreName(datastoreName: String) {
      cdkBuilder.datastoreName(datastoreName)
    }

    /**
     * Information about the partition dimensions in a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorepartitions)
     * @param datastorePartitions Information about the partition dimensions in a data store. 
     */
    override fun datastorePartitions(datastorePartitions: IResolvable) {
      cdkBuilder.datastorePartitions(datastorePartitions.let(IResolvable::unwrap))
    }

    /**
     * Information about the partition dimensions in a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorepartitions)
     * @param datastorePartitions Information about the partition dimensions in a data store. 
     */
    override fun datastorePartitions(datastorePartitions: DatastorePartitionsProperty) {
      cdkBuilder.datastorePartitions(datastorePartitions.let(DatastorePartitionsProperty::unwrap))
    }

    /**
     * Information about the partition dimensions in a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorepartitions)
     * @param datastorePartitions Information about the partition dimensions in a data store. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35d75580ada733c689a04ca35419661cb84e009843e7f386a19fcfcc775f4ea4")
    override
        fun datastorePartitions(datastorePartitions: DatastorePartitionsProperty.Builder.() -> Unit):
        Unit = datastorePartitions(DatastorePartitionsProperty(datastorePartitions))

    /**
     * Where data store data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorestorage)
     * @param datastoreStorage Where data store data is stored. 
     */
    override fun datastoreStorage(datastoreStorage: IResolvable) {
      cdkBuilder.datastoreStorage(datastoreStorage.let(IResolvable::unwrap))
    }

    /**
     * Where data store data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorestorage)
     * @param datastoreStorage Where data store data is stored. 
     */
    override fun datastoreStorage(datastoreStorage: DatastoreStorageProperty) {
      cdkBuilder.datastoreStorage(datastoreStorage.let(DatastoreStorageProperty::unwrap))
    }

    /**
     * Where data store data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorestorage)
     * @param datastoreStorage Where data store data is stored. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d74173f897723d0dbb0c52095b8dd1bc4397a08f4a5283a8da5be0e5812552e6")
    override fun datastoreStorage(datastoreStorage: DatastoreStorageProperty.Builder.() -> Unit):
        Unit = datastoreStorage(DatastoreStorageProperty(datastoreStorage))

    /**
     * Contains the configuration information of file formats. AWS IoT Analytics data stores support
     * JSON and [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
     *
     * The default file format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-fileformatconfiguration)
     * @param fileFormatConfiguration Contains the configuration information of file formats. AWS
     * IoT Analytics data stores support JSON and
     * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) . 
     */
    override fun fileFormatConfiguration(fileFormatConfiguration: IResolvable) {
      cdkBuilder.fileFormatConfiguration(fileFormatConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Contains the configuration information of file formats. AWS IoT Analytics data stores support
     * JSON and [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
     *
     * The default file format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-fileformatconfiguration)
     * @param fileFormatConfiguration Contains the configuration information of file formats. AWS
     * IoT Analytics data stores support JSON and
     * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) . 
     */
    override fun fileFormatConfiguration(fileFormatConfiguration: FileFormatConfigurationProperty) {
      cdkBuilder.fileFormatConfiguration(fileFormatConfiguration.let(FileFormatConfigurationProperty::unwrap))
    }

    /**
     * Contains the configuration information of file formats. AWS IoT Analytics data stores support
     * JSON and [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
     *
     * The default file format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-fileformatconfiguration)
     * @param fileFormatConfiguration Contains the configuration information of file formats. AWS
     * IoT Analytics data stores support JSON and
     * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea346d9f6f29b6918210b47f5498d9879180f41ae5d75079a352471b1d5b27f2")
    override
        fun fileFormatConfiguration(fileFormatConfiguration: FileFormatConfigurationProperty.Builder.() -> Unit):
        Unit = fileFormatConfiguration(FileFormatConfigurationProperty(fileFormatConfiguration))

    /**
     * How long, in days, message data is kept for the data store.
     *
     * When `customerManagedS3` storage is selected, this parameter is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-retentionperiod)
     * @param retentionPeriod How long, in days, message data is kept for the data store. 
     */
    override fun retentionPeriod(retentionPeriod: IResolvable) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable::unwrap))
    }

    /**
     * How long, in days, message data is kept for the data store.
     *
     * When `customerManagedS3` storage is selected, this parameter is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-retentionperiod)
     * @param retentionPeriod How long, in days, message data is kept for the data store. 
     */
    override fun retentionPeriod(retentionPeriod: RetentionPeriodProperty) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(RetentionPeriodProperty::unwrap))
    }

    /**
     * How long, in days, message data is kept for the data store.
     *
     * When `customerManagedS3` storage is selected, this parameter is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-retentionperiod)
     * @param retentionPeriod How long, in days, message data is kept for the data store. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3879f84a0ef25cb591320f2a5bf8b1583a0f73d5d5409c1928435a8f04683d9")
    override fun retentionPeriod(retentionPeriod: RetentionPeriodProperty.Builder.() -> Unit): Unit
        = retentionPeriod(RetentionPeriodProperty(retentionPeriod))

    /**
     * Metadata which can be used to manage the data store.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-tags)
     * @param tags Metadata which can be used to manage the data store. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata which can be used to manage the data store.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-tags)
     * @param tags Metadata which can be used to manage the data store. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDatastore =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iotanalytics.CfnDatastore.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDatastore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDatastore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore):
        CfnDatastore = CfnDatastore(cdkObject)

    internal fun unwrap(wrapped: CfnDatastore):
        software.amazon.awscdk.services.iotanalytics.CfnDatastore = wrapped.cdkObject
  }

  /**
   * Information about the partition dimensions in a data store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * DatastorePartitionsProperty datastorePartitionsProperty = DatastorePartitionsProperty.builder()
   * .partitions(List.of(DatastorePartitionProperty.builder()
   * .partition(PartitionProperty.builder()
   * .attributeName("attributeName")
   * .build())
   * .timestampPartition(TimestampPartitionProperty.builder()
   * .attributeName("attributeName")
   * // the properties below are optional
   * .timestampFormat("timestampFormat")
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorepartitions.html)
   */
  public interface DatastorePartitionsProperty {
    /**
     * A list of partition dimensions in a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorepartitions.html#cfn-iotanalytics-datastore-datastorepartitions-partitions)
     */
    public fun partitions(): Any? = unwrap(this).getPartitions()

    /**
     * A builder for [DatastorePartitionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param partitions A list of partition dimensions in a data store.
       */
      public fun partitions(partitions: IResolvable)

      /**
       * @param partitions A list of partition dimensions in a data store.
       */
      public fun partitions(partitions: List<Any>)

      /**
       * @param partitions A list of partition dimensions in a data store.
       */
      public fun partitions(vararg partitions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty.builder()

      /**
       * @param partitions A list of partition dimensions in a data store.
       */
      override fun partitions(partitions: IResolvable) {
        cdkBuilder.partitions(partitions.let(IResolvable::unwrap))
      }

      /**
       * @param partitions A list of partition dimensions in a data store.
       */
      override fun partitions(partitions: List<Any>) {
        cdkBuilder.partitions(partitions)
      }

      /**
       * @param partitions A list of partition dimensions in a data store.
       */
      override fun partitions(vararg partitions: Any): Unit = partitions(partitions.toList())

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty,
    ) : CdkObject(cdkObject), DatastorePartitionsProperty {
      /**
       * A list of partition dimensions in a data store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorepartitions.html#cfn-iotanalytics-datastore-datastorepartitions-partitions)
       */
      override fun partitions(): Any? = unwrap(this).getPartitions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatastorePartitionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty):
          DatastorePartitionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DatastorePartitionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatastorePartitionsProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionsProperty
    }
  }

  /**
   * Contains information about a column that stores your data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * ColumnProperty columnProperty = ColumnProperty.builder()
   * .name("name")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-column.html)
   */
  public interface ColumnProperty {
    /**
     * The name of the column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-column.html#cfn-iotanalytics-datastore-column-name)
     */
    public fun name(): String

    /**
     * The type of data.
     *
     * For more information about the supported data types, see [Common data
     * types](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html) in the *AWS Glue
     * Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-column.html#cfn-iotanalytics-datastore-column-type)
     */
    public fun type(): String

    /**
     * A builder for [ColumnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the column. 
       */
      public fun name(name: String)

      /**
       * @param type The type of data. 
       * For more information about the supported data types, see [Common data
       * types](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html) in the *AWS Glue
       * Developer Guide* .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty.builder()

      /**
       * @param name The name of the column. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type The type of data. 
       * For more information about the supported data types, see [Common data
       * types](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html) in the *AWS Glue
       * Developer Guide* .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty,
    ) : CdkObject(cdkObject), ColumnProperty {
      /**
       * The name of the column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-column.html#cfn-iotanalytics-datastore-column-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The type of data.
       *
       * For more information about the supported data types, see [Common data
       * types](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-common.html) in the *AWS Glue
       * Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-column.html#cfn-iotanalytics-datastore-column-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty):
          ColumnProperty = CdkObjectWrappers.wrap(cdkObject) as? ColumnProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ColumnProperty
    }
  }

  /**
   * Stores data used by AWS IoT SiteWise in an Amazon S3 bucket that you manage.
   *
   * You can't change the choice of Amazon S3 storage after your data store is created.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * IotSiteWiseMultiLayerStorageProperty iotSiteWiseMultiLayerStorageProperty =
   * IotSiteWiseMultiLayerStorageProperty.builder()
   * .customerManagedS3Storage(CustomerManagedS3StorageProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .keyPrefix("keyPrefix")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-iotsitewisemultilayerstorage.html)
   */
  public interface IotSiteWiseMultiLayerStorageProperty {
    /**
     * Stores data used by AWS IoT SiteWise in an Amazon S3 bucket that you manage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-iotsitewisemultilayerstorage.html#cfn-iotanalytics-datastore-iotsitewisemultilayerstorage-customermanageds3storage)
     */
    public fun customerManagedS3Storage(): Any? = unwrap(this).getCustomerManagedS3Storage()

    /**
     * A builder for [IotSiteWiseMultiLayerStorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customerManagedS3Storage Stores data used by AWS IoT SiteWise in an Amazon S3 bucket
       * that you manage.
       */
      public fun customerManagedS3Storage(customerManagedS3Storage: IResolvable)

      /**
       * @param customerManagedS3Storage Stores data used by AWS IoT SiteWise in an Amazon S3 bucket
       * that you manage.
       */
      public
          fun customerManagedS3Storage(customerManagedS3Storage: CustomerManagedS3StorageProperty)

      /**
       * @param customerManagedS3Storage Stores data used by AWS IoT SiteWise in an Amazon S3 bucket
       * that you manage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a22945323d518fe4f389f03e55fe2e3851e104f380a566bfe61d268c55c8026")
      public
          fun customerManagedS3Storage(customerManagedS3Storage: CustomerManagedS3StorageProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty.builder()

      /**
       * @param customerManagedS3Storage Stores data used by AWS IoT SiteWise in an Amazon S3 bucket
       * that you manage.
       */
      override fun customerManagedS3Storage(customerManagedS3Storage: IResolvable) {
        cdkBuilder.customerManagedS3Storage(customerManagedS3Storage.let(IResolvable::unwrap))
      }

      /**
       * @param customerManagedS3Storage Stores data used by AWS IoT SiteWise in an Amazon S3 bucket
       * that you manage.
       */
      override
          fun customerManagedS3Storage(customerManagedS3Storage: CustomerManagedS3StorageProperty) {
        cdkBuilder.customerManagedS3Storage(customerManagedS3Storage.let(CustomerManagedS3StorageProperty::unwrap))
      }

      /**
       * @param customerManagedS3Storage Stores data used by AWS IoT SiteWise in an Amazon S3 bucket
       * that you manage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3a22945323d518fe4f389f03e55fe2e3851e104f380a566bfe61d268c55c8026")
      override
          fun customerManagedS3Storage(customerManagedS3Storage: CustomerManagedS3StorageProperty.Builder.() -> Unit):
          Unit =
          customerManagedS3Storage(CustomerManagedS3StorageProperty(customerManagedS3Storage))

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty,
    ) : CdkObject(cdkObject), IotSiteWiseMultiLayerStorageProperty {
      /**
       * Stores data used by AWS IoT SiteWise in an Amazon S3 bucket that you manage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-iotsitewisemultilayerstorage.html#cfn-iotanalytics-datastore-iotsitewisemultilayerstorage-customermanageds3storage)
       */
      override fun customerManagedS3Storage(): Any? = unwrap(this).getCustomerManagedS3Storage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IotSiteWiseMultiLayerStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty):
          IotSiteWiseMultiLayerStorageProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IotSiteWiseMultiLayerStorageProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IotSiteWiseMultiLayerStorageProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.IotSiteWiseMultiLayerStorageProperty
    }
  }

  /**
   * How long, in days, message data is kept.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * RetentionPeriodProperty retentionPeriodProperty = RetentionPeriodProperty.builder()
   * .numberOfDays(123)
   * .unlimited(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-retentionperiod.html)
   */
  public interface RetentionPeriodProperty {
    /**
     * The number of days that message data is kept.
     *
     * The `unlimited` parameter must be false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-retentionperiod.html#cfn-iotanalytics-datastore-retentionperiod-numberofdays)
     */
    public fun numberOfDays(): Number? = unwrap(this).getNumberOfDays()

    /**
     * If true, message data is kept indefinitely.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-retentionperiod.html#cfn-iotanalytics-datastore-retentionperiod-unlimited)
     */
    public fun unlimited(): Any? = unwrap(this).getUnlimited()

    /**
     * A builder for [RetentionPeriodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param numberOfDays The number of days that message data is kept.
       * The `unlimited` parameter must be false.
       */
      public fun numberOfDays(numberOfDays: Number)

      /**
       * @param unlimited If true, message data is kept indefinitely.
       */
      public fun unlimited(unlimited: Boolean)

      /**
       * @param unlimited If true, message data is kept indefinitely.
       */
      public fun unlimited(unlimited: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty.builder()

      /**
       * @param numberOfDays The number of days that message data is kept.
       * The `unlimited` parameter must be false.
       */
      override fun numberOfDays(numberOfDays: Number) {
        cdkBuilder.numberOfDays(numberOfDays)
      }

      /**
       * @param unlimited If true, message data is kept indefinitely.
       */
      override fun unlimited(unlimited: Boolean) {
        cdkBuilder.unlimited(unlimited)
      }

      /**
       * @param unlimited If true, message data is kept indefinitely.
       */
      override fun unlimited(unlimited: IResolvable) {
        cdkBuilder.unlimited(unlimited.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty,
    ) : CdkObject(cdkObject), RetentionPeriodProperty {
      /**
       * The number of days that message data is kept.
       *
       * The `unlimited` parameter must be false.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-retentionperiod.html#cfn-iotanalytics-datastore-retentionperiod-numberofdays)
       */
      override fun numberOfDays(): Number? = unwrap(this).getNumberOfDays()

      /**
       * If true, message data is kept indefinitely.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-retentionperiod.html#cfn-iotanalytics-datastore-retentionperiod-unlimited)
       */
      override fun unlimited(): Any? = unwrap(this).getUnlimited()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetentionPeriodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty):
          RetentionPeriodProperty = CdkObjectWrappers.wrap(cdkObject) as? RetentionPeriodProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetentionPeriodProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.RetentionPeriodProperty
    }
  }

  /**
   * S3-customer-managed;
   *
   * When you choose customer-managed storage, the `retentionPeriod` parameter is ignored. You can't
   * change the choice of Amazon S3 storage after your data store is created.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * CustomerManagedS3Property customerManagedS3Property = CustomerManagedS3Property.builder()
   * .bucket("bucket")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .keyPrefix("keyPrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3.html)
   */
  public interface CustomerManagedS3Property {
    /**
     * The name of the Amazon S3 bucket where your data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3.html#cfn-iotanalytics-datastore-customermanageds3-bucket)
     */
    public fun bucket(): String

    /**
     * (Optional) The prefix used to create the keys of the data store data objects.
     *
     * Each object in an Amazon S3 bucket has a key that is its unique identifier in the bucket.
     * Each object in a bucket has exactly one key. The prefix must end with a forward slash (/).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3.html#cfn-iotanalytics-datastore-customermanageds3-keyprefix)
     */
    public fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

    /**
     * The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon S3
     * resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3.html#cfn-iotanalytics-datastore-customermanageds3-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [CustomerManagedS3Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the Amazon S3 bucket where your data is stored. 
       */
      public fun bucket(bucket: String)

      /**
       * @param keyPrefix (Optional) The prefix used to create the keys of the data store data
       * objects.
       * Each object in an Amazon S3 bucket has a key that is its unique identifier in the bucket.
       * Each object in a bucket has exactly one key. The prefix must end with a forward slash (/).
       */
      public fun keyPrefix(keyPrefix: String)

      /**
       * @param roleArn The ARN of the role that grants AWS IoT Analytics permission to interact
       * with your Amazon S3 resources. 
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3Property.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3Property.builder()

      /**
       * @param bucket The name of the Amazon S3 bucket where your data is stored. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param keyPrefix (Optional) The prefix used to create the keys of the data store data
       * objects.
       * Each object in an Amazon S3 bucket has a key that is its unique identifier in the bucket.
       * Each object in a bucket has exactly one key. The prefix must end with a forward slash (/).
       */
      override fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
      }

      /**
       * @param roleArn The ARN of the role that grants AWS IoT Analytics permission to interact
       * with your Amazon S3 resources. 
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3Property,
    ) : CdkObject(cdkObject), CustomerManagedS3Property {
      /**
       * The name of the Amazon S3 bucket where your data is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3.html#cfn-iotanalytics-datastore-customermanageds3-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * (Optional) The prefix used to create the keys of the data store data objects.
       *
       * Each object in an Amazon S3 bucket has a key that is its unique identifier in the bucket.
       * Each object in a bucket has exactly one key. The prefix must end with a forward slash (/).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3.html#cfn-iotanalytics-datastore-customermanageds3-keyprefix)
       */
      override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

      /**
       * The ARN of the role that grants AWS IoT Analytics permission to interact with your Amazon
       * S3 resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3.html#cfn-iotanalytics-datastore-customermanageds3-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomerManagedS3Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3Property):
          CustomerManagedS3Property = CdkObjectWrappers.wrap(cdkObject) as?
          CustomerManagedS3Property ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomerManagedS3Property):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3Property =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3Property
    }
  }

  /**
   * Contains the configuration information of the Parquet format.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * ParquetConfigurationProperty parquetConfigurationProperty =
   * ParquetConfigurationProperty.builder()
   * .schemaDefinition(SchemaDefinitionProperty.builder()
   * .columns(List.of(ColumnProperty.builder()
   * .name("name")
   * .type("type")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-parquetconfiguration.html)
   */
  public interface ParquetConfigurationProperty {
    /**
     * Information needed to define a schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-parquetconfiguration.html#cfn-iotanalytics-datastore-parquetconfiguration-schemadefinition)
     */
    public fun schemaDefinition(): Any? = unwrap(this).getSchemaDefinition()

    /**
     * A builder for [ParquetConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param schemaDefinition Information needed to define a schema.
       */
      public fun schemaDefinition(schemaDefinition: IResolvable)

      /**
       * @param schemaDefinition Information needed to define a schema.
       */
      public fun schemaDefinition(schemaDefinition: SchemaDefinitionProperty)

      /**
       * @param schemaDefinition Information needed to define a schema.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d666703f2b9cf5d1c319939feb1f61fca98f5e4f0c4178bc8b6999d3cae2876")
      public fun schemaDefinition(schemaDefinition: SchemaDefinitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty.builder()

      /**
       * @param schemaDefinition Information needed to define a schema.
       */
      override fun schemaDefinition(schemaDefinition: IResolvable) {
        cdkBuilder.schemaDefinition(schemaDefinition.let(IResolvable::unwrap))
      }

      /**
       * @param schemaDefinition Information needed to define a schema.
       */
      override fun schemaDefinition(schemaDefinition: SchemaDefinitionProperty) {
        cdkBuilder.schemaDefinition(schemaDefinition.let(SchemaDefinitionProperty::unwrap))
      }

      /**
       * @param schemaDefinition Information needed to define a schema.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d666703f2b9cf5d1c319939feb1f61fca98f5e4f0c4178bc8b6999d3cae2876")
      override fun schemaDefinition(schemaDefinition: SchemaDefinitionProperty.Builder.() -> Unit):
          Unit = schemaDefinition(SchemaDefinitionProperty(schemaDefinition))

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty,
    ) : CdkObject(cdkObject), ParquetConfigurationProperty {
      /**
       * Information needed to define a schema.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-parquetconfiguration.html#cfn-iotanalytics-datastore-parquetconfiguration-schemadefinition)
       */
      override fun schemaDefinition(): Any? = unwrap(this).getSchemaDefinition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParquetConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty):
          ParquetConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ParquetConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParquetConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.ParquetConfigurationProperty
    }
  }

  /**
   * A single dimension to partition a data store.
   *
   * The dimension must be an `AttributePartition` or a `TimestampPartition` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * DatastorePartitionProperty datastorePartitionProperty = DatastorePartitionProperty.builder()
   * .partition(PartitionProperty.builder()
   * .attributeName("attributeName")
   * .build())
   * .timestampPartition(TimestampPartitionProperty.builder()
   * .attributeName("attributeName")
   * // the properties below are optional
   * .timestampFormat("timestampFormat")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorepartition.html)
   */
  public interface DatastorePartitionProperty {
    /**
     * A partition dimension defined by an attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorepartition.html#cfn-iotanalytics-datastore-datastorepartition-partition)
     */
    public fun partition(): Any? = unwrap(this).getPartition()

    /**
     * A partition dimension defined by a timestamp attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorepartition.html#cfn-iotanalytics-datastore-datastorepartition-timestamppartition)
     */
    public fun timestampPartition(): Any? = unwrap(this).getTimestampPartition()

    /**
     * A builder for [DatastorePartitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param partition A partition dimension defined by an attribute.
       */
      public fun partition(partition: IResolvable)

      /**
       * @param partition A partition dimension defined by an attribute.
       */
      public fun partition(partition: PartitionProperty)

      /**
       * @param partition A partition dimension defined by an attribute.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8439126f746cf3a8f4362b58981ce9aebbb8f7615e87f87b29ffd402c6be64c3")
      public fun partition(partition: PartitionProperty.Builder.() -> Unit)

      /**
       * @param timestampPartition A partition dimension defined by a timestamp attribute.
       */
      public fun timestampPartition(timestampPartition: IResolvable)

      /**
       * @param timestampPartition A partition dimension defined by a timestamp attribute.
       */
      public fun timestampPartition(timestampPartition: TimestampPartitionProperty)

      /**
       * @param timestampPartition A partition dimension defined by a timestamp attribute.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3037a51e44c948d3294c744b1a9422a51f76756a00534f969ea9fa88f52d1b4d")
      public
          fun timestampPartition(timestampPartition: TimestampPartitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionProperty.builder()

      /**
       * @param partition A partition dimension defined by an attribute.
       */
      override fun partition(partition: IResolvable) {
        cdkBuilder.partition(partition.let(IResolvable::unwrap))
      }

      /**
       * @param partition A partition dimension defined by an attribute.
       */
      override fun partition(partition: PartitionProperty) {
        cdkBuilder.partition(partition.let(PartitionProperty::unwrap))
      }

      /**
       * @param partition A partition dimension defined by an attribute.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8439126f746cf3a8f4362b58981ce9aebbb8f7615e87f87b29ffd402c6be64c3")
      override fun partition(partition: PartitionProperty.Builder.() -> Unit): Unit =
          partition(PartitionProperty(partition))

      /**
       * @param timestampPartition A partition dimension defined by a timestamp attribute.
       */
      override fun timestampPartition(timestampPartition: IResolvable) {
        cdkBuilder.timestampPartition(timestampPartition.let(IResolvable::unwrap))
      }

      /**
       * @param timestampPartition A partition dimension defined by a timestamp attribute.
       */
      override fun timestampPartition(timestampPartition: TimestampPartitionProperty) {
        cdkBuilder.timestampPartition(timestampPartition.let(TimestampPartitionProperty::unwrap))
      }

      /**
       * @param timestampPartition A partition dimension defined by a timestamp attribute.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3037a51e44c948d3294c744b1a9422a51f76756a00534f969ea9fa88f52d1b4d")
      override
          fun timestampPartition(timestampPartition: TimestampPartitionProperty.Builder.() -> Unit):
          Unit = timestampPartition(TimestampPartitionProperty(timestampPartition))

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionProperty,
    ) : CdkObject(cdkObject), DatastorePartitionProperty {
      /**
       * A partition dimension defined by an attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorepartition.html#cfn-iotanalytics-datastore-datastorepartition-partition)
       */
      override fun partition(): Any? = unwrap(this).getPartition()

      /**
       * A partition dimension defined by a timestamp attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorepartition.html#cfn-iotanalytics-datastore-datastorepartition-timestamppartition)
       */
      override fun timestampPartition(): Any? = unwrap(this).getTimestampPartition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatastorePartitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionProperty):
          DatastorePartitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DatastorePartitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatastorePartitionProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastorePartitionProperty
    }
  }

  /**
   * Information needed to define a schema.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * SchemaDefinitionProperty schemaDefinitionProperty = SchemaDefinitionProperty.builder()
   * .columns(List.of(ColumnProperty.builder()
   * .name("name")
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-schemadefinition.html)
   */
  public interface SchemaDefinitionProperty {
    /**
     * Specifies one or more columns that store your data.
     *
     * Each schema can have up to 100 columns. Each column can have up to 100 nested types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-schemadefinition.html#cfn-iotanalytics-datastore-schemadefinition-columns)
     */
    public fun columns(): Any? = unwrap(this).getColumns()

    /**
     * A builder for [SchemaDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columns Specifies one or more columns that store your data.
       * Each schema can have up to 100 columns. Each column can have up to 100 nested types.
       */
      public fun columns(columns: IResolvable)

      /**
       * @param columns Specifies one or more columns that store your data.
       * Each schema can have up to 100 columns. Each column can have up to 100 nested types.
       */
      public fun columns(columns: List<Any>)

      /**
       * @param columns Specifies one or more columns that store your data.
       * Each schema can have up to 100 columns. Each column can have up to 100 nested types.
       */
      public fun columns(vararg columns: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty.builder()

      /**
       * @param columns Specifies one or more columns that store your data.
       * Each schema can have up to 100 columns. Each column can have up to 100 nested types.
       */
      override fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns.let(IResolvable::unwrap))
      }

      /**
       * @param columns Specifies one or more columns that store your data.
       * Each schema can have up to 100 columns. Each column can have up to 100 nested types.
       */
      override fun columns(columns: List<Any>) {
        cdkBuilder.columns(columns)
      }

      /**
       * @param columns Specifies one or more columns that store your data.
       * Each schema can have up to 100 columns. Each column can have up to 100 nested types.
       */
      override fun columns(vararg columns: Any): Unit = columns(columns.toList())

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty,
    ) : CdkObject(cdkObject), SchemaDefinitionProperty {
      /**
       * Specifies one or more columns that store your data.
       *
       * Each schema can have up to 100 columns. Each column can have up to 100 nested types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-schemadefinition.html#cfn-iotanalytics-datastore-schemadefinition-columns)
       */
      override fun columns(): Any? = unwrap(this).getColumns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty):
          SchemaDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as? SchemaDefinitionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaDefinitionProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.SchemaDefinitionProperty
    }
  }

  /**
   * A partition dimension defined by a timestamp attribute.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * TimestampPartitionProperty timestampPartitionProperty = TimestampPartitionProperty.builder()
   * .attributeName("attributeName")
   * // the properties below are optional
   * .timestampFormat("timestampFormat")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-timestamppartition.html)
   */
  public interface TimestampPartitionProperty {
    /**
     * The attribute name of the partition defined by a timestamp.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-timestamppartition.html#cfn-iotanalytics-datastore-timestamppartition-attributename)
     */
    public fun attributeName(): String

    /**
     * The timestamp format of a partition defined by a timestamp.
     *
     * The default format is seconds since epoch (January 1, 1970 at midnight UTC time).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-timestamppartition.html#cfn-iotanalytics-datastore-timestamppartition-timestampformat)
     */
    public fun timestampFormat(): String? = unwrap(this).getTimestampFormat()

    /**
     * A builder for [TimestampPartitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeName The attribute name of the partition defined by a timestamp. 
       */
      public fun attributeName(attributeName: String)

      /**
       * @param timestampFormat The timestamp format of a partition defined by a timestamp.
       * The default format is seconds since epoch (January 1, 1970 at midnight UTC time).
       */
      public fun timestampFormat(timestampFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty.builder()

      /**
       * @param attributeName The attribute name of the partition defined by a timestamp. 
       */
      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      /**
       * @param timestampFormat The timestamp format of a partition defined by a timestamp.
       * The default format is seconds since epoch (January 1, 1970 at midnight UTC time).
       */
      override fun timestampFormat(timestampFormat: String) {
        cdkBuilder.timestampFormat(timestampFormat)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty,
    ) : CdkObject(cdkObject), TimestampPartitionProperty {
      /**
       * The attribute name of the partition defined by a timestamp.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-timestamppartition.html#cfn-iotanalytics-datastore-timestamppartition-attributename)
       */
      override fun attributeName(): String = unwrap(this).getAttributeName()

      /**
       * The timestamp format of a partition defined by a timestamp.
       *
       * The default format is seconds since epoch (January 1, 1970 at midnight UTC time).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-timestamppartition.html#cfn-iotanalytics-datastore-timestamppartition-timestampformat)
       */
      override fun timestampFormat(): String? = unwrap(this).getTimestampFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TimestampPartitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty):
          TimestampPartitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TimestampPartitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TimestampPartitionProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.TimestampPartitionProperty
    }
  }

  /**
   * Where data store data is stored.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * Object serviceManagedS3;
   * DatastoreStorageProperty datastoreStorageProperty = DatastoreStorageProperty.builder()
   * .customerManagedS3(CustomerManagedS3Property.builder()
   * .bucket("bucket")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .keyPrefix("keyPrefix")
   * .build())
   * .iotSiteWiseMultiLayerStorage(IotSiteWiseMultiLayerStorageProperty.builder()
   * .customerManagedS3Storage(CustomerManagedS3StorageProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .keyPrefix("keyPrefix")
   * .build())
   * .build())
   * .serviceManagedS3(serviceManagedS3)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorestorage.html)
   */
  public interface DatastoreStorageProperty {
    /**
     * Use this to store data store data in an S3 bucket that you manage.
     *
     * The choice of service-managed or customer-managed S3 storage cannot be changed after creation
     * of the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorestorage.html#cfn-iotanalytics-datastore-datastorestorage-customermanageds3)
     */
    public fun customerManagedS3(): Any? = unwrap(this).getCustomerManagedS3()

    /**
     * Use this to store data used by AWS IoT SiteWise in an Amazon S3 bucket that you manage.
     *
     * You can't change the choice of Amazon S3 storage after your data store is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorestorage.html#cfn-iotanalytics-datastore-datastorestorage-iotsitewisemultilayerstorage)
     */
    public fun iotSiteWiseMultiLayerStorage(): Any? = unwrap(this).getIotSiteWiseMultiLayerStorage()

    /**
     * Use this to store data store data in an S3 bucket managed by the AWS IoT Analytics service.
     *
     * The choice of service-managed or customer-managed S3 storage cannot be changed after creation
     * of the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorestorage.html#cfn-iotanalytics-datastore-datastorestorage-servicemanageds3)
     */
    public fun serviceManagedS3(): Any? = unwrap(this).getServiceManagedS3()

    /**
     * A builder for [DatastoreStorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customerManagedS3 Use this to store data store data in an S3 bucket that you manage.
       * The choice of service-managed or customer-managed S3 storage cannot be changed after
       * creation of the data store.
       */
      public fun customerManagedS3(customerManagedS3: IResolvable)

      /**
       * @param customerManagedS3 Use this to store data store data in an S3 bucket that you manage.
       * The choice of service-managed or customer-managed S3 storage cannot be changed after
       * creation of the data store.
       */
      public fun customerManagedS3(customerManagedS3: CustomerManagedS3Property)

      /**
       * @param customerManagedS3 Use this to store data store data in an S3 bucket that you manage.
       * The choice of service-managed or customer-managed S3 storage cannot be changed after
       * creation of the data store.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db93fa23691d2a76a837e35b909edd252cd2570b4e702239fdcf1282f5fe39b0")
      public fun customerManagedS3(customerManagedS3: CustomerManagedS3Property.Builder.() -> Unit)

      /**
       * @param iotSiteWiseMultiLayerStorage Use this to store data used by AWS IoT SiteWise in an
       * Amazon S3 bucket that you manage.
       * You can't change the choice of Amazon S3 storage after your data store is created.
       */
      public fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: IResolvable)

      /**
       * @param iotSiteWiseMultiLayerStorage Use this to store data used by AWS IoT SiteWise in an
       * Amazon S3 bucket that you manage.
       * You can't change the choice of Amazon S3 storage after your data store is created.
       */
      public
          fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: IotSiteWiseMultiLayerStorageProperty)

      /**
       * @param iotSiteWiseMultiLayerStorage Use this to store data used by AWS IoT SiteWise in an
       * Amazon S3 bucket that you manage.
       * You can't change the choice of Amazon S3 storage after your data store is created.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a771d51564caa9fb338a8d40e41ca0feda16c9d5bad70e093add4c89fe4a3df")
      public
          fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: IotSiteWiseMultiLayerStorageProperty.Builder.() -> Unit)

      /**
       * @param serviceManagedS3 Use this to store data store data in an S3 bucket managed by the
       * AWS IoT Analytics service.
       * The choice of service-managed or customer-managed S3 storage cannot be changed after
       * creation of the data store.
       */
      public fun serviceManagedS3(serviceManagedS3: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty.builder()

      /**
       * @param customerManagedS3 Use this to store data store data in an S3 bucket that you manage.
       * The choice of service-managed or customer-managed S3 storage cannot be changed after
       * creation of the data store.
       */
      override fun customerManagedS3(customerManagedS3: IResolvable) {
        cdkBuilder.customerManagedS3(customerManagedS3.let(IResolvable::unwrap))
      }

      /**
       * @param customerManagedS3 Use this to store data store data in an S3 bucket that you manage.
       * The choice of service-managed or customer-managed S3 storage cannot be changed after
       * creation of the data store.
       */
      override fun customerManagedS3(customerManagedS3: CustomerManagedS3Property) {
        cdkBuilder.customerManagedS3(customerManagedS3.let(CustomerManagedS3Property::unwrap))
      }

      /**
       * @param customerManagedS3 Use this to store data store data in an S3 bucket that you manage.
       * The choice of service-managed or customer-managed S3 storage cannot be changed after
       * creation of the data store.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db93fa23691d2a76a837e35b909edd252cd2570b4e702239fdcf1282f5fe39b0")
      override
          fun customerManagedS3(customerManagedS3: CustomerManagedS3Property.Builder.() -> Unit):
          Unit = customerManagedS3(CustomerManagedS3Property(customerManagedS3))

      /**
       * @param iotSiteWiseMultiLayerStorage Use this to store data used by AWS IoT SiteWise in an
       * Amazon S3 bucket that you manage.
       * You can't change the choice of Amazon S3 storage after your data store is created.
       */
      override fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: IResolvable) {
        cdkBuilder.iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage.let(IResolvable::unwrap))
      }

      /**
       * @param iotSiteWiseMultiLayerStorage Use this to store data used by AWS IoT SiteWise in an
       * Amazon S3 bucket that you manage.
       * You can't change the choice of Amazon S3 storage after your data store is created.
       */
      override
          fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: IotSiteWiseMultiLayerStorageProperty) {
        cdkBuilder.iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage.let(IotSiteWiseMultiLayerStorageProperty::unwrap))
      }

      /**
       * @param iotSiteWiseMultiLayerStorage Use this to store data used by AWS IoT SiteWise in an
       * Amazon S3 bucket that you manage.
       * You can't change the choice of Amazon S3 storage after your data store is created.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a771d51564caa9fb338a8d40e41ca0feda16c9d5bad70e093add4c89fe4a3df")
      override
          fun iotSiteWiseMultiLayerStorage(iotSiteWiseMultiLayerStorage: IotSiteWiseMultiLayerStorageProperty.Builder.() -> Unit):
          Unit =
          iotSiteWiseMultiLayerStorage(IotSiteWiseMultiLayerStorageProperty(iotSiteWiseMultiLayerStorage))

      /**
       * @param serviceManagedS3 Use this to store data store data in an S3 bucket managed by the
       * AWS IoT Analytics service.
       * The choice of service-managed or customer-managed S3 storage cannot be changed after
       * creation of the data store.
       */
      override fun serviceManagedS3(serviceManagedS3: Any) {
        cdkBuilder.serviceManagedS3(serviceManagedS3)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty,
    ) : CdkObject(cdkObject), DatastoreStorageProperty {
      /**
       * Use this to store data store data in an S3 bucket that you manage.
       *
       * The choice of service-managed or customer-managed S3 storage cannot be changed after
       * creation of the data store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorestorage.html#cfn-iotanalytics-datastore-datastorestorage-customermanageds3)
       */
      override fun customerManagedS3(): Any? = unwrap(this).getCustomerManagedS3()

      /**
       * Use this to store data used by AWS IoT SiteWise in an Amazon S3 bucket that you manage.
       *
       * You can't change the choice of Amazon S3 storage after your data store is created.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorestorage.html#cfn-iotanalytics-datastore-datastorestorage-iotsitewisemultilayerstorage)
       */
      override fun iotSiteWiseMultiLayerStorage(): Any? =
          unwrap(this).getIotSiteWiseMultiLayerStorage()

      /**
       * Use this to store data store data in an S3 bucket managed by the AWS IoT Analytics service.
       *
       * The choice of service-managed or customer-managed S3 storage cannot be changed after
       * creation of the data store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-datastorestorage.html#cfn-iotanalytics-datastore-datastorestorage-servicemanageds3)
       */
      override fun serviceManagedS3(): Any? = unwrap(this).getServiceManagedS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatastoreStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty):
          DatastoreStorageProperty = CdkObjectWrappers.wrap(cdkObject) as? DatastoreStorageProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatastoreStorageProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.DatastoreStorageProperty
    }
  }

  /**
   * Contains the configuration information of file formats. AWS IoT Analytics data stores support
   * JSON and [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
   *
   * The default file format is JSON. You can specify only one format.
   *
   * You can't change the file format after you create the data store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * Object jsonConfiguration;
   * FileFormatConfigurationProperty fileFormatConfigurationProperty =
   * FileFormatConfigurationProperty.builder()
   * .jsonConfiguration(jsonConfiguration)
   * .parquetConfiguration(ParquetConfigurationProperty.builder()
   * .schemaDefinition(SchemaDefinitionProperty.builder()
   * .columns(List.of(ColumnProperty.builder()
   * .name("name")
   * .type("type")
   * .build()))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-fileformatconfiguration.html)
   */
  public interface FileFormatConfigurationProperty {
    /**
     * Contains the configuration information of the JSON format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-fileformatconfiguration.html#cfn-iotanalytics-datastore-fileformatconfiguration-jsonconfiguration)
     */
    public fun jsonConfiguration(): Any? = unwrap(this).getJsonConfiguration()

    /**
     * Contains the configuration information of the Parquet format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-fileformatconfiguration.html#cfn-iotanalytics-datastore-fileformatconfiguration-parquetconfiguration)
     */
    public fun parquetConfiguration(): Any? = unwrap(this).getParquetConfiguration()

    /**
     * A builder for [FileFormatConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param jsonConfiguration Contains the configuration information of the JSON format.
       */
      public fun jsonConfiguration(jsonConfiguration: Any)

      /**
       * @param parquetConfiguration Contains the configuration information of the Parquet format.
       */
      public fun parquetConfiguration(parquetConfiguration: IResolvable)

      /**
       * @param parquetConfiguration Contains the configuration information of the Parquet format.
       */
      public fun parquetConfiguration(parquetConfiguration: ParquetConfigurationProperty)

      /**
       * @param parquetConfiguration Contains the configuration information of the Parquet format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebc6d886e893ece820e20999d82437c32b2c12dff2ff41a2321a5f17eb1ef449")
      public
          fun parquetConfiguration(parquetConfiguration: ParquetConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty.builder()

      /**
       * @param jsonConfiguration Contains the configuration information of the JSON format.
       */
      override fun jsonConfiguration(jsonConfiguration: Any) {
        cdkBuilder.jsonConfiguration(jsonConfiguration)
      }

      /**
       * @param parquetConfiguration Contains the configuration information of the Parquet format.
       */
      override fun parquetConfiguration(parquetConfiguration: IResolvable) {
        cdkBuilder.parquetConfiguration(parquetConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param parquetConfiguration Contains the configuration information of the Parquet format.
       */
      override fun parquetConfiguration(parquetConfiguration: ParquetConfigurationProperty) {
        cdkBuilder.parquetConfiguration(parquetConfiguration.let(ParquetConfigurationProperty::unwrap))
      }

      /**
       * @param parquetConfiguration Contains the configuration information of the Parquet format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebc6d886e893ece820e20999d82437c32b2c12dff2ff41a2321a5f17eb1ef449")
      override
          fun parquetConfiguration(parquetConfiguration: ParquetConfigurationProperty.Builder.() -> Unit):
          Unit = parquetConfiguration(ParquetConfigurationProperty(parquetConfiguration))

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty,
    ) : CdkObject(cdkObject), FileFormatConfigurationProperty {
      /**
       * Contains the configuration information of the JSON format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-fileformatconfiguration.html#cfn-iotanalytics-datastore-fileformatconfiguration-jsonconfiguration)
       */
      override fun jsonConfiguration(): Any? = unwrap(this).getJsonConfiguration()

      /**
       * Contains the configuration information of the Parquet format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-fileformatconfiguration.html#cfn-iotanalytics-datastore-fileformatconfiguration-parquetconfiguration)
       */
      override fun parquetConfiguration(): Any? = unwrap(this).getParquetConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FileFormatConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty):
          FileFormatConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FileFormatConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileFormatConfigurationProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.FileFormatConfigurationProperty
    }
  }

  /**
   * A single dimension to partition a data store.
   *
   * The dimension must be an `AttributePartition` or a `TimestampPartition` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * PartitionProperty partitionProperty = PartitionProperty.builder()
   * .attributeName("attributeName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-partition.html)
   */
  public interface PartitionProperty {
    /**
     * The name of the attribute that defines a partition dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-partition.html#cfn-iotanalytics-datastore-partition-attributename)
     */
    public fun attributeName(): String

    /**
     * A builder for [PartitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeName The name of the attribute that defines a partition dimension. 
       */
      public fun attributeName(attributeName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty.builder()

      /**
       * @param attributeName The name of the attribute that defines a partition dimension. 
       */
      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty,
    ) : CdkObject(cdkObject), PartitionProperty {
      /**
       * The name of the attribute that defines a partition dimension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-partition.html#cfn-iotanalytics-datastore-partition-attributename)
       */
      override fun attributeName(): String = unwrap(this).getAttributeName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PartitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty):
          PartitionProperty = CdkObjectWrappers.wrap(cdkObject) as? PartitionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PartitionProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.PartitionProperty
    }
  }

  /**
   * Amazon S3 -customer-managed;
   *
   * When you choose customer-managed storage, the `retentionPeriod` parameter is ignored. You can't
   * change the choice of Amazon S3 storage after your data store is created.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
   * CustomerManagedS3StorageProperty customerManagedS3StorageProperty =
   * CustomerManagedS3StorageProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .keyPrefix("keyPrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3storage.html)
   */
  public interface CustomerManagedS3StorageProperty {
    /**
     * The name of the Amazon S3 bucket where your data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3storage.html#cfn-iotanalytics-datastore-customermanageds3storage-bucket)
     */
    public fun bucket(): String

    /**
     * (Optional) The prefix used to create the keys of the data store data objects.
     *
     * Each object in an Amazon S3 bucket has a key that is its unique identifier in the bucket.
     * Each object in a bucket has exactly one key. The prefix must end with a forward slash (/).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3storage.html#cfn-iotanalytics-datastore-customermanageds3storage-keyprefix)
     */
    public fun keyPrefix(): String? = unwrap(this).getKeyPrefix()

    /**
     * A builder for [CustomerManagedS3StorageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The name of the Amazon S3 bucket where your data is stored. 
       */
      public fun bucket(bucket: String)

      /**
       * @param keyPrefix (Optional) The prefix used to create the keys of the data store data
       * objects.
       * Each object in an Amazon S3 bucket has a key that is its unique identifier in the bucket.
       * Each object in a bucket has exactly one key. The prefix must end with a forward slash (/).
       */
      public fun keyPrefix(keyPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty.builder()

      /**
       * @param bucket The name of the Amazon S3 bucket where your data is stored. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param keyPrefix (Optional) The prefix used to create the keys of the data store data
       * objects.
       * Each object in an Amazon S3 bucket has a key that is its unique identifier in the bucket.
       * Each object in a bucket has exactly one key. The prefix must end with a forward slash (/).
       */
      override fun keyPrefix(keyPrefix: String) {
        cdkBuilder.keyPrefix(keyPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty,
    ) : CdkObject(cdkObject), CustomerManagedS3StorageProperty {
      /**
       * The name of the Amazon S3 bucket where your data is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3storage.html#cfn-iotanalytics-datastore-customermanageds3storage-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * (Optional) The prefix used to create the keys of the data store data objects.
       *
       * Each object in an Amazon S3 bucket has a key that is its unique identifier in the bucket.
       * Each object in a bucket has exactly one key. The prefix must end with a forward slash (/).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-datastore-customermanageds3storage.html#cfn-iotanalytics-datastore-customermanageds3storage-keyprefix)
       */
      override fun keyPrefix(): String? = unwrap(this).getKeyPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomerManagedS3StorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty):
          CustomerManagedS3StorageProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomerManagedS3StorageProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomerManagedS3StorageProperty):
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.iotanalytics.CfnDatastore.CustomerManagedS3StorageProperty
    }
  }
}
