@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * A structure that contains the name and configuration information of a late data rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * LateDataRuleProperty lateDataRuleProperty = LateDataRuleProperty.builder()
 * .ruleConfiguration(LateDataRuleConfigurationProperty.builder()
 * .deltaTimeSessionWindowConfiguration(DeltaTimeSessionWindowConfigurationProperty.builder()
 * .timeoutInMinutes(123)
 * .build())
 * .build())
 * // the properties below are optional
 * .ruleName("ruleName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-latedatarule.html)
 */
@CdkDslMarker
public class CfnDatasetLateDataRulePropertyDsl {
  private val cdkBuilder: CfnDataset.LateDataRuleProperty.Builder =
      CfnDataset.LateDataRuleProperty.builder()

  /**
   * @param ruleConfiguration The information needed to configure the late data rule. 
   */
  public fun ruleConfiguration(ruleConfiguration: IResolvable) {
    cdkBuilder.ruleConfiguration(ruleConfiguration)
  }

  /**
   * @param ruleConfiguration The information needed to configure the late data rule. 
   */
  public fun ruleConfiguration(ruleConfiguration: CfnDataset.LateDataRuleConfigurationProperty) {
    cdkBuilder.ruleConfiguration(ruleConfiguration)
  }

  /**
   * @param ruleName The name of the late data rule.
   */
  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  public fun build(): CfnDataset.LateDataRuleProperty = cdkBuilder.build()
}
