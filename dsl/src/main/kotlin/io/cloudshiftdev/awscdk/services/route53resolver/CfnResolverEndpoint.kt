package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResolverEndpoint internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the resolver endpoint, such as
   * `arn:aws:route53resolver:us-east-1:123456789012:resolver-endpoint/resolver-endpoint-a1bzhi` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Indicates whether the resolver endpoint allows inbound or outbound DNS queries.
   */
  public open fun attrDirection(): String = unwrap(this).getAttrDirection()

  /**
   * The ID of the VPC that you want to create the resolver endpoint in.
   */
  public open fun attrHostVpcId(): String = unwrap(this).getAttrHostVpcId()

  /**
   * The number of IP addresses that the resolver endpoint can use for DNS queries.
   */
  public open fun attrIpAddressCount(): String = unwrap(this).getAttrIpAddressCount()

  /**
   * The name that you assigned to the resolver endpoint when you created the endpoint.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   *
   */
  public open fun attrOutpostArn(): String = unwrap(this).getAttrOutpostArn()

  /**
   *
   */
  public open fun attrPreferredInstanceType(): String = unwrap(this).getAttrPreferredInstanceType()

  /**
   * The ID of the resolver endpoint.
   */
  public open fun attrResolverEndpointId(): String = unwrap(this).getAttrResolverEndpointId()

  /**
   *
   */
  public open fun attrResolverEndpointType(): String = unwrap(this).getAttrResolverEndpointType()

  /**
   * Indicates whether the Resolver endpoint allows inbound or outbound DNS queries:.
   */
  public open fun direction(): String = unwrap(this).getDirection()

  /**
   * Indicates whether the Resolver endpoint allows inbound or outbound DNS queries:.
   */
  public open fun direction(`value`: String) {
    unwrap(this).setDirection(`value`)
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
   * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound
   * endpoints) or that you forward DNS queries to (for inbound endpoints).
   */
  public open fun ipAddresses(): Any = unwrap(this).getIpAddresses()

  /**
   * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound
   * endpoints) or that you forward DNS queries to (for inbound endpoints).
   */
  public open fun ipAddresses(`value`: IResolvable) {
    unwrap(this).setIpAddresses(`value`.let(IResolvable::unwrap))
  }

  /**
   * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound
   * endpoints) or that you forward DNS queries to (for inbound endpoints).
   */
  public open fun ipAddresses(__idx_ac66f0: List<Any>) {
    unwrap(this).setIpAddresses(__idx_ac66f0)
  }

  /**
   * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound
   * endpoints) or that you forward DNS queries to (for inbound endpoints).
   */
  public open fun ipAddresses(vararg __idx_ac66f0: Any): Unit = ipAddresses(__idx_ac66f0.toList())

  /**
   * A friendly name that lets you easily find a configuration in the Resolver dashboard in the
   * Route 53 console.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * A friendly name that lets you easily find a configuration in the Resolver dashboard in the
   * Route 53 console.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ARN (Amazon Resource Name) for the Outpost.
   */
  public open fun outpostArn(): String? = unwrap(this).getOutpostArn()

  /**
   * The ARN (Amazon Resource Name) for the Outpost.
   */
  public open fun outpostArn(`value`: String) {
    unwrap(this).setOutpostArn(`value`)
  }

  /**
   * The Amazon EC2 instance type.
   */
  public open fun preferredInstanceType(): String? = unwrap(this).getPreferredInstanceType()

  /**
   * The Amazon EC2 instance type.
   */
  public open fun preferredInstanceType(`value`: String) {
    unwrap(this).setPreferredInstanceType(`value`)
  }

  /**
   * Protocols used for the endpoint.
   *
   * DoH-FIPS is applicable for inbound endpoints only.
   */
  public open fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

  /**
   * Protocols used for the endpoint.
   *
   * DoH-FIPS is applicable for inbound endpoints only.
   */
  public open fun protocols(`value`: List<String>) {
    unwrap(this).setProtocols(`value`)
  }

  /**
   * Protocols used for the endpoint.
   *
   * DoH-FIPS is applicable for inbound endpoints only.
   */
  public open fun protocols(vararg `value`: String): Unit = protocols(`value`.toList())

  /**
   * The Resolver endpoint IP address type.
   */
  public open fun resolverEndpointType(): String? = unwrap(this).getResolverEndpointType()

  /**
   * The Resolver endpoint IP address type.
   */
  public open fun resolverEndpointType(`value`: String) {
    unwrap(this).setResolverEndpointType(`value`)
  }

  /**
   * The ID of one or more security groups that control access to this VPC.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

  /**
   * The ID of one or more security groups that control access to this VPC.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The ID of one or more security groups that control access to this VPC.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Route 53 Resolver doesn't support updating tags through CloudFormation.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Route 53 Resolver doesn't support updating tags through CloudFormation.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Route 53 Resolver doesn't support updating tags through CloudFormation.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53resolver.CfnResolverEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Indicates whether the Resolver endpoint allows inbound or outbound DNS queries:.
     *
     * * `INBOUND` : allows DNS queries to your VPC from your network
     * * `OUTBOUND` : allows DNS queries from your VPC to your network
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-direction)
     * @param direction Indicates whether the Resolver endpoint allows inbound or outbound DNS
     * queries:. 
     */
    public fun direction(direction: String)

    /**
     * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound
     * endpoints) or that you forward DNS queries to (for inbound endpoints).
     *
     * The subnet ID uniquely identifies a VPC.
     *
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-ipaddresses)
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     * (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). 
     */
    public fun ipAddresses(ipAddresses: IResolvable)

    /**
     * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound
     * endpoints) or that you forward DNS queries to (for inbound endpoints).
     *
     * The subnet ID uniquely identifies a VPC.
     *
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-ipaddresses)
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     * (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). 
     */
    public fun ipAddresses(ipAddresses: List<Any>)

    /**
     * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound
     * endpoints) or that you forward DNS queries to (for inbound endpoints).
     *
     * The subnet ID uniquely identifies a VPC.
     *
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-ipaddresses)
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     * (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). 
     */
    public fun ipAddresses(vararg ipAddresses: Any)

    /**
     * A friendly name that lets you easily find a configuration in the Resolver dashboard in the
     * Route 53 console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-name)
     * @param name A friendly name that lets you easily find a configuration in the Resolver
     * dashboard in the Route 53 console. 
     */
    public fun name(name: String)

    /**
     * The ARN (Amazon Resource Name) for the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-outpostarn)
     * @param outpostArn The ARN (Amazon Resource Name) for the Outpost. 
     */
    public fun outpostArn(outpostArn: String)

    /**
     * The Amazon EC2 instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-preferredinstancetype)
     * @param preferredInstanceType The Amazon EC2 instance type. 
     */
    public fun preferredInstanceType(preferredInstanceType: String)

    /**
     * Protocols used for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     *
     * For an inbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 and DoH-FIPS in combination.
     * * Do53 alone.
     * * DoH alone.
     * * DoH-FIPS alone.
     * * None, which is treated as Do53.
     *
     * For an outbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 alone.
     * * DoH alone.
     * * None, which is treated as Do53.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-protocols)
     * @param protocols Protocols used for the endpoint. DoH-FIPS is applicable for inbound
     * endpoints only. 
     */
    public fun protocols(protocols: List<String>)

    /**
     * Protocols used for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     *
     * For an inbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 and DoH-FIPS in combination.
     * * Do53 alone.
     * * DoH alone.
     * * DoH-FIPS alone.
     * * None, which is treated as Do53.
     *
     * For an outbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 alone.
     * * DoH alone.
     * * None, which is treated as Do53.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-protocols)
     * @param protocols Protocols used for the endpoint. DoH-FIPS is applicable for inbound
     * endpoints only. 
     */
    public fun protocols(vararg protocols: String)

    /**
     * The Resolver endpoint IP address type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-resolverendpointtype)
     * @param resolverEndpointType The Resolver endpoint IP address type. 
     */
    public fun resolverEndpointType(resolverEndpointType: String)

    /**
     * The ID of one or more security groups that control access to this VPC.
     *
     * The security group must include one or more inbound rules (for inbound endpoints) or outbound
     * rules (for outbound endpoints). Inbound and outbound rules must allow TCP and UDP access. For
     * inbound access, open port 53. For outbound access, open the port that you're using for DNS
     * queries on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-securitygroupids)
     * @param securityGroupIds The ID of one or more security groups that control access to this
     * VPC. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The ID of one or more security groups that control access to this VPC.
     *
     * The security group must include one or more inbound rules (for inbound endpoints) or outbound
     * rules (for outbound endpoints). Inbound and outbound rules must allow TCP and UDP access. For
     * inbound access, open port 53. For outbound access, open the port that you're using for DNS
     * queries on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-securitygroupids)
     * @param securityGroupIds The ID of one or more security groups that control access to this
     * VPC. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * Route 53 Resolver doesn't support updating tags through CloudFormation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-tags)
     * @param tags Route 53 Resolver doesn't support updating tags through CloudFormation. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Route 53 Resolver doesn't support updating tags through CloudFormation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-tags)
     * @param tags Route 53 Resolver doesn't support updating tags through CloudFormation. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.Builder.create(scope,
        id)

    /**
     * Indicates whether the Resolver endpoint allows inbound or outbound DNS queries:.
     *
     * * `INBOUND` : allows DNS queries to your VPC from your network
     * * `OUTBOUND` : allows DNS queries from your VPC to your network
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-direction)
     * @param direction Indicates whether the Resolver endpoint allows inbound or outbound DNS
     * queries:. 
     */
    override fun direction(direction: String) {
      cdkBuilder.direction(direction)
    }

    /**
     * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound
     * endpoints) or that you forward DNS queries to (for inbound endpoints).
     *
     * The subnet ID uniquely identifies a VPC.
     *
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-ipaddresses)
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     * (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). 
     */
    override fun ipAddresses(ipAddresses: IResolvable) {
      cdkBuilder.ipAddresses(ipAddresses.let(IResolvable::unwrap))
    }

    /**
     * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound
     * endpoints) or that you forward DNS queries to (for inbound endpoints).
     *
     * The subnet ID uniquely identifies a VPC.
     *
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-ipaddresses)
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     * (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). 
     */
    override fun ipAddresses(ipAddresses: List<Any>) {
      cdkBuilder.ipAddresses(ipAddresses)
    }

    /**
     * The subnets and IP addresses in your VPC that DNS queries originate from (for outbound
     * endpoints) or that you forward DNS queries to (for inbound endpoints).
     *
     * The subnet ID uniquely identifies a VPC.
     *
     *
     * Even though the minimum is 1, Route 53 requires that you create at least two.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-ipaddresses)
     * @param ipAddresses The subnets and IP addresses in your VPC that DNS queries originate from
     * (for outbound endpoints) or that you forward DNS queries to (for inbound endpoints). 
     */
    override fun ipAddresses(vararg ipAddresses: Any): Unit = ipAddresses(ipAddresses.toList())

    /**
     * A friendly name that lets you easily find a configuration in the Resolver dashboard in the
     * Route 53 console.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-name)
     * @param name A friendly name that lets you easily find a configuration in the Resolver
     * dashboard in the Route 53 console. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ARN (Amazon Resource Name) for the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-outpostarn)
     * @param outpostArn The ARN (Amazon Resource Name) for the Outpost. 
     */
    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    /**
     * The Amazon EC2 instance type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-preferredinstancetype)
     * @param preferredInstanceType The Amazon EC2 instance type. 
     */
    override fun preferredInstanceType(preferredInstanceType: String) {
      cdkBuilder.preferredInstanceType(preferredInstanceType)
    }

    /**
     * Protocols used for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     *
     * For an inbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 and DoH-FIPS in combination.
     * * Do53 alone.
     * * DoH alone.
     * * DoH-FIPS alone.
     * * None, which is treated as Do53.
     *
     * For an outbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 alone.
     * * DoH alone.
     * * None, which is treated as Do53.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-protocols)
     * @param protocols Protocols used for the endpoint. DoH-FIPS is applicable for inbound
     * endpoints only. 
     */
    override fun protocols(protocols: List<String>) {
      cdkBuilder.protocols(protocols)
    }

    /**
     * Protocols used for the endpoint. DoH-FIPS is applicable for inbound endpoints only.
     *
     * For an inbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 and DoH-FIPS in combination.
     * * Do53 alone.
     * * DoH alone.
     * * DoH-FIPS alone.
     * * None, which is treated as Do53.
     *
     * For an outbound endpoint you can apply the protocols as follows:
     *
     * * Do53 and DoH in combination.
     * * Do53 alone.
     * * DoH alone.
     * * None, which is treated as Do53.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-protocols)
     * @param protocols Protocols used for the endpoint. DoH-FIPS is applicable for inbound
     * endpoints only. 
     */
    override fun protocols(vararg protocols: String): Unit = protocols(protocols.toList())

    /**
     * The Resolver endpoint IP address type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-resolverendpointtype)
     * @param resolverEndpointType The Resolver endpoint IP address type. 
     */
    override fun resolverEndpointType(resolverEndpointType: String) {
      cdkBuilder.resolverEndpointType(resolverEndpointType)
    }

    /**
     * The ID of one or more security groups that control access to this VPC.
     *
     * The security group must include one or more inbound rules (for inbound endpoints) or outbound
     * rules (for outbound endpoints). Inbound and outbound rules must allow TCP and UDP access. For
     * inbound access, open port 53. For outbound access, open the port that you're using for DNS
     * queries on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-securitygroupids)
     * @param securityGroupIds The ID of one or more security groups that control access to this
     * VPC. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The ID of one or more security groups that control access to this VPC.
     *
     * The security group must include one or more inbound rules (for inbound endpoints) or outbound
     * rules (for outbound endpoints). Inbound and outbound rules must allow TCP and UDP access. For
     * inbound access, open port 53. For outbound access, open the port that you're using for DNS
     * queries on your network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-securitygroupids)
     * @param securityGroupIds The ID of one or more security groups that control access to this
     * VPC. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * Route 53 Resolver doesn't support updating tags through CloudFormation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-tags)
     * @param tags Route 53 Resolver doesn't support updating tags through CloudFormation. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Route 53 Resolver doesn't support updating tags through CloudFormation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverendpoint.html#cfn-route53resolver-resolverendpoint-tags)
     * @param tags Route 53 Resolver doesn't support updating tags through CloudFormation. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResolverEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResolverEndpoint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint):
        CfnResolverEndpoint = CfnResolverEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnResolverEndpoint):
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint = wrapped.cdkObject
  }

  public interface IpAddressRequestProperty {
    /**
     * The IPv4 address that you want to use for DNS queries.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverendpoint-ipaddressrequest.html#cfn-route53resolver-resolverendpoint-ipaddressrequest-ip)
     */
    public fun ip(): String? = unwrap(this).getIp()

    /**
     * The IPv6 address that you want to use for DNS queries.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverendpoint-ipaddressrequest.html#cfn-route53resolver-resolverendpoint-ipaddressrequest-ipv6)
     */
    public fun ipv6(): String? = unwrap(this).getIpv6()

    /**
     * The ID of the subnet that contains the IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverendpoint-ipaddressrequest.html#cfn-route53resolver-resolverendpoint-ipaddressrequest-subnetid)
     */
    public fun subnetId(): String

    /**
     * A builder for [IpAddressRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ip The IPv4 address that you want to use for DNS queries.
       */
      public fun ip(ip: String)

      /**
       * @param ipv6 The IPv6 address that you want to use for DNS queries.
       */
      public fun ipv6(ipv6: String)

      /**
       * @param subnetId The ID of the subnet that contains the IP address. 
       */
      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty.Builder
          =
          software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty.builder()

      /**
       * @param ip The IPv4 address that you want to use for DNS queries.
       */
      override fun ip(ip: String) {
        cdkBuilder.ip(ip)
      }

      /**
       * @param ipv6 The IPv6 address that you want to use for DNS queries.
       */
      override fun ipv6(ipv6: String) {
        cdkBuilder.ipv6(ipv6)
      }

      /**
       * @param subnetId The ID of the subnet that contains the IP address. 
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty,
    ) : CdkObject(cdkObject), IpAddressRequestProperty {
      /**
       * The IPv4 address that you want to use for DNS queries.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverendpoint-ipaddressrequest.html#cfn-route53resolver-resolverendpoint-ipaddressrequest-ip)
       */
      override fun ip(): String? = unwrap(this).getIp()

      /**
       * The IPv6 address that you want to use for DNS queries.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverendpoint-ipaddressrequest.html#cfn-route53resolver-resolverendpoint-ipaddressrequest-ipv6)
       */
      override fun ipv6(): String? = unwrap(this).getIpv6()

      /**
       * The ID of the subnet that contains the IP address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53resolver-resolverendpoint-ipaddressrequest.html#cfn-route53resolver-resolverendpoint-ipaddressrequest-subnetid)
       */
      override fun subnetId(): String = unwrap(this).getSubnetId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IpAddressRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty):
          IpAddressRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpAddressRequestProperty):
          software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint.IpAddressRequestProperty
    }
  }
}
