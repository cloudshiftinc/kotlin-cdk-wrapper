@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Listener internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.globalaccelerator.Listener,
) : Resource(cdkObject), IListener {
  public open fun addEndpointGroup(id: String): EndpointGroup =
      unwrap(this).addEndpointGroup(id).let(EndpointGroup::wrap)

  public open fun addEndpointGroup(id: String, options: EndpointGroupOptions): EndpointGroup =
      unwrap(this).addEndpointGroup(id,
      options.let(EndpointGroupOptions::unwrap)).let(EndpointGroup::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c83c4dd512e71452b5f5fa4cc0b068a3e6faed266b23647cbf1aab2f35ae1650")
  public open fun addEndpointGroup(id: String, options: EndpointGroupOptions.Builder.() -> Unit):
      EndpointGroup = addEndpointGroup(id, EndpointGroupOptions(options))

  public override fun listenerArn(): String = unwrap(this).getListenerArn()

  public open fun listenerName(): String = unwrap(this).getListenerName()

  @CdkDslMarker
  public interface Builder {
    public fun accelerator(accelerator: IAccelerator)

    public fun clientAffinity(clientAffinity: ClientAffinity)

    public fun listenerName(listenerName: String)

    public fun portRanges(portRanges: List<PortRange>)

    public fun portRanges(vararg portRanges: PortRange)

    public fun protocol(protocol: ConnectionProtocol)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.Listener.Builder =
        software.amazon.awscdk.services.globalaccelerator.Listener.Builder.create(scope, id)

    override fun accelerator(accelerator: IAccelerator) {
      cdkBuilder.accelerator(accelerator.let(IAccelerator::unwrap))
    }

    override fun clientAffinity(clientAffinity: ClientAffinity) {
      cdkBuilder.clientAffinity(clientAffinity.let(ClientAffinity::unwrap))
    }

    override fun listenerName(listenerName: String) {
      cdkBuilder.listenerName(listenerName)
    }

    override fun portRanges(portRanges: List<PortRange>) {
      cdkBuilder.portRanges(portRanges.map(PortRange::unwrap))
    }

    override fun portRanges(vararg portRanges: PortRange): Unit = portRanges(portRanges.toList())

    override fun protocol(protocol: ConnectionProtocol) {
      cdkBuilder.protocol(protocol.let(ConnectionProtocol::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.Listener =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromListenerArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      listenerArn: String,
    ): IListener =
        software.amazon.awscdk.services.globalaccelerator.Listener.fromListenerArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, listenerArn).let(IListener::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Listener {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Listener(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.Listener):
        Listener = Listener(cdkObject)

    internal fun unwrap(wrapped: Listener):
        software.amazon.awscdk.services.globalaccelerator.Listener = wrapped.cdkObject
  }
}
