@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateListControlSearchOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.ListControlSearchOptionsProperty.Builder =
      CfnTemplate.ListControlSearchOptionsProperty.builder()

  /**
   * @param visibility The visibility configuration of the search options in a list control.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnTemplate.ListControlSearchOptionsProperty = cdkBuilder.build()
}
