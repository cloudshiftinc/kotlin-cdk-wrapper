@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * List of labels used by one or more of the rules of a `RuleGroup` .
 *
 * This summary object is used for the following rule group lists:
 *
 * * `AvailableLabels` - Labels that rules add to matching requests. These labels are defined in the
 * `RuleLabels` for a rule.
 * * `ConsumedLabels` - Labels that rules match against. These labels are defined in a
 * `LabelMatchStatement` specification, in the `Statement` definition of a rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * LabelSummaryProperty labelSummaryProperty = LabelSummaryProperty.builder()
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-labelsummary.html)
 */
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
