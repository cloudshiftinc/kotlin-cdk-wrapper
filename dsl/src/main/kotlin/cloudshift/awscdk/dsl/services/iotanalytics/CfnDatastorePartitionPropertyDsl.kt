@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDatastore

@CdkDslMarker
public class CfnDatastorePartitionPropertyDsl {
  private val cdkBuilder: CfnDatastore.PartitionProperty.Builder =
      CfnDatastore.PartitionProperty.builder()

  /**
   * @param attributeName The name of the attribute that defines a partition dimension. 
   */
  public fun attributeName(attributeName: String) {
    cdkBuilder.attributeName(attributeName)
  }

  public fun build(): CfnDatastore.PartitionProperty = cdkBuilder.build()
}
