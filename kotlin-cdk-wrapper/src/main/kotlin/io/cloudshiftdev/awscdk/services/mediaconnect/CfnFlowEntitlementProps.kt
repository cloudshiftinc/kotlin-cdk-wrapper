@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFlowEntitlementProps {
  public fun dataTransferSubscriberFeePercent(): Number? =
      unwrap(this).getDataTransferSubscriberFeePercent()

  public fun description(): String

  public fun encryption(): Any? = unwrap(this).getEncryption()

  public fun entitlementStatus(): String? = unwrap(this).getEntitlementStatus()

  public fun flowArn(): String

  public fun name(): String

  public fun subscribers(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent: Number)

    public fun description(description: String)

    public fun encryption(encryption: IResolvable)

    public fun encryption(encryption: CfnFlowEntitlement.EncryptionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9dbc636d06fdc06f25bba614880395d91ccedc0d4e14b939658c6397f2feb6ae")
    public fun encryption(encryption: CfnFlowEntitlement.EncryptionProperty.Builder.() -> Unit)

    public fun entitlementStatus(entitlementStatus: String)

    public fun flowArn(flowArn: String)

    public fun name(name: String)

    public fun subscribers(subscribers: List<String>)

    public fun subscribers(vararg subscribers: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps.builder()

    override fun dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent: Number) {
      cdkBuilder.dataTransferSubscriberFeePercent(dataTransferSubscriberFeePercent)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun encryption(encryption: IResolvable) {
      cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
    }

    override fun encryption(encryption: CfnFlowEntitlement.EncryptionProperty) {
      cdkBuilder.encryption(encryption.let(CfnFlowEntitlement.EncryptionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9dbc636d06fdc06f25bba614880395d91ccedc0d4e14b939658c6397f2feb6ae")
    override fun encryption(encryption: CfnFlowEntitlement.EncryptionProperty.Builder.() -> Unit):
        Unit = encryption(CfnFlowEntitlement.EncryptionProperty(encryption))

    override fun entitlementStatus(entitlementStatus: String) {
      cdkBuilder.entitlementStatus(entitlementStatus)
    }

    override fun flowArn(flowArn: String) {
      cdkBuilder.flowArn(flowArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun subscribers(subscribers: List<String>) {
      cdkBuilder.subscribers(subscribers)
    }

    override fun subscribers(vararg subscribers: String): Unit = subscribers(subscribers.toList())

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps,
  ) : CdkObject(cdkObject), CfnFlowEntitlementProps {
    override fun dataTransferSubscriberFeePercent(): Number? =
        unwrap(this).getDataTransferSubscriberFeePercent()

    override fun description(): String = unwrap(this).getDescription()

    override fun encryption(): Any? = unwrap(this).getEncryption()

    override fun entitlementStatus(): String? = unwrap(this).getEntitlementStatus()

    override fun flowArn(): String = unwrap(this).getFlowArn()

    override fun name(): String = unwrap(this).getName()

    override fun subscribers(): List<String> = unwrap(this).getSubscribers()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlowEntitlementProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps):
        CfnFlowEntitlementProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlowEntitlementProps):
        software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps
  }
}
