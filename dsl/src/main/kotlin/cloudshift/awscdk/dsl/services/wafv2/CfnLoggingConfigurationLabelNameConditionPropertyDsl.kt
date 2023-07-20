@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

@CdkDslMarker
public class CfnLoggingConfigurationLabelNameConditionPropertyDsl {
  private val cdkBuilder: CfnLoggingConfiguration.LabelNameConditionProperty.Builder =
      CfnLoggingConfiguration.LabelNameConditionProperty.builder()

  public fun labelName(labelName: String) {
    cdkBuilder.labelName(labelName)
  }

  public fun build(): CfnLoggingConfiguration.LabelNameConditionProperty = cdkBuilder.build()
}
