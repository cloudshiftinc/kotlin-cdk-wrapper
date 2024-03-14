package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTLSInspectionConfiguration internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrTlsInspectionConfigurationArn(): String =
      unwrap(this).getAttrTlsInspectionConfigurationArn()

  public open fun attrTlsInspectionConfigurationId(): String =
      unwrap(this).getAttrTlsInspectionConfigurationId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tlsInspectionConfiguration(): Any = unwrap(this).getTlsInspectionConfiguration()

  public open fun tlsInspectionConfiguration(`value`: IResolvable) {
    unwrap(this).setTlsInspectionConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun tlsInspectionConfiguration(`value`: TLSInspectionConfigurationProperty) {
    unwrap(this).setTlsInspectionConfiguration(`value`.let(TLSInspectionConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7184ddc902c0d819b249c81fc75e1efb036cb9855d9ba8d0318b7155ab2dcca8")
  public open
      fun tlsInspectionConfiguration(`value`: TLSInspectionConfigurationProperty.Builder.() -> Unit):
      Unit = tlsInspectionConfiguration(TLSInspectionConfigurationProperty(`value`))

  public open fun tlsInspectionConfigurationName(): String =
      unwrap(this).getTlsInspectionConfigurationName()

  public open fun tlsInspectionConfigurationName(`value`: String) {
    unwrap(this).setTlsInspectionConfigurationName(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun tags(tags: List<CfnTag>)

    public fun tlsInspectionConfiguration(tlsInspectionConfiguration: IResolvable)

    public
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: TLSInspectionConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b47cfa714e373457b6664ee322a3314374976f96a20e814d00f38a39b6901695")
    public
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: TLSInspectionConfigurationProperty.Builder.() -> Unit)

    public fun tlsInspectionConfigurationName(tlsInspectionConfigurationName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.Builder.create(scope,
        id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tlsInspectionConfiguration(tlsInspectionConfiguration: IResolvable) {
      cdkBuilder.tlsInspectionConfiguration(tlsInspectionConfiguration.let(IResolvable::unwrap))
    }

    override
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: TLSInspectionConfigurationProperty) {
      cdkBuilder.tlsInspectionConfiguration(tlsInspectionConfiguration.let(TLSInspectionConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b47cfa714e373457b6664ee322a3314374976f96a20e814d00f38a39b6901695")
    override
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: TLSInspectionConfigurationProperty.Builder.() -> Unit):
        Unit =
        tlsInspectionConfiguration(TLSInspectionConfigurationProperty(tlsInspectionConfiguration))

    override fun tlsInspectionConfigurationName(tlsInspectionConfigurationName: String) {
      cdkBuilder.tlsInspectionConfigurationName(tlsInspectionConfigurationName)
    }

    public fun build():
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTLSInspectionConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTLSInspectionConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration):
        CfnTLSInspectionConfiguration = CfnTLSInspectionConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnTLSInspectionConfiguration):
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration =
        wrapped.cdkObject
  }

  public interface PortRangeProperty {
    public fun fromPort(): Number

    public fun toPort(): Number

    public interface Builder {
      public fun fromPort(fromPort: Number)

      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.PortRangeProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.PortRangeProperty.builder()

      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.PortRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.PortRangeProperty,
    ) : PortRangeProperty {
      override fun fromPort(): Number = unwrap(this).getFromPort()

      override fun toPort(): Number = unwrap(this).getToPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.PortRangeProperty):
          PortRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortRangeProperty):
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.PortRangeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TLSInspectionConfigurationProperty {
    public fun serverCertificateConfigurations(): Any? =
        unwrap(this).getServerCertificateConfigurations()

    public interface Builder {
      public fun serverCertificateConfigurations(serverCertificateConfigurations: IResolvable)

      public fun serverCertificateConfigurations(serverCertificateConfigurations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty.builder()

      override fun serverCertificateConfigurations(serverCertificateConfigurations: IResolvable) {
        cdkBuilder.serverCertificateConfigurations(serverCertificateConfigurations.let(IResolvable::unwrap))
      }

      override fun serverCertificateConfigurations(serverCertificateConfigurations: List<Any>) {
        cdkBuilder.serverCertificateConfigurations(serverCertificateConfigurations)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty,
    ) : TLSInspectionConfigurationProperty {
      override fun serverCertificateConfigurations(): Any? =
          unwrap(this).getServerCertificateConfigurations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TLSInspectionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty):
          TLSInspectionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TLSInspectionConfigurationProperty):
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AddressProperty {
    public fun addressDefinition(): String

    public interface Builder {
      public fun addressDefinition(addressDefinition: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.AddressProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.AddressProperty.builder()

      override fun addressDefinition(addressDefinition: String) {
        cdkBuilder.addressDefinition(addressDefinition)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.AddressProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.AddressProperty,
    ) : AddressProperty {
      override fun addressDefinition(): String = unwrap(this).getAddressDefinition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.AddressProperty):
          AddressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddressProperty):
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.AddressProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ServerCertificateProperty {
    public fun resourceArn(): String? = unwrap(this).getResourceArn()

    public interface Builder {
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateProperty.builder()

      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateProperty,
    ) : ServerCertificateProperty {
      override fun resourceArn(): String? = unwrap(this).getResourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ServerCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateProperty):
          ServerCertificateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerCertificateProperty):
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CheckCertificateRevocationStatusProperty {
    public fun revokedStatusAction(): String? = unwrap(this).getRevokedStatusAction()

    public fun unknownStatusAction(): String? = unwrap(this).getUnknownStatusAction()

    public interface Builder {
      public fun revokedStatusAction(revokedStatusAction: String)

      public fun unknownStatusAction(unknownStatusAction: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty.builder()

      override fun revokedStatusAction(revokedStatusAction: String) {
        cdkBuilder.revokedStatusAction(revokedStatusAction)
      }

      override fun unknownStatusAction(unknownStatusAction: String) {
        cdkBuilder.unknownStatusAction(unknownStatusAction)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty,
    ) : CheckCertificateRevocationStatusProperty {
      override fun revokedStatusAction(): String? = unwrap(this).getRevokedStatusAction()

      override fun unknownStatusAction(): String? = unwrap(this).getUnknownStatusAction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CheckCertificateRevocationStatusProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty):
          CheckCertificateRevocationStatusProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CheckCertificateRevocationStatusProperty):
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ServerCertificateScopeProperty {
    public fun destinationPorts(): Any? = unwrap(this).getDestinationPorts()

    public fun destinations(): Any? = unwrap(this).getDestinations()

    public fun protocols(): Any? = unwrap(this).getProtocols()

    public fun sourcePorts(): Any? = unwrap(this).getSourcePorts()

    public fun sources(): Any? = unwrap(this).getSources()

    public interface Builder {
      public fun destinationPorts(destinationPorts: IResolvable)

      public fun destinationPorts(destinationPorts: List<Any>)

      public fun destinations(destinations: IResolvable)

      public fun destinations(destinations: List<Any>)

      public fun protocols(protocols: IResolvable)

      public fun protocols(protocols: List<Number>)

      public fun sourcePorts(sourcePorts: IResolvable)

      public fun sourcePorts(sourcePorts: List<Any>)

      public fun sources(sources: IResolvable)

      public fun sources(sources: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateScopeProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateScopeProperty.builder()

      override fun destinationPorts(destinationPorts: IResolvable) {
        cdkBuilder.destinationPorts(destinationPorts.let(IResolvable::unwrap))
      }

      override fun destinationPorts(destinationPorts: List<Any>) {
        cdkBuilder.destinationPorts(destinationPorts)
      }

      override fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
      }

      override fun destinations(destinations: List<Any>) {
        cdkBuilder.destinations(destinations)
      }

      override fun protocols(protocols: IResolvable) {
        cdkBuilder.protocols(protocols.let(IResolvable::unwrap))
      }

      override fun protocols(protocols: List<Number>) {
        cdkBuilder.protocols(protocols)
      }

      override fun sourcePorts(sourcePorts: IResolvable) {
        cdkBuilder.sourcePorts(sourcePorts.let(IResolvable::unwrap))
      }

      override fun sourcePorts(sourcePorts: List<Any>) {
        cdkBuilder.sourcePorts(sourcePorts)
      }

      override fun sources(sources: IResolvable) {
        cdkBuilder.sources(sources.let(IResolvable::unwrap))
      }

      override fun sources(sources: List<Any>) {
        cdkBuilder.sources(sources)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateScopeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateScopeProperty,
    ) : ServerCertificateScopeProperty {
      override fun destinationPorts(): Any? = unwrap(this).getDestinationPorts()

      override fun destinations(): Any? = unwrap(this).getDestinations()

      override fun protocols(): Any? = unwrap(this).getProtocols()

      override fun sourcePorts(): Any? = unwrap(this).getSourcePorts()

      override fun sources(): Any? = unwrap(this).getSources()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ServerCertificateScopeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateScopeProperty):
          ServerCertificateScopeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerCertificateScopeProperty):
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateScopeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ServerCertificateConfigurationProperty {
    public fun certificateAuthorityArn(): String? = unwrap(this).getCertificateAuthorityArn()

    public fun checkCertificateRevocationStatus(): Any? =
        unwrap(this).getCheckCertificateRevocationStatus()

    public fun scopes(): Any? = unwrap(this).getScopes()

    public fun serverCertificates(): Any? = unwrap(this).getServerCertificates()

    public interface Builder {
      public fun certificateAuthorityArn(certificateAuthorityArn: String)

      public fun checkCertificateRevocationStatus(checkCertificateRevocationStatus: IResolvable)

      public
          fun checkCertificateRevocationStatus(checkCertificateRevocationStatus: CheckCertificateRevocationStatusProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a9141f699fe4042459f98b128e176533dcff6e1200b985ef4d872e13b87a334")
      public
          fun checkCertificateRevocationStatus(checkCertificateRevocationStatus: CheckCertificateRevocationStatusProperty.Builder.() -> Unit)

      public fun scopes(scopes: IResolvable)

      public fun scopes(scopes: List<Any>)

      public fun serverCertificates(serverCertificates: IResolvable)

      public fun serverCertificates(serverCertificates: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty.builder()

      override fun certificateAuthorityArn(certificateAuthorityArn: String) {
        cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
      }

      override fun checkCertificateRevocationStatus(checkCertificateRevocationStatus: IResolvable) {
        cdkBuilder.checkCertificateRevocationStatus(checkCertificateRevocationStatus.let(IResolvable::unwrap))
      }

      override
          fun checkCertificateRevocationStatus(checkCertificateRevocationStatus: CheckCertificateRevocationStatusProperty) {
        cdkBuilder.checkCertificateRevocationStatus(checkCertificateRevocationStatus.let(CheckCertificateRevocationStatusProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a9141f699fe4042459f98b128e176533dcff6e1200b985ef4d872e13b87a334")
      override
          fun checkCertificateRevocationStatus(checkCertificateRevocationStatus: CheckCertificateRevocationStatusProperty.Builder.() -> Unit):
          Unit =
          checkCertificateRevocationStatus(CheckCertificateRevocationStatusProperty(checkCertificateRevocationStatus))

      override fun scopes(scopes: IResolvable) {
        cdkBuilder.scopes(scopes.let(IResolvable::unwrap))
      }

      override fun scopes(scopes: List<Any>) {
        cdkBuilder.scopes(scopes)
      }

      override fun serverCertificates(serverCertificates: IResolvable) {
        cdkBuilder.serverCertificates(serverCertificates.let(IResolvable::unwrap))
      }

      override fun serverCertificates(serverCertificates: List<Any>) {
        cdkBuilder.serverCertificates(serverCertificates)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty,
    ) : ServerCertificateConfigurationProperty {
      override fun certificateAuthorityArn(): String? = unwrap(this).getCertificateAuthorityArn()

      override fun checkCertificateRevocationStatus(): Any? =
          unwrap(this).getCheckCertificateRevocationStatus()

      override fun scopes(): Any? = unwrap(this).getScopes()

      override fun serverCertificates(): Any? = unwrap(this).getServerCertificates()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerCertificateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty):
          ServerCertificateConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerCertificateConfigurationProperty):
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
