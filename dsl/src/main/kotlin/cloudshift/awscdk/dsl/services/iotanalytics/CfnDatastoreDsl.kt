@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore
import software.constructs.Construct

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
 * import software.amazon.awscdk.services.iotanalytics.*;
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
@CdkDslMarker
public class CfnDatastoreDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDatastore.Builder = CfnDatastore.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The name of the data store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorename)
   * @param datastoreName The name of the data store. 
   */
  public fun datastoreName(datastoreName: String) {
    cdkBuilder.datastoreName(datastoreName)
  }

  /**
   * Information about the partition dimensions in a data store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorepartitions)
   * @param datastorePartitions Information about the partition dimensions in a data store. 
   */
  public fun datastorePartitions(datastorePartitions: IResolvable) {
    cdkBuilder.datastorePartitions(datastorePartitions)
  }

  /**
   * Information about the partition dimensions in a data store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorepartitions)
   * @param datastorePartitions Information about the partition dimensions in a data store. 
   */
  public fun datastorePartitions(datastorePartitions: CfnDatastore.DatastorePartitionsProperty) {
    cdkBuilder.datastorePartitions(datastorePartitions)
  }

  /**
   * Where data store data is stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorestorage)
   * @param datastoreStorage Where data store data is stored. 
   */
  public fun datastoreStorage(datastoreStorage: IResolvable) {
    cdkBuilder.datastoreStorage(datastoreStorage)
  }

  /**
   * Where data store data is stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-datastorestorage)
   * @param datastoreStorage Where data store data is stored. 
   */
  public fun datastoreStorage(datastoreStorage: CfnDatastore.DatastoreStorageProperty) {
    cdkBuilder.datastoreStorage(datastoreStorage)
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
   * @param fileFormatConfiguration Contains the configuration information of file formats. AWS IoT
   * Analytics data stores support JSON and
   * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) . 
   */
  public fun fileFormatConfiguration(fileFormatConfiguration: IResolvable) {
    cdkBuilder.fileFormatConfiguration(fileFormatConfiguration)
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
   * @param fileFormatConfiguration Contains the configuration information of file formats. AWS IoT
   * Analytics data stores support JSON and
   * [Parquet](https://docs.aws.amazon.com/https://parquet.apache.org/) . 
   */
  public
      fun fileFormatConfiguration(fileFormatConfiguration: CfnDatastore.FileFormatConfigurationProperty) {
    cdkBuilder.fileFormatConfiguration(fileFormatConfiguration)
  }

  /**
   * How long, in days, message data is kept for the data store.
   *
   * When `customerManagedS3` storage is selected, this parameter is ignored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-retentionperiod)
   * @param retentionPeriod How long, in days, message data is kept for the data store. 
   */
  public fun retentionPeriod(retentionPeriod: IResolvable) {
    cdkBuilder.retentionPeriod(retentionPeriod)
  }

  /**
   * How long, in days, message data is kept for the data store.
   *
   * When `customerManagedS3` storage is selected, this parameter is ignored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotanalytics-datastore.html#cfn-iotanalytics-datastore-retentionperiod)
   * @param retentionPeriod How long, in days, message data is kept for the data store. 
   */
  public fun retentionPeriod(retentionPeriod: CfnDatastore.RetentionPeriodProperty) {
    cdkBuilder.retentionPeriod(retentionPeriod)
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
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
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
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDatastore {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
