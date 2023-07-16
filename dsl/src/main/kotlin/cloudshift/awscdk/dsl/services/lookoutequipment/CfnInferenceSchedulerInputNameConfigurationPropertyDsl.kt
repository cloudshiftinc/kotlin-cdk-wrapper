@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutequipment

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler

@CdkDslMarker
public class CfnInferenceSchedulerInputNameConfigurationPropertyDsl {
  private val cdkBuilder: CfnInferenceScheduler.InputNameConfigurationProperty.Builder =
      CfnInferenceScheduler.InputNameConfigurationProperty.builder()

  public fun componentTimestampDelimiter(componentTimestampDelimiter: String) {
    cdkBuilder.componentTimestampDelimiter(componentTimestampDelimiter)
  }

  public fun timestampFormat(timestampFormat: String) {
    cdkBuilder.timestampFormat(timestampFormat)
  }

  public fun build(): CfnInferenceScheduler.InputNameConfigurationProperty = cdkBuilder.build()
}
