@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Accelerator internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.globalaccelerator.Accelerator,
) : Resource(cdkObject), IAccelerator {
  public override fun acceleratorArn(): String = unwrap(this).getAcceleratorArn()

  public open fun addListener(id: String, options: ListenerOptions): Listener =
      unwrap(this).addListener(id, options.let(ListenerOptions::unwrap)).let(Listener::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3a537d56cd609f4e030fbd8e6b8a3bdde515eef17250a02dd94781d6a97f6c33")
  public open fun addListener(id: String, options: ListenerOptions.Builder.() -> Unit): Listener =
      addListener(id, ListenerOptions(options))

  public override fun dnsName(): String = unwrap(this).getDnsName()

  public override fun dualStackDnsName(): String? = unwrap(this).getDualStackDnsName()

  public override fun ipv4Addresses(): List<String> = unwrap(this).getIpv4Addresses() ?: emptyList()

  public override fun ipv6Addresses(): List<String> = unwrap(this).getIpv6Addresses() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun acceleratorName(acceleratorName: String)

    public fun enabled(enabled: Boolean)

    public fun ipAddressType(ipAddressType: IpAddressType)

    public fun ipAddresses(ipAddresses: List<String>)

    public fun ipAddresses(vararg ipAddresses: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.Accelerator.Builder =
        software.amazon.awscdk.services.globalaccelerator.Accelerator.Builder.create(scope, id)

    override fun acceleratorName(acceleratorName: String) {
      cdkBuilder.acceleratorName(acceleratorName)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType::unwrap))
    }

    override fun ipAddresses(ipAddresses: List<String>) {
      cdkBuilder.ipAddresses(ipAddresses)
    }

    override fun ipAddresses(vararg ipAddresses: String): Unit = ipAddresses(ipAddresses.toList())

    public fun build(): software.amazon.awscdk.services.globalaccelerator.Accelerator =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromAcceleratorAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AcceleratorAttributes,
    ): IAccelerator =
        software.amazon.awscdk.services.globalaccelerator.Accelerator.fromAcceleratorAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(AcceleratorAttributes::unwrap)).let(IAccelerator::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8baed08c541ab0b2afcc742de4fe7296b53dea3fc9b6ce5fdfb9dc99c2a62385")
    public fun fromAcceleratorAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AcceleratorAttributes.Builder.() -> Unit,
    ): IAccelerator = fromAcceleratorAttributes(scope, id, AcceleratorAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Accelerator {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Accelerator(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.Accelerator):
        Accelerator = Accelerator(cdkObject)

    internal fun unwrap(wrapped: Accelerator):
        software.amazon.awscdk.services.globalaccelerator.Accelerator = wrapped.cdkObject
  }
}
