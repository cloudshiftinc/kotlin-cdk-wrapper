@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigateway.CfnRestApi

@CdkDslMarker
public class CfnRestApiEndpointConfigurationPropertyDsl {
  private val cdkBuilder: CfnRestApi.EndpointConfigurationProperty.Builder =
      CfnRestApi.EndpointConfigurationProperty.builder()

  private val _types: MutableList<String> = mutableListOf()

  private val _vpcEndpointIds: MutableList<String> = mutableListOf()

  public fun types(vararg types: String) {
    _types.addAll(listOf(*types))
  }

  public fun types(types: Collection<String>) {
    _types.addAll(types)
  }

  public fun vpcEndpointIds(vararg vpcEndpointIds: String) {
    _vpcEndpointIds.addAll(listOf(*vpcEndpointIds))
  }

  public fun vpcEndpointIds(vpcEndpointIds: Collection<String>) {
    _vpcEndpointIds.addAll(vpcEndpointIds)
  }

  public fun build(): CfnRestApi.EndpointConfigurationProperty {
    if(_types.isNotEmpty()) cdkBuilder.types(_types)
    if(_vpcEndpointIds.isNotEmpty()) cdkBuilder.vpcEndpointIds(_vpcEndpointIds)
    return cdkBuilder.build()
  }
}
