package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnClientVpnEndpoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun authenticationOptions(): Any = unwrap(this).getAuthenticationOptions()

  public open fun authenticationOptions(`value`: IResolvable) {
    unwrap(this).setAuthenticationOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun authenticationOptions(__idx_ac66f0: List<Any>) {
    unwrap(this).setAuthenticationOptions(__idx_ac66f0)
  }

  public open fun clientCidrBlock(): String = unwrap(this).getClientCidrBlock()

  public open fun clientCidrBlock(`value`: String) {
    unwrap(this).setClientCidrBlock(`value`)
  }

  public open fun clientConnectOptions(): Any? = unwrap(this).getClientConnectOptions()

  public open fun clientConnectOptions(`value`: IResolvable) {
    unwrap(this).setClientConnectOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun clientConnectOptions(`value`: ClientConnectOptionsProperty) {
    unwrap(this).setClientConnectOptions(`value`.let(ClientConnectOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0745a1c3c52929bdf02a00c1db8a940a4ee824afcaae877649561695debf6833")
  public open fun clientConnectOptions(`value`: ClientConnectOptionsProperty.Builder.() -> Unit):
      Unit = clientConnectOptions(ClientConnectOptionsProperty(`value`))

  public open fun clientLoginBannerOptions(): Any? = unwrap(this).getClientLoginBannerOptions()

  public open fun clientLoginBannerOptions(`value`: IResolvable) {
    unwrap(this).setClientLoginBannerOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun clientLoginBannerOptions(`value`: ClientLoginBannerOptionsProperty) {
    unwrap(this).setClientLoginBannerOptions(`value`.let(ClientLoginBannerOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7f1a586371220e8b9ff05493cc3ebecc4398729292fc1fd0f1d3d0592118f84a")
  public open
      fun clientLoginBannerOptions(`value`: ClientLoginBannerOptionsProperty.Builder.() -> Unit):
      Unit = clientLoginBannerOptions(ClientLoginBannerOptionsProperty(`value`))

  public open fun connectionLogOptions(): Any = unwrap(this).getConnectionLogOptions()

  public open fun connectionLogOptions(`value`: IResolvable) {
    unwrap(this).setConnectionLogOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun connectionLogOptions(`value`: ConnectionLogOptionsProperty) {
    unwrap(this).setConnectionLogOptions(`value`.let(ConnectionLogOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7e6cd303ee6987710eb061d1563131e3ffb01bc08518eb525a8c77c1fc7603f9")
  public open fun connectionLogOptions(`value`: ConnectionLogOptionsProperty.Builder.() -> Unit):
      Unit = connectionLogOptions(ConnectionLogOptionsProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun dnsServers(): List<String> = unwrap(this).getDnsServers() ?: emptyList()

  public open fun dnsServers(`value`: List<String>) {
    unwrap(this).setDnsServers(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun selfServicePortal(): String? = unwrap(this).getSelfServicePortal()

  public open fun selfServicePortal(`value`: String) {
    unwrap(this).setSelfServicePortal(`value`)
  }

  public open fun serverCertificateArn(): String = unwrap(this).getServerCertificateArn()

  public open fun serverCertificateArn(`value`: String) {
    unwrap(this).setServerCertificateArn(`value`)
  }

  public open fun sessionTimeoutHours(): Number? = unwrap(this).getSessionTimeoutHours()

  public open fun sessionTimeoutHours(`value`: Number) {
    unwrap(this).setSessionTimeoutHours(`value`)
  }

  public open fun splitTunnel(): Any? = unwrap(this).getSplitTunnel()

  public open fun splitTunnel(`value`: Boolean) {
    unwrap(this).setSplitTunnel(`value`)
  }

  public open fun splitTunnel(`value`: IResolvable) {
    unwrap(this).setSplitTunnel(`value`.let(IResolvable::unwrap))
  }

  public open fun tagSpecifications(): Any? = unwrap(this).getTagSpecifications()

  public open fun tagSpecifications(`value`: IResolvable) {
    unwrap(this).setTagSpecifications(`value`.let(IResolvable::unwrap))
  }

  public open fun tagSpecifications(__idx_ac66f0: List<Any>) {
    unwrap(this).setTagSpecifications(__idx_ac66f0)
  }

  public open fun transportProtocol(): String? = unwrap(this).getTransportProtocol()

  public open fun transportProtocol(`value`: String) {
    unwrap(this).setTransportProtocol(`value`)
  }

  public open fun vpcId(): String? = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  public open fun vpnPort(): Number? = unwrap(this).getVpnPort()

  public open fun vpnPort(`value`: Number) {
    unwrap(this).setVpnPort(`value`)
  }

  public interface Builder {
    public fun authenticationOptions(authenticationOptions: IResolvable)

    public fun authenticationOptions(authenticationOptions: List<Any>)

    public fun clientCidrBlock(clientCidrBlock: String)

    public fun clientConnectOptions(clientConnectOptions: IResolvable)

    public fun clientConnectOptions(clientConnectOptions: ClientConnectOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecfde4af8328f55323d65ff362c60188b5d32150fa7bbfd0f4905659fd43abef")
    public
        fun clientConnectOptions(clientConnectOptions: ClientConnectOptionsProperty.Builder.() -> Unit)

    public fun clientLoginBannerOptions(clientLoginBannerOptions: IResolvable)

    public fun clientLoginBannerOptions(clientLoginBannerOptions: ClientLoginBannerOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("534c8cf6787e1c7734bb9a74c718957c9d027686609d72d3f6a593936263da6c")
    public
        fun clientLoginBannerOptions(clientLoginBannerOptions: ClientLoginBannerOptionsProperty.Builder.() -> Unit)

    public fun connectionLogOptions(connectionLogOptions: IResolvable)

    public fun connectionLogOptions(connectionLogOptions: ConnectionLogOptionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7982c3c0c85a9d1ddd3761028b13917e59c123fedc5465ce42490e50a08f2661")
    public
        fun connectionLogOptions(connectionLogOptions: ConnectionLogOptionsProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun dnsServers(dnsServers: List<String>)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun selfServicePortal(selfServicePortal: String)

    public fun serverCertificateArn(serverCertificateArn: String)

    public fun sessionTimeoutHours(sessionTimeoutHours: Number)

    public fun splitTunnel(splitTunnel: Boolean)

    public fun splitTunnel(splitTunnel: IResolvable)

    public fun tagSpecifications(tagSpecifications: IResolvable)

    public fun tagSpecifications(tagSpecifications: List<Any>)

    public fun transportProtocol(transportProtocol: String)

    public fun vpcId(vpcId: String)

    public fun vpnPort(vpnPort: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.Builder.create(scope, id)

    override fun authenticationOptions(authenticationOptions: IResolvable) {
      cdkBuilder.authenticationOptions(authenticationOptions.let(IResolvable::unwrap))
    }

    override fun authenticationOptions(authenticationOptions: List<Any>) {
      cdkBuilder.authenticationOptions(authenticationOptions)
    }

    override fun clientCidrBlock(clientCidrBlock: String) {
      cdkBuilder.clientCidrBlock(clientCidrBlock)
    }

    override fun clientConnectOptions(clientConnectOptions: IResolvable) {
      cdkBuilder.clientConnectOptions(clientConnectOptions.let(IResolvable::unwrap))
    }

    override fun clientConnectOptions(clientConnectOptions: ClientConnectOptionsProperty) {
      cdkBuilder.clientConnectOptions(clientConnectOptions.let(ClientConnectOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecfde4af8328f55323d65ff362c60188b5d32150fa7bbfd0f4905659fd43abef")
    override
        fun clientConnectOptions(clientConnectOptions: ClientConnectOptionsProperty.Builder.() -> Unit):
        Unit = clientConnectOptions(ClientConnectOptionsProperty(clientConnectOptions))

    override fun clientLoginBannerOptions(clientLoginBannerOptions: IResolvable) {
      cdkBuilder.clientLoginBannerOptions(clientLoginBannerOptions.let(IResolvable::unwrap))
    }

    override
        fun clientLoginBannerOptions(clientLoginBannerOptions: ClientLoginBannerOptionsProperty) {
      cdkBuilder.clientLoginBannerOptions(clientLoginBannerOptions.let(ClientLoginBannerOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("534c8cf6787e1c7734bb9a74c718957c9d027686609d72d3f6a593936263da6c")
    override
        fun clientLoginBannerOptions(clientLoginBannerOptions: ClientLoginBannerOptionsProperty.Builder.() -> Unit):
        Unit = clientLoginBannerOptions(ClientLoginBannerOptionsProperty(clientLoginBannerOptions))

    override fun connectionLogOptions(connectionLogOptions: IResolvable) {
      cdkBuilder.connectionLogOptions(connectionLogOptions.let(IResolvable::unwrap))
    }

    override fun connectionLogOptions(connectionLogOptions: ConnectionLogOptionsProperty) {
      cdkBuilder.connectionLogOptions(connectionLogOptions.let(ConnectionLogOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7982c3c0c85a9d1ddd3761028b13917e59c123fedc5465ce42490e50a08f2661")
    override
        fun connectionLogOptions(connectionLogOptions: ConnectionLogOptionsProperty.Builder.() -> Unit):
        Unit = connectionLogOptions(ConnectionLogOptionsProperty(connectionLogOptions))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun dnsServers(dnsServers: List<String>) {
      cdkBuilder.dnsServers(dnsServers)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

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

    override fun transportProtocol(transportProtocol: String) {
      cdkBuilder.transportProtocol(transportProtocol)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    override fun vpnPort(vpnPort: Number) {
      cdkBuilder.vpnPort(vpnPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

  public interface TagSpecificationProperty {
    public fun resourceType(): String

    public fun tags(): List<CfnTag>

    public interface Builder {
      public fun resourceType(resourceType: String)

      public fun tags(tags: List<CfnTag>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.TagSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.TagSpecificationProperty.builder()

      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      override fun tags(tags: List<CfnTag>) {
        cdkBuilder.tags(tags.map(CfnTag::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.TagSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.TagSpecificationProperty,
    ) : TagSpecificationProperty {
      override fun resourceType(): String = unwrap(this).getResourceType()

      override fun tags(): List<CfnTag> = unwrap(this).getTags().map(CfnTag::wrap)
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.TagSpecificationProperty):
          TagSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.TagSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DirectoryServiceAuthenticationRequestProperty {
    public fun directoryId(): String

    public interface Builder {
      public fun directoryId(directoryId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty.builder()

      override fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.DirectoryServiceAuthenticationRequestProperty,
    ) : DirectoryServiceAuthenticationRequestProperty {
      override fun directoryId(): String = unwrap(this).getDirectoryId()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ClientAuthenticationRequestProperty {
    public fun activeDirectory(): Any? = unwrap(this).getActiveDirectory()

    public fun federatedAuthentication(): Any? = unwrap(this).getFederatedAuthentication()

    public fun mutualAuthentication(): Any? = unwrap(this).getMutualAuthentication()

    public fun type(): String

    public interface Builder {
      public fun activeDirectory(activeDirectory: IResolvable)

      public fun activeDirectory(activeDirectory: DirectoryServiceAuthenticationRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc257b6734e4ae7777c750b840a04697dd4df6ba827ee4749b938fd48f9680de")
      public
          fun activeDirectory(activeDirectory: DirectoryServiceAuthenticationRequestProperty.Builder.() -> Unit)

      public fun federatedAuthentication(federatedAuthentication: IResolvable)

      public
          fun federatedAuthentication(federatedAuthentication: FederatedAuthenticationRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05a61c4449bef3d2027ab433b9d03ca560b38b6c44cd4fd0fa395a0f80c95452")
      public
          fun federatedAuthentication(federatedAuthentication: FederatedAuthenticationRequestProperty.Builder.() -> Unit)

      public fun mutualAuthentication(mutualAuthentication: IResolvable)

      public
          fun mutualAuthentication(mutualAuthentication: CertificateAuthenticationRequestProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79da6d6721aaa6683ffc81ed8bda33622d5a1c42e4a59c51b575db7edf2cb612")
      public
          fun mutualAuthentication(mutualAuthentication: CertificateAuthenticationRequestProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientAuthenticationRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientAuthenticationRequestProperty.builder()

      override fun activeDirectory(activeDirectory: IResolvable) {
        cdkBuilder.activeDirectory(activeDirectory.let(IResolvable::unwrap))
      }

      override fun activeDirectory(activeDirectory: DirectoryServiceAuthenticationRequestProperty) {
        cdkBuilder.activeDirectory(activeDirectory.let(DirectoryServiceAuthenticationRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc257b6734e4ae7777c750b840a04697dd4df6ba827ee4749b938fd48f9680de")
      override
          fun activeDirectory(activeDirectory: DirectoryServiceAuthenticationRequestProperty.Builder.() -> Unit):
          Unit = activeDirectory(DirectoryServiceAuthenticationRequestProperty(activeDirectory))

      override fun federatedAuthentication(federatedAuthentication: IResolvable) {
        cdkBuilder.federatedAuthentication(federatedAuthentication.let(IResolvable::unwrap))
      }

      override
          fun federatedAuthentication(federatedAuthentication: FederatedAuthenticationRequestProperty) {
        cdkBuilder.federatedAuthentication(federatedAuthentication.let(FederatedAuthenticationRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05a61c4449bef3d2027ab433b9d03ca560b38b6c44cd4fd0fa395a0f80c95452")
      override
          fun federatedAuthentication(federatedAuthentication: FederatedAuthenticationRequestProperty.Builder.() -> Unit):
          Unit =
          federatedAuthentication(FederatedAuthenticationRequestProperty(federatedAuthentication))

      override fun mutualAuthentication(mutualAuthentication: IResolvable) {
        cdkBuilder.mutualAuthentication(mutualAuthentication.let(IResolvable::unwrap))
      }

      override
          fun mutualAuthentication(mutualAuthentication: CertificateAuthenticationRequestProperty) {
        cdkBuilder.mutualAuthentication(mutualAuthentication.let(CertificateAuthenticationRequestProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79da6d6721aaa6683ffc81ed8bda33622d5a1c42e4a59c51b575db7edf2cb612")
      override
          fun mutualAuthentication(mutualAuthentication: CertificateAuthenticationRequestProperty.Builder.() -> Unit):
          Unit =
          mutualAuthentication(CertificateAuthenticationRequestProperty(mutualAuthentication))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientAuthenticationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientAuthenticationRequestProperty,
    ) : ClientAuthenticationRequestProperty {
      override fun activeDirectory(): Any? = unwrap(this).getActiveDirectory()

      override fun federatedAuthentication(): Any? = unwrap(this).getFederatedAuthentication()

      override fun mutualAuthentication(): Any? = unwrap(this).getMutualAuthentication()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ClientLoginBannerOptionsProperty {
    public fun bannerText(): String? = unwrap(this).getBannerText()

    public fun enabled(): Any

    public interface Builder {
      public fun bannerText(bannerText: String)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty.builder()

      override fun bannerText(bannerText: String) {
        cdkBuilder.bannerText(bannerText)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty,
    ) : ClientLoginBannerOptionsProperty {
      override fun bannerText(): String? = unwrap(this).getBannerText()

      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClientLoginBannerOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty):
          ClientLoginBannerOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientLoginBannerOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConnectionLogOptionsProperty {
    public fun cloudwatchLogGroup(): String? = unwrap(this).getCloudwatchLogGroup()

    public fun cloudwatchLogStream(): String? = unwrap(this).getCloudwatchLogStream()

    public fun enabled(): Any

    public interface Builder {
      public fun cloudwatchLogGroup(cloudwatchLogGroup: String)

      public fun cloudwatchLogStream(cloudwatchLogStream: String)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty.builder()

      override fun cloudwatchLogGroup(cloudwatchLogGroup: String) {
        cdkBuilder.cloudwatchLogGroup(cloudwatchLogGroup)
      }

      override fun cloudwatchLogStream(cloudwatchLogStream: String) {
        cdkBuilder.cloudwatchLogStream(cloudwatchLogStream)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty,
    ) : ConnectionLogOptionsProperty {
      override fun cloudwatchLogGroup(): String? = unwrap(this).getCloudwatchLogGroup()

      override fun cloudwatchLogStream(): String? = unwrap(this).getCloudwatchLogStream()

      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionLogOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty):
          ConnectionLogOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionLogOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ConnectionLogOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FederatedAuthenticationRequestProperty {
    public fun samlProviderArn(): String

    public fun selfServiceSamlProviderArn(): String? = unwrap(this).getSelfServiceSamlProviderArn()

    public interface Builder {
      public fun samlProviderArn(samlProviderArn: String)

      public fun selfServiceSamlProviderArn(selfServiceSamlProviderArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty.builder()

      override fun samlProviderArn(samlProviderArn: String) {
        cdkBuilder.samlProviderArn(samlProviderArn)
      }

      override fun selfServiceSamlProviderArn(selfServiceSamlProviderArn: String) {
        cdkBuilder.selfServiceSamlProviderArn(selfServiceSamlProviderArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.FederatedAuthenticationRequestProperty,
    ) : FederatedAuthenticationRequestProperty {
      override fun samlProviderArn(): String = unwrap(this).getSamlProviderArn()

      override fun selfServiceSamlProviderArn(): String? =
          unwrap(this).getSelfServiceSamlProviderArn()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CertificateAuthenticationRequestProperty {
    public fun clientRootCertificateChainArn(): String

    public interface Builder {
      public fun clientRootCertificateChainArn(clientRootCertificateChainArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty.builder()

      override fun clientRootCertificateChainArn(clientRootCertificateChainArn: String) {
        cdkBuilder.clientRootCertificateChainArn(clientRootCertificateChainArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.CertificateAuthenticationRequestProperty,
    ) : CertificateAuthenticationRequestProperty {
      override fun clientRootCertificateChainArn(): String =
          unwrap(this).getClientRootCertificateChainArn()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ClientConnectOptionsProperty {
    public fun enabled(): Any

    public fun lambdaFunctionArn(): String? = unwrap(this).getLambdaFunctionArn()

    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun lambdaFunctionArn(lambdaFunctionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun lambdaFunctionArn(lambdaFunctionArn: String) {
        cdkBuilder.lambdaFunctionArn(lambdaFunctionArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty,
    ) : ClientConnectOptionsProperty {
      override fun enabled(): Any = unwrap(this).getEnabled()

      override fun lambdaFunctionArn(): String? = unwrap(this).getLambdaFunctionArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ClientConnectOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty):
          ClientConnectOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClientConnectOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint.ClientConnectOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
