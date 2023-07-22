@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateTrendArrowOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.TrendArrowOptionsProperty.Builder =
      CfnTemplate.TrendArrowOptionsProperty.builder()

  /**
   * @param visibility The visibility of the trend arrows.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnTemplate.TrendArrowOptionsProperty = cdkBuilder.build()
}
