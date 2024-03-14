package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.ILogStream
import io.cloudshiftdev.constructs.IDependable
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ClientVpnEndpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnEndpoint,
) : Resource(cdkObject), IClientVpnEndpoint {
  /**
   * Adds an authorization rule to this endpoint.
   *
   * @param id 
   * @param props 
   */
  public open fun addAuthorizationRule(id: String, props: ClientVpnAuthorizationRuleOptions):
      ClientVpnAuthorizationRule = unwrap(this).addAuthorizationRule(id,
      props.let(ClientVpnAuthorizationRuleOptions::unwrap)).let(ClientVpnAuthorizationRule::wrap)

  /**
   * Adds an authorization rule to this endpoint.
   *
   * @param id 
   * @param props 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38752e44404d24debbadade9862f1d0cdc045d07ef8cbee28e436eae8868f13a")
  public open fun addAuthorizationRule(id: String,
      props: ClientVpnAuthorizationRuleOptions.Builder.() -> Unit): ClientVpnAuthorizationRule =
      addAuthorizationRule(id, ClientVpnAuthorizationRuleOptions(props))

  /**
   * Adds a route to this endpoint.
   *
   * @param id 
   * @param props 
   */
  public open fun addRoute(id: String, props: ClientVpnRouteOptions): ClientVpnRoute =
      unwrap(this).addRoute(id, props.let(ClientVpnRouteOptions::unwrap)).let(ClientVpnRoute::wrap)

  /**
   * Adds a route to this endpoint.
   *
   * @param id 
   * @param props 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d5726acf19b5bb2ad35cd4626324423cccb1440a829fe43c0ed07f28c231007")
  public open fun addRoute(id: String, props: ClientVpnRouteOptions.Builder.() -> Unit):
      ClientVpnRoute = addRoute(id, ClientVpnRouteOptions(props))

  /**
   * Allows specify security group connections for the endpoint.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The endpoint ID.
   */
  public override fun endpointId(): String = unwrap(this).getEndpointId()

  /**
   * Dependable that can be depended upon to force target networks associations.
   */
  public override fun targetNetworksAssociated(): IDependable =
      unwrap(this).getTargetNetworksAssociated().let(IDependable::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.ClientVpnEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether to authorize all users to the VPC CIDR.
     *
     * This automatically creates an authorization rule. Set this to `false` and
     * use `addAuthorizationRule()` to create your own rules instead.
     *
     * Default: true
     *
     * @param authorizeAllUsersToVpcCidr Whether to authorize all users to the VPC CIDR. 
     */
    public fun authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr: Boolean)

    /**
     * The IPv4 address range, in CIDR notation, from which to assign client IP addresses.
     *
     * The address range cannot overlap with the local CIDR of the VPC
     * in which the associated subnet is located, or the routes that you add manually.
     *
     * Changing the address range will replace the Client VPN endpoint.
     *
     * The CIDR block should be /22 or greater.
     *
     * @param cidr The IPv4 address range, in CIDR notation, from which to assign client IP
     * addresses. 
     */
    public fun cidr(cidr: String)

    /**
     * The ARN of the client certificate for mutual authentication.
     *
     * The certificate must be signed by a certificate authority (CA) and it must
     * be provisioned in AWS Certificate Manager (ACM).
     *
     * Default: - use user-based authentication
     *
     * @param clientCertificateArn The ARN of the client certificate for mutual authentication. 
     */
    public fun clientCertificateArn(clientCertificateArn: String)

    /**
     * The AWS Lambda function used for connection authorization.
     *
     * The name of the Lambda function must begin with the `AWSClientVPN-` prefix
     *
     * Default: - no connection handler
     *
     * @param clientConnectionHandler The AWS Lambda function used for connection authorization. 
     */
    public fun clientConnectionHandler(clientConnectionHandler: IClientVpnConnectionHandler)

    /**
     * Customizable text that will be displayed in a banner on AWS provided clients when a VPN
     * session is established.
     *
     * UTF-8 encoded characters only. Maximum of 1400 characters.
     *
     * Default: - no banner is presented to the client
     *
     * @param clientLoginBanner Customizable text that will be displayed in a banner on AWS provided
     * clients when a VPN session is established. 
     */
    public fun clientLoginBanner(clientLoginBanner: String)

    /**
     * A brief description of the Client VPN endpoint.
     *
     * Default: - no description
     *
     * @param description A brief description of the Client VPN endpoint. 
     */
    public fun description(description: String)

    /**
     * Information about the DNS servers to be used for DNS resolution.
     *
     * A Client VPN endpoint can have up to two DNS servers.
     *
     * Default: - use the DNS address configured on the device
     *
     * @param dnsServers Information about the DNS servers to be used for DNS resolution. 
     */
    public fun dnsServers(dnsServers: List<String>)

    /**
     * Information about the DNS servers to be used for DNS resolution.
     *
     * A Client VPN endpoint can have up to two DNS servers.
     *
     * Default: - use the DNS address configured on the device
     *
     * @param dnsServers Information about the DNS servers to be used for DNS resolution. 
     */
    public fun dnsServers(vararg dnsServers: String)

    /**
     * A CloudWatch Logs log group for connection logging.
     *
     * Default: - a new group is created
     *
     * @param logGroup A CloudWatch Logs log group for connection logging. 
     */
    public fun logGroup(logGroup: ILogGroup)

    /**
     * A CloudWatch Logs log stream for connection logging.
     *
     * Default: - a new stream is created
     *
     * @param logStream A CloudWatch Logs log stream for connection logging. 
     */
    public fun logStream(logStream: ILogStream)

    /**
     * Whether to enable connections logging.
     *
     * Default: true
     *
     * @param logging Whether to enable connections logging. 
     */
    public fun logging(logging: Boolean)

    /**
     * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     *
     * Default: VpnPort.HTTPS
     *
     * @param port The port number to assign to the Client VPN endpoint for TCP and UDP traffic. 
     */
    public fun port(port: VpnPort)

    /**
     * The security groups to apply to the target network.
     *
     * Default: - a new security group is created
     *
     * @param securityGroups The security groups to apply to the target network. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * The security groups to apply to the target network.
     *
     * Default: - a new security group is created
     *
     * @param securityGroups The security groups to apply to the target network. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * Specify whether to enable the self-service portal for the Client VPN endpoint.
     *
     * Default: true
     *
     * @param selfServicePortal Specify whether to enable the self-service portal for the Client VPN
     * endpoint. 
     */
    public fun selfServicePortal(selfServicePortal: Boolean)

    /**
     * The ARN of the server certificate.
     *
     * @param serverCertificateArn The ARN of the server certificate. 
     */
    public fun serverCertificateArn(serverCertificateArn: String)

    /**
     * The maximum VPN session duration time.
     *
     * Default: ClientVpnSessionTimeout.TWENTY_FOUR_HOURS
     *
     * @param sessionTimeout The maximum VPN session duration time. 
     */
    public fun sessionTimeout(sessionTimeout: ClientVpnSessionTimeout)

    /**
     * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html)
     * @param splitTunnel Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint. 
     */
    public fun splitTunnel(splitTunnel: Boolean)

    /**
     * The transport protocol to be used by the VPN session.
     *
     * Default: TransportProtocol.UDP
     *
     * @param transportProtocol The transport protocol to be used by the VPN session. 
     */
    public fun transportProtocol(transportProtocol: TransportProtocol)

    /**
     * The type of user-based authentication to use.
     *
     * Default: - use mutual authentication
     *
     * [Documentation](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/client-authentication.html)
     * @param userBasedAuthentication The type of user-based authentication to use. 
     */
    public fun userBasedAuthentication(userBasedAuthentication: ClientVpnUserBasedAuthentication)

    /**
     * The VPC to connect to.
     *
     * @param vpc The VPC to connect to. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * Subnets to associate to the client VPN endpoint.
     *
     * Default: - the VPC default strategy
     *
     * @param vpcSubnets Subnets to associate to the client VPN endpoint. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * Subnets to associate to the client VPN endpoint.
     *
     * Default: - the VPC default strategy
     *
     * @param vpcSubnets Subnets to associate to the client VPN endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a222fe1219c90cbf3007b02b0c1c3894cc6fed29385981d02bc3ec5a1bb78a0")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ClientVpnEndpoint.Builder =
        software.amazon.awscdk.services.ec2.ClientVpnEndpoint.Builder.create(scope, id)

    /**
     * Whether to authorize all users to the VPC CIDR.
     *
     * This automatically creates an authorization rule. Set this to `false` and
     * use `addAuthorizationRule()` to create your own rules instead.
     *
     * Default: true
     *
     * @param authorizeAllUsersToVpcCidr Whether to authorize all users to the VPC CIDR. 
     */
    override fun authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr: Boolean) {
      cdkBuilder.authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr)
    }

    /**
     * The IPv4 address range, in CIDR notation, from which to assign client IP addresses.
     *
     * The address range cannot overlap with the local CIDR of the VPC
     * in which the associated subnet is located, or the routes that you add manually.
     *
     * Changing the address range will replace the Client VPN endpoint.
     *
     * The CIDR block should be /22 or greater.
     *
     * @param cidr The IPv4 address range, in CIDR notation, from which to assign client IP
     * addresses. 
     */
    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    /**
     * The ARN of the client certificate for mutual authentication.
     *
     * The certificate must be signed by a certificate authority (CA) and it must
     * be provisioned in AWS Certificate Manager (ACM).
     *
     * Default: - use user-based authentication
     *
     * @param clientCertificateArn The ARN of the client certificate for mutual authentication. 
     */
    override fun clientCertificateArn(clientCertificateArn: String) {
      cdkBuilder.clientCertificateArn(clientCertificateArn)
    }

    /**
     * The AWS Lambda function used for connection authorization.
     *
     * The name of the Lambda function must begin with the `AWSClientVPN-` prefix
     *
     * Default: - no connection handler
     *
     * @param clientConnectionHandler The AWS Lambda function used for connection authorization. 
     */
    override fun clientConnectionHandler(clientConnectionHandler: IClientVpnConnectionHandler) {
      cdkBuilder.clientConnectionHandler(clientConnectionHandler.let(IClientVpnConnectionHandler::unwrap))
    }

    /**
     * Customizable text that will be displayed in a banner on AWS provided clients when a VPN
     * session is established.
     *
     * UTF-8 encoded characters only. Maximum of 1400 characters.
     *
     * Default: - no banner is presented to the client
     *
     * @param clientLoginBanner Customizable text that will be displayed in a banner on AWS provided
     * clients when a VPN session is established. 
     */
    override fun clientLoginBanner(clientLoginBanner: String) {
      cdkBuilder.clientLoginBanner(clientLoginBanner)
    }

    /**
     * A brief description of the Client VPN endpoint.
     *
     * Default: - no description
     *
     * @param description A brief description of the Client VPN endpoint. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Information about the DNS servers to be used for DNS resolution.
     *
     * A Client VPN endpoint can have up to two DNS servers.
     *
     * Default: - use the DNS address configured on the device
     *
     * @param dnsServers Information about the DNS servers to be used for DNS resolution. 
     */
    override fun dnsServers(dnsServers: List<String>) {
      cdkBuilder.dnsServers(dnsServers)
    }

    /**
     * Information about the DNS servers to be used for DNS resolution.
     *
     * A Client VPN endpoint can have up to two DNS servers.
     *
     * Default: - use the DNS address configured on the device
     *
     * @param dnsServers Information about the DNS servers to be used for DNS resolution. 
     */
    override fun dnsServers(vararg dnsServers: String): Unit = dnsServers(dnsServers.toList())

    /**
     * A CloudWatch Logs log group for connection logging.
     *
     * Default: - a new group is created
     *
     * @param logGroup A CloudWatch Logs log group for connection logging. 
     */
    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    /**
     * A CloudWatch Logs log stream for connection logging.
     *
     * Default: - a new stream is created
     *
     * @param logStream A CloudWatch Logs log stream for connection logging. 
     */
    override fun logStream(logStream: ILogStream) {
      cdkBuilder.logStream(logStream.let(ILogStream::unwrap))
    }

    /**
     * Whether to enable connections logging.
     *
     * Default: true
     *
     * @param logging Whether to enable connections logging. 
     */
    override fun logging(logging: Boolean) {
      cdkBuilder.logging(logging)
    }

    /**
     * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     *
     * Default: VpnPort.HTTPS
     *
     * @param port The port number to assign to the Client VPN endpoint for TCP and UDP traffic. 
     */
    override fun port(port: VpnPort) {
      cdkBuilder.port(port.let(VpnPort::unwrap))
    }

    /**
     * The security groups to apply to the target network.
     *
     * Default: - a new security group is created
     *
     * @param securityGroups The security groups to apply to the target network. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * The security groups to apply to the target network.
     *
     * Default: - a new security group is created
     *
     * @param securityGroups The security groups to apply to the target network. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * Specify whether to enable the self-service portal for the Client VPN endpoint.
     *
     * Default: true
     *
     * @param selfServicePortal Specify whether to enable the self-service portal for the Client VPN
     * endpoint. 
     */
    override fun selfServicePortal(selfServicePortal: Boolean) {
      cdkBuilder.selfServicePortal(selfServicePortal)
    }

    /**
     * The ARN of the server certificate.
     *
     * @param serverCertificateArn The ARN of the server certificate. 
     */
    override fun serverCertificateArn(serverCertificateArn: String) {
      cdkBuilder.serverCertificateArn(serverCertificateArn)
    }

    /**
     * The maximum VPN session duration time.
     *
     * Default: ClientVpnSessionTimeout.TWENTY_FOUR_HOURS
     *
     * @param sessionTimeout The maximum VPN session duration time. 
     */
    override fun sessionTimeout(sessionTimeout: ClientVpnSessionTimeout) {
      cdkBuilder.sessionTimeout(sessionTimeout.let(ClientVpnSessionTimeout::unwrap))
    }

    /**
     * Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html)
     * @param splitTunnel Indicates whether split-tunnel is enabled on the AWS Client VPN endpoint. 
     */
    override fun splitTunnel(splitTunnel: Boolean) {
      cdkBuilder.splitTunnel(splitTunnel)
    }

    /**
     * The transport protocol to be used by the VPN session.
     *
     * Default: TransportProtocol.UDP
     *
     * @param transportProtocol The transport protocol to be used by the VPN session. 
     */
    override fun transportProtocol(transportProtocol: TransportProtocol) {
      cdkBuilder.transportProtocol(transportProtocol.let(TransportProtocol::unwrap))
    }

    /**
     * The type of user-based authentication to use.
     *
     * Default: - use mutual authentication
     *
     * [Documentation](https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/client-authentication.html)
     * @param userBasedAuthentication The type of user-based authentication to use. 
     */
    override
        fun userBasedAuthentication(userBasedAuthentication: ClientVpnUserBasedAuthentication) {
      cdkBuilder.userBasedAuthentication(userBasedAuthentication.let(ClientVpnUserBasedAuthentication::unwrap))
    }

    /**
     * The VPC to connect to.
     *
     * @param vpc The VPC to connect to. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * Subnets to associate to the client VPN endpoint.
     *
     * Default: - the VPC default strategy
     *
     * @param vpcSubnets Subnets to associate to the client VPN endpoint. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    /**
     * Subnets to associate to the client VPN endpoint.
     *
     * Default: - the VPC default strategy
     *
     * @param vpcSubnets Subnets to associate to the client VPN endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a222fe1219c90cbf3007b02b0c1c3894cc6fed29385981d02bc3ec5a1bb78a0")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.ec2.ClientVpnEndpoint = cdkBuilder.build()
  }

  public companion object {
    public fun fromEndpointAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ClientVpnEndpointAttributes,
    ): IClientVpnEndpoint =
        software.amazon.awscdk.services.ec2.ClientVpnEndpoint.fromEndpointAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ClientVpnEndpointAttributes::unwrap)).let(IClientVpnEndpoint::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ee168512bf896e7da207e8fee80caa0b6a2feb399a6f9a2fbfbb973a25175dd")
    public fun fromEndpointAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ClientVpnEndpointAttributes.Builder.() -> Unit,
    ): IClientVpnEndpoint = fromEndpointAttributes(scope, id, ClientVpnEndpointAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ClientVpnEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ClientVpnEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnEndpoint):
        ClientVpnEndpoint = ClientVpnEndpoint(cdkObject)

    internal fun unwrap(wrapped: ClientVpnEndpoint):
        software.amazon.awscdk.services.ec2.ClientVpnEndpoint = wrapped.cdkObject
  }
}
