@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupLabelPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.LabelProperty.Builder = CfnRuleGroup.LabelProperty.builder()

  /**
   * @param name The label string. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnRuleGroup.LabelProperty = cdkBuilder.build()
}
