package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFlowVpcInterface internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The IDs of the network interfaces that MediaConnect created in your account.
   */
  public open fun attrNetworkInterfaceIds(): List<String> =
      unwrap(this).getAttrNetworkInterfaceIds()

  /**
   * The Amazon Resource Name (ARN) of the flow.
   */
  public open fun flowArn(): String = unwrap(this).getFlowArn()

  /**
   * The Amazon Resource Name (ARN) of the flow.
   */
  public open fun flowArn(`value`: String) {
    unwrap(this).setFlowArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the VPC Interface.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the VPC Interface.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the role that you created when you set up MediaConnect as a
   * trusted service.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the role that you created when you set up MediaConnect as a
   * trusted service.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The VPC security groups that you want MediaConnect to use for your VPC configuration.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

  /**
   * The VPC security groups that you want MediaConnect to use for your VPC configuration.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The VPC security groups that you want MediaConnect to use for your VPC configuration.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * The subnet IDs that you want to use for your VPC interface.
   */
  public open fun subnetId(): String = unwrap(this).getSubnetId()

  /**
   * The subnet IDs that you want to use for your VPC interface.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediaconnect.CfnFlowVpcInterface].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-flowarn)
     * @param flowArn The Amazon Resource Name (ARN) of the flow. 
     */
    public fun flowArn(flowArn: String)

    /**
     * The name of the VPC Interface.
     *
     * This value must be unique within the current flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-name)
     * @param name The name of the VPC Interface. 
     */
    public fun name(name: String)

    /**
     * The Amazon Resource Name (ARN) of the role that you created when you set up MediaConnect as a
     * trusted service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the role that you created when you set up
     * MediaConnect as a trusted service. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The VPC security groups that you want MediaConnect to use for your VPC configuration.
     *
     * You must include at least one security group in the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-securitygroupids)
     * @param securityGroupIds The VPC security groups that you want MediaConnect to use for your
     * VPC configuration. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The VPC security groups that you want MediaConnect to use for your VPC configuration.
     *
     * You must include at least one security group in the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-securitygroupids)
     * @param securityGroupIds The VPC security groups that you want MediaConnect to use for your
     * VPC configuration. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

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
     * @param subnetId The subnet IDs that you want to use for your VPC interface. 
     */
    public fun subnetId(subnetId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface.Builder
        = software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-flowarn)
     * @param flowArn The Amazon Resource Name (ARN) of the flow. 
     */
    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    /**
     * The name of the VPC Interface.
     *
     * This value must be unique within the current flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-name)
     * @param name The name of the VPC Interface. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of the role that you created when you set up MediaConnect as a
     * trusted service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the role that you created when you set up
     * MediaConnect as a trusted service. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The VPC security groups that you want MediaConnect to use for your VPC configuration.
     *
     * You must include at least one security group in the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-securitygroupids)
     * @param securityGroupIds The VPC security groups that you want MediaConnect to use for your
     * VPC configuration. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The VPC security groups that you want MediaConnect to use for your VPC configuration.
     *
     * You must include at least one security group in the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flowvpcinterface.html#cfn-mediaconnect-flowvpcinterface-securitygroupids)
     * @param securityGroupIds The VPC security groups that you want MediaConnect to use for your
     * VPC configuration. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

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
     * @param subnetId The subnet IDs that you want to use for your VPC interface. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlowVpcInterface {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlowVpcInterface(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface):
        CfnFlowVpcInterface = CfnFlowVpcInterface(cdkObject)

    internal fun unwrap(wrapped: CfnFlowVpcInterface):
        software.amazon.awscdk.services.mediaconnect.CfnFlowVpcInterface = wrapped.cdkObject
  }
}
