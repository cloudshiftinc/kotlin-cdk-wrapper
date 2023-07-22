@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

@CdkDslMarker
public class CfnRuleGroupLabelMatchStatementPropertyDsl {
  private val cdkBuilder: CfnRuleGroup.LabelMatchStatementProperty.Builder =
      CfnRuleGroup.LabelMatchStatementProperty.builder()

  /**
   * @param key The string to match against. The setting you provide for this depends on the match
   * statement's `Scope` setting:. 
   * * If the `Scope` indicates `LABEL` , then this specification must include the name and can
   * include any number of preceding namespace specifications and prefix up to providing the fully
   * qualified label name.
   * * If the `Scope` indicates `NAMESPACE` , then this specification can include any number of
   * contiguous namespace strings, and can include the entire label namespace prefix from the rule
   * group or web ACL where the label originates.
   *
   * Labels are case sensitive and components of a label must be separated by colon, for example
   * `NS1:NS2:name` .
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param scope Specify whether you want to match using the label name or just the namespace. 
   */
  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  public fun build(): CfnRuleGroup.LabelMatchStatementProperty = cdkBuilder.build()
}
