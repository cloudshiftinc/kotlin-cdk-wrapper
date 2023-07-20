@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

@CdkDslMarker
public class CfnPipelineDatastorePropertyDsl {
  private val cdkBuilder: CfnPipeline.DatastoreProperty.Builder =
      CfnPipeline.DatastoreProperty.builder()

  public fun datastoreName(datastoreName: String) {
    cdkBuilder.datastoreName(datastoreName)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnPipeline.DatastoreProperty = cdkBuilder.build()
}
