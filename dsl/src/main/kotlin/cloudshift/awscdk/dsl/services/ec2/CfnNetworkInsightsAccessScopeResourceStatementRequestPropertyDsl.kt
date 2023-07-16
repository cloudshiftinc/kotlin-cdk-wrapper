@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScope

@CdkDslMarker
public class CfnNetworkInsightsAccessScopeResourceStatementRequestPropertyDsl {
  private val cdkBuilder: CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty.Builder =
      CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty.builder()

  private val _resourceTypes: MutableList<String> = mutableListOf()

  private val _resources: MutableList<String> = mutableListOf()

  public fun resourceTypes(vararg resourceTypes: String) {
    _resourceTypes.addAll(listOf(*resourceTypes))
  }

  public fun resourceTypes(resourceTypes: Collection<String>) {
    _resourceTypes.addAll(resourceTypes)
  }

  public fun resources(vararg resources: String) {
    _resources.addAll(listOf(*resources))
  }

  public fun resources(resources: Collection<String>) {
    _resources.addAll(resources)
  }

  public fun build(): CfnNetworkInsightsAccessScope.ResourceStatementRequestProperty {
    if(_resourceTypes.isNotEmpty()) cdkBuilder.resourceTypes(_resourceTypes)
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    return cdkBuilder.build()
  }
}
