@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule

@CdkDslMarker
public class CfnOrganizationConfigRuleOrganizationManagedRuleMetadataPropertyDsl {
  private val cdkBuilder: CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty.Builder
      = CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty.builder()

  private val _resourceTypesScope: MutableList<String> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun inputParameters(inputParameters: String) {
    cdkBuilder.inputParameters(inputParameters)
  }

  public fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
    cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
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

  public fun ruleIdentifier(ruleIdentifier: String) {
    cdkBuilder.ruleIdentifier(ruleIdentifier)
  }

  public fun tagKeyScope(tagKeyScope: String) {
    cdkBuilder.tagKeyScope(tagKeyScope)
  }

  public fun tagValueScope(tagValueScope: String) {
    cdkBuilder.tagValueScope(tagValueScope)
  }

  public fun build(): CfnOrganizationConfigRule.OrganizationManagedRuleMetadataProperty {
    if(_resourceTypesScope.isNotEmpty()) cdkBuilder.resourceTypesScope(_resourceTypesScope)
    return cdkBuilder.build()
  }
}
