@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePivotTableConditionalFormattingScopePropertyDsl {
  private val cdkBuilder: CfnTemplate.PivotTableConditionalFormattingScopeProperty.Builder =
      CfnTemplate.PivotTableConditionalFormattingScopeProperty.builder()

  /**
   * @param role The role (field, field total, grand total) of the cell for conditional formatting.
   */
  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  public fun build(): CfnTemplate.PivotTableConditionalFormattingScopeProperty = cdkBuilder.build()
}
