@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

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
 * import software.amazon.awscdk.services.iotanalytics.*;
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
@CdkDslMarker
public class CfnDatastoreDatastorePartitionPropertyDsl {
  private val cdkBuilder: CfnDatastore.DatastorePartitionProperty.Builder =
      CfnDatastore.DatastorePartitionProperty.builder()

  /**
   * @param partition A partition dimension defined by an attribute.
   */
  public fun partition(partition: IResolvable) {
    cdkBuilder.partition(partition)
  }

  /**
   * @param partition A partition dimension defined by an attribute.
   */
  public fun partition(partition: CfnDatastore.PartitionProperty) {
    cdkBuilder.partition(partition)
  }

  /**
   * @param timestampPartition A partition dimension defined by a timestamp attribute.
   */
  public fun timestampPartition(timestampPartition: IResolvable) {
    cdkBuilder.timestampPartition(timestampPartition)
  }

  /**
   * @param timestampPartition A partition dimension defined by a timestamp attribute.
   */
  public fun timestampPartition(timestampPartition: CfnDatastore.TimestampPartitionProperty) {
    cdkBuilder.timestampPartition(timestampPartition)
  }

  public fun build(): CfnDatastore.DatastorePartitionProperty = cdkBuilder.build()
}
