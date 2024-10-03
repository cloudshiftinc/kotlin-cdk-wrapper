@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Grant or revoke permissions for service consumers (users, IAM roles, and AWS accounts) to connect
 * to a VPC endpoint service.
 *
 * If you grant permissions to all principals, the service is public. Any users who know the name of
 * a public service can send a request to attach an endpoint. If the service does not require manual
 * approval, attachments are automatically approved.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPCEndpointServicePermissions cfnVPCEndpointServicePermissions =
 * CfnVPCEndpointServicePermissions.Builder.create(this, "MyCfnVPCEndpointServicePermissions")
 * .serviceId("serviceId")
 * // the properties below are optional
 * .allowedPrincipals(List.of("allowedPrincipals"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html)
 */
public open class CfnVPCEndpointServicePermissions(
  cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPCEndpointServicePermissionsProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVPCEndpointServicePermissionsProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPCEndpointServicePermissionsProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVPCEndpointServicePermissionsProps(props)
  )

  /**
   * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
   * AWS accounts ).
   */
  public open fun allowedPrincipals(): List<String> = unwrap(this).getAllowedPrincipals() ?:
      emptyList()

  /**
   * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
   * AWS accounts ).
   */
  public open fun allowedPrincipals(`value`: List<String>) {
    unwrap(this).setAllowedPrincipals(`value`)
  }

  /**
   * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
   * AWS accounts ).
   */
  public open fun allowedPrincipals(vararg `value`: String): Unit =
      allowedPrincipals(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ID of the service.
   */
  public open fun serviceId(): String = unwrap(this).getServiceId()

  /**
   * The ID of the service.
   */
  public open fun serviceId(`value`: String) {
    unwrap(this).setServiceId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPCEndpointServicePermissions].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
     * AWS accounts ).
     *
     * Permissions are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*). Permissions are revoked for principals not in this list. If
     * the list is empty, then all permissions are revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals)
     * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
     * example, users, IAM roles, and AWS accounts ). 
     */
    public fun allowedPrincipals(allowedPrincipals: List<String>)

    /**
     * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
     * AWS accounts ).
     *
     * Permissions are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*). Permissions are revoked for principals not in this list. If
     * the list is empty, then all permissions are revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals)
     * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
     * example, users, IAM roles, and AWS accounts ). 
     */
    public fun allowedPrincipals(vararg allowedPrincipals: String)

    /**
     * The ID of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-serviceid)
     * @param serviceId The ID of the service. 
     */
    public fun serviceId(serviceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions.Builder.create(scope,
        id)

    /**
     * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
     * AWS accounts ).
     *
     * Permissions are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*). Permissions are revoked for principals not in this list. If
     * the list is empty, then all permissions are revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals)
     * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
     * example, users, IAM roles, and AWS accounts ). 
     */
    override fun allowedPrincipals(allowedPrincipals: List<String>) {
      cdkBuilder.allowedPrincipals(allowedPrincipals)
    }

    /**
     * The Amazon Resource Names (ARN) of one or more principals (for example, users, IAM roles, and
     * AWS accounts ).
     *
     * Permissions are granted to the principals in this list. To grant permissions to all
     * principals, specify an asterisk (*). Permissions are revoked for principals not in this list. If
     * the list is empty, then all permissions are revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-allowedprincipals)
     * @param allowedPrincipals The Amazon Resource Names (ARN) of one or more principals (for
     * example, users, IAM roles, and AWS accounts ). 
     */
    override fun allowedPrincipals(vararg allowedPrincipals: String): Unit =
        allowedPrincipals(allowedPrincipals.toList())

    /**
     * The ID of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpointservicepermissions.html#cfn-ec2-vpcendpointservicepermissions-serviceid)
     * @param serviceId The ID of the service. 
     */
    override fun serviceId(serviceId: String) {
      cdkBuilder.serviceId(serviceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCEndpointServicePermissions {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCEndpointServicePermissions(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions):
        CfnVPCEndpointServicePermissions = CfnVPCEndpointServicePermissions(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpointServicePermissions):
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPCEndpointServicePermissions
  }
}
