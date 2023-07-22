@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigRule
import software.constructs.Construct

@CdkDslMarker
public class CfnConfigRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConfigRule.Builder = CfnConfigRule.Builder.create(scope, id)

  /**
   * A name for the AWS Config rule.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the rule name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-configrulename)
   * @param configRuleName A name for the AWS Config rule. 
   */
  public fun configRuleName(configRuleName: String) {
    cdkBuilder.configRuleName(configRuleName)
  }

  /**
   * The description that you provide for the AWS Config rule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-description)
   * @param description The description that you provide for the AWS Config rule. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-inputparameters)
   * @param inputParameters A string, in JSON format, that is passed to the AWS Config rule Lambda
   * function. 
   */
  public fun inputParameters(inputParameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(inputParameters)
    cdkBuilder.inputParameters(builder.map)
  }

  /**
   * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-inputparameters)
   * @param inputParameters A string, in JSON format, that is passed to the AWS Config rule Lambda
   * function. 
   */
  public fun inputParameters(inputParameters: Any) {
    cdkBuilder.inputParameters(inputParameters)
  }

  /**
   * The maximum frequency with which AWS Config runs evaluations for a rule.
   *
   * You can specify a value for `MaximumExecutionFrequency` when:
   *
   * * You are using an AWS managed rule that is triggered at a periodic frequency.
   * * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more
   * information, see
   * [ConfigSnapshotDeliveryProperties](https://docs.aws.amazon.com/config/latest/APIReference/API_ConfigSnapshotDeliveryProperties.html)
   * .
   *
   *
   * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
   * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-maximumexecutionfrequency)
   * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs evaluations
   * for a rule. 
   */
  public fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
    cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
  }

  /**
   * Defines which resources can trigger an evaluation for the rule.
   *
   * The scope can include one or more resource types, a combination of one resource type and one
   * resource ID, or a combination of a tag key and value. Specify a scope to constrain the resources
   * that can trigger an evaluation for the rule. If you do not specify a scope, evaluations are
   * triggered when any resource in the recording group changes.
   *
   *
   * The scope can be empty.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-scope)
   * @param scope Defines which resources can trigger an evaluation for the rule. 
   */
  public fun scope(scope: IResolvable) {
    cdkBuilder.scope(scope)
  }

  /**
   * Defines which resources can trigger an evaluation for the rule.
   *
   * The scope can include one or more resource types, a combination of one resource type and one
   * resource ID, or a combination of a tag key and value. Specify a scope to constrain the resources
   * that can trigger an evaluation for the rule. If you do not specify a scope, evaluations are
   * triggered when any resource in the recording group changes.
   *
   *
   * The scope can be empty.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-scope)
   * @param scope Defines which resources can trigger an evaluation for the rule. 
   */
  public fun scope(scope: CfnConfigRule.ScopeProperty) {
    cdkBuilder.scope(scope)
  }

  /**
   * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules, and
   * `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that cause
   * the function to evaluate your AWS resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-source)
   * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
   * Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
   * notifications that cause the function to evaluate your AWS resources. 
   */
  public fun source(source: IResolvable) {
    cdkBuilder.source(source)
  }

  /**
   * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules, and
   * `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that cause
   * the function to evaluate your AWS resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-source)
   * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
   * Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
   * notifications that cause the function to evaluate your AWS resources. 
   */
  public fun source(source: CfnConfigRule.SourceProperty) {
    cdkBuilder.source(source)
  }

  public fun build(): CfnConfigRule = cdkBuilder.build()
}
