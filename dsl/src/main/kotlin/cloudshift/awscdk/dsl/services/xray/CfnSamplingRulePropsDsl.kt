@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.xray

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnSamplingRule
import software.amazon.awscdk.services.xray.CfnSamplingRuleProps

@CdkDslMarker
public class CfnSamplingRulePropsDsl {
  private val cdkBuilder: CfnSamplingRuleProps.Builder = CfnSamplingRuleProps.builder()

  private val _tags: MutableList<Any> = mutableListOf()

  /**
   * @param ruleName The ARN of the sampling rule.
   * Specify a rule by either name or ARN, but not both.
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  /**
   * @param samplingRule The sampling rule to be created or updated.
   */
  public fun samplingRule(samplingRule: IResolvable) {
    cdkBuilder.samplingRule(samplingRule)
  }

  /**
   * @param samplingRule The sampling rule to be created or updated.
   */
  public fun samplingRule(samplingRule: CfnSamplingRule.SamplingRuleProperty) {
    cdkBuilder.samplingRule(samplingRule)
  }

  /**
   * @param samplingRuleRecord the value to be set.
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun samplingRuleRecord(samplingRuleRecord: IResolvable) {
    cdkBuilder.samplingRuleRecord(samplingRuleRecord)
  }

  /**
   * @param samplingRuleRecord the value to be set.
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun samplingRuleRecord(samplingRuleRecord: CfnSamplingRule.SamplingRuleRecordProperty) {
    cdkBuilder.samplingRuleRecord(samplingRuleRecord)
  }

  /**
   * @param samplingRuleUpdate the value to be set.
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun samplingRuleUpdate(samplingRuleUpdate: IResolvable) {
    cdkBuilder.samplingRuleUpdate(samplingRuleUpdate)
  }

  /**
   * @param samplingRuleUpdate the value to be set.
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun samplingRuleUpdate(samplingRuleUpdate: CfnSamplingRule.SamplingRuleUpdateProperty) {
    cdkBuilder.samplingRuleUpdate(samplingRuleUpdate)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   */
  public fun tags(vararg tags: Any) {
    _tags.addAll(listOf(*tags))
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   */
  public fun tags(tags: Collection<Any>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSamplingRuleProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
