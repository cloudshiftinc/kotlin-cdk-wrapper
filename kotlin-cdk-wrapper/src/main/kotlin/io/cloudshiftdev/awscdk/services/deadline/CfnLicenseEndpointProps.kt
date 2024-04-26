@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnLicenseEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnLicenseEndpointProps cfnLicenseEndpointProps = CfnLicenseEndpointProps.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html)
 */
public interface CfnLicenseEndpointProps {
  /**
   * The identifier of the Amazon EC2 security group that controls access to the license endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-securitygroupids)
   */
  public fun securityGroupIds(): List<String>

  /**
   * Identifies the VPC subnets that can connect to a license endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-subnetids)
   */
  public fun subnetIds(): List<String>

  /**
   * The VCP(virtual private cloud) ID associated with the license endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnLicenseEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param securityGroupIds The identifier of the Amazon EC2 security group that controls access
     * to the license endpoint. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The identifier of the Amazon EC2 security group that controls access
     * to the license endpoint. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param subnetIds Identifies the VPC subnets that can connect to a license endpoint. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds Identifies the VPC subnets that can connect to a license endpoint. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param vpcId The VCP(virtual private cloud) ID associated with the license endpoint. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnLicenseEndpointProps.Builder
        = software.amazon.awscdk.services.deadline.CfnLicenseEndpointProps.builder()

    /**
     * @param securityGroupIds The identifier of the Amazon EC2 security group that controls access
     * to the license endpoint. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The identifier of the Amazon EC2 security group that controls access
     * to the license endpoint. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param subnetIds Identifies the VPC subnets that can connect to a license endpoint. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds Identifies the VPC subnets that can connect to a license endpoint. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param vpcId The VCP(virtual private cloud) ID associated with the license endpoint. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnLicenseEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.deadline.CfnLicenseEndpointProps,
  ) : CdkObject(cdkObject), CfnLicenseEndpointProps {
    /**
     * The identifier of the Amazon EC2 security group that controls access to the license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

    /**
     * Identifies the VPC subnets that can connect to a license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    /**
     * The VCP(virtual private cloud) ID associated with the license endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-licenseendpoint.html#cfn-deadline-licenseendpoint-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLicenseEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnLicenseEndpointProps):
        CfnLicenseEndpointProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLicenseEndpointProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLicenseEndpointProps):
        software.amazon.awscdk.services.deadline.CfnLicenseEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.deadline.CfnLicenseEndpointProps
  }
}
