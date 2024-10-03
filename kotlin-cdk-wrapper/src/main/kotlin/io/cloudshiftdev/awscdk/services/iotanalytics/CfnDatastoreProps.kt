@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotanalytics

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDatastore`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotanalytics.*;
 * Object jsonConfiguration;
 * Object serviceManagedS3;
 * CfnDatastoreProps cfnDatastoreProps = CfnDatastoreProps.builder()
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
public interface CfnDatastoreProps {
  /**
   * The name of the data store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorename)
   */
  public fun datastoreName(): String? = unwrap(this).getDatastoreName()

  /**
   * Information about the partition dimensions in a data store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorepartitions)
   */
  public fun datastorePartitions(): Any? = unwrap(this).getDatastorePartitions()

  /**
   * Where data store data is stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorestorage)
   */
  public fun datastoreStorage(): Any? = unwrap(this).getDatastoreStorage()

  /**
   * Contains the configuration information of file formats. AWS IoT Analytics data stores support
   * JSON and [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
   *
   * The default file format is JSON. You can specify only one format.
   *
   * You can't change the file format after you create the data store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-fileformatconfiguration)
   */
  public fun fileFormatConfiguration(): Any? = unwrap(this).getFileFormatConfiguration()

  /**
   * How long, in days, message data is kept for the data store.
   *
   * When `customerManagedS3` storage is selected, this parameter is ignored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-retentionperiod)
   */
  public fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

  /**
   * Metadata which can be used to manage the data store.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDatastoreProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param datastoreName The name of the data store.
     */
    public fun datastoreName(datastoreName: String)

    /**
     * @param datastorePartitions Information about the partition dimensions in a data store.
     */
    public fun datastorePartitions(datastorePartitions: IResolvable)

    /**
     * @param datastorePartitions Information about the partition dimensions in a data store.
     */
    public fun datastorePartitions(datastorePartitions: CfnDatastore.DatastorePartitionsProperty)

    /**
     * @param datastorePartitions Information about the partition dimensions in a data store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90f0ac83ab97b1504cef312121377d4bef13fd46a4f32fc68286bd43cb2a8242")
    public
        fun datastorePartitions(datastorePartitions: CfnDatastore.DatastorePartitionsProperty.Builder.() -> Unit)

    /**
     * @param datastoreStorage Where data store data is stored.
     */
    public fun datastoreStorage(datastoreStorage: IResolvable)

    /**
     * @param datastoreStorage Where data store data is stored.
     */
    public fun datastoreStorage(datastoreStorage: CfnDatastore.DatastoreStorageProperty)

    /**
     * @param datastoreStorage Where data store data is stored.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e498cf0ceaa1cd82eeb06ab6292e74be224928891f182b35eda1b010f8e6562")
    public
        fun datastoreStorage(datastoreStorage: CfnDatastore.DatastoreStorageProperty.Builder.() -> Unit)

    /**
     * @param fileFormatConfiguration Contains the configuration information of file formats. AWS
     * IoT Analytics data stores support JSON and
     * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
     * The default file format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     */
    public fun fileFormatConfiguration(fileFormatConfiguration: IResolvable)

    /**
     * @param fileFormatConfiguration Contains the configuration information of file formats. AWS
     * IoT Analytics data stores support JSON and
     * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
     * The default file format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     */
    public
        fun fileFormatConfiguration(fileFormatConfiguration: CfnDatastore.FileFormatConfigurationProperty)

    /**
     * @param fileFormatConfiguration Contains the configuration information of file formats. AWS
     * IoT Analytics data stores support JSON and
     * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
     * The default file format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9acf619de45a2e839534ca2943c618eee0c3517feb3b300e93d93e4a66eea0e5")
    public
        fun fileFormatConfiguration(fileFormatConfiguration: CfnDatastore.FileFormatConfigurationProperty.Builder.() -> Unit)

    /**
     * @param retentionPeriod How long, in days, message data is kept for the data store.
     * When `customerManagedS3` storage is selected, this parameter is ignored.
     */
    public fun retentionPeriod(retentionPeriod: IResolvable)

    /**
     * @param retentionPeriod How long, in days, message data is kept for the data store.
     * When `customerManagedS3` storage is selected, this parameter is ignored.
     */
    public fun retentionPeriod(retentionPeriod: CfnDatastore.RetentionPeriodProperty)

    /**
     * @param retentionPeriod How long, in days, message data is kept for the data store.
     * When `customerManagedS3` storage is selected, this parameter is ignored.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cefa71ee5ce5f90b4e003eac364b0e3318029a58f1c07eeef2312851775b81c7")
    public
        fun retentionPeriod(retentionPeriod: CfnDatastore.RetentionPeriodProperty.Builder.() -> Unit)

    /**
     * @param tags Metadata which can be used to manage the data store.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata which can be used to manage the data store.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps.Builder =
        software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps.builder()

    /**
     * @param datastoreName The name of the data store.
     */
    override fun datastoreName(datastoreName: String) {
      cdkBuilder.datastoreName(datastoreName)
    }

    /**
     * @param datastorePartitions Information about the partition dimensions in a data store.
     */
    override fun datastorePartitions(datastorePartitions: IResolvable) {
      cdkBuilder.datastorePartitions(datastorePartitions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param datastorePartitions Information about the partition dimensions in a data store.
     */
    override
        fun datastorePartitions(datastorePartitions: CfnDatastore.DatastorePartitionsProperty) {
      cdkBuilder.datastorePartitions(datastorePartitions.let(CfnDatastore.DatastorePartitionsProperty.Companion::unwrap))
    }

    /**
     * @param datastorePartitions Information about the partition dimensions in a data store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("90f0ac83ab97b1504cef312121377d4bef13fd46a4f32fc68286bd43cb2a8242")
    override
        fun datastorePartitions(datastorePartitions: CfnDatastore.DatastorePartitionsProperty.Builder.() -> Unit):
        Unit = datastorePartitions(CfnDatastore.DatastorePartitionsProperty(datastorePartitions))

    /**
     * @param datastoreStorage Where data store data is stored.
     */
    override fun datastoreStorage(datastoreStorage: IResolvable) {
      cdkBuilder.datastoreStorage(datastoreStorage.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param datastoreStorage Where data store data is stored.
     */
    override fun datastoreStorage(datastoreStorage: CfnDatastore.DatastoreStorageProperty) {
      cdkBuilder.datastoreStorage(datastoreStorage.let(CfnDatastore.DatastoreStorageProperty.Companion::unwrap))
    }

    /**
     * @param datastoreStorage Where data store data is stored.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e498cf0ceaa1cd82eeb06ab6292e74be224928891f182b35eda1b010f8e6562")
    override
        fun datastoreStorage(datastoreStorage: CfnDatastore.DatastoreStorageProperty.Builder.() -> Unit):
        Unit = datastoreStorage(CfnDatastore.DatastoreStorageProperty(datastoreStorage))

    /**
     * @param fileFormatConfiguration Contains the configuration information of file formats. AWS
     * IoT Analytics data stores support JSON and
     * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
     * The default file format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     */
    override fun fileFormatConfiguration(fileFormatConfiguration: IResolvable) {
      cdkBuilder.fileFormatConfiguration(fileFormatConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param fileFormatConfiguration Contains the configuration information of file formats. AWS
     * IoT Analytics data stores support JSON and
     * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
     * The default file format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     */
    override
        fun fileFormatConfiguration(fileFormatConfiguration: CfnDatastore.FileFormatConfigurationProperty) {
      cdkBuilder.fileFormatConfiguration(fileFormatConfiguration.let(CfnDatastore.FileFormatConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param fileFormatConfiguration Contains the configuration information of file formats. AWS
     * IoT Analytics data stores support JSON and
     * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
     * The default file format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9acf619de45a2e839534ca2943c618eee0c3517feb3b300e93d93e4a66eea0e5")
    override
        fun fileFormatConfiguration(fileFormatConfiguration: CfnDatastore.FileFormatConfigurationProperty.Builder.() -> Unit):
        Unit =
        fileFormatConfiguration(CfnDatastore.FileFormatConfigurationProperty(fileFormatConfiguration))

    /**
     * @param retentionPeriod How long, in days, message data is kept for the data store.
     * When `customerManagedS3` storage is selected, this parameter is ignored.
     */
    override fun retentionPeriod(retentionPeriod: IResolvable) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param retentionPeriod How long, in days, message data is kept for the data store.
     * When `customerManagedS3` storage is selected, this parameter is ignored.
     */
    override fun retentionPeriod(retentionPeriod: CfnDatastore.RetentionPeriodProperty) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(CfnDatastore.RetentionPeriodProperty.Companion::unwrap))
    }

    /**
     * @param retentionPeriod How long, in days, message data is kept for the data store.
     * When `customerManagedS3` storage is selected, this parameter is ignored.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cefa71ee5ce5f90b4e003eac364b0e3318029a58f1c07eeef2312851775b81c7")
    override
        fun retentionPeriod(retentionPeriod: CfnDatastore.RetentionPeriodProperty.Builder.() -> Unit):
        Unit = retentionPeriod(CfnDatastore.RetentionPeriodProperty(retentionPeriod))

    /**
     * @param tags Metadata which can be used to manage the data store.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Metadata which can be used to manage the data store.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps,
  ) : CdkObject(cdkObject),
      CfnDatastoreProps {
    /**
     * The name of the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorename)
     */
    override fun datastoreName(): String? = unwrap(this).getDatastoreName()

    /**
     * Information about the partition dimensions in a data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorepartitions)
     */
    override fun datastorePartitions(): Any? = unwrap(this).getDatastorePartitions()

    /**
     * Where data store data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorestorage)
     */
    override fun datastoreStorage(): Any? = unwrap(this).getDatastoreStorage()

    /**
     * Contains the configuration information of file formats. AWS IoT Analytics data stores support
     * JSON and [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) .
     *
     * The default file format is JSON. You can specify only one format.
     *
     * You can't change the file format after you create the data store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-fileformatconfiguration)
     */
    override fun fileFormatConfiguration(): Any? = unwrap(this).getFileFormatConfiguration()

    /**
     * How long, in days, message data is kept for the data store.
     *
     * When `customerManagedS3` storage is selected, this parameter is ignored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-retentionperiod)
     */
    override fun retentionPeriod(): Any? = unwrap(this).getRetentionPeriod()

    /**
     * Metadata which can be used to manage the data store.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatastoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps):
        CfnDatastoreProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDatastoreProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatastoreProps):
        software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotanalytics.CfnDatastoreProps
  }
}
