@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDecimalValueWhenUnsetConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.DecimalValueWhenUnsetConfigurationProperty.Builder =
      CfnTemplate.DecimalValueWhenUnsetConfigurationProperty.builder()

  public fun customValue(customValue: Number) {
    cdkBuilder.customValue(customValue)
  }

  public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
    cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
  }

  public fun build(): CfnTemplate.DecimalValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
