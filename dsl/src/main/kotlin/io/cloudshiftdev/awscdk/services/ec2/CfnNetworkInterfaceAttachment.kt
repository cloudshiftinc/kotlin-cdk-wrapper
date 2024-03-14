package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNetworkInterfaceAttachment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAttachmentId(): String = unwrap(this).getAttrAttachmentId()

  public open fun deleteOnTermination(): Any? = unwrap(this).getDeleteOnTermination()

  public open fun deleteOnTermination(`value`: Boolean) {
    unwrap(this).setDeleteOnTermination(`value`)
  }

  public open fun deleteOnTermination(`value`: IResolvable) {
    unwrap(this).setDeleteOnTermination(`value`.let(IResolvable::unwrap))
  }

  public open fun deviceIndex(): String = unwrap(this).getDeviceIndex()

  public open fun deviceIndex(`value`: String) {
    unwrap(this).setDeviceIndex(`value`)
  }

  public open fun enaSrdSpecification(): Any? = unwrap(this).getEnaSrdSpecification()

  public open fun enaSrdSpecification(`value`: IResolvable) {
    unwrap(this).setEnaSrdSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun enaSrdSpecification(`value`: EnaSrdSpecificationProperty) {
    unwrap(this).setEnaSrdSpecification(`value`.let(EnaSrdSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e647dfadb160fb060624d9f56c0afe5821d00c048e36e155a68c76d57fa704d7")
  public open fun enaSrdSpecification(`value`: EnaSrdSpecificationProperty.Builder.() -> Unit): Unit
      = enaSrdSpecification(EnaSrdSpecificationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceId(): String = unwrap(this).getInstanceId()

  public open fun instanceId(`value`: String) {
    unwrap(this).setInstanceId(`value`)
  }

  public open fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

  public open fun networkInterfaceId(`value`: String) {
    unwrap(this).setNetworkInterfaceId(`value`)
  }

  public interface Builder {
    public fun deleteOnTermination(deleteOnTermination: Boolean)

    public fun deleteOnTermination(deleteOnTermination: IResolvable)

    public fun deviceIndex(deviceIndex: String)

    public fun enaSrdSpecification(enaSrdSpecification: IResolvable)

    public fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2844026d64cad90b7d73a1297af418e0480836d89ff4786c9c0e5cc0b78cdd8")
    public
        fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty.Builder.() -> Unit)

    public fun instanceId(instanceId: String)

    public fun networkInterfaceId(networkInterfaceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.Builder.create(scope, id)

    override fun deleteOnTermination(deleteOnTermination: Boolean) {
      cdkBuilder.deleteOnTermination(deleteOnTermination)
    }

    override fun deleteOnTermination(deleteOnTermination: IResolvable) {
      cdkBuilder.deleteOnTermination(deleteOnTermination.let(IResolvable::unwrap))
    }

    override fun deviceIndex(deviceIndex: String) {
      cdkBuilder.deviceIndex(deviceIndex)
    }

    override fun enaSrdSpecification(enaSrdSpecification: IResolvable) {
      cdkBuilder.enaSrdSpecification(enaSrdSpecification.let(IResolvable::unwrap))
    }

    override fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty) {
      cdkBuilder.enaSrdSpecification(enaSrdSpecification.let(EnaSrdSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2844026d64cad90b7d73a1297af418e0480836d89ff4786c9c0e5cc0b78cdd8")
    override
        fun enaSrdSpecification(enaSrdSpecification: EnaSrdSpecificationProperty.Builder.() -> Unit):
        Unit = enaSrdSpecification(EnaSrdSpecificationProperty(enaSrdSpecification))

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkInterfaceAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkInterfaceAttachment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment):
        CfnNetworkInterfaceAttachment = CfnNetworkInterfaceAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInterfaceAttachment):
        software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment = wrapped.cdkObject
  }

  public interface EnaSrdUdpSpecificationProperty {
    public fun enaSrdUdpEnabled(): Any? = unwrap(this).getEnaSrdUdpEnabled()

    public interface Builder {
      public fun enaSrdUdpEnabled(enaSrdUdpEnabled: Boolean)

      public fun enaSrdUdpEnabled(enaSrdUdpEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdUdpSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdUdpSpecificationProperty.builder()

      override fun enaSrdUdpEnabled(enaSrdUdpEnabled: Boolean) {
        cdkBuilder.enaSrdUdpEnabled(enaSrdUdpEnabled)
      }

      override fun enaSrdUdpEnabled(enaSrdUdpEnabled: IResolvable) {
        cdkBuilder.enaSrdUdpEnabled(enaSrdUdpEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdUdpSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdUdpSpecificationProperty,
    ) : EnaSrdUdpSpecificationProperty {
      override fun enaSrdUdpEnabled(): Any? = unwrap(this).getEnaSrdUdpEnabled()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnaSrdUdpSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdUdpSpecificationProperty):
          EnaSrdUdpSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnaSrdUdpSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdUdpSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EnaSrdSpecificationProperty {
    public fun enaSrdEnabled(): Any? = unwrap(this).getEnaSrdEnabled()

    public fun enaSrdUdpSpecification(): Any? = unwrap(this).getEnaSrdUdpSpecification()

    public interface Builder {
      public fun enaSrdEnabled(enaSrdEnabled: Boolean)

      public fun enaSrdEnabled(enaSrdEnabled: IResolvable)

      public fun enaSrdUdpSpecification(enaSrdUdpSpecification: IResolvable)

      public fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b8d2766962cbbac50057650c19657945de7468cb1d17da11e865970b1a6348d")
      public
          fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty.builder()

      override fun enaSrdEnabled(enaSrdEnabled: Boolean) {
        cdkBuilder.enaSrdEnabled(enaSrdEnabled)
      }

      override fun enaSrdEnabled(enaSrdEnabled: IResolvable) {
        cdkBuilder.enaSrdEnabled(enaSrdEnabled.let(IResolvable::unwrap))
      }

      override fun enaSrdUdpSpecification(enaSrdUdpSpecification: IResolvable) {
        cdkBuilder.enaSrdUdpSpecification(enaSrdUdpSpecification.let(IResolvable::unwrap))
      }

      override fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty) {
        cdkBuilder.enaSrdUdpSpecification(enaSrdUdpSpecification.let(EnaSrdUdpSpecificationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b8d2766962cbbac50057650c19657945de7468cb1d17da11e865970b1a6348d")
      override
          fun enaSrdUdpSpecification(enaSrdUdpSpecification: EnaSrdUdpSpecificationProperty.Builder.() -> Unit):
          Unit = enaSrdUdpSpecification(EnaSrdUdpSpecificationProperty(enaSrdUdpSpecification))

      public fun build():
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty,
    ) : EnaSrdSpecificationProperty {
      override fun enaSrdEnabled(): Any? = unwrap(this).getEnaSrdEnabled()

      override fun enaSrdUdpSpecification(): Any? = unwrap(this).getEnaSrdUdpSpecification()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnaSrdSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty):
          EnaSrdSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnaSrdSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkInterfaceAttachment.EnaSrdSpecificationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
