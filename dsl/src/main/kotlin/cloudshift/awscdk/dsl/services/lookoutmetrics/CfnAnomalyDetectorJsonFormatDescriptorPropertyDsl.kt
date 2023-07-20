@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorJsonFormatDescriptorPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.JsonFormatDescriptorProperty.Builder =
      CfnAnomalyDetector.JsonFormatDescriptorProperty.builder()

  public fun charset(charset: String) {
    cdkBuilder.charset(charset)
  }

  public fun fileCompression(fileCompression: String) {
    cdkBuilder.fileCompression(fileCompression)
  }

  public fun build(): CfnAnomalyDetector.JsonFormatDescriptorProperty = cdkBuilder.build()
}
