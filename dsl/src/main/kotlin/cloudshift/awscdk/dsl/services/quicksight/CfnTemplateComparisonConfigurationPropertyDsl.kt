@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateComparisonConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.ComparisonConfigurationProperty.Builder =
      CfnTemplate.ComparisonConfigurationProperty.builder()

  public fun comparisonFormat(comparisonFormat: IResolvable) {
    cdkBuilder.comparisonFormat(comparisonFormat)
  }

  public fun comparisonFormat(comparisonFormat: CfnTemplate.ComparisonFormatConfigurationProperty) {
    cdkBuilder.comparisonFormat(comparisonFormat)
  }

  public fun comparisonMethod(comparisonMethod: String) {
    cdkBuilder.comparisonMethod(comparisonMethod)
  }

  public fun build(): CfnTemplate.ComparisonConfigurationProperty = cdkBuilder.build()
}
