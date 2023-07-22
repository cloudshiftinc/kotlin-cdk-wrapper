@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPanelTitleOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PanelTitleOptionsProperty.Builder =
      CfnAnalysis.PanelTitleOptionsProperty.builder()

  /**
   * @param fontConfiguration the value to be set.
   */
  public fun fontConfiguration(fontConfiguration: IResolvable) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  /**
   * @param fontConfiguration the value to be set.
   */
  public fun fontConfiguration(fontConfiguration: CfnAnalysis.FontConfigurationProperty) {
    cdkBuilder.fontConfiguration(fontConfiguration)
  }

  /**
   * @param horizontalTextAlignment Sets the horizontal text alignment of the title within each
   * panel.
   */
  public fun horizontalTextAlignment(horizontalTextAlignment: String) {
    cdkBuilder.horizontalTextAlignment(horizontalTextAlignment)
  }

  /**
   * @param visibility Determines whether or not panel titles are displayed.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.PanelTitleOptionsProperty = cdkBuilder.build()
}
