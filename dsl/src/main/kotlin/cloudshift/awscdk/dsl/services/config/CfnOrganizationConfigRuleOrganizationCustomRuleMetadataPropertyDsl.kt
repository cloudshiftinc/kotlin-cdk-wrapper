@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule

@CdkDslMarker
public class CfnOrganizationConfigRuleOrganizationCustomRuleMetadataPropertyDsl {
  private val cdkBuilder: CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty.Builder =
      CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty.builder()

  private val _organizationConfigRuleTriggerTypes: MutableList<String> = mutableListOf()

  private val _resourceTypesScope: MutableList<String> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun inputParameters(inputParameters: String) {
    cdkBuilder.inputParameters(inputParameters)
  }

  public fun lambdaFunctionArn(lambdaFunctionArn: String) {
    cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
  }

  public fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
    cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
  }

  public fun organizationConfigRuleTriggerTypes(vararg organizationConfigRuleTriggerTypes: String) {
    _organizationConfigRuleTriggerTypes.addAll(listOf(*organizationConfigRuleTriggerTypes))
  }

  public
      fun organizationConfigRuleTriggerTypes(organizationConfigRuleTriggerTypes: Collection<String>) {
    _organizationConfigRuleTriggerTypes.addAll(organizationConfigRuleTriggerTypes)
  }

  public fun resourceIdScope(resourceIdScope: String) {
    cdkBuilder.resourceIdScope(resourceIdScope)
  }

  public fun resourceTypesScope(vararg resourceTypesScope: String) {
    _resourceTypesScope.addAll(listOf(*resourceTypesScope))
  }

  public fun resourceTypesScope(resourceTypesScope: Collection<String>) {
    _resourceTypesScope.addAll(resourceTypesScope)
  }

  public fun tagKeyScope(tagKeyScope: String) {
    cdkBuilder.tagKeyScope(tagKeyScope)
  }

  public fun tagValueScope(tagValueScope: String) {
    cdkBuilder.tagValueScope(tagValueScope)
  }

  public fun build(): CfnOrganizationConfigRule.OrganizationCustomRuleMetadataProperty {
    if(_organizationConfigRuleTriggerTypes.isNotEmpty())
        cdkBuilder.organizationConfigRuleTriggerTypes(_organizationConfigRuleTriggerTypes)
    if(_resourceTypesScope.isNotEmpty()) cdkBuilder.resourceTypesScope(_resourceTypesScope)
    return cdkBuilder.build()
  }
}
