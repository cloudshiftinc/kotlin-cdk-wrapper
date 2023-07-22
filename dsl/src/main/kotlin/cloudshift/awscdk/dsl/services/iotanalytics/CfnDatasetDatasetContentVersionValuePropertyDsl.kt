@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetDatasetContentVersionValuePropertyDsl {
  private val cdkBuilder: CfnDataset.DatasetContentVersionValueProperty.Builder =
      CfnDataset.DatasetContentVersionValueProperty.builder()

  /**
   * @param datasetName The name of the dataset whose latest contents are used as input to the
   * notebook or application. 
   */
  public fun datasetName(datasetName: String) {
    cdkBuilder.datasetName(datasetName)
  }

  public fun build(): CfnDataset.DatasetContentVersionValueProperty = cdkBuilder.build()
}
