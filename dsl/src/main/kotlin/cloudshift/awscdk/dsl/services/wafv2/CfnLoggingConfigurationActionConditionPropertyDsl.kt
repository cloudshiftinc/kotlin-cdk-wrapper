@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

/**
 * A single action condition for a condition in a logging filter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * ActionConditionProperty actionConditionProperty = ActionConditionProperty.builder()
 * .action("action")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-actioncondition.html)
 */
@CdkDslMarker
public class CfnLoggingConfigurationActionConditionPropertyDsl {
  private val cdkBuilder: CfnLoggingConfiguration.ActionConditionProperty.Builder =
      CfnLoggingConfiguration.ActionConditionProperty.builder()

  /**
   * @param action The action setting that a log record must contain in order to meet the condition.
   * 
   * This is the action that AWS WAF applied to the web request.
   *
   * For rule groups, this is either the configured rule action setting, or if you've applied a rule
   * action override to the rule, it's the override action. The value `EXCLUDED_AS_COUNT` matches on
   * excluded rules and also on rules that have a rule action override of Count.
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  public fun build(): CfnLoggingConfiguration.ActionConditionProperty = cdkBuilder.build()
}
