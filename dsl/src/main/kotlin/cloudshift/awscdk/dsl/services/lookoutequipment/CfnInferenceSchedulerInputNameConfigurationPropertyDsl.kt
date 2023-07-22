@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutequipment

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler

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
