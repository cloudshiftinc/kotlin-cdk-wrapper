@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions
import software.constructs.Construct

@CdkDslMarker
public class CfnVPCEndpointServicePermissionsDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVPCEndpointServicePermissions.Builder =
      CfnVPCEndpointServicePermissions.Builder.create(scope, id)

  private val _allowedPrincipals: MutableList<String> = mutableListOf()

  /**
   * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
   * AWS accounts ).
   *
   * Permissions are granted to the principals in this list. To grant permissions to all principals,
   * specify an asterisk (*). Permissions are revoked for principals not in this list. If the list is
   * empty, then all permissions are revoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals)
   * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
   * example, users, IAM roles, and AWS accounts ). 
   */
  public fun allowedPrincipals(vararg allowedPrincipals: String) {
    _allowedPrincipals.addAll(listOf(*allowedPrincipals))
  }

  /**
   * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
   * AWS accounts ).
   *
   * Permissions are granted to the principals in this list. To grant permissions to all principals,
   * specify an asterisk (*). Permissions are revoked for principals not in this list. If the list is
   * empty, then all permissions are revoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals)
   * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
   * example, users, IAM roles, and AWS accounts ). 
   */
  public fun allowedPrincipals(allowedPrincipals: Collection<String>) {
    _allowedPrincipals.addAll(allowedPrincipals)
  }

  /**
   * The ID of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-serviceid)
   * @param serviceId The ID of the service. 
   */
  public fun serviceId(serviceId: String) {
    cdkBuilder.serviceId(serviceId)
  }

  public fun build(): CfnVPCEndpointServicePermissions {
    if(_allowedPrincipals.isNotEmpty()) cdkBuilder.allowedPrincipals(_allowedPrincipals)
    return cdkBuilder.build()
  }
}
