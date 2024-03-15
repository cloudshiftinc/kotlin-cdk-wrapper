@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnClientVpnEndpointProps {
  public fun authenticationOptions(): Any

  public fun clientCidrBlock(): String

  public fun clientConnectOptions(): Any? = unwrap(this).getClientConnectOptions()

  public fun clientLoginBannerOptions(): Any? = unwrap(this).getClientLoginBannerOptions()

  public fun connectionLogOptions(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun selfServicePortal(): String? = unwrap(this).getSelfServicePortal()

  public fun serverCertificateArn(): String

  public fun sessionTimeoutHours(): Number? = unwrap(this).getSessionTimeoutHours()

  public fun splitTunnel(): Any? = unwrap(this).getSplitTunnel()

  public fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  public fun transportProtocol(): String? = unwrap(this).getTransportProtocol()

  public fun vpcId(): String? = unwrap(this).getVpcId()

  public fun vpnPort(): Number? = unwrap(this).getVpnPort()

  @CdkDslMarker
  public interface Builder {
    public fun authenticationOptions(authenticationOptions: IResolvable)

    public fun authenticationOptions(authenticationOptions: List<Any>)

    public fun authenticationOptions(vararg authenticationOptions: Any)

    public fun clientCidrBlock(clientCidrBlock: String)

    public fun clientConnectOptions(clientConnectOptions: IResolvable)

    public
        fun clientConnectOptions(clientConnectOptions: CfnClientVpnEndpoint.ClientConnectOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d0fca7d776051fa280ddab2a949b995f860c769751a4f5d33ed75647e9565ce")
    public
        fun clientConnectOptions(clientConnectOptions: CfnClientVpnEndpoint.ClientConnectOptionsProperty.Builder.() -> Unit)

    public fun clientLoginBannerOptions(clientLoginBannerOptions: IResolvable)

    public
        fun clientLoginBannerOptions(clientLoginBannerOptions: CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5373575109d6d6b7cd31bcee2963202f5a5c9dfbf72acedfe8cd25024e9cd29")
    public
        fun clientLoginBannerOptions(clientLoginBannerOptions: CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty.Builder.() -> Unit)

    public fun connectionLogOptions(connectionLogOptions: IResolvable)

    public
        fun connectionLogOptions(connectionLogOptions: CfnClientVpnEndpoint.ConnectionLogOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36eee4b8563134d4e4c9e4571627bac2a00389cf339a7f80981f67e146bfb00a")
    public
        fun connectionLogOptions(connectionLogOptions: CfnClientVpnEndpoint.ConnectionLogOptionsProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun dnsServers(dnsServers: List<String>)

    public fun dnsServers(vararg dnsServers: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun selfServicePortal(selfServicePortal: String)

    public fun serverCertificateArn(serverCertificateArn: String)

    public fun sessionTimeoutHours(sessionTimeoutHours: Number)

    public fun splitTunnel(splitTunnel: Boolean)

    public fun splitTunnel(splitTunnel: IResolvable)

    public fun tagSpecifications(tagSpecifications: IResolvable)

    public fun tagSpecifications(tagSpecifications: List<Any>)

    public fun tagSpecifications(vararg tagSpecifications: Any)

    public fun transportProtocol(transportProtocol: String)

    public fun vpcId(vpcId: String)

    public fun vpnPort(vpnPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps.builder()

    override fun authenticationOptions(authenticationOptions: IResolvable) {
      cdkBuilder.authenticationOptions(authenticationOptions.let(IResolvable::unwrap))
    }

    override fun authenticationOptions(authenticationOptions: List<Any>) {
      cdkBuilder.authenticationOptions(authenticationOptions)
    }

    override fun authenticationOptions(vararg authenticationOptions: Any): Unit =
        authenticationOptions(authenticationOptions.toList())

    override fun clientCidrBlock(clientCidrBlock: String) {
      cdkBuilder.clientCidrBlock(clientCidrBlock)
    }

    override fun clientConnectOptions(clientConnectOptions: IResolvable) {
      cdkBuilder.clientConnectOptions(clientConnectOptions.let(IResolvable::unwrap))
    }

    override
        fun clientConnectOptions(clientConnectOptions: CfnClientVpnEndpoint.ClientConnectOptionsProperty) {
      cdkBuilder.clientConnectOptions(clientConnectOptions.let(CfnClientVpnEndpoint.ClientConnectOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d0fca7d776051fa280ddab2a949b995f860c769751a4f5d33ed75647e9565ce")
    override
        fun clientConnectOptions(clientConnectOptions: CfnClientVpnEndpoint.ClientConnectOptionsProperty.Builder.() -> Unit):
        Unit =
        clientConnectOptions(CfnClientVpnEndpoint.ClientConnectOptionsProperty(clientConnectOptions))

    override fun clientLoginBannerOptions(clientLoginBannerOptions: IResolvable) {
      cdkBuilder.clientLoginBannerOptions(clientLoginBannerOptions.let(IResolvable::unwrap))
    }

    override
        fun clientLoginBannerOptions(clientLoginBannerOptions: CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty) {
      cdkBuilder.clientLoginBannerOptions(clientLoginBannerOptions.let(CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5373575109d6d6b7cd31bcee2963202f5a5c9dfbf72acedfe8cd25024e9cd29")
    override
        fun clientLoginBannerOptions(clientLoginBannerOptions: CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty.Builder.() -> Unit):
        Unit =
        clientLoginBannerOptions(CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty(clientLoginBannerOptions))

    override fun connectionLogOptions(connectionLogOptions: IResolvable) {
      cdkBuilder.connectionLogOptions(connectionLogOptions.let(IResolvable::unwrap))
    }

    override
        fun connectionLogOptions(connectionLogOptions: CfnClientVpnEndpoint.ConnectionLogOptionsProperty) {
      cdkBuilder.connectionLogOptions(connectionLogOptions.let(CfnClientVpnEndpoint.ConnectionLogOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36eee4b8563134d4e4c9e4571627bac2a00389cf339a7f80981f67e146bfb00a")
    override
        fun connectionLogOptions(connectionLogOptions: CfnClientVpnEndpoint.ConnectionLogOptionsProperty.Builder.() -> Unit):
        Unit =
        connectionLogOptions(CfnClientVpnEndpoint.ConnectionLogOptionsProperty(connectionLogOptions))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun dnsServers(dnsServers: List<String>) {
      cdkBuilder.dnsServers(dnsServers)
    }

    override fun dnsServers(vararg dnsServers: String): Unit = dnsServers(dnsServers.toList())

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun selfServicePortal(selfServicePortal: String) {
      cdkBuilder.selfServicePortal(selfServicePortal)
    }

    override fun serverCertificateArn(serverCertificateArn: String) {
      cdkBuilder.serverCertificateArn(serverCertificateArn)
    }

    override fun sessionTimeoutHours(sessionTimeoutHours: Number) {
      cdkBuilder.sessionTimeoutHours(sessionTimeoutHours)
    }

    override fun splitTunnel(splitTunnel: Boolean) {
      cdkBuilder.splitTunnel(splitTunnel)
    }

    override fun splitTunnel(splitTunnel: IResolvable) {
      cdkBuilder.splitTunnel(splitTunnel.let(IResolvable::unwrap))
    }

    override fun tagSpecifications(tagSpecifications: IResolvable) {
      cdkBuilder.tagSpecifications(tagSpecifications.let(IResolvable::unwrap))
    }

    override fun tagSpecifications(tagSpecifications: List<Any>) {
      cdkBuilder.tagSpecifications(tagSpecifications)
    }

    override fun tagSpecifications(vararg tagSpecifications: Any): Unit =
        tagSpecifications(tagSpecifications.toList())

    override fun transportProtocol(transportProtocol: String) {
      cdkBuilder.transportProtocol(transportProtocol)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    override fun vpnPort(vpnPort: Number) {
      cdkBuilder.vpnPort(vpnPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps,
  ) : CdkObject(cdkObject), CfnClientVpnEndpointProps {
    override fun authenticationOptions(): Any = unwrap(this).getAuthenticationOptions()

    override fun clientCidrBlock(): String = unwrap(this).getClientCidrBlock()

    override fun clientConnectOptions(): Any? = unwrap(this).getClientConnectOptions()

    override fun clientLoginBannerOptions(): Any? = unwrap(this).getClientLoginBannerOptions()

    override fun connectionLogOptions(): Any = unwrap(this).getConnectionLogOptions()

    override fun description(): String? = unwrap(this).getDescription()

    override fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun selfServicePortal(): String? = unwrap(this).getSelfServicePortal()

    override fun serverCertificateArn(): String = unwrap(this).getServerCertificateArn()

    override fun sessionTimeoutHours(): Number? = unwrap(this).getSessionTimeoutHours()

    override fun splitTunnel(): Any? = unwrap(this).getSplitTunnel()

    override fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

    override fun transportProtocol(): String? = unwrap(this).getTransportProtocol()

    override fun vpcId(): String? = unwrap(this).getVpcId()

    override fun vpnPort(): Number? = unwrap(this).getVpnPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClientVpnEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps):
        CfnClientVpnEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClientVpnEndpointProps):
        software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnClientVpnEndpointProps
  }
}
