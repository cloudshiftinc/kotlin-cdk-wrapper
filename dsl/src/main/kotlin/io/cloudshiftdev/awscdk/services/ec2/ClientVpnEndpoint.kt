package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
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
  private val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnEndpoint,
) : Resource(cdkObject), IClientVpnEndpoint {
  public open fun addAuthorizationRule(id: String, props: ClientVpnAuthorizationRuleOptions):
      ClientVpnAuthorizationRule = unwrap(this).addAuthorizationRule(id,
      props.let(ClientVpnAuthorizationRuleOptions::unwrap)).let(ClientVpnAuthorizationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38752e44404d24debbadade9862f1d0cdc045d07ef8cbee28e436eae8868f13a")
  public open fun addAuthorizationRule(id: String,
      props: ClientVpnAuthorizationRuleOptions.Builder.() -> Unit): ClientVpnAuthorizationRule =
      addAuthorizationRule(id, ClientVpnAuthorizationRuleOptions(props))

  public open fun addRoute(id: String, props: ClientVpnRouteOptions): ClientVpnRoute =
      unwrap(this).addRoute(id, props.let(ClientVpnRouteOptions::unwrap)).let(ClientVpnRoute::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1d5726acf19b5bb2ad35cd4626324423cccb1440a829fe43c0ed07f28c231007")
  public open fun addRoute(id: String, props: ClientVpnRouteOptions.Builder.() -> Unit):
      ClientVpnRoute = addRoute(id, ClientVpnRouteOptions(props))

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun endpointId(): String = unwrap(this).getEndpointId()

  public override fun targetNetworksAssociated(): IDependable =
      unwrap(this).getTargetNetworksAssociated().let(IDependable::wrap)

  public interface Builder {
    public fun authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr: Boolean) {
    }

    public fun cidr(cidr: String) {
    }

    public fun clientCertificateArn(clientCertificateArn: String) {
    }

    public fun clientConnectionHandler(clientConnectionHandler: IClientVpnConnectionHandler) {
    }

    public fun clientLoginBanner(clientLoginBanner: String) {
    }

    public fun description(description: String) {
    }

    public fun dnsServers(dnsServers: List<String>) {
    }

    public fun logGroup(logGroup: ILogGroup) {
    }

    public fun logStream(logStream: ILogStream) {
    }

    public fun logging(logging: Boolean) {
    }

    public fun port(port: VpnPort) {
    }

    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }

    public fun selfServicePortal(selfServicePortal: Boolean) {
    }

    public fun serverCertificateArn(serverCertificateArn: String) {
    }

    public fun sessionTimeout(sessionTimeout: ClientVpnSessionTimeout) {
    }

    public fun splitTunnel(splitTunnel: Boolean) {
    }

    public fun transportProtocol(transportProtocol: TransportProtocol) {
    }

    public fun userBasedAuthentication(userBasedAuthentication: ClientVpnUserBasedAuthentication) {
    }

    public fun vpc(vpc: IVpc) {
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a222fe1219c90cbf3007b02b0c1c3894cc6fed29385981d02bc3ec5a1bb78a0")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ClientVpnEndpoint.Builder =
        software.amazon.awscdk.services.ec2.ClientVpnEndpoint.Builder.create(scope, id)

    public override fun authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr: Boolean) {
      cdkBuilder.authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr)
    }

    public override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    public override fun clientCertificateArn(clientCertificateArn: String) {
      cdkBuilder.clientCertificateArn(clientCertificateArn)
    }

    public override
        fun clientConnectionHandler(clientConnectionHandler: IClientVpnConnectionHandler) {
      cdkBuilder.clientConnectionHandler(clientConnectionHandler.let(IClientVpnConnectionHandler::unwrap))
    }

    public override fun clientLoginBanner(clientLoginBanner: String) {
      cdkBuilder.clientLoginBanner(clientLoginBanner)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun dnsServers(dnsServers: List<String>) {
      cdkBuilder.dnsServers(dnsServers)
    }

    public override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    public override fun logStream(logStream: ILogStream) {
      cdkBuilder.logStream(logStream.let(ILogStream::unwrap))
    }

    public override fun logging(logging: Boolean) {
      cdkBuilder.logging(logging)
    }

    public override fun port(port: VpnPort) {
      cdkBuilder.port(port.let(VpnPort::unwrap))
    }

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public override fun selfServicePortal(selfServicePortal: Boolean) {
      cdkBuilder.selfServicePortal(selfServicePortal)
    }

    public override fun serverCertificateArn(serverCertificateArn: String) {
      cdkBuilder.serverCertificateArn(serverCertificateArn)
    }

    public override fun sessionTimeout(sessionTimeout: ClientVpnSessionTimeout) {
      cdkBuilder.sessionTimeout(sessionTimeout.let(ClientVpnSessionTimeout::unwrap))
    }

    public override fun splitTunnel(splitTunnel: Boolean) {
      cdkBuilder.splitTunnel(splitTunnel)
    }

    public override fun transportProtocol(transportProtocol: TransportProtocol) {
      cdkBuilder.transportProtocol(transportProtocol.let(TransportProtocol::unwrap))
    }

    public override
        fun userBasedAuthentication(userBasedAuthentication: ClientVpnUserBasedAuthentication) {
      cdkBuilder.userBasedAuthentication(userBasedAuthentication.let(ClientVpnUserBasedAuthentication::unwrap))
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a222fe1219c90cbf3007b02b0c1c3894cc6fed29385981d02bc3ec5a1bb78a0")
    public override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.ec2.ClientVpnEndpoint = cdkBuilder.build()
  }

  public companion object {
    public open fun fromEndpointAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ClientVpnEndpointAttributes,
    ): IClientVpnEndpoint =
        software.amazon.awscdk.services.ec2.ClientVpnEndpoint.fromEndpointAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ClientVpnEndpointAttributes::unwrap)).let(IClientVpnEndpoint::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ee168512bf896e7da207e8fee80caa0b6a2feb399a6f9a2fbfbb973a25175dd")
    public open fun fromEndpointAttributes(
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
