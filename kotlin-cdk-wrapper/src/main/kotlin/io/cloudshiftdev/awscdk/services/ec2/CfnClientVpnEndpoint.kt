@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a Client VPN endpoint.
 *
 * A Client VPN endpoint is the resource you create and configure to enable and manage client VPN
 * sessions. It is the destination endpoint at which all client VPN sessions are terminated.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnClientVpnEndpoint cfnClientVpnEndpoint = CfnClientVpnEndpoint.Builder.create(this,
 * "MyCfnClientVpnEndpoint")
 * .authenticationOptions(List.of(ClientAuthenticationRequestProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .activeDirectory(DirectoryServiceAuthenticationRequestProperty.builder()
 * .directoryId("directoryId")
 * .build())
 * .federatedAuthentication(FederatedAuthenticationRequestProperty.builder()
 * .samlProviderArn("samlProviderArn")
 * // the properties below are optional
 * .selfServiceSamlProviderArn("selfServiceSamlProviderArn")
 * .build())
 * .mutualAuthentication(CertificateAuthenticationRequestProperty.builder()
 * .clientRootCertificateChainArn("clientRootCertificateChainArn")
 * .build())
 * .build()))
 * .clientCidrBlock("clientCidrBlock")
 * .connectionLogOptions(ConnectionLogOptionsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .cloudwatchLogGroup("cloudwatchLogGroup")
 * .cloudwatchLogStream("cloudwatchLogStream")
 * .build())
 * .serverCertificateArn("serverCertificateArn")
 * // the properties below are optional
 * .clientConnectOptions(ClientConnectOptionsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .lambdaFunctionArn("lambdaFunctionArn")
 * .build())
 * .clientLoginBannerOptions(ClientLoginBannerOptionsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .bannerText("bannerText")
 * .build())
 * .description("description")
 * .dnsServers(List.of("dnsServers"))
 * .securityGroupIds(List.of("securityGroupIds"))
 * .selfServicePortal("selfServicePortal")
 * .sessionTimeoutHours(123)
 * .splitTunnel(false)
 * .tagSpecifications(List.of(TagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .transportProtocol("transportProtocol")
 * .vpcId("vpcId")
 * .vpnPort(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html)
 */
public open class CfnClientVpnEndpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Information about the authentication method to be used to authenticate clients.
   */
  public open fun authenticationOptions(): Any = unwrap(this).getAuthenticationOptions()

  /**
   * Information about the authentication method to be used to authenticate clients.
   */
  public open fun authenticationOptions(`value`: IResolvable) {
    unwrap(this).setAuthenticationOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the authentication method to be used to authenticate clients.
   */
  public open fun authenticationOptions(_idx_ac66f0: List<Any>) {
    unwrap(this).setAuthenticationOptions(_idx_ac66f0)
  }

  /**
   * Information about the authentication method to be used to authenticate clients.
   */
  public open fun authenticationOptions(vararg _idx_ac66f0: Any): Unit =
      authenticationOptions(_idx_ac66f0.toList())

  /**
   * The IPv4 address range, in CIDR notation, from which to assign client IP addresses.
   */
  public open fun clientCidrBlock(): String = unwrap(this).getClientCidrBlock()

  /**
   * The IPv4 address range, in CIDR notation, from which to assign client IP addresses.
   */
  public open fun clientCidrBlock(`value`: String) {
    unwrap(this).setClientCidrBlock(`value`)
  }

  /**
   * The options for managing connection authorization for new client connections.
   */
  public open fun clientConnectOptions(): Any? = unwrap(this).getClientConnectOptions()

  /**
   * The options for managing connection authorization for new client connections.
   */
  public open fun clientConnectOptions(`value`: IResolvable) {
    unwrap(this).setClientConnectOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The options for managing connection authorization for new client connections.
   */
  public open fun clientConnectOptions(`value`: ClientConnectOptionsProperty) {
    unwrap(this).setClientConnectOptions(`value`.let(ClientConnectOptionsProperty::unwrap))
  }

  /**
   * The options for managing connection authorization for new client connections.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0745a1c3c52929bdf02a00c1db8a940a4ee824afcaae877649561695debf6833")
  public open fun clientConnectOptions(`value`: ClientConnectOptionsProperty.Builder.() -> Unit):
      Unit = clientConnectOptions(ClientConnectOptionsProperty(`value`))

  /**
   * Options for enabling a customizable text banner that will be displayed on AWS provided clients
   * when a VPN session is established.
   */
  public open fun clientLoginBannerOptions(): Any? = unwrap(this).getClientLoginBannerOptions()

  /**
   * Options for enabling a customizable text banner that will be displayed on AWS provided clients
   * when a VPN session is established.
   */
  public open fun clientLoginBannerOptions(`value`: IResolvable) {
    unwrap(this).setClientLoginBannerOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Options for enabling a customizable text banner that will be displayed on AWS provided clients
   * when a VPN session is established.
   */
  public open fun clientLoginBannerOptions(`value`: ClientLoginBannerOptionsProperty) {
    unwrap(this).setClientLoginBannerOptions(`value`.let(ClientLoginBannerOptionsProperty::unwrap))
  }

  /**
   * Options for enabling a customizable text banner that will be displayed on AWS provided clients
   * when a VPN session is established.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7f1a586371220e8b9ff05493cc3ebecc4398729292fc1fd0f1d3d0592118f84a")
  public open
      fun clientLoginBannerOptions(`value`: ClientLoginBannerOptionsProperty.Builder.() -> Unit):
      Unit = clientLoginBannerOptions(ClientLoginBannerOptionsProperty(`value`))

  /**
   * Information about the client connection logging options.
   */
  public open fun connectionLogOptions(): Any = unwrap(this).getConnectionLogOptions()

  /**
   * Information about the client connection logging options.
   */
  public open fun connectionLogOptions(`value`: IResolvable) {
    unwrap(this).setConnectionLogOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about the client connection logging options.
   */
  public open fun connectionLogOptions(`value`: ConnectionLogOptionsProperty) {
    unwrap(this).setConnectionLogOptions(`value`.let(ConnectionLogOptionsProperty::unwrap))
  }

  /**
   * Information about the client connection logging options.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7e6cd303ee6987710eb061d1563131e3ffb01bc08518eb525a8c77c1fc7603f9")
  public open fun connectionLogOptions(`value`: ConnectionLogOptionsProperty.Builder.() -> Unit):
      Unit = connectionLogOptions(ConnectionLogOptionsProperty(`value`))

  /**
   * A brief description of the Client VPN endpoint.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A brief description of the Client VPN endpoint.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Information about the DNS servers to be used for DNS resolution.
   */
  public open fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

  /**
   * Information about the DNS servers to be used for DNS resolution.
   */
  public open fun dnsServers(`value`: List<String>) {
    unwrap(this).setDnsServers(`value`)
  }

  /**
   * Information about the DNS servers to be used for DNS resolution.
   */
  public open fun dnsServers(vararg `value`: String): Unit = dnsServers(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IDs of one or more security groups to apply to the target network.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * The IDs of one or more security groups to apply to the target network.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The IDs of one or more security groups to apply to the target network.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * Specify whether to enable the self-service portal for the Client VPN endpoint.
   */
  public open fun selfServicePortal(): String? = unwrap(this).getSelfServicePortal()

  /**
   * Specify whether to enable the self-service portal for the Client VPN endpoint.
   */
  public open fun selfServicePortal(`value`: String) {
    unwrap(this).setSelfServicePortal(`value`)
  }

  /**
   * The ARN of the server certificate.
   */
  public open fun serverCertificateArn(): String = unwrap(this).getServerCertificateArn()

  /**
   * The ARN of the server certificate.
   */
  public open fun serverCertificateArn(`value`: String) {
    unwrap(this).setServerCertificateArn(`value`)
  }

  /**
   * The maximum VPN session duration time in hours.
   */
  public open fun sessionTimeoutHours(): Number? = unwrap(this).getSessionTimeoutHours()

  /**
   * The maximum VPN session duration time in hours.
   */
  public open fun sessionTimeoutHours(`value`: Number) {
    unwrap(this).setSessionTimeoutHours(`value`)
  }

  /**
   * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
   */
  public open fun splitTunnel(): Any? = unwrap(this).getSplitTunnel()

  /**
   * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
   */
  public open fun splitTunnel(`value`: Boolean) {
    unwrap(this).setSplitTunnel(`value`)
  }

  /**
   * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
   */
  public open fun splitTunnel(`value`: IResolvable) {
    unwrap(this).setSplitTunnel(`value`.let(IResolvable::unwrap))
  }

  /**
   * The tags to apply to the Client VPN endpoint during creation.
   */
  public open fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  /**
   * The tags to apply to the Client VPN endpoint during creation.
   */
  public open fun tagSpecifications(`value`: IResolvable) {
    unwrap(this).setTagSpecifications(`value`.let(IResolvable::unwrap))
  }

  /**
   * The tags to apply to the Client VPN endpoint during creation.
   */
  public open fun tagSpecifications(_idx_ac66f0: List<Any>) {
    unwrap(this).setTagSpecifications(_idx_ac66f0)
  }

  /**
   * The tags to apply to the Client VPN endpoint during creation.
   */
  public open fun tagSpecifications(vararg _idx_ac66f0: Any): Unit =
      tagSpecifications(_idx_ac66f0.toList())

  /**
   * The transport protocol to be used by the VPN session.
   */
  public open fun transportProtocol(): String? = unwrap(this).getTransportProtocol()

  /**
   * The transport protocol to be used by the VPN session.
   */
  public open fun transportProtocol(`value`: String) {
    unwrap(this).setTransportProtocol(`value`)
  }

  /**
   * The ID of the VPC to associate with the Client VPN endpoint.
   */
  public open fun vpcId(): String? = unwrap(this).getVpcId()

  /**
   * The ID of the VPC to associate with the Client VPN endpoint.
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
   */
  public open fun vpnPort(): Number? = unwrap(this).getVpnPort()

  /**
   * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
   */
  public open fun vpnPort(`value`: Number) {
    unwrap(this).setVpnPort(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnClientVpnEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Information about the authentication method to be used to authenticate clients.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-authenticationoptions)
     * @param authenticationOptions Information about the authentication method to be used to
     * authenticate clients. 
     */
    public fun authenticationOptions(authenticationOptions: IResolvable)

    /**
     * Information about the authentication method to be used to authenticate clients.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-authenticationoptions)
     * @param authenticationOptions Information about the authentication method to be used to
     * authenticate clients. 
     */
    public fun authenticationOptions(authenticationOptions: List<Any>)

    /**
     * Information about the authentication method to be used to authenticate clients.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-authenticationoptions)
     * @param authenticationOptions Information about the authentication method to be used to
     * authenticate clients. 
     */
    public fun authenticationOptions(vararg authenticationOptions: Any)

    /**
     * The IPv4 address range, in CIDR notation, from which to assign client IP addresses.
     *
     * The address range cannot overlap with the local CIDR of the VPC in which the associated
     * subnet is located, or the routes that you add manually. The address range cannot be changed
     * after the Client VPN endpoint has been created. Client CIDR range must have a size of at least
     * /22 and must not be greater than /12.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientcidrblock)
     * @param clientCidrBlock The IPv4 address range, in CIDR notation, from which to assign client
     * IP addresses. 
     */
    public fun clientCidrBlock(clientCidrBlock: String)

    /**
     * The options for managing connection authorization for new client connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientconnectoptions)
     * @param clientConnectOptions The options for managing connection authorization for new client
     * connections. 
     */
    public fun clientConnectOptions(clientConnectOptions: IResolvable)

    /**
     * The options for managing connection authorization for new client connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientconnectoptions)
     * @param clientConnectOptions The options for managing connection authorization for new client
     * connections. 
     */
    public fun clientConnectOptions(clientConnectOptions: ClientConnectOptionsProperty)

    /**
     * The options for managing connection authorization for new client connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientconnectoptions)
     * @param clientConnectOptions The options for managing connection authorization for new client
     * connections. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecfde4af8328f55323d65ff362c60188b5d32150fa7bbfd0f4905659fd43abef")
    public
        fun clientConnectOptions(clientConnectOptions: ClientConnectOptionsProperty.Builder.() -> Unit)

    /**
     * Options for enabling a customizable text banner that will be displayed on AWS provided
     * clients when a VPN session is established.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientloginbanneroptions)
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be
     * displayed on AWS provided clients when a VPN session is established. 
     */
    public fun clientLoginBannerOptions(clientLoginBannerOptions: IResolvable)

    /**
     * Options for enabling a customizable text banner that will be displayed on AWS provided
     * clients when a VPN session is established.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientloginbanneroptions)
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be
     * displayed on AWS provided clients when a VPN session is established. 
     */
    public fun clientLoginBannerOptions(clientLoginBannerOptions: ClientLoginBannerOptionsProperty)

    /**
     * Options for enabling a customizable text banner that will be displayed on AWS provided
     * clients when a VPN session is established.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientloginbanneroptions)
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be
     * displayed on AWS provided clients when a VPN session is established. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("534c8cf6787e1c7734bb9a74c718957c9d027686609d72d3f6a593936263da6c")
    public
        fun clientLoginBannerOptions(clientLoginBannerOptions: ClientLoginBannerOptionsProperty.Builder.() -> Unit)

    /**
     * Information about the client connection logging options.
     *
     * If you enable client connection logging, data about client connections is sent to a
     * Cloudwatch Logs log stream. The following information is logged:
     *
     * * Client connection requests
     * * Client connection results (successful and unsuccessful)
     * * Reasons for unsuccessful client connection requests
     * * Client connection termination time
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-connectionlogoptions)
     * @param connectionLogOptions Information about the client connection logging options. 
     */
    public fun connectionLogOptions(connectionLogOptions: IResolvable)

    /**
     * Information about the client connection logging options.
     *
     * If you enable client connection logging, data about client connections is sent to a
     * Cloudwatch Logs log stream. The following information is logged:
     *
     * * Client connection requests
     * * Client connection results (successful and unsuccessful)
     * * Reasons for unsuccessful client connection requests
     * * Client connection termination time
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-connectionlogoptions)
     * @param connectionLogOptions Information about the client connection logging options. 
     */
    public fun connectionLogOptions(connectionLogOptions: ConnectionLogOptionsProperty)

    /**
     * Information about the client connection logging options.
     *
     * If you enable client connection logging, data about client connections is sent to a
     * Cloudwatch Logs log stream. The following information is logged:
     *
     * * Client connection requests
     * * Client connection results (successful and unsuccessful)
     * * Reasons for unsuccessful client connection requests
     * * Client connection termination time
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-connectionlogoptions)
     * @param connectionLogOptions Information about the client connection logging options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7982c3c0c85a9d1ddd3761028b13917e59c123fedc5465ce42490e50a08f2661")
    public
        fun connectionLogOptions(connectionLogOptions: ConnectionLogOptionsProperty.Builder.() -> Unit)

    /**
     * A brief description of the Client VPN endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-description)
     * @param description A brief description of the Client VPN endpoint. 
     */
    public fun description(description: String)

    /**
     * Information about the DNS servers to be used for DNS resolution.
     *
     * A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS
     * address configured on the device is used for the DNS server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-dnsservers)
     * @param dnsServers Information about the DNS servers to be used for DNS resolution. 
     */
    public fun dnsServers(dnsServers: List<String>)

    /**
     * Information about the DNS servers to be used for DNS resolution.
     *
     * A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS
     * address configured on the device is used for the DNS server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-dnsservers)
     * @param dnsServers Information about the DNS servers to be used for DNS resolution. 
     */
    public fun dnsServers(vararg dnsServers: String)

    /**
     * The IDs of one or more security groups to apply to the target network.
     *
     * You must also specify the ID of the VPC that contains the security groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-securitygroupids)
     * @param securityGroupIds The IDs of one or more security groups to apply to the target
     * network. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The IDs of one or more security groups to apply to the target network.
     *
     * You must also specify the ID of the VPC that contains the security groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-securitygroupids)
     * @param securityGroupIds The IDs of one or more security groups to apply to the target
     * network. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * Specify whether to enable the self-service portal for the Client VPN endpoint.
     *
     * Default Value: `enabled`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-selfserviceportal)
     * @param selfServicePortal Specify whether to enable the self-service portal for the Client VPN
     * endpoint. 
     */
    public fun selfServicePortal(selfServicePortal: String)

    /**
     * The ARN of the server certificate.
     *
     * For more information, see the [AWS Certificate Manager User
     * Guide](https://docs.aws.amazon.com/acm/latest/userguide/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-servercertificatearn)
     * @param serverCertificateArn The ARN of the server certificate. 
     */
    public fun serverCertificateArn(serverCertificateArn: String)

    /**
     * The maximum VPN session duration time in hours.
     *
     * Valid values: `8 | 10 | 12 | 24`
     *
     * Default value: `24`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-sessiontimeouthours)
     * @param sessionTimeoutHours The maximum VPN session duration time in hours. 
     */
    public fun sessionTimeoutHours(sessionTimeoutHours: Number)

    /**
     * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     *
     * By default, split-tunnel on a VPN endpoint is disabled.
     *
     * For information about split-tunnel VPN endpoints, see [Split-tunnel AWS Client VPN
     * endpoint](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html) in the
     * *AWS Client VPN Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-splittunnel)
     * @param splitTunnel Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint. 
     */
    public fun splitTunnel(splitTunnel: Boolean)

    /**
     * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     *
     * By default, split-tunnel on a VPN endpoint is disabled.
     *
     * For information about split-tunnel VPN endpoints, see [Split-tunnel AWS Client VPN
     * endpoint](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html) in the
     * *AWS Client VPN Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-splittunnel)
     * @param splitTunnel Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint. 
     */
    public fun splitTunnel(splitTunnel: IResolvable)

    /**
     * The tags to apply to the Client VPN endpoint during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-tagspecifications)
     * @param tagSpecifications The tags to apply to the Client VPN endpoint during creation. 
     */
    public fun tagSpecifications(tagSpecifications: IResolvable)

    /**
     * The tags to apply to the Client VPN endpoint during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-tagspecifications)
     * @param tagSpecifications The tags to apply to the Client VPN endpoint during creation. 
     */
    public fun tagSpecifications(tagSpecifications: List<Any>)

    /**
     * The tags to apply to the Client VPN endpoint during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-tagspecifications)
     * @param tagSpecifications The tags to apply to the Client VPN endpoint during creation. 
     */
    public fun tagSpecifications(vararg tagSpecifications: Any)

    /**
     * The transport protocol to be used by the VPN session.
     *
     * Default value: `udp`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-transportprotocol)
     * @param transportProtocol The transport protocol to be used by the VPN session. 
     */
    public fun transportProtocol(transportProtocol: String)

    /**
     * The ID of the VPC to associate with the Client VPN endpoint.
     *
     * If no security group IDs are specified in the request, the default security group for the VPC
     * is applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-vpcid)
     * @param vpcId The ID of the VPC to associate with the Client VPN endpoint. 
     */
    public fun vpcId(vpcId: String)

    /**
     * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     *
     * Valid Values: `443` | `1194`
     *
     * Default Value: `443`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-vpnport)
     * @param vpnPort The port number to assign to the Client VPN endpoint for TCP and UDP traffic. 
     */
    public fun vpnPort(vpnPort: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.Builder.create(scope, id)

    /**
     * Information about the authentication method to be used to authenticate clients.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-authenticationoptions)
     * @param authenticationOptions Information about the authentication method to be used to
     * authenticate clients. 
     */
    override fun authenticationOptions(authenticationOptions: IResolvable) {
      cdkBuilder.authenticationOptions(authenticationOptions.let(IResolvable::unwrap))
    }

    /**
     * Information about the authentication method to be used to authenticate clients.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-authenticationoptions)
     * @param authenticationOptions Information about the authentication method to be used to
     * authenticate clients. 
     */
    override fun authenticationOptions(authenticationOptions: List<Any>) {
      cdkBuilder.authenticationOptions(authenticationOptions)
    }

    /**
     * Information about the authentication method to be used to authenticate clients.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-authenticationoptions)
     * @param authenticationOptions Information about the authentication method to be used to
     * authenticate clients. 
     */
    override fun authenticationOptions(vararg authenticationOptions: Any): Unit =
        authenticationOptions(authenticationOptions.toList())

    /**
     * The IPv4 address range, in CIDR notation, from which to assign client IP addresses.
     *
     * The address range cannot overlap with the local CIDR of the VPC in which the associated
     * subnet is located, or the routes that you add manually. The address range cannot be changed
     * after the Client VPN endpoint has been created. Client CIDR range must have a size of at least
     * /22 and must not be greater than /12.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientcidrblock)
     * @param clientCidrBlock The IPv4 address range, in CIDR notation, from which to assign client
     * IP addresses. 
     */
    override fun clientCidrBlock(clientCidrBlock: String) {
      cdkBuilder.clientCidrBlock(clientCidrBlock)
    }

    /**
     * The options for managing connection authorization for new client connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientconnectoptions)
     * @param clientConnectOptions The options for managing connection authorization for new client
     * connections. 
     */
    override fun clientConnectOptions(clientConnectOptions: IResolvable) {
      cdkBuilder.clientConnectOptions(clientConnectOptions.let(IResolvable::unwrap))
    }

    /**
     * The options for managing connection authorization for new client connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientconnectoptions)
     * @param clientConnectOptions The options for managing connection authorization for new client
     * connections. 
     */
    override fun clientConnectOptions(clientConnectOptions: ClientConnectOptionsProperty) {
      cdkBuilder.clientConnectOptions(clientConnectOptions.let(ClientConnectOptionsProperty::unwrap))
    }

    /**
     * The options for managing connection authorization for new client connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientconnectoptions)
     * @param clientConnectOptions The options for managing connection authorization for new client
     * connections. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecfde4af8328f55323d65ff362c60188b5d32150fa7bbfd0f4905659fd43abef")
    override
        fun clientConnectOptions(clientConnectOptions: ClientConnectOptionsProperty.Builder.() -> Unit):
        Unit = clientConnectOptions(ClientConnectOptionsProperty(clientConnectOptions))

    /**
     * Options for enabling a customizable text banner that will be displayed on AWS provided
     * clients when a VPN session is established.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientloginbanneroptions)
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be
     * displayed on AWS provided clients when a VPN session is established. 
     */
    override fun clientLoginBannerOptions(clientLoginBannerOptions: IResolvable) {
      cdkBuilder.clientLoginBannerOptions(clientLoginBannerOptions.let(IResolvable::unwrap))
    }

    /**
     * Options for enabling a customizable text banner that will be displayed on AWS provided
     * clients when a VPN session is established.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientloginbanneroptions)
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be
     * displayed on AWS provided clients when a VPN session is established. 
     */
    override
        fun clientLoginBannerOptions(clientLoginBannerOptions: ClientLoginBannerOptionsProperty) {
      cdkBuilder.clientLoginBannerOptions(clientLoginBannerOptions.let(ClientLoginBannerOptionsProperty::unwrap))
    }

    /**
     * Options for enabling a customizable text banner that will be displayed on AWS provided
     * clients when a VPN session is established.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-clientloginbanneroptions)
     * @param clientLoginBannerOptions Options for enabling a customizable text banner that will be
     * displayed on AWS provided clients when a VPN session is established. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("534c8cf6787e1c7734bb9a74c718957c9d027686609d72d3f6a593936263da6c")
    override
        fun clientLoginBannerOptions(clientLoginBannerOptions: ClientLoginBannerOptionsProperty.Builder.() -> Unit):
        Unit = clientLoginBannerOptions(ClientLoginBannerOptionsProperty(clientLoginBannerOptions))

    /**
     * Information about the client connection logging options.
     *
     * If you enable client connection logging, data about client connections is sent to a
     * Cloudwatch Logs log stream. The following information is logged:
     *
     * * Client connection requests
     * * Client connection results (successful and unsuccessful)
     * * Reasons for unsuccessful client connection requests
     * * Client connection termination time
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-connectionlogoptions)
     * @param connectionLogOptions Information about the client connection logging options. 
     */
    override fun connectionLogOptions(connectionLogOptions: IResolvable) {
      cdkBuilder.connectionLogOptions(connectionLogOptions.let(IResolvable::unwrap))
    }

    /**
     * Information about the client connection logging options.
     *
     * If you enable client connection logging, data about client connections is sent to a
     * Cloudwatch Logs log stream. The following information is logged:
     *
     * * Client connection requests
     * * Client connection results (successful and unsuccessful)
     * * Reasons for unsuccessful client connection requests
     * * Client connection termination time
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-connectionlogoptions)
     * @param connectionLogOptions Information about the client connection logging options. 
     */
    override fun connectionLogOptions(connectionLogOptions: ConnectionLogOptionsProperty) {
      cdkBuilder.connectionLogOptions(connectionLogOptions.let(ConnectionLogOptionsProperty::unwrap))
    }

    /**
     * Information about the client connection logging options.
     *
     * If you enable client connection logging, data about client connections is sent to a
     * Cloudwatch Logs log stream. The following information is logged:
     *
     * * Client connection requests
     * * Client connection results (successful and unsuccessful)
     * * Reasons for unsuccessful client connection requests
     * * Client connection termination time
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-connectionlogoptions)
     * @param connectionLogOptions Information about the client connection logging options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7982c3c0c85a9d1ddd3761028b13917e59c123fedc5465ce42490e50a08f2661")
    override
        fun connectionLogOptions(connectionLogOptions: ConnectionLogOptionsProperty.Builder.() -> Unit):
        Unit = connectionLogOptions(ConnectionLogOptionsProperty(connectionLogOptions))

    /**
     * A brief description of the Client VPN endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-description)
     * @param description A brief description of the Client VPN endpoint. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Information about the DNS servers to be used for DNS resolution.
     *
     * A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS
     * address configured on the device is used for the DNS server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-dnsservers)
     * @param dnsServers Information about the DNS servers to be used for DNS resolution. 
     */
    override fun dnsServers(dnsServers: List<String>) {
      cdkBuilder.dnsServers(dnsServers)
    }

    /**
     * Information about the DNS servers to be used for DNS resolution.
     *
     * A Client VPN endpoint can have up to two DNS servers. If no DNS server is specified, the DNS
     * address configured on the device is used for the DNS server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-dnsservers)
     * @param dnsServers Information about the DNS servers to be used for DNS resolution. 
     */
    override fun dnsServers(vararg dnsServers: String): Unit = dnsServers(dnsServers.toList())

    /**
     * The IDs of one or more security groups to apply to the target network.
     *
     * You must also specify the ID of the VPC that contains the security groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-securitygroupids)
     * @param securityGroupIds The IDs of one or more security groups to apply to the target
     * network. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The IDs of one or more security groups to apply to the target network.
     *
     * You must also specify the ID of the VPC that contains the security groups.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-securitygroupids)
     * @param securityGroupIds The IDs of one or more security groups to apply to the target
     * network. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * Specify whether to enable the self-service portal for the Client VPN endpoint.
     *
     * Default Value: `enabled`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-selfserviceportal)
     * @param selfServicePortal Specify whether to enable the self-service portal for the Client VPN
     * endpoint. 
     */
    override fun selfServicePortal(selfServicePortal: String) {
      cdkBuilder.selfServicePortal(selfServicePortal)
    }

    /**
     * The ARN of the server certificate.
     *
     * For more information, see the [AWS Certificate Manager User
     * Guide](https://docs.aws.amazon.com/acm/latest/userguide/) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-servercertificatearn)
     * @param serverCertificateArn The ARN of the server certificate. 
     */
    override fun serverCertificateArn(serverCertificateArn: String) {
      cdkBuilder.serverCertificateArn(serverCertificateArn)
    }

    /**
     * The maximum VPN session duration time in hours.
     *
     * Valid values: `8 | 10 | 12 | 24`
     *
     * Default value: `24`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-sessiontimeouthours)
     * @param sessionTimeoutHours The maximum VPN session duration time in hours. 
     */
    override fun sessionTimeoutHours(sessionTimeoutHours: Number) {
      cdkBuilder.sessionTimeoutHours(sessionTimeoutHours)
    }

    /**
     * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     *
     * By default, split-tunnel on a VPN endpoint is disabled.
     *
     * For information about split-tunnel VPN endpoints, see [Split-tunnel AWS Client VPN
     * endpoint](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html) in the
     * *AWS Client VPN Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-splittunnel)
     * @param splitTunnel Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint. 
     */
    override fun splitTunnel(splitTunnel: Boolean) {
      cdkBuilder.splitTunnel(splitTunnel)
    }

    /**
     * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     *
     * By default, split-tunnel on a VPN endpoint is disabled.
     *
     * For information about split-tunnel VPN endpoints, see [Split-tunnel AWS Client VPN
     * endpoint](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html) in the
     * *AWS Client VPN Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-splittunnel)
     * @param splitTunnel Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint. 
     */
    override fun splitTunnel(splitTunnel: IResolvable) {
      cdkBuilder.splitTunnel(splitTunnel.let(IResolvable::unwrap))
    }

    /**
     * The tags to apply to the Client VPN endpoint during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-tagspecifications)
     * @param tagSpecifications The tags to apply to the Client VPN endpoint during creation. 
     */
    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
    }

    /**
     * The tags to apply to the Client VPN endpoint during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-tagspecifications)
     * @param tagSpecifications The tags to apply to the Client VPN endpoint during creation. 
     */
    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications)
    }

    /**
     * The tags to apply to the Client VPN endpoint during creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-tagspecifications)
     * @param tagSpecifications The tags to apply to the Client VPN endpoint during creation. 
     */
    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    /**
     * The transport protocol to be used by the VPN session.
     *
     * Default value: `udp`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-transportprotocol)
     * @param transportProtocol The transport protocol to be used by the VPN session. 
     */
    override fun transportProtocol(transportProtocol: String) {
      cdkBuilder.transportProtocol(transportProtocol)
    }

    /**
     * The ID of the VPC to associate with the Client VPN endpoint.
     *
     * If no security group IDs are specified in the request, the default security group for the VPC
     * is applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-vpcid)
     * @param vpcId The ID of the VPC to associate with the Client VPN endpoint. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    /**
     * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     *
     * Valid Values: `443` | `1194`
     *
     * Default Value: `443`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnendpoint.html#cfn-ec2-clientvpnendpoint-vpnport)
     * @param vpnPort The port number to assign to the Client VPN endpoint for TCP and UDP traffic. 
     */
    override fun vpnPort(vpnPort: Number) {
      cdkBuilder.vpnPort(vpnPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClientVpnEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClientVpnEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint):
        CfnClientVpnEndpoint = CfnClientVpnEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnClientVpnEndpoint):
        software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint = wrapped.cdkObject
  }

  /**
   * The tags to apply to a resource when the resource is being created.
   *
   * When you specify a tag, you must specify the resource type to tag, otherwise the request will
   * fail.
   *
   *
   * The `Valid Values` lists all the resource types that can be tagged. However, the action you're
   * using might not support tagging all of these resource types. If you try to tag a resource type
   * that is unsupported for the action you're using, you'll get an error.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * TagSpecificationProperty tagSpecificationProperty = TagSpecificationProperty.builder()
   * .resourceType("resourceType")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-tagspecification.html)
   */
  public interface TagSpecificationProperty {
    /**
     * The type of resource to tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-tagspecification.html#cfn-ec2-clientvpnendpoint-tagspecification-resourcetype)
     */
    public fun resourceType(): String

    /**
     * The tags to apply to the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-tagspecification.html#cfn-ec2-clientvpnendpoint-tagspecification-tags)
     */
    public fun tags(): List<CfnTag>

    /**
     * A builder for [TagSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceType The type of resource to tag. 
       */
      public fun resourceType(resourceType: String)

      /**
       * @param tags The tags to apply to the resource. 
       */
      public fun tags(tags: List<CfnTag>)

      /**
       * @param tags The tags to apply to the resource. 
       */
      public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.TagSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.TagSpecificationProperty.builder()

      /**
       * @param resourceType The type of resource to tag. 
       */
      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      /**
       * @param tags The tags to apply to the resource. 
       */
      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      /**
       * @param tags The tags to apply to the resource. 
       */
      override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.TagSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.TagSpecificationProperty,
    ) : CdkObject(cdkObject), TagSpecificationProperty {
      /**
       * The type of resource to tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-tagspecification.html#cfn-ec2-clientvpnendpoint-tagspecification-resourcetype)
       */
      override fun resourceType(): String = unwrap(this).getResourceType()

      /**
       * The tags to apply to the resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-tagspecification.html#cfn-ec2-clientvpnendpoint-tagspecification-tags)
       */
      override fun tags(): List<CfnTag> = unwrap(this).getTags().map(CfnTag::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.TagSpecificationProperty):
          TagSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.TagSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.TagSpecificationProperty
    }
  }

  /**
   * Describes the Active Directory to be used for client authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * DirectoryServiceAuthenticationRequestProperty directoryServiceAuthenticationRequestProperty =
   * DirectoryServiceAuthenticationRequestProperty.builder()
   * .directoryId("directoryId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-directoryserviceauthenticationrequest.html)
   */
  public interface DirectoryServiceAuthenticationRequestProperty {
    /**
     * The ID of the Active Directory to be used for authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-directoryserviceauthenticationrequest.html#cfn-ec2-clientvpnendpoint-directoryserviceauthenticationrequest-directoryid)
     */
    public fun directoryId(): String

    /**
     * A builder for [DirectoryServiceAuthenticationRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param directoryId The ID of the Active Directory to be used for authentication. 
       */
      public fun directoryId(directoryId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty.builder()

      /**
       * @param directoryId The ID of the Active Directory to be used for authentication. 
       */
      override fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty,
    ) : CdkObject(cdkObject), DirectoryServiceAuthenticationRequestProperty {
      /**
       * The ID of the Active Directory to be used for authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-directoryserviceauthenticationrequest.html#cfn-ec2-clientvpnendpoint-directoryserviceauthenticationrequest-directoryid)
       */
      override fun directoryId(): String = unwrap(this).getDirectoryId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DirectoryServiceAuthenticationRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty):
          DirectoryServiceAuthenticationRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DirectoryServiceAuthenticationRequestProperty):
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty
    }
  }

  /**
   * Describes the authentication method to be used by a Client VPN endpoint.
   *
   * For more information, see
   * [Authentication](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/authentication-authrization.html#client-authentication)
   * in the *AWS Client VPN Administrator Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * ClientAuthenticationRequestProperty clientAuthenticationRequestProperty =
   * ClientAuthenticationRequestProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .activeDirectory(DirectoryServiceAuthenticationRequestProperty.builder()
   * .directoryId("directoryId")
   * .build())
   * .federatedAuthentication(FederatedAuthenticationRequestProperty.builder()
   * .samlProviderArn("samlProviderArn")
   * // the properties below are optional
   * .selfServiceSamlProviderArn("selfServiceSamlProviderArn")
   * .build())
   * .mutualAuthentication(CertificateAuthenticationRequestProperty.builder()
   * .clientRootCertificateChainArn("clientRootCertificateChainArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html)
   */
  public interface ClientAuthenticationRequestProperty {
    /**
     * Information about the Active Directory to be used, if applicable.
     *
     * You must provide this information if *Type* is `directory-service-authentication` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html#cfn-ec2-clientvpnendpoint-clientauthenticationrequest-activedirectory)
     */
    public fun activeDirectory(): Any? = unwrap(this).getActiveDirectory()

    /**
     * Information about the IAM SAML identity provider, if applicable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html#cfn-ec2-clientvpnendpoint-clientauthenticationrequest-federatedauthentication)
     */
    public fun federatedAuthentication(): Any? = unwrap(this).getFederatedAuthentication()

    /**
     * Information about the authentication certificates to be used, if applicable.
     *
     * You must provide this information if *Type* is `certificate-authentication` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html#cfn-ec2-clientvpnendpoint-clientauthenticationrequest-mutualauthentication)
     */
    public fun mutualAuthentication(): Any? = unwrap(this).getMutualAuthentication()

    /**
     * The type of client authentication to be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html#cfn-ec2-clientvpnendpoint-clientauthenticationrequest-type)
     */
    public fun type(): String

    /**
     * A builder for [ClientAuthenticationRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param activeDirectory Information about the Active Directory to be used, if applicable.
       * You must provide this information if *Type* is `directory-service-authentication` .
       */
      public fun activeDirectory(activeDirectory: IResolvable)

      /**
       * @param activeDirectory Information about the Active Directory to be used, if applicable.
       * You must provide this information if *Type* is `directory-service-authentication` .
       */
      public fun activeDirectory(activeDirectory: DirectoryServiceAuthenticationRequestProperty)

      /**
       * @param activeDirectory Information about the Active Directory to be used, if applicable.
       * You must provide this information if *Type* is `directory-service-authentication` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc257b6734e4ae7777c750b840a04697dd4df6ba827ee4749b938fd48f9680de")
      public
          fun activeDirectory(activeDirectory: DirectoryServiceAuthenticationRequestProperty.Builder.() -> Unit)

      /**
       * @param federatedAuthentication Information about the IAM SAML identity provider, if
       * applicable.
       */
      public fun federatedAuthentication(federatedAuthentication: IResolvable)

      /**
       * @param federatedAuthentication Information about the IAM SAML identity provider, if
       * applicable.
       */
      public
          fun federatedAuthentication(federatedAuthentication: FederatedAuthenticationRequestProperty)

      /**
       * @param federatedAuthentication Information about the IAM SAML identity provider, if
       * applicable.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05a61c4449bef3d2027ab433b9d03ca560b38b6c44cd4fd0fa395a0f80c95452")
      public
          fun federatedAuthentication(federatedAuthentication: FederatedAuthenticationRequestProperty.Builder.() -> Unit)

      /**
       * @param mutualAuthentication Information about the authentication certificates to be used,
       * if applicable.
       * You must provide this information if *Type* is `certificate-authentication` .
       */
      public fun mutualAuthentication(mutualAuthentication: IResolvable)

      /**
       * @param mutualAuthentication Information about the authentication certificates to be used,
       * if applicable.
       * You must provide this information if *Type* is `certificate-authentication` .
       */
      public
          fun mutualAuthentication(mutualAuthentication: CertificateAuthenticationRequestProperty)

      /**
       * @param mutualAuthentication Information about the authentication certificates to be used,
       * if applicable.
       * You must provide this information if *Type* is `certificate-authentication` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79da6d6721aaa6683ffc81ed8bda33622d5a1c42e4a59c51b575db7edf2cb612")
      public
          fun mutualAuthentication(mutualAuthentication: CertificateAuthenticationRequestProperty.Builder.() -> Unit)

      /**
       * @param type The type of client authentication to be used. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientAuthenticationRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientAuthenticationRequestProperty.builder()

      /**
       * @param activeDirectory Information about the Active Directory to be used, if applicable.
       * You must provide this information if *Type* is `directory-service-authentication` .
       */
      override fun activeDirectory(activeDirectory: IResolvable) {
        cdkBuilder.activeDirectory(activeDirectory.let(IResolvable::unwrap))
      }

      /**
       * @param activeDirectory Information about the Active Directory to be used, if applicable.
       * You must provide this information if *Type* is `directory-service-authentication` .
       */
      override fun activeDirectory(activeDirectory: DirectoryServiceAuthenticationRequestProperty) {
        cdkBuilder.activeDirectory(activeDirectory.let(DirectoryServiceAuthenticationRequestProperty::unwrap))
      }

      /**
       * @param activeDirectory Information about the Active Directory to be used, if applicable.
       * You must provide this information if *Type* is `directory-service-authentication` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc257b6734e4ae7777c750b840a04697dd4df6ba827ee4749b938fd48f9680de")
      override
          fun activeDirectory(activeDirectory: DirectoryServiceAuthenticationRequestProperty.Builder.() -> Unit):
          Unit = activeDirectory(DirectoryServiceAuthenticationRequestProperty(activeDirectory))

      /**
       * @param federatedAuthentication Information about the IAM SAML identity provider, if
       * applicable.
       */
      override fun federatedAuthentication(federatedAuthentication: IResolvable) {
        cdkBuilder.federatedAuthentication(federatedAuthentication.let(IResolvable::unwrap))
      }

      /**
       * @param federatedAuthentication Information about the IAM SAML identity provider, if
       * applicable.
       */
      override
          fun federatedAuthentication(federatedAuthentication: FederatedAuthenticationRequestProperty) {
        cdkBuilder.federatedAuthentication(federatedAuthentication.let(FederatedAuthenticationRequestProperty::unwrap))
      }

      /**
       * @param federatedAuthentication Information about the IAM SAML identity provider, if
       * applicable.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05a61c4449bef3d2027ab433b9d03ca560b38b6c44cd4fd0fa395a0f80c95452")
      override
          fun federatedAuthentication(federatedAuthentication: FederatedAuthenticationRequestProperty.Builder.() -> Unit):
          Unit =
          federatedAuthentication(FederatedAuthenticationRequestProperty(federatedAuthentication))

      /**
       * @param mutualAuthentication Information about the authentication certificates to be used,
       * if applicable.
       * You must provide this information if *Type* is `certificate-authentication` .
       */
      override fun mutualAuthentication(mutualAuthentication: IResolvable) {
        cdkBuilder.mutualAuthentication(mutualAuthentication.let(IResolvable::unwrap))
      }

      /**
       * @param mutualAuthentication Information about the authentication certificates to be used,
       * if applicable.
       * You must provide this information if *Type* is `certificate-authentication` .
       */
      override
          fun mutualAuthentication(mutualAuthentication: CertificateAuthenticationRequestProperty) {
        cdkBuilder.mutualAuthentication(mutualAuthentication.let(CertificateAuthenticationRequestProperty::unwrap))
      }

      /**
       * @param mutualAuthentication Information about the authentication certificates to be used,
       * if applicable.
       * You must provide this information if *Type* is `certificate-authentication` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79da6d6721aaa6683ffc81ed8bda33622d5a1c42e4a59c51b575db7edf2cb612")
      override
          fun mutualAuthentication(mutualAuthentication: CertificateAuthenticationRequestProperty.Builder.() -> Unit):
          Unit =
          mutualAuthentication(CertificateAuthenticationRequestProperty(mutualAuthentication))

      /**
       * @param type The type of client authentication to be used. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientAuthenticationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientAuthenticationRequestProperty,
    ) : CdkObject(cdkObject), ClientAuthenticationRequestProperty {
      /**
       * Information about the Active Directory to be used, if applicable.
       *
       * You must provide this information if *Type* is `directory-service-authentication` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html#cfn-ec2-clientvpnendpoint-clientauthenticationrequest-activedirectory)
       */
      override fun activeDirectory(): Any? = unwrap(this).getActiveDirectory()

      /**
       * Information about the IAM SAML identity provider, if applicable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html#cfn-ec2-clientvpnendpoint-clientauthenticationrequest-federatedauthentication)
       */
      override fun federatedAuthentication(): Any? = unwrap(this).getFederatedAuthentication()

      /**
       * Information about the authentication certificates to be used, if applicable.
       *
       * You must provide this information if *Type* is `certificate-authentication` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html#cfn-ec2-clientvpnendpoint-clientauthenticationrequest-mutualauthentication)
       */
      override fun mutualAuthentication(): Any? = unwrap(this).getMutualAuthentication()

      /**
       * The type of client authentication to be used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientauthenticationrequest.html#cfn-ec2-clientvpnendpoint-clientauthenticationrequest-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ClientAuthenticationRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientAuthenticationRequestProperty):
          ClientAuthenticationRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientAuthenticationRequestProperty):
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientAuthenticationRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientAuthenticationRequestProperty
    }
  }

  /**
   * Options for enabling a customizable text banner that will be displayed on AWS provided clients
   * when a VPN session is established.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * ClientLoginBannerOptionsProperty clientLoginBannerOptionsProperty =
   * ClientLoginBannerOptionsProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .bannerText("bannerText")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientloginbanneroptions.html)
   */
  public interface ClientLoginBannerOptionsProperty {
    /**
     * Customizable text that will be displayed in a banner on AWS provided clients when a VPN
     * session is established.
     *
     * UTF-8 encoded characters only. Maximum of 1400 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientloginbanneroptions.html#cfn-ec2-clientvpnendpoint-clientloginbanneroptions-bannertext)
     */
    public fun bannerText(): String? = unwrap(this).getBannerText()

    /**
     * Enable or disable a customizable text banner that will be displayed on AWS provided clients
     * when a VPN session is established.
     *
     * Valid values: `true | false`
     *
     * Default value: `false`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientloginbanneroptions.html#cfn-ec2-clientvpnendpoint-clientloginbanneroptions-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [ClientLoginBannerOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bannerText Customizable text that will be displayed in a banner on AWS provided
       * clients when a VPN session is established.
       * UTF-8 encoded characters only. Maximum of 1400 characters.
       */
      public fun bannerText(bannerText: String)

      /**
       * @param enabled Enable or disable a customizable text banner that will be displayed on AWS
       * provided clients when a VPN session is established. 
       * Valid values: `true | false`
       *
       * Default value: `false`
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Enable or disable a customizable text banner that will be displayed on AWS
       * provided clients when a VPN session is established. 
       * Valid values: `true | false`
       *
       * Default value: `false`
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty.builder()

      /**
       * @param bannerText Customizable text that will be displayed in a banner on AWS provided
       * clients when a VPN session is established.
       * UTF-8 encoded characters only. Maximum of 1400 characters.
       */
      override fun bannerText(bannerText: String) {
        cdkBuilder.bannerText(bannerText)
      }

      /**
       * @param enabled Enable or disable a customizable text banner that will be displayed on AWS
       * provided clients when a VPN session is established. 
       * Valid values: `true | false`
       *
       * Default value: `false`
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Enable or disable a customizable text banner that will be displayed on AWS
       * provided clients when a VPN session is established. 
       * Valid values: `true | false`
       *
       * Default value: `false`
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty,
    ) : CdkObject(cdkObject), ClientLoginBannerOptionsProperty {
      /**
       * Customizable text that will be displayed in a banner on AWS provided clients when a VPN
       * session is established.
       *
       * UTF-8 encoded characters only. Maximum of 1400 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientloginbanneroptions.html#cfn-ec2-clientvpnendpoint-clientloginbanneroptions-bannertext)
       */
      override fun bannerText(): String? = unwrap(this).getBannerText()

      /**
       * Enable or disable a customizable text banner that will be displayed on AWS provided clients
       * when a VPN session is established.
       *
       * Valid values: `true | false`
       *
       * Default value: `false`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientloginbanneroptions.html#cfn-ec2-clientvpnendpoint-clientloginbanneroptions-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClientLoginBannerOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty):
          ClientLoginBannerOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientLoginBannerOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty
    }
  }

  /**
   * Describes the client connection logging options for the Client VPN endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * ConnectionLogOptionsProperty connectionLogOptionsProperty =
   * ConnectionLogOptionsProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .cloudwatchLogGroup("cloudwatchLogGroup")
   * .cloudwatchLogStream("cloudwatchLogStream")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html)
   */
  public interface ConnectionLogOptionsProperty {
    /**
     * The name of the CloudWatch Logs log group.
     *
     * Required if connection logging is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-cloudwatchloggroup)
     */
    public fun cloudwatchLogGroup(): String? = unwrap(this).getCloudwatchLogGroup()

    /**
     * The name of the CloudWatch Logs log stream to which the connection data is published.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-cloudwatchlogstream)
     */
    public fun cloudwatchLogStream(): String? = unwrap(this).getCloudwatchLogStream()

    /**
     * Indicates whether connection logging is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [ConnectionLogOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudwatchLogGroup The name of the CloudWatch Logs log group.
       * Required if connection logging is enabled.
       */
      public fun cloudwatchLogGroup(cloudwatchLogGroup: String)

      /**
       * @param cloudwatchLogStream The name of the CloudWatch Logs log stream to which the
       * connection data is published.
       */
      public fun cloudwatchLogStream(cloudwatchLogStream: String)

      /**
       * @param enabled Indicates whether connection logging is enabled. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether connection logging is enabled. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty.builder()

      /**
       * @param cloudwatchLogGroup The name of the CloudWatch Logs log group.
       * Required if connection logging is enabled.
       */
      override fun cloudwatchLogGroup(cloudwatchLogGroup: String) {
        cdkBuilder.cloudwatchLogGroup(cloudwatchLogGroup)
      }

      /**
       * @param cloudwatchLogStream The name of the CloudWatch Logs log stream to which the
       * connection data is published.
       */
      override fun cloudwatchLogStream(cloudwatchLogStream: String) {
        cdkBuilder.cloudwatchLogStream(cloudwatchLogStream)
      }

      /**
       * @param enabled Indicates whether connection logging is enabled. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether connection logging is enabled. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty,
    ) : CdkObject(cdkObject), ConnectionLogOptionsProperty {
      /**
       * The name of the CloudWatch Logs log group.
       *
       * Required if connection logging is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-cloudwatchloggroup)
       */
      override fun cloudwatchLogGroup(): String? = unwrap(this).getCloudwatchLogGroup()

      /**
       * The name of the CloudWatch Logs log stream to which the connection data is published.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-cloudwatchlogstream)
       */
      override fun cloudwatchLogStream(): String? = unwrap(this).getCloudwatchLogStream()

      /**
       * Indicates whether connection logging is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-connectionlogoptions.html#cfn-ec2-clientvpnendpoint-connectionlogoptions-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionLogOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty):
          ConnectionLogOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionLogOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty
    }
  }

  /**
   * The IAM SAML identity provider used for federated authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * FederatedAuthenticationRequestProperty federatedAuthenticationRequestProperty =
   * FederatedAuthenticationRequestProperty.builder()
   * .samlProviderArn("samlProviderArn")
   * // the properties below are optional
   * .selfServiceSamlProviderArn("selfServiceSamlProviderArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-federatedauthenticationrequest.html)
   */
  public interface FederatedAuthenticationRequestProperty {
    /**
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-federatedauthenticationrequest.html#cfn-ec2-clientvpnendpoint-federatedauthenticationrequest-samlproviderarn)
     */
    public fun samlProviderArn(): String

    /**
     * The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-federatedauthenticationrequest.html#cfn-ec2-clientvpnendpoint-federatedauthenticationrequest-selfservicesamlproviderarn)
     */
    public fun selfServiceSamlProviderArn(): String? = unwrap(this).getSelfServiceSamlProviderArn()

    /**
     * A builder for [FederatedAuthenticationRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param samlProviderArn The Amazon Resource Name (ARN) of the IAM SAML identity provider. 
       */
      public fun samlProviderArn(samlProviderArn: String)

      /**
       * @param selfServiceSamlProviderArn The Amazon Resource Name (ARN) of the IAM SAML identity
       * provider for the self-service portal.
       */
      public fun selfServiceSamlProviderArn(selfServiceSamlProviderArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty.builder()

      /**
       * @param samlProviderArn The Amazon Resource Name (ARN) of the IAM SAML identity provider. 
       */
      override fun samlProviderArn(samlProviderArn: String) {
        cdkBuilder.samlProviderArn(samlProviderArn)
      }

      /**
       * @param selfServiceSamlProviderArn The Amazon Resource Name (ARN) of the IAM SAML identity
       * provider for the self-service portal.
       */
      override fun selfServiceSamlProviderArn(selfServiceSamlProviderArn: String) {
        cdkBuilder.selfServiceSamlProviderArn(selfServiceSamlProviderArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty,
    ) : CdkObject(cdkObject), FederatedAuthenticationRequestProperty {
      /**
       * The Amazon Resource Name (ARN) of the IAM SAML identity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-federatedauthenticationrequest.html#cfn-ec2-clientvpnendpoint-federatedauthenticationrequest-samlproviderarn)
       */
      override fun samlProviderArn(): String = unwrap(this).getSamlProviderArn()

      /**
       * The Amazon Resource Name (ARN) of the IAM SAML identity provider for the self-service
       * portal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-federatedauthenticationrequest.html#cfn-ec2-clientvpnendpoint-federatedauthenticationrequest-selfservicesamlproviderarn)
       */
      override fun selfServiceSamlProviderArn(): String? =
          unwrap(this).getSelfServiceSamlProviderArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FederatedAuthenticationRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty):
          FederatedAuthenticationRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FederatedAuthenticationRequestProperty):
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty
    }
  }

  /**
   * Information about the client certificate to be used for authentication.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * CertificateAuthenticationRequestProperty certificateAuthenticationRequestProperty =
   * CertificateAuthenticationRequestProperty.builder()
   * .clientRootCertificateChainArn("clientRootCertificateChainArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-certificateauthenticationrequest.html)
   */
  public interface CertificateAuthenticationRequestProperty {
    /**
     * The ARN of the client certificate.
     *
     * The certificate must be signed by a certificate authority (CA) and it must be provisioned in
     * AWS Certificate Manager (ACM).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-certificateauthenticationrequest.html#cfn-ec2-clientvpnendpoint-certificateauthenticationrequest-clientrootcertificatechainarn)
     */
    public fun clientRootCertificateChainArn(): String

    /**
     * A builder for [CertificateAuthenticationRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clientRootCertificateChainArn The ARN of the client certificate. 
       * The certificate must be signed by a certificate authority (CA) and it must be provisioned
       * in AWS Certificate Manager (ACM).
       */
      public fun clientRootCertificateChainArn(clientRootCertificateChainArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty.builder()

      /**
       * @param clientRootCertificateChainArn The ARN of the client certificate. 
       * The certificate must be signed by a certificate authority (CA) and it must be provisioned
       * in AWS Certificate Manager (ACM).
       */
      override fun clientRootCertificateChainArn(clientRootCertificateChainArn: String) {
        cdkBuilder.clientRootCertificateChainArn(clientRootCertificateChainArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty,
    ) : CdkObject(cdkObject), CertificateAuthenticationRequestProperty {
      /**
       * The ARN of the client certificate.
       *
       * The certificate must be signed by a certificate authority (CA) and it must be provisioned
       * in AWS Certificate Manager (ACM).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-certificateauthenticationrequest.html#cfn-ec2-clientvpnendpoint-certificateauthenticationrequest-clientrootcertificatechainarn)
       */
      override fun clientRootCertificateChainArn(): String =
          unwrap(this).getClientRootCertificateChainArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CertificateAuthenticationRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty):
          CertificateAuthenticationRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CertificateAuthenticationRequestProperty):
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty
    }
  }

  /**
   * Indicates whether client connect options are enabled.
   *
   * The default is `false` (not enabled).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ec2.*;
   * ClientConnectOptionsProperty clientConnectOptionsProperty =
   * ClientConnectOptionsProperty.builder()
   * .enabled(false)
   * // the properties below are optional
   * .lambdaFunctionArn("lambdaFunctionArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientconnectoptions.html)
   */
  public interface ClientConnectOptionsProperty {
    /**
     * Indicates whether client connect options are enabled.
     *
     * The default is `false` (not enabled).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientconnectoptions.html#cfn-ec2-clientvpnendpoint-clientconnectoptions-enabled)
     */
    public fun enabled(): Any

    /**
     * The Amazon Resource Name (ARN) of the AWS Lambda function used for connection authorization.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientconnectoptions.html#cfn-ec2-clientvpnendpoint-clientconnectoptions-lambdafunctionarn)
     */
    public fun lambdaFunctionArn(): String? = unwrap(this).getLambdaFunctionArn()

    /**
     * A builder for [ClientConnectOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Indicates whether client connect options are enabled. 
       * The default is `false` (not enabled).
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether client connect options are enabled. 
       * The default is `false` (not enabled).
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param lambdaFunctionArn The Amazon Resource Name (ARN) of the AWS Lambda function used for
       * connection authorization.
       */
      public fun lambdaFunctionArn(lambdaFunctionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty.builder()

      /**
       * @param enabled Indicates whether client connect options are enabled. 
       * The default is `false` (not enabled).
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether client connect options are enabled. 
       * The default is `false` (not enabled).
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param lambdaFunctionArn The Amazon Resource Name (ARN) of the AWS Lambda function used for
       * connection authorization.
       */
      override fun lambdaFunctionArn(lambdaFunctionArn: String) {
        cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty,
    ) : CdkObject(cdkObject), ClientConnectOptionsProperty {
      /**
       * Indicates whether client connect options are enabled.
       *
       * The default is `false` (not enabled).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientconnectoptions.html#cfn-ec2-clientvpnendpoint-clientconnectoptions-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * The Amazon Resource Name (ARN) of the AWS Lambda function used for connection
       * authorization.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-clientvpnendpoint-clientconnectoptions.html#cfn-ec2-clientvpnendpoint-clientconnectoptions-lambdafunctionarn)
       */
      override fun lambdaFunctionArn(): String? = unwrap(this).getLambdaFunctionArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClientConnectOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty):
          ClientConnectOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientConnectOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty
    }
  }
}
