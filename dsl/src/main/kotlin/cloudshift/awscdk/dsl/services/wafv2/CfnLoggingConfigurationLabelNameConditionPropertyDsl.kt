@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

/**
 * A single label name condition for a condition in a logging filter.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * LabelNameConditionProperty labelNameConditionProperty = LabelNameConditionProperty.builder()
 * .labelName("labelName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-loggingconfiguration-labelnamecondition.html)
 */
@CdkDslMarker
public class CfnLoggingConfigurationLabelNameConditionPropertyDsl {
  private val cdkBuilder: CfnLoggingConfiguration.LabelNameConditionProperty.Builder =
      CfnLoggingConfiguration.LabelNameConditionProperty.builder()

  /**
   * @param labelName The label name that a log record must contain in order to meet the condition. 
   * This must be a fully qualified label name. Fully qualified labels have a prefix, optional
   * namespaces, and label name. The prefix identifies the rule group or web ACL context of the rule
   * that added the label.
   */
  public fun labelName(labelName: String) {
    cdkBuilder.labelName(labelName)
  }

  public fun build(): CfnLoggingConfiguration.LabelNameConditionProperty = cdkBuilder.build()
}
