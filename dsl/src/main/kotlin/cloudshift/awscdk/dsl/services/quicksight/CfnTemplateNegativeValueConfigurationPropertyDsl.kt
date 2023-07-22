@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateNegativeValueConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.NegativeValueConfigurationProperty.Builder =
      CfnTemplate.NegativeValueConfigurationProperty.builder()

  /**
   * @param displayMode Determines the display mode of the negative value configuration. 
   */
  public fun displayMode(displayMode: String) {
    cdkBuilder.displayMode(displayMode)
  }

  public fun build(): CfnTemplate.NegativeValueConfigurationProperty = cdkBuilder.build()
}
