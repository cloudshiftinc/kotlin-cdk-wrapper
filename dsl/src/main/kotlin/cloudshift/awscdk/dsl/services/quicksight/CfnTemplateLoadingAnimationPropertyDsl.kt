@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateLoadingAnimationPropertyDsl {
  private val cdkBuilder: CfnTemplate.LoadingAnimationProperty.Builder =
      CfnTemplate.LoadingAnimationProperty.builder()

  /**
   * @param visibility The visibility configuration of `LoadingAnimation` .
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnTemplate.LoadingAnimationProperty = cdkBuilder.build()
}
