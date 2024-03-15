@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import io.cloudshiftdev.awscdk.services.logs.ILogStream
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ClientVpnEndpointProps : ClientVpnEndpointOptions {
  public fun vpc(): IVpc

  @CdkDslMarker
  public interface Builder {
    public fun authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr: Boolean)

    public fun cidr(cidr: String)

    public fun clientCertificateArn(clientCertificateArn: String)

    public fun clientConnectionHandler(clientConnectionHandler: IClientVpnConnectionHandler)

    public fun clientLoginBanner(clientLoginBanner: String)

    public fun description(description: String)

    public fun dnsServers(dnsServers: List<String>)

    public fun dnsServers(vararg dnsServers: String)

    public fun logGroup(logGroup: ILogGroup)

    public fun logStream(logStream: ILogStream)

    public fun logging(logging: Boolean)

    public fun port(port: VpnPort)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun selfServicePortal(selfServicePortal: Boolean)

    public fun serverCertificateArn(serverCertificateArn: String)

    public fun sessionTimeout(sessionTimeout: ClientVpnSessionTimeout)

    public fun splitTunnel(splitTunnel: Boolean)

    public fun transportProtocol(transportProtocol: TransportProtocol)

    public fun userBasedAuthentication(userBasedAuthentication: ClientVpnUserBasedAuthentication)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef45475be8f79d0ff6eafc0601b8d3dc671e74f2563b3086b9eddc4e17644cbf")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ClientVpnEndpointProps.Builder =
        software.amazon.awscdk.services.ec2.ClientVpnEndpointProps.builder()

    override fun authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr: Boolean) {
      cdkBuilder.authorizeAllUsersToVpcCidr(authorizeAllUsersToVpcCidr)
    }

    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    override fun clientCertificateArn(clientCertificateArn: String) {
      cdkBuilder.clientCertificateArn(clientCertificateArn)
    }

    override fun clientConnectionHandler(clientConnectionHandler: IClientVpnConnectionHandler) {
      cdkBuilder.clientConnectionHandler(clientConnectionHandler.let(IClientVpnConnectionHandler::unwrap))
    }

    override fun clientLoginBanner(clientLoginBanner: String) {
      cdkBuilder.clientLoginBanner(clientLoginBanner)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun dnsServers(dnsServers: List<String>) {
      cdkBuilder.dnsServers(dnsServers)
    }

    override fun dnsServers(vararg dnsServers: String): Unit = dnsServers(dnsServers.toList())

    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    override fun logStream(logStream: ILogStream) {
      cdkBuilder.logStream(logStream.let(ILogStream::unwrap))
    }

    override fun logging(logging: Boolean) {
      cdkBuilder.logging(logging)
    }

    override fun port(port: VpnPort) {
      cdkBuilder.port(port.let(VpnPort::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun selfServicePortal(selfServicePortal: Boolean) {
      cdkBuilder.selfServicePortal(selfServicePortal)
    }

    override fun serverCertificateArn(serverCertificateArn: String) {
      cdkBuilder.serverCertificateArn(serverCertificateArn)
    }

    override fun sessionTimeout(sessionTimeout: ClientVpnSessionTimeout) {
      cdkBuilder.sessionTimeout(sessionTimeout.let(ClientVpnSessionTimeout::unwrap))
    }

    override fun splitTunnel(splitTunnel: Boolean) {
      cdkBuilder.splitTunnel(splitTunnel)
    }

    override fun transportProtocol(transportProtocol: TransportProtocol) {
      cdkBuilder.transportProtocol(transportProtocol.let(TransportProtocol::unwrap))
    }

    override
        fun userBasedAuthentication(userBasedAuthentication: ClientVpnUserBasedAuthentication) {
      cdkBuilder.userBasedAuthentication(userBasedAuthentication.let(ClientVpnUserBasedAuthentication::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef45475be8f79d0ff6eafc0601b8d3dc671e74f2563b3086b9eddc4e17644cbf")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.ec2.ClientVpnEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnEndpointProps,
  ) : CdkObject(cdkObject), ClientVpnEndpointProps {
    override fun authorizeAllUsersToVpcCidr(): Boolean? =
        unwrap(this).getAuthorizeAllUsersToVpcCidr()

    override fun cidr(): String = unwrap(this).getCidr()

    override fun clientCertificateArn(): String? = unwrap(this).getClientCertificateArn()

    override fun clientConnectionHandler(): IClientVpnConnectionHandler? =
        unwrap(this).getClientConnectionHandler()?.let(IClientVpnConnectionHandler::wrap)

    override fun clientLoginBanner(): String? = unwrap(this).getClientLoginBanner()

    override fun description(): String? = unwrap(this).getDescription()

    override fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

    override fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

    override fun logStream(): ILogStream? = unwrap(this).getLogStream()?.let(ILogStream::wrap)

    override fun logging(): Boolean? = unwrap(this).getLogging()

    override fun port(): VpnPort? = unwrap(this).getPort()?.let(VpnPort::wrap)

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun selfServicePortal(): Boolean? = unwrap(this).getSelfServicePortal()

    override fun serverCertificateArn(): String = unwrap(this).getServerCertificateArn()

    override fun sessionTimeout(): ClientVpnSessionTimeout? =
        unwrap(this).getSessionTimeout()?.let(ClientVpnSessionTimeout::wrap)

    override fun splitTunnel(): Boolean? = unwrap(this).getSplitTunnel()

    override fun transportProtocol(): TransportProtocol? =
        unwrap(this).getTransportProtocol()?.let(TransportProtocol::wrap)

    override fun userBasedAuthentication(): ClientVpnUserBasedAuthentication? =
        unwrap(this).getUserBasedAuthentication()?.let(ClientVpnUserBasedAuthentication::wrap)

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClientVpnEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnEndpointProps):
        ClientVpnEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClientVpnEndpointProps):
        software.amazon.awscdk.services.ec2.ClientVpnEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ClientVpnEndpointProps
  }
}
