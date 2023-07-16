@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.config.CfnConfigRule

@CdkDslMarker
public class CfnConfigRuleScopePropertyDsl {
  private val cdkBuilder: CfnConfigRule.ScopeProperty.Builder =
      CfnConfigRule.ScopeProperty.builder()

  private val _complianceResourceTypes: MutableList<String> = mutableListOf()

  public fun complianceResourceId(complianceResourceId: String) {
    cdkBuilder.complianceResourceId(complianceResourceId)
  }

  public fun complianceResourceTypes(vararg complianceResourceTypes: String) {
    _complianceResourceTypes.addAll(listOf(*complianceResourceTypes))
  }

  public fun complianceResourceTypes(complianceResourceTypes: Collection<String>) {
    _complianceResourceTypes.addAll(complianceResourceTypes)
  }

  public fun tagKey(tagKey: String) {
    cdkBuilder.tagKey(tagKey)
  }

  public fun tagValue(tagValue: String) {
    cdkBuilder.tagValue(tagValue)
  }

  public fun build(): CfnConfigRule.ScopeProperty {
    if(_complianceResourceTypes.isNotEmpty())
        cdkBuilder.complianceResourceTypes(_complianceResourceTypes)
    return cdkBuilder.build()
  }
}
