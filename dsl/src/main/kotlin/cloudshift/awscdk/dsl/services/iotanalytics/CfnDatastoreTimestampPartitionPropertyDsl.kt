@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@CdkDslMarker
public class CfnDatastoreTimestampPartitionPropertyDsl {
  private val cdkBuilder: CfnDatastore.TimestampPartitionProperty.Builder =
      CfnDatastore.TimestampPartitionProperty.builder()

  /**
   * @param attributeName The attribute name of the partition defined by a timestamp. 
   */
  public fun attributeName(attributeName: String) {
    cdkBuilder.attributeName(attributeName)
  }

  /**
   * @param timestampFormat The timestamp format of a partition defined by a timestamp.
   * The default format is seconds since epoch (January 1, 1970 at midnight UTC time).
   */
  public fun timestampFormat(timestampFormat: String) {
    cdkBuilder.timestampFormat(timestampFormat)
  }

  public fun build(): CfnDatastore.TimestampPartitionProperty = cdkBuilder.build()
}
