@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateRangeEndsLabelTypePropertyDsl {
  private val cdkBuilder: CfnTemplate.RangeEndsLabelTypeProperty.Builder =
      CfnTemplate.RangeEndsLabelTypeProperty.builder()

  /**
   * @param visibility The visibility of the range ends label.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnTemplate.RangeEndsLabelTypeProperty = cdkBuilder.build()
}
