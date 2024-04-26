@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

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
 * Creates a license endpoint to integrate your various licensed software used for rendering on
 * Deadline Cloud.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnLicenseEndpoint cfnLicenseEndpoint = CfnLicenseEndpoint.Builder.create(this,
 * "MyCfnLicenseEndpoint")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html)
 */
public open class CfnLicenseEndpoint(
  cdkObject: software.amazon.awscdk.services.deadline.CfnLicenseEndpoint,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLicenseEndpointProps,
  ) :
      this(software.amazon.awscdk.services.deadline.CfnLicenseEndpoint(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnLicenseEndpointProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLicenseEndpointProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLicenseEndpointProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the license endpoint.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The DNS name of the license server endpoint.
   */
  public open fun attrDnsName(): String = unwrap(this).getAttrDnsName()

  /**
   * The license endpoint ID.
   */
  public open fun attrLicenseEndpointId(): String = unwrap(this).getAttrLicenseEndpointId()

  /**
   * The status of the license endpoint.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The status message of the license endpoint.
   */
  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The identifier of the Amazon EC2 security group that controls access to the license endpoint.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

  /**
   * The identifier of the Amazon EC2 security group that controls access to the license endpoint.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The identifier of the Amazon EC2 security group that controls access to the license endpoint.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * Identifies the VPC subnets that can connect to a license endpoint.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

  /**
   * Identifies the VPC subnets that can connect to a license endpoint.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * Identifies the VPC subnets that can connect to a license endpoint.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * The VCP(virtual private cloud) ID associated with the license endpoint.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The VCP(virtual private cloud) ID associated with the license endpoint.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.deadline.CfnLicenseEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the Amazon EC2 security group that controls access to the license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-securitygroupids)
     * @param securityGroupIds The identifier of the Amazon EC2 security group that controls access
     * to the license endpoint. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The identifier of the Amazon EC2 security group that controls access to the license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-securitygroupids)
     * @param securityGroupIds The identifier of the Amazon EC2 security group that controls access
     * to the license endpoint. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * Identifies the VPC subnets that can connect to a license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-subnetids)
     * @param subnetIds Identifies the VPC subnets that can connect to a license endpoint. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * Identifies the VPC subnets that can connect to a license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-subnetids)
     * @param subnetIds Identifies the VPC subnets that can connect to a license endpoint. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * The VCP(virtual private cloud) ID associated with the license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-vpcid)
     * @param vpcId The VCP(virtual private cloud) ID associated with the license endpoint. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnLicenseEndpoint.Builder =
        software.amazon.awscdk.services.deadline.CfnLicenseEndpoint.Builder.create(scope, id)

    /**
     * The identifier of the Amazon EC2 security group that controls access to the license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-securitygroupids)
     * @param securityGroupIds The identifier of the Amazon EC2 security group that controls access
     * to the license endpoint. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The identifier of the Amazon EC2 security group that controls access to the license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-securitygroupids)
     * @param securityGroupIds The identifier of the Amazon EC2 security group that controls access
     * to the license endpoint. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * Identifies the VPC subnets that can connect to a license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-subnetids)
     * @param subnetIds Identifies the VPC subnets that can connect to a license endpoint. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * Identifies the VPC subnets that can connect to a license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-subnetids)
     * @param subnetIds Identifies the VPC subnets that can connect to a license endpoint. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * The VCP(virtual private cloud) ID associated with the license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-vpcid)
     * @param vpcId The VCP(virtual private cloud) ID associated with the license endpoint. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnLicenseEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.deadline.CfnLicenseEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLicenseEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLicenseEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnLicenseEndpoint):
        CfnLicenseEndpoint = CfnLicenseEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnLicenseEndpoint):
        software.amazon.awscdk.services.deadline.CfnLicenseEndpoint = wrapped.cdkObject as
        software.amazon.awscdk.services.deadline.CfnLicenseEndpoint
  }
}
