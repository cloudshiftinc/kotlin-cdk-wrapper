@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

@CdkDslMarker
public class CfnPipelineDatastorePropertyDsl {
  private val cdkBuilder: CfnPipeline.DatastoreProperty.Builder =
      CfnPipeline.DatastoreProperty.builder()

  /**
   * @param datastoreName The name of the data store where processed messages are stored. 
   */
  public fun datastoreName(datastoreName: String) {
    cdkBuilder.datastoreName(datastoreName)
  }

  /**
   * @param name The name of the datastore activity. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnPipeline.DatastoreProperty = cdkBuilder.build()
}
