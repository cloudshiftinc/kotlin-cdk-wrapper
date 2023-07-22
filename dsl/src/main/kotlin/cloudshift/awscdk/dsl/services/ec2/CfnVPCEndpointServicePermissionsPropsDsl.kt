@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps

@CdkDslMarker
public class CfnVPCEndpointServicePermissionsPropsDsl {
  private val cdkBuilder: CfnVPCEndpointServicePermissionsProps.Builder =
      CfnVPCEndpointServicePermissionsProps.builder()

  private val _allowedPrincipals: MutableList<String> = mutableListOf()

  /**
   * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
   * example, users, IAM roles, and AWS accounts ).
   * Permissions are granted to the principals in this list. To grant permissions to all principals,
   * specify an asterisk (*). Permissions are revoked for principals not in this list. If the list is
   * empty, then all permissions are revoked.
   */
  public fun allowedPrincipals(vararg allowedPrincipals: String) {
    _allowedPrincipals.addAll(listOf(*allowedPrincipals))
  }

  /**
   * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
   * example, users, IAM roles, and AWS accounts ).
   * Permissions are granted to the principals in this list. To grant permissions to all principals,
   * specify an asterisk (*). Permissions are revoked for principals not in this list. If the list is
   * empty, then all permissions are revoked.
   */
  public fun allowedPrincipals(allowedPrincipals: Collection<String>) {
    _allowedPrincipals.addAll(allowedPrincipals)
  }

  /**
   * @param serviceId The ID of the service. 
   */
  public fun serviceId(serviceId: String) {
    cdkBuilder.serviceId(serviceId)
  }

  public fun build(): CfnVPCEndpointServicePermissionsProps {
    if(_allowedPrincipals.isNotEmpty()) cdkBuilder.allowedPrincipals(_allowedPrincipals)
    return cdkBuilder.build()
  }
}
