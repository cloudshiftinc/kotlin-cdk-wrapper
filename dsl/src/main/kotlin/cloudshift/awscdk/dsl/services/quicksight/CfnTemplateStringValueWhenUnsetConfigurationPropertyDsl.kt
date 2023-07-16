@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateStringValueWhenUnsetConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.StringValueWhenUnsetConfigurationProperty.Builder =
      CfnTemplate.StringValueWhenUnsetConfigurationProperty.builder()

  public fun customValue(customValue: String) {
    cdkBuilder.customValue(customValue)
  }

  public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
    cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
  }

  public fun build(): CfnTemplate.StringValueWhenUnsetConfigurationProperty = cdkBuilder.build()
}
