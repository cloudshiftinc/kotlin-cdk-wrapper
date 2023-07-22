@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateListControlSelectAllOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.ListControlSelectAllOptionsProperty.Builder =
      CfnTemplate.ListControlSelectAllOptionsProperty.builder()

  /**
   * @param visibility The visibility configuration of the `Select all` options in a list control.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnTemplate.ListControlSelectAllOptionsProperty = cdkBuilder.build()
}
