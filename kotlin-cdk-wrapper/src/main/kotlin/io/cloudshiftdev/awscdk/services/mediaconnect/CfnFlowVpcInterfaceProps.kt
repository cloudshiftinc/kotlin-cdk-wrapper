@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnFlowVpcInterface`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediaconnect.*;
 * CfnFlowVpcInterfaceProps cfnFlowVpcInterfaceProps = CfnFlowVpcInterfaceProps.builder()
 * .flowArn("flowArn")
 * .name("name")
 * .roleArn("roleArn")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html)
 */
public interface CfnFlowVpcInterfaceProps {
  /**
   * The Amazon Resource Name (ARN) of the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-flowarn)
   */
  public fun flowArn(): String

  /**
   * The name of the VPC Interface.
   *
   * This value must be unique within the current flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-name)
   */
  public fun name(): String

  /**
   * The Amazon Resource Name (ARN) of the role that you created when you set up MediaConnect as a
   * trusted service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-rolearn)
   */
  public fun roleArn(): String

  /**
   * The VPC security groups that you want MediaConnect to use for your VPC configuration.
   *
   * You must include at least one security group in the request.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-securitygroupids)
   */
  public fun securityGroupIds(): List<String>

  /**
   * The subnet IDs that you want to use for your VPC interface.
   *
   * A range of IP addresses in your VPC. When you create your VPC, you specify a range of IPv4
   * addresses for the VPC in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
   * 10.0.0.0/16. This is the primary CIDR block for your VPC. When you create a subnet for your VPC,
   * you specify the CIDR block for the subnet, which is a subset of the VPC CIDR block.
   *
   * The subnets that you use across all VPC interfaces on the flow must be in the same Availability
   * Zone as the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-subnetid)
   */
  public fun subnetId(): String

  /**
   * A builder for [CfnFlowVpcInterfaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param flowArn The Amazon Resource Name (ARN) of the flow. 
     */
    public fun flowArn(flowArn: String)

    /**
     * @param name The name of the VPC Interface. 
     * This value must be unique within the current flow.
     */
    public fun name(name: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the role that you created when you set up
     * MediaConnect as a trusted service. 
     */
    public fun roleArn(roleArn: String)

    /**
     * @param securityGroupIds The VPC security groups that you want MediaConnect to use for your
     * VPC configuration. 
     * You must include at least one security group in the request.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The VPC security groups that you want MediaConnect to use for your
     * VPC configuration. 
     * You must include at least one security group in the request.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param subnetId The subnet IDs that you want to use for your VPC interface. 
     * A range of IP addresses in your VPC. When you create your VPC, you specify a range of IPv4
     * addresses for the VPC in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16. This is the primary CIDR block for your VPC. When you create a subnet for your VPC,
     * you specify the CIDR block for the subnet, which is a subset of the VPC CIDR block.
     *
     * The subnets that you use across all VPC interfaces on the flow must be in the same
     * Availability Zone as the flow.
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps.builder()

    /**
     * @param flowArn The Amazon Resource Name (ARN) of the flow. 
     */
    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    /**
     * @param name The name of the VPC Interface. 
     * This value must be unique within the current flow.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the role that you created when you set up
     * MediaConnect as a trusted service. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param securityGroupIds The VPC security groups that you want MediaConnect to use for your
     * VPC configuration. 
     * You must include at least one security group in the request.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The VPC security groups that you want MediaConnect to use for your
     * VPC configuration. 
     * You must include at least one security group in the request.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param subnetId The subnet IDs that you want to use for your VPC interface. 
     * A range of IP addresses in your VPC. When you create your VPC, you specify a range of IPv4
     * addresses for the VPC in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16. This is the primary CIDR block for your VPC. When you create a subnet for your VPC,
     * you specify the CIDR block for the subnet, which is a subset of the VPC CIDR block.
     *
     * The subnets that you use across all VPC interfaces on the flow must be in the same
     * Availability Zone as the flow.
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps,
  ) : CdkObject(cdkObject),
      CfnFlowVpcInterfaceProps {
    /**
     * The Amazon Resource Name (ARN) of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-flowarn)
     */
    override fun flowArn(): String = unwrap(this).getFlowArn()

    /**
     * The name of the VPC Interface.
     *
     * This value must be unique within the current flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) of the role that you created when you set up MediaConnect as a
     * trusted service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The VPC security groups that you want MediaConnect to use for your VPC configuration.
     *
     * You must include at least one security group in the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

    /**
     * The subnet IDs that you want to use for your VPC interface.
     *
     * A range of IP addresses in your VPC. When you create your VPC, you specify a range of IPv4
     * addresses for the VPC in the form of a Classless Inter-Domain Routing (CIDR) block; for example,
     * 10.0.0.0/16. This is the primary CIDR block for your VPC. When you create a subnet for your VPC,
     * you specify the CIDR block for the subnet, which is a subset of the VPC CIDR block.
     *
     * The subnets that you use across all VPC interfaces on the flow must be in the same
     * Availability Zone as the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-subnetid)
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowVpcInterfaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps):
        CfnFlowVpcInterfaceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFlowVpcInterfaceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowVpcInterfaceProps):
        software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterfaceProps
  }
}
