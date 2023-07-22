@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.securityhub.CfnAutomationRule

/**
 * One or more actions to update finding fields if a finding matches the defined criteria of the
 * rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.securityhub.*;
 * Object id;
 * Object updatedBy;
 * AutomationRulesActionProperty automationRulesActionProperty =
 * AutomationRulesActionProperty.builder()
 * .findingFieldsUpdate(AutomationRulesFindingFieldsUpdateProperty.builder()
 * .confidence(123)
 * .criticality(123)
 * .note(NoteUpdateProperty.builder()
 * .text("text")
 * .updatedBy(updatedBy)
 * .build())
 * .relatedFindings(List.of(RelatedFindingProperty.builder()
 * .id(id)
 * .productArn("productArn")
 * .build()))
 * .severity(SeverityUpdateProperty.builder()
 * .label("label")
 * .normalized(123)
 * .product(123)
 * .build())
 * .types(List.of("types"))
 * .userDefinedFields(Map.of(
 * "userDefinedFieldsKey", "userDefinedFields"))
 * .verificationState("verificationState")
 * .workflow(WorkflowUpdateProperty.builder()
 * .status("status")
 * .build())
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-automationrule-automationrulesaction.html)
 */
@CdkDslMarker
public class CfnAutomationRuleAutomationRulesActionPropertyDsl {
  private val cdkBuilder: CfnAutomationRule.AutomationRulesActionProperty.Builder =
      CfnAutomationRule.AutomationRulesActionProperty.builder()

  /**
   * @param findingFieldsUpdate Specifies that the automation rule action is an update to a finding
   * field. 
   */
  public fun findingFieldsUpdate(findingFieldsUpdate: IResolvable) {
    cdkBuilder.findingFieldsUpdate(findingFieldsUpdate)
  }

  /**
   * @param findingFieldsUpdate Specifies that the automation rule action is an update to a finding
   * field. 
   */
  public
      fun findingFieldsUpdate(findingFieldsUpdate: CfnAutomationRule.AutomationRulesFindingFieldsUpdateProperty) {
    cdkBuilder.findingFieldsUpdate(findingFieldsUpdate)
  }

  /**
   * @param type Specifies that the rule action should update the `Types` finding field. 
   * The `Types` finding field classifies findings in the format of namespace/category/classifier.
   * For more information, see [Types taxonomy for
   * ASFF](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-findings-format-type-taxonomy.html)
   * in the *AWS Security Hub User Guide* .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnAutomationRule.AutomationRulesActionProperty = cdkBuilder.build()
}
