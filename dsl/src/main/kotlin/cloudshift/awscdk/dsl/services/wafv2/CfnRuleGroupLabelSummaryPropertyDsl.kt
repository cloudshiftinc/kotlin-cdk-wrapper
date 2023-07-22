@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupLabelSummaryPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.LabelSummaryProperty.Builder =
      CfnRuleGroup.LabelSummaryProperty.builder()

  /**
   * @param name An individual label specification.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnRuleGroup.LabelSummaryProperty = cdkBuilder.build()
}
