@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutequipment

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler

/**
 * Specifies configuration information for the input data for the inference, including timestamp
 * format and delimiter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutequipment.*;
 * InputNameConfigurationProperty inputNameConfigurationProperty =
 * InputNameConfigurationProperty.builder()
 * .componentTimestampDelimiter("componentTimestampDelimiter")
 * .timestampFormat("timestampFormat")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutequipment-inferencescheduler-inputnameconfiguration.html)
 */
@CdkDslMarker
public class CfnInferenceSchedulerInputNameConfigurationPropertyDsl {
  private val cdkBuilder: CfnInferenceScheduler.InputNameConfigurationProperty.Builder =
      CfnInferenceScheduler.InputNameConfigurationProperty.builder()

  /**
   * @param componentTimestampDelimiter Indicates the delimiter character used between items in the
   * data.
   */
  public fun componentTimestampDelimiter(componentTimestampDelimiter: String) {
    cdkBuilder.componentTimestampDelimiter(componentTimestampDelimiter)
  }

  /**
   * @param timestampFormat The format of the timestamp, whether Epoch time, or standard, with or
   * without hyphens (-).
   */
  public fun timestampFormat(timestampFormat: String) {
    cdkBuilder.timestampFormat(timestampFormat)
  }

  public fun build(): CfnInferenceScheduler.InputNameConfigurationProperty = cdkBuilder.build()
}
