@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * The value of the variable as a structure that specifies an output file URI.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * OutputFileUriValueProperty outputFileUriValueProperty = OutputFileUriValueProperty.builder()
 * .fileName("fileName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-outputfileurivalue.html)
 */
@CdkDslMarker
public class CfnDatasetOutputFileUriValuePropertyDsl {
  private val cdkBuilder: CfnDataset.OutputFileUriValueProperty.Builder =
      CfnDataset.OutputFileUriValueProperty.builder()

  /**
   * @param fileName The URI of the location where dataset contents are stored, usually the URI of a
   * file in an S3 bucket. 
   */
  public fun fileName(fileName: String) {
    cdkBuilder.fileName(fileName)
  }

  public fun build(): CfnDataset.OutputFileUriValueProperty = cdkBuilder.build()
}
