@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a VPC endpoint.
 *
 * A VPC endpoint provides a private connection between your VPC and an endpoint service. You can
 * use an endpoint service provided by AWS , an AWS Marketplace Partner, or another AWS accounts in
 * your organization. For more information, see the [AWS PrivateLink User
 * Guide](https://docs.aws.amazon.com/vpc/latest/privatelink/) .
 *
 * An endpoint of type `Interface` establishes connections between the subnets in your VPC and an
 * AWS service , your own service, or a service hosted by another AWS account . With an interface VPC
 * endpoint, you specify the subnets in which to create the endpoint and the security groups to
 * associate with the endpoint network interfaces.
 *
 * An endpoint of type `gateway` serves as a target for a route in your route table for traffic
 * destined for Amazon S3 or DynamoDB . You can specify an endpoint policy for the endpoint, which
 * controls access to the service from your VPC. You can also specify the VPC route tables that use the
 * endpoint. For more information about connectivity to Amazon S3 , see [Why can't I connect to an S3
 * bucket using a gateway VPC
 * endpoint?](https://docs.aws.amazon.com/premiumsupport/knowledge-center/connect-s3-vpc-endpoint)
 *
 * An endpoint of type `GatewayLoadBalancer` provides private connectivity between your VPC and
 * virtual appliances from a service provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * Object policyDocument;
 * CfnVPCEndpoint cfnVPCEndpoint = CfnVPCEndpoint.Builder.create(this, "MyCfnVPCEndpoint")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .dnsOptions(DnsOptionsSpecificationProperty.builder()
 * .dnsRecordIpType("dnsRecordIpType")
 * .privateDnsOnlyForInboundResolverEndpoint("privateDnsOnlyForInboundResolverEndpoint")
 * .build())
 * .ipAddressType("ipAddressType")
 * .policyDocument(policyDocument)
 * .privateDnsEnabled(false)
 * .resourceConfigurationArn("resourceConfigurationArn")
 * .routeTableIds(List.of("routeTableIds"))
 * .securityGroupIds(List.of("securityGroupIds"))
 * .serviceName("serviceName")
 * .serviceNetworkArn("serviceNetworkArn")
 * .serviceRegion("serviceRegion")
 * .subnetIds(List.of("subnetIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcEndpointType("vpcEndpointType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html)
 */
public open class CfnVPCEndpoint(
  cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpoint,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPCEndpointProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnVPCEndpoint(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVPCEndpointProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVPCEndpointProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVPCEndpointProps(props)
  )

  /**
   * The date and time the VPC endpoint was created.
   *
   * For example: `Fri Sep 28 23:34:36 UTC 2018.`
   */
  public open fun attrCreationTimestamp(): String = unwrap(this).getAttrCreationTimestamp()

  /**
   * (Interface endpoints) The DNS entries for the endpoint.
   *
   * Each entry is a combination of the hosted zone ID and the DNS name. The entries are ordered as
   * follows: regional public DNS, zonal public DNS, private DNS, and wildcard DNS. This order is not
   * enforced for AWS Marketplace services.
   *
   * The following is an example. In the first entry, the hosted zone ID is Z1HUB23UULQXV and the
   * DNS name is vpce-01abc23456de78f9g-12abccd3.ec2.us-east-1.vpce.amazonaws.com.
   *
   * ["Z1HUB23UULQXV:vpce-01abc23456de78f9g-12abccd3.ec2.us-east-1.vpce.amazonaws.com",
   * "Z1HUB23UULQXV:vpce-01abc23456de78f9g-12abccd3-us-east-1a.ec2.us-east-1.vpce.amazonaws.com",
   * "Z1C12344VYDITB0:ec2.us-east-1.amazonaws.com"]
   *
   * If you update the `PrivateDnsEnabled` or `SubnetIds` properties, the DNS entries in the list
   * will change.
   */
  public open fun attrDnsEntries(): List<String> = unwrap(this).getAttrDnsEntries()

  /**
   * The ID of the VPC endpoint.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * (Interface endpoints) The network interface IDs.
   *
   * If you update the `PrivateDnsEnabled` or `SubnetIds` properties, the items in this list might
   * change.
   */
  public open fun attrNetworkInterfaceIds(): List<String> =
      unwrap(this).getAttrNetworkInterfaceIds()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Describes the DNS options for an endpoint.
   */
  public open fun dnsOptions(): Any? = unwrap(this).getDnsOptions()

  /**
   * Describes the DNS options for an endpoint.
   */
  public open fun dnsOptions(`value`: IResolvable) {
    unwrap(this).setDnsOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Describes the DNS options for an endpoint.
   */
  public open fun dnsOptions(`value`: DnsOptionsSpecificationProperty) {
    unwrap(this).setDnsOptions(`value`.let(DnsOptionsSpecificationProperty.Companion::unwrap))
  }

  /**
   * Describes the DNS options for an endpoint.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6e7c992be48c7964a3305f61a674d952764afe972106713144ecfc1805e4cace")
  public open fun dnsOptions(`value`: DnsOptionsSpecificationProperty.Builder.() -> Unit): Unit =
      dnsOptions(DnsOptionsSpecificationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The supported IP address types.
   */
  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * The supported IP address types.
   */
  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  /**
   * An endpoint policy, which controls access to the service from the VPC.
   */
  public open fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

  /**
   * An endpoint policy, which controls access to the service from the VPC.
   */
  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  /**
   * Indicate whether to associate a private hosted zone with the specified VPC.
   */
  public open fun privateDnsEnabled(): Any? = unwrap(this).getPrivateDnsEnabled()

  /**
   * Indicate whether to associate a private hosted zone with the specified VPC.
   */
  public open fun privateDnsEnabled(`value`: Boolean) {
    unwrap(this).setPrivateDnsEnabled(`value`)
  }

  /**
   * Indicate whether to associate a private hosted zone with the specified VPC.
   */
  public open fun privateDnsEnabled(`value`: IResolvable) {
    unwrap(this).setPrivateDnsEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the resource configuration.
   */
  public open fun resourceConfigurationArn(): String? = unwrap(this).getResourceConfigurationArn()

  /**
   * The Amazon Resource Name (ARN) of the resource configuration.
   */
  public open fun resourceConfigurationArn(`value`: String) {
    unwrap(this).setResourceConfigurationArn(`value`)
  }

  /**
   * The IDs of the route tables.
   */
  public open fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds() ?: emptyList()

  /**
   * The IDs of the route tables.
   */
  public open fun routeTableIds(`value`: List<String>) {
    unwrap(this).setRouteTableIds(`value`)
  }

  /**
   * The IDs of the route tables.
   */
  public open fun routeTableIds(vararg `value`: String): Unit = routeTableIds(`value`.toList())

  /**
   * The IDs of the security groups to associate with the endpoint network interfaces.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * The IDs of the security groups to associate with the endpoint network interfaces.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The IDs of the security groups to associate with the endpoint network interfaces.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * The name of the endpoint service.
   */
  public open fun serviceName(): String? = unwrap(this).getServiceName()

  /**
   * The name of the endpoint service.
   */
  public open fun serviceName(`value`: String) {
    unwrap(this).setServiceName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the service network.
   */
  public open fun serviceNetworkArn(): String? = unwrap(this).getServiceNetworkArn()

  /**
   * The Amazon Resource Name (ARN) of the service network.
   */
  public open fun serviceNetworkArn(`value`: String) {
    unwrap(this).setServiceNetworkArn(`value`)
  }

  /**
   * Describes a Region.
   */
  public open fun serviceRegion(): String? = unwrap(this).getServiceRegion()

  /**
   * Describes a Region.
   */
  public open fun serviceRegion(`value`: String) {
    unwrap(this).setServiceRegion(`value`)
  }

  /**
   * The IDs of the subnets in which to create endpoint network interfaces.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * The IDs of the subnets in which to create endpoint network interfaces.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * The IDs of the subnets in which to create endpoint network interfaces.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * The tags to associate with the endpoint.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags to associate with the endpoint.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags to associate with the endpoint.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The type of endpoint.
   */
  public open fun vpcEndpointType(): String? = unwrap(this).getVpcEndpointType()

  /**
   * The type of endpoint.
   */
  public open fun vpcEndpointType(`value`: String) {
    unwrap(this).setVpcEndpointType(`value`)
  }

  /**
   * The ID of the VPC.
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   * The ID of the VPC.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPCEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Describes the DNS options for an endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-dnsoptions)
     * @param dnsOptions Describes the DNS options for an endpoint. 
     */
    public fun dnsOptions(dnsOptions: IResolvable)

    /**
     * Describes the DNS options for an endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-dnsoptions)
     * @param dnsOptions Describes the DNS options for an endpoint. 
     */
    public fun dnsOptions(dnsOptions: DnsOptionsSpecificationProperty)

    /**
     * Describes the DNS options for an endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-dnsoptions)
     * @param dnsOptions Describes the DNS options for an endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b7eea7d63061d22f8dccdb40ad74f5974a825e45e43dd417c25e8074d4ac7fd")
    public fun dnsOptions(dnsOptions: DnsOptionsSpecificationProperty.Builder.() -> Unit)

    /**
     * The supported IP address types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-ipaddresstype)
     * @param ipAddressType The supported IP address types. 
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * An endpoint policy, which controls access to the service from the VPC.
     *
     * The default endpoint policy allows full access to the service. Endpoint policies are
     * supported only for gateway and interface endpoints.
     *
     * For CloudFormation templates in YAML, you can provide the policy in JSON or YAML format. For
     * example, if you have a JSON policy, you can convert it to YAML before including it in the YAML
     * template, and AWS CloudFormation converts the policy to JSON format before calling the API
     * actions for AWS PrivateLink . Alternatively, you can include the JSON directly in the YAML, as
     * shown in the following `Properties` section:
     *
     * `Properties: VpcEndpointType: 'Interface' ServiceName: !Sub
     * 'com.amazonaws.${AWS::Region}.logs' PolicyDocument: '{ "Version":"2012-10-17", "Statement": [{
     * "Effect":"Allow", "Principal":"*",
     * "Action":["logs:Describe*","logs:Get*","logs:List*","logs:FilterLogEvents"], "Resource":"*" }]
     * }'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-policydocument)
     * @param policyDocument An endpoint policy, which controls access to the service from the VPC. 
     */
    public fun policyDocument(policyDocument: Any)

    /**
     * Indicate whether to associate a private hosted zone with the specified VPC.
     *
     * The private hosted zone contains a record set for the default public DNS name for the service
     * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the private
     * IP addresses of the endpoint network interfaces in the VPC. This enables you to make requests to
     * the default public DNS name for the service instead of the public DNS names that are
     * automatically generated by the VPC endpoint service.
     *
     * To use a private hosted zone, you must set the following VPC attributes to `true` :
     * `enableDnsHostnames` and `enableDnsSupport` .
     *
     * This property is supported only for interface endpoints.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-privatednsenabled)
     * @param privateDnsEnabled Indicate whether to associate a private hosted zone with the
     * specified VPC. 
     */
    public fun privateDnsEnabled(privateDnsEnabled: Boolean)

    /**
     * Indicate whether to associate a private hosted zone with the specified VPC.
     *
     * The private hosted zone contains a record set for the default public DNS name for the service
     * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the private
     * IP addresses of the endpoint network interfaces in the VPC. This enables you to make requests to
     * the default public DNS name for the service instead of the public DNS names that are
     * automatically generated by the VPC endpoint service.
     *
     * To use a private hosted zone, you must set the following VPC attributes to `true` :
     * `enableDnsHostnames` and `enableDnsSupport` .
     *
     * This property is supported only for interface endpoints.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-privatednsenabled)
     * @param privateDnsEnabled Indicate whether to associate a private hosted zone with the
     * specified VPC. 
     */
    public fun privateDnsEnabled(privateDnsEnabled: IResolvable)

    /**
     * The Amazon Resource Name (ARN) of the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-resourceconfigurationarn)
     * @param resourceConfigurationArn The Amazon Resource Name (ARN) of the resource configuration.
     * 
     */
    public fun resourceConfigurationArn(resourceConfigurationArn: String)

    /**
     * The IDs of the route tables.
     *
     * Routing is supported only for gateway endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids)
     * @param routeTableIds The IDs of the route tables. 
     */
    public fun routeTableIds(routeTableIds: List<String>)

    /**
     * The IDs of the route tables.
     *
     * Routing is supported only for gateway endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids)
     * @param routeTableIds The IDs of the route tables. 
     */
    public fun routeTableIds(vararg routeTableIds: String)

    /**
     * The IDs of the security groups to associate with the endpoint network interfaces.
     *
     * If this parameter is not specified, we use the default security group for the VPC. Security
     * groups are supported only for interface endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids)
     * @param securityGroupIds The IDs of the security groups to associate with the endpoint network
     * interfaces. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The IDs of the security groups to associate with the endpoint network interfaces.
     *
     * If this parameter is not specified, we use the default security group for the VPC. Security
     * groups are supported only for interface endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids)
     * @param securityGroupIds The IDs of the security groups to associate with the endpoint network
     * interfaces. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * The name of the endpoint service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicename)
     * @param serviceName The name of the endpoint service. 
     */
    public fun serviceName(serviceName: String)

    /**
     * The Amazon Resource Name (ARN) of the service network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicenetworkarn)
     * @param serviceNetworkArn The Amazon Resource Name (ARN) of the service network. 
     */
    public fun serviceNetworkArn(serviceNetworkArn: String)

    /**
     * Describes a Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-serviceregion)
     * @param serviceRegion Describes a Region. 
     */
    public fun serviceRegion(serviceRegion: String)

    /**
     * The IDs of the subnets in which to create endpoint network interfaces.
     *
     * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
     * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint,
     * you can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids)
     * @param subnetIds The IDs of the subnets in which to create endpoint network interfaces. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * The IDs of the subnets in which to create endpoint network interfaces.
     *
     * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
     * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint,
     * you can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids)
     * @param subnetIds The IDs of the subnets in which to create endpoint network interfaces. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * The tags to associate with the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-tags)
     * @param tags The tags to associate with the endpoint. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to associate with the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-tags)
     * @param tags The tags to associate with the endpoint. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of endpoint.
     *
     * Default: Gateway
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcendpointtype)
     * @param vpcEndpointType The type of endpoint. 
     */
    public fun vpcEndpointType(vpcEndpointType: String)

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCEndpoint.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpoint.Builder.create(scope, id)

    /**
     * Describes the DNS options for an endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-dnsoptions)
     * @param dnsOptions Describes the DNS options for an endpoint. 
     */
    override fun dnsOptions(dnsOptions: IResolvable) {
      cdkBuilder.dnsOptions(dnsOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Describes the DNS options for an endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-dnsoptions)
     * @param dnsOptions Describes the DNS options for an endpoint. 
     */
    override fun dnsOptions(dnsOptions: DnsOptionsSpecificationProperty) {
      cdkBuilder.dnsOptions(dnsOptions.let(DnsOptionsSpecificationProperty.Companion::unwrap))
    }

    /**
     * Describes the DNS options for an endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-dnsoptions)
     * @param dnsOptions Describes the DNS options for an endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1b7eea7d63061d22f8dccdb40ad74f5974a825e45e43dd417c25e8074d4ac7fd")
    override fun dnsOptions(dnsOptions: DnsOptionsSpecificationProperty.Builder.() -> Unit): Unit =
        dnsOptions(DnsOptionsSpecificationProperty(dnsOptions))

    /**
     * The supported IP address types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-ipaddresstype)
     * @param ipAddressType The supported IP address types. 
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * An endpoint policy, which controls access to the service from the VPC.
     *
     * The default endpoint policy allows full access to the service. Endpoint policies are
     * supported only for gateway and interface endpoints.
     *
     * For CloudFormation templates in YAML, you can provide the policy in JSON or YAML format. For
     * example, if you have a JSON policy, you can convert it to YAML before including it in the YAML
     * template, and AWS CloudFormation converts the policy to JSON format before calling the API
     * actions for AWS PrivateLink . Alternatively, you can include the JSON directly in the YAML, as
     * shown in the following `Properties` section:
     *
     * `Properties: VpcEndpointType: 'Interface' ServiceName: !Sub
     * 'com.amazonaws.${AWS::Region}.logs' PolicyDocument: '{ "Version":"2012-10-17", "Statement": [{
     * "Effect":"Allow", "Principal":"*",
     * "Action":["logs:Describe*","logs:Get*","logs:List*","logs:FilterLogEvents"], "Resource":"*" }]
     * }'`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-policydocument)
     * @param policyDocument An endpoint policy, which controls access to the service from the VPC. 
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * Indicate whether to associate a private hosted zone with the specified VPC.
     *
     * The private hosted zone contains a record set for the default public DNS name for the service
     * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the private
     * IP addresses of the endpoint network interfaces in the VPC. This enables you to make requests to
     * the default public DNS name for the service instead of the public DNS names that are
     * automatically generated by the VPC endpoint service.
     *
     * To use a private hosted zone, you must set the following VPC attributes to `true` :
     * `enableDnsHostnames` and `enableDnsSupport` .
     *
     * This property is supported only for interface endpoints.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-privatednsenabled)
     * @param privateDnsEnabled Indicate whether to associate a private hosted zone with the
     * specified VPC. 
     */
    override fun privateDnsEnabled(privateDnsEnabled: Boolean) {
      cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    /**
     * Indicate whether to associate a private hosted zone with the specified VPC.
     *
     * The private hosted zone contains a record set for the default public DNS name for the service
     * for the Region (for example, `kinesis.us-east-1.amazonaws.com` ), which resolves to the private
     * IP addresses of the endpoint network interfaces in the VPC. This enables you to make requests to
     * the default public DNS name for the service instead of the public DNS names that are
     * automatically generated by the VPC endpoint service.
     *
     * To use a private hosted zone, you must set the following VPC attributes to `true` :
     * `enableDnsHostnames` and `enableDnsSupport` .
     *
     * This property is supported only for interface endpoints.
     *
     * Default: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-privatednsenabled)
     * @param privateDnsEnabled Indicate whether to associate a private hosted zone with the
     * specified VPC. 
     */
    override fun privateDnsEnabled(privateDnsEnabled: IResolvable) {
      cdkBuilder.privateDnsEnabled(privateDnsEnabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Amazon Resource Name (ARN) of the resource configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-resourceconfigurationarn)
     * @param resourceConfigurationArn The Amazon Resource Name (ARN) of the resource configuration.
     * 
     */
    override fun resourceConfigurationArn(resourceConfigurationArn: String) {
      cdkBuilder.resourceConfigurationArn(resourceConfigurationArn)
    }

    /**
     * The IDs of the route tables.
     *
     * Routing is supported only for gateway endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids)
     * @param routeTableIds The IDs of the route tables. 
     */
    override fun routeTableIds(routeTableIds: List<String>) {
      cdkBuilder.routeTableIds(routeTableIds)
    }

    /**
     * The IDs of the route tables.
     *
     * Routing is supported only for gateway endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-routetableids)
     * @param routeTableIds The IDs of the route tables. 
     */
    override fun routeTableIds(vararg routeTableIds: String): Unit =
        routeTableIds(routeTableIds.toList())

    /**
     * The IDs of the security groups to associate with the endpoint network interfaces.
     *
     * If this parameter is not specified, we use the default security group for the VPC. Security
     * groups are supported only for interface endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids)
     * @param securityGroupIds The IDs of the security groups to associate with the endpoint network
     * interfaces. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The IDs of the security groups to associate with the endpoint network interfaces.
     *
     * If this parameter is not specified, we use the default security group for the VPC. Security
     * groups are supported only for interface endpoints.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-securitygroupids)
     * @param securityGroupIds The IDs of the security groups to associate with the endpoint network
     * interfaces. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * The name of the endpoint service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicename)
     * @param serviceName The name of the endpoint service. 
     */
    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    /**
     * The Amazon Resource Name (ARN) of the service network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-servicenetworkarn)
     * @param serviceNetworkArn The Amazon Resource Name (ARN) of the service network. 
     */
    override fun serviceNetworkArn(serviceNetworkArn: String) {
      cdkBuilder.serviceNetworkArn(serviceNetworkArn)
    }

    /**
     * Describes a Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-serviceregion)
     * @param serviceRegion Describes a Region. 
     */
    override fun serviceRegion(serviceRegion: String) {
      cdkBuilder.serviceRegion(serviceRegion)
    }

    /**
     * The IDs of the subnets in which to create endpoint network interfaces.
     *
     * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
     * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint,
     * you can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids)
     * @param subnetIds The IDs of the subnets in which to create endpoint network interfaces. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * The IDs of the subnets in which to create endpoint network interfaces.
     *
     * You must specify this property for an interface endpoint or a Gateway Load Balancer endpoint.
     * You can't specify this property for a gateway endpoint. For a Gateway Load Balancer endpoint,
     * you can specify only one subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-subnetids)
     * @param subnetIds The IDs of the subnets in which to create endpoint network interfaces. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * The tags to associate with the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-tags)
     * @param tags The tags to associate with the endpoint. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags to associate with the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-tags)
     * @param tags The tags to associate with the endpoint. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of endpoint.
     *
     * Default: Gateway
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcendpointtype)
     * @param vpcEndpointType The type of endpoint. 
     */
    override fun vpcEndpointType(vpcEndpointType: String) {
      cdkBuilder.vpcEndpointType(vpcEndpointType)
    }

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcendpoint.html#cfn-ec2-vpcendpoint-vpcid)
     * @param vpcId The ID of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpoint = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPCEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPCEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPCEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpoint): CfnVPCEndpoint
        = CfnVPCEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpoint): software.amazon.awscdk.services.ec2.CfnVPCEndpoint
        = wrapped.cdkObject as software.amazon.awscdk.services.ec2.CfnVPCEndpoint
  }

  /**
   * Describes the DNS options for an endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * DnsOptionsSpecificationProperty dnsOptionsSpecificationProperty =
   * DnsOptionsSpecificationProperty.builder()
   * .dnsRecordIpType("dnsRecordIpType")
   * .privateDnsOnlyForInboundResolverEndpoint("privateDnsOnlyForInboundResolverEndpoint")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpcendpoint-dnsoptionsspecification.html)
   */
  public interface DnsOptionsSpecificationProperty {
    /**
     * The DNS records created for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpcendpoint-dnsoptionsspecification.html#cfn-ec2-vpcendpoint-dnsoptionsspecification-dnsrecordiptype)
     */
    public fun dnsRecordIpType(): String? = unwrap(this).getDnsRecordIpType()

    /**
     * Indicates whether to enable private DNS only for inbound endpoints.
     *
     * This option is available only for services that support both gateway and interface endpoints.
     * It routes traffic that originates from the VPC to the gateway endpoint and traffic that
     * originates from on-premises to the interface endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpcendpoint-dnsoptionsspecification.html#cfn-ec2-vpcendpoint-dnsoptionsspecification-privatednsonlyforinboundresolverendpoint)
     */
    public fun privateDnsOnlyForInboundResolverEndpoint(): String? =
        unwrap(this).getPrivateDnsOnlyForInboundResolverEndpoint()

    /**
     * A builder for [DnsOptionsSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dnsRecordIpType The DNS records created for the endpoint.
       */
      public fun dnsRecordIpType(dnsRecordIpType: String)

      /**
       * @param privateDnsOnlyForInboundResolverEndpoint Indicates whether to enable private DNS
       * only for inbound endpoints.
       * This option is available only for services that support both gateway and interface
       * endpoints. It routes traffic that originates from the VPC to the gateway endpoint and traffic
       * that originates from on-premises to the interface endpoint.
       */
      public
          fun privateDnsOnlyForInboundResolverEndpoint(privateDnsOnlyForInboundResolverEndpoint: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVPCEndpoint.DnsOptionsSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVPCEndpoint.DnsOptionsSpecificationProperty.builder()

      /**
       * @param dnsRecordIpType The DNS records created for the endpoint.
       */
      override fun dnsRecordIpType(dnsRecordIpType: String) {
        cdkBuilder.dnsRecordIpType(dnsRecordIpType)
      }

      /**
       * @param privateDnsOnlyForInboundResolverEndpoint Indicates whether to enable private DNS
       * only for inbound endpoints.
       * This option is available only for services that support both gateway and interface
       * endpoints. It routes traffic that originates from the VPC to the gateway endpoint and traffic
       * that originates from on-premises to the interface endpoint.
       */
      override
          fun privateDnsOnlyForInboundResolverEndpoint(privateDnsOnlyForInboundResolverEndpoint: String) {
        cdkBuilder.privateDnsOnlyForInboundResolverEndpoint(privateDnsOnlyForInboundResolverEndpoint)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVPCEndpoint.DnsOptionsSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpoint.DnsOptionsSpecificationProperty,
    ) : CdkObject(cdkObject),
        DnsOptionsSpecificationProperty {
      /**
       * The DNS records created for the endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpcendpoint-dnsoptionsspecification.html#cfn-ec2-vpcendpoint-dnsoptionsspecification-dnsrecordiptype)
       */
      override fun dnsRecordIpType(): String? = unwrap(this).getDnsRecordIpType()

      /**
       * Indicates whether to enable private DNS only for inbound endpoints.
       *
       * This option is available only for services that support both gateway and interface
       * endpoints. It routes traffic that originates from the VPC to the gateway endpoint and traffic
       * that originates from on-premises to the interface endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-vpcendpoint-dnsoptionsspecification.html#cfn-ec2-vpcendpoint-dnsoptionsspecification-privatednsonlyforinboundresolverendpoint)
       */
      override fun privateDnsOnlyForInboundResolverEndpoint(): String? =
          unwrap(this).getPrivateDnsOnlyForInboundResolverEndpoint()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DnsOptionsSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpoint.DnsOptionsSpecificationProperty):
          DnsOptionsSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DnsOptionsSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DnsOptionsSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnVPCEndpoint.DnsOptionsSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnVPCEndpoint.DnsOptionsSpecificationProperty
    }
  }
}
