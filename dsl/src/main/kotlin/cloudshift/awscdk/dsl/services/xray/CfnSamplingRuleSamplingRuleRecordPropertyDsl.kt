@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.xray

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnSamplingRule

@CdkDslMarker
public class CfnSamplingRuleSamplingRuleRecordPropertyDsl {
  private val cdkBuilder: CfnSamplingRule.SamplingRuleRecordProperty.Builder =
      CfnSamplingRule.SamplingRuleRecordProperty.builder()

  /**
   * @param createdAt When the rule was created, in Unix time seconds.
   */
  public fun createdAt(createdAt: String) {
    cdkBuilder.createdAt(createdAt)
  }

  /**
   * @param modifiedAt When the rule was modified, in Unix time seconds.
   */
  public fun modifiedAt(modifiedAt: String) {
    cdkBuilder.modifiedAt(modifiedAt)
  }

  /**
   * @param samplingRule the value to be set.
   */
  public fun samplingRule(samplingRule: IResolvable) {
    cdkBuilder.samplingRule(samplingRule)
  }

  /**
   * @param samplingRule the value to be set.
   */
  public fun samplingRule(samplingRule: CfnSamplingRule.SamplingRuleProperty) {
    cdkBuilder.samplingRule(samplingRule)
  }

  public fun build(): CfnSamplingRule.SamplingRuleRecordProperty = cdkBuilder.build()
}
