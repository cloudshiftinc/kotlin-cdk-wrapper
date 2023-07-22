@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateCustomActionURLOperationPropertyDsl {
  private val cdkBuilder: CfnTemplate.CustomActionURLOperationProperty.Builder =
      CfnTemplate.CustomActionURLOperationProperty.builder()

  /**
   * @param urlTarget The target of the `CustomActionURLOperation` . 
   * Valid values are defined as follows:
   *
   * * `NEW_TAB` : Opens the target URL in a new browser tab.
   * * `NEW_WINDOW` : Opens the target URL in a new browser window.
   * * `SAME_TAB` : Opens the target URL in the same browser tab.
   */
  public fun urlTarget(urlTarget: String) {
    cdkBuilder.urlTarget(urlTarget)
  }

  /**
   * @param urlTemplate THe URL link of the `CustomActionURLOperation` . 
   */
  public fun urlTemplate(urlTemplate: String) {
    cdkBuilder.urlTemplate(urlTemplate)
  }

  public fun build(): CfnTemplate.CustomActionURLOperationProperty = cdkBuilder.build()
}
