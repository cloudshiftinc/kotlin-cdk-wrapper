package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Backend internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.Backend,
) : CdkObject(cdkObject) {
  /**
   * Return backend config.
   *
   * @param _scope 
   */
  public open fun bind(_scope: Construct): BackendConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(BackendConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.Backend,
  ) : Backend(cdkObject)

  public companion object {
    public fun virtualService(virtualService: IVirtualService): Backend =
        software.amazon.awscdk.services.appmesh.Backend.virtualService(virtualService.let(IVirtualService::unwrap)).let(Backend::wrap)

    public fun virtualService(virtualService: IVirtualService, props: VirtualServiceBackendOptions):
        Backend =
        software.amazon.awscdk.services.appmesh.Backend.virtualService(virtualService.let(IVirtualService::unwrap),
        props.let(VirtualServiceBackendOptions::unwrap)).let(Backend::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f9675289bd0bd999bf67bfd1bbd1b319fa2b042f6ddd5a2d2039ac9f8c433e3")
    public fun virtualService(virtualService: IVirtualService,
        props: VirtualServiceBackendOptions.Builder.() -> Unit): Backend =
        virtualService(virtualService, VirtualServiceBackendOptions(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.Backend): Backend =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Backend): software.amazon.awscdk.services.appmesh.Backend =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.Backend
  }
}