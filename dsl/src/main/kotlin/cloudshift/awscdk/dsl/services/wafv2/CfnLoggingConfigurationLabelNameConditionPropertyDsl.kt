@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration

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
