@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes
import software.amazon.awscdk.services.ec2.ISecurityGroup

/**
 * Attributes when importing an existing client VPN endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * SecurityGroup securityGroup;
 * ClientVpnEndpointAttributes clientVpnEndpointAttributes = ClientVpnEndpointAttributes.builder()
 * .endpointId("endpointId")
 * .securityGroups(List.of(securityGroup))
 * .build();
 * ```
 */
@CdkDslMarker
public class ClientVpnEndpointAttributesDsl {
  private val cdkBuilder: ClientVpnEndpointAttributes.Builder =
      ClientVpnEndpointAttributes.builder()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * @param endpointId The endpoint ID. 
   */
  public fun endpointId(endpointId: String) {
    cdkBuilder.endpointId(endpointId)
  }

  /**
   * @param securityGroups The security groups associated with the endpoint. 
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups The security groups associated with the endpoint. 
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun build(): ClientVpnEndpointAttributes {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
