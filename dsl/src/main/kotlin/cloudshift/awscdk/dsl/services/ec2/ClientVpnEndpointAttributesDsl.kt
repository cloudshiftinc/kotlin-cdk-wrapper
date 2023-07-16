@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes
import software.amazon.awscdk.services.ec2.ISecurityGroup

@CdkDslMarker
public class ClientVpnEndpointAttributesDsl {
  private val cdkBuilder: ClientVpnEndpointAttributes.Builder =
      ClientVpnEndpointAttributes.builder()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  public fun endpointId(endpointId: String) {
    cdkBuilder.endpointId(endpointId)
  }

  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun build(): ClientVpnEndpointAttributes {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
