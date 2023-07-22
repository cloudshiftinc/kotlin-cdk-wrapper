@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

@CdkDslMarker
public class CfnLoggingConfigurationConditionPropertyDsl {
  private val cdkBuilder: CfnLoggingConfiguration.ConditionProperty.Builder =
      CfnLoggingConfiguration.ConditionProperty.builder()

  /**
   * @param actionCondition A single action condition.
   * This is the action setting that a log record must contain in order to meet the condition.
   */
  public fun actionCondition(actionCondition: IResolvable) {
    cdkBuilder.actionCondition(actionCondition)
  }

  /**
   * @param actionCondition A single action condition.
   * This is the action setting that a log record must contain in order to meet the condition.
   */
  public fun actionCondition(actionCondition: CfnLoggingConfiguration.ActionConditionProperty) {
    cdkBuilder.actionCondition(actionCondition)
  }

  /**
   * @param labelNameCondition A single label name condition.
   * This is the fully qualified label name that a log record must contain in order to meet the
   * condition. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix
   * identifies the rule group or web ACL context of the rule that added the label.
   */
  public fun labelNameCondition(labelNameCondition: IResolvable) {
    cdkBuilder.labelNameCondition(labelNameCondition)
  }

  /**
   * @param labelNameCondition A single label name condition.
   * This is the fully qualified label name that a log record must contain in order to meet the
   * condition. Fully qualified labels have a prefix, optional namespaces, and label name. The prefix
   * identifies the rule group or web ACL context of the rule that added the label.
   */
  public
      fun labelNameCondition(labelNameCondition: CfnLoggingConfiguration.LabelNameConditionProperty) {
    cdkBuilder.labelNameCondition(labelNameCondition)
  }

  public fun build(): CfnLoggingConfiguration.ConditionProperty = cdkBuilder.build()
}
