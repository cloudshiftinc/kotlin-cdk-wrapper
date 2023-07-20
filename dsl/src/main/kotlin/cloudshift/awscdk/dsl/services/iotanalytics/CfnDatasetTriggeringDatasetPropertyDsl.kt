@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetTriggeringDatasetPropertyDsl {
  private val cdkBuilder: CfnDataset.TriggeringDatasetProperty.Builder =
      CfnDataset.TriggeringDatasetProperty.builder()

  public fun datasetName(datasetName: String) {
    cdkBuilder.datasetName(datasetName)
  }

  public fun build(): CfnDataset.TriggeringDatasetProperty = cdkBuilder.build()
}
