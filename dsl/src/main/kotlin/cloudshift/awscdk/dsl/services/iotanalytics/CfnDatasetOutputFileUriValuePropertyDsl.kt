@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDataset

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
