@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule

/**
 * organization managed rule metadata such as resource type and ID of AWS resource along with the
 * rule identifier.
 *
 * It also provides the frequency with which you want AWS Config to run evaluations for the rule if
 * the trigger type is periodic.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * OrganizationManagedRuleMetadataProperty organizationManagedRuleMetadataProperty =
 * OrganizationManagedRuleMetadataProperty.builder()
 * .ruleIdentifier("ruleIdentifier")
 * // the properties below are optional
 * .description("description")
 * .inputParameters("inputParameters")
 * .maximumExecutionFrequency("maximumExecutionFrequency")
 * .resourceIdScope("resourceIdScope")
 * .resourceTypesScope(List.of("resourceTypesScope"))
 * .tagKeyScope("tagKeyScope")
 * .tagValueScope("tagValueScope")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationmanagedrulemetadata.html)
 */
@CdkDslMarker
public class CfnOrganizationConfigRuleOrganizationManagedRuleMetadataPropertyDsl {
  private val cdkBuilder: CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty.Builder
      = CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty.builder()

  private val _resourceTypesScope: MutableList<String> = mutableListOf()

  /**
   * @param description The description that you provide for your organization AWS Config rule.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param inputParameters A string, in JSON format, that is passed to your organization AWS Config
   * rule Lambda function.
   */
  public fun inputParameters(inputParameters: String) {
    cdkBuilder.inputParameters(inputParameters)
  }

  /**
   * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs evaluations
   * for a rule.
   * This is for an AWS Config managed rule that is triggered at a periodic frequency.
   *
   *
   * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
   * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
   */
  public fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
    cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
  }

  /**
   * @param resourceIdScope The ID of the AWS resource that was evaluated.
   */
  public fun resourceIdScope(resourceIdScope: String) {
    cdkBuilder.resourceIdScope(resourceIdScope)
  }

  /**
   * @param resourceTypesScope The type of the AWS resource that was evaluated.
   */
  public fun resourceTypesScope(vararg resourceTypesScope: String) {
    _resourceTypesScope.addAll(listOf(*resourceTypesScope))
  }

  /**
   * @param resourceTypesScope The type of the AWS resource that was evaluated.
   */
  public fun resourceTypesScope(resourceTypesScope: Collection<String>) {
    _resourceTypesScope.addAll(resourceTypesScope)
  }

  /**
   * @param ruleIdentifier For organization config managed rules, a predefined identifier from a
   * list. 
   * For example, `IAM_PASSWORD_POLICY` is a managed rule. To reference a managed rule, see [Using
   * AWS Config managed
   * rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html)
   * .
   */
  public fun ruleIdentifier(ruleIdentifier: String) {
    cdkBuilder.ruleIdentifier(ruleIdentifier)
  }

  /**
   * @param tagKeyScope One part of a key-value pair that make up a tag.
   * A key is a general label that acts like a category for more specific tag values.
   */
  public fun tagKeyScope(tagKeyScope: String) {
    cdkBuilder.tagKeyScope(tagKeyScope)
  }

  /**
   * @param tagValueScope The optional part of a key-value pair that make up a tag.
   * A value acts as a descriptor within a tag category (key).
   */
  public fun tagValueScope(tagValueScope: String) {
    cdkBuilder.tagValueScope(tagValueScope)
  }

  public fun build(): CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty {
    if(_resourceTypesScope.isNotEmpty()) cdkBuilder.resourceTypesScope(_resourceTypesScope)
    return cdkBuilder.build()
  }
}
