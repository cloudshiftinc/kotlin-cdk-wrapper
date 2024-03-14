package io.cloudshiftdev.awscdk.services.groundstation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
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

public open class CfnDataflowEndpointGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun contactPostPassDurationSeconds(): Number? =
      unwrap(this).getContactPostPassDurationSeconds()

  public open fun contactPostPassDurationSeconds(`value`: Number) {
    unwrap(this).setContactPostPassDurationSeconds(`value`)
  }

  public open fun contactPrePassDurationSeconds(): Number? =
      unwrap(this).getContactPrePassDurationSeconds()

  public open fun contactPrePassDurationSeconds(`value`: Number) {
    unwrap(this).setContactPrePassDurationSeconds(`value`)
  }

  public open fun endpointDetails(): Any = unwrap(this).getEndpointDetails()

  public open fun endpointDetails(`value`: IResolvable) {
    unwrap(this).setEndpointDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun endpointDetails(__idx_ac66f0: List<Any>) {
    unwrap(this).setEndpointDetails(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number)

    public fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number)

    public fun endpointDetails(endpointDetails: IResolvable)

    public fun endpointDetails(endpointDetails: List<Any>)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.Builder =
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.Builder.create(scope,
        id)

    override fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number) {
      cdkBuilder.contactPostPassDurationSeconds(contactPostPassDurationSeconds)
    }

    override fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number) {
      cdkBuilder.contactPrePassDurationSeconds(contactPrePassDurationSeconds)
    }

    override fun endpointDetails(endpointDetails: IResolvable) {
      cdkBuilder.endpointDetails(endpointDetails.let(IResolvable::unwrap))
    }

    override fun endpointDetails(endpointDetails: List<Any>) {
      cdkBuilder.endpointDetails(endpointDetails)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataflowEndpointGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataflowEndpointGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup):
        CfnDataflowEndpointGroup = CfnDataflowEndpointGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDataflowEndpointGroup):
        software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup = wrapped.cdkObject
  }

  public interface SocketAddressProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun port(): Number? = unwrap(this).getPort()

    public interface Builder {
      public fun name(name: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty,
    ) : SocketAddressProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun port(): Number? = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SocketAddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty):
          SocketAddressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SocketAddressProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SocketAddressProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EndpointDetailsProperty {
    public fun awsGroundStationAgentEndpoint(): Any? =
        unwrap(this).getAwsGroundStationAgentEndpoint()

    public fun endpoint(): Any? = unwrap(this).getEndpoint()

    public fun securityDetails(): Any? = unwrap(this).getSecurityDetails()

    public interface Builder {
      public fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: IResolvable)

      public
          fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: AwsGroundStationAgentEndpointProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edf47fab2f161f83d66b318160a181035ca11528d076564dc62e03d0642fe3c7")
      public
          fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: AwsGroundStationAgentEndpointProperty.Builder.() -> Unit)

      public fun endpoint(endpoint: IResolvable)

      public fun endpoint(endpoint: DataflowEndpointProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e83ed6fb7c6aa66fef82ae8c4ebb024d91310dc4da4bccd017b2ff8b12100dc")
      public fun endpoint(endpoint: DataflowEndpointProperty.Builder.() -> Unit)

      public fun securityDetails(securityDetails: IResolvable)

      public fun securityDetails(securityDetails: SecurityDetailsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49418a0b3357df96503d6b4f912c4a3c0fe03ccb45b61bb2b119e8a87430407e")
      public fun securityDetails(securityDetails: SecurityDetailsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.EndpointDetailsProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.EndpointDetailsProperty.builder()

      override fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: IResolvable) {
        cdkBuilder.awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint.let(IResolvable::unwrap))
      }

      override
          fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: AwsGroundStationAgentEndpointProperty) {
        cdkBuilder.awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint.let(AwsGroundStationAgentEndpointProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("edf47fab2f161f83d66b318160a181035ca11528d076564dc62e03d0642fe3c7")
      override
          fun awsGroundStationAgentEndpoint(awsGroundStationAgentEndpoint: AwsGroundStationAgentEndpointProperty.Builder.() -> Unit):
          Unit =
          awsGroundStationAgentEndpoint(AwsGroundStationAgentEndpointProperty(awsGroundStationAgentEndpoint))

      override fun endpoint(endpoint: IResolvable) {
        cdkBuilder.endpoint(endpoint.let(IResolvable::unwrap))
      }

      override fun endpoint(endpoint: DataflowEndpointProperty) {
        cdkBuilder.endpoint(endpoint.let(DataflowEndpointProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e83ed6fb7c6aa66fef82ae8c4ebb024d91310dc4da4bccd017b2ff8b12100dc")
      override fun endpoint(endpoint: DataflowEndpointProperty.Builder.() -> Unit): Unit =
          endpoint(DataflowEndpointProperty(endpoint))

      override fun securityDetails(securityDetails: IResolvable) {
        cdkBuilder.securityDetails(securityDetails.let(IResolvable::unwrap))
      }

      override fun securityDetails(securityDetails: SecurityDetailsProperty) {
        cdkBuilder.securityDetails(securityDetails.let(SecurityDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49418a0b3357df96503d6b4f912c4a3c0fe03ccb45b61bb2b119e8a87430407e")
      override fun securityDetails(securityDetails: SecurityDetailsProperty.Builder.() -> Unit):
          Unit = securityDetails(SecurityDetailsProperty(securityDetails))

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.EndpointDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.EndpointDetailsProperty,
    ) : EndpointDetailsProperty {
      override fun awsGroundStationAgentEndpoint(): Any? =
          unwrap(this).getAwsGroundStationAgentEndpoint()

      override fun endpoint(): Any? = unwrap(this).getEndpoint()

      override fun securityDetails(): Any? = unwrap(this).getSecurityDetails()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.EndpointDetailsProperty):
          EndpointDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointDetailsProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.EndpointDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RangedConnectionDetailsProperty {
    public fun mtu(): Number? = unwrap(this).getMtu()

    public fun socketAddress(): Any? = unwrap(this).getSocketAddress()

    public interface Builder {
      public fun mtu(mtu: Number)

      public fun socketAddress(socketAddress: IResolvable)

      public fun socketAddress(socketAddress: RangedSocketAddressProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fac8a1455459461b9b6773852bcd890d1366152e576998fba98b1cdb23f6e8a")
      public fun socketAddress(socketAddress: RangedSocketAddressProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedConnectionDetailsProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedConnectionDetailsProperty.builder()

      override fun mtu(mtu: Number) {
        cdkBuilder.mtu(mtu)
      }

      override fun socketAddress(socketAddress: IResolvable) {
        cdkBuilder.socketAddress(socketAddress.let(IResolvable::unwrap))
      }

      override fun socketAddress(socketAddress: RangedSocketAddressProperty) {
        cdkBuilder.socketAddress(socketAddress.let(RangedSocketAddressProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fac8a1455459461b9b6773852bcd890d1366152e576998fba98b1cdb23f6e8a")
      override fun socketAddress(socketAddress: RangedSocketAddressProperty.Builder.() -> Unit):
          Unit = socketAddress(RangedSocketAddressProperty(socketAddress))

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedConnectionDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedConnectionDetailsProperty,
    ) : RangedConnectionDetailsProperty {
      override fun mtu(): Number? = unwrap(this).getMtu()

      override fun socketAddress(): Any? = unwrap(this).getSocketAddress()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RangedConnectionDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedConnectionDetailsProperty):
          RangedConnectionDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RangedConnectionDetailsProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedConnectionDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AwsGroundStationAgentEndpointProperty {
    public fun agentStatus(): String? = unwrap(this).getAgentStatus()

    public fun auditResults(): String? = unwrap(this).getAuditResults()

    public fun egressAddress(): Any? = unwrap(this).getEgressAddress()

    public fun ingressAddress(): Any? = unwrap(this).getIngressAddress()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun agentStatus(agentStatus: String)

      public fun auditResults(auditResults: String)

      public fun egressAddress(egressAddress: IResolvable)

      public fun egressAddress(egressAddress: ConnectionDetailsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("336c132b0d25f767d1059a3ea84a3fa7d3b066d284d3f891e76cf01c17b8e8b2")
      public fun egressAddress(egressAddress: ConnectionDetailsProperty.Builder.() -> Unit)

      public fun ingressAddress(ingressAddress: IResolvable)

      public fun ingressAddress(ingressAddress: RangedConnectionDetailsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c53ea6ce13e333e8f4174ace094dcbce169eb410e806083728676510b763997")
      public fun ingressAddress(ingressAddress: RangedConnectionDetailsProperty.Builder.() -> Unit)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty.builder()

      override fun agentStatus(agentStatus: String) {
        cdkBuilder.agentStatus(agentStatus)
      }

      override fun auditResults(auditResults: String) {
        cdkBuilder.auditResults(auditResults)
      }

      override fun egressAddress(egressAddress: IResolvable) {
        cdkBuilder.egressAddress(egressAddress.let(IResolvable::unwrap))
      }

      override fun egressAddress(egressAddress: ConnectionDetailsProperty) {
        cdkBuilder.egressAddress(egressAddress.let(ConnectionDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("336c132b0d25f767d1059a3ea84a3fa7d3b066d284d3f891e76cf01c17b8e8b2")
      override fun egressAddress(egressAddress: ConnectionDetailsProperty.Builder.() -> Unit): Unit
          = egressAddress(ConnectionDetailsProperty(egressAddress))

      override fun ingressAddress(ingressAddress: IResolvable) {
        cdkBuilder.ingressAddress(ingressAddress.let(IResolvable::unwrap))
      }

      override fun ingressAddress(ingressAddress: RangedConnectionDetailsProperty) {
        cdkBuilder.ingressAddress(ingressAddress.let(RangedConnectionDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3c53ea6ce13e333e8f4174ace094dcbce169eb410e806083728676510b763997")
      override
          fun ingressAddress(ingressAddress: RangedConnectionDetailsProperty.Builder.() -> Unit):
          Unit = ingressAddress(RangedConnectionDetailsProperty(ingressAddress))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty,
    ) : AwsGroundStationAgentEndpointProperty {
      override fun agentStatus(): String? = unwrap(this).getAgentStatus()

      override fun auditResults(): String? = unwrap(this).getAuditResults()

      override fun egressAddress(): Any? = unwrap(this).getEgressAddress()

      override fun ingressAddress(): Any? = unwrap(this).getIngressAddress()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AwsGroundStationAgentEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty):
          AwsGroundStationAgentEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsGroundStationAgentEndpointProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataflowEndpointProperty {
    public fun address(): Any? = unwrap(this).getAddress()

    public fun mtu(): Number? = unwrap(this).getMtu()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun address(address: IResolvable)

      public fun address(address: SocketAddressProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c22281e2c1be722282ec553df97b7e8c25b0d1520a7c5d2582e1117650aa4fe")
      public fun address(address: SocketAddressProperty.Builder.() -> Unit)

      public fun mtu(mtu: Number)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty.builder()

      override fun address(address: IResolvable) {
        cdkBuilder.address(address.let(IResolvable::unwrap))
      }

      override fun address(address: SocketAddressProperty) {
        cdkBuilder.address(address.let(SocketAddressProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0c22281e2c1be722282ec553df97b7e8c25b0d1520a7c5d2582e1117650aa4fe")
      override fun address(address: SocketAddressProperty.Builder.() -> Unit): Unit =
          address(SocketAddressProperty(address))

      override fun mtu(mtu: Number) {
        cdkBuilder.mtu(mtu)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty,
    ) : DataflowEndpointProperty {
      override fun address(): Any? = unwrap(this).getAddress()

      override fun mtu(): Number? = unwrap(this).getMtu()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataflowEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty):
          DataflowEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataflowEndpointProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.DataflowEndpointProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RangedSocketAddressProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun portRange(): Any? = unwrap(this).getPortRange()

    public interface Builder {
      public fun name(name: String)

      public fun portRange(portRange: IResolvable)

      public fun portRange(portRange: IntegerRangeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cde4cf2cf5372804eb7a2b7a391279e90db97ba40d1079ce4579f149aee5dd89")
      public fun portRange(portRange: IntegerRangeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedSocketAddressProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedSocketAddressProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun portRange(portRange: IResolvable) {
        cdkBuilder.portRange(portRange.let(IResolvable::unwrap))
      }

      override fun portRange(portRange: IntegerRangeProperty) {
        cdkBuilder.portRange(portRange.let(IntegerRangeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cde4cf2cf5372804eb7a2b7a391279e90db97ba40d1079ce4579f149aee5dd89")
      override fun portRange(portRange: IntegerRangeProperty.Builder.() -> Unit): Unit =
          portRange(IntegerRangeProperty(portRange))

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedSocketAddressProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedSocketAddressProperty,
    ) : RangedSocketAddressProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun portRange(): Any? = unwrap(this).getPortRange()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RangedSocketAddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedSocketAddressProperty):
          RangedSocketAddressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RangedSocketAddressProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.RangedSocketAddressProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConnectionDetailsProperty {
    public fun mtu(): Number? = unwrap(this).getMtu()

    public fun socketAddress(): Any? = unwrap(this).getSocketAddress()

    public interface Builder {
      public fun mtu(mtu: Number)

      public fun socketAddress(socketAddress: IResolvable)

      public fun socketAddress(socketAddress: SocketAddressProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81ed04a1adb8c8052f056c410ed46e12541ca7ba459450fe5089a62403e919be")
      public fun socketAddress(socketAddress: SocketAddressProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.ConnectionDetailsProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.ConnectionDetailsProperty.builder()

      override fun mtu(mtu: Number) {
        cdkBuilder.mtu(mtu)
      }

      override fun socketAddress(socketAddress: IResolvable) {
        cdkBuilder.socketAddress(socketAddress.let(IResolvable::unwrap))
      }

      override fun socketAddress(socketAddress: SocketAddressProperty) {
        cdkBuilder.socketAddress(socketAddress.let(SocketAddressProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("81ed04a1adb8c8052f056c410ed46e12541ca7ba459450fe5089a62403e919be")
      override fun socketAddress(socketAddress: SocketAddressProperty.Builder.() -> Unit): Unit =
          socketAddress(SocketAddressProperty(socketAddress))

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.ConnectionDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.ConnectionDetailsProperty,
    ) : ConnectionDetailsProperty {
      override fun mtu(): Number? = unwrap(this).getMtu()

      override fun socketAddress(): Any? = unwrap(this).getSocketAddress()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.ConnectionDetailsProperty):
          ConnectionDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionDetailsProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.ConnectionDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface IntegerRangeProperty {
    public fun maximum(): Number? = unwrap(this).getMaximum()

    public fun minimum(): Number? = unwrap(this).getMinimum()

    public interface Builder {
      public fun maximum(maximum: Number)

      public fun minimum(minimum: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.IntegerRangeProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.IntegerRangeProperty.builder()

      override fun maximum(maximum: Number) {
        cdkBuilder.maximum(maximum)
      }

      override fun minimum(minimum: Number) {
        cdkBuilder.minimum(minimum)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.IntegerRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.IntegerRangeProperty,
    ) : IntegerRangeProperty {
      override fun maximum(): Number? = unwrap(this).getMaximum()

      override fun minimum(): Number? = unwrap(this).getMinimum()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IntegerRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.IntegerRangeProperty):
          IntegerRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegerRangeProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.IntegerRangeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SecurityDetailsProperty {
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    public interface Builder {
      public fun roleArn(roleArn: String)

      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun subnetIds(subnetIds: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty.builder()

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty,
    ) : SecurityDetailsProperty {
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SecurityDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty):
          SecurityDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecurityDetailsProperty):
          software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup.SecurityDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
