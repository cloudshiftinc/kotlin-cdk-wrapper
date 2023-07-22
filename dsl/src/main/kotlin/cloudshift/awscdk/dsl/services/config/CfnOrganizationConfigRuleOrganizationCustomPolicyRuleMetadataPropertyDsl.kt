@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * OrganizationCustomPolicyRuleMetadataProperty organizationCustomPolicyRuleMetadataProperty =
 * OrganizationCustomPolicyRuleMetadataProperty.builder()
 * .policyText("policyText")
 * .runtime("runtime")
 * // the properties below are optional
 * .debugLogDeliveryAccounts(List.of("debugLogDeliveryAccounts"))
 * .description("description")
 * .inputParameters("inputParameters")
 * .maximumExecutionFrequency("maximumExecutionFrequency")
 * .organizationConfigRuleTriggerTypes(List.of("organizationConfigRuleTriggerTypes"))
 * .resourceIdScope("resourceIdScope")
 * .resourceTypesScope(List.of("resourceTypesScope"))
 * .tagKeyScope("tagKeyScope")
 * .tagValueScope("tagValueScope")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-organizationconfigrule-organizationcustompolicyrulemetadata.html)
 */
@CdkDslMarker
public class CfnOrganizationConfigRuleOrganizationCustomPolicyRuleMetadataPropertyDsl {
  private val cdkBuilder:
      CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty.Builder =
      CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty.builder()

  private val _debugLogDeliveryAccounts: MutableList<String> = mutableListOf()

  private val _organizationConfigRuleTriggerTypes: MutableList<String> = mutableListOf()

  private val _resourceTypesScope: MutableList<String> = mutableListOf()

  /**
   * @param debugLogDeliveryAccounts the value to be set.
   */
  public fun debugLogDeliveryAccounts(vararg debugLogDeliveryAccounts: String) {
    _debugLogDeliveryAccounts.addAll(listOf(*debugLogDeliveryAccounts))
  }

  /**
   * @param debugLogDeliveryAccounts the value to be set.
   */
  public fun debugLogDeliveryAccounts(debugLogDeliveryAccounts: Collection<String>) {
    _debugLogDeliveryAccounts.addAll(debugLogDeliveryAccounts)
  }

  /**
   * @param description the value to be set.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param inputParameters the value to be set.
   */
  public fun inputParameters(inputParameters: String) {
    cdkBuilder.inputParameters(inputParameters)
  }

  /**
   * @param maximumExecutionFrequency the value to be set.
   */
  public fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
    cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
  }

  /**
   * @param organizationConfigRuleTriggerTypes the value to be set.
   */
  public fun organizationConfigRuleTriggerTypes(vararg organizationConfigRuleTriggerTypes: String) {
    _organizationConfigRuleTriggerTypes.addAll(listOf(*organizationConfigRuleTriggerTypes))
  }

  /**
   * @param organizationConfigRuleTriggerTypes the value to be set.
   */
  public
      fun organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes: Collection<String>) {
    _organizationConfigRuleTriggerTypes.addAll(organizationConfigRuleTriggerTypes)
  }

  /**
   * @param policyText the value to be set. 
   */
  public fun policyText(policyText: String) {
    cdkBuilder.policyText(policyText)
  }

  /**
   * @param resourceIdScope the value to be set.
   */
  public fun resourceIdScope(resourceIdScope: String) {
    cdkBuilder.resourceIdScope(resourceIdScope)
  }

  /**
   * @param resourceTypesScope the value to be set.
   */
  public fun resourceTypesScope(vararg resourceTypesScope: String) {
    _resourceTypesScope.addAll(listOf(*resourceTypesScope))
  }

  /**
   * @param resourceTypesScope the value to be set.
   */
  public fun resourceTypesScope(resourceTypesScope: Collection<String>) {
    _resourceTypesScope.addAll(resourceTypesScope)
  }

  /**
   * @param runtime the value to be set. 
   */
  public fun runtime(runtime: String) {
    cdkBuilder.runtime(runtime)
  }

  /**
   * @param tagKeyScope the value to be set.
   */
  public fun tagKeyScope(tagKeyScope: String) {
    cdkBuilder.tagKeyScope(tagKeyScope)
  }

  /**
   * @param tagValueScope the value to be set.
   */
  public fun tagValueScope(tagValueScope: String) {
    cdkBuilder.tagValueScope(tagValueScope)
  }

  public fun build(): CfnOrganizationConfigRule.OrganizationCustomPolicyRuleMetadataProperty {
    if(_debugLogDeliveryAccounts.isNotEmpty())
        cdkBuilder.debugLogDeliveryAccounts(_debugLogDeliveryAccounts)
    if(_organizationConfigRuleTriggerTypes.isNotEmpty())
        cdkBuilder.organizationConfigRuleTriggerTypes(_organizationConfigRuleTriggerTypes)
    if(_resourceTypesScope.isNotEmpty()) cdkBuilder.resourceTypesScope(_resourceTypesScope)
    return cdkBuilder.build()
  }
}
