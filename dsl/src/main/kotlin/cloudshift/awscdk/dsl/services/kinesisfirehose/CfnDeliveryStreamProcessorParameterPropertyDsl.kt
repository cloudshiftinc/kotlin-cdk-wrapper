@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * The `ProcessorParameter` property specifies a processor parameter in a data processor for an
 * Amazon Kinesis Data Firehose delivery stream.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * ProcessorParameterProperty processorParameterProperty = ProcessorParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processorparameter.html)
 */
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
