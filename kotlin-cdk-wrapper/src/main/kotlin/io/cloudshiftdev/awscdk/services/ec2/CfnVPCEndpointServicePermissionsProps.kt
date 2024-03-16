@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnVPCEndpointServicePermissions`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPCEndpointServicePermissionsProps cfnVPCEndpointServicePermissionsProps =
 * CfnVPCEndpointServicePermissionsProps.builder()
 * .serviceId("serviceId")
 * // the properties below are optional
 * .allowedPrincipals(List.of("allowedPrincipals"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html)
 */
public interface CfnVPCEndpointServicePermissionsProps {
  /**
   * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
   * AWS accounts ).
   *
   * Permissions are granted to the principals in this list. To grant permissions to all principals,
   * specify an asterisk (*). Permissions are revoked for principals not in this list. If the list is
   * empty, then all permissions are revoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals)
   */
  public fun allowedPrincipals(): List<String> = unwrap(this).getAllowedPrincipals() ?: emptyList()

  /**
   * The ID of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-serviceid)
   */
  public fun serviceId(): String

  /**
   * A builder for [CfnVPCEndpointServicePermissionsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
     * example, users, IAM roles, and AWS accounts ).
     * Permissions are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*). Permissions are revoked for principals not in this list. If
     * the list is empty, then all permissions are revoked.
     */
    public fun allowedPrincipals(allowedPrincipals: List<String>)

    /**
     * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
     * example, users, IAM roles, and AWS accounts ).
     * Permissions are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*). Permissions are revoked for principals not in this list. If
     * the list is empty, then all permissions are revoked.
     */
    public fun allowedPrincipals(vararg allowedPrincipals: String)

    /**
     * @param serviceId The ID of the service. 
     */
    public fun serviceId(serviceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps.builder()

    /**
     * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
     * example, users, IAM roles, and AWS accounts ).
     * Permissions are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*). Permissions are revoked for principals not in this list. If
     * the list is empty, then all permissions are revoked.
     */
    override fun allowedPrincipals(allowedPrincipals: List<String>) {
      cdkBuilder.allowedPrincipals(allowedPrincipals)
    }

    /**
     * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
     * example, users, IAM roles, and AWS accounts ).
     * Permissions are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*). Permissions are revoked for principals not in this list. If
     * the list is empty, then all permissions are revoked.
     */
    override fun allowedPrincipals(vararg allowedPrincipals: String): Unit =
        allowedPrincipals(allowedPrincipals.toList())

    /**
     * @param serviceId The ID of the service. 
     */
    override fun serviceId(serviceId: String) {
      cdkBuilder.serviceId(serviceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps,
  ) : CdkObject(cdkObject), CfnVPCEndpointServicePermissionsProps {
    /**
     * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
     * AWS accounts ).
     *
     * Permissions are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*). Permissions are revoked for principals not in this list. If
     * the list is empty, then all permissions are revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals)
     */
    override fun allowedPrincipals(): List<String> = unwrap(this).getAllowedPrincipals() ?:
        emptyList()

    /**
     * The ID of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-serviceid)
     */
    override fun serviceId(): String = unwrap(this).getServiceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnVPCEndpointServicePermissionsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps):
        CfnVPCEndpointServicePermissionsProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnVPCEndpointServicePermissionsProps

    internal fun unwrap(wrapped: CfnVPCEndpointServicePermissionsProps):
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissionsProps
  }
}
