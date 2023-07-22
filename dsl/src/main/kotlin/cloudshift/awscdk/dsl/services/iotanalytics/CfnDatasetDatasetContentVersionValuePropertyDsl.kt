@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * The dataset whose latest contents are used as input to the notebook or application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * DatasetContentVersionValueProperty datasetContentVersionValueProperty =
 * DatasetContentVersionValueProperty.builder()
 * .datasetName("datasetName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentversionvalue.html)
 */
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
