@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePanelTitleOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.PanelTitleOptionsProperty.Builder =
      CfnTemplate.PanelTitleOptionsProperty.builder()

  public fun fontConfiguration(fontConfiguration: IResolvable) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  public fun fontConfiguration(fontConfiguration: CfnTemplate.FontConfigurationProperty) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  public fun horizontalTextAlignment(horizontalTextAlignment: String) {
    cdkBuilder.horizontalTextAlignment(horizontalTextAlignment)
  }

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnTemplate.PanelTitleOptionsProperty = cdkBuilder.build()
}
