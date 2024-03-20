@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::DataSync::Agent` resource activates an AWS DataSync agent that you've deployed for
 * storage discovery or data transfers.
 *
 * The activation process associates the agent with your AWS account .
 *
 * For more information, see the following topics in the *AWS DataSync User Guide* :
 *
 * * [DataSync agent
 * requirements](https://docs.aws.amazon.com/datasync/latest/userguide/agent-requirements.html)
 * * [DataSync network
 * requirements](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html)
 * * [Create a DataSync
 * agent](https://docs.aws.amazon.com/datasync/latest/userguide/configure-agent.html)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnAgent cfnAgent = CfnAgent.Builder.create(this, "MyCfnAgent")
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
public open class CfnAgent internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.datasync.CfnAgent,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.datasync.CfnAgent(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAgentProps,
  ) :
      this(software.amazon.awscdk.services.datasync.CfnAgent(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnAgentProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAgentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAgentProps(props)
  )

  /**
   * Specifies your DataSync agent's activation key.
   */
  public open fun activationKey(): String? = unwrap(this).getActivationKey()

  /**
   * Specifies your DataSync agent's activation key.
   */
  public open fun activationKey(`value`: String) {
    unwrap(this).setActivationKey(`value`)
  }

  /**
   * Specifies a name for your agent.
   */
  public open fun agentName(): String? = unwrap(this).getAgentName()

  /**
   * Specifies a name for your agent.
   */
  public open fun agentName(`value`: String) {
    unwrap(this).setAgentName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the agent.
   *
   * Use the `ListAgents` operation to return a list of agents for your account and AWS Region .
   */
  public open fun attrAgentArn(): String = unwrap(this).getAttrAgentArn()

  /**
   * The type of endpoint that your agent is connected to.
   *
   * If the endpoint is a VPC endpoint, the agent is not accessible over the public internet.
   */
  public open fun attrEndpointType(): String = unwrap(this).getAttrEndpointType()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Names (ARNs) of the security groups used to protect your data transfer task
   * subnets.
   */
  public open fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns() ?:
      emptyList()

  /**
   * The Amazon Resource Names (ARNs) of the security groups used to protect your data transfer task
   * subnets.
   */
  public open fun securityGroupArns(`value`: List<String>) {
    unwrap(this).setSecurityGroupArns(`value`)
  }

  /**
   * The Amazon Resource Names (ARNs) of the security groups used to protect your data transfer task
   * subnets.
   */
  public open fun securityGroupArns(vararg `value`: String): Unit =
      securityGroupArns(`value`.toList())

  /**
   * Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC
   * endpoint.
   */
  public open fun subnetArns(): List<String> = unwrap(this).getSubnetArns() ?: emptyList()

  /**
   * Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC
   * endpoint.
   */
  public open fun subnetArns(`value`: List<String>) {
    unwrap(this).setSubnetArns(`value`)
  }

  /**
   * Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC
   * endpoint.
   */
  public open fun subnetArns(vararg `value`: String): Unit = subnetArns(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The ID of the virtual private cloud (VPC) endpoint that the agent has access to.
   */
  public open fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

  /**
   * The ID of the virtual private cloud (VPC) endpoint that the agent has access to.
   */
  public open fun vpcEndpointId(`value`: String) {
    unwrap(this).setVpcEndpointId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datasync.CfnAgent].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies your DataSync agent's activation key.
     *
     * If you don't have an activation key, see [Activate your
     * agent](https://docs.aws.amazon.com/datasync/latest/userguide/activate-agent.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-activationkey)
     * @param activationKey Specifies your DataSync agent's activation key. 
     */
    public fun activationKey(activationKey: String)

    /**
     * Specifies a name for your agent.
     *
     * You can see this name in the DataSync console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-agentname)
     * @param agentName Specifies a name for your agent. 
     */
    public fun agentName(agentName: String)

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
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups used to
     * protect your data transfer task subnets. 
     */
    public fun securityGroupArns(securityGroupArns: List<String>)

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
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups used to
     * protect your data transfer task subnets. 
     */
    public fun securityGroupArns(vararg securityGroupArns: String)

    /**
     * Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC
     * endpoint.
     *
     * This is the subnet where DataSync creates and manages the [network
     * interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
     * for your transfer. You can only specify one ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-subnetarns)
     * @param subnetArns Specifies the ARN of the subnet where you want to run your DataSync task
     * when using a VPC endpoint. 
     */
    public fun subnetArns(subnetArns: List<String>)

    /**
     * Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC
     * endpoint.
     *
     * This is the subnet where DataSync creates and manages the [network
     * interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
     * for your transfer. You can only specify one ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-subnetarns)
     * @param subnetArns Specifies the ARN of the subnet where you want to run your DataSync task
     * when using a VPC endpoint. 
     */
    public fun subnetArns(vararg subnetArns: String)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least one tag for your agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least one tag for your agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(vararg tags: CfnTag)

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
     * @param vpcEndpointId The ID of the virtual private cloud (VPC) endpoint that the agent has
     * access to. 
     */
    public fun vpcEndpointId(vpcEndpointId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnAgent.Builder =
        software.amazon.awscdk.services.datasync.CfnAgent.Builder.create(scope, id)

    /**
     * Specifies your DataSync agent's activation key.
     *
     * If you don't have an activation key, see [Activate your
     * agent](https://docs.aws.amazon.com/datasync/latest/userguide/activate-agent.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-activationkey)
     * @param activationKey Specifies your DataSync agent's activation key. 
     */
    override fun activationKey(activationKey: String) {
      cdkBuilder.activationKey(activationKey)
    }

    /**
     * Specifies a name for your agent.
     *
     * You can see this name in the DataSync console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-agentname)
     * @param agentName Specifies a name for your agent. 
     */
    override fun agentName(agentName: String) {
      cdkBuilder.agentName(agentName)
    }

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
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups used to
     * protect your data transfer task subnets. 
     */
    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

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
     * @param securityGroupArns The Amazon Resource Names (ARNs) of the security groups used to
     * protect your data transfer task subnets. 
     */
    override fun securityGroupArns(vararg securityGroupArns: String): Unit =
        securityGroupArns(securityGroupArns.toList())

    /**
     * Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC
     * endpoint.
     *
     * This is the subnet where DataSync creates and manages the [network
     * interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
     * for your transfer. You can only specify one ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-subnetarns)
     * @param subnetArns Specifies the ARN of the subnet where you want to run your DataSync task
     * when using a VPC endpoint. 
     */
    override fun subnetArns(subnetArns: List<String>) {
      cdkBuilder.subnetArns(subnetArns)
    }

    /**
     * Specifies the ARN of the subnet where you want to run your DataSync task when using a VPC
     * endpoint.
     *
     * This is the subnet where DataSync creates and manages the [network
     * interfaces](https://docs.aws.amazon.com/datasync/latest/userguide/datasync-network.html#required-network-interfaces)
     * for your transfer. You can only specify one ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-subnetarns)
     * @param subnetArns Specifies the ARN of the subnet where you want to run your DataSync task
     * when using a VPC endpoint. 
     */
    override fun subnetArns(vararg subnetArns: String): Unit = subnetArns(subnetArns.toList())

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least one tag for your agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least one tag for your agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-agent.html#cfn-datasync-agent-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
     * @param vpcEndpointId The ID of the virtual private cloud (VPC) endpoint that the agent has
     * access to. 
     */
    override fun vpcEndpointId(vpcEndpointId: String) {
      cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnAgent = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datasync.CfnAgent.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAgent {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAgent(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnAgent): CfnAgent =
        CfnAgent(cdkObject)

    internal fun unwrap(wrapped: CfnAgent): software.amazon.awscdk.services.datasync.CfnAgent =
        wrapped.cdkObject
  }
}
