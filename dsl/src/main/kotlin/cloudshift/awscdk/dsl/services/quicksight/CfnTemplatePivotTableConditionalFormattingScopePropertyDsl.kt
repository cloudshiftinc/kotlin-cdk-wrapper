@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The scope of the cell for conditional formatting.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTableConditionalFormattingScopeProperty pivotTableConditionalFormattingScopeProperty =
 * PivotTableConditionalFormattingScopeProperty.builder()
 * .role("role")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-pivottableconditionalformattingscope.html)
 */
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
