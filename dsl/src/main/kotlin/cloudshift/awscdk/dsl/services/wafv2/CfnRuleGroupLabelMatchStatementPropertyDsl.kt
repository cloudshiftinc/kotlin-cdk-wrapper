@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * A rule statement to match against labels that have been added to the web request by rules that
 * have already run in the web ACL.
 *
 * The label match statement provides the label or namespace string to search for. The label string
 * can represent a part or all of the fully qualified label name that had been added to the web
 * request. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix
 * identifies the rule group or web ACL context of the rule that added the label. If you do not provide
 * the fully qualified name in your label match string, AWS WAF performs the search for labels that
 * were added in the same context as the label match statement.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * LabelMatchStatementProperty labelMatchStatementProperty = LabelMatchStatementProperty.builder()
 * .key("key")
 * .scope("scope")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-labelmatchstatement.html)
 */
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
