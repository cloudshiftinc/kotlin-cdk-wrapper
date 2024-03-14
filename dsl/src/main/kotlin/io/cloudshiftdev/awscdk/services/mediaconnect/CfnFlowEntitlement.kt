package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
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

public open class CfnFlowEntitlement internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrEntitlementArn(): String = unwrap(this).getAttrEntitlementArn()

  public open fun dataTransferSubscriberFeePercent(): Number? =
      unwrap(this).getDataTransferSubscriberFeePercent()

  public open fun dataTransferSubscriberFeePercent(`value`: Number) {
    unwrap(this).setDataTransferSubscriberFeePercent(`value`)
  }

  public open fun description(): String = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun encryption(): Any? = unwrap(this).getEncryption()

  public open fun encryption(`value`: IResolvable) {
    unwrap(this).setEncryption(`value`.let(IResolvable::unwrap))
  }

  public open fun encryption(`value`: EncryptionProperty) {
    unwrap(this).setEncryption(`value`.let(EncryptionProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5caf46de7ac40526053d4bc96be79d10f8d8453da8a3e3dfbdf8c0fcec50517e")
  public open fun encryption(`value`: EncryptionProperty.Builder.() -> Unit): Unit =
      encryption(EncryptionProperty(`value`))

  public open fun entitlementStatus(): String? = unwrap(this).getEntitlementStatus()

  public open fun entitlementStatus(`value`: String) {
    unwrap(this).setEntitlementStatus(`value`)
  }

  public open fun flowArn(): String = unwrap(this).getFlowArn()

  public open fun flowArn(`value`: String) {
    unwrap(this).setFlowArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun subscribers(): List<String> = unwrap(this).getSubscribers() ?: emptyList()

  public open fun subscribers(`value`: List<String>) {
    unwrap(this).setSubscribers(`value`)
  }

  public interface Builder {
    public fun dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent: Number) {
    }

    public fun description(description: String) {
    }

    public fun encryption(encryption: IResolvable) {
    }

    public fun encryption(encryption: EncryptionProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d33a6a6d917eef73825c3446bf9108c8e3d1046148d7e4a6af45c3aaaeebd876")
    public fun encryption(encryption: EncryptionProperty.Builder.() -> Unit) {
    }

    public fun entitlementStatus(entitlementStatus: String) {
    }

    public fun flowArn(flowArn: String) {
    }

    public fun name(name: String) {
    }

    public fun subscribers(subscribers: List<String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.Builder
        = software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.Builder.create(scope, id)

    public override fun dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent: Number) {
      cdkBuilder.dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun encryption(encryption: IResolvable) {
      cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
    }

    public override fun encryption(encryption: EncryptionProperty) {
      cdkBuilder.encryption(encryption.let(EncryptionProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d33a6a6d917eef73825c3446bf9108c8e3d1046148d7e4a6af45c3aaaeebd876")
    public override fun encryption(encryption: EncryptionProperty.Builder.() -> Unit): Unit =
        encryption(EncryptionProperty(encryption))

    public override fun entitlementStatus(entitlementStatus: String) {
      cdkBuilder.entitlementStatus(entitlementStatus)
    }

    public override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun subscribers(subscribers: List<String>) {
      cdkBuilder.subscribers(subscribers)
    }

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlowEntitlement {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlowEntitlement(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement):
        CfnFlowEntitlement = CfnFlowEntitlement(cdkObject)

    internal fun unwrap(wrapped: CfnFlowEntitlement):
        software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement = wrapped.cdkObject
  }

  public interface EncryptionProperty {
    public fun algorithm(): String

    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    public fun deviceId(): String? = unwrap(this).getDeviceId()

    public fun keyType(): String? = unwrap(this).getKeyType()

    public fun region(): String? = unwrap(this).getRegion()

    public fun resourceId(): String? = unwrap(this).getResourceId()

    public fun roleArn(): String

    public fun secretArn(): String? = unwrap(this).getSecretArn()

    public fun url(): String? = unwrap(this).getUrl()

    public interface Builder {
      public fun algorithm(algorithm: String) {
      }

      public fun constantInitializationVector(constantInitializationVector: String) {
      }

      public fun deviceId(deviceId: String) {
      }

      public fun keyType(keyType: String) {
      }

      public fun region(region: String) {
      }

      public fun resourceId(resourceId: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun secretArn(secretArn: String) {
      }

      public fun url(url: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty.builder()

      public override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      public override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      public override fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
      }

      public override fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
      }

      public override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty,
    ) : EncryptionProperty {
      public override fun algorithm(): String = unwrap(this).getAlgorithm()

      public override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      public override fun deviceId(): String? = unwrap(this).getDeviceId()

      public override fun keyType(): String? = unwrap(this).getKeyType()

      public override fun region(): String? = unwrap(this).getRegion()

      public override fun resourceId(): String? = unwrap(this).getResourceId()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun secretArn(): String? = unwrap(this).getSecretArn()

      public override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty):
          EncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionProperty):
          software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement.EncryptionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
