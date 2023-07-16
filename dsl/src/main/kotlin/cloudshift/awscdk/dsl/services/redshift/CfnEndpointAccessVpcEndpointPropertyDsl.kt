@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnEndpointAccess

@CdkDslMarker
public class CfnEndpointAccessVpcEndpointPropertyDsl {
  private val cdkBuilder: CfnEndpointAccess.VpcEndpointProperty.Builder =
      CfnEndpointAccess.VpcEndpointProperty.builder()

  private val _networkInterfaces: MutableList<Any> = mutableListOf()

  public fun networkInterfaces(vararg networkInterfaces: Any) {
    _networkInterfaces.addAll(listOf(*networkInterfaces))
  }

  public fun networkInterfaces(networkInterfaces: Collection<Any>) {
    _networkInterfaces.addAll(networkInterfaces)
  }

  public fun networkInterfaces(networkInterfaces: IResolvable) {
    cdkBuilder.networkInterfaces(networkInterfaces)
  }

  public fun vpcEndpointId(vpcEndpointId: String) {
    cdkBuilder.vpcEndpointId(vpcEndpointId)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnEndpointAccess.VpcEndpointProperty {
    if(_networkInterfaces.isNotEmpty()) cdkBuilder.networkInterfaces(_networkInterfaces)
    return cdkBuilder.build()
  }
}
