package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Backend internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.Backend,
) {
  public open fun bind(arg0: Construct): BackendConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(BackendConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.Backend,
  ) : Backend(cdkObject)

  public companion object {
    public open fun virtualService(virtualService: IVirtualService): Backend =
        software.amazon.awscdk.services.appmesh.Backend.virtualService(virtualService.let(IVirtualService::unwrap)).let(Backend::wrap)

    public open fun virtualService(virtualService: IVirtualService,
        props: VirtualServiceBackendOptions): Backend =
        software.amazon.awscdk.services.appmesh.Backend.virtualService(virtualService.let(IVirtualService::unwrap),
        props.let(VirtualServiceBackendOptions::unwrap)).let(Backend::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f9675289bd0bd999bf67bfd1bbd1b319fa2b042f6ddd5a2d2039ac9f8c433e3")
    public open fun virtualService(virtualService: IVirtualService,
        props: VirtualServiceBackendOptions.Builder.() -> Unit): Backend =
        virtualService(virtualService, VirtualServiceBackendOptions(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.Backend): Backend =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Backend): software.amazon.awscdk.services.appmesh.Backend =
        (wrapped as Wrapper).cdkObject
  }
}
