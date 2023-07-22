@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFreeFormLayoutElementBorderStylePropertyDsl {
  private val cdkBuilder: CfnAnalysis.FreeFormLayoutElementBorderStyleProperty.Builder =
      CfnAnalysis.FreeFormLayoutElementBorderStyleProperty.builder()

  /**
   * @param color The border color of a free-form layout element.
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  /**
   * @param visibility The border visibility of a free-form layout element.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.FreeFormLayoutElementBorderStyleProperty = cdkBuilder.build()
}
