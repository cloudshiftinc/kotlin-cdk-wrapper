@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sam.CfnApi

@CdkDslMarker
public class CfnApiEndpointConfigurationPropertyDsl {
  private val cdkBuilder: CfnApi.EndpointConfigurationProperty.Builder =
      CfnApi.EndpointConfigurationProperty.builder()

  private val _vpcEndpointIds: MutableList<String> = mutableListOf()

  /**
   * @param type the value to be set.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param vpcEndpointIds the value to be set.
   */
  public fun vpcEndpointIds(vararg vpcEndpointIds: String) {
    _vpcEndpointIds.addAll(listOf(*vpcEndpointIds))
  }

  /**
   * @param vpcEndpointIds the value to be set.
   */
  public fun vpcEndpointIds(vpcEndpointIds: Collection<String>) {
    _vpcEndpointIds.addAll(vpcEndpointIds)
  }

  public fun build(): CfnApi.EndpointConfigurationProperty {
    if(_vpcEndpointIds.isNotEmpty()) cdkBuilder.vpcEndpointIds(_vpcEndpointIds)
    return cdkBuilder.build()
  }
}
