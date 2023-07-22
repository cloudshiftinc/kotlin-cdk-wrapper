@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSecondaryValueOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.SecondaryValueOptionsProperty.Builder =
      CfnTemplate.SecondaryValueOptionsProperty.builder()

  /**
   * @param visibility Determines the visibility of the secondary value.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnTemplate.SecondaryValueOptionsProperty = cdkBuilder.build()
}
