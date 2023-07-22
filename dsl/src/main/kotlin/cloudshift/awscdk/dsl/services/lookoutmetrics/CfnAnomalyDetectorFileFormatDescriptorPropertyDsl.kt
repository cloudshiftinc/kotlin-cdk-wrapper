@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

@CdkDslMarker
public class CfnAnomalyDetectorFileFormatDescriptorPropertyDsl {
  private val cdkBuilder: CfnAnomalyDetector.FileFormatDescriptorProperty.Builder =
      CfnAnomalyDetector.FileFormatDescriptorProperty.builder()

  /**
   * @param csvFormatDescriptor Contains information about how a source CSV data file should be
   * analyzed.
   */
  public fun csvFormatDescriptor(csvFormatDescriptor: IResolvable) {
    cdkBuilder.csvFormatDescriptor(csvFormatDescriptor)
  }

  /**
   * @param csvFormatDescriptor Contains information about how a source CSV data file should be
   * analyzed.
   */
  public
      fun csvFormatDescriptor(csvFormatDescriptor: CfnAnomalyDetector.CsvFormatDescriptorProperty) {
    cdkBuilder.csvFormatDescriptor(csvFormatDescriptor)
  }

  /**
   * @param jsonFormatDescriptor Contains information about how a source JSON data file should be
   * analyzed.
   */
  public fun jsonFormatDescriptor(jsonFormatDescriptor: IResolvable) {
    cdkBuilder.jsonFormatDescriptor(jsonFormatDescriptor)
  }

  /**
   * @param jsonFormatDescriptor Contains information about how a source JSON data file should be
   * analyzed.
   */
  public
      fun jsonFormatDescriptor(jsonFormatDescriptor: CfnAnomalyDetector.JsonFormatDescriptorProperty) {
    cdkBuilder.jsonFormatDescriptor(jsonFormatDescriptor)
  }

  public fun build(): CfnAnomalyDetector.FileFormatDescriptorProperty = cdkBuilder.build()
}
