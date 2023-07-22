@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * Information about the dataset whose content generation triggers the new dataset content
 * generation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * TriggeringDatasetProperty triggeringDatasetProperty = TriggeringDatasetProperty.builder()
 * .datasetName("datasetName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-triggeringdataset.html)
 */
@CdkDslMarker
public class CfnDatasetTriggeringDatasetPropertyDsl {
  private val cdkBuilder: CfnDataset.TriggeringDatasetProperty.Builder =
      CfnDataset.TriggeringDatasetProperty.builder()

  /**
   * @param datasetName The name of the data set whose content generation triggers the new data set
   * content generation. 
   */
  public fun datasetName(datasetName: String) {
    cdkBuilder.datasetName(datasetName)
  }

  public fun build(): CfnDataset.TriggeringDatasetProperty = cdkBuilder.build()
}
