@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

@CdkDslMarker
public class CfnDeliveryStreamProcessorParameterPropertyDsl {
  private val cdkBuilder: CfnDeliveryStream.ProcessorParameterProperty.Builder =
      CfnDeliveryStream.ProcessorParameterProperty.builder()

  /**
   * @param parameterName The name of the parameter. 
   * Currently the following default values are supported: 3 for `NumberOfRetries` and 60 for the
   * `BufferIntervalInSeconds` . The `BufferSizeInMBs` ranges between 0.2 MB and up to 3MB. The default
   * buffering hint is 1MB for all destinations, except Splunk. For Splunk, the default buffering hint
   * is 256 KB.
   */
  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  /**
   * @param parameterValue The parameter value. 
   */
  public fun parameterValue(parameterValue: String) {
    cdkBuilder.parameterValue(parameterValue)
  }

  public fun build(): CfnDeliveryStream.ProcessorParameterProperty = cdkBuilder.build()
}
