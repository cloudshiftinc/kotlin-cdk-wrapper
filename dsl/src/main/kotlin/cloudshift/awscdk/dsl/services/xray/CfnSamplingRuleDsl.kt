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

/**
 * Use the `AWS::XRay::SamplingRule` resource to specify a sampling rule, which controls sampling
 * behavior for instrumented applications.
 *
 * Include a `SamplingRule` entity to create or update a sampling rule.
 *
 *
 * `SamplingRule.Version` can only be set when creating a sampling rule. Updating the version will
 * cause the update to fail.
 *
 *
 * Services retrieve rules with
 * [GetSamplingRules](https://docs.aws.amazon.com//xray/latest/api/API_GetSamplingRules.html) , and
 * evaluate each rule in ascending order of *priority* for each request. If a rule matches, the service
 * records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports back to
 * X-Ray with
 * [GetSamplingTargets](https://docs.aws.amazon.com//xray/latest/api/API_GetSamplingTargets.html) to
 * get updated versions of each in-use rule. The updated rule contains a trace quota that the service
 * can use instead of borrowing from the reservoir.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.xray.*;
 * Object tags;
 * CfnSamplingRule cfnSamplingRule = CfnSamplingRule.Builder.create(this, "MyCfnSamplingRule")
 * .ruleName("ruleName")
 * .samplingRule(SamplingRuleProperty.builder()
 * .fixedRate(123)
 * .host("host")
 * .httpMethod("httpMethod")
 * .priority(123)
 * .reservoirSize(123)
 * .resourceArn("resourceArn")
 * .serviceName("serviceName")
 * .serviceType("serviceType")
 * .urlPath("urlPath")
 * // the properties below are optional
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .ruleArn("ruleArn")
 * .ruleName("ruleName")
 * .version(123)
 * .build())
 * .samplingRuleRecord(SamplingRuleRecordProperty.builder()
 * .createdAt("createdAt")
 * .modifiedAt("modifiedAt")
 * .samplingRule(SamplingRuleProperty.builder()
 * .fixedRate(123)
 * .host("host")
 * .httpMethod("httpMethod")
 * .priority(123)
 * .reservoirSize(123)
 * .resourceArn("resourceArn")
 * .serviceName("serviceName")
 * .serviceType("serviceType")
 * .urlPath("urlPath")
 * // the properties below are optional
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .ruleArn("ruleArn")
 * .ruleName("ruleName")
 * .version(123)
 * .build())
 * .build())
 * .samplingRuleUpdate(SamplingRuleUpdateProperty.builder()
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .fixedRate(123)
 * .host("host")
 * .httpMethod("httpMethod")
 * .priority(123)
 * .reservoirSize(123)
 * .resourceArn("resourceArn")
 * .ruleArn("ruleArn")
 * .ruleName("ruleName")
 * .serviceName("serviceName")
 * .serviceType("serviceType")
 * .urlPath("urlPath")
 * .build())
 * .tags(List.of(tags))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html)
 */
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
