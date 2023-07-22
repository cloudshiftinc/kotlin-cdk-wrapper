@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

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
