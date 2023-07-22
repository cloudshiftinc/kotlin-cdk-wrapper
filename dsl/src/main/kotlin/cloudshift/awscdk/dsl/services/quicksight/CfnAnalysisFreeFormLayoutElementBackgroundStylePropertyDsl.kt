@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFreeFormLayoutElementBackgroundStylePropertyDsl {
  private val cdkBuilder: CfnAnalysis.FreeFormLayoutElementBackgroundStyleProperty.Builder =
      CfnAnalysis.FreeFormLayoutElementBackgroundStyleProperty.builder()

  /**
   * @param color The background color of a free-form layout element.
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  /**
   * @param visibility The background visibility of a free-form layout element.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.FreeFormLayoutElementBackgroundStyleProperty = cdkBuilder.build()
}
