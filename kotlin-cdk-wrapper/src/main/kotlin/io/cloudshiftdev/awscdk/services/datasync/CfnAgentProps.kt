@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnAgent`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnAgentProps cfnAgentProps = CfnAgentProps.builder()
 * .activationKey("activationKey")
 * .agentName("agentName")
 * .securityGroupArns(List.of("securityGroupArns"))
 * .subnetArns(List.of("subnetArns"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcEndpointId("vpcEndpointId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html)
 */
public interface CfnAgentProps {
  /**
   * Specifies your DataSync agent's activation key.
   *
   * If you don't have an activation key, see [Activate your
   * agent](https://docs.aws.amazon.com/datasync/latest/userguide/activate-agent.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-activationkey)
   */
  public fun activationKey(): String? = unwrap(this).getActivationKey()

  /**
   * Specifies a name for your agent.
   *
   * You can see this name in the DataSync console.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-agentname)
   */
  public fun agentName(): String? = unwrap(this).getAgentName()

  /**
   * The Amazon Resource Names (ARNs) of the security groups used to protect your data transfer task
   * subnets.
   *
   * See
   * [SecurityGroupArns](https://docs.aws.amazon.com/datasync/latest/userguide/API_Ec2Config.html#DataSync-Type-Ec2Config-SecurityGroupArns)
   * .
   *
   * *Pattern* :
   * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-securitygrouparns)
   */
  public fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns() ?: emptyList()

  /**
   * Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC
   * endpoint.
   *
   * This is the subnet where DataSync creates and manages the [network
   * interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
   * for your transfer. You can only specify one ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-subnetarns)
   */
  public fun subnetArns(): List<String> = unwrap(this).getSubnetArns() ?: emptyList()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   *
   * We recommend creating at least one tag for your agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the virtual private cloud (VPC) endpoint that the agent has access to.
   *
   * This is the client-side VPC endpoint, powered by AWS PrivateLink . If you don't have an AWS
   * PrivateLink VPC endpoint, see [AWS PrivateLink and VPC
   * endpoints](https://docs.aws.amazon.com//vpc/latest/userguide/endpoint-services-overview.html) in
   * the *Amazon VPC User Guide* .
   *
   * For more information about activating your agent in a private network based on a VPC, see
   * [Using AWS DataSync in a Virtual Private
   * Cloud](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-in-vpc.html) in the *AWS
   * DataSync User Guide.*
   *
   * A VPC endpoint ID looks like this: `vpce-01234d5aff67890e1` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-vpcendpointid)
   */
  public fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

  /**
   * A builder for [CfnAgentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param activationKey Specifies your DataSync agent's activation key.
     * If you don't have an activation key, see [Activate your
     * agent](https://docs.aws.amazon.com/datasync/latest/userguide/activate-agent.html) .
     */
    public fun activationKey(activationKey: String)

    /**
     * @param agentName Specifies a name for your agent.
     * You can see this name in the DataSync console.
     */
    public fun agentName(agentName: String)

    /**
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups used to
     * protect your data transfer task subnets.
     * See
     * [SecurityGroupArns](https://docs.aws.amazon.com/datasync/latest/userguide/API_Ec2Config.html#DataSync-Type-Ec2Config-SecurityGroupArns)
     * .
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     */
    public fun securityGroupArns(securityGroupArns: List<String>)

    /**
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups used to
     * protect your data transfer task subnets.
     * See
     * [SecurityGroupArns](https://docs.aws.amazon.com/datasync/latest/userguide/API_Ec2Config.html#DataSync-Type-Ec2Config-SecurityGroupArns)
     * .
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     */
    public fun securityGroupArns(vararg securityGroupArns: String)

    /**
     * @param subnetArns Specifies the ARN of the subnet where you want to run your DataSync task
     * when using a VPC endpoint.
     * This is the subnet where DataSync creates and manages the [network
     * interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
     * for your transfer. You can only specify one ARN.
     */
    public fun subnetArns(subnetArns: List<String>)

    /**
     * @param subnetArns Specifies the ARN of the subnet where you want to run your DataSync task
     * when using a VPC endpoint.
     * This is the subnet where DataSync creates and manages the [network
     * interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
     * for your transfer. You can only specify one ARN.
     */
    public fun subnetArns(vararg subnetArns: String)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least one tag for your agent.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least one tag for your agent.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcEndpointId The ID of the virtual private cloud (VPC) endpoint that the agent has
     * access to.
     * This is the client-side VPC endpoint, powered by AWS PrivateLink . If you don't have an AWS
     * PrivateLink VPC endpoint, see [AWS PrivateLink and VPC
     * endpoints](https://docs.aws.amazon.com//vpc/latest/userguide/endpoint-services-overview.html) in
     * the *Amazon VPC User Guide* .
     *
     * For more information about activating your agent in a private network based on a VPC, see
     * [Using AWS DataSync in a Virtual Private
     * Cloud](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-in-vpc.html) in the *AWS
     * DataSync User Guide.*
     *
     * A VPC endpoint ID looks like this: `vpce-01234d5aff67890e1` .
     */
    public fun vpcEndpointId(vpcEndpointId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnAgentProps.Builder =
        software.amazon.awscdk.services.datasync.CfnAgentProps.builder()

    /**
     * @param activationKey Specifies your DataSync agent's activation key.
     * If you don't have an activation key, see [Activate your
     * agent](https://docs.aws.amazon.com/datasync/latest/userguide/activate-agent.html) .
     */
    override fun activationKey(activationKey: String) {
      cdkBuilder.activationKey(activationKey)
    }

    /**
     * @param agentName Specifies a name for your agent.
     * You can see this name in the DataSync console.
     */
    override fun agentName(agentName: String) {
      cdkBuilder.agentName(agentName)
    }

    /**
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups used to
     * protect your data transfer task subnets.
     * See
     * [SecurityGroupArns](https://docs.aws.amazon.com/datasync/latest/userguide/API_Ec2Config.html#DataSync-Type-Ec2Config-SecurityGroupArns)
     * .
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     */
    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    /**
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups used to
     * protect your data transfer task subnets.
     * See
     * [SecurityGroupArns](https://docs.aws.amazon.com/datasync/latest/userguide/API_Ec2Config.html#DataSync-Type-Ec2Config-SecurityGroupArns)
     * .
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     */
    override fun securityGroupArns(vararg securityGroupArns: String): Unit =
        securityGroupArns(securityGroupArns.toList())

    /**
     * @param subnetArns Specifies the ARN of the subnet where you want to run your DataSync task
     * when using a VPC endpoint.
     * This is the subnet where DataSync creates and manages the [network
     * interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
     * for your transfer. You can only specify one ARN.
     */
    override fun subnetArns(subnetArns: List<String>) {
      cdkBuilder.subnetArns(subnetArns)
    }

    /**
     * @param subnetArns Specifies the ARN of the subnet where you want to run your DataSync task
     * when using a VPC endpoint.
     * This is the subnet where DataSync creates and manages the [network
     * interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
     * for your transfer. You can only specify one ARN.
     */
    override fun subnetArns(vararg subnetArns: String): Unit = subnetArns(subnetArns.toList())

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least one tag for your agent.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least one tag for your agent.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcEndpointId The ID of the virtual private cloud (VPC) endpoint that the agent has
     * access to.
     * This is the client-side VPC endpoint, powered by AWS PrivateLink . If you don't have an AWS
     * PrivateLink VPC endpoint, see [AWS PrivateLink and VPC
     * endpoints](https://docs.aws.amazon.com//vpc/latest/userguide/endpoint-services-overview.html) in
     * the *Amazon VPC User Guide* .
     *
     * For more information about activating your agent in a private network based on a VPC, see
     * [Using AWS DataSync in a Virtual Private
     * Cloud](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-in-vpc.html) in the *AWS
     * DataSync User Guide.*
     *
     * A VPC endpoint ID looks like this: `vpce-01234d5aff67890e1` .
     */
    override fun vpcEndpointId(vpcEndpointId: String) {
      cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnAgentProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnAgentProps,
  ) : CdkObject(cdkObject), CfnAgentProps {
    /**
     * Specifies your DataSync agent's activation key.
     *
     * If you don't have an activation key, see [Activate your
     * agent](https://docs.aws.amazon.com/datasync/latest/userguide/activate-agent.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-activationkey)
     */
    override fun activationKey(): String? = unwrap(this).getActivationKey()

    /**
     * Specifies a name for your agent.
     *
     * You can see this name in the DataSync console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-agentname)
     */
    override fun agentName(): String? = unwrap(this).getAgentName()

    /**
     * The Amazon Resource Names (ARNs) of the security groups used to protect your data transfer
     * task subnets.
     *
     * See
     * [SecurityGroupArns](https://docs.aws.amazon.com/datasync/latest/userguide/API_Ec2Config.html#DataSync-Type-Ec2Config-SecurityGroupArns)
     * .
     *
     * *Pattern* :
     * `^arn:(aws|aws-cn|aws-us-gov|aws-iso|aws-iso-b):ec2:[a-z\-0-9]*:[0-9]{12}:security-group/.*$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-securitygrouparns)
     */
    override fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns() ?:
        emptyList()

    /**
     * Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC
     * endpoint.
     *
     * This is the subnet where DataSync creates and manages the [network
     * interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
     * for your transfer. You can only specify one ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-subnetarns)
     */
    override fun subnetArns(): List<String> = unwrap(this).getSubnetArns() ?: emptyList()

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least one tag for your agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the virtual private cloud (VPC) endpoint that the agent has access to.
     *
     * This is the client-side VPC endpoint, powered by AWS PrivateLink . If you don't have an AWS
     * PrivateLink VPC endpoint, see [AWS PrivateLink and VPC
     * endpoints](https://docs.aws.amazon.com//vpc/latest/userguide/endpoint-services-overview.html) in
     * the *Amazon VPC User Guide* .
     *
     * For more information about activating your agent in a private network based on a VPC, see
     * [Using AWS DataSync in a Virtual Private
     * Cloud](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-in-vpc.html) in the *AWS
     * DataSync User Guide.*
     *
     * A VPC endpoint ID looks like this: `vpce-01234d5aff67890e1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-vpcendpointid)
     */
    override fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAgentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnAgentProps):
        CfnAgentProps = CdkObjectWrappers.wrap(cdkObject) as CfnAgentProps

    internal fun unwrap(wrapped: CfnAgentProps):
        software.amazon.awscdk.services.datasync.CfnAgentProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.datasync.CfnAgentProps
  }
}
