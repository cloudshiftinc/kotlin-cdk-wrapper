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
import software.constructs.Construct

@CdkDslMarker
public class CfnSamplingRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSamplingRule.Builder = CfnSamplingRule.Builder.create(scope, id)

  private val _tags: MutableList<Any> = mutableListOf()

  /**
   * (deprecated) The ARN of the sampling rule.
   *
   * Specify a rule by either name or ARN, but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-rulename)
   * @deprecated this property has been deprecated
   * @param ruleName The ARN of the sampling rule. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  /**
   * The sampling rule to be created or updated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrule)
   * @param samplingRule The sampling rule to be created or updated. 
   */
  public fun samplingRule(samplingRule: IResolvable) {
    cdkBuilder.samplingRule(samplingRule)
  }

  /**
   * The sampling rule to be created or updated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrule)
   * @param samplingRule The sampling rule to be created or updated. 
   */
  public fun samplingRule(samplingRule: CfnSamplingRule.SamplingRuleProperty) {
    cdkBuilder.samplingRule(samplingRule)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrulerecord)
   * @deprecated this property has been deprecated
   * @param samplingRuleRecord 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun samplingRuleRecord(samplingRuleRecord: IResolvable) {
    cdkBuilder.samplingRuleRecord(samplingRuleRecord)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrulerecord)
   * @deprecated this property has been deprecated
   * @param samplingRuleRecord 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun samplingRuleRecord(samplingRuleRecord: CfnSamplingRule.SamplingRuleRecordProperty) {
    cdkBuilder.samplingRuleRecord(samplingRuleRecord)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingruleupdate)
   * @deprecated this property has been deprecated
   * @param samplingRuleUpdate 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun samplingRuleUpdate(samplingRuleUpdate: IResolvable) {
    cdkBuilder.samplingRuleUpdate(samplingRuleUpdate)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingruleupdate)
   * @deprecated this property has been deprecated
   * @param samplingRuleUpdate 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun samplingRuleUpdate(samplingRuleUpdate: CfnSamplingRule.SamplingRuleUpdateProperty) {
    cdkBuilder.samplingRuleUpdate(samplingRuleUpdate)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(vararg tags: Any) {
    _tags.addAll(listOf(*tags))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<Any>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSamplingRule {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
