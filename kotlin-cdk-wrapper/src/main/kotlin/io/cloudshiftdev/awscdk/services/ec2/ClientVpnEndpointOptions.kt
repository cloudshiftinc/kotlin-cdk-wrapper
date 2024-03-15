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

public interface ClientVpnEndpointOptions {
  public fun authorizeAllUsersToVpcCidr(): Boolean? = unwrap(this).getAuthorizeAllUsersToVpcCidr()

  public fun cidr(): String

  public fun clientCertificateArn(): String? = unwrap(this).getClientCertificateArn()

  public fun clientConnectionHandler(): IClientVpnConnectionHandler? =
      unwrap(this).getClientConnectionHandler()?.let(IClientVpnConnectionHandler::wrap)

  public fun clientLoginBanner(): String? = unwrap(this).getClientLoginBanner()

  public fun description(): String? = unwrap(this).getDescription()

  public fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

  public fun logGroup(): ILogGroup? = unwrap(this).getLogGroup()?.let(ILogGroup::wrap)

  public fun logStream(): ILogStream? = unwrap(this).getLogStream()?.let(ILogStream::wrap)

  public fun logging(): Boolean? = unwrap(this).getLogging()

  public fun port(): VpnPort? = unwrap(this).getPort()?.let(VpnPort::wrap)

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun selfServicePortal(): Boolean? = unwrap(this).getSelfServicePortal()

  public fun serverCertificateArn(): String

  public fun sessionTimeout(): ClientVpnSessionTimeout? =
      unwrap(this).getSessionTimeout()?.let(ClientVpnSessionTimeout::wrap)

  public fun splitTunnel(): Boolean? = unwrap(this).getSplitTunnel()

  public fun transportProtocol(): TransportProtocol? =
      unwrap(this).getTransportProtocol()?.let(TransportProtocol::wrap)

  public fun userBasedAuthentication(): ClientVpnUserBasedAuthentication? =
      unwrap(this).getUserBasedAuthentication()?.let(ClientVpnUserBasedAuthentication::wrap)

  public fun vpcSubnets(): SubnetSelection? =
      unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)

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

    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec49a3a6b4c8c16c4ce0aa42047c4a39643ccb50b5d491c7cff2e49629e77e40")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ClientVpnEndpointOptions.Builder =
        software.amazon.awscdk.services.ec2.ClientVpnEndpointOptions.builder()

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

    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec49a3a6b4c8c16c4ce0aa42047c4a39643ccb50b5d491c7cff2e49629e77e40")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    public fun build(): software.amazon.awscdk.services.ec2.ClientVpnEndpointOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnEndpointOptions,
  ) : CdkObject(cdkObject), ClientVpnEndpointOptions {
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

    override fun vpcSubnets(): SubnetSelection? =
        unwrap(this).getVpcSubnets()?.let(SubnetSelection::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClientVpnEndpointOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnEndpointOptions):
        ClientVpnEndpointOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClientVpnEndpointOptions):
        software.amazon.awscdk.services.ec2.ClientVpnEndpointOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ClientVpnEndpointOptions
  }
}
