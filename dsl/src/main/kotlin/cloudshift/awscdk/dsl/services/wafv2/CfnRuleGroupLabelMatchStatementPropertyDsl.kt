@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupLabelMatchStatementPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.LabelMatchStatementProperty.Builder =
      CfnRuleGroup.LabelMatchStatementProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  public fun build(): CfnRuleGroup.LabelMatchStatementProperty = cdkBuilder.build()
}
